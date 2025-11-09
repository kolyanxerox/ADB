package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ix0 extends zz0 {
    private static final ix0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;

    static {
        ix0 ix0Var = new ix0();
        zza = ix0Var;
        zz0.OooOO0O(ix0.class, ix0Var);
    }

    public static ix0 OooOoO() {
        return zza;
    }

    public static hx0 OooOoO0() {
        return (hx0) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (iOooO0O0 == 3) {
            return new ix0();
        }
        if (iOooO0O0 == 4) {
            return new hx0(zza);
        }
        if (iOooO0O0 == 5) {
            return zza;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzb;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (ix0.class) {
            try {
                yz0Var = zzb;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzb = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }

    public final bx0 OooOo() {
        int i = this.zzc;
        bx0 bx0Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : bx0.SHA224 : bx0.SHA512 : bx0.SHA256 : bx0.SHA384 : bx0.SHA1 : bx0.UNKNOWN_HASH;
        return bx0Var == null ? bx0.UNRECOGNIZED : bx0Var;
    }

    public final int OooOo0o() {
        return this.zzd;
    }
}
