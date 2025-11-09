package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ex0 extends zz0 {
    private static final ex0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private ix0 zze;
    private jz0 zzf = jz0.f20406OooOo0o;

    static {
        ex0 ex0Var = new ex0();
        zza = ex0Var;
        zz0.OooOO0O(ex0.class, ex0Var);
    }

    public static cx0 OooOo() {
        return (cx0) zza.OooO0oO();
    }

    public static ex0 OooOoO(jz0 jz0Var, tz0 tz0Var) {
        return (ex0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static ex0 OooOoO0() {
        return zza;
    }

    public static y01 OooOoo() {
        return zza.OooO0oo();
    }

    public static /* synthetic */ void OooOooo(ex0 ex0Var, ix0 ix0Var) {
        ex0Var.zze = ix0Var;
        ex0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new ex0();
        }
        if (iOooO0O0 == 4) {
            return new cx0(zza);
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
        synchronized (ex0.class) {
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

    public final ix0 OooOoOO() {
        ix0 ix0Var = this.zze;
        return ix0Var == null ? ix0.OooOoO() : ix0Var;
    }

    public final jz0 OooOoo0() {
        return this.zzf;
    }
}
