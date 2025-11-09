package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class w11 extends zz0 {
    private static final w11 zza;
    private static volatile y01 zzb;
    private h01 zzc = b11.f17344OooOoO;

    static {
        w11 w11Var = new w11();
        zza = w11Var;
        zz0.OooOO0O(w11.class, w11Var);
    }

    public static void OooOo(w11 w11Var, u11 u11Var) {
        h01 h01Var = w11Var.zzc;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            w11Var.zzc = h01Var.OooO0O0(size + size);
        }
        w11Var.zzc.add(u11Var);
    }

    public static v11 OooOo0o() {
        return (v11) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", u11.class});
        }
        if (iOooO0O0 == 3) {
            return new w11();
        }
        if (iOooO0O0 == 4) {
            return new v11(zza);
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
        synchronized (w11.class) {
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
