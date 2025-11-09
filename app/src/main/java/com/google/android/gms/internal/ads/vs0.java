package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class vs0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f25121OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f25122OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f25123OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f25124OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f25121OooO00o = new ju0(ur0.class, new el0(24));
        f25122OooO0O0 = new hu0(az0VarOooO0O0, new el0(25));
        f25123OooO0OO = new qt0(rr0.class, new el0(26));
        f25124OooO0Oo = new ot0(az0VarOooO0O0, new el0(27));
    }

    public static tr0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return tr0.f24487OooOo;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tr0.f24488OooOoO;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
            }
        }
        return tr0.f24489OooOoO0;
    }

    public static fy0 OooO0O0(tr0 tr0Var) throws GeneralSecurityException {
        if (tr0.f24487OooOo.equals(tr0Var)) {
            return fy0.TINK;
        }
        if (tr0.f24489OooOoO0.equals(tr0Var)) {
            return fy0.CRUNCHY;
        }
        if (tr0.f24488OooOoO.equals(tr0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(tr0Var)));
    }
}
