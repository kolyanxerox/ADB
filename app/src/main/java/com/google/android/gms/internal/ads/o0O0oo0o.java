package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o0O0oo0o {

    /* renamed from: OooO, reason: collision with root package name */
    public int f22013OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f22014OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f22015OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f22016OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f22017OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final r40 f22018OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f22019OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final r40 f22020OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f22021OooO0oo;

    public o0O0oo0o(r40 r40Var, r40 r40Var2, boolean z) throws C2185w6 {
        this.f22020OooO0oO = r40Var;
        this.f22018OooO0o = r40Var2;
        this.f22019OooO0o0 = z;
        r40Var2.OooOO0(12);
        this.f22014OooO00o = r40Var2.OooOoO0();
        r40Var.OooOO0(12);
        this.f22013OooO = r40Var.OooOoO0();
        ze0.Oooo00O("first_chunk must be 1", r40Var.OooOOo0() == 1);
        this.f22015OooO0O0 = -1;
    }

    public final boolean OooO00o() {
        int i = this.f22015OooO0O0 + 1;
        this.f22015OooO0O0 = i;
        if (i == this.f22014OooO00o) {
            return false;
        }
        boolean z = this.f22019OooO0o0;
        r40 r40Var = this.f22018OooO0o;
        this.f22017OooO0Oo = z ? r40Var.OooOooo() : r40Var.OooOooO();
        if (this.f22015OooO0O0 == this.f22021OooO0oo) {
            r40 r40Var2 = this.f22020OooO0oO;
            this.f22016OooO0OO = r40Var2.OooOoO0();
            r40Var2.OooOO0O(4);
            int i2 = this.f22013OooO - 1;
            this.f22013OooO = i2;
            this.f22021OooO0oo = i2 > 0 ? (-1) + r40Var2.OooOoO0() : -1;
        }
        return true;
    }
}
