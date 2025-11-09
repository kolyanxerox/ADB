package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class l21 extends zz0 {
    private static final l21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private k21 zzd;
    private jz0 zzf;
    private jz0 zzg;
    private int zzh;
    private jz0 zzi;
    private byte zzj = 2;
    private h01 zze = b11.f17344OooOoO;

    static {
        l21 l21Var = new l21();
        zza = l21Var;
        zz0.OooOO0O(l21.class, l21Var);
    }

    public l21() {
        hz0 hz0Var = jz0.f20406OooOo0o;
        this.zzf = hz0Var;
        this.zzg = hz0Var;
        this.zzi = hz0Var;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        switch (OooOOo.OooOOO.OooO0O0(i)) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                this.zzj = zz0Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new c11(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", g21.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new l21();
            case 4:
                return new C1668i6(zza);
            case 5:
                return zza;
            case 6:
                y01 y01Var = zzb;
                if (y01Var != null) {
                    return y01Var;
                }
                synchronized (l21.class) {
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
