package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t90 implements kb0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f24274OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f24275OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f24276OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f24277OooO0Oo;

    public t90(C1978ql c1978ql, ScheduledExecutorService scheduledExecutorService, C2163vl c2163vl) {
        this.f24274OooO00o = 4;
        this.f24275OooO0O0 = c1978ql;
        this.f24277OooO0Oo = scheduledExecutorService;
        this.f24276OooO0OO = c2163vl;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o00000oO.OooOOO OooO00o() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f24277OooO0Oo
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r9.f24275OooO0O0
            android.content.pm.ApplicationInfo r1 = (android.content.pm.ApplicationInfo) r1
            java.lang.String r3 = r1.packageName
            r1 = 0
            java.lang.Object r2 = r9.f24276OooO0OO
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            if (r2 != 0) goto L13
            r4 = r1
            goto L19
        L13:
            int r4 = r2.versionCode
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L19:
            if (r2 != 0) goto L1d
            r5 = r1
            goto L20
        L1d:
            java.lang.String r2 = r2.versionName
            r5 = r2
        L20:
            com.google.android.gms.internal.ads.pj0 r2 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            OooOOo0.Oooo000 r2 = Oooo0o0.OooOO0.OooO00o(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            android.content.Context r2 = r2.f13505OooO00o     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            android.content.pm.PackageManager r6 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            r7 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            java.lang.CharSequence r2 = r6.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            r6 = r2
            goto L40
        L3f:
            r6 = r1
        L40:
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r2 < r7) goto L8e
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0o0O0oO
            com.google.android.gms.internal.ads.a7 r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r7.OooO00o(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8e
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            android.content.pm.InstallSourceInfo r0 = r0.getInstallSourceInfo(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            if (r0 == 0) goto L8e
            java.lang.String r2 = com.applovin.impl.sdk.OooOO0O.OooO0oO(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8a
            if (r7 == 0) goto L72
            java.lang.String r7 = "No installing package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8a
            r2 = r1
        L72:
            java.lang.String r7 = com.applovin.impl.sdk.OooOO0O.OooOO0O(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8a
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            if (r0 == 0) goto L86
            java.lang.String r0 = "No initiating package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
        L81:
            r8 = r1
        L82:
            r7 = r2
            goto L9c
        L84:
            r0 = move-exception
            goto L88
        L86:
            r8 = r7
            goto L82
        L88:
            r1 = r7
            goto L92
        L8a:
            r0 = move-exception
            goto L92
        L8c:
            r0 = move-exception
            goto L91
        L8e:
            r7 = r1
            r8 = r7
            goto L9c
        L91:
            r2 = r1
        L92:
            java.lang.String r7 = "PackageInfoSignalSource.getInstallSourceInfo"
            com.google.android.gms.internal.ads.ql r8 = com.google.android.gms.ads.internal.zzv.zzp()
            r8.OooO0oo(r7, r0)
            goto L81
        L9c:
            com.google.android.gms.internal.ads.ya0 r2 = new com.google.android.gms.internal.ads.ya0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.yp0 r0 = com.google.android.gms.internal.ads.ii0.OooooOO(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t90.OooO00o():o00000oO.OooOOO");
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        switch (this.f24274OooO00o) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            default:
                return 43;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        switch (this.f24274OooO00o) {
            case 0:
                C2094tq c2094tq = new C2094tq(9);
                o00000oO.OooOOO oooOOO = (o00000oO.OooOOO) this.f24275OooO0O0;
                cq0 cq0Var = (cq0) this.f24276OooO0OO;
                o00000oO.OooOOO oooOOOOoOO = ii0.ooOO(oooOOO, c2094tq, cq0Var);
                if (((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00oo)).intValue() > 0) {
                    oooOOOOoOO = ii0.o00Oo0(oooOOOOoOO, ((Integer) zzbe.zzc().OooO00o(r1)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f24277OooO0Oo);
                }
                return ii0.OoooOoO(oooOOOOoOO, Throwable.class, new C2094tq(10), cq0Var);
            case 1:
                return ((C2163vl) this.f24275OooO0O0).OooO0O0(new CallableC1736k1(this, 11));
            case 2:
                return OooO00o();
            case 3:
                return ((C2163vl) this.f24276OooO0OO).OooO0O0(new CallableC1736k1(this, 24));
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00O0Ooo)).booleanValue()) {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17881o00O0o0o)).booleanValue()) {
                        xj0 xj0VarOooO0o = ii0.OooO0o(Tasks.forResult(null));
                        C2094tq c2094tq2 = new C2094tq(13);
                        C2163vl c2163vl = (C2163vl) this.f24276OooO0OO;
                        o00000oO.OooOOO oooOOOOoOO2 = ii0.ooOO(xj0VarOooO0o, c2094tq2, c2163vl);
                        if (((Boolean) AbstractC2186w7.f25240OooO00o.OooOOO()).booleanValue()) {
                            oooOOOOoOO2 = ii0.o00Oo0(oooOOOOoOO2, ((Long) AbstractC2186w7.f25241OooO0O0.OooOOO()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f24277OooO0Oo);
                        }
                        return ii0.OoooOOO(oooOOOOoOO2, Exception.class, new C2123ui(this, 5), c2163vl);
                    }
                }
                return ii0.OooooOO(new da0(null, -1, 3));
        }
    }

    public /* synthetic */ t90(Object obj, Object obj2, Object obj3, int i) {
        this.f24274OooO00o = i;
        this.f24275OooO0O0 = obj;
        this.f24276OooO0OO = obj2;
        this.f24277OooO0Oo = obj3;
    }
}
