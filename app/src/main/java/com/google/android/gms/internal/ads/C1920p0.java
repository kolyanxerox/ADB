package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p0 */
/* loaded from: classes2.dex */
public final class C1920p0 extends zz0 {
    private static final C1920p0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private h01 zzd = b11.f17344OooOoO;
    private jz0 zze = jz0.f20406OooOo0o;
    private int zzf = 1;
    private int zzg = 1;

    static {
        C1920p0 c1920p0 = new C1920p0();
        zza = c1920p0;
        zz0.OooOO0O(C1920p0.class, c1920p0);
    }

    public static void OooOo(C1920p0 c1920p0, hz0 hz0Var) {
        h01 h01Var = c1920p0.zzd;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            c1920p0.zzd = h01Var.OooO0O0(size + size);
        }
        c1920p0.zzd.add(hz0Var);
    }

    public static C1846n0 OooOo0o() {
        return (C1846n0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(C1920p0 c1920p0, int i) {
        c1920p0.zzg = i - 1;
        c1920p0.zzc |= 4;
    }

    public static /* synthetic */ void OooOoO0(C1920p0 c1920p0, hz0 hz0Var) {
        c1920p0.zzc |= 1;
        c1920p0.zze = hz0Var;
    }

    public static /* synthetic */ void OooOoOO(C1920p0 c1920p0) {
        c1920p0.zzf = 4;
        c1920p0.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", C1771l.f20731OooOO0O, "zzg", C1771l.f20722OooO});
        }
        if (iOooO0O0 == 3) {
            return new C1920p0();
        }
        if (iOooO0O0 == 4) {
            return new C1846n0(zza);
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
        synchronized (C1920p0.class) {
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
