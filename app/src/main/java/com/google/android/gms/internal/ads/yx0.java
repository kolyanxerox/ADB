package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class yx0 extends zz0 {
    private static final yx0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private ay0 zze;

    static {
        yx0 yx0Var = new yx0();
        zza = yx0Var;
        zz0.OooOO0O(yx0.class, yx0Var);
    }

    public static xx0 OooOo() {
        return (xx0) zza.OooO0oO();
    }

    public static yx0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (yx0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static y01 OooOoOO() {
        return zza.OooO0oo();
    }

    public static /* synthetic */ void OooOoo0(yx0 yx0Var, ay0 ay0Var) {
        yx0Var.zze = ay0Var;
        yx0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new yx0();
        }
        if (iOooO0O0 == 4) {
            return new xx0(zza);
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
        synchronized (yx0.class) {
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

    public final ay0 OooOoO() {
        ay0 ay0Var = this.zze;
        return ay0Var == null ? ay0.OooOo() : ay0Var;
    }
}
