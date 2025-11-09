package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ew0 extends zz0 {
    private static final ew0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private iw0 zze;
    private jz0 zzf = jz0.f20406OooOo0o;

    static {
        ew0 ew0Var = new ew0();
        zza = ew0Var;
        zz0.OooOO0O(ew0.class, ew0Var);
    }

    public static dw0 OooOo() {
        return (dw0) zza.OooO0oO();
    }

    public static ew0 OooOoO0() {
        return zza;
    }

    public static /* synthetic */ void OooOoo(ew0 ew0Var, iw0 iw0Var) {
        ew0Var.zze = iw0Var;
        ew0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new ew0();
        }
        if (iOooO0O0 == 4) {
            return new dw0(zza);
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
        synchronized (ew0.class) {
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
        return this.zzd;
    }

    public final iw0 OooOoO() {
        iw0 iw0Var = this.zze;
        return iw0Var == null ? iw0.OooOoO0() : iw0Var;
    }

    public final jz0 OooOoOO() {
        return this.zzf;
    }
}
