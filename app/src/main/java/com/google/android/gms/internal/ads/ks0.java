package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ks0 extends fr0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Integer f20670OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ls0 f20671OooOo0o;

    public ks0(ls0 ls0Var, az0 az0Var, Integer num) {
        this.f20671OooOo0o = ls0Var;
        this.f20670OooOo = num;
    }

    public static ks0 o00ooo(ls0 ls0Var, Integer num) throws GeneralSecurityException {
        az0 az0VarOooO0O0;
        or0 or0Var = ls0Var.f20944OooO00o;
        if (or0Var == or0.f23095Oooo00O) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else {
            if (or0Var != or0.f23094Oooo000) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(or0Var)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            az0VarOooO0O0 = gu0.OooO0O0(num.intValue());
        }
        return new ks0(ls0Var, az0VarOooO0O0, num);
    }
}
