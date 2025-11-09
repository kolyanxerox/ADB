package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e5 */
/* loaded from: classes2.dex */
public final class C1519e5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final C1519e5 zzl;
    private static volatile y01 zzm;
    private int zzA;
    private int zzB;
    private C1556f5 zzC;
    private int zzn;
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        C1519e5 c1519e5 = new C1519e5();
        zzl = c1519e5;
        zz0.OooOO0O(C1519e5.class, c1519e5);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            C1771l c1771l = C1771l.f20740OooOo00;
            return new c11(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", c1771l, "zzp", c1771l, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (iOooO0O0 == 3) {
            return new C1519e5();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzl);
        }
        if (iOooO0O0 == 5) {
            return zzl;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzm;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1519e5.class) {
            try {
                yz0Var = zzm;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzm = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
