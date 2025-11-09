package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o00O00 {

    /* renamed from: OooO */
    public int f21741OooO;

    /* renamed from: OooO00o */
    public final o000O f21742OooO00o;

    /* renamed from: OooO0O0 */
    public final int f21743OooO0O0;

    /* renamed from: OooO0OO */
    public final int f21744OooO0OO;

    /* renamed from: OooO0Oo */
    public final long f21745OooO0Oo;

    /* renamed from: OooO0o */
    public int f21746OooO0o;

    /* renamed from: OooO0o0 */
    public final int f21747OooO0o0;

    /* renamed from: OooO0oO */
    public int f21748OooO0oO;

    /* renamed from: OooO0oo */
    public int f21749OooO0oo;

    /* renamed from: OooOO0 */
    public int f21750OooOO0;

    /* renamed from: OooOO0O */
    public long f21751OooOO0O;
    public long[] OooOO0o;

    /* renamed from: OooOOO0 */
    public int[] f21752OooOOO0;

    public o00O00(int i, int i2, long j, int i3, o000O o000o) {
        i2 = i2 != 1 ? 2 : i2;
        this.f21745OooO0Oo = j;
        this.f21747OooO0o0 = i3;
        this.f21742OooO00o = o000o;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f21743OooO0O0 = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.f21744OooO0OO = i2 == 2 ? i4 | 1650720768 : -1;
        this.f21751OooOO0O = -1L;
        this.OooOO0o = new long[512];
        this.f21752OooOOO0 = new int[512];
    }

    public final o000Oo0 OooO00o(long j) {
        if (this.f21750OooOO0 == 0) {
            o000O00O o000o00o2 = new o000O00O(0L, this.f21751OooOO0O);
            return new o000Oo0(o000o00o2, o000o00o2);
        }
        int i = (int) (j / ((this.f21745OooO0Oo * 1) / this.f21747OooO0o0));
        int iOooO = i80.OooO(this.f21752OooOOO0, i, true, true);
        if (this.f21752OooOOO0[iOooO] == i) {
            o000O00O o000o00oOooO0O0 = OooO0O0(iOooO);
            return new o000Oo0(o000o00oOooO0O0, o000o00oOooO0O0);
        }
        o000O00O o000o00oOooO0O02 = OooO0O0(iOooO);
        int i2 = iOooO + 1;
        return i2 < this.OooOO0o.length ? new o000Oo0(o000o00oOooO0O02, OooO0O0(i2)) : new o000Oo0(o000o00oOooO0O02, o000o00oOooO0O02);
    }

    public final o000O00O OooO0O0(int i) {
        return new o000O00O(((this.f21745OooO0Oo * 1) / this.f21747OooO0o0) * this.f21752OooOOO0[i], this.OooOO0o[i]);
    }
}
