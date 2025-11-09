package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class ys0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ju0 f26017OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final hu0 f26018OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final qt0 f26019OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final ot0 f26020OooO0Oo;

    static {
        az0 az0VarOooO0O0 = zu0.OooO0O0("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f26017OooO00o = new ju0(xr0.class, new el0(28));
        f26018OooO0O0 = new hu0(az0VarOooO0O0, new el0(29));
        f26019OooO0OO = new qt0(vr0.class, new xs0(0));
        f26020OooO0Oo = new ot0(az0VarOooO0O0, new xs0(1));
    }

    public static tq0 OooO00o(fy0 fy0Var) throws GeneralSecurityException {
        int iOrdinal = fy0Var.ordinal();
        if (iOrdinal == 1) {
            return tq0.f24470OooOoOO;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tq0.f24471OooOoo;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(fy0Var.OooO00o(), "Unable to parse OutputPrefixType: "));
            }
        }
        return tq0.f24472OooOoo0;
    }

    public static fy0 OooO0O0(tq0 tq0Var) throws GeneralSecurityException {
        if (tq0.f24470OooOoOO.equals(tq0Var)) {
            return fy0.TINK;
        }
        if (tq0.f24472OooOoo0.equals(tq0Var)) {
            return fy0.CRUNCHY;
        }
        if (tq0.f24471OooOoo.equals(tq0Var)) {
            return fy0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(tq0Var)));
    }
}
