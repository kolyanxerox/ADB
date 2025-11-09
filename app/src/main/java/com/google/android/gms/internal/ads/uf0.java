package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class uf0 extends zz0 {
    private static final uf0 zza;
    private static volatile y01 zzb;
    private h01 zzc = b11.f17344OooOoO;

    static {
        uf0 uf0Var = new uf0();
        zza = uf0Var;
        zz0.OooOO0O(uf0.class, uf0Var);
    }

    public static rf0 OooOo() {
        return (rf0) zza.OooO0oO();
    }

    public static void OooOoO(uf0 uf0Var) {
        uf0Var.zzc = b11.f17344OooOoO;
    }

    public static void OooOoO0(uf0 uf0Var, tf0 tf0Var) {
        h01 h01Var = uf0Var.zzc;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            uf0Var.zzc = h01Var.OooO0O0(size + size);
        }
        uf0Var.zzc.add(tf0Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", tf0.class});
        }
        if (iOooO0O0 == 3) {
            return new uf0();
        }
        if (iOooO0O0 == 4) {
            return new rf0(zza);
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
        synchronized (uf0.class) {
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
        return this.zzc.size();
    }
}
