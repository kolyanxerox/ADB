package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oO0O0 implements oOo0000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final de0 f22540OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f22541OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o000O f22542OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public oO0O00oO f22543OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f22545OooO0o0;
    public long OooOO0o;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f22544OooO0o = new boolean[3];

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final oOo0o0oO f22546OooO0oO = new oOo0o0oO(32);

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final oOo0o0oO f22547OooO0oo = new oOo0o0oO(33);

    /* renamed from: OooO, reason: collision with root package name */
    public final oOo0o0oO f22539OooO = new oOo0o0oO(34);

    /* renamed from: OooOO0, reason: collision with root package name */
    public final oOo0o0oO f22548OooOO0 = new oOo0o0oO(39);

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final oOo0o0oO f22549OooOO0O = new oOo0o0oO(40);

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f22551OooOOO0 = -9223372036854775807L;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final r40 f22550OooOOO = new r40();

    public oO0O0(de0 de0Var) {
        this.f22540OooO00o = de0Var;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
        af0.OooOo0O(this.f22542OooO0OO);
        int i = i80.f19994OooO00o;
        if (z) {
            ((qi0) this.f22540OooO00o.f18243OooOoO0).OooO0O0(0);
            oO0O00oO oo0o00oo = this.f22543OooO0Oo;
            long j = this.OooOO0o;
            oo0o00oo.f22611OooOOO0 = oo0o00oo.f22603OooO0OO;
            oo0o00oo.OooO00o((int) (j - oo0o00oo.f22602OooO0O0));
            oo0o00oo.f22610OooOO0O = oo0o00oo.f22602OooO0O0;
            oo0o00oo.f22602OooO0O0 = j;
            oo0o00oo.OooO00o(0);
            oo0o00oo.f22600OooO = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0230  */
    @Override // com.google.android.gms.internal.ads.oOo0000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(com.google.android.gms.internal.ads.r40 r30) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0O0.OooO0O0(com.google.android.gms.internal.ads.r40):void");
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        this.f22551OooOOO0 = j;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        ooo00o00.OooO00o();
        ooo00o00.OooO0O0();
        this.f22541OooO0O0 = ooo00o00.f22887OooO0o0;
        ooo00o00.OooO0O0();
        o000O o000oOooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 2);
        this.f22542OooO0OO = o000oOooO0oO;
        this.f22543OooO0Oo = new oO0O00oO(o000oOooO0oO);
        this.f22540OooO00o.OooOO0o(o0000ooo, ooo00o00);
    }

    public final void OooO0o0(byte[] bArr, int i, int i2) {
        oO0O00oO oo0o00oo = this.f22543OooO0Oo;
        if (oo0o00oo.f22605OooO0o) {
            int i3 = oo0o00oo.f22604OooO0Oo;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                oo0o00oo.f22607OooO0oO = (bArr[i4] & 128) != 0;
                oo0o00oo.f22605OooO0o = false;
            } else {
                oo0o00oo.f22604OooO0Oo = (i2 - i) + i3;
            }
        }
        if (!this.f22545OooO0o0) {
            this.f22546OooO0oO.OooO0O0(bArr, i, i2);
            this.f22547OooO0oo.OooO0O0(bArr, i, i2);
            this.f22539OooO.OooO0O0(bArr, i, i2);
        }
        this.f22548OooOO0.OooO0O0(bArr, i, i2);
        this.f22549OooOO0O.OooO0O0(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        this.OooOO0o = 0L;
        this.f22551OooOOO0 = -9223372036854775807L;
        af0.Ooooooo(this.f22544OooO0o);
        this.f22546OooO0oO.OooO0OO();
        this.f22547OooO0oo.OooO0OO();
        this.f22539OooO.OooO0OO();
        this.f22548OooOO0.OooO0OO();
        this.f22549OooOO0O.OooO0OO();
        ((qi0) this.f22540OooO00o.f18243OooOoO0).OooO0O0(0);
        oO0O00oO oo0o00oo = this.f22543OooO0Oo;
        if (oo0o00oo != null) {
            oo0o00oo.f22605OooO0o = false;
            oo0o00oo.f22607OooO0oO = false;
            oo0o00oo.f22608OooO0oo = false;
            oo0o00oo.f22600OooO = false;
            oo0o00oo.f22609OooOO0 = false;
        }
    }
}
