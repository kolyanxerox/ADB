package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class vw0 extends zz0 {
    private static final vw0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private jz0 zzd = jz0.f20406OooOo0o;

    static {
        vw0 vw0Var = new vw0();
        zza = vw0Var;
        zz0.OooOO0O(vw0.class, vw0Var);
    }

    public static uw0 OooOo() {
        return (uw0) zza.OooO0oO();
    }

    public static vw0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (vw0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static y01 OooOoOO() {
        return zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        if (iOooO0O0 == 3) {
            return new vw0();
        }
        if (iOooO0O0 == 4) {
            return new uw0(zza);
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
        synchronized (vw0.class) {
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
        return this.zzc;
    }

    public final jz0 OooOoO() {
        return this.zzd;
    }
}
