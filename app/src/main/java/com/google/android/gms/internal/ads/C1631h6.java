package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h6 */
/* loaded from: classes2.dex */
public final class C1631h6 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C1631h6 zzf;
    private static volatile y01 zzg;
    private int zzh;
    private String zzi = "";
    private h01 zzj = b11.f17344OooOoO;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C1631h6 c1631h6 = new C1631h6();
        zzf = c1631h6;
        zz0.OooOO0O(C1631h6.class, c1631h6);
    }

    public static C1631h6 OooOo() {
        return zzf;
    }

    public static void OooOo0o(C1631h6 c1631h6, String str) {
        c1631h6.getClass();
        str.getClass();
        c1631h6.zzh |= 1;
        c1631h6.zzi = str;
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
            return new c11(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", C1520e6.class, "zzk", c1771l, "zzl", c1771l, "zzm", c1771l});
        }
        if (iOooO0O0 == 3) {
            return new C1631h6();
        }
        if (iOooO0O0 == 4) {
            return new C1594g6(zzf);
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
        synchronized (C1631h6.class) {
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
