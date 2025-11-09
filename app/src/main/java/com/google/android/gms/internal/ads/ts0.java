package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class ts0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f24499OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f24500OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f24501OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f24502OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f24499OooO00o = new ju0(qr0.class, new el0(20));
        f24500OooO0O0 = new hu0(az0VarOooO0O0, new el0(21));
        f24501OooO0OO = new qt0(kr0.class, new el0(22));
        f24502OooO0Oo = new ot0(az0VarOooO0O0, new el0(23));
    }

    public static or0 OooO00o(bx0 bx0Var) throws GeneralSecurityException {
        int iOrdinal = bx0Var.ordinal();
        if (iOrdinal == 1) {
            return or0.f23086OooOo;
        }
        if (iOrdinal == 2) {
            return or0.f23089OooOoOO;
        }
        if (iOrdinal == 3) {
            return or0.f23087OooOoO;
        }
        if (iOrdinal == 4) {
            return or0.f23091OooOoo0;
        }
        if (iOrdinal == 5) {
            return or0.f23088OooOoO0;
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(bx0Var.OooO00o(), "Unable to parse HashType: "));
    }

    public static pr0 OooO0O0(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return pr0.f23410OooO0OO;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return pr0.f23413OooO0o0;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
            }
        }
        return pr0.f23411OooO0Oo;
    }

    public static ix0 OooO0OO(qr0 qr0Var) {
        bx0 bx0Var;
        hx0 hx0VarOooOoO0 = ix0.OooOoO0();
        int i = qr0Var.f23686OooO0Oo;
        hx0VarOooOoO0.OooO0Oo();
        ((ix0) hx0VarOooOoO0.f25822OooOo0o).zzd = i;
        or0 or0Var = or0.f23086OooOo;
        or0 or0Var2 = qr0Var.f23687OooO0o;
        if (or0Var.equals(or0Var2)) {
            bx0Var = bx0.SHA1;
        } else if (or0.f23088OooOoO0.equals(or0Var2)) {
            bx0Var = bx0.SHA224;
        } else if (or0.f23087OooOoO.equals(or0Var2)) {
            bx0Var = bx0.SHA256;
        } else if (or0.f23089OooOoOO.equals(or0Var2)) {
            bx0Var = bx0.SHA384;
        } else {
            if (!or0.f23091OooOoo0.equals(or0Var2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(or0Var2)));
            }
            bx0Var = bx0.SHA512;
        }
        hx0VarOooOoO0.OooO0Oo();
        ((ix0) hx0VarOooOoO0.f25822OooOo0o).zzc = bx0Var.OooO00o();
        return (ix0) hx0VarOooOoO0.OooO0O0();
    }

    public static fy0 OooO0Oo(pr0 pr0Var) throws GeneralSecurityException {
        if (pr0.f23410OooO0OO.equals(pr0Var)) {
            return fy0.TINK;
        }
        if (pr0.f23411OooO0Oo.equals(pr0Var)) {
            return fy0.CRUNCHY;
        }
        if (pr0.f23413OooO0o0.equals(pr0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(pr0Var)));
    }
}
