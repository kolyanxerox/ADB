package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class oO0O0O00 implements oOo0000O {

    /* renamed from: OooO, reason: collision with root package name */
    public int f22612OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f22613OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f22614OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r40 f22615OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OOo0 f22616OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f22617OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public o000O f22618OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o0OoOo0 f22619OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f22620OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f22621OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f22622OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f22623OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public boolean f22624OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f22625OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public int f22626OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public long f22627OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public boolean f22628OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public int f22629OooOOoo;
    public int OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public long f22630OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public String f22631OooOo0O;

    public oO0O0O00(String str, int i) {
        this.f22613OooO00o = str;
        this.f22614OooO0O0 = i;
        r40 r40Var = new r40(1024);
        this.f22615OooO0OO = r40Var;
        byte[] bArr = r40Var.f23745OooO00o;
        this.f22616OooO0Oo = new o000OOo0(bArr, bArr.length);
        this.OooOO0o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0O0(r40 r40Var) throws C2185w6 {
        int iOooO0o;
        int i;
        int iOooO0o2;
        boolean zOooOo0o;
        int i2;
        af0.OooOo0O(this.f22618OooO0o0);
        while (r40Var.OooOOOO() > 0) {
            int i3 = this.f22620OooO0oo;
            if (i3 != 0) {
                if (i3 != 1) {
                    o000OOo0 o000ooo02 = this.f22616OooO0Oo;
                    r40 r40Var2 = this.f22615OooO0OO;
                    if (i3 != 2) {
                        int iMin = Math.min(r40Var.OooOOOO(), this.f22621OooOO0 - this.f22612OooO);
                        r40Var.OooO0o(o000ooo02.f21725OooO0O0, this.f22612OooO, iMin);
                        int i4 = this.f22612OooO + iMin;
                        this.f22612OooO = i4;
                        if (i4 == this.f22621OooOO0) {
                            o000ooo02.OooOOoo(0);
                            if (o000ooo02.OooOo0o()) {
                                if (this.f22624OooOOO0) {
                                }
                                this.f22620OooO0oo = 0;
                            } else {
                                this.f22624OooOOO0 = true;
                                int iOooO0o3 = o000ooo02.OooO0o(1);
                                if (iOooO0o3 == 1) {
                                    iOooO0o2 = o000ooo02.OooO0o(1);
                                    i = 1;
                                } else {
                                    i = iOooO0o3;
                                    iOooO0o2 = 0;
                                }
                                this.f22623OooOOO = iOooO0o2;
                                if (iOooO0o2 != 0) {
                                    throw C2185w6.OooO00o(null, null);
                                }
                                if (i == 1) {
                                    o000ooo02.OooO0o((o000ooo02.OooO0o(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!o000ooo02.OooOo0o()) {
                                    throw C2185w6.OooO00o(null, null);
                                }
                                this.f22625OooOOOO = o000ooo02.OooO0o(6);
                                int iOooO0o4 = o000ooo02.OooO0o(4);
                                int iOooO0o5 = o000ooo02.OooO0o(3);
                                if (iOooO0o4 != 0 || iOooO0o5 != 0) {
                                    throw C2185w6.OooO00o(null, null);
                                }
                                if (i == 0) {
                                    int i5 = (o000ooo02.f21726OooO0OO * 8) + o000ooo02.f21727OooO0Oo;
                                    int iOooO00o = o000ooo02.OooO00o();
                                    oo000o oo000oVarOooO0Oo = AbstractC1641hg.OooO0Oo(o000ooo02, true);
                                    this.f22631OooOo0O = oo000oVarOooO0Oo.f23023OooO00o;
                                    this.f22629OooOOoo = oo000oVarOooO0Oo.f23024OooO0O0;
                                    this.OooOo0 = oo000oVarOooO0Oo.f23025OooO0OO;
                                    int iOooO00o2 = iOooO00o - o000ooo02.OooO00o();
                                    o000ooo02.OooOOoo(i5);
                                    byte[] bArr = new byte[(iOooO00o2 + 7) / 8];
                                    o000ooo02.OooOOO0(iOooO00o2, bArr);
                                    jb1 jb1Var = new jb1();
                                    jb1Var.f20241OooO00o = this.f22617OooO0o;
                                    jb1Var.OooO0OO("audio/mp4a-latm");
                                    jb1Var.f20240OooO = this.f22631OooOo0O;
                                    jb1Var.f20264OooOoOO = this.OooOo0;
                                    jb1Var.f20266OooOoo0 = this.f22629OooOOoo;
                                    jb1Var.f20253OooOOOO = Collections.singletonList(bArr);
                                    jb1Var.f20244OooO0Oo = this.f22613OooO00o;
                                    jb1Var.f20245OooO0o = this.f22614OooO0O0;
                                    o0OoOo0 o0oooo0 = new o0OoOo0(jb1Var);
                                    if (!o0oooo0.equals(this.f22619OooO0oO)) {
                                        this.f22619OooO0oO = o0oooo0;
                                        this.f22630OooOo00 = 1024000000 / o0oooo0.f22235OooOoo;
                                        this.f22618OooO0o0.OooO0o0(o0oooo0);
                                    }
                                } else {
                                    int iOooO00o3 = o000ooo02.OooO00o();
                                    oo000o oo000oVarOooO0Oo2 = AbstractC1641hg.OooO0Oo(o000ooo02, true);
                                    this.f22631OooOo0O = oo000oVarOooO0Oo2.f23023OooO00o;
                                    this.f22629OooOOoo = oo000oVarOooO0Oo2.f23024OooO0O0;
                                    this.OooOo0 = oo000oVarOooO0Oo2.f23025OooO0OO;
                                    o000ooo02.OooOo0(o000ooo02.OooO0o((o000ooo02.OooO0o(2) + 1) * 8) - (iOooO00o3 - o000ooo02.OooO00o()));
                                }
                                int iOooO0o6 = o000ooo02.OooO0o(3);
                                this.f22626OooOOOo = iOooO0o6;
                                if (iOooO0o6 == 0) {
                                    o000ooo02.OooOo0(8);
                                } else if (iOooO0o6 == 1) {
                                    o000ooo02.OooOo0(9);
                                } else if (iOooO0o6 == 3 || iOooO0o6 == 4 || iOooO0o6 == 5) {
                                    o000ooo02.OooOo0(6);
                                } else {
                                    if (iOooO0o6 != 6 && iOooO0o6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    o000ooo02.OooOo0(1);
                                }
                                boolean zOooOo0o2 = o000ooo02.OooOo0o();
                                this.f22628OooOOo0 = zOooOo0o2;
                                this.f22627OooOOo = 0L;
                                if (zOooOo0o2) {
                                    if (i != 1) {
                                        do {
                                            zOooOo0o = o000ooo02.OooOo0o();
                                            this.f22627OooOOo = (this.f22627OooOOo << 8) + o000ooo02.OooO0o(8);
                                        } while (zOooOo0o);
                                    } else {
                                        this.f22627OooOOo = o000ooo02.OooO0o((o000ooo02.OooO0o(2) + 1) * 8);
                                    }
                                }
                                if (o000ooo02.OooOo0o()) {
                                    o000ooo02.OooOo0(8);
                                }
                            }
                            if (this.f22623OooOOO != 0) {
                                throw C2185w6.OooO00o(null, null);
                            }
                            if (this.f22625OooOOOO != 0) {
                                throw C2185w6.OooO00o(null, null);
                            }
                            if (this.f22626OooOOOo != 0) {
                                throw C2185w6.OooO00o(null, null);
                            }
                            int i6 = 0;
                            do {
                                iOooO0o = o000ooo02.OooO0o(8);
                                i6 += iOooO0o;
                            } while (iOooO0o == 255);
                            int i7 = (o000ooo02.f21726OooO0OO * 8) + o000ooo02.f21727OooO0Oo;
                            if ((i7 & 7) == 0) {
                                r40Var2.OooOO0(i7 >> 3);
                            } else {
                                o000ooo02.OooOOO0(i6 * 8, r40Var2.f23745OooO00o);
                                r40Var2.OooOO0(0);
                            }
                            this.f22618OooO0o0.OooO0Oo(i6, r40Var2);
                            af0.OooooO0(this.OooOO0o != -9223372036854775807L);
                            this.f22618OooO0o0.OooO00o(this.OooOO0o, 1, i6, 0, null);
                            this.OooOO0o += this.f22630OooOo00;
                            if (this.f22628OooOOo0) {
                                o000ooo02.OooOo0((int) this.f22627OooOOo);
                            }
                            this.f22620OooO0oo = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iOooOo0O = ((this.f22622OooOO0O & (-225)) << 8) | r40Var.OooOo0O();
                        this.f22621OooOO0 = iOooOo0O;
                        if (iOooOo0O > r40Var2.f23745OooO00o.length) {
                            r40Var2.OooO0oO(iOooOo0O);
                            byte[] bArr2 = r40Var2.f23745OooO00o;
                            int length = bArr2.length;
                            o000ooo02.f21725OooO0O0 = bArr2;
                            i2 = 0;
                            o000ooo02.f21726OooO0OO = 0;
                            o000ooo02.f21727OooO0Oo = 0;
                            o000ooo02.f21728OooO0o0 = length;
                        } else {
                            i2 = 0;
                        }
                        this.f22612OooO = i2;
                        this.f22620OooO0oo = 3;
                    }
                } else {
                    int iOooOo0O2 = r40Var.OooOo0O();
                    if ((iOooOo0O2 & 224) == 224) {
                        this.f22622OooOO0O = iOooOo0O2;
                        this.f22620OooO0oo = 2;
                    } else if (iOooOo0O2 != 86) {
                        this.f22620OooO0oo = 0;
                    }
                }
            } else if (r40Var.OooOo0O() == 86) {
                this.f22620OooO0oo = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        this.OooOO0o = j;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        ooo00o00.OooO00o();
        ooo00o00.OooO0O0();
        this.f22618OooO0o0 = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 1);
        ooo00o00.OooO0O0();
        this.f22617OooO0o = ooo00o00.f22887OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        this.f22620OooO0oo = 0;
        this.OooOO0o = -9223372036854775807L;
        this.f22624OooOOO0 = false;
    }
}
