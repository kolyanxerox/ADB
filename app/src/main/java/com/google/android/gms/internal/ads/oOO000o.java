package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class oOO000o implements oOO000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final v91 f22777OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000O f22778OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0OOOo f22779OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OoOo0 f22780OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f22781OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f22782OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f22783OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f22784OooO0oo;

    public oOO000o(v91 v91Var, o000O o000o, o0O0OOOo o0o0oooo, String str, int i) throws C2185w6 {
        this.f22777OooO00o = v91Var;
        this.f22778OooO0O0 = o000o;
        this.f22779OooO0OO = o0o0oooo;
        int i2 = o0o0oooo.f21969OooOoO0;
        int i3 = o0o0oooo.f21966OooOo0O;
        int i4 = (i2 * i3) / 8;
        int i5 = o0o0oooo.f21965OooOo;
        if (i5 != i4) {
            throw C2185w6.OooO00o(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = o0o0oooo.f21967OooOo0o;
        int i7 = i6 * i4;
        int i8 = i7 * 8;
        int iMax = Math.max(i4, i7 / 10);
        this.f22782OooO0o0 = iMax;
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO(str);
        jb1Var.f20247OooO0oO = i8;
        jb1Var.f20248OooO0oo = i8;
        jb1Var.f20252OooOOO0 = iMax;
        jb1Var.f20264OooOoOO = i3;
        jb1Var.f20266OooOoo0 = i6;
        jb1Var.f20265OooOoo = i;
        this.f22780OooO0Oo = new o0OoOo0(jb1Var);
    }

    @Override // com.google.android.gms.internal.ads.oOO000
    public final void OooO00o(long j) {
        this.f22781OooO0o = j;
        this.f22783OooO0oO = 0;
        this.f22784OooO0oo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.oOO000
    public final boolean OooO0O0(o000000 o000000Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f22783OooO0oO) < (i2 = this.f22782OooO0o0)) {
            int iOooO0OO = this.f22778OooO0O0.OooO0OO(o000000Var, (int) Math.min(i2 - i, j2), true);
            if (iOooO0OO == -1) {
                j2 = 0;
            } else {
                this.f22783OooO0oO += iOooO0OO;
                j2 -= iOooO0OO;
            }
        }
        int i3 = this.f22783OooO0oO;
        int i4 = this.f22779OooO0OO.f21965OooOo;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jOooOo0 = this.f22781OooO0o + i80.OooOo0(this.f22784OooO0oo, 1000000L, r2.f21967OooOo0o, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.f22783OooO0oO - i6;
            this.f22778OooO0O0.OooO00o(jOooOo0, 1, i6, i7, null);
            this.f22784OooO0oo += i5;
            this.f22783OooO0oO = i7;
        }
        return j2 <= 0;
    }

    @Override // com.google.android.gms.internal.ads.oOO000
    public final void zza(int i, long j) {
        this.f22777OooO00o.OooO(new oOO00OO(this.f22779OooO0OO, 1, i, j));
        this.f22778OooO0O0.OooO0o0(this.f22780OooO0Oo);
    }
}
