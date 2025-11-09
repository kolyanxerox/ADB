package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w */
/* loaded from: classes2.dex */
public final class C2178w extends zz0 {
    private static final C2178w zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        C2178w c2178w = new C2178w();
        zza = c2178w;
        zz0.OooOO0O(C2178w.class, c2178w);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            C1771l c1771l = C1771l.f20730OooOO0;
            return new c11(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", c1771l, "zzf", c1771l});
        }
        if (iOooO0O0 == 3) {
            return new C2178w();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zza);
        }
        if (iOooO0O0 == 5) {
            return zza;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzb;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C2178w.class) {
            try {
                yz0Var = zzb;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzb = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
