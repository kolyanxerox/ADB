package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n5 */
/* loaded from: classes2.dex */
public final class C1851n5 extends zz0 {
    public static final int zza = 1;
    private static final C1851n5 zzb;
    private static volatile y01 zzc;
    private int zzd;
    private int zze;

    static {
        C1851n5 c1851n5 = new C1851n5();
        zzb = c1851n5;
        zz0.OooOO0O(C1851n5.class, c1851n5);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C1771l.f20735OooOOOo});
        }
        if (iOooO0O0 == 3) {
            return new C1851n5();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzb);
        }
        if (iOooO0O0 == 5) {
            return zzb;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzc;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1851n5.class) {
            try {
                yz0Var = zzc;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzc = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
