package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class g21 extends zz0 {
    private static final g21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private jz0 zzd;
    private jz0 zze;
    private byte zzf = 2;

    static {
        g21 g21Var = new g21();
        zza = g21Var;
        zz0.OooOO0O(g21.class, g21Var);
    }

    public g21() {
        hz0 hz0Var = jz0.f20406OooOo0o;
        this.zzd = hz0Var;
        this.zze = hz0Var;
    }

    public static /* synthetic */ void OooOo(g21 g21Var, hz0 hz0Var) {
        g21Var.zzc |= 1;
        g21Var.zzd = hz0Var;
    }

    public static f21 OooOo0o() {
        return (f21) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO0(g21 g21Var, hz0 hz0Var) {
        g21Var.zzc |= 2;
        g21Var.zze = hz0Var;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        switch (OooOOo.OooOOO.OooO0O0(i)) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = zz0Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new c11(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new g21();
            case 4:
                return new f21(zza);
            case 5:
                return zza;
            case 6:
                y01 y01Var = zzb;
                if (y01Var != null) {
                    return y01Var;
                }
                synchronized (g21.class) {
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
            default:
                throw null;
        }
    }
}
