package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f6 */
/* loaded from: classes2.dex */
public final class C1557f6 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1557f6 zzd;
    private static volatile y01 zze;
    private int zzf;
    private String zzg = "";
    private h01 zzh = b11.f17344OooOoO;
    private int zzi;

    static {
        C1557f6 c1557f6 = new C1557f6();
        zzd = c1557f6;
        zz0.OooOO0O(C1557f6.class, c1557f6);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", C1520e6.class, "zzi", C1771l.f20740OooOo00});
        }
        if (iOooO0O0 == 3) {
            return new C1557f6();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzd);
        }
        if (iOooO0O0 == 5) {
            return zzd;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zze;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1557f6.class) {
            try {
                yz0Var = zze;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zze = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
