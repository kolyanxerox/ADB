package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t */
/* loaded from: classes2.dex */
public final class C2067t extends zz0 {
    public static final /* synthetic */ int zza = 0;
    private static final C2067t zzb;
    private static volatile y01 zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        C2067t c2067t = new C2067t();
        zzb = c2067t;
        zz0.OooOO0O(C2067t.class, c2067t);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOooO0O0 == 3) {
            return new C2067t();
        }
        if (iOooO0O0 == 4) {
            return new C1845n(zzb);
        }
        if (iOooO0O0 == 5) {
            return zzb;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzc;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C2067t.class) {
            try {
                yz0Var = zzc;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzc = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
