package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y */
/* loaded from: classes2.dex */
public final class C2252y extends zz0 {
    private static final C2252y zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        C2252y c2252y = new C2252y();
        zza = c2252y;
        zz0.OooOO0O(C2252y.class, c2252y);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", C1771l.f20727OooO0o0, "zze"});
        }
        if (iOooO0O0 == 3) {
            return new C2252y();
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
        synchronized (C2252y.class) {
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
