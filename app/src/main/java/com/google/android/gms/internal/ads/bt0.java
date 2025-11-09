package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class bt0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f17595OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f17596OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f17597OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f17598OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f17595OooO00o = new ju0(ds0.class, new xs0(6));
        f17596OooO0O0 = new hu0(az0VarOooO0O0, new xs0(7));
        f17597OooO0OO = new qt0(bs0.class, new xs0(8));
        f17598OooO0Oo = new ot0(az0VarOooO0O0, new xs0(9));
    }

    public static pr0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return pr0.f23412OooO0o;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return pr0.f23415OooO0oo;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
            }
        }
        return pr0.f23414OooO0oO;
    }

    public static fy0 OooO0O0(pr0 pr0Var) throws GeneralSecurityException {
        if (pr0.f23412OooO0o.equals(pr0Var)) {
            return fy0.TINK;
        }
        if (pr0.f23414OooO0oO.equals(pr0Var)) {
            return fy0.CRUNCHY;
        }
        if (pr0.f23415OooO0oo.equals(pr0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(pr0Var.f23418OooO0O0));
    }
}
