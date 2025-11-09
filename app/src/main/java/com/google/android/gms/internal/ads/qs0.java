package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class qs0 extends fr0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final pd0 f23692OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ss0 f23693OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Integer f23694OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final az0 f23695OooOoO0;

    public qs0(ss0 ss0Var, pd0 pd0Var, az0 az0Var, Integer num) {
        this.f23693OooOo0o = ss0Var;
        this.f23692OooOo = pd0Var;
        this.f23695OooOoO0 = az0Var;
        this.f23694OooOoO = num;
    }

    public static qs0 o00ooo(tr0 tr0Var, pd0 pd0Var, Integer num) throws GeneralSecurityException {
        az0 az0VarOooO0O0;
        tr0 tr0Var2 = tr0.f24494OooOooo;
        String str = tr0Var.f24496OooOo0o;
        if (tr0Var != tr0Var2 && num == null) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (tr0Var == tr0Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        az0 az0Var = (az0) pd0Var.f23325OooOo0o;
        if (az0Var.f17140OooO00o.length != 32) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(az0Var.f17140OooO00o.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        ss0 ss0Var = new ss0(tr0Var);
        if (tr0Var == tr0Var2) {
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else if (tr0Var == tr0.f24493OooOooO) {
            az0VarOooO0O0 = gu0.OooO00o(num.intValue());
        } else {
            if (tr0Var != tr0.f24491OooOoo) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            az0VarOooO0O0 = gu0.OooO0O0(num.intValue());
        }
        return new qs0(ss0Var, pd0Var, az0VarOooO0O0, num);
    }
}
