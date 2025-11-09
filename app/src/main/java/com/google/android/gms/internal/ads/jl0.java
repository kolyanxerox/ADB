package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class jl0 implements Serializable, il0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public volatile transient boolean f20332OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final transient ll0 f20333OooOo0O = new ll0();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final il0 f20334OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public transient Object f20335OooOoO0;

    public jl0(il0 il0Var) {
        this.f20334OooOo0o = il0Var;
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOO0O("Suppliers.memoize(", (this.f20332OooOo ? OooO0oO.OooOo.OooOO0O("<supplier that returned ", String.valueOf(this.f20335OooOoO0), ">") : this.f20334OooOo0o).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public final Object mo13704zza() {
        if (!this.f20332OooOo) {
            synchronized (this.f20333OooOo0O) {
                try {
                    if (!this.f20332OooOo) {
                        Object objMo13704zza = this.f20334OooOo0o.mo13704zza();
                        this.f20335OooOoO0 = objMo13704zza;
                        this.f20332OooOo = true;
                        return objMo13704zza;
                    }
                } finally {
                }
            }
        }
        return this.f20335OooOoO0;
    }
}
