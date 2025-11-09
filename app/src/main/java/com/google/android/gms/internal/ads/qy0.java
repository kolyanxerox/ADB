package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class qy0 extends zz0 {
    private static final qy0 zza;
    private static volatile y01 zzb;
    private int zzc;

    static {
        qy0 qy0Var = new qy0();
        zza = qy0Var;
        zz0.OooOO0O(qy0.class, qy0Var);
    }

    public static qy0 OooOo() {
        return zza;
    }

    public static qy0 OooOoO0(jz0 jz0Var, tz0 tz0Var) {
        return (qy0) zz0.OooOOOO(zza, jz0Var, tz0Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (iOooO0O0 == 3) {
            return new qy0();
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
        synchronized (qy0.class) {
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

    public final int OooOo0o() {
        return this.zzc;
    }
}
