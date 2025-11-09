package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0957a4;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1033g2;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1268v4;
import com.applovin.impl.InterfaceC1023f2;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3034d9;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.m */
/* loaded from: classes.dex */
public class C1222m {

    /* renamed from: b */
    private final C1220k f2201b;

    /* renamed from: c */
    private final C1240o f2202c;

    /* renamed from: f */
    private final boolean f2205f;

    /* renamed from: a */
    private final String f2200a = "FileManager";

    /* renamed from: d */
    private final Object f2203d = new Object();

    /* renamed from: e */
    private final Set f2204e = new HashSet();

    /* renamed from: g */
    private final InterfaceC1023f2 f2206g = m3003a();

    public C1222m(C1220k c1220k) {
        this.f2201b = c1220k;
        this.f2202c = c1220k.m2847O();
        this.f2205f = ((Boolean) c1220k.m2866a(C1268v4.f2691U0)).booleanValue();
    }

    /* renamed from: a */
    private InterfaceC1023f2 m3003a() {
        if (AbstractC1141o0.m1949e() && ((Boolean) this.f2201b.m2866a(C1268v4.f2871q3)).booleanValue()) {
            try {
                return new C0957a4(this.f2201b);
            } catch (Throwable th) {
                if (C1240o.m3200a()) {
                    this.f2202c.m3212a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.f2201b.m2832E().m2148a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new C1033g2(this.f2201b);
    }

    /* renamed from: e */
    private boolean m3019e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f2203d) {
            try {
                if (this.f2204e.contains(absolutePath)) {
                    return false;
                }
                m3018d(file);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    private boolean m3020g(File file) {
        if (C1240o.m3200a()) {
            this.f2202c.m3211a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            m3018d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", m3013b(file));
                this.f2201b.m2832E().m572a(C0993c2.f472D0, "removeFile", mapHashMap);
            }
            m3021h(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (C1240o.m3200a()) {
                    this.f2202c.m3212a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f2201b.m2832E().m2148a("FileManager", "removeFile", th);
                m3021h(file);
                return false;
            } catch (Throwable th2) {
                m3021h(file);
                throw th2;
            }
        }
    }

    /* renamed from: h */
    private void m3021h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f2203d) {
            try {
                if (!this.f2204e.remove(absolutePath)) {
                    this.f2201b.m2832E().m572a(C0993c2.f472D0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
                }
                this.f2203d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m3032b(Context context) {
        if (this.f2201b.m2835F0()) {
            if (C1240o.m3200a()) {
                this.f2202c.m3211a("FileManager", "Compacting cache...");
            }
            m3006a(m3002a(context), context);
        }
    }

    /* renamed from: c */
    public void m3034c(AbstractC1207b abstractC1207b, Context context) {
        this.f2201b.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2201b, false, "removeCachedResourcesForAd", new OooOOO0(this, abstractC1207b, context, 0)), C0987b6.b.CACHING);
    }

    /* renamed from: d */
    public void m3036d(AbstractC1207b abstractC1207b, Context context) {
        this.f2201b.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2201b, false, "removeCachedVideoResourceForAd", new OooOOO0(this, abstractC1207b, context, 1)), C0987b6.b.CACHING);
    }

    /* renamed from: f */
    public String m3038f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (C1240o.m3200a()) {
            this.f2202c.m3211a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z = true;
        try {
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            m3018d(file);
                            String strM3027a = m3027a(fileInputStream);
                            boolean z2 = strM3027a == null;
                            fileInputStream.close();
                            if (z2 && ((Boolean) this.f2201b.m2866a(C1268v4.f2627M0)).booleanValue()) {
                                m3028a(file, "removeFileAfterReadFail");
                            }
                            m3021h(file);
                            return strM3027a;
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException e) {
                        if (C1240o.m3200a()) {
                            this.f2202c.m3215d("FileManager", "File not found. " + e);
                        }
                        this.f2202c.m3213a("FileManager", e);
                        this.f2201b.m2832E().m2148a("FileManager", "readFileNotFound", e);
                        if (0 != 0 && ((Boolean) this.f2201b.m2866a(C1268v4.f2627M0)).booleanValue()) {
                            m3028a(file, "removeFileAfterReadFail");
                        }
                        m3021h(file);
                        return null;
                    }
                } catch (Throwable th4) {
                    if (C1240o.m3200a()) {
                        this.f2202c.m3212a("FileManager", "Unknown failure to read file.", th4);
                    }
                    this.f2202c.m3213a("FileManager", th4);
                    this.f2201b.m2832E().m2148a("FileManager", "readFile", th4);
                    if (((Boolean) this.f2201b.m2866a(C1268v4.f2627M0)).booleanValue()) {
                        m3028a(file, "removeFileAfterReadFail");
                    }
                    m3021h(file);
                    return null;
                }
            } catch (IOException e2) {
                if (C1240o.m3200a()) {
                    this.f2202c.m3211a("FileManager", "Failed to read file: " + file.getName() + e2);
                }
                this.f2202c.m3213a("FileManager", e2);
                this.f2201b.m2832E().m2148a("FileManager", "readFileIO", e2);
                if (((Boolean) this.f2201b.m2866a(C1268v4.f2627M0)).booleanValue()) {
                    m3028a(file, "removeFileAfterReadFail");
                }
                m3021h(file);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            if (z && ((Boolean) this.f2201b.m2866a(C1268v4.f2627M0)).booleanValue()) {
                m3028a(file, "removeFileAfterReadFail");
            }
            m3021h(file);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m3016c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f2203d) {
            zContains = this.f2204e.contains(absolutePath);
        }
        return zContains;
    }

    /* renamed from: d */
    private void m3018d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f2203d) {
            boolean zAdd = this.f2204e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f2203d.wait();
                    zAdd = this.f2204e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (C1240o.m3200a()) {
                        this.f2202c.m3212a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m3014b(AbstractC1207b abstractC1207b, Context context) {
        if (abstractC1207b.mo1370v0() == null) {
            return;
        }
        m3020g(m3023a(abstractC1207b.mo1370v0().getLastPathSegment(), context));
    }

    /* renamed from: c */
    private List m3015c(Context context) {
        File[] fileArrListFiles;
        File fileM3017d = m3017d(context);
        if (fileM3017d.isDirectory() && (fileArrListFiles = fileM3017d.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public File m3023a(String str, Context context) {
        return m3004a(str, true, context);
    }

    /* renamed from: a */
    private File m3004a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (C1240o.m3200a()) {
                this.f2202c.m3211a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Looking up cached resource: ", str, this.f2202c, "FileManager");
        }
        if (str.contains(C3034d9.h.f8071H0)) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileM3017d = m3017d(context);
        File file = new File(fileM3017d, str);
        if (!z) {
            return file;
        }
        try {
            fileM3017d.mkdirs();
            return file;
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f2202c.m3212a("FileManager", "Unable to make cache directory at " + fileM3017d, th);
            }
            this.f2201b.m2832E().m2148a("FileManager", "createCacheDir", th);
            return null;
        }
    }

    /* renamed from: e */
    public void m3037e(Context context) {
        try {
            m3023a(".nomedia", context);
            File file = new File(m3017d(context), ".nomedia");
            if (m3029a(file)) {
                return;
            }
            if (C1240o.m3200a()) {
                this.f2202c.m3211a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (C1240o.m3200a()) {
                this.f2202c.m3214b("FileManager", "Failed to create .nomedia file");
            }
            this.f2201b.m2832E().m571a(C0993c2.f472D0, "createNoMediaFile");
        } catch (IOException e) {
            if (C1240o.m3200a()) {
                this.f2202c.m3212a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    /* renamed from: b */
    private String m3013b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z = false;
            boolean z2 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z3 = parentFile != null && parentFile.exists();
            if (z3 && parentFile.canWrite()) {
                z = true;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z2 + "\nparentDirectoryExists: " + z3 + "\nisParentDirectoryWritable: " + z;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    /* renamed from: d */
    private File m3017d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    /* renamed from: c */
    public boolean m3035c(String str, Context context) {
        if (this.f2205f) {
            return m3033b(str, context);
        }
        boolean z = false;
        File fileM3004a = m3004a(str, false, context);
        if (!m3019e(fileM3004a)) {
            return false;
        }
        if (fileM3004a.exists() && !fileM3004a.isDirectory()) {
            z = true;
        }
        m3021h(fileM3004a);
        return z;
    }

    /* renamed from: b */
    private long m3012b() {
        long jLongValue = ((Long) this.f2201b.m2866a(C1268v4.f2539B0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    /* renamed from: b */
    public boolean m3033b(String str, Context context) {
        return m3029a(m3004a(str, false, context));
    }

    /* renamed from: a */
    public String m3027a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr, 0, 8192);
                    if (i >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        String string = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return string;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f2202c.m3213a("FileManager", th);
            this.f2201b.m2832E().m2148a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    /* renamed from: a */
    public boolean m3031a(InputStream inputStream, File file, boolean z) {
        return m3011a(inputStream, file, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:362:0x0149 A[Catch: all -> 0x014f, TryCatch #11 {all -> 0x014f, blocks: (B:360:0x0143, B:362:0x0149, B:365:0x0152), top: B:532:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02f8 A[Catch: all -> 0x02fe, TRY_LEAVE, TryCatch #23 {all -> 0x02fe, blocks: (B:471:0x02f2, B:473:0x02f8), top: B:554:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x02d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x02bb A[EDGE_INSN: B:559:0x02bb->B:453:0x02bb BREAK  A[LOOP:1: B:426:0x025e->B:560:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:568:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:572:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m3011a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1222m.m3011a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    /* renamed from: a */
    public boolean m3030a(File file, String str, List list, int i, String str2, Map map) {
        return m3009a(file, str, list, true, i, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private boolean m3009a(File file, String str, List list, boolean z, int i, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f2201b.m2897g().m576d(C0993c2.f549x, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = 1;
        while (i2 <= i) {
            if (m3010a(file, str, list, z, str2, map2)) {
                m3008a(true, str, i2, jElapsedRealtime, map);
                return true;
            }
            i2++;
            map2 = map;
        }
        m3008a(false, str, i, jElapsedRealtime, map);
        return false;
    }

    /* renamed from: a */
    private boolean m3010a(File file, String str, List list, boolean z, String str2, Map map) {
        Boolean bool = (Boolean) this.f2201b.m2866a(C1268v4.f2699V0);
        if (bool.booleanValue()) {
            m3018d(file);
        }
        if (m3029a(file)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("File exists for ", str, this.f2202c, "FileManager");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f2201b.m2897g().m576d(C0993c2.f551y, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamM3024a = m3024a(str, list, z, map);
            try {
                if (C1240o.m3200a()) {
                    this.f2202c.m3211a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zM3011a = m3011a(inputStreamM3024a, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zM3011a) {
                    if (C1240o.m3200a()) {
                        this.f2202c.m3211a("FileManager", "Caching completed for " + file);
                    }
                    double dM1229d = AbstractC1078k7.m1229d(jElapsedRealtime2);
                    double dM1221c = AbstractC1078k7.m1221c(file.length());
                    long j = (long) (dM1221c / dM1229d);
                    Map mapM3005a = m3005a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j), mapM3005a);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dM1221c), mapM3005a);
                    this.f2201b.m2897g().m576d(C0993c2.f471D, mapM3005a);
                    this.f2201b.m2892d0().m3868b(j, str, str2);
                } else {
                    if (C1240o.m3200a()) {
                        this.f2202c.m3214b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f2201b.m2897g().m576d(C0993c2.f473E, m3005a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamM3024a != null) {
                    inputStreamM3024a.close();
                }
                if (bool.booleanValue()) {
                    m3021h(file);
                }
                return zM3011a;
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.f2202c.m3213a("FileManager", th);
                this.f2201b.m2832E().m2148a("FileManager", "loadAndCacheResource", th);
                if (bool.booleanValue()) {
                    m3021h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    m3021h(file);
                }
            }
        }
    }

    /* renamed from: a */
    private Map m3005a(File file, String str, long j, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    /* renamed from: a */
    private void m3008a(boolean z, String str, int i, long j, Map map) {
        C0993c2 c0993c2 = z ? C0993c2.f553z : C0993c2.f465A;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f2201b.m2897g().m576d(c0993c2, map2);
    }

    /* renamed from: a */
    public InputStream m3024a(String str, List list, boolean z, Map map) {
        if (z && !AbstractC1078k7.m1205a(str, list)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Domain is not whitelisted, skipping precache for url: ", str, this.f2202c, "FileManager");
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (C1240o.m3200a()) {
            this.f2202c.m3211a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f2201b.m2897g().m576d(C0993c2.f467B, mapHashMap);
        try {
            return this.f2206g.mo108a(httpsString, map);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f2202c.m3212a("FileManager", "Error loading " + httpsString, th);
            }
            this.f2201b.m2832E().m2151a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    /* renamed from: a */
    public int m3022a(String str, AbstractC1207b abstractC1207b) {
        List listM2592d0 = abstractC1207b.m2592d0();
        if (abstractC1207b.m2570Z0() || listM2592d0.contains(str)) {
            return abstractC1207b.m2546L();
        }
        return 1;
    }

    /* renamed from: a */
    public String m3025a(Context context, String str, String str2, List list, boolean z, int i, String str3, Map map) {
        return m3026a(context, str, str2, list, z, false, i, str3, map);
    }

    /* renamed from: a */
    public String m3026a(Context context, String str, String str2, List list, boolean z, boolean z2, int i, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (C1240o.m3200a()) {
                this.f2202c.m3211a("FileManager", "Nothing to cache, skipping...");
            }
            this.f2201b.m2832E().m571a(C0993c2.f472D0, "cacheResource");
            return null;
        }
        String strM1170a = AbstractC1078k7.m1170a(Uri.parse(str), str2, this.f2201b);
        File fileM3023a = m3023a(strM1170a, context);
        if (!m3009a(fileM3023a, str, list, z, i, str3, map)) {
            return null;
        }
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Caching succeeded for file ", strM1170a, this.f2202c, "FileManager");
        }
        return z2 ? Uri.fromFile(fileM3023a).toString() : strM1170a;
    }

    /* renamed from: a */
    private long m3002a(Context context) {
        boolean zM3020g;
        long jM3012b = m3012b();
        boolean z = jM3012b != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listM2888c = this.f2201b.m2888c(C1268v4.f2579G0);
        long length = 0;
        for (File file : m3015c(context)) {
            if (!z || listM2888c.contains(file.getName()) || m3016c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jM3012b) {
                zM3020g = false;
            } else {
                if (C1240o.m3200a()) {
                    this.f2202c.m3211a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zM3020g = m3020g(file);
            }
            if (!zM3020g) {
                length += file.length();
            }
        }
        return length;
    }

    /* renamed from: a */
    private void m3006a(long j, Context context) {
        long jIntValue = ((Integer) this.f2201b.m2866a(C1268v4.f2547C0)).intValue();
        if (jIntValue == -1) {
            if (C1240o.m3200a()) {
                this.f2202c.m3211a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (m3001a(j) > jIntValue) {
                if (C1240o.m3200a()) {
                    this.f2202c.m3211a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = m3015c(context).iterator();
                while (it.hasNext()) {
                    m3020g((File) it.next());
                }
                return;
            }
            if (C1240o.m3200a()) {
                this.f2202c.m3211a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m3007a(AbstractC1207b abstractC1207b, Context context) {
        ArrayList arrayList = new ArrayList(abstractC1207b.m2615l());
        CollectionUtils.addObjectIfExists(abstractC1207b.mo1370v0(), arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m3020g(m3023a(((Uri) obj).getLastPathSegment(), context));
        }
    }

    /* renamed from: a */
    public void m3028a(File file, String str) {
        if (C1240o.m3200a()) {
            this.f2202c.m3211a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", m3013b(file));
            this.f2201b.m2832E().m572a(C0993c2.f472D0, str, mapHashMap);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f2202c.m3212a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f2201b.m2832E().m2148a("FileManager", str, th);
        }
    }

    /* renamed from: a */
    private long m3001a(long j) {
        return j / 1048576;
    }

    /* renamed from: a */
    public boolean m3029a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
