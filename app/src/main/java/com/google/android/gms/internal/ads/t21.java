package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class t21 extends zz0 {
    private static final t21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private jz0 zzf;
    private jz0 zzg;

    static {
        t21 t21Var = new t21();
        zza = t21Var;
        zz0.OooOO0O(t21.class, t21Var);
    }

    public t21() {
        hz0 hz0Var = jz0.f20406OooOo0o;
        this.zzf = hz0Var;
        this.zzg = hz0Var;
    }

    public static /* synthetic */ void OooOo(t21 t21Var, jz0 jz0Var) {
        jz0Var.getClass();
        t21Var.zzc |= 4;
        t21Var.zzf = jz0Var;
    }

    public static s21 OooOo0o() {
        return (s21) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(t21 t21Var) {
        t21Var.zzd = 1;
        t21Var.zzc = 1 | t21Var.zzc;
    }

    public static /* synthetic */ void OooOoO0(t21 t21Var) {
        t21Var.zzc |= 2;
        t21Var.zze = "image/png";
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", o21.f22309OooO0Oo, "zze", "zzf", "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new t21();
        }
        if (iOooO0O0 == 4) {
            return new s21(zza);
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
        synchronized (t21.class) {
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
}
