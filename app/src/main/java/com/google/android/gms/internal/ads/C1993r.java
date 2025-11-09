package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r */
/* loaded from: classes2.dex */
public final class C1993r extends zz0 {
    private static final C1993r zza;
    private static volatile y01 zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        C1993r c1993r = new C1993r();
        zza = c1993r;
        zz0.OooOO0O(C1993r.class, c1993r);
    }

    public static C1993r OooOo() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOooO0O0 == 3) {
            return new C1993r();
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
        synchronized (C1993r.class) {
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

    public final int OooOo0o() {
        return this.zze;
    }

    public final boolean OooOoO() {
        return this.zzg;
    }

    public final boolean OooOoO0() {
        return this.zzd;
    }

    public final boolean OooOoOO() {
        return this.zzf;
    }

    public final boolean OooOoo0() {
        return this.zzh;
    }
}
