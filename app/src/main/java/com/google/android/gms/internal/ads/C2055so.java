package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.so */
/* loaded from: classes2.dex */
public final class C2055so {
    public static final InterfaceC1722jo OooO00o(final Oooo0oO.o0O0O00 o0o0o00, final Context context, final VersionInfoParcel versionInfoParcel, final zza zzaVar, final C1663i1 c1663i1, final C1998r4 c1998r4, final C2075t7 c2075t7, final x50 x50Var, final kd0 kd0Var, final md0 md0Var, final xd0 xd0Var, final wj0 wj0Var, final String str, final boolean z, final boolean z2) {
        AbstractC1448c7.OooO00o(context);
        try {
            il0 il0Var = new il0() { // from class: com.google.android.gms.internal.ads.po
                @Override // com.google.android.gms.internal.ads.il0
                /* renamed from: zza */
                public final Object mo13704zza() {
                    Oooo0oO.o0O0O00 o0o0o002 = o0o0o00;
                    String str2 = str;
                    boolean z3 = z;
                    C1998r4 c1998r42 = c1998r4;
                    boolean z4 = z2;
                    C1663i1 c1663i12 = c1663i1;
                    kd0 kd0Var2 = kd0Var;
                    C2075t7 c2075t72 = c2075t7;
                    wj0 wj0Var2 = wj0Var;
                    md0 md0Var2 = md0Var;
                    Context context2 = context;
                    VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
                    zza zzaVar2 = zzaVar;
                    xd0 xd0Var2 = xd0Var;
                    x50 x50Var2 = x50Var;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = ViewTreeObserverOnGlobalLayoutListenerC2166vo.f25025o00oO0O;
                        C1539ep c1539ep = new C1539ep(context2);
                        c1539ep.setBaseContext(context2);
                        C2129uo c2129uo = new C2129uo(new ViewTreeObserverOnGlobalLayoutListenerC2166vo(c1539ep, o0o0o002, str2, z3, c1663i12, c2075t72, versionInfoParcel2, wj0Var2, zzaVar2, c1998r42, kd0Var2, md0Var2, xd0Var2));
                        c2129uo.setWebViewClient(zzv.zzr().zzc(c2129uo, c1998r42, z4, x50Var2));
                        c2129uo.setWebChromeClient(new C1686io(c2129uo));
                        return c2129uo;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objMo13704zza = il0Var.mo13704zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC1722jo) objMo13704zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new C2018ro("Webview initialization failed.", th2);
        }
    }
}
