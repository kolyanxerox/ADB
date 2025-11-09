package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m6 */
/* loaded from: classes2.dex */
public final class C1815m6 extends zz0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final C1815m6 zze;
    private static volatile y01 zzf;
    private int zzg;
    private int zzh;
    private C1740k5 zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        C1815m6 c1815m6 = new C1815m6();
        zze = c1815m6;
        zz0.OooOO0O(C1815m6.class, c1815m6);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", C1771l.f20738OooOOoo, "zzi", "zzj", "zzk"});
        }
        if (iOooO0O0 == 3) {
            return new C1815m6();
        }
        if (iOooO0O0 == 4) {
            return new C1668i6(zze);
        }
        if (iOooO0O0 == 5) {
            return zze;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzf;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1815m6.class) {
            try {
                yz0Var = zzf;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzf = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
