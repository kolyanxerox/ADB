package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ay0 extends zz0 {
    private static final ay0 zza;
    private static volatile y01 zzb;
    private String zzc = "";

    static {
        ay0 ay0Var = new ay0();
        zza = ay0Var;
        zz0.OooOO0O(ay0.class, ay0Var);
    }

    public static ay0 OooOo() {
        return zza;
    }

    public static zx0 OooOo0o() {
        return (zx0) zza.OooO0oO();
    }

    public static ay0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (ay0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static /* synthetic */ void OooOoOO(ay0 ay0Var, String str) {
        str.getClass();
        ay0Var.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (iOooO0O0 == 3) {
            return new ay0();
        }
        if (iOooO0O0 == 4) {
            return new zx0(zza);
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
        synchronized (ay0.class) {
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

    public final String OooOoO() {
        return this.zzc;
    }
}
