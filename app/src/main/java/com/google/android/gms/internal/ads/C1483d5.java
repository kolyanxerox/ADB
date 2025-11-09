package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.d5 */
/* loaded from: classes2.dex */
public final class C1483d5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C1483d5 zzi;
    private static volatile y01 zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private h01 zzl = b11.f17344OooOoO;
    private String zzp = "";
    private String zzu = "";

    static {
        C1483d5 c1483d5 = new C1483d5();
        zzi = c1483d5;
        zz0.OooOO0O(C1483d5.class, c1483d5);
    }

    public static void OooOo(C1483d5 c1483d5, String str) {
        c1483d5.getClass();
        str.getClass();
        c1483d5.zzk |= 8;
        c1483d5.zzp = str;
    }

    public static void OooOo0o(C1483d5 c1483d5, ArrayList arrayList) {
        h01 h01Var = c1483d5.zzl;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            c1483d5.zzl = h01Var.OooO0O0(size + size);
        }
        bz0.OooO0OO(arrayList, c1483d5.zzl);
    }

    public static void OooOoO(C1483d5 c1483d5, String str) {
        c1483d5.getClass();
        str.getClass();
        c1483d5.zzk |= 16;
        c1483d5.zzu = str;
    }

    public static void OooOoO0(C1483d5 c1483d5, int i) {
        c1483d5.zzk |= 64;
        c1483d5.zzw = i;
    }

    public static void OooOoOO(C1483d5 c1483d5, int i) {
        c1483d5.zzk |= 1;
        c1483d5.zzm = i;
    }

    public static void OooOoo(C1483d5 c1483d5, int i) {
        c1483d5.zzk |= 2;
        c1483d5.zzn = i;
    }

    public static void OooOoo0(C1483d5 c1483d5, long j) {
        c1483d5.zzk |= 32;
        c1483d5.zzv = j;
    }

    public static void OooOooO(C1483d5 c1483d5, long j) {
        c1483d5.zzk |= 4;
        c1483d5.zzo = j;
    }

    public static C1410b5 OooOooo() {
        return (C1410b5) zzi.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", C1373a5.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
        }
        if (iOooO0O0 == 3) {
            return new C1483d5();
        }
        if (iOooO0O0 == 4) {
            return new C1410b5(zzi);
        }
        if (iOooO0O0 == 5) {
            return zzi;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzj;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1483d5.class) {
            try {
                yz0Var = zzj;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzj = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }
}
