package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class v21 extends zz0 {
    private static final v21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private j21 zzf;
    private l21 zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private d01 zzi = a01.f16868OooOoO;
    private String zzj = "";
    private h01 zzl = b11.f17344OooOoO;

    static {
        v21 v21Var = new v21();
        zza = v21Var;
        zz0.OooOO0O(v21.class, v21Var);
    }

    public static u21 OooOo() {
        return (u21) zza.OooO0oO();
    }

    public static void OooOoO(v21 v21Var, String str) {
        str.getClass();
        h01 h01Var = v21Var.zzl;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            v21Var.zzl = h01Var.OooO0O0(size + size);
        }
        v21Var.zzl.add(str);
    }

    public static /* synthetic */ void OooOoOO(v21 v21Var, int i) {
        v21Var.zzc |= 1;
        v21Var.zzd = i;
    }

    public static /* synthetic */ void OooOoo(v21 v21Var, String str) {
        str.getClass();
        v21Var.zzc |= 2;
        v21Var.zze = str;
    }

    public static /* synthetic */ void OooOoo0(v21 v21Var, j21 j21Var) {
        v21Var.zzf = j21Var;
        v21Var.zzc |= 4;
    }

    public static /* synthetic */ void OooOooO(v21 v21Var, int i) {
        v21Var.zzk = i - 1;
        v21Var.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        switch (OooOOo.OooOOO.OooO0O0(i)) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                this.zzm = zz0Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new c11(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", o21.f22310OooO0o, "zzl"});
            case 3:
                return new v21();
            case 4:
                return new u21(zza);
            case 5:
                return zza;
            case 6:
                y01 y01Var = zzb;
                if (y01Var != null) {
                    return y01Var;
                }
                synchronized (v21.class) {
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

    public final int OooOo0o() {
        return this.zzl.size();
    }

    public final String OooOoO0() {
        return this.zze;
    }
}
