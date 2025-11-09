package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gx0 extends zz0 {
    private static final gx0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private ix0 zzd;
    private int zze;
    private int zzf;

    static {
        gx0 gx0Var = new gx0();
        zza = gx0Var;
        zz0.OooOO0O(gx0.class, gx0Var);
    }

    public static gx0 OooOoO() {
        return zza;
    }

    public static fx0 OooOoO0() {
        return (fx0) zza.OooO0oO();
    }

    public static gx0 OooOoOO(jz0 jz0Var, tz0 tz0Var) {
        return (gx0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static /* synthetic */ void OooOooO(gx0 gx0Var, ix0 ix0Var) {
        gx0Var.zzd = ix0Var;
        gx0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new gx0();
        }
        if (iOooO0O0 == 4) {
            return new fx0(zza);
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
        synchronized (gx0.class) {
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

    public final int OooOo() {
        return this.zzf;
    }

    public final int OooOo0o() {
        return this.zze;
    }

    public final ix0 OooOoo0() {
        ix0 ix0Var = this.zzd;
        return ix0Var == null ? ix0.OooOoO() : ix0Var;
    }
}
