package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class m21 extends zz0 {
    private static final m21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        m21 m21Var = new m21();
        zza = m21Var;
        zz0.OooOO0O(m21.class, m21Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            C1771l c1771l = C1771l.f20749OooOooo;
            return new c11(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", c1771l, "zze", "zzf", c1771l});
        }
        if (iOooO0O0 == 3) {
            return new m21();
        }
        if (iOooO0O0 == 4) {
            return new C1668i6(zza);
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
        synchronized (m21.class) {
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
