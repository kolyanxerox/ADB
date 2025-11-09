package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w5 */
/* loaded from: classes2.dex */
public final class C2184w5 extends zz0 {
    public static final int zza = 1;
    private static final C2184w5 zzb;
    private static volatile y01 zzc;
    private h01 zzd = b11.f17344OooOoO;

    static {
        C2184w5 c2184w5 = new C2184w5();
        zzb = c2184w5;
        zz0.OooOO0O(C2184w5.class, c2184w5);
    }

    public static void OooOo(C2184w5 c2184w5, C1962q5 c1962q5) {
        c2184w5.getClass();
        h01 h01Var = c2184w5.zzd;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            c2184w5.zzd = h01Var.OooO0O0(size + size);
        }
        c2184w5.zzd.add(c1962q5);
    }

    public static C1999r5 OooOo0o() {
        return (C1999r5) zzb.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C1962q5.class});
        }
        if (iOooO0O0 == 3) {
            return new C2184w5();
        }
        if (iOooO0O0 == 4) {
            return new C1999r5(zzb);
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
        synchronized (C2184w5.class) {
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
