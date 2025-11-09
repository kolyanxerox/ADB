package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class hs0 extends fr0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Integer f19847OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final is0 f19848OooOo0o;

    public hs0(is0 is0Var, az0 az0Var, Integer num) {
        this.f19848OooOo0o = is0Var;
        this.f19847OooOo = num;
    }

    public static hs0 o00ooo(is0 is0Var, Integer num) throws GeneralSecurityException {
        az0 az0VarOooO00o;
        tr0 tr0Var = is0Var.f20115OooO0O0;
        if (tr0Var == tr0.f24490OooOoOO) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            az0VarOooO00o = az0.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (tr0Var != tr0.f24492OooOoo0) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(tr0Var.f24496OooOo0o));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            az0VarOooO00o = az0.OooO00o(new byte[0]);
        }
        return new hs0(is0Var, az0VarOooO00o, num);
    }
}
