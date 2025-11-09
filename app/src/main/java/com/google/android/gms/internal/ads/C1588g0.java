package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g0 */
/* loaded from: classes2.dex */
public final class C1588g0 extends zz0 {
    private static final C1588g0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private d01 zzg = a01.f16868OooOoO;
    private long zzh;

    static {
        C1588g0 c1588g0 = new C1588g0();
        zza = c1588g0;
        zz0.OooOO0O(C1588g0.class, c1588g0);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOooO0O0 == 3) {
            return new C1588g0();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zza);
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
        synchronized (C1588g0.class) {
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
