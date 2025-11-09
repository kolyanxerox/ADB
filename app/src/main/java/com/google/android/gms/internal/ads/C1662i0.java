package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i0 */
/* loaded from: classes2.dex */
public final class C1662i0 extends zz0 {
    private static final C1662i0 zza;
    private static volatile y01 zzb;
    private int zzc;
    private jz0 zzd;
    private jz0 zze;
    private jz0 zzf;
    private jz0 zzg;

    static {
        C1662i0 c1662i0 = new C1662i0();
        zza = c1662i0;
        zz0.OooOO0O(C1662i0.class, c1662i0);
    }

    public C1662i0() {
        hz0 hz0Var = jz0.f20406OooOo0o;
        this.zzd = hz0Var;
        this.zze = hz0Var;
        this.zzf = hz0Var;
        this.zzg = hz0Var;
    }

    public static C1662i0 OooOo(byte[] bArr, tz0 tz0Var) throws k01 {
        zz0 zz0VarOooOo0 = zz0.OooOo0(zza, bArr, bArr.length, tz0Var);
        zz0.OooOo00(zz0VarOooOo0);
        return (C1662i0) zz0VarOooOo0;
    }

    public static C1625h0 OooOo0o() {
        return (C1625h0) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoo(C1662i0 c1662i0, hz0 hz0Var) {
        c1662i0.zzc |= 1;
        c1662i0.zzd = hz0Var;
    }

    public static /* synthetic */ void OooOooO(C1662i0 c1662i0, hz0 hz0Var) {
        c1662i0.zzc |= 2;
        c1662i0.zze = hz0Var;
    }

    public static /* synthetic */ void OooOooo(C1662i0 c1662i0, hz0 hz0Var) {
        c1662i0.zzc |= 8;
        c1662i0.zzg = hz0Var;
    }

    public static /* synthetic */ void Oooo000(C1662i0 c1662i0, hz0 hz0Var) {
        c1662i0.zzc |= 4;
        c1662i0.zzf = hz0Var;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOooO0O0 == 3) {
            return new C1662i0();
        }
        if (iOooO0O0 == 4) {
            return new C1625h0(zza);
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
        synchronized (C1662i0.class) {
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

    public final jz0 OooOoO() {
        return this.zze;
    }

    public final jz0 OooOoO0() {
        return this.zzd;
    }

    public final jz0 OooOoOO() {
        return this.zzg;
    }

    public final jz0 OooOoo0() {
        return this.zzf;
    }
}
