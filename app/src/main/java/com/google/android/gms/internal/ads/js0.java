package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class js0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f20380OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f20381OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f20382OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f20383OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f20380OooO00o = new ju0(is0.class, new el0(10));
        f20381OooO0O0 = new hu0(az0VarOooO0O0, new el0(11));
        f20382OooO0OO = new qt0(hs0.class, new el0(12));
        f20383OooO0Oo = new ot0(az0VarOooO0O0, new el0(13));
    }

    public static tr0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return tr0.f24490OooOoOO;
        }
        if (iOrdinal == 3) {
            return tr0.f24492OooOoo0;
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
    }

    public static fy0 OooO0O0(tr0 tr0Var) throws GeneralSecurityException {
        if (tr0.f24490OooOoOO.equals(tr0Var)) {
            return fy0.TINK;
        }
        if (tr0.f24492OooOoo0.equals(tr0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(tr0Var.f24496OooOo0o));
    }
}
