package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p */
/* loaded from: classes2.dex */
public final class C1919p extends zz0 {
    private static final C1919p zza;
    private static volatile y01 zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        C1919p c1919p = new C1919p();
        zza = c1919p;
        zz0.OooOO0O(C1919p.class, c1919p);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new C1919p();
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
        synchronized (C1919p.class) {
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
