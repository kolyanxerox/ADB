package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class e10 implements InterfaceC1417bc {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f18450OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C1508dv f18451OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C1865nj f18452OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final String f18453OooOoO0;

    public e10(C1508dv c1508dv, kd0 kd0Var) {
        this.f18451OooOo0O = c1508dv;
        this.f18452OooOo0o = kd0Var.OooOO0o;
        this.f18450OooOo = kd0Var.f20495OooOO0;
        this.f18453OooOoO0 = kd0Var.f20496OooOO0O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1417bc
    public final void o00o0O(C1865nj c1865nj) {
        int i;
        String str;
        C1865nj c1865nj2 = this.f18452OooOo0o;
        if (c1865nj2 != null) {
            c1865nj = c1865nj2;
        }
        if (c1865nj != null) {
            str = c1865nj.zza;
            i = c1865nj.zzb;
        } else {
            i = 1;
            str = "";
        }
        BinderC1460cj binderC1460cj = new BinderC1460cj(str, i);
        C1508dv c1508dv = this.f18451OooOo0O;
        c1508dv.getClass();
        c1508dv.o0000Ooo(new de0(binderC1460cj, this.f18450OooOo, this.f18453OooOoO0, false, 17));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1417bc
    public final void zzb() {
        this.f18451OooOo0O.o0000Ooo(new C2007rd(29));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1417bc
    public final void zzc() {
        this.f18451OooOo0O.o0000Ooo(new C2007rd(28));
    }
}
