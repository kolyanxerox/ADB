package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z5 */
/* loaded from: classes2.dex */
public final class C2295z5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C2295z5 zzg;
    private static volatile y01 zzh;
    private int zzi;
    private int zzj = 1000;
    private C1851n5 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        C2295z5 c2295z5 = new C2295z5();
        zzg = c2295z5;
        zz0.OooOO0O(C2295z5.class, c2295z5);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", C1771l.f20740OooOo00, "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOooO0O0 == 3) {
            return new C2295z5();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzg);
        }
        if (iOooO0O0 == 5) {
            return zzg;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzh;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C2295z5.class) {
            try {
                yz0Var = zzh;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzh = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
