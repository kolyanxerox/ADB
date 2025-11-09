package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class x11 extends zz0 {
    private static final x11 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private jz0 zzf = jz0.f20406OooOo0o;

    static {
        x11 x11Var = new x11();
        zza = x11Var;
        zz0.OooOO0O(x11.class, x11Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", C1771l.f20739OooOo, "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new x11();
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
        synchronized (x11.class) {
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
