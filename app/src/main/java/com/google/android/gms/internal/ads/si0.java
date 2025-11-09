package com.google.android.gms.internal.ads;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class si0 extends zz0 {
    private static final si0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private d01 zzd = a01.f16868OooOoO;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        si0 si0Var = new si0();
        zza = si0Var;
        zz0.OooOO0O(si0.class, si0Var);
    }

    public static /* synthetic */ void OooOo(si0 si0Var, String str) {
        str.getClass();
        si0Var.zzc |= 1;
        si0Var.zze = str;
    }

    public static ri0 OooOo0o() {
        return (ri0) zza.OooO0oO();
    }

    public static void OooOoO0(si0 si0Var) {
        RandomAccess randomAccess = si0Var.zzd;
        if (!((cz0) randomAccess).f18106OooOo0O) {
            a01 a01Var = (a01) randomAccess;
            int i = a01Var.f16870OooOo;
            si0Var.zzd = a01Var.OooO0O0(i + i);
        }
        ((a01) si0Var.zzd).OooO0oO(2);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", C1771l.OooOo0, "zze", "zzf", "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new si0();
        }
        if (iOooO0O0 == 4) {
            return new ri0(zza);
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
        synchronized (si0.class) {
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
}
