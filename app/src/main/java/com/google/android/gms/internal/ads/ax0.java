package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ax0 extends zz0 {
    private static final ax0 zza;
    private static volatile y01 zzb;

    static {
        ax0 ax0Var = new ax0();
        zza = ax0Var;
        zz0.OooOO0O(ax0.class, ax0Var);
    }

    public static void OooOo(jz0 jz0Var, tz0 tz0Var) {
    }

    public static ax0 OooOo0o() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0000", null);
        }
        if (iOooO0O0 == 3) {
            return new ax0();
        }
        if (iOooO0O0 == 4) {
            return new C1668i6(zza);
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
        synchronized (ax0.class) {
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
