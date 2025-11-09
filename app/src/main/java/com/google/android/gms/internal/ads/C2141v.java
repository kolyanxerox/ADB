package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v */
/* loaded from: classes2.dex */
public final class C2141v extends zz0 {
    private static final C2141v zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;

    static {
        C2141v c2141v = new C2141v();
        zza = c2141v;
        zz0.OooOO0O(C2141v.class, c2141v);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", C1771l.f20728OooO0oO});
        }
        if (iOooO0O0 == 3) {
            return new C2141v();
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
        synchronized (C2141v.class) {
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
