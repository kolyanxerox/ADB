package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class t60 implements InterfaceC2064sx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final kd0 f24245OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final VersionInfoParcel f24246OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2274yl f24247OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final vd0 f24248OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC1722jo f24249OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final C2116ub f24250OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final x50 f24251OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f24252OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final h20 f24253OooOooO;

    public t60(VersionInfoParcel versionInfoParcel, C2274yl c2274yl, kd0 kd0Var, InterfaceC1722jo interfaceC1722jo, vd0 vd0Var, boolean z, C2116ub c2116ub, x50 x50Var, h20 h20Var) {
        this.f24246OooOo0O = versionInfoParcel;
        this.f24247OooOo0o = c2274yl;
        this.f24245OooOo = kd0Var;
        this.f24249OooOoO0 = interfaceC1722jo;
        this.f24248OooOoO = vd0Var;
        this.f24252OooOoo0 = z;
        this.f24250OooOoOO = c2116ub;
        this.f24251OooOoo = x50Var;
        this.f24253OooOooO = h20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o(boolean r20, android.content.Context r21, com.google.android.gms.internal.ads.C2246xu r22) {
        /*
            r19 = this;
            r1 = r19
            com.google.android.gms.internal.ads.yl r0 = r1.f24247OooOo0o
            java.lang.Object r0 = com.google.android.gms.internal.ads.ii0.o00o0O(r0)
            com.google.android.gms.internal.ads.vr r0 = (com.google.android.gms.internal.ads.AbstractC2169vr) r0
            com.google.android.gms.internal.ads.jo r2 = r1.f24249OooOoO0
            r3 = 1
            r2.o00O0O(r3)
            com.google.android.gms.ads.internal.zzl r12 = new com.google.android.gms.ads.internal.zzl
            com.google.android.gms.internal.ads.ub r4 = r1.f24250OooOoOO
            boolean r5 = r1.f24252OooOoo0
            if (r5 == 0) goto L1d
            boolean r6 = r4.OooO00o(r3)
            goto L1e
        L1d:
            r6 = r3
        L1e:
            if (r5 == 0) goto L28
            monitor-enter(r4)
            boolean r7 = r4.f24617OooO0O0     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)
            goto L29
        L25:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r0
        L28:
            r7 = 0
        L29:
            if (r5 == 0) goto L34
            monitor-enter(r4)
            float r5 = r4.f24618OooO0OO     // Catch: java.lang.Throwable -> L31
            monitor-exit(r4)
        L2f:
            r8 = r5
            goto L36
        L31:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            throw r0
        L34:
            r5 = 0
            goto L2f
        L36:
            com.google.android.gms.internal.ads.kd0 r13 = r1.f24245OooOo
            boolean r11 = r13.f20525Oooo0oo
            r5 = r6
            r6 = 1
            r9 = -1
            r4 = r12
            r12 = 0
            r10 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r22 == 0) goto L49
            r22.zzf()
        L49:
            com.google.android.gms.ads.internal.zzv.zzj()
            r12 = r4
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.vp r0 = (com.google.android.gms.internal.ads.C2167vp) r0
            com.google.android.gms.internal.ads.p31 r0 = r0.f25108OoooO0O
            java.lang.Object r0 = r0.zzb()
            r6 = r0
            com.google.android.gms.internal.ads.px r6 = (com.google.android.gms.internal.ads.C1953px) r6
            int r0 = r13.f20528OoooO00
            com.google.android.gms.internal.ads.vd0 r5 = r1.f24248OooOoO
            r7 = -1
            if (r0 == r7) goto L63
        L61:
            r9 = r0
            goto L7a
        L63:
            com.google.android.gms.ads.internal.client.zzy r0 = r5.f24959OooOO0
            if (r0 == 0) goto L72
            int r0 = r0.zza
            if (r0 != r3) goto L6d
            r0 = 7
            goto L61
        L6d:
            r7 = 2
            if (r0 != r7) goto L72
            r0 = 6
            goto L61
        L72:
            java.lang.String r0 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)
            int r0 = r13.f20528OoooO00
            goto L61
        L7a:
            java.lang.String r11 = r13.f20512OooOoo0
            com.google.android.gms.internal.ads.od0 r0 = r13.f20503OooOOoo
            r7 = r13
            java.lang.String r13 = r0.f22974OooO0O0
            boolean r7 = r7.OooO0O0()
            if (r7 == 0) goto L8c
            com.google.android.gms.internal.ads.x50 r7 = r1.f24251OooOoo
        L89:
            r17 = r7
            goto L8e
        L8c:
            r7 = 0
            goto L89
        L8e:
            java.lang.String r15 = r5.f24955OooO0o
            java.lang.String r18 = r2.zzr()
            com.google.android.gms.internal.ads.jo r8 = r1.f24249OooOoO0
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10 = r1.f24246OooOo0O
            java.lang.String r14 = r0.f22973OooO00o
            r5 = 0
            r7 = 0
            r16 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.google.android.gms.internal.ads.h20 r0 = r1.f24253OooOooO
            r2 = r21
            com.google.android.gms.ads.internal.overlay.zzn.zza(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t60.OooO0o(boolean, android.content.Context, com.google.android.gms.internal.ads.xu):void");
    }
}
