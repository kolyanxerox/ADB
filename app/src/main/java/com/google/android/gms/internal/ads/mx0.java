package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class mx0 extends zz0 {
    private static final mx0 zza;
    private static volatile y01 zzb;
    private String zzc = "";
    private jz0 zzd = jz0.f20406OooOo0o;
    private int zze;

    static {
        mx0 mx0Var = new mx0();
        zza = mx0Var;
        zz0.OooOO0O(mx0.class, mx0Var);
    }

    public static mx0 OooOo() {
        return zza;
    }

    public static lx0 OooOo0o() {
        return (lx0) zza.OooO0oO();
    }

    public static mx0 OooOoO0(byte[] bArr, tz0 tz0Var) {
        zz0 zz0VarOooOo0 = zz0.OooOo0(zza, bArr, bArr.length, tz0Var);
        zz0.OooOo00(zz0VarOooOo0);
        return (mx0) zz0VarOooOo0;
    }

    public static /* synthetic */ void OooOooO(mx0 mx0Var, String str) {
        str.getClass();
        mx0Var.zzc = str;
    }

    public static /* synthetic */ void OooOooo(mx0 mx0Var, jz0 jz0Var) {
        jz0Var.getClass();
        mx0Var.zzd = jz0Var;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new mx0();
        }
        if (iOooO0O0 == 4) {
            return new lx0(zza);
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
        synchronized (mx0.class) {
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

    public final fy0 OooOoO() {
        fy0 fy0VarOooO0O0 = fy0.OooO0O0(this.zze);
        return fy0VarOooO0O0 == null ? fy0.UNRECOGNIZED : fy0VarOooO0O0;
    }

    public final jz0 OooOoOO() {
        return this.zzd;
    }

    public final String OooOoo0() {
        return this.zzc;
    }
}
