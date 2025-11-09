package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class j21 extends zz0 {
    private static final j21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private i21 zzd;
    private jz0 zzf;
    private jz0 zzg;
    private int zzh;
    private byte zzi = 2;
    private h01 zze = b11.f17344OooOoO;

    static {
        j21 j21Var = new j21();
        zza = j21Var;
        zz0.OooOO0O(j21.class, j21Var);
    }

    public j21() {
        hz0 hz0Var = jz0.f20406OooOo0o;
        this.zzf = hz0Var;
        this.zzg = hz0Var;
    }

    public static void OooOo(j21 j21Var, g21 g21Var) {
        h01 h01Var = j21Var.zze;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            j21Var.zze = h01Var.OooO0O0(size + size);
        }
        j21Var.zze.add(g21Var);
    }

    public static h21 OooOo0o() {
        return (h21) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        switch (OooOOo.OooOOO.OooO0O0(i)) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                this.zzi = zz0Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new c11(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", g21.class, "zzf", "zzg", "zzh"});
            case 3:
                return new j21();
            case 4:
                return new h21(zza);
            case 5:
                return zza;
            case 6:
                y01 y01Var = zzb;
                if (y01Var != null) {
                    return y01Var;
                }
                synchronized (j21.class) {
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
