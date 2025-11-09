package OoooOo0;

import OooOooo.o000O0Oo;
import OooOooo.o000OO0O;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class o00000O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000O0Oo f14937OooO00o = o000O0Oo.f13671OooO0O0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f14938OooO0O0 = new Object();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static Method f14939OooO0OO = null;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f14940OooO0Oo = false;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0018, B:7:0x001d, B:14:0x0042, B:15:0x0047, B:17:0x0049, B:28:0x00a2, B:29:0x00a7, B:31:0x00a9, B:32:0x00b5, B:20:0x0052, B:22:0x0056, B:25:0x0090, B:12:0x002c), top: B:39:0x0018, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: all -> 0x0028, TryCatch #2 {, blocks: (B:4:0x0018, B:7:0x001d, B:14:0x0042, B:15:0x0047, B:17:0x0049, B:28:0x00a2, B:29:0x00a7, B:31:0x00a9, B:32:0x00b5, B:20:0x0052, B:22:0x0056, B:25:0x0090, B:12:0x002c), top: B:39:0x0018, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[Catch: all -> 0x0028, TryCatch #2 {, blocks: (B:4:0x0018, B:7:0x001d, B:14:0x0042, B:15:0x0047, B:17:0x0049, B:28:0x00a2, B:29:0x00a7, B:31:0x00a9, B:32:0x00b5, B:20:0x0052, B:22:0x0056, B:25:0x0090, B:12:0x002c), top: B:39:0x0018, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO00o(android.content.Context r12) throws OooOooo.o000O0O0, OooOooo.o000OO0O {
        /*
            r0 = 1
            r1 = 11
            r2 = 0
            java.lang.String r3 = "Context must not be null"
            Oooo00O.o000000O.OooO(r12, r3)
            OooOooo.o000O0Oo r3 = OoooOo0.o00000O0.f14937OooO00o
            r3.getClass()
            OooOooo.o000O0Oo.OooO0Oo(r12)
            long r3 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r5 = OoooOo0.o00000O0.f14938OooO0O0
            monitor-enter(r5)
            boolean r6 = OoooOo0.o00000O0.f14940OooO0Oo     // Catch: java.lang.Throwable -> L28
            r7 = 0
            if (r6 != 0) goto L49
            o000000.OooO r6 = Oooo0oO.o000000.f13871OooO0o0     // Catch: java.lang.Throwable -> L28 Oooo0oO.o0OO00O -> L2b
            java.lang.String r8 = "com.google.android.gms.providerinstaller.dynamite"
            Oooo0oO.o000000 r6 = Oooo0oO.o000000.OooO0OO(r12, r6, r8)     // Catch: java.lang.Throwable -> L28 Oooo0oO.o0OO00O -> L2b
            android.content.Context r6 = r6.f13879OooO00o     // Catch: java.lang.Throwable -> L28 Oooo0oO.o0OO00O -> L2b
            goto L40
        L28:
            r12 = move-exception
            goto Lb6
        L2b:
            r6 = move-exception
            java.lang.String r8 = "ProviderInstaller"
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = "Failed to load providerinstaller module: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r9.concat(r6)     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r8, r6)     // Catch: java.lang.Throwable -> L28
            r6 = r7
        L40:
            if (r6 == 0) goto L49
            java.lang.String r12 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            OooO0O0(r6, r12)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            goto La8
        L49:
            boolean r6 = OoooOo0.o00000O0.f14940OooO0Oo     // Catch: java.lang.Throwable -> L28
            android.content.Context r8 = OooOooo.o000O.OooO00o(r12)     // Catch: java.lang.Throwable -> L28
            if (r8 != 0) goto L52
            goto La0
        L52:
            OoooOo0.o00000O0.f14940OooO0Oo = r0     // Catch: java.lang.Throwable -> L28
            if (r6 != 0) goto L9f
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            java.lang.ClassLoader r9 = r8.getClassLoader()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            OooO0oO.OooOOO0 r11 = new OooO0oO.OooOOO0     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            r11.<init>(r10, r2, r12, r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            OoooO0.OooOOO0 r12 = new OoooO0.OooOOO0     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            r12.<init>(r4, r2, r3, r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            OoooO0.OooOOO0 r3 = new OoooO0.OooOOO0     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            r3.<init>(r4, r2, r6, r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            r1 = 3
            OooO0oO.OooOOO0[] r1 = new OooO0oO.OooOOO0[r1]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            r1[r2] = r11     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            r1[r0] = r12     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            r12 = 2
            r1[r12] = r3     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            java.lang.String r12 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.Class r12 = r9.loadClass(r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            java.lang.String r0 = "reportRequestStats2"
            OooO00o.OooO00o.OooOoo0(r12, r0, r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L8f
            goto L9f
        L8f:
            r12 = move-exception
            java.lang.String r0 = "ProviderInstaller"
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "Failed to report request stats: "
            java.lang.String r12 = r1.concat(r12)     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r0, r12)     // Catch: java.lang.Throwable -> L28
        L9f:
            r7 = r8
        La0:
            if (r7 == 0) goto La9
            java.lang.String r12 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            OooO0O0(r7, r12)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
        La8:
            return
        La9:
            java.lang.String r12 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r12, r0)     // Catch: java.lang.Throwable -> L28
            OooOooo.o000OO0O r12 = new OooOooo.o000OO0O     // Catch: java.lang.Throwable -> L28
            r12.<init>()     // Catch: java.lang.Throwable -> L28
            throw r12     // Catch: java.lang.Throwable -> L28
        Lb6:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOo0.o00000O0.OooO00o(android.content.Context):void");
    }

    public static void OooO0O0(Context context, String str) throws IllegalAccessException, IllegalArgumentException, o000OO0O, InvocationTargetException {
        try {
            if (f14939OooO0OO == null) {
                f14939OooO0OO = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f14939OooO0OO.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new o000OO0O();
        }
    }
}
