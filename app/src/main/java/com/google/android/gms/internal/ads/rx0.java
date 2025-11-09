package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;

/* loaded from: classes2.dex */
public final class rx0 extends zz0 {
    private static final rx0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private h01 zzd = b11.f17344OooOoO;

    static {
        rx0 rx0Var = new rx0();
        zza = rx0Var;
        zz0.OooOO0O(rx0.class, rx0Var);
    }

    public static ox0 OooOoO0() {
        return (ox0) zza.OooO0oO();
    }

    public static rx0 OooOoOO(ByteArrayInputStream byteArrayInputStream, tz0 tz0Var) throws k01 {
        zz0 zz0VarOooOOOo = zz0.OooOOOo(zza, new mz0(byteArrayInputStream), tz0Var);
        zz0.OooOo00(zz0VarOooOOOo);
        return (rx0) zz0VarOooOOOo;
    }

    public static void OooOoo(rx0 rx0Var, qx0 qx0Var) {
        h01 h01Var = rx0Var.zzd;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            rx0Var.zzd = h01Var.OooO0O0(size + size);
        }
        rx0Var.zzd.add(qx0Var);
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", qx0.class});
        }
        if (iOooO0O0 == 3) {
            return new rx0();
        }
        if (iOooO0O0 == 4) {
            return new ox0(zza);
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
        synchronized (rx0.class) {
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

    public final int OooOo() {
        return this.zzc;
    }

    public final int OooOo0o() {
        return this.zzd.size();
    }

    public final qx0 OooOoO(int i) {
        return (qx0) this.zzd.get(i);
    }

    public final h01 OooOoo0() {
        return this.zzd;
    }
}
