package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k */
/* loaded from: classes2.dex */
public final class C1734k extends zz0 {
    private static final C1734k zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private C1993r zzi;
    private C2067t zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        C1734k c1734k = new C1734k();
        zza = c1734k;
        zz0.OooOO0O(C1734k.class, c1734k);
    }

    public static C1697j OooOo0o() {
        return (C1697j) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoOO(C1734k c1734k, boolean z) {
        c1734k.zzc |= 8;
        c1734k.zzg = z;
    }

    public static /* synthetic */ void OooOoo0(C1734k c1734k, String str) {
        str.getClass();
        c1734k.zzc |= 4;
        c1734k.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", C1771l.f20723OooO0O0, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOooO0O0 == 3) {
            return new C1734k();
        }
        if (iOooO0O0 == 4) {
            return new C1697j(zza);
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
        synchronized (C1734k.class) {
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

    public final C1993r OooOo() {
        C1993r c1993r = this.zzi;
        return c1993r == null ? C1993r.OooOo() : c1993r;
    }

    public final String OooOoO() {
        return this.zzf;
    }

    public final void OooOoO0() {
        if (this.zzj == null) {
            int i = C2067t.zza;
        }
    }

    public final boolean OooOoo() {
        return this.zzg;
    }
}
