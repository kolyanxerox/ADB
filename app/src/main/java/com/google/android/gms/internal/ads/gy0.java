package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gy0 extends zz0 {
    public static final /* synthetic */ int zza = 0;
    private static final gy0 zzb;
    private static volatile y01 zzc;
    private String zzd = "";
    private h01 zze = b11.f17344OooOoO;

    static {
        gy0 gy0Var = new gy0();
        zzb = gy0Var;
        zz0.OooOO0O(gy0.class, gy0Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", nx0.class});
        }
        if (iOooO0O0 == 3) {
            return new gy0();
        }
        if (iOooO0O0 == 4) {
            return new C1668i6(zzb);
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
        synchronized (gy0.class) {
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
