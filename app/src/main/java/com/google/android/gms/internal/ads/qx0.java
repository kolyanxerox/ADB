package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class qx0 extends zz0 {
    private static final qx0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private kx0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        qx0 qx0Var = new qx0();
        zza = qx0Var;
        zz0.OooOO0O(qx0.class, qx0Var);
    }

    public static px0 OooOoO0() {
        return (px0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoOO(qx0 qx0Var, kx0 kx0Var) {
        qx0Var.zzd = kx0Var;
        qx0Var.zzc |= 1;
    }

    public static void Oooo000(qx0 qx0Var, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        qx0Var.zze = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new qx0();
        }
        if (iOooO0O0 == 4) {
            return new px0(zza);
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
        synchronized (qx0.class) {
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

    public final kx0 OooOo() {
        kx0 kx0Var = this.zzd;
        return kx0Var == null ? kx0.OooOoO0() : kx0Var;
    }

    public final int OooOo0o() {
        return this.zzf;
    }

    public final fy0 OooOoO() {
        fy0 fy0VarOooO0O0 = fy0.OooO0O0(this.zzg);
        return fy0VarOooO0O0 == null ? fy0.UNRECOGNIZED : fy0VarOooO0O0;
    }

    public final boolean OooOooO() {
        return (this.zzc & 1) != 0;
    }

    public final int OooOooo() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
