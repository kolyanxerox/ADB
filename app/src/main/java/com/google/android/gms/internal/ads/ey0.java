package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ey0 extends zz0 {
    private static final ey0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private String zzd = "";
    private mx0 zze;

    static {
        ey0 ey0Var = new ey0();
        zza = ey0Var;
        zz0.OooOO0O(ey0.class, ey0Var);
    }

    public static dy0 OooOo() {
        return (dy0) zza.OooO0oO();
    }

    public static ey0 OooOoO(jz0 jz0Var, tz0 tz0Var) {
        return (ey0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    public static ey0 OooOoO0() {
        return zza;
    }

    public static /* synthetic */ void OooOoo(ey0 ey0Var, String str) {
        str.getClass();
        ey0Var.zzd = str;
    }

    public static /* synthetic */ void OooOoo0(ey0 ey0Var, mx0 mx0Var) {
        mx0Var.getClass();
        ey0Var.zze = mx0Var;
        ey0Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new ey0();
        }
        if (iOooO0O0 == 4) {
            return new dy0(zza);
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
        synchronized (ey0.class) {
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

    public final mx0 OooOo0o() {
        mx0 mx0Var = this.zze;
        return mx0Var == null ? mx0.OooOo() : mx0Var;
    }

    public final String OooOoOO() {
        return this.zzd;
    }
}
