package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k0 */
/* loaded from: classes2.dex */
public final class C1735k0 extends zz0 {
    private static final C1735k0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static {
        C1735k0 c1735k0 = new C1735k0();
        zza = c1735k0;
        zz0.OooOO0O(C1735k0.class, c1735k0);
    }

    public static /* synthetic */ void OooOo(C1735k0 c1735k0) {
        c1735k0.zzc |= 1;
        c1735k0.zzd = "1.671910402";
    }

    public static C1698j0 OooOo0o() {
        return (C1698j0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(C1735k0 c1735k0, String str) {
        str.getClass();
        c1735k0.zzc |= 8;
        c1735k0.zzg = str;
    }

    public static /* synthetic */ void OooOoO0(C1735k0 c1735k0, String str) {
        str.getClass();
        c1735k0.zzc |= 2;
        c1735k0.zze = str;
    }

    public static /* synthetic */ void OooOoOO(C1735k0 c1735k0, long j) {
        c1735k0.zzc |= 4;
        c1735k0.zzf = j;
    }

    public static /* synthetic */ void OooOoo0(C1735k0 c1735k0, long j) {
        c1735k0.zzc |= 16;
        c1735k0.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOooO0O0 == 3) {
            return new C1735k0();
        }
        if (iOooO0O0 == 4) {
            return new C1698j0(zza);
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
        synchronized (C1735k0.class) {
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
