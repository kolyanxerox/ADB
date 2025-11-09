package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r6 */
/* loaded from: classes2.dex */
public final class C2000r6 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C2000r6 zzc;
    private static volatile y01 zzd;
    private int zze;
    private int zzf;
    private d01 zzg = a01.f16868OooOoO;

    static {
        C2000r6 c2000r6 = new C2000r6();
        zzc = c2000r6;
        zz0.OooOO0O(C2000r6.class, c2000r6);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", C1771l.f20740OooOo00, "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new C2000r6();
        }
        if (iOooO0O0 == 4) {
            return new C1668i6(zzc);
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
        synchronized (C2000r6.class) {
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
