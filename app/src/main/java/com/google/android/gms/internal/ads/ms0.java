package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class ms0 {

    /* renamed from: OooO00o */
    public static final ju0 f21342OooO00o;

    /* renamed from: OooO0O0 */
    public static final hu0 f21343OooO0O0;

    /* renamed from: OooO0OO */
    public static final qt0 f21344OooO0OO;

    /* renamed from: OooO0Oo */
    public static final ot0 f21345OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f21342OooO00o = new ju0(ls0.class, new el0(14));
        f21343OooO0O0 = new hu0(az0VarOooO0O0, new el0(15));
        f21344OooO0OO = new qt0(ks0.class, new el0(16));
        f21345OooO0Oo = new ot0(az0VarOooO0O0, new el0(17));
    }

    public static ls0 OooO00o(ey0 ey0Var, fy0 fy0Var) throws GeneralSecurityException {
        tq0 tq0Var;
        lx0 lx0VarOooOo0o = mx0.OooOo0o();
        lx0VarOooOo0o.OooO0oO(ey0Var.OooOo0o().OooOoo0());
        lx0VarOooOo0o.OooO0oo(ey0Var.OooOo0o().OooOoOO());
        lx0VarOooOo0o.OooO0o(fy0.RAW);
        yq0 yq0VarOooOO0O = xh0.OooOO0O(((mx0) lx0VarOooOo0o.OooO0O0()).OooO0Oo());
        boolean z = yq0VarOooOO0O instanceof xr0;
        Object obj = tq0.f24475Oooo0;
        tq0 tq0Var2 = tq0.f24478Oooo00o;
        tq0 tq0Var3 = tq0.f24477Oooo00O;
        tq0 tq0Var4 = tq0.f24474OooOooo;
        tq0 tq0Var5 = tq0.f24476Oooo000;
        tq0 tq0Var6 = tq0.f24473OooOooO;
        if (z) {
            tq0Var = tq0Var6;
        } else if (yq0VarOooOO0O instanceof ds0) {
            tq0Var = tq0Var5;
        } else if (yq0VarOooOO0O instanceof ss0) {
            tq0Var = tq0Var4;
        } else if (yq0VarOooOO0O instanceof qr0) {
            tq0Var = tq0Var3;
        } else if (yq0VarOooOO0O instanceof ur0) {
            tq0Var = tq0Var2;
        } else {
            if (!(yq0VarOooOO0O instanceof as0)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(yq0VarOooOO0O.toString()));
            }
            tq0Var = obj;
        }
        int iOrdinal = fy0Var.ordinal();
        or0 or0Var = or0.f23095Oooo00O;
        if (iOrdinal == 1) {
            or0Var = or0.f23094Oooo000;
        } else if (iOrdinal != 3) {
            throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
        }
        String strOooOoOO = ey0Var.OooOoOO();
        gr0 gr0Var = (gr0) yq0VarOooOO0O;
        if (strOooOoOO == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (gr0Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (gr0Var.OooO00o()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((tq0Var.equals(tq0Var6) && (gr0Var instanceof xr0)) || ((tq0Var.equals(tq0Var5) && (gr0Var instanceof ds0)) || ((tq0Var.equals(tq0Var4) && (gr0Var instanceof ss0)) || ((tq0Var.equals(tq0Var3) && (gr0Var instanceof qr0)) || ((tq0Var.equals(tq0Var2) && (gr0Var instanceof ur0)) || (tq0Var.equals(obj) && (gr0Var instanceof as0))))))) {
            return new ls0(or0Var, strOooOoOO, tq0Var, gr0Var);
        }
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder("Cannot use parsing strategy "), tq0Var.f24484OooOo0o, " when new keys are picked according to ", String.valueOf(gr0Var), "."));
    }

    public static ey0 OooO0O0(ls0 ls0Var) {
        byte[] bArrOooO0Oo = ((tu0) fu0.f19127OooO0O0.OooO0Oo(ls0Var.f20947OooO0Oo)).f24510OooO0O0.OooO0Oo();
        try {
            tz0 tz0Var = tz0.f24541OooO00o;
            a11 a11Var = a11.f16875OooO0OO;
            mx0 mx0VarOooOoO0 = mx0.OooOoO0(bArrOooO0Oo, tz0.f24542OooO0O0);
            dy0 dy0VarOooOo = ey0.OooOo();
            String str = ls0Var.f20945OooO0O0;
            dy0VarOooOo.OooO0Oo();
            ey0.OooOoo((ey0) dy0VarOooOo.f25822OooOo0o, str);
            dy0VarOooOo.OooO0Oo();
            ey0.OooOoo0((ey0) dy0VarOooOo.f25822OooOo0o, mx0VarOooOoO0);
            return (ey0) dy0VarOooOo.OooO0O0();
        } catch (k01 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static fy0 OooO0OO(or0 or0Var) throws GeneralSecurityException {
        if (or0.f23094Oooo000.equals(or0Var)) {
            return fy0.TINK;
        }
        if (or0.f23095Oooo00O.equals(or0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(or0Var)));
    }
}
