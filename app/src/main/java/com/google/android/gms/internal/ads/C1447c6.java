package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c6 */
/* loaded from: classes2.dex */
public final class C1447c6 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C1447c6 zzc;
    private static volatile y01 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C1447c6 c1447c6 = new C1447c6();
        zzc = c1447c6;
        zz0.OooOO0O(C1447c6.class, c1447c6);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new C1447c6();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzc);
        }
        if (iOooO0O0 == 5) {
            return zzc;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzd;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1447c6.class) {
            try {
                yz0Var = zzd;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzd = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
