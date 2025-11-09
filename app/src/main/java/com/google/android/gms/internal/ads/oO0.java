package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oO0 implements oOo0000O {

    /* renamed from: OooOOo0, reason: collision with root package name */
    public static final double[] f22372OooOOo0 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f22373OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f22374OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public o000O f22375OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C2249xx f22376OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final r40 f22377OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f22378OooO0o = new boolean[4];

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final oOo0o0oO f22379OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final oOo000o0 f22380OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f22381OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f22382OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f22383OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public long f22384OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f22385OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public boolean f22386OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f22387OooOOOo;

    public oO0(C2249xx c2249xx) {
        r40 r40Var;
        this.f22376OooO0OO = c2249xx;
        oOo000o0 ooo000o0 = new oOo000o0();
        ooo000o0.f22872OooO0Oo = new byte[128];
        this.f22380OooO0oO = ooo000o0;
        if (c2249xx != null) {
            this.f22379OooO0o0 = new oOo0o0oO(178);
            r40Var = new r40();
        } else {
            r40Var = null;
            this.f22379OooO0o0 = null;
        }
        this.f22377OooO0Oo = r40Var;
        this.OooOO0o = -9223372036854775807L;
        this.f22384OooOOO = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
        af0.OooOo0O(this.f22375OooO0O0);
        if (z) {
            boolean z2 = this.f22386OooOOOO;
            long j = this.f22381OooO0oo - this.f22385OooOOO0;
            this.f22375OooO0O0.OooO00o(this.f22384OooOOO, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    @Override // com.google.android.gms.internal.ads.oOo0000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(com.google.android.gms.internal.ads.r40 r29) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0.OooO0O0(com.google.android.gms.internal.ads.r40):void");
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        this.OooOO0o = j;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        ooo00o00.OooO00o();
        ooo00o00.OooO0O0();
        this.f22374OooO00o = ooo00o00.f22887OooO0o0;
        ooo00o00.OooO0O0();
        this.f22375OooO0O0 = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 2);
        C2249xx c2249xx = this.f22376OooO0OO;
        if (c2249xx != null) {
            c2249xx.OooO0oo(o0000ooo, ooo00o00);
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        af0.Ooooooo(this.f22378OooO0o);
        oOo000o0 ooo000o0 = this.f22380OooO0oO;
        ooo000o0.f22869OooO00o = false;
        ooo000o0.f22870OooO0O0 = 0;
        ooo000o0.f22871OooO0OO = 0;
        oOo0o0oO ooo0o0oo = this.f22379OooO0o0;
        if (ooo0o0oo != null) {
            ooo0o0oo.OooO0OO();
        }
        this.f22381OooO0oo = 0L;
        this.f22373OooO = false;
        this.OooOO0o = -9223372036854775807L;
        this.f22384OooOOO = -9223372036854775807L;
    }
}
