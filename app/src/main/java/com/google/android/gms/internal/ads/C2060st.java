package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.st */
/* loaded from: classes2.dex */
public final class C2060st implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24155OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final p31 f24156OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1876nu f24157OooO0OO;

    public C2060st(C1876nu c1876nu, p31 p31Var) {
        this.f24155OooO00o = 2;
        this.f24157OooO0OO = c1876nu;
        this.f24156OooO0O0 = p31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f24155OooO00o) {
            case 0:
                return new C2023rt((C2134ut) this.f24156OooO0O0.zzb(), this.f24157OooO0OO.OooO00o());
            case 1:
                return new o90(0, (Oooo0OO.o00Ooo) this.f24156OooO0O0.zzb(), this.f24157OooO0OO.OooO00o());
            default:
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                vd0 vd0VarOooO00o = this.f24157OooO0OO.OooO00o();
                return new q90(c2163vl, vd0VarOooO00o, 0);
        }
    }

    public /* synthetic */ C2060st(p31 p31Var, C1876nu c1876nu, int i) {
        this.f24155OooO00o = i;
        this.f24156OooO0O0 = p31Var;
        this.f24157OooO0OO = c1876nu;
    }
}
