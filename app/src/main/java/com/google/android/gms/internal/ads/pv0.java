package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class pv0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f23432OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f23433OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f23434OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f23435OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f23432OooO00o = new ju0(dv0.class, new xs0(24));
        f23433OooO0O0 = new hu0(az0VarOooO0O0, new xs0(25));
        f23434OooO0OO = new qt0(av0.class, new xs0(26));
        f23435OooO0Oo = new ot0(az0VarOooO0O0, new xs0(27));
    }

    public static tq0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return tq0.f24479Oooo0O0;
        }
        if (iOrdinal == 2) {
            return tq0.f24482Oooo0o0;
        }
        if (iOrdinal == 3) {
            return tq0.f24481Oooo0o;
        }
        if (iOrdinal == 4) {
            return tq0.f24480Oooo0OO;
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
    }

    public static fy0 OooO0O0(tq0 tq0Var) throws GeneralSecurityException {
        if (tq0.f24479Oooo0O0.equals(tq0Var)) {
            return fy0.TINK;
        }
        if (tq0.f24480Oooo0OO.equals(tq0Var)) {
            return fy0.CRUNCHY;
        }
        if (tq0.f24481Oooo0o.equals(tq0Var)) {
            return fy0.RAW;
        }
        if (tq0.f24482Oooo0o0.equals(tq0Var)) {
            return fy0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(tq0Var)));
    }
}
