package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d0 */
/* loaded from: classes2.dex */
public final class C1478d0 extends zz0 {
    private static final C1478d0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        C1478d0 c1478d0 = new C1478d0();
        zza = c1478d0;
        zz0.OooOO0O(C1478d0.class, c1478d0);
    }

    public static /* synthetic */ void OooOo(C1478d0 c1478d0, long j) {
        c1478d0.zzc |= 32;
        c1478d0.zzi = j;
    }

    public static C1441c0 OooOo0o() {
        return (C1441c0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(C1478d0 c1478d0, long j) {
        c1478d0.zzc |= 1;
        c1478d0.zzd = j;
    }

    public static /* synthetic */ void OooOoO0(C1478d0 c1478d0, long j) {
        c1478d0.zzc |= 4;
        c1478d0.zzf = j;
    }

    public static /* synthetic */ void OooOoOO(C1478d0 c1478d0, long j) {
        c1478d0.zzc |= 8;
        c1478d0.zzg = j;
    }

    public static /* synthetic */ void OooOoo0(C1478d0 c1478d0, long j) {
        c1478d0.zzc |= 16;
        c1478d0.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOooO0O0 == 3) {
            return new C1478d0();
        }
        if (iOooO0O0 == 4) {
            return new C1441c0(zza);
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
        synchronized (C1478d0.class) {
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
