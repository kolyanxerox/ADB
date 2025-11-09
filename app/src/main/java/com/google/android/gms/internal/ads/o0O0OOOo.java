package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o0O0OOOo implements o0O0O0o0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f21965OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f21966OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f21967OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Object f21968OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f21969OooOoO0;

    public o0O0OOOo(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f21966OooOo0O = i2;
        this.f21967OooOo0o = i3;
        this.f21965OooOo = i4;
        this.f21969OooOoO0 = i5;
        this.f21968OooOoO = bArr;
    }

    @Override // com.google.android.gms.internal.ads.o0O0O0o0
    public int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.o0O0O0o0
    public int zzb() {
        return this.f21966OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.o0O0O0o0
    public int zzc() {
        r40 r40Var = (r40) this.f21968OooOoO;
        int i = this.f21967OooOo0o;
        if (i == 8) {
            return r40Var.OooOo0O();
        }
        if (i == 16) {
            return r40Var.OooOoO();
        }
        int i2 = this.f21965OooOo;
        this.f21965OooOo = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f21969OooOoO0 & 15;
        }
        int iOooOo0O = r40Var.OooOo0O();
        this.f21969OooOoO0 = iOooOo0O;
        return (iOooOo0O & 240) >> 4;
    }

    public o0O0OOOo(ia0 ia0Var) {
        r40 r40Var = ia0Var.f20006OooO0OO;
        this.f21968OooOoO = r40Var;
        r40Var.OooOO0(12);
        this.f21967OooOo0o = r40Var.OooOoO0() & 255;
        this.f21966OooOo0O = r40Var.OooOoO0();
    }
}
