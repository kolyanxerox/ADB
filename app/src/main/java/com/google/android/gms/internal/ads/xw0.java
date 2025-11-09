package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class xw0 extends zz0 {
    private static final xw0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;

    static {
        xw0 xw0Var = new xw0();
        zza = xw0Var;
        zz0.OooOO0O(xw0.class, xw0Var);
    }

    public static xw0 OooOoO(jz0 jz0Var, tz0 tz0Var) {
        return (xw0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static ww0 OooOoO0() {
        return (ww0) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        }
        if (iOooO0O0 == 3) {
            return new xw0();
        }
        if (iOooO0O0 == 4) {
            return new ww0(zza);
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
        synchronized (xw0.class) {
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

    public final int OooOo() {
        return this.zzd;
    }

    public final int OooOo0o() {
        return this.zzc;
    }
}
