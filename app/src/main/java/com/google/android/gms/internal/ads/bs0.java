package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class bs0 extends fr0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final pd0 f17591OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ds0 f17592OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Integer f17593OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final az0 f17594OooOoO0;

    public bs0(ds0 ds0Var, pd0 pd0Var, az0 az0Var, Integer num) {
        this.f17592OooOo0o = ds0Var;
        this.f17591OooOo = pd0Var;
        this.f17594OooOoO0 = az0Var;
        this.f17593OooOoO = num;
    }

    public static bs0 o00ooo(pr0 pr0Var, pd0 pd0Var, Integer num) throws GeneralSecurityException {
        az0 az0VarOooO0O0;
        pr0 pr0Var2 = pr0.f23415OooO0oo;
        String str = pr0Var.f23418OooO0O0;
        if (pr0Var != pr0Var2 && num == null) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (pr0Var == pr0Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        az0 az0Var = (az0) pd0Var.f23325OooOo0o;
        if (az0Var.f17140OooO00o.length != 32) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(az0Var.f17140OooO00o.length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        ds0 ds0Var = new ds0(pr0Var);
        if (pr0Var == pr0Var2) {
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else if (pr0Var == pr0.f23414OooO0oO) {
            az0VarOooO0O0 = gu0.OooO00o(num.intValue());
        } else {
            if (pr0Var != pr0.f23412OooO0o) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            az0VarOooO0O0 = gu0.OooO0O0(num.intValue());
        }
        return new bs0(ds0Var, pd0Var, az0VarOooO0O0, num);
    }
}
