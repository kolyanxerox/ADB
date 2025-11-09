package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gw0 extends zz0 {
    private static final gw0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private iw0 zzd;
    private int zze;

    static {
        gw0 gw0Var = new gw0();
        zza = gw0Var;
        zz0.OooOO0O(gw0.class, gw0Var);
    }

    public static fw0 OooOo() {
        return (fw0) zza.OooO0oO();
    }

    public static gw0 OooOoO0() {
        return zza;
    }

    public static /* synthetic */ void OooOoo0(gw0 gw0Var, iw0 iw0Var) {
        gw0Var.zzd = iw0Var;
        gw0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new gw0();
        }
        if (iOooO0O0 == 4) {
            return new fw0(zza);
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
        synchronized (gw0.class) {
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
        return this.zze;
    }

    public final iw0 OooOoO() {
        iw0 iw0Var = this.zzd;
        return iw0Var == null ? iw0.OooOoO0() : iw0Var;
    }
}
