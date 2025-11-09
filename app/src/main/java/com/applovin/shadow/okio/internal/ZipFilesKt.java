package com.applovin.shadow.okio.internal;

import OooO00o.OooO00o;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.ZipFileSystem;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0OOO0o;
import kotlin.jvm.internal.o0Oo0oo;
import kotlin.jvm.internal.oo000o;
import o00O0.OooOo00;
import o00O0.o0O0O00;
import o00O0Oo.o00O0O;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import o00Oo0oo.o00oO0o;
import oo00o.OooOO0;

/* loaded from: classes2.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$openZip$1 */
    public static final class C13631 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C13631 INSTANCE = new C13631();

        public C13631() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public final Boolean invoke(ZipEntry it) {
            OooOo.OooO0o0(it, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readEntry$1 */
    public static final class C13641 extends Oooo000 implements o00O0O {
        final /* synthetic */ o0OOO0o $compressedSize;
        final /* synthetic */ oo000o $hasZip64Extra;
        final /* synthetic */ o0OOO0o $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ o0OOO0o $size;
        final /* synthetic */ BufferedSource $this_readEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13641(oo000o oo000oVar, long j, o0OOO0o o0ooo0o, BufferedSource bufferedSource, o0OOO0o o0ooo0o2, o0OOO0o o0ooo0o3) {
            super(2);
            this.$hasZip64Extra = oo000oVar;
            this.$requiredZip64ExtraSize = j;
            this.$size = o0ooo0o;
            this.$this_readEntry = bufferedSource;
            this.$compressedSize = o0ooo0o2;
            this.$offset = o0ooo0o3;
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return oo00o.OooOo.f33195OooO00o;
        }

        public final void invoke(int i, long j) throws IOException {
            if (i == 1) {
                oo000o oo000oVar = this.$hasZip64Extra;
                if (oo000oVar.f28883OooOo0O) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                oo000oVar.f28883OooOo0O = true;
                if (j < this.$requiredZip64ExtraSize) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                o0OOO0o o0ooo0o = this.$size;
                long longLe = o0ooo0o.f28879OooOo0O;
                if (longLe == 4294967295L) {
                    longLe = this.$this_readEntry.readLongLe();
                }
                o0ooo0o.f28879OooOo0O = longLe;
                o0OOO0o o0ooo0o2 = this.$compressedSize;
                o0ooo0o2.f28879OooOo0O = o0ooo0o2.f28879OooOo0O == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
                o0OOO0o o0ooo0o3 = this.$offset;
                o0ooo0o3.f28879OooOo0O = o0ooo0o3.f28879OooOo0O == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
            }
        }
    }

    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readOrSkipLocalHeader$1 */
    public static final class C13651 extends Oooo000 implements o00O0O {
        final /* synthetic */ o0Oo0oo $createdAtMillis;
        final /* synthetic */ o0Oo0oo $lastAccessedAtMillis;
        final /* synthetic */ o0Oo0oo $lastModifiedAtMillis;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13651(BufferedSource bufferedSource, o0Oo0oo o0oo0oo, o0Oo0oo o0oo0oo2, o0Oo0oo o0oo0oo3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$lastModifiedAtMillis = o0oo0oo;
            this.$lastAccessedAtMillis = o0oo0oo2;
            this.$createdAtMillis = o0oo0oo3;
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return oo00o.OooOo.f33195OooO00o;
        }

        public final void invoke(int i, long j) throws IOException {
            if (i == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                if (j < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b = this.$this_readOrSkipLocalHeader.readByte();
                boolean z = (b & 1) == 1;
                boolean z2 = (b & 2) == 2;
                boolean z3 = (b & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j2 = z ? 5L : 1L;
                if (z2) {
                    j2 += 4;
                }
                if (z3) {
                    j2 += 4;
                }
                if (j < j2) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z) {
                    this.$lastModifiedAtMillis.f28880OooOo0O = Long.valueOf(bufferedSource.readIntLe() * 1000);
                }
                if (z2) {
                    this.$lastAccessedAtMillis.f28880OooOo0O = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
                if (z3) {
                    this.$createdAtMillis.f28880OooOo0O = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
            }
        }
    }

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
        LinkedHashMap linkedHashMapOooOOo = o0O0O00.OooOOo(new OooOO0(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, IronSourceError.ERROR_CODE_INIT_FAILED, null)));
        for (ZipEntry zipEntry : OooOo00.Oooo0(list, new Comparator() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return o00oO0o.OooO0Oo(((ZipEntry) t).getCanonicalPath(), ((ZipEntry) t2).getCanonicalPath());
            }
        })) {
            if (((ZipEntry) linkedHashMapOooOOo.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) linkedHashMapOooOOo.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, IronSourceError.ERROR_CODE_INIT_FAILED, null);
                        linkedHashMapOooOOo.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return linkedHashMapOooOOo;
    }

    private static final Long dosDateTimeToEpochMillis(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i) {
        OooO00o.OooO00o(16);
        String string = Integer.toString(i, 16);
        OooOo.OooO0Oo(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    /* JADX WARN: Finally extract failed */
    public static final ZipFileSystem openZip(Path zipPath, FileSystem fileSystem, o00O0Oo.Oooo000 predicate) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        BufferedSource bufferedSourceBuffer;
        OooOo.OooO0o0(zipPath, "zipPath");
        OooOo.OooO0o0(fileSystem, "fileSystem");
        OooOo.OooO0o0(predicate, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = fileHandleOpenReadOnly.size() - 22;
            if (size < 0) {
                throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(size));
                try {
                    if (bufferedSourceBuffer2.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer2);
                        String utf8 = bufferedSourceBuffer2.readUtf8(eocdRecord.getCommentByteCount());
                        bufferedSourceBuffer2.close();
                        long j = size - 20;
                        if (j > 0) {
                            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(j));
                            try {
                                if (bufferedSourceBuffer.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                    int intLe = bufferedSourceBuffer.readIntLe();
                                    long longLe = bufferedSourceBuffer.readLongLe();
                                    if (bufferedSourceBuffer.readIntLe() != 1 || intLe != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                    try {
                                        int intLe2 = bufferedSourceBuffer.readIntLe();
                                        if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                            throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                        }
                                        eocdRecord = readZip64EocdRecord(bufferedSourceBuffer, eocdRecord);
                                        o0OO0O0.OooOO0(bufferedSourceBuffer, null);
                                    } finally {
                                    }
                                }
                                o0OO0O0.OooOO0(bufferedSourceBuffer, null);
                            } finally {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                        try {
                            long entryCount = eocdRecord.getEntryCount();
                            for (long j2 = 0; j2 < entryCount; j2++) {
                                ZipEntry entry = readEntry(bufferedSourceBuffer);
                                if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(entry)).booleanValue()) {
                                    arrayList.add(entry);
                                }
                            }
                            o0OO0O0.OooOO0(bufferedSourceBuffer, null);
                            ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, buildIndex(arrayList), utf8);
                            o0OO0O0.OooOO0(fileHandleOpenReadOnly, null);
                            return zipFileSystem;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    bufferedSourceBuffer2.close();
                    size--;
                } finally {
                    bufferedSourceBuffer2.close();
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, o00O0Oo.Oooo000 oooo000, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            oooo000 = C13631.INSTANCE;
        }
        return openZip(path, fileSystem, oooo000);
    }

    public static final ZipEntry readEntry(BufferedSource bufferedSource) throws IOException {
        OooOo.OooO0o0(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = bufferedSource.readIntLe() & 4294967295L;
        o0OOO0o o0ooo0o = new o0OOO0o();
        o0ooo0o.f28879OooOo0O = bufferedSource.readIntLe() & 4294967295L;
        o0OOO0o o0ooo0o2 = new o0OOO0o();
        o0ooo0o2.f28879OooOo0O = bufferedSource.readIntLe() & 4294967295L;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        o0OOO0o o0ooo0o3 = new o0OOO0o();
        o0ooo0o3.f28879OooOo0O = bufferedSource.readIntLe() & 4294967295L;
        String utf8 = bufferedSource.readUtf8(shortLe3);
        if (o000000.Oooo0o0(utf8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = o0ooo0o2.f28879OooOo0O == 4294967295L ? 8 : 0L;
        if (o0ooo0o.f28879OooOo0O == 4294967295L) {
            j += 8;
        }
        if (o0ooo0o3.f28879OooOo0O == 4294967295L) {
            j += 8;
        }
        oo000o oo000oVar = new oo000o();
        readExtra(bufferedSource, shortLe4, new C13641(oo000oVar, j, o0ooo0o2, bufferedSource, o0ooo0o, o0ooo0o3));
        if (j <= 0 || oo000oVar.f28883OooOo0O) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null).resolve(utf8), o0000O00.OooOooo(utf8, "/", false), bufferedSource.readUtf8(shortLe5), intLe2, o0ooo0o.f28879OooOo0O, o0ooo0o2.f28879OooOo0O, shortLe2, lDosDateTimeToEpochMillis, o0ooo0o3.f28879OooOo0O);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, 4294967295L & bufferedSource.readIntLe(), bufferedSource.readShortLe() & 65535);
    }

    private static final void readExtra(BufferedSource bufferedSource, int i, o00O0O o00o0o) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            o00o0o.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(OooO0oO.OooOo.OooO0o(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j2 - shortLe2;
        }
    }

    public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata basicMetadata) throws IOException {
        OooOo.OooO0o0(bufferedSource, "<this>");
        OooOo.OooO0o0(basicMetadata, "basicMetadata");
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, basicMetadata);
        OooOo.OooO0O0(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    private static final FileMetadata readOrSkipLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        o0Oo0oo o0oo0oo = new o0Oo0oo();
        o0oo0oo.f28880OooOo0O = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : null;
        o0Oo0oo o0oo0oo2 = new o0Oo0oo();
        o0Oo0oo o0oo0oo3 = new o0Oo0oo();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        bufferedSource.skip(18L);
        long shortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new C13651(bufferedSource, o0oo0oo, o0oo0oo2, o0oo0oo3));
        return new FileMetadata(fileMetadata.isRegularFile(), fileMetadata.isDirectory(), null, fileMetadata.getSize(), (Long) o0oo0oo3.f28880OooOo0O, (Long) o0oo0oo.f28880OooOo0O, (Long) o0oo0oo2.f28880OooOo0O, null, 128, null);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        OooOo.OooO0o0(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
