package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t5 */
/* loaded from: classes2.dex */
public final class C2073t5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C2073t5 zzc;
    private static volatile y01 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2073t5 c2073t5 = new C2073t5();
        zzc = c2073t5;
        zz0.OooOO0O(C2073t5.class, c2073t5);
    }

    public static C2073t5 OooOo() {
        return zzc;
    }

    public static C2036s5 OooOo0o() {
        return (C2036s5) zzc.OooO0oO();
    }

    public static void OooOoO(C2073t5 c2073t5, int i) {
        c2073t5.zze |= 2;
        c2073t5.zzg = i;
    }

    public static void OooOoO0(C2073t5 c2073t5, boolean z) {
        c2073t5.zze |= 1;
        c2073t5.zzf = z;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new C2073t5();
        }
        if (iOooO0O0 == 4) {
            return new C2036s5(zzc);
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
        synchronized (C2073t5.class) {
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
