package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class wv0 extends zz0 {
    private static final wv0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private yv0 zze;

    static {
        wv0 wv0Var = new wv0();
        zza = wv0Var;
        zz0.OooOO0O(wv0.class, wv0Var);
    }

    public static vv0 OooOo() {
        return (vv0) zza.OooO0oO();
    }

    public static wv0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (wv0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static /* synthetic */ void OooOoo0(wv0 wv0Var, yv0 yv0Var) {
        wv0Var.zze = yv0Var;
        wv0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new wv0();
        }
        if (iOooO0O0 == 4) {
            return new vv0(zza);
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
        synchronized (wv0.class) {
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
        yv0 yv0Var = this.zze;
        return yv0Var == null ? yv0.OooOoO0() : yv0Var;
    }
}
