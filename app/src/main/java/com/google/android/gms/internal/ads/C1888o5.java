package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o5 */
/* loaded from: classes2.dex */
public final class C1888o5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1888o5 zze;
    private static volatile y01 zzf;
    private int zzg;
    private C1740k5 zzh;
    private int zzi = 1000;
    private C1851n5 zzj;
    private C1667i5 zzk;

    static {
        C1888o5 c1888o5 = new C1888o5();
        zze = c1888o5;
        zz0.OooOO0O(C1888o5.class, c1888o5);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", C1771l.f20740OooOo00, "zzj", "zzk"});
        }
        if (iOooO0O0 == 3) {
            return new C1888o5();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zze);
        }
        if (iOooO0O0 == 5) {
            return zze;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzf;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1888o5.class) {
            try {
                yz0Var = zzf;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzf = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
