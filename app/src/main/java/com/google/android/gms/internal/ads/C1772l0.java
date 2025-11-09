package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l0 */
/* loaded from: classes2.dex */
public final class C1772l0 extends zz0 {
    private static final C1772l0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private jz0 zzf = jz0.f20406OooOo0o;

    static {
        C1772l0 c1772l0 = new C1772l0();
        zza = c1772l0;
        zz0.OooOO0O(C1772l0.class, c1772l0);
    }

    public static C1772l0 OooOo() {
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
            return new c11(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new C1772l0();
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
        synchronized (C1772l0.class) {
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

    public final long OooOo0o() {
        return this.zzd;
    }

    public final String OooOoO() {
        return this.zze;
    }

    public final jz0 OooOoO0() {
        return this.zzf;
    }

    public final boolean OooOoOO() {
        return (this.zzc & 1) != 0;
    }
}
