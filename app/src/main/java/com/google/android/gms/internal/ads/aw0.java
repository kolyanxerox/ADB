package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class aw0 extends zz0 {
    private static final aw0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private ew0 zze;
    private ex0 zzf;

    static {
        aw0 aw0Var = new aw0();
        zza = aw0Var;
        zz0.OooOO0O(aw0.class, aw0Var);
    }

    public static zv0 OooOo() {
        return (zv0) zza.OooO0oO();
    }

    public static aw0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (aw0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static /* synthetic */ void OooOoo(aw0 aw0Var, ew0 ew0Var) {
        aw0Var.zze = ew0Var;
        aw0Var.zzc |= 1;
    }

    public static y01 OooOoo0() {
        return zza.OooO0oo();
    }

    public static /* synthetic */ void OooOooO(aw0 aw0Var, ex0 ex0Var) {
        aw0Var.zzf = ex0Var;
        aw0Var.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new aw0();
        }
        if (iOooO0O0 == 4) {
            return new zv0(zza);
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
        synchronized (aw0.class) {
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

    public final ew0 OooOoO() {
        ew0 ew0Var = this.zze;
        return ew0Var == null ? ew0.OooOoO0() : ew0Var;
    }

    public final ex0 OooOoOO() {
        ex0 ex0Var = this.zzf;
        return ex0Var == null ? ex0.OooOoO0() : ex0Var;
    }
}
