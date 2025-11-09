package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oO00o0 implements oOo0000O {

    /* renamed from: OooO, reason: collision with root package name */
    public int f22510OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f22511OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo0 f22512OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r40 f22513OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f22514OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f22515OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f22516OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o000O f22517OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f22518OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f22519OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f22520OooOO0O;
    public o0OoOo0 OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public long f22521OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f22522OooOOO0;

    public oO00o0(String str, int i, int i2) {
        this.f22511OooO00o = i2;
        switch (i2) {
            case 1:
                o000OOo0 o000ooo02 = new o000OOo0(new byte[16], 16);
                this.f22512OooO0O0 = o000ooo02;
                this.f22513OooO0OO = new r40(o000ooo02.f21725OooO0O0);
                this.f22518OooO0oo = 0;
                this.f22510OooO = 0;
                this.f22519OooOO0 = false;
                this.f22521OooOOO = -9223372036854775807L;
                this.f22514OooO0Oo = str;
                this.f22516OooO0o0 = i;
                break;
            default:
                o000OOo0 o000ooo03 = new o000OOo0(new byte[128], 128);
                this.f22512OooO0O0 = o000ooo03;
                this.f22513OooO0OO = new r40(o000ooo03.f21725OooO0O0);
                this.f22518OooO0oo = 0;
                this.f22521OooOOO = -9223372036854775807L;
                this.f22514OooO0Oo = str;
                this.f22516OooO0o0 = i;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
        int i = this.f22511OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cf  */
    @Override // com.google.android.gms.internal.ads.oOo0000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(com.google.android.gms.internal.ads.r40 r25) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO00o0.OooO0O0(com.google.android.gms.internal.ads.r40):void");
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        switch (this.f22511OooO00o) {
            case 0:
                this.f22521OooOOO = j;
                break;
            default:
                this.f22521OooOOO = j;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        switch (this.f22511OooO00o) {
            case 0:
                ooo00o00.OooO00o();
                ooo00o00.OooO0O0();
                this.f22515OooO0o = ooo00o00.f22887OooO0o0;
                ooo00o00.OooO0O0();
                this.f22517OooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 1);
                break;
            default:
                ooo00o00.OooO00o();
                ooo00o00.OooO0O0();
                this.f22515OooO0o = ooo00o00.f22887OooO0o0;
                ooo00o00.OooO0O0();
                this.f22517OooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 1);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        switch (this.f22511OooO00o) {
            case 0:
                this.f22518OooO0oo = 0;
                this.f22510OooO = 0;
                this.f22519OooOO0 = false;
                this.f22521OooOOO = -9223372036854775807L;
                break;
            default:
                this.f22518OooO0oo = 0;
                this.f22510OooO = 0;
                this.f22519OooOO0 = false;
                this.f22521OooOOO = -9223372036854775807L;
                break;
        }
    }

    private final void OooO0o(boolean z) {
    }

    private final void OooO0o0(boolean z) {
    }
}
