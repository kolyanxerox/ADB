package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t2 */
/* loaded from: classes2.dex */
public final class C2070t2 extends zz0 {
    private static final C2070t2 zza;
    private static volatile y01 zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        C2070t2 c2070t2 = new C2070t2();
        zza = c2070t2;
        zz0.OooOO0O(C2070t2.class, c2070t2);
    }

    public static C2033s2 OooOoO() {
        return (C2033s2) zza.OooO0oO();
    }

    public static C2070t2 OooOoOO() {
        return zza;
    }

    public static C2070t2 OooOoo(hz0 hz0Var, tz0 tz0Var) {
        return (C2070t2) zz0.OooOOOO(zza, hz0Var, tz0Var);
    }

    public static C2070t2 OooOoo0(hz0 hz0Var) throws k01 {
        C2070t2 c2070t2 = zza;
        tz0 tz0Var = tz0.f24541OooO00o;
        a11 a11Var = a11.f16875OooO0OO;
        zz0 zz0VarOooOOOO = zz0.OooOOOO(c2070t2, hz0Var, tz0.f24542OooO0O0);
        zz0.OooOo00(zz0VarOooOOOO);
        return (C2070t2) zz0VarOooOOOO;
    }

    public static /* synthetic */ void Oooo0(C2070t2 c2070t2, long j) {
        c2070t2.zzc |= 16;
        c2070t2.zzh = j;
    }

    public static /* synthetic */ void Oooo000(C2070t2 c2070t2, String str) {
        str.getClass();
        c2070t2.zzc |= 2;
        c2070t2.zze = str;
    }

    public static /* synthetic */ void Oooo00O(C2070t2 c2070t2, long j) {
        c2070t2.zzc |= 8;
        c2070t2.zzg = j;
    }

    public static /* synthetic */ void Oooo00o(C2070t2 c2070t2, long j) {
        c2070t2.zzc |= 4;
        c2070t2.zzf = j;
    }

    public static /* synthetic */ void Oooo0O0(C2070t2 c2070t2, String str) {
        str.getClass();
        c2070t2.zzc |= 1;
        c2070t2.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOooO0O0 == 3) {
            return new C2070t2();
        }
        if (iOooO0O0 == 4) {
            return new C2033s2(zza);
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
        synchronized (C2070t2.class) {
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

    public final long OooOo() {
        return this.zzf;
    }

    public final long OooOo0o() {
        return this.zzg;
    }

    public final long OooOoO0() {
        return this.zzh;
    }

    public final String OooOooO() {
        return this.zze;
    }

    public final String OooOooo() {
        return this.zzd;
    }
}
