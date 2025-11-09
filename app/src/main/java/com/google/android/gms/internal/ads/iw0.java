package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class iw0 extends zz0 {
    private static final iw0 zza;
    private static volatile y01 zzb;
    private int zzc;

    static {
        iw0 iw0Var = new iw0();
        zza = iw0Var;
        zz0.OooOO0O(iw0.class, iw0Var);
    }

    public static hw0 OooOo() {
        return (hw0) zza.OooO0oO();
    }

    public static iw0 OooOoO0() {
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
            return new c11(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (iOooO0O0 == 3) {
            return new iw0();
        }
        if (iOooO0O0 == 4) {
            return new hw0(zza);
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
        synchronized (iw0.class) {
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
}
