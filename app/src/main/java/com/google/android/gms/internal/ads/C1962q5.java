package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q5 */
/* loaded from: classes2.dex */
public final class C1962q5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1962q5 zzd;
    private static volatile y01 zze;
    private int zzf;
    private int zzg;
    private C2073t5 zzh;
    private C2147v5 zzi;

    static {
        C1962q5 c1962q5 = new C1962q5();
        zzd = c1962q5;
        zz0.OooOO0O(C1962q5.class, c1962q5);
    }

    public static void OooOo(C1962q5 c1962q5, C2073t5 c2073t5) {
        c1962q5.getClass();
        c2073t5.getClass();
        c1962q5.zzh = c2073t5;
        c1962q5.zzf |= 2;
    }

    public static void OooOo0o(C1962q5 c1962q5) {
        c1962q5.getClass();
        c1962q5.zzg = OooOOo.OooOOO.OooO0O0(2);
        c1962q5.zzf |= 1;
    }

    public static C1925p5 OooOoO() {
        return (C1925p5) zzd.OooO0oO();
    }

    public static void OooOoO0(C1962q5 c1962q5, C2147v5 c2147v5) {
        c1962q5.getClass();
        c1962q5.zzi = c2147v5;
        c1962q5.zzf |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", C1771l.f20737OooOOo0, "zzh", "zzi"});
        }
        if (iOooO0O0 == 3) {
            return new C1962q5();
        }
        if (iOooO0O0 == 4) {
            return new C1925p5(zzd);
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
        synchronized (C1962q5.class) {
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
