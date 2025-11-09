package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3007ch;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.android.gms.internal.ads.hi */
/* loaded from: classes2.dex */
public final class C1643hi implements InterfaceC1680ii, InterfaceC2064sx {

    /* renamed from: Oooo0 */
    public static InterfaceC1680ii f19780Oooo0;

    /* renamed from: Oooo000 */
    public static final Object f19781Oooo000 = new Object();

    /* renamed from: Oooo00O */
    public static InterfaceC1680ii f19782Oooo00O;

    /* renamed from: Oooo00o */
    public static InterfaceC1680ii f19783Oooo00o;

    /* renamed from: Oooo0O0 */
    public static Boolean f19784Oooo0O0;

    /* renamed from: OooOo */
    public boolean f19785OooOo;

    /* renamed from: OooOo0O */
    public final Object f19786OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f19787OooOo0o;

    /* renamed from: OooOoO */
    public final Object f19788OooOoO;

    /* renamed from: OooOoO0 */
    public final Object f19789OooOoO0;

    /* renamed from: OooOoOO */
    public final Object f19790OooOoOO;

    /* renamed from: OooOoo */
    public Object f19791OooOoo;

    /* renamed from: OooOoo0 */
    public Object f19792OooOoo0;

    /* renamed from: OooOooO */
    public Object f19793OooOooO;

    /* renamed from: OooOooo */
    public Object f19794OooOooo;

    public C1643hi(Context context, VersionInfoParcel versionInfoParcel, C2274yl c2274yl, kd0 kd0Var, InterfaceC1722jo interfaceC1722jo, vd0 vd0Var, boolean z, C2116ub c2116ub, x50 x50Var, h20 h20Var) {
        this.f19786OooOo0O = context;
        this.f19787OooOo0o = versionInfoParcel;
        this.f19789OooOoO0 = c2274yl;
        this.f19788OooOoO = kd0Var;
        this.f19790OooOoOO = interfaceC1722jo;
        this.f19792OooOoo0 = vd0Var;
        this.f19791OooOoo = c2116ub;
        this.f19785OooOo = z;
        this.f19793OooOooO = x50Var;
        this.f19794OooOooo = h20Var;
    }

    public static InterfaceC1680ii OooO0OO(Context context) {
        synchronized (f19781Oooo000) {
            try {
                if (f19782Oooo00O == null) {
                    if (OooOO0o(context)) {
                        f19782Oooo00O = new C1643hi(context, VersionInfoParcel.forPackage());
                    } else {
                        f19782Oooo00O = new C2007rd(9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f19782Oooo00O;
    }

    public static InterfaceC1680ii OooO0Oo(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (f19781Oooo000) {
            try {
                if (f19780Oooo0 == null) {
                    boolean z = false;
                    if (((Boolean) AbstractC1413b8.f17434OooO0OO.OooOOO()).booleanValue()) {
                        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0)).booleanValue() || ((Boolean) AbstractC1413b8.f17432OooO00o.OooOOO()).booleanValue()) {
                            z = true;
                        }
                    }
                    if (OooOO0o(context)) {
                        C1643hi c1643hi = new C1643hi(context, versionInfoParcel);
                        c1643hi.OooOO0O();
                        Thread.setDefaultUncaughtExceptionHandler(new C1606gi(c1643hi, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f19780Oooo0 = c1643hi;
                    } else if (!z || context == null) {
                        f19780Oooo0 = new C2007rd(9);
                    } else {
                        C1643hi c1643hi2 = new C1643hi(context, versionInfoParcel);
                        c1643hi2.f19785OooOo = true;
                        c1643hi2.OooOO0O();
                        Thread.setDefaultUncaughtExceptionHandler(new C1606gi(c1643hi2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f19780Oooo0 = c1643hi2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f19780Oooo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:25:0x0003, B:27:0x0007, B:29:0x0019, B:31:0x002b, B:34:0x0039, B:35:0x0042), top: B:40:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC1680ii OooO0o0(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C1643hi.f19781Oooo000
            monitor-enter(r0)
            com.google.android.gms.internal.ads.ii r1 = com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0O     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.OooO00o(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.OooO00o(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.hi r1 = new com.google.android.gms.internal.ads.hi     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o = r1     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r3 = move-exception
            goto L46
        L39:
            com.google.android.gms.internal.ads.rd r3 = new com.google.android.gms.internal.ads.rd     // Catch: java.lang.Throwable -> L37
            r1 = 9
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o = r3     // Catch: java.lang.Throwable -> L37
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.internal.ads.C1643hi.f19783Oooo00o
            return r3
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1643hi.OooO0o0(android.content.Context):com.google.android.gms.internal.ads.ii");
    }

    public static String OooO0oO(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooOO0o(android.content.Context r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L5
            goto L84
        L5:
            com.google.android.gms.internal.ads.v6 r5 = com.google.android.gms.internal.ads.AbstractC1448c7.o0o0O0oo
            com.google.android.gms.internal.ads.a7 r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r1.OooO00o(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1 = 1
            if (r5 != 0) goto L39
            com.google.android.gms.internal.ads.oOo0o00 r5 = com.google.android.gms.internal.ads.AbstractC1965q8.f23541OooO0o0
            java.lang.Object r5 = r5.OooOOO()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L84
            com.google.android.gms.internal.ads.v6 r5 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r2.OooO00o(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L84
            goto L83
        L39:
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1643hi.f19781Oooo000
            monitor-enter(r5)
            java.lang.Boolean r2 = com.google.android.gms.internal.ads.C1643hi.f19784Oooo0O0     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L68
            java.util.Random r2 = com.google.android.gms.ads.internal.client.zzbc.zze()     // Catch: java.lang.Throwable -> L66
            r3 = 100
            int r2 = r2.nextInt(r3)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.internal.ads.v6 r3 = com.google.android.gms.internal.ads.AbstractC1448c7.o0o0O0o0     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r4.OooO00o(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L66
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L66
            if (r2 >= r3) goto L5e
            r2 = r1
            goto L5f
        L5e:
            r2 = r0
        L5f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.internal.ads.C1643hi.f19784Oooo0O0 = r2     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r0 = move-exception
            goto L85
        L68:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L66
            java.lang.Boolean r5 = com.google.android.gms.internal.ads.C1643hi.f19784Oooo0O0
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L84
            com.google.android.gms.internal.ads.v6 r5 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r2.OooO00o(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L84
        L83:
            return r1
        L84:
            return r0
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L66
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1643hi.OooOO0o(android.content.Context):boolean");
    }

    public void OooO(AudioDeviceInfo audioDeviceInfo) {
        pd0 pd0Var = (pd0) this.f19791OooOoo;
        if (Objects.equals(audioDeviceInfo, pd0Var == null ? null : (AudioDeviceInfo) pd0Var.f23325OooOo0o)) {
            return;
        }
        pd0 pd0Var2 = audioDeviceInfo != null ? new pd0(audioDeviceInfo, 10) : null;
        this.f19791OooOoo = pd0Var2;
        OooOO0(q61.OooO0O0((Context) this.f19786OooOo0O, (j50) this.f19793OooOooO, pd0Var2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1680ii
    public void OooO00o(String str, Throwable th) {
        if (this.f19785OooOo) {
            return;
        }
        OooO0O0(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1680ii
    public void OooO0O0(Throwable th, String str, float f) {
        Throwable th2;
        boolean zOooO0Oo;
        String packageName;
        PackageInfo packageInfoOooO0OO;
        ActivityManager.MemoryInfo memoryInfoZzc;
        String strZzg;
        Context context = (Context) this.f19786OooOo0O;
        if (this.f19785OooOo) {
            return;
        }
        Handler handler = zzf.zza;
        if (((Boolean) AbstractC1965q8.f23540OooO0o.OooOOO()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17853o000oooO)).booleanValue() && stackTrace != null && stackTrace.length == 0 && zzf.zzo(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strOooO0oO = OooO0oO(th);
            String str2 = "";
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0ooo)).booleanValue() && (strZzg = zzf.zzg(OooO0oO(th))) != null) {
                str2 = strZzg;
            }
            double d = f;
            double dRandom = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (dRandom < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zOooO0Oo = Oooo0o0.OooOO0.OooO00o(context).OooO0Oo();
                } catch (Throwable th4) {
                    zzo.zzh("Error fetching instant app info", th4);
                    zOooO0Oo = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    zzo.zzj("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zOooO0Oo)).appendQueryParameter(C3007ch.f7763x, "gmob-apps-report-exception").appendQueryParameter(C3451ne.f10411E, Build.VERSION.RELEASE);
                int i2 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i2));
                String str3 = Build.MANUFACTURER;
                String strOooOoo = Build.MODEL;
                if (!strOooOoo.startsWith(str3)) {
                    strOooOoo = OooO0oO.OooOo.OooOoo(str3, StringUtils.SPACE, strOooOoo);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter(C3034d9.h.f8068G, strOooOoo);
                VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f19787OooOo0o;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strOooO0oO).appendQueryParameter("eids", TextUtils.join(",", zzbe.zza().OooO00o())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(AbstractC1965q8.f23538OooO0OO.OooOOO()));
                OooOooo.o000O0Oo.f13671OooO0O0.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(OooOooo.o000O0Oo.OooO00o(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", str2);
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOo0O0)).booleanValue() && (memoryInfoZzc = zzf.zzc(context)) != null) {
                    builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfoZzc.availMem));
                    builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfoZzc.totalMem));
                    builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfoZzc.lowMemory ? "0" : "1");
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0o)).booleanValue()) {
                    String str4 = (String) this.f19791OooOoo;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = (String) this.f19793OooOooO;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str5);
                    }
                    if (i2 >= 26) {
                        packageInfoOooO0OO = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoOooO0OO = null;
                    } else {
                        try {
                            packageInfoOooO0OO = Oooo0o0.OooOO0.OooO00o(context).OooO0OO(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfoOooO0OO != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfoOooO0OO.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfoOooO0OO.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfoOooO0OO.packageName);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f19792OooOoo0;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    ((ExecutorService) this.f19790OooOoOO).execute(new wp0(9, new zzu(null), (String) obj));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) {
        float f;
        AbstractC1805lx abstractC1805lx = (AbstractC1805lx) ii0.o00o0O((C2274yl) this.f19789OooOoO0);
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f19790OooOoOO;
        interfaceC1722jo.o00O0O(true);
        C2116ub c2116ub = (C2116ub) this.f19791OooOoo;
        boolean z2 = this.f19785OooOo;
        boolean z3 = false;
        boolean zOooO00o = z2 ? c2116ub.OooO00o(false) : false;
        zzv.zzq();
        boolean zZzJ = zzs.zzJ((Context) this.f19786OooOo0O);
        if (z2) {
            synchronized (c2116ub) {
                z3 = c2116ub.f24617OooO0O0;
            }
        }
        if (z2) {
            synchronized (c2116ub) {
                f = c2116ub.f24618OooO0OO;
            }
        } else {
            f = 0.0f;
        }
        kd0 kd0Var = (kd0) this.f19788OooOoO;
        zzl zzlVar = new zzl(zOooO00o, zZzJ, z3, f, -1, z, kd0Var.f20525Oooo0oo, false);
        if (c2246xu != null) {
            c2246xu.zzf();
        }
        zzv.zzj();
        C1953px c1953px = (C1953px) ((C1431bq) abstractC1805lx).f17581OoooO0O.zzb();
        int i = kd0Var.f20528OoooO00;
        od0 od0Var = kd0Var.f20503OooOOoo;
        zzn.zza(context, new AdOverlayInfoParcel(null, c1953px, null, (InterfaceC1722jo) this.f19790OooOoOO, i, (VersionInfoParcel) this.f19787OooOo0o, kd0Var.f20512OooOoo0, zzlVar, od0Var.f22974OooO0O0, od0Var.f22973OooO00o, ((vd0) this.f19792OooOoo0).f24955OooO0o, c2246xu, kd0Var.OooO0O0() ? (x50) this.f19793OooOooO : null, interfaceC1722jo.zzr()), true, (h20) this.f19794OooOooo);
    }

    public void OooO0oo(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zZzo = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzo |= zzf.zzo(stackTraceElement.getClassName());
                    zEquals |= C1643hi.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzo || zEquals) {
                return;
            }
            if (!this.f19785OooOo) {
                OooO00o("", th);
            }
            if (((AtomicBoolean) this.f19794OooOooo).getAndSet(true) || !((Boolean) AbstractC1413b8.f17434OooO0OO.OooOOO()).booleanValue() || (sharedPreferences = (context = (Context) this.f19786OooOo0O).getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", af0.OoooOo0(context, "crash_without_write") + 1).commit();
        }
    }

    public void OooOO0(q61 q61Var) {
        xa1 xa1Var;
        if (!this.f19785OooOo || q61Var.equals((q61) this.f19792OooOoo0)) {
            return;
        }
        this.f19792OooOoo0 = q61Var;
        h71 h71Var = (h71) ((rh0) this.f19794OooOooo).f23865OooOo0O;
        h71Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = h71Var.f19631OoooO;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(OooO0oO.OooOo.OooOO0o("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (q61Var.equals(h71Var.f19607OooOOo0)) {
            return;
        }
        h71Var.f19607OooOOo0 = q61Var;
        ni0 ni0Var = h71Var.OooOO0o;
        if (ni0Var != null) {
            i71 i71Var = (i71) ni0Var.f21493OooOo0o;
            synchronized (i71Var.f18817OooOo0O) {
                xa1Var = i71Var.f18834Oooo0o0;
            }
            if (xa1Var != null) {
                synchronized (xa1Var.f25588OooO0OO) {
                    xa1Var.f25590OooO0o.getClass();
                }
            }
        }
    }

    public void OooOO0O() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f19789OooOoO0) {
            ((WeakHashMap) this.f19788OooOoO).put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C1606gi(this, thread.getUncaughtExceptionHandler(), 1));
    }

    public void OooOOO0(Runnable runnable) {
        ((Handler) ((il0) this.f19789OooOoO0).mo13704zza()).post(new qk0(this, runnable, 0));
    }

    public C1643hi() {
        this.f19789OooOoO0 = new HashMap();
        this.f19786OooOo0O = new HashMap();
        this.f19790OooOoOO = new HashMap();
        this.f19787OooOo0o = new HashSet();
        this.f19792OooOoo0 = new HashSet();
        this.f19791OooOoo = new HashSet();
        this.f19793OooOooO = new HashMap();
        this.f19794OooOooo = new HashSet();
        this.f19788OooOoO = new WeakHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1643hi(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f19789OooOoO0 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f19788OooOoO = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.f19790OooOoOO = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f19794OooOooo = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2c
            android.content.Context r3 = r3.getApplicationContext()
        L2c:
            r2.f19786OooOo0O = r3
            r2.f19787OooOo0o = r4
            com.google.android.gms.internal.ads.v6 r4 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0oO
            com.google.android.gms.internal.ads.a7 r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.OooO00o(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L4d
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L4d
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L4f
        L4d:
            r3 = r0
            goto L5e
        L4f:
            OooOOo0.Oooo000 r4 = Oooo0o0.OooOO0.OooO00o(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.OooO0OO(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L5e:
            r2.f19792OooOoo0 = r3
            com.google.android.gms.internal.ads.v6 r3 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0o0o
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.OooO00o(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L7d
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L7e
        L7d:
            r4 = r1
        L7e:
            r2.f19791OooOoo = r4
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.OooO00o(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r2.f19786OooOo0O
            android.content.Context r3 = (android.content.Context) r3
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L99
            goto Lb0
        L99:
            OooOOo0.Oooo000 r3 = Oooo0o0.OooOO0.OooO00o(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.OooO0OO(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            if (r3 != 0) goto La8
            goto Lb0
        La8:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            goto Lb0
        Laf:
            r0 = r1
        Lb0:
            r2.f19793OooOooO = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1643hi.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public C1643hi(Context context, rh0 rh0Var, j50 j50Var, pd0 pd0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f19786OooOo0O = applicationContext;
        this.f19794OooOooo = rh0Var;
        this.f19793OooOooO = j50Var;
        this.f19791OooOoo = pd0Var;
        int i = i80.f19994OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f19789OooOoO0 = handler;
        this.f19788OooOoO = i80.f19994OooO00o >= 23 ? new r61(this) : null;
        this.f19790OooOoOO = new C2291z1(this, 3);
        q61 q61Var = q61.f23514OooO0OO;
        String str = i80.f19996OooO0OO;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f19787OooOo0o = uriFor != null ? new s61(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public C1643hi(Context context, or0 or0Var, Intent intent) {
        this.f19790OooOoOO = new ArrayList();
        this.f19786OooOo0O = context;
        this.f19788OooOoO = or0Var;
        this.f19791OooOoo = "OverlayDisplayService";
        this.f19787OooOo0o = intent;
        this.f19789OooOoO0 = ii0.OooO0oO(new C1658hx(29, (byte) 0));
        this.f19792OooOoo0 = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.pk0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C1643hi c1643hi = this.f23364OooO00o;
                ((or0) c1643hi.f19788OooOoO).OooO0OO("%s : Binder has died.", (String) c1643hi.f19791OooOoo);
                synchronized (((ArrayList) c1643hi.f19790OooOoOO)) {
                    ((ArrayList) c1643hi.f19790OooOoOO).clear();
                }
            }
        };
    }
}
