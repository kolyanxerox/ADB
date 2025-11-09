package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class f31 extends zz0 {
    private static final f31 zza;
    private static volatile y01 zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private h01 zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    private h01 zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;

    static {
        f31 f31Var = new f31();
        zza = f31Var;
        zz0.OooOO0O(f31.class, f31Var);
    }

    public f31() {
        b11 b11Var = b11.f17344OooOoO;
        this.zzg = b11Var;
        this.zzh = "";
        this.zzi = "";
        this.zzl = b11Var;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", o21.f22315OooOO0O, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", e31.class, "zze", "zzm", o21.f22314OooOO0, "zzn", "zzo", "zzp", "zzu"});
        }
        if (iOooO0O0 == 3) {
            return new f31();
        }
        if (iOooO0O0 == 4) {
            return new b31(zza);
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
        synchronized (f31.class) {
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
