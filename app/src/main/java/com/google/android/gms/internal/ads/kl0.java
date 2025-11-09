package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class kl0 implements il0 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final el0 f20615OooOoO0 = new el0(1);

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f20616OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ll0 f20617OooOo0O = new ll0();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile il0 f20618OooOo0o;

    public kl0(il0 il0Var) {
        this.f20618OooOo0o = il0Var;
    }

    public final String toString() {
        Object objOooOO0O = this.f20618OooOo0o;
        if (objOooOO0O == f20615OooOoO0) {
            objOooOO0O = OooO0oO.OooOo.OooOO0O("<supplier that returned ", String.valueOf(this.f20616OooOo), ">");
        }
        return OooO0oO.OooOo.OooOO0O("Suppliers.memoize(", String.valueOf(objOooOO0O), ")");
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public final Object mo13704zza() {
        il0 il0Var = this.f20618OooOo0o;
        el0 el0Var = f20615OooOoO0;
        if (il0Var != el0Var) {
            synchronized (this.f20617OooOo0O) {
                try {
                    if (this.f20618OooOo0o != el0Var) {
                        Object objMo13704zza = this.f20618OooOo0o.mo13704zza();
                        this.f20616OooOo = objMo13704zza;
                        this.f20618OooOo0o = el0Var;
                        return objMo13704zza;
                    }
                } finally {
                }
            }
        }
        return this.f20616OooOo;
    }
}
