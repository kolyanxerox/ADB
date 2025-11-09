package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class y11 extends zz0 {
    private static final y11 zza;
    private static volatile y01 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private h01 zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private h01 zzu;
    private boolean zzv;
    private long zzw;
    private d01 zzx;
    private boolean zzy;
    private d01 zzz;

    static {
        y11 y11Var = new y11();
        zza = y11Var;
        zz0.OooOO0O(y11.class, y11Var);
    }

    public y11() {
        b11 b11Var = b11.f17344OooOoO;
        this.zzg = b11Var;
        this.zzl = "";
        this.zzu = b11Var;
        a01 a01Var = a01.f16868OooOoO;
        this.zzx = a01Var;
        this.zzz = a01Var;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", C1771l.f20745OooOoOO, "zze", "zzf", "zzg", "zzh", C1771l.f20744OooOoO0, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", x11.class, "zzv", "zzw", "zzx", C1771l.f20742OooOo0o, "zzy", "zzz", C1771l.f20743OooOoO});
        }
        if (iOooO0O0 == 3) {
            return new y11();
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
        synchronized (y11.class) {
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
