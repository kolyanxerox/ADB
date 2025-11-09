package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m5 */
/* loaded from: classes2.dex */
public final class C1814m5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1814m5 zzd;
    private static volatile y01 zze;
    private int zzf;
    private int zzg = 1000;
    private C1851n5 zzh;
    private C1667i5 zzi;

    static {
        C1814m5 c1814m5 = new C1814m5();
        zzd = c1814m5;
        zz0.OooOO0O(C1814m5.class, c1814m5);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", C1771l.f20740OooOo00, "zzh", "zzi"});
        }
        if (iOooO0O0 == 3) {
            return new C1814m5();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzd);
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
        synchronized (C1814m5.class) {
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
