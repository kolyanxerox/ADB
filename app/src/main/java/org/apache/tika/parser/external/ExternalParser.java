package org.apache.tika.parser.external;

import com.ironsource.o0000O0O;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00OOooO.o00O00;
import o00Oo00o.Oooo0;
import o0oOO.OooO0o;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.p015io.TemporaryResources;
import org.apache.tika.p015io.TikaInputStream;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.XHTMLContentHandler;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public class ExternalParser implements Parser {
    public static final String INPUT_FILE_TOKEN = "${INPUT}";
    private static final o0oOO.OooO0O0 LOG = OooO0o.OooO0O0(ExternalParser.class);
    public static final String OUTPUT_FILE_TOKEN = "${OUTPUT}";
    private static final long serialVersionUID = -1079128990650687037L;
    private final long timeoutMs = 60000;
    private Set<MediaType> supportedTypes = Collections.EMPTY_SET;
    private Map<Pattern, String> metadataPatterns = null;
    private String[] command = {"cat"};
    private LineConsumer ignoredLineConsumer = LineConsumer.NULL;

    public interface LineConsumer extends Serializable {
        public static final LineConsumer NULL = new OooO0O0();

        static /* synthetic */ void lambda$static$e2402a94$1(String str) {
        }

        void consume(String str);
    }

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    private void extractMetadata(InputStream inputStream, Metadata metadata) throws InterruptedException {
        Thread thread = new Thread(new o0000O0O(this, inputStream, metadata, 14));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    private void extractOutput(InputStream inputStream, XHTMLContentHandler xHTMLContentHandler) throws SAXException, IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try {
            xHTMLContentHandler.startDocument();
            xHTMLContentHandler.startElement("p");
            char[] cArr = new char[1024];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    xHTMLContentHandler.endElement("p");
                    xHTMLContentHandler.endDocument();
                    inputStreamReader.close();
                    return;
                }
                xHTMLContentHandler.characters(cArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void ignoreStream(InputStream inputStream) throws InterruptedException {
        ignoreStream(inputStream, true);
    }

    public void lambda$extractMetadata$2(InputStream inputStream, Metadata metadata) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    o00O00.OooO00o(bufferedReader);
                    o00O00.OooO00o(inputStream);
                    return;
                }
                boolean z = false;
                for (Map.Entry<Pattern, String> entry : this.metadataPatterns.entrySet()) {
                    Matcher matcher = entry.getKey().matcher(line);
                    if (matcher.find()) {
                        if (entry.getValue() == null || entry.getValue().equals("")) {
                            metadata.add(matcher.group(1), matcher.group(2));
                        } else {
                            metadata.add(entry.getValue(), matcher.group(1));
                        }
                        z = true;
                    }
                }
                if (!z) {
                    this.ignoredLineConsumer.consume(line);
                }
            } catch (IOException unused) {
                o00O00.OooO00o(bufferedReader);
                o00O00.OooO00o(inputStream);
                return;
            } catch (Throwable th) {
                o00O00.OooO00o(bufferedReader);
                o00O00.OooO00o(inputStream);
                throw th;
            }
        }
    }

    public static void lambda$ignoreStream$0(InputStream inputStream) {
        try {
            o00O00.OooO0O0(inputStream, Oooo0.f32672OooOo0O);
        } catch (IOException unused) {
        } finally {
            o00O00.OooO00o(inputStream);
        }
    }

    public static /* synthetic */ void lambda$sendInput$1(Process process, InputStream inputStream) {
        try {
            o00O00.OooO0O0(inputStream, process.getOutputStream());
        } catch (IOException unused) {
        }
    }

    private void sendInput(Process process, InputStream inputStream) throws InterruptedException {
        Thread thread = new Thread(new OooOOOO(17, process, inputStream));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public LineConsumer getIgnoredLineConsumer() {
        return this.ignoredLineConsumer;
    }

    public Map<Pattern, String> getMetadataExtractionPatterns() {
        return this.metadataPatterns;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getSupportedTypes();
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws TikaException, SAXException, IOException {
        XHTMLContentHandler xHTMLContentHandler = new XHTMLContentHandler(contentHandler, metadata);
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            parse(TikaInputStream.get(inputStream, temporaryResources, metadata), xHTMLContentHandler, metadata, temporaryResources);
        } finally {
            temporaryResources.dispose();
        }
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setIgnoredLineConsumer(LineConsumer lineConsumer) {
        this.ignoredLineConsumer = lineConsumer;
    }

    public void setMetadataExtractionPatterns(Map<Pattern, String> map) {
        this.metadataPatterns = map;
    }

    public void setSupportedTypes(Set<MediaType> set) {
        this.supportedTypes = Collections.unmodifiableSet(new HashSet(set));
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean check(java.lang.String[] r8, int... r9) {
        /*
            int r0 = r9.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lb
            int[] r9 = new int[r1]
            r0 = 127(0x7f, float:1.78E-43)
            r9[r2] = r0
        Lb:
            r0 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.lang.Process r0 = r3.exec(r8)     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.io.InputStream r3 = r0.getErrorStream()     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.lang.Thread r3 = ignoreStream(r3, r2)     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.io.InputStream r4 = r0.getInputStream()     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.lang.Thread r4 = ignoreStream(r4, r2)     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            r3.join()     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            r4.join()     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            boolean r3 = org.apache.tika.fork.OooO00o.OooOo0o(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            if (r3 == 0) goto L63
            int r3 = r0.exitValue()     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            o0oOO.OooO0O0 r4 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.lang.String r5 = "exit value for {}: {}"
            r6 = r8[r2]     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            r4.OooOoOO(r5, r6, r7)     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            int r4 = r9.length     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            r5 = r2
        L45:
            if (r5 >= r4) goto L5f
            r6 = r9[r5]     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            if (r3 != r6) goto L4f
            org.apache.tika.fork.OooO00o.OooOOo(r0)
            return r2
        L4f:
            int r5 = r5 + 1
            goto L45
        L52:
            r8 = move-exception
            goto Lc3
        L55:
            r9 = move-exception
            goto L69
        L57:
            r8 = move-exception
            goto La6
        L59:
            r9 = move-exception
            goto La7
        L5b:
            r9 = move-exception
            goto La7
        L5d:
            r9 = move-exception
            goto La7
        L5f:
            org.apache.tika.fork.OooO00o.OooOOo(r0)
            return r1
        L63:
            java.util.concurrent.TimeoutException r9 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            r9.<init>()     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L52 java.lang.Error -> L55 java.lang.SecurityException -> L57 java.util.concurrent.TimeoutException -> L59 java.lang.InterruptedException -> L5b java.io.IOException -> L5d
        L69:
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto La5
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "posix_spawn"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L87
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "UNIXProcess"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto La5
        L87:
            o0oOO.OooO0O0 r1 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L52
            r8 = r8[r2]     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r3.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "(TIKA-1526): exception trying to run: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L52
            r3.append(r8)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L52
            r1.OooOo0(r8, r9)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto Lc2
        La1:
            org.apache.tika.fork.OooO00o.OooOOo(r0)
            goto Lc2
        La5:
            throw r9     // Catch: java.lang.Throwable -> L52
        La6:
            throw r8     // Catch: java.lang.Throwable -> L52
        La7:
            o0oOO.OooO0O0 r1 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L52
            r8 = r8[r2]     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r3.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "exception trying to run  "
            r3.append(r4)     // Catch: java.lang.Throwable -> L52
            r3.append(r8)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L52
            r1.OooOo0(r8, r9)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto Lc2
            goto La1
        Lc2:
            return r2
        Lc3:
            if (r0 == 0) goto Lc8
            org.apache.tika.fork.OooO00o.OooOOo(r0)
        Lc8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.external.ExternalParser.check(java.lang.String[], int[]):boolean");
    }

    private static Thread ignoreStream(InputStream inputStream, boolean z) throws InterruptedException {
        Thread thread = new Thread(new OooO00o(inputStream, 0));
        thread.start();
        if (z) {
            try {
                thread.join();
            } catch (InterruptedException unused) {
            }
        }
        return thread;
    }

    public Set<MediaType> getSupportedTypes() {
        return this.supportedTypes;
    }

    private void parse(TikaInputStream tikaInputStream, XHTMLContentHandler xHTMLContentHandler, Metadata metadata, TemporaryResources temporaryResources) throws InterruptedException, TikaException, SAXException, IOException {
        String[] strArrSplit;
        Process processExec;
        Map<Pattern, String> map = this.metadataPatterns;
        boolean z = (map == null || map.isEmpty()) ? false : true;
        String[] strArr = this.command;
        if (strArr.length == 1) {
            strArrSplit = strArr[0].split(StringUtils.SPACE);
        } else {
            String[] strArr2 = new String[strArr.length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArrSplit = strArr2;
        }
        Process process = null;
        boolean z2 = true;
        boolean z3 = true;
        File fileCreateTemporaryFile = null;
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].contains(INPUT_FILE_TOKEN)) {
                strArrSplit[i] = strArrSplit[i].replace(INPUT_FILE_TOKEN, tikaInputStream.getFile().getPath());
                z2 = false;
            }
            if (strArrSplit[i].contains(OUTPUT_FILE_TOKEN)) {
                fileCreateTemporaryFile = temporaryResources.createTemporaryFile();
                strArrSplit[i] = strArrSplit[i].replace(OUTPUT_FILE_TOKEN, fileCreateTemporaryFile.getPath());
                z3 = false;
            }
        }
        try {
            if (strArrSplit.length == 1) {
                processExec = Runtime.getRuntime().exec(strArrSplit[0]);
            } else {
                processExec = Runtime.getRuntime().exec(strArrSplit);
            }
            process = processExec;
        } catch (Exception e) {
            LOG.OooO("problem with process exec", e);
        }
        try {
            if (z2) {
                sendInput(process, tikaInputStream);
            } else {
                process.getOutputStream().close();
            }
            InputStream inputStream = process.getInputStream();
            InputStream errorStream = process.getErrorStream();
            if (z) {
                extractMetadata(errorStream, metadata);
                if (z3) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    extractMetadata(inputStream, metadata);
                }
            } else {
                ignoreStream(errorStream);
                if (z3) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    ignoreStream(inputStream);
                }
            }
            try {
                process.waitFor();
            } catch (InterruptedException unused) {
            }
            if (z3) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(fileCreateTemporaryFile);
            try {
                extractOutput(fileInputStream, xHTMLContentHandler);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                process.waitFor();
            } catch (InterruptedException unused2) {
            }
            throw th3;
        }
    }
}
