package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class x21 extends zz0 {
    private static final x21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        x21 x21Var = new x21();
        zza = x21Var;
        zz0.OooOO0O(x21.class, x21Var);
    }

    public static /* synthetic */ void OooOo(x21 x21Var, String str) {
        x21Var.zzc |= 1;
        x21Var.zzd = str;
    }

    public static w21 OooOo0o() {
        return (w21) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(x21 x21Var, boolean z) {
        x21Var.zzc |= 4;
        x21Var.zzf = z;
    }

    public static /* synthetic */ void OooOoO0(x21 x21Var, long j) {
        x21Var.zzc |= 2;
        x21Var.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", o21.f22312OooO0oO, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOooO0O0 == 3) {
            return new x21();
        }
        if (iOooO0O0 == 4) {
            return new w21(zza);
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
        synchronized (x21.class) {
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
