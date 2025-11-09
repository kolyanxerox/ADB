package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class uv0 extends zz0 {
    private static final uv0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private jz0 zze = jz0.f20406OooOo0o;
    private yv0 zzf;

    static {
        uv0 uv0Var = new uv0();
        zza = uv0Var;
        zz0.OooOO0O(uv0.class, uv0Var);
    }

    public static tv0 OooOo() {
        return (tv0) zza.OooO0oO();
    }

    public static uv0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (uv0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static y01 OooOoo0() {
        return zza.OooO0oo();
    }

    public static /* synthetic */ void OooOooO(uv0 uv0Var, yv0 yv0Var) {
        uv0Var.zzf = yv0Var;
        uv0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOooO0O0 == 3) {
            return new uv0();
        }
        if (iOooO0O0 == 4) {
            return new tv0(zza);
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
        synchronized (uv0.class) {
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

    public final yv0 OooOoO() {
        yv0 yv0Var = this.zzf;
        return yv0Var == null ? yv0.OooOoO0() : yv0Var;
    }

    public final jz0 OooOoOO() {
        return this.zze;
    }
}
