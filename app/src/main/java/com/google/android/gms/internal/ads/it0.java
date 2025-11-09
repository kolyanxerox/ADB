package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class it0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f20116OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f20117OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f20118OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f20119OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f20116OooO00o = new ju0(ps0.class, new xs0(10));
        f20117OooO0O0 = new hu0(az0VarOooO0O0, new xs0(11));
        f20118OooO0OO = new qt0(os0.class, new xs0(12));
        f20119OooO0Oo = new ot0(az0VarOooO0O0, new xs0(13));
    }

    public static pr0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return pr0.f23409OooO;
        }
        if (iOrdinal == 3) {
            return pr0.f23416OooOO0;
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
    }

    public static fy0 OooO0O0(pr0 pr0Var) throws GeneralSecurityException {
        if (pr0Var.equals(pr0.f23409OooO)) {
            return fy0.TINK;
        }
        if (pr0Var.equals(pr0.f23416OooOO0)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(pr0Var.f23418OooO0O0));
    }
}
