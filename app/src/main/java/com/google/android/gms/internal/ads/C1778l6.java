package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l6 */
/* loaded from: classes2.dex */
public final class C1778l6 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C1778l6 zzi;
    private static volatile y01 zzj;
    private int zzk;
    private C1667i5 zzm;
    private int zzn;
    private C1740k5 zzo;
    private int zzp;
    private String zzl = "";
    private int zzu = 1000;
    private int zzv = 1000;
    private int zzw = 1000;

    static {
        C1778l6 c1778l6 = new C1778l6();
        zzi = c1778l6;
        zz0.OooOO0O(C1778l6.class, c1778l6);
    }

    public static void OooOo(C1778l6 c1778l6, C1740k5 c1740k5) {
        c1778l6.getClass();
        c1778l6.zzo = c1740k5;
        c1778l6.zzk |= 8;
    }

    public static void OooOo0o(C1778l6 c1778l6, String str) {
        c1778l6.getClass();
        c1778l6.zzk |= 1;
        c1778l6.zzl = str;
    }

    public static C1778l6 OooOoO0() {
        return zzi;
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
            return new c11(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", c1771l, "zzv", c1771l, "zzw", c1771l});
        }
        if (iOooO0O0 == 3) {
            return new C1778l6();
        }
        if (iOooO0O0 == 4) {
            return new C1741k6(zzi);
        }
        if (iOooO0O0 == 5) {
            return zzi;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzj;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1778l6.class) {
            try {
                yz0Var = zzj;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzj = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
