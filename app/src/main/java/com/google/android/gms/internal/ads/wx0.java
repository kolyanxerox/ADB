package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class wx0 extends zz0 {
    private static final wx0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private h01 zzd = b11.f17344OooOoO;

    static {
        wx0 wx0Var = new wx0();
        zza = wx0Var;
        zz0.OooOO0O(wx0.class, wx0Var);
    }

    public static void OooOo(wx0 wx0Var, vx0 vx0Var) {
        h01 h01Var = wx0Var.zzd;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            wx0Var.zzd = h01Var.OooO0O0(size + size);
        }
        wx0Var.zzd.add(vx0Var);
    }

    public static sx0 OooOo0o() {
        return (sx0) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", vx0.class});
        }
        if (iOooO0O0 == 3) {
            return new wx0();
        }
        if (iOooO0O0 == 4) {
            return new sx0(zza);
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
        synchronized (wx0.class) {
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
