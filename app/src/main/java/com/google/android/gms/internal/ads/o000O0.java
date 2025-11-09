package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class o000O0 implements o00000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f21686OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f21687OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f21688OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f21689OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public v91 f21690OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21691OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o000O f21692OooO0oO;

    public o000O0(int i, int i2, String str) {
        this.f21686OooO00o = i;
        this.f21687OooO0O0 = i2;
        this.f21688OooO0OO = str;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        if (j == 0 || this.f21691OooO0o0 == 1) {
            this.f21691OooO0o0 = 1;
            this.f21689OooO0Oo = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        int i = this.f21687OooO0O0;
        int i2 = this.f21686OooO00o;
        af0.OooooO0((i2 == -1 || i == -1) ? false : true);
        r40 r40Var = new r40(i);
        ((o000000) o00000oo2).OooO0o(r40Var.f23745OooO00o, 0, i, false);
        return r40Var.OooOoO() == i2;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        v91 v91Var = (v91) o0000ooo;
        this.f21690OooO0o = v91Var;
        o000O o000oOooO0oO = v91Var.OooO0oO(1024, 4);
        this.f21692OooO0oO = o000oOooO0oO;
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO(this.f21688OooO0OO);
        o000oOooO0oO.OooO0o0(new o0OoOo0(jb1Var));
        this.f21690OooO0o.OooO0OO();
        this.f21690OooO0o.OooO(new o000O0Oo());
        this.f21691OooO0o0 = 1;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final int OooO0o0(o00000OO o00000oo2, o0000O00 o0000o00) {
        int i = this.f21691OooO0o0;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        o000O o000o = this.f21692OooO0oO;
        o000o.getClass();
        int iOooO0OO = o000o.OooO0OO(o00000oo2, 1024, true);
        if (iOooO0OO != -1) {
            this.f21689OooO0Oo += iOooO0OO;
            return 0;
        }
        this.f21691OooO0o0 = 2;
        this.f21692OooO0oO.OooO00o(0L, 1, this.f21689OooO0Oo, 0, null);
        this.f21689OooO0Oo = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
