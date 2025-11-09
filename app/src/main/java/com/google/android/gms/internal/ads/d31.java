package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class d31 extends zz0 {
    private static final d31 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private d01 zzf = a01.f16868OooOoO;
    private h01 zzh = b11.f17344OooOoO;
    private jz0 zzi = jz0.f20406OooOo0o;

    static {
        d31 d31Var = new d31();
        zza = d31Var;
        zz0.OooOO0O(d31.class, d31Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", c31.class, "zzi"});
        }
        if (iOooO0O0 == 3) {
            return new d31();
        }
        if (iOooO0O0 == 4) {
            return new b31(zza);
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
        synchronized (d31.class) {
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
