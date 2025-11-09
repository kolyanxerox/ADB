package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class os0 extends fr0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final pd0 f23100OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ps0 f23101OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Integer f23102OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final az0 f23103OooOoO0;

    public os0(ps0 ps0Var, pd0 pd0Var, az0 az0Var, Integer num) {
        this.f23101OooOo0o = ps0Var;
        this.f23100OooOo = pd0Var;
        this.f23103OooOoO0 = az0Var;
        this.f23102OooOoO = num;
    }

    public static os0 o00ooo(ps0 ps0Var, pd0 pd0Var, Integer num) throws GeneralSecurityException {
        az0 az0VarOooO0O0;
        pr0 pr0Var = ps0Var.f23424OooO00o;
        pr0 pr0Var2 = pr0.f23416OooOO0;
        String str = pr0Var.f23418OooO0O0;
        if (pr0Var != pr0Var2 && num == null) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (pr0Var == pr0Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        az0 az0Var = (az0) pd0Var.f23325OooOo0o;
        if (az0Var.f17140OooO00o.length != 32) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(az0Var.f17140OooO00o.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (pr0Var == pr0Var2) {
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else {
            if (pr0Var != pr0.f23409OooO) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            az0VarOooO0O0 = gu0.OooO0O0(num.intValue());
        }
        return new os0(ps0Var, pd0Var, az0VarOooO0O0, num);
    }
}
