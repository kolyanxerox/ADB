package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ky0 extends zz0 {
    private static final ky0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private ny0 zze;

    static {
        ky0 ky0Var = new ky0();
        zza = ky0Var;
        zz0.OooOO0O(ky0.class, ky0Var);
    }

    public static jy0 OooOo() {
        return (jy0) zza.OooO0oO();
    }

    public static ky0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (ky0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static /* synthetic */ void OooOoOO(ky0 ky0Var, ny0 ny0Var) {
        ky0Var.zze = ny0Var;
        ky0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new ky0();
        }
        if (iOooO0O0 == 4) {
            return new jy0(zza);
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
        synchronized (ky0.class) {
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

    public final int OooOo0o() {
        return this.zzd;
    }

    public final ny0 OooOoO() {
        ny0 ny0Var = this.zze;
        return ny0Var == null ? ny0.OooOoO0() : ny0Var;
    }
}
