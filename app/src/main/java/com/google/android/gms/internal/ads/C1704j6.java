package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j6 */
/* loaded from: classes2.dex */
public final class C1704j6 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C1704j6 zzg;
    private static volatile y01 zzh;
    private int zzi;
    private int zzj;
    private C1667i5 zzk;
    private C1667i5 zzl;
    private C1667i5 zzm;
    private h01 zzn = b11.f17344OooOoO;
    private int zzo;

    static {
        C1704j6 c1704j6 = new C1704j6();
        zzg = c1704j6;
        zz0.OooOO0O(C1704j6.class, c1704j6);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", C1667i5.class, "zzo"});
        }
        if (iOooO0O0 == 3) {
            return new C1704j6();
        }
        if (iOooO0O0 == 4) {
            return new C1668i6(zzg);
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
        synchronized (C1704j6.class) {
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
