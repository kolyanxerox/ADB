package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x4 */
/* loaded from: classes2.dex */
public final class C2220x4 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C2220x4 zzc;
    private static volatile y01 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2220x4 c2220x4 = new C2220x4();
        zzc = c2220x4;
        zz0.OooOO0O(C2220x4.class, c2220x4);
    }

    public static void OooOo(C2220x4 c2220x4, int i) {
        c2220x4.getClass();
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i2 = 2;
            }
        }
        c2220x4.zzg = i2;
        c2220x4.zze |= 2;
    }

    public static C2146v4 OooOo0o() {
        return (C2146v4) zzc.OooO0oO();
    }

    public static void OooOoO0(C2220x4 c2220x4, int i) {
        c2220x4.getClass();
        c2220x4.zzf = OooOOo.OooOOO.OooO0O0(i);
        c2220x4.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", C1771l.f20732OooOOO, "zzg", C1771l.f20733OooOOO0});
        }
        if (iOooO0O0 == 3) {
            return new C2220x4();
        }
        if (iOooO0O0 == 4) {
            return new C2146v4(zzc);
        }
        if (iOooO0O0 == 5) {
            return zzc;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzd;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C2220x4.class) {
            try {
                yz0Var = zzd;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzd = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
