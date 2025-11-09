package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class tf0 extends zz0 {
    private static final tf0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private qf0 zzd;

    static {
        tf0 tf0Var = new tf0();
        zza = tf0Var;
        zz0.OooOO0O(tf0.class, tf0Var);
    }

    public static /* synthetic */ void OooOo(tf0 tf0Var, qf0 qf0Var) {
        tf0Var.zzd = qf0Var;
        tf0Var.zzc |= 1;
    }

    public static sf0 OooOo0o() {
        return (sf0) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iOooO0O0 == 3) {
            return new tf0();
        }
        if (iOooO0O0 == 4) {
            return new sf0(zza);
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
        synchronized (tf0.class) {
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
