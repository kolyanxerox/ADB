package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zs0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f26374OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f26375OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f26376OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f26377OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f26374OooO00o = new ju0(as0.class, new xs0(2));
        f26375OooO0O0 = new hu0(az0VarOooO0O0, new xs0(3));
        f26376OooO0OO = new qt0(yr0.class, new xs0(4));
        f26377OooO0Oo = new ot0(az0VarOooO0O0, new xs0(5));
    }

    public static or0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return or0.f23090OooOoo;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return or0.f23093OooOooo;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
            }
        }
        return or0.f23092OooOooO;
    }

    public static fy0 OooO0O0(or0 or0Var) throws GeneralSecurityException {
        if (or0.f23090OooOoo.equals(or0Var)) {
            return fy0.TINK;
        }
        if (or0.f23092OooOooO.equals(or0Var)) {
            return fy0.CRUNCHY;
        }
        if (or0.f23093OooOooo.equals(or0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(or0Var)));
    }
}
