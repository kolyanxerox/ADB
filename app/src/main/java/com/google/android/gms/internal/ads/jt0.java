package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class jt0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f20387OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f20388OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f20389OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f20390OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f20387OooO00o = new ju0(ss0.class, new xs0(14));
        f20388OooO0O0 = new hu0(az0VarOooO0O0, new xs0(15));
        f20389OooO0OO = new qt0(qs0.class, new xs0(16));
        f20390OooO0Oo = new ot0(az0VarOooO0O0, new xs0(17));
    }

    public static tr0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return tr0.f24491OooOoo;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tr0.f24494OooOooo;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
            }
        }
        return tr0.f24493OooOooO;
    }

    public static fy0 OooO0O0(tr0 tr0Var) throws GeneralSecurityException {
        if (tr0.f24491OooOoo.equals(tr0Var)) {
            return fy0.TINK;
        }
        if (tr0.f24493OooOooO.equals(tr0Var)) {
            return fy0.CRUNCHY;
        }
        if (tr0.f24494OooOooo.equals(tr0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(tr0Var.f24496OooOo0o));
    }
}
