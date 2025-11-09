package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x5 */
/* loaded from: classes2.dex */
public final class C2221x5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C2221x5 zzf;
    private static volatile y01 zzg;
    private int zzh;
    private int zzi = 1000;
    private C1851n5 zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        C2221x5 c2221x5 = new C2221x5();
        zzf = c2221x5;
        zz0.OooOO0O(C2221x5.class, c2221x5);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", C1771l.f20740OooOo00, "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOooO0O0 == 3) {
            return new C2221x5();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzf);
        }
        if (iOooO0O0 == 5) {
            return zzf;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzg;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C2221x5.class) {
            try {
                yz0Var = zzg;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzg = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
