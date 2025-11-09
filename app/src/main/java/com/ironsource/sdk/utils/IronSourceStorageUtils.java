package com.ironsource.sdk.utils;

import OooO0oO.OooOo;
import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C3034d9;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3769vh;
import com.ironsource.C3782vu;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceStorageUtils {

    /* renamed from: a */
    private static final String f11854a = "supersonicads";

    /* renamed from: b */
    private static C3782vu f11855b = null;

    /* renamed from: c */
    private static boolean f11856c = false;

    /* renamed from: a */
    private static void m12255a(Context context) {
        C3782vu c3782vu = f11855b;
        if (c3782vu != null && c3782vu.m12821b()) {
            deleteCacheDirectories(context);
        }
        C3782vu c3782vu2 = f11855b;
        if (c3782vu2 == null || !c3782vu2.m12822c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    /* renamed from: b */
    private static File m12258b(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        C3782vu c3782vu = f11855b;
        return (c3782vu == null || !c3782vu.m12823d()) ? interfaceC3767vfMo8686f.mo4880u(context) : interfaceC3767vfMo8686f.mo4848e(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        return str2 == null ? str : OooOo.OooOOOo(OooOo.OooOo0O(str), File.separator, str2);
    }

    public static JSONObject buildFilesMap(String str, String str2) throws JSONException {
        Object objM12261c;
        String name;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    objM12261c = m12261c(file2);
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                if (objM12261c instanceof JSONArray) {
                    name = "files";
                } else if (objM12261c instanceof JSONObject) {
                    name = file2.getName();
                }
                jSONObject.put(name, m12261c(file2));
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C3769vh c3769vh, JSONObject jSONObject) throws Exception {
        String name;
        JSONObject jSONObjectBuildFilesMapOfDirectory;
        if (c3769vh == null || !c3769vh.isDirectory()) {
            return new JSONObject();
        }
        File[] fileArrListFiles = c3769vh.listFiles();
        if (fileArrListFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : fileArrListFiles) {
            C3769vh c3769vh2 = new C3769vh(file.getPath());
            if (c3769vh2.isFile()) {
                name = c3769vh2.getName();
                jSONObjectBuildFilesMapOfDirectory = c3769vh2.m12784a();
                if (jSONObject.has(name)) {
                    jSONObjectBuildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(jSONObjectBuildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else if (c3769vh2.isDirectory()) {
                name = c3769vh2.getName();
                jSONObjectBuildFilesMapOfDirectory = buildFilesMapOfDirectory(c3769vh2, jSONObject);
            }
            jSONObject2.put(name, jSONObjectBuildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    /* renamed from: c */
    private static File m12260c(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        C3782vu c3782vu = f11855b;
        return (c3782vu == null || !c3782vu.m12823d()) ? interfaceC3767vfMo8686f.mo4883x(context) : interfaceC3767vfMo8686f.mo4861k(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        m12256a(interfaceC3767vfMo8686f.mo4848e(context));
        m12256a(interfaceC3767vfMo8686f.mo4861k(context));
    }

    public static synchronized boolean deleteFile(C3769vh c3769vh) {
        if (!c3769vh.exists()) {
            return false;
        }
        return c3769vh.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        m12256a(interfaceC3767vfMo8686f.mo4880u(context));
        m12256a(interfaceC3767vfMo8686f.mo4883x(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean deleteFolder(java.lang.String r2) {
        /*
            java.lang.Class<com.ironsource.sdk.utils.IronSourceStorageUtils> r0 = com.ironsource.sdk.utils.IronSourceStorageUtils.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            boolean r2 = deleteFolderContentRecursive(r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            boolean r2 = r1.delete()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L16:
            r2 = move-exception
            goto L1b
        L18:
            r2 = 0
        L19:
            monitor-exit(r0)
            return r2
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFolder(java.lang.String):boolean");
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C3782vu c3782vu = f11855b;
        if (c3782vu == null || !c3782vu.m12824e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(C3034d9.c.f7967u.concat(canonicalPath2));
            }
        }
    }

    public static String getCachedFilesMap(String str, String str2) throws JSONException {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileM12258b;
        if (!m12257a() || !SDKUtils.isExternalStorageAvailable() || (fileM12258b = m12258b(context)) == null || !fileM12258b.canWrite()) {
            return m12260c(context).getPath();
        }
        f11856c = true;
        return fileM12258b.getPath();
    }

    public static ArrayList<C3769vh> getFilesInFolderRecursive(C3769vh c3769vh) {
        if (c3769vh == null || !c3769vh.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C3769vh> arrayList = new ArrayList<>();
        File[] fileArrListFiles = c3769vh.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C3769vh c3769vh2 = new C3769vh(file.getPath());
                if (c3769vh2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c3769vh2));
                }
                if (c3769vh2.isFile()) {
                    arrayList.add(c3769vh2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileM12259b = m12259b(new File(getDiskCacheDirPath(context)));
        if (!fileM12259b.exists()) {
            fileM12259b.mkdir();
        }
        return fileM12259b.getPath();
    }

    public static long getTotalSizeOfDir(C3769vh c3769vh) {
        long totalSizeOfDir;
        long j = 0;
        if (c3769vh != null && c3769vh.isDirectory()) {
            File[] fileArrListFiles = c3769vh.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                C3769vh c3769vh2 = new C3769vh(file.getPath());
                if (c3769vh2.isFile()) {
                    totalSizeOfDir = c3769vh2.length();
                } else if (c3769vh2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(c3769vh2);
                }
                j = totalSizeOfDir + j;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, C3782vu c3782vu) {
        f11855b = c3782vu;
        m12255a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f11856c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C3769vh c3769vh) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c3769vh));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int i2 = byteArrayInputStream.read(bArr2);
                if (i2 == -1) {
                    return i;
                }
                fileOutputStream.write(bArr2, 0, i2);
                i += i2;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }

    /* renamed from: a */
    private static void m12256a(File file) {
        if (file != null) {
            deleteFolder(m12259b(file).getPath());
        }
    }

    /* renamed from: b */
    private static File m12259b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        return new File(OooO00o.OooOOO0(sb, str, f11854a, str));
    }

    /* renamed from: c */
    private static Object m12261c(File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), m12261c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static boolean m12257a() {
        C3782vu c3782vu;
        return Build.VERSION.SDK_INT > 29 && (c3782vu = f11855b) != null && c3782vu.m12820a();
    }
}
