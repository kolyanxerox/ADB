package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class nw0 extends zz0 {
    private static final nw0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private pw0 zzd;
    private int zze;

    static {
        nw0 nw0Var = new nw0();
        zza = nw0Var;
        zz0.OooOO0O(nw0.class, nw0Var);
    }

    public static mw0 OooOo() {
        return (mw0) zza.OooO0oO();
    }

    public static nw0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (nw0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static /* synthetic */ void OooOoo0(nw0 nw0Var, pw0 pw0Var) {
        nw0Var.zzd = pw0Var;
        nw0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new nw0();
        }
        if (iOooO0O0 == 4) {
            return new mw0(zza);
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
        synchronized (nw0.class) {
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
        return this.zze;
    }

    public final pw0 OooOoO() {
        pw0 pw0Var = this.zzd;
        return pw0Var == null ? pw0.OooOoO0() : pw0Var;
    }
}
