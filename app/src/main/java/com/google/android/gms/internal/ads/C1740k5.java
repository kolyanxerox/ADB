package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k5 */
/* loaded from: classes2.dex */
public final class C1740k5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1740k5 zzd;
    private static volatile y01 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        C1740k5 c1740k5 = new C1740k5();
        zzd = c1740k5;
        zz0.OooOO0O(C1740k5.class, c1740k5);
    }

    public static void OooOo(C1740k5 c1740k5, int i) {
        c1740k5.zzf |= 4;
        c1740k5.zzi = i;
    }

    public static void OooOo0o(C1740k5 c1740k5, int i) {
        c1740k5.zzf |= 1;
        c1740k5.zzg = i;
    }

    public static C1703j5 OooOoO() {
        return (C1703j5) zzd.OooO0oO();
    }

    public static void OooOoO0(C1740k5 c1740k5, int i) {
        c1740k5.zzf |= 2;
        c1740k5.zzh = i;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (iOooO0O0 == 3) {
            return new C1740k5();
        }
        if (iOooO0O0 == 4) {
            return new C1703j5(zzd);
        }
        if (iOooO0O0 == 5) {
            return zzd;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zze;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1740k5.class) {
            try {
                yz0Var = zze;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zze = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
