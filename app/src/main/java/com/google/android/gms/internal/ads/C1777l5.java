package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l5 */
/* loaded from: classes2.dex */
public final class C1777l5 extends zz0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final C1777l5 zzu;
    private static volatile y01 zzv;
    private C1411b6 zzA;
    private C1814m5 zzB;
    private C2258y5 zzC;
    private C1888o5 zzD;
    private int zzE;
    private int zzF;
    private C1667i5 zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private int zzw;
    private C2221x5 zzx;
    private C2295z5 zzy;
    private C1374a6 zzz;

    static {
        C1777l5 c1777l5 = new C1777l5();
        zzu = c1777l5;
        zz0.OooOO0O(C1777l5.class, c1777l5);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
        }
        if (iOooO0O0 == 3) {
            return new C1777l5();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzu);
        }
        if (iOooO0O0 == 5) {
            return zzu;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzv;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1777l5.class) {
            try {
                yz0Var = zzv;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzv = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
