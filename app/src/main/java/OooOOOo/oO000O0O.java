package OoooOOO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO000O0O implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f14633OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14634OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ boolean f14635OooOo0o;

    public /* synthetic */ oO000O0O(Object obj, boolean z, int i) {
        this.f14634OooOo0O = i;
        this.f14633OooOo = obj;
        this.f14635OooOo0o = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00b3  */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f14634OooOo0O
            switch(r0) {
                case 0: goto L63;
                case 1: goto L59;
                case 2: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f14633OooOo
            com.google.android.gms.internal.ads.o00O0O r0 = (com.google.android.gms.internal.ads.o00O0O) r0
            r0.getClass()
            int r1 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            com.google.android.gms.internal.ads.t41 r0 = r0.f21768OooO0O0
            com.google.android.gms.internal.ads.w41 r0 = r0.f24239OooOo0O
            boolean r1 = r0.f25219Oooooo0
            boolean r2 = r9.f14635OooOo0o
            if (r1 != r2) goto L19
            goto L2c
        L19:
            r0.f25219Oooooo0 = r2
            com.google.android.gms.internal.ads.qv0 r1 = new com.google.android.gms.internal.ads.qv0
            r2 = 22
            r1.<init>(r2)
            r2 = 23
            com.google.android.gms.internal.ads.t00 r0 = r0.f25195Oooo00O
            r0.OooO0OO(r2, r1)
            r0.OooO0O0()
        L2c:
            return
        L2d:
            java.lang.Object r0 = r9.f14633OooOo
            com.google.android.gms.internal.ads.oy r0 = (com.google.android.gms.internal.ads.C1917oy) r0
            com.google.android.gms.internal.ads.w2 r1 = r0.OooOo0
            if (r1 != 0) goto L3b
            java.lang.String r0 = "Ad should be associated with an ad view before calling recordCustomClickGesture()"
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)
            goto L58
        L3b:
            android.view.View r3 = r1.zzf()
            com.google.android.gms.internal.ads.w2 r1 = r0.OooOo0
            java.util.Map r4 = r1.zzl()
            com.google.android.gms.internal.ads.w2 r1 = r0.OooOo0
            java.util.Map r5 = r1.zzm()
            android.widget.ImageView$ScaleType r7 = r0.OooOO0()
            boolean r6 = r9.f14635OooOo0o
            r8 = 0
            com.google.android.gms.internal.ads.vy r1 = r0.OooOO0o
            r2 = 0
            r1.OooO0o(r2, r3, r4, r5, r6, r7, r8)
        L58:
            return
        L59:
            java.lang.Object r0 = r9.f14633OooOo
            com.google.android.gms.internal.ads.qg r0 = (com.google.android.gms.internal.ads.C1973qg) r0
            boolean r1 = r9.f14635OooOo0o
            r0.OooOOoo(r1)
            return
        L63:
            java.lang.Object r0 = r9.f14633OooOo
            OoooOOO.oO0O0OoO r0 = (OoooOOO.oO0O0OoO) r0
            java.lang.Object r1 = r0.f14574OooOo0O
            OoooOOO.o0OO0oO0 r1 = (OoooOOO.o0OO0oO0) r1
            boolean r2 = r1.OooO0o()
            java.lang.Boolean r3 = r1.f14536OoooO
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L7f
            java.lang.Boolean r3 = r1.f14536OoooO
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L7f
            r3 = r5
            goto L80
        L7f:
            r3 = r4
        L80:
            boolean r6 = r9.f14635OooOo0o
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r1.f14536OoooO = r7
            if (r3 != r6) goto L9a
            OoooOOO.o0O0O0o0 r3 = r1.f14520OooOoOO
            OoooOOO.o0OO0oO0.OooOOO0(r3)
            OoooOOO.o0O0oo0o r3 = r3.f14398Oooo0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            java.lang.String r8 = "Default data collection state already set to"
            r3.OooO0OO(r7, r8)
        L9a:
            boolean r3 = r1.OooO0o()
            if (r3 == r2) goto Lb3
            boolean r3 = r1.OooO0o()
            java.lang.Boolean r7 = r1.f14536OoooO
            if (r7 == 0) goto Lb1
            java.lang.Boolean r7 = r1.f14536OoooO
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lb1
            r4 = r5
        Lb1:
            if (r3 == r4) goto Lc7
        Lb3:
            OoooOOO.o0O0O0o0 r1 = r1.f14520OooOoOO
            OoooOOO.o0OO0oO0.OooOOO0(r1)
            OoooOOO.o0O0oo0o r1 = r1.f14399Oooo000
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "Default data collection is different than actual status"
            r1.OooO0Oo(r3, r4, r2)
        Lc7:
            r0.OooOoo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO000O0O.run():void");
    }

    public oO000O0O(oO0O0OoO oo0o0ooo, boolean z) {
        this.f14634OooOo0O = 0;
        this.f14635OooOo0o = z;
        Objects.requireNonNull(oo0o0ooo);
        this.f14633OooOo = oo0o0ooo;
    }
}
