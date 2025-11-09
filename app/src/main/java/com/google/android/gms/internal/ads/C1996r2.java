package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r2 */
/* loaded from: classes2.dex */
public final class C1996r2 extends zz0 {
    private static final C1996r2 zza;
    private static volatile y01 zzb;
    private int zzc;
    private C2070t2 zzd;
    private jz0 zze;
    private jz0 zzf;

    static {
        C1996r2 c1996r2 = new C1996r2();
        zza = c1996r2;
        zz0.OooOO0O(C1996r2.class, c1996r2);
    }

    public C1996r2() {
        hz0 hz0Var = jz0.f20406OooOo0o;
        this.zze = hz0Var;
        this.zzf = hz0Var;
    }

    public static C1996r2 OooOo0o(hz0 hz0Var, tz0 tz0Var) {
        return (C1996r2) zz0.OooOOOO(zza, hz0Var, tz0Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new C1996r2();
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
        synchronized (C1996r2.class) {
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

    public final C2070t2 OooOo() {
        C2070t2 c2070t2 = this.zzd;
        return c2070t2 == null ? C2070t2.OooOoOO() : c2070t2;
    }

    public final jz0 OooOoO() {
        return this.zze;
    }

    public final jz0 OooOoO0() {
        return this.zzf;
    }
}
