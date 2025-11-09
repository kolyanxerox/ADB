package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class iy0 extends zz0 {
    private static final iy0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private ny0 zze;
    private jz0 zzf = jz0.f20406OooOo0o;

    static {
        iy0 iy0Var = new iy0();
        zza = iy0Var;
        zz0.OooOO0O(iy0.class, iy0Var);
    }

    public static hy0 OooOo() {
        return (hy0) zza.OooO0oO();
    }

    public static iy0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (iy0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static /* synthetic */ void OooOoo(iy0 iy0Var, ny0 ny0Var) {
        iy0Var.zze = ny0Var;
        iy0Var.zzc |= 1;
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
            return new iy0();
        }
        if (iOooO0O0 == 4) {
            return new hy0(zza);
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
        synchronized (iy0.class) {
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

    public final jz0 OooOoOO() {
        return this.zzf;
    }
}
