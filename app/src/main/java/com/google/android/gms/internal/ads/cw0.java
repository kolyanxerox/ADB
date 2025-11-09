package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class cw0 extends zz0 {
    private static final cw0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private gw0 zzd;
    private gx0 zze;

    static {
        cw0 cw0Var = new cw0();
        zza = cw0Var;
        zz0.OooOO0O(cw0.class, cw0Var);
    }

    public static cw0 OooOo(jz0 jz0Var, tz0 tz0Var) {
        return (cw0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static bw0 OooOo0o() {
        return (bw0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoOO(cw0 cw0Var, gw0 gw0Var) {
        cw0Var.zzd = gw0Var;
        cw0Var.zzc |= 1;
    }

    public static /* synthetic */ void OooOoo0(cw0 cw0Var, gx0 gx0Var) {
        cw0Var.zze = gx0Var;
        cw0Var.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new cw0();
        }
        if (iOooO0O0 == 4) {
            return new bw0(zza);
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
        synchronized (cw0.class) {
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

    public final gx0 OooOoO() {
        gx0 gx0Var = this.zze;
        return gx0Var == null ? gx0.OooOoO() : gx0Var;
    }

    public final gw0 OooOoO0() {
        gw0 gw0Var = this.zzd;
        return gw0Var == null ? gw0.OooOoO0() : gw0Var;
    }
}
