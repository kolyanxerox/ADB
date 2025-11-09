package org.apache.tika.pipes;

import OooO0oO.OooOo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import o00OOooO.o00O00;
import o00Oo00.OooO;
import o00Oo00.OooOO0O;
import o00Oo00.OooOOO0;
import o00Oo00o.o0OoOo0;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.extractor.BasicEmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentByteStoreExtractorFactory;
import org.apache.tika.extractor.EmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.extractor.RUnpackExtractor;
import org.apache.tika.extractor.RUnpackExtractorFactory;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.p015io.TemporaryResources;
import org.apache.tika.p015io.TikaInputStream;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.extractor.EmittingEmbeddedDocumentBytesHandler;
import org.apache.tika.pipes.fetcher.Fetcher;
import org.apache.tika.pipes.fetcher.FetcherManager;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public class PipesServer implements Runnable {
    private static final OooO0O0 LOG = OooO0o.OooO0O0(PipesServer.class);
    public static final int TIMEOUT_EXIT_CODE = 17;
    private Parser autoDetectParser;
    private Detector detector;
    private DigestingParser.Digester digester;
    private EmitterManager emitterManager;
    private FetcherManager fetcherManager;
    private final DataInputStream input;
    private final long maxForEmitBatchBytes;
    private final DataOutputStream output;
    private Parser rMetaParser;
    private final long serverParseTimeoutMillis;
    private final long serverWaitTimeoutMillis;
    private TikaConfig tikaConfig;
    private final Path tikaConfigPath;
    private final Object[] lock = new Object[0];
    private long checkForTimeoutMs = 1000;
    private volatile boolean parsing = false;
    private volatile long since = System.currentTimeMillis();

    public static class MetadataListAndEmbeddedBytes {
        final Optional<EmbeddedDocumentBytesHandler> embeddedDocumentBytesHandler;
        List<Metadata> metadataList;

        public MetadataListAndEmbeddedBytes(List<Metadata> list, EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler) {
            this.metadataList = list;
            this.embeddedDocumentBytesHandler = Optional.ofNullable(embeddedDocumentBytesHandler);
        }

        public void filter(MetadataListFilter metadataListFilter) throws TikaException {
            this.metadataList = metadataListFilter.filter(this.metadataList);
        }

        public EmbeddedDocumentBytesHandler getEmbeddedDocumentBytesHandler() {
            return this.embeddedDocumentBytesHandler.get();
        }

        public List<Metadata> getMetadataList() {
            return this.metadataList;
        }

        public boolean hasEmbeddedDocumentByteStore() {
            return this.embeddedDocumentBytesHandler.isPresent();
        }

        public boolean toBePackagedForStreamEmitter() {
            return !(this.embeddedDocumentBytesHandler.get() instanceof EmittingEmbeddedDocumentBytesHandler);
        }
    }

    public enum STATUS {
        READY,
        CALL,
        PING,
        FAILED_TO_START,
        FETCHER_NOT_FOUND,
        EMITTER_NOT_FOUND,
        FETCHER_INITIALIZATION_EXCEPTION,
        FETCH_EXCEPTION,
        PARSE_SUCCESS,
        PARSE_EXCEPTION_NO_EMIT,
        EMIT_SUCCESS,
        EMIT_SUCCESS_PARSE_EXCEPTION,
        EMIT_EXCEPTION,
        OOM,
        TIMEOUT,
        EMPTY_OUTPUT,
        INTERMEDIATE_RESULT;

        public static STATUS lookup(int i) {
            int i2 = i - 1;
            if (i2 < 0) {
                throw new IllegalArgumentException("byte must be > 0");
            }
            STATUS[] statusArrValues = values();
            if (i2 < statusArrValues.length) {
                return statusArrValues[i2];
            }
            throw new IllegalArgumentException(OooOo.OooO0o0(i2, statusArrValues.length, "byte with index ", " must be < "));
        }

        public byte getByte() {
            return (byte) (ordinal() + 1);
        }
    }

    public PipesServer(Path path, InputStream inputStream, PrintStream printStream, long j, long j2, long j3) throws TikaException, SAXException, IOException {
        this.tikaConfigPath = path;
        this.input = new DataInputStream(inputStream);
        this.output = new DataOutputStream(printStream);
        this.maxForEmitBatchBytes = j;
        this.serverParseTimeoutMillis = j2;
        this.serverWaitTimeoutMillis = j3;
    }

    private void _preParse(FetchEmitTuple fetchEmitTuple, TikaInputStream tikaInputStream, Metadata metadata, ParseContext parseContext) throws IOException {
        DigestingParser.Digester digester = this.digester;
        if (digester != null) {
            try {
                digester.digest(tikaInputStream, metadata, parseContext);
            } catch (IOException e) {
                LOG.OooO("problem digesting: " + fetchEmitTuple.getId(), e);
            }
        }
        try {
            MediaType mediaTypeDetect = this.detector.detect(tikaInputStream, metadata);
            metadata.set("Content-Type", mediaTypeDetect.toString());
            metadata.set(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE, mediaTypeDetect.toString());
        } catch (IOException e2) {
            LOG.OooO("problem detecting: " + fetchEmitTuple.getId(), e2);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null || !embeddedDocumentBytesConfig.isIncludeOriginal()) {
            return;
        }
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class);
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(tikaInputStream.getPath(), new OpenOption[0]);
            try {
                embeddedDocumentBytesHandler.add(0, metadata, inputStreamNewInputStream);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } finally {
            }
        } catch (IOException e3) {
            LOG.OooO("problem reading source file into embedded document byte store", e3);
        }
    }

    private void actuallyParse(FetchEmitTuple fetchEmitTuple) throws Throwable {
        MetadataListAndEmbeddedBytes fromTuple;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Fetcher fetcher = getFetcher(fetchEmitTuple);
        if (fetcher == null) {
            return;
        }
        OooO0O0 oooO0O0 = LOG;
        if (oooO0O0.OooO0o()) {
            oooO0O0.OooOOO0("timer -- got fetcher: {}ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            fromTuple = parseFromTuple(fetchEmitTuple, fetcher);
        } catch (Throwable th) {
            th = th;
            fromTuple = null;
        }
        try {
            if (oooO0O0.OooO0o()) {
                oooO0O0.OooOOO0("timer -- to parse: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
            }
            try {
                if (fromTuple != null && !metadataIsEmpty(fromTuple.getMetadataList())) {
                    emitParseData(fetchEmitTuple, fromTuple);
                    if (!fromTuple.hasEmbeddedDocumentByteStore() || fromTuple.getEmbeddedDocumentBytesHandler() == null) {
                        return;
                    }
                    fromTuple.getEmbeddedDocumentBytesHandler().close();
                    return;
                }
                write(STATUS.EMPTY_OUTPUT);
                if (fromTuple == null || !fromTuple.hasEmbeddedDocumentByteStore() || fromTuple.getEmbeddedDocumentBytesHandler() == null) {
                    return;
                }
                fromTuple.getEmbeddedDocumentBytesHandler().close();
            } catch (IOException e) {
                LOG.OooO("problem closing embedded document byte store", e);
            }
        } catch (Throwable th2) {
            th = th2;
            if (fromTuple != null && fromTuple.hasEmbeddedDocumentByteStore() && fromTuple.getEmbeddedDocumentBytesHandler() != null) {
                try {
                    fromTuple.getEmbeddedDocumentBytesHandler().close();
                } catch (IOException e2) {
                    LOG.OooO("problem closing embedded document byte store", e2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[Catch: TikaEmitterException -> 0x0016, IOException -> 0x0018, TRY_LEAVE, TryCatch #3 {IOException -> 0x0018, TikaEmitterException -> 0x0016, blocks: (B:4:0x000c, B:6:0x0012, B:11:0x001a), top: B:24:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emit(java.lang.String r3, org.apache.tika.pipes.emitter.EmitKey r4, boolean r5, org.apache.tika.pipes.PipesServer.MetadataListAndEmbeddedBytes r6, java.lang.String r7, org.apache.tika.parser.ParseContext r8) throws java.io.IOException {
        /*
            r2 = this;
            org.apache.tika.pipes.emitter.EmitterManager r0 = r2.emitterManager     // Catch: java.lang.IllegalArgumentException -> L54
            java.lang.String r1 = r4.getEmitterName()     // Catch: java.lang.IllegalArgumentException -> L54
            org.apache.tika.pipes.emitter.Emitter r3 = r0.getEmitter(r1)     // Catch: java.lang.IllegalArgumentException -> L54
            if (r5 == 0) goto L1a
            boolean r5 = r6.toBePackagedForStreamEmitter()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            if (r5 == 0) goto L1a
            r2.emitContentsAndBytes(r3, r4, r6)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            goto L25
        L16:
            r3 = move-exception
            goto L3d
        L18:
            r3 = move-exception
            goto L3d
        L1a:
            java.lang.String r4 = r4.getEmitKey()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            java.util.List r5 = r6.getMetadataList()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            r3.emit(r4, r5, r8)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
        L25:
            boolean r3 = org.apache.tika.utils.StringUtils.isBlank(r7)
            if (r3 == 0) goto L31
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS
            r2.write(r3)
            return
        L31:
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r7.getBytes(r4)
            r2.write(r3, r4)
            return
        L3d:
            o0oOO.OooO0O0 r4 = org.apache.tika.pipes.PipesServer.LOG
            java.lang.String r5 = "emit exception"
            r4.OooO(r5, r3)
            java.lang.String r3 = org.apache.tika.utils.ExceptionUtils.getStackTrace(r3)
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_EXCEPTION
            r2.write(r4, r3)
            return
        L54:
            java.lang.String r3 = r2.getNoEmitterMsg(r3)
            o0oOO.OooO0O0 r4 = org.apache.tika.pipes.PipesServer.LOG
            r4.OooOo0o(r3)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMITTER_NOT_FOUND
            r2.write(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.emit(java.lang.String, org.apache.tika.pipes.emitter.EmitKey, boolean, org.apache.tika.pipes.PipesServer$MetadataListAndEmbeddedBytes, java.lang.String, org.apache.tika.parser.ParseContext):void");
    }

    private void emitContentsAndBytes(Emitter emitter, EmitKey emitKey, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        if (emitter instanceof StreamEmitter) {
            throw new UnsupportedOperationException("this is not yet implemented");
        }
        throw new IllegalArgumentException("The emitter for embedded document byte store must be a StreamEmitter. I see: " + emitter.getClass());
    }

    private void emitParseData(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) throws IOException {
        EmitKey emitKey;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String containerStacktrace = getContainerStacktrace(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadata(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadataList(fetchEmitTuple, metadataListAndEmbeddedBytes);
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        FetchEmitTuple.ON_PARSE_EXCEPTION onParseException = fetchEmitTuple.getOnParseException();
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (!StringUtils.isBlank(containerStacktrace) && onParseException != FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT) {
            write(STATUS.PARSE_EXCEPTION_NO_EMIT, containerStacktrace);
            return;
        }
        injectUserMetadata(fetchEmitTuple.getMetadata(), metadataListAndEmbeddedBytes.getMetadataList());
        EmitKey emitKey2 = fetchEmitTuple.getEmitKey();
        if (StringUtils.isBlank(emitKey2.getEmitKey())) {
            EmitKey emitKey3 = new EmitKey(emitKey2.getEmitterName(), fetchEmitTuple.getFetchKey().getFetchKey());
            fetchEmitTuple.setEmitKey(emitKey3);
            emitKey = emitKey3;
        } else {
            emitKey = emitKey2;
        }
        EmitData emitData = new EmitData(fetchEmitTuple.getEmitKey(), metadataListAndEmbeddedBytes.getMetadataList(), containerStacktrace);
        if (embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes() && metadataListAndEmbeddedBytes.toBePackagedForStreamEmitter()) {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        } else if (this.maxForEmitBatchBytes < 0 || emitData.getEstimatedSizeBytes() < this.maxForEmitBatchBytes) {
            write(emitData);
        } else {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        }
        OooO0O0 oooO0O0 = LOG;
        if (oooO0O0.OooO0o()) {
            oooO0O0.OooOOO0("timer -- emitted: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    private void exit(int i) {
        if (i != 0) {
            LOG.OooOOo("exiting: {}", Integer.valueOf(i));
        } else {
            LOG.OooOO0o(Integer.valueOf(i), "exiting: {}");
        }
        System.exit(i);
    }

    private void filterMetadata(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        MetadataFilter metadataFilter = (MetadataFilter) fetchEmitTuple.getParseContext().get(MetadataFilter.class);
        if (metadataFilter == null) {
            metadataFilter = this.tikaConfig.getMetadataFilter();
        }
        Iterator<Metadata> it = list.iterator();
        while (it.hasNext()) {
            try {
                metadataFilter.filter(it.next());
            } catch (TikaException e) {
                LOG.OooO("failed to filter metadata", e);
            }
        }
    }

    private void filterMetadataList(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        MetadataListFilter metadataListFilter = (MetadataListFilter) fetchEmitTuple.getParseContext().get(MetadataListFilter.class);
        if (metadataListFilter == null) {
            metadataListFilter = this.tikaConfig.getMetadataListFilter();
        }
        if (metadataListFilter instanceof NoOpListFilter) {
            return;
        }
        try {
            metadataListAndEmbeddedBytes.filter(metadataListFilter);
        } catch (TikaException e) {
            LOG.OooO("failed to filter metadata list", e);
        }
    }

    private String getContainerStacktrace(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        String str;
        return (metadataIsEmpty(list) || (str = list.get(0).get(TikaCoreProperties.CONTAINER_EXCEPTION)) == null) ? "" : str;
    }

    private Fetcher getFetcher(FetchEmitTuple fetchEmitTuple) throws IOException {
        try {
            return this.fetcherManager.getFetcher(fetchEmitTuple.getFetchKey().getFetcherName());
        } catch (IOException e) {
            e = e;
            LOG.OooO("Couldn't initialize fetcher for fetch id '" + fetchEmitTuple.getId() + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (IllegalArgumentException unused) {
            String noFetcherMsg = getNoFetcherMsg(fetchEmitTuple.getFetchKey().getFetcherName());
            LOG.OooOo0o(noFetcherMsg);
            write(STATUS.FETCHER_NOT_FOUND, noFetcherMsg);
            return null;
        } catch (TikaException e2) {
            e = e2;
            LOG.OooO("Couldn't initialize fetcher for fetch id '" + fetchEmitTuple.getId() + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    private String getNoEmitterMsg(String str) {
        StringBuilder sbOooOoO0 = OooOo.OooOoO0("Emitter '", str, "' not found.\nThe configured emitterManager supports:");
        int i = 0;
        for (String str2 : this.emitterManager.getSupported()) {
            int i2 = i + 1;
            if (i > 0) {
                sbOooOoO0.append(", ");
            }
            sbOooOoO0.append(str2);
            i = i2;
        }
        return sbOooOoO0.toString();
    }

    private String getNoFetcherMsg(String str) {
        StringBuilder sbOooOoO0 = OooOo.OooOoO0("Fetcher '", str, "' not found.\nThe configured FetcherManager supports:");
        int i = 0;
        for (String str2 : this.fetcherManager.getSupported()) {
            int i2 = i + 1;
            if (i > 0) {
                sbOooOoO0.append(", ");
            }
            sbOooOoO0.append(str2);
            i = i2;
        }
        return sbOooOoO0.toString();
    }

    private void handleOOM(String str, OutOfMemoryError outOfMemoryError) throws IOException {
        write(STATUS.OOM);
        LOG.OooOOOO("oom: " + str, outOfMemoryError);
        exit(1);
    }

    private void injectUserMetadata(Metadata metadata, List<Metadata> list) {
        for (String str : metadata.names()) {
            list.get(0).set(str, (String) null);
            for (String str2 : metadata.getValues(str)) {
                list.get(0).add(str, str2);
            }
        }
    }

    public static void main(String[] strArr) throws Exception {
        try {
            PipesServer pipesServer = new PipesServer(Paths.get(strArr[0], new String[0]), System.in, System.out, Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), Long.parseLong(strArr[3]));
            int i = OooOOO0.f32667OooOoO;
            OooOO0O oooOO0O = new OooOO0O();
            oooOO0O.OooOO0O(new byte[0]);
            System.setIn(oooOO0O.OooOO0());
            System.setOut(System.err);
            Thread thread = new Thread(pipesServer, "Tika Watchdog");
            thread.setDaemon(true);
            thread.start();
            pipesServer.processRequests();
        } finally {
            LOG.OooOo0O("server shutting down");
        }
    }

    private boolean metadataIsEmpty(List<Metadata> list) {
        return list == null || list.size() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[PHI: r14
  0x0090: PHI (r14v3 o0oOO.OooO0O0) = (r14v1 o0oOO.OooO0O0), (r14v2 o0oOO.OooO0O0), (r14v4 o0oOO.OooO0O0) binds: [B:22:0x008e, B:31:0x00e1, B:38:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseConcatenated(org.apache.tika.pipes.FetchEmitTuple r10, org.apache.tika.pipes.HandlerConfig r11, java.io.InputStream r12, org.apache.tika.metadata.Metadata r13, org.apache.tika.parser.ParseContext r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseConcatenated(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private void parseOne() {
        synchronized (this.lock) {
            this.parsing = true;
            this.since = System.currentTimeMillis();
        }
        FetchEmitTuple fetchEmitTuple = null;
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                fetchEmitTuple = readFetchEmitTuple();
                OooO0O0 oooO0O0 = LOG;
                if (oooO0O0.OooO0o()) {
                    oooO0O0.OooOOO0("timer -- read fetchEmitTuple: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                actuallyParse(fetchEmitTuple);
                if (oooO0O0.OooO0o()) {
                    oooO0O0.OooOOO0("timer -- actually parsed: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                }
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            } catch (OutOfMemoryError e) {
                handleOOM(fetchEmitTuple.getId(), e);
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            synchronized (this.lock) {
                this.parsing = false;
                this.since = System.currentTimeMillis();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[PHI: r13
  0x006c: PHI (r13v3 o0oOO.OooO0O0) = (r13v1 o0oOO.OooO0O0), (r13v2 o0oOO.OooO0O0), (r13v4 o0oOO.OooO0O0) binds: [B:19:0x006a, B:25:0x00a8, B:29:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseRecursive(org.apache.tika.pipes.FetchEmitTuple r11, org.apache.tika.pipes.HandlerConfig r12, java.io.InputStream r13, org.apache.tika.metadata.Metadata r14, org.apache.tika.parser.ParseContext r15) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "timer -- parse only time: {} ms"
            java.lang.String r1 = "sax problem:"
            java.lang.String r2 = "encrypted document:"
            java.lang.String r3 = "security exception:"
            java.lang.String r4 = "parse exception: "
            org.apache.tika.sax.RecursiveParserWrapperHandler r5 = new org.apache.tika.sax.RecursiveParserWrapperHandler
            org.apache.tika.sax.BasicContentHandlerFactory r6 = new org.apache.tika.sax.BasicContentHandlerFactory
            org.apache.tika.sax.BasicContentHandlerFactory$HANDLER_TYPE r7 = r12.getType()
            int r8 = r12.getWriteLimit()
            boolean r9 = r12.isThrowOnWriteLimitReached()
            r6.<init>(r7, r8, r9, r15)
            int r12 = r12.getMaxEmbeddedResources()
            r5.<init>(r6, r12)
            long r6 = java.lang.System.currentTimeMillis()
            r10.preParse(r11, r13, r14, r15)
            org.apache.tika.parser.Parser r12 = r10.rMetaParser     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49 java.lang.SecurityException -> L4b org.apache.tika.exception.EncryptedDocumentException -> L4d org.xml.sax.SAXException -> L4f
            r12.parse(r13, r5, r14, r15)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49 java.lang.SecurityException -> L4b org.apache.tika.exception.EncryptedDocumentException -> L4d org.xml.sax.SAXException -> L4f
            o0oOO.OooO0O0 r11 = org.apache.tika.pipes.PipesServer.LOG
            boolean r12 = r11.OooO0o()
            if (r12 == 0) goto Lc7
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r6
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11.OooOOO0(r0, r12)
            goto Lc7
        L46:
            r11 = move-exception
            goto Lcc
        L49:
            r12 = move-exception
            goto L51
        L4b:
            r12 = move-exception
            goto L79
        L4d:
            r12 = move-exception
            goto L8f
        L4f:
            r12 = move-exception
            goto Lab
        L51:
            o0oOO.OooO0O0 r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.OooO(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.OooO0o()
            if (r11 == 0) goto Lc7
        L6c:
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r6
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.OooOOO0(r0, r11)
            goto Lc7
        L79:
            o0oOO.OooO0O0 r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.OooO(r11, r12)     // Catch: java.lang.Throwable -> L46
            throw r12     // Catch: java.lang.Throwable -> L46
        L8f:
            o0oOO.OooO0O0 r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.OooO(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.OooO0o()
            if (r11 == 0) goto Lc7
            goto L6c
        Lab:
            o0oOO.OooO0O0 r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.OooO(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.OooO0o()
            if (r11 == 0) goto Lc7
            goto L6c
        Lc7:
            java.util.List r11 = r5.getMetadataList()
            return r11
        Lcc:
            o0oOO.OooO0O0 r12 = org.apache.tika.pipes.PipesServer.LOG
            boolean r13 = r12.OooO0o()
            if (r13 == 0) goto Le0
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r6
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.OooOOO0(r0, r13)
        Le0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseRecursive(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private MetadataListAndEmbeddedBytes parseWithStream(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata) throws TikaConfigException {
        ParseContext parseContext = setupParseContext(fetchEmitTuple);
        HandlerConfig handlerConfig = (HandlerConfig) parseContext.get(HandlerConfig.class);
        return new MetadataListAndEmbeddedBytes(handlerConfig.getParseMode() == HandlerConfig.PARSE_MODE.RMETA ? parseRecursive(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext) : parseConcatenated(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext), (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class));
    }

    private void preParse(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata, ParseContext parseContext) throws IOException {
        try {
            TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
            if (tikaInputStreamCast == null) {
                tikaInputStreamCast = TikaInputStream.get(inputStream, (TemporaryResources) null, metadata);
            }
            _preParse(fetchEmitTuple, tikaInputStreamCast, metadata, parseContext);
            byte[] bArr = o00O00.f32641OooO00o;
            writeIntermediate(fetchEmitTuple.getEmitKey(), metadata);
        } catch (Throwable th) {
            byte[] bArr2 = o00O00.f32641OooO00o;
            throw th;
        }
    }

    private FetchEmitTuple readFetchEmitTuple() throws IOException {
        try {
            byte[] bArr = new byte[this.input.readInt()];
            this.input.readFully(bArr);
            int i = OooOOO0.f32667OooOoO;
            OooOO0O oooOO0O = new OooOO0O();
            oooOO0O.OooOO0O(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(oooOO0O.OooOO0());
            try {
                FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) objectInputStream.readObject();
                objectInputStream.close();
                return fetchEmitTuple;
            } catch (Throwable th) {
                try {
                    objectInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            LOG.OooOOOO("problem reading tuple", e);
            exit(1);
            return null;
        } catch (ClassNotFoundException e2) {
            LOG.OooOOOO("can't find class?!", e2);
            exit(1);
            return null;
        }
    }

    private ParseContext setupParseContext(FetchEmitTuple fetchEmitTuple) throws TikaConfigException {
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        if (parseContext.get(HandlerConfig.class) == null) {
            parseContext.set(HandlerConfig.class, HandlerConfig.DEFAULT_HANDLER_CONFIG);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null) {
            parseContext.set(EmbeddedDocumentBytesConfig.class, EmbeddedDocumentBytesConfig.SKIP);
            return parseContext;
        }
        EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory();
        if (embeddedDocumentExtractorFactory == null) {
            parseContext.set(EmbeddedDocumentExtractor.class, new RUnpackExtractor(parseContext, RUnpackExtractorFactory.DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION));
        } else if (!(embeddedDocumentExtractorFactory instanceof EmbeddedDocumentByteStoreExtractorFactory)) {
            throw new TikaConfigException("EmbeddedDocumentExtractorFactory must be an instance of EmbeddedDocumentByteStoreExtractorFactory if you wantto extract embedded bytes! I see this embedded doc factory: " + embeddedDocumentExtractorFactory.getClass() + "and a request: " + embeddedDocumentBytesConfig);
        }
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitter())) {
            parseContext.set(EmbeddedDocumentBytesHandler.class, new BasicEmbeddedDocumentBytesHandler(embeddedDocumentBytesConfig));
            return parseContext;
        }
        parseContext.set(EmbeddedDocumentBytesHandler.class, new EmittingEmbeddedDocumentBytesHandler(fetchEmitTuple, this.emitterManager));
        return parseContext;
    }

    private void write(EmitData emitData) throws IOException {
        try {
            int i = o0OoOo0.f32678OooOoOO;
            new OooO();
            o0OoOo0 o0oooo0 = new o0OoOo0();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(o0oooo0);
            try {
                objectOutputStream.writeObject(emitData);
                objectOutputStream.close();
                write(STATUS.PARSE_SUCCESS, o0oooo0.OooO0O0());
            } finally {
            }
        } catch (IOException e) {
            LOG.OooOOOO("problem writing emit data (forking process shutdown?)", e);
            exit(1);
        }
    }

    private void writeIntermediate(EmitKey emitKey, Metadata metadata) throws IOException {
        try {
            int i = o0OoOo0.f32678OooOoOO;
            new OooO();
            o0OoOo0 o0oooo0 = new o0OoOo0();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(o0oooo0);
            try {
                objectOutputStream.writeObject(metadata);
                objectOutputStream.close();
                write(STATUS.INTERMEDIATE_RESULT, o0oooo0.OooO0O0());
            } finally {
            }
        } catch (IOException e) {
            LOG.OooOOOO("problem writing intermediate data (forking process shutdown?)", e);
            exit(1);
        }
    }

    public void initializeResources() throws TikaException, SAXException, IOException {
        this.tikaConfig = new TikaConfig(this.tikaConfigPath);
        this.fetcherManager = FetcherManager.load(this.tikaConfigPath);
        if (this.maxForEmitBatchBytes > -1) {
            this.emitterManager = EmitterManager.load(this.tikaConfigPath);
        } else {
            LOG.OooOOo0("'maxForEmitBatchBytes' < 0. Not initializing emitters in PipesServer");
            this.emitterManager = null;
        }
        AutoDetectParser autoDetectParser = new AutoDetectParser(this.tikaConfig);
        this.autoDetectParser = autoDetectParser;
        if (autoDetectParser.getAutoDetectParserConfig().getDigesterFactory() != null) {
            this.digester = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().build();
            ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().setSkipContainerDocument(true);
            if (((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory() == null) {
                ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().setEmbeddedDocumentExtractorFactory(new RUnpackExtractorFactory());
            }
        }
        this.detector = ((AutoDetectParser) this.autoDetectParser).getDetector();
        this.rMetaParser = new RecursiveParserWrapper(this.autoDetectParser);
    }

    public MetadataListAndEmbeddedBytes parseFromTuple(FetchEmitTuple fetchEmitTuple, Fetcher fetcher) throws IOException {
        Metadata metadata = new Metadata();
        try {
            InputStream inputStreamFetch = fetcher.fetch(fetchEmitTuple.getFetchKey().getFetchKey(), metadata, fetchEmitTuple.getParseContext());
            try {
                MetadataListAndEmbeddedBytes withStream = parseWithStream(fetchEmitTuple, inputStreamFetch, metadata);
                if (inputStreamFetch == null) {
                    return withStream;
                }
                inputStreamFetch.close();
                return withStream;
            } catch (Throwable th) {
                if (inputStreamFetch != null) {
                    try {
                        inputStreamFetch.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            e = e;
            LOG.OooO("fetch exception " + fetchEmitTuple.getId(), e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (SecurityException e2) {
            LOG.OooOOOO("security exception " + fetchEmitTuple.getId(), e2);
            throw e2;
        } catch (TikaException e3) {
            e = e3;
            LOG.OooO("fetch exception " + fetchEmitTuple.getId(), e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    public void processRequests() throws IOException {
        OooO0O0 oooO0O0 = LOG;
        oooO0O0.OooOOo0("processing requests");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            initializeResources();
            if (oooO0O0.OooO0o()) {
                oooO0O0.OooOOO0("timer -- initialize parser and other resources: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
            oooO0O0.OooOOo0("pipes server initialized");
            try {
                write(STATUS.READY);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    int i = this.input.read();
                    if (i != -1) {
                        STATUS status = STATUS.PING;
                        if (i != status.getByte()) {
                            if (i != STATUS.CALL.getByte()) {
                                break;
                            }
                            parseOne();
                            OooO0O0 oooO0O02 = LOG;
                            if (oooO0O02.OooO0o()) {
                                oooO0O02.OooOOO0("timer -- parse one: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        } else {
                            OooO0O0 oooO0O03 = LOG;
                            if (oooO0O03.OooO0o()) {
                                oooO0O03.OooOOO0("timer -- ping: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                            write(status);
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        }
                    } else {
                        LOG.OooOo0o("received -1 from client; shutting down");
                        exit(1);
                    }
                    this.output.flush();
                }
                throw new IllegalStateException("Unexpected request");
            } catch (Throwable th) {
                LOG.OooOOOO("main loop error (did the forking process shut down?)", th);
                exit(1);
                System.err.flush();
            }
        } catch (Throwable th2) {
            LOG.OooOOOO("couldn't initialize parser", th2);
            try {
                this.output.writeByte(STATUS.FAILED_TO_START.getByte());
                this.output.flush();
            } catch (IOException e) {
                LOG.OooO("couldn't notify of failure to start", e);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        while (true) {
            try {
                synchronized (this.lock) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.since;
                        if (this.parsing && jCurrentTimeMillis > this.serverParseTimeoutMillis) {
                            LOG.OooOO0O(Long.valueOf(jCurrentTimeMillis), "timeout server; elapsed {}  with {}", Long.valueOf(this.serverParseTimeoutMillis));
                            exit(17);
                        } else if (!this.parsing) {
                            long j = this.serverWaitTimeoutMillis;
                            if (j > 0 && jCurrentTimeMillis > j) {
                                LOG.OooOo0O("closing down from inactivity");
                                exit(0);
                            }
                        }
                    } finally {
                    }
                }
                Thread.sleep(this.checkForTimeoutMs);
            } catch (InterruptedException unused) {
                LOG.OooOOo0("interrupted");
                return;
            }
        }
    }

    private void write(STATUS status, String str) throws IOException {
        write(status, str.getBytes(StandardCharsets.UTF_8));
    }

    private void write(STATUS status, byte[] bArr) throws IOException {
        try {
            int length = bArr.length;
            this.output.write(status.getByte());
            this.output.writeInt(length);
            this.output.write(bArr);
            this.output.flush();
        } catch (IOException e) {
            LOG.OooOOOO("problem writing data (forking process shutdown?)", e);
            exit(1);
        }
    }

    private void write(STATUS status) throws IOException {
        try {
            this.output.write(status.getByte());
            this.output.flush();
        } catch (IOException e) {
            LOG.OooOOOO("problem writing data (forking process shutdown?)", e);
            exit(1);
        }
    }
}
