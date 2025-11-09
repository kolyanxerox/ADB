package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v5 */
/* loaded from: classes2.dex */
public final class C2147v5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C2147v5 zzd;
    private static volatile y01 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C2147v5 c2147v5 = new C2147v5();
        zzd = c2147v5;
        zz0.OooOO0O(C2147v5.class, c2147v5);
    }

    public static void OooOo(C2147v5 c2147v5, boolean z) {
        c2147v5.zzf |= 2;
        c2147v5.zzh = z;
    }

    public static void OooOo0o(C2147v5 c2147v5, boolean z) {
        c2147v5.zzf |= 1;
        c2147v5.zzg = z;
    }

    public static C2110u5 OooOoO() {
        return (C2110u5) zzd.OooO0oO();
    }

    public static void OooOoO0(C2147v5 c2147v5, int i) {
        c2147v5.zzf |= 4;
        c2147v5.zzi = i;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (iOooO0O0 == 3) {
            return new C2147v5();
        }
        if (iOooO0O0 == 4) {
            return new C2110u5(zzd);
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
        synchronized (C2147v5.class) {
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
