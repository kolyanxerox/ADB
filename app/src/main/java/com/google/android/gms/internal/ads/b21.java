package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class b21 extends zz0 {
    private static final b21 zza;
    private static volatile y01 zzb;
    private int zzc;
    private String zzd = "";

    static {
        b21 b21Var = new b21();
        zza = b21Var;
        zz0.OooOO0O(b21.class, b21Var);
    }

    public static /* synthetic */ void OooOo(b21 b21Var, String str) {
        b21Var.zzc |= 1;
        b21Var.zzd = str;
    }

    public static a21 OooOo0o() {
        return (a21) zza.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iOooO0O0 == 3) {
            return new b21();
        }
        if (iOooO0O0 == 4) {
            return new a21(zza);
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
        synchronized (b21.class) {
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
