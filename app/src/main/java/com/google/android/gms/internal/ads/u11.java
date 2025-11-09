package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class u11 extends zz0 {
    private static final u11 zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        u11 u11Var = new u11();
        zza = u11Var;
        zz0.OooOO0O(u11.class, u11Var);
    }

    public static t11 OooOo0o() {
        return (t11) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new u11();
        }
        if (iOooO0O0 == 4) {
            return new t11(zza);
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
        synchronized (u11.class) {
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
