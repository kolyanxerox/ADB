package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q */
/* loaded from: classes2.dex */
public final class C1956q extends zz0 {
    private static final C1956q zza;
    private static volatile y01 zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private h01 zzo = b11.f17344OooOoO;

    static {
        C1956q c1956q = new C1956q();
        zza = c1956q;
        zz0.OooOO0O(C1956q.class, c1956q);
    }

    public static /* synthetic */ void OooOo(C1956q c1956q, String str) {
        str.getClass();
        c1956q.zzc |= 1;
        c1956q.zzd = str;
    }

    public static C1808m OooOo0o() {
        return (C1808m) zza.OooO0oO();
    }

    public static /* synthetic */ void OooOoO(C1956q c1956q, String str) {
        c1956q.zzc |= 1024;
        c1956q.zzn = str;
    }

    public static /* synthetic */ void OooOoO0(C1956q c1956q, String str) {
        c1956q.zzc |= 16;
        c1956q.zzh = str;
    }

    public static /* synthetic */ void OooOoOO(C1956q c1956q, String str) {
        c1956q.zzc |= 8;
        c1956q.zzg = str;
    }

    public static /* synthetic */ void OooOoo(C1956q c1956q, String str) {
        str.getClass();
        c1956q.zzc |= 4;
        c1956q.zzf = str;
    }

    public static /* synthetic */ void OooOoo0(C1956q c1956q, long j) {
        c1956q.zzc |= 2;
        c1956q.zze = j;
    }

    public static /* synthetic */ void OooOooO(C1956q c1956q, int i) {
        c1956q.zzp = i - 1;
        c1956q.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", C1919p.class, "zzp", C1771l.f20724OooO0OO});
        }
        if (iOooO0O0 == 3) {
            return new C1956q();
        }
        if (iOooO0O0 == 4) {
            return new C1808m(zza);
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
        synchronized (C1956q.class) {
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
