package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class q90 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23548OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2163vl f23549OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final vd0 f23550OooO0OO;

    public /* synthetic */ q90(C2163vl c2163vl, vd0 vd0Var, int i) {
        this.f23548OooO00o = i;
        this.f23549OooO0O0 = c2163vl;
        this.f23550OooO0OO = vd0Var;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        switch (this.f23548OooO00o) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        switch (this.f23548OooO00o) {
            case 0:
                return this.f23549OooO0O0.OooO0O0(new CallableC1736k1(this, 8));
            default:
                return this.f23549OooO0O0.OooO0O0(new CallableC1736k1(this, 18));
        }
    }
}
