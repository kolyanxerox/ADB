package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class vx0 extends zz0 {
    private static final vx0 zza;
    private static volatile y01 zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        vx0 vx0Var = new vx0();
        zza = vx0Var;
        zz0.OooOO0O(vx0.class, vx0Var);
    }

    public static tx0 OooOo0o() {
        return (tx0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(vx0 vx0Var, String str) {
        str.getClass();
        vx0Var.zzc = str;
    }

    public static void OooOoOO(vx0 vx0Var, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        vx0Var.zzd = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new vx0();
        }
        if (iOooO0O0 == 4) {
            return new tx0(zza);
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
        synchronized (vx0.class) {
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
