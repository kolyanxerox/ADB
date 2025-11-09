package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oO0O00o0 implements oOo0000O {

    /* renamed from: OooO, reason: collision with root package name */
    public oO0O00O f22588OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final de0 f22589OooO00o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f22594OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public String f22595OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o000O f22596OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f22597OooOO0;
    public boolean OooOO0o;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f22593OooO0o = new boolean[3];

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final oOo0o0oO f22590OooO0O0 = new oOo0o0oO(7);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final oOo0o0oO f22591OooO0OO = new oOo0o0oO(8);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final oOo0o0oO f22592OooO0Oo = new oOo0o0oO(6);

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f22598OooOO0O = -9223372036854775807L;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final r40 f22599OooOOO0 = new r40();

    public oO0O00o0(de0 de0Var) {
        this.f22589OooO00o = de0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
        af0.OooOo0O(this.f22596OooO0oo);
        int i = i80.f19994OooO00o;
        if (z) {
            char c = 0;
            ((qi0) this.f22589OooO00o.f18243OooOoO0).OooO0O0(0);
            oO0O00O oo0o00o = this.f22588OooO;
            long j = this.f22594OooO0o0;
            boolean z2 = oo0o00o.f22587OooOO0O;
            boolean z3 = oo0o00o.f22586OooOO0;
            int i2 = oo0o00o.f22581OooO0Oo;
            if (i2 == 5 || (z2 && i2 == 1)) {
                c = 1;
            }
            boolean z4 = (z3 ? 1 : 0) | c;
            oo0o00o.f22586OooOO0 = z4;
            oo0o00o.f22583OooO0o0 = j;
            long j2 = oo0o00o.f22577OooO;
            if (j2 != -9223372036854775807L) {
                oo0o00o.f22578OooO00o.OooO00o(j2, z4 ? 1 : 0, (int) (j - oo0o00o.f22585OooO0oo), 0, null);
            }
            oo0o00o.f22584OooO0oO = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // com.google.android.gms.internal.ads.oOo0000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(com.google.android.gms.internal.ads.r40 r31) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0O00o0.OooO0O0(com.google.android.gms.internal.ads.r40):void");
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        this.f22598OooOO0O = j;
        int i2 = i & 2;
        this.OooOO0o = (i2 != 0) | this.OooOO0o;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        ooo00o00.OooO00o();
        ooo00o00.OooO0O0();
        this.f22595OooO0oO = ooo00o00.f22887OooO0o0;
        ooo00o00.OooO0O0();
        o000O o000oOooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 2);
        this.f22596OooO0oo = o000oOooO0oO;
        this.f22588OooO = new oO0O00O(o000oOooO0oO);
        this.f22589OooO00o.OooOO0o(o0000ooo, ooo00o00);
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        this.f22594OooO0o0 = 0L;
        this.OooOO0o = false;
        this.f22598OooOO0O = -9223372036854775807L;
        af0.Ooooooo(this.f22593OooO0o);
        this.f22590OooO0O0.OooO0OO();
        this.f22591OooO0OO.OooO0OO();
        this.f22592OooO0Oo.OooO0OO();
        ((qi0) this.f22589OooO00o.f18243OooOoO0).OooO0O0(0);
        oO0O00O oo0o00o = this.f22588OooO;
        if (oo0o00o != null) {
            oo0o00o.f22584OooO0oO = false;
        }
    }
}
