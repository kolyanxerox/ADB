package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ui0 extends zz0 {
    private static final ui0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private si0 zzg;

    static {
        ui0 ui0Var = new ui0();
        zza = ui0Var;
        zz0.OooOO0O(ui0.class, ui0Var);
    }

    public static /* synthetic */ void OooOo(ui0 ui0Var, String str) {
        str.getClass();
        ui0Var.zzc |= 2;
        ui0Var.zze = str;
    }

    public static ti0 OooOo0o() {
        return (ti0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(ui0 ui0Var) {
        ui0Var.zzd = 1;
        ui0Var.zzc = 1 | ui0Var.zzc;
    }

    public static /* synthetic */ void OooOoO0(ui0 ui0Var, si0 si0Var) {
        ui0Var.zzg = si0Var;
        ui0Var.zzc |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", C1771l.f20741OooOo0O, "zze", "zzf", "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new ui0();
        }
        if (iOooO0O0 == 4) {
            return new ti0(zza);
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
        synchronized (ui0.class) {
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
