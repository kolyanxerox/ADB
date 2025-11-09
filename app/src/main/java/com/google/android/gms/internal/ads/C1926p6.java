package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.p6 */
/* loaded from: classes2.dex */
public final class C1926p6 extends zz0 {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final C1926p6 zzn;
    private static volatile y01 zzo;
    private C1778l6 zzA;
    private C1815m6 zzB;
    private C2220x4 zzC;
    private C2109u4 zzD;
    private C1483d5 zzE;
    private C1447c6 zzF;
    private C2184w5 zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private C1740k5 zzy;
    private String zzv = "";
    private int zzx = 1000;
    private g01 zzz = p01.f23170OooOoO;

    static {
        C1926p6 c1926p6 = new C1926p6();
        zzn = c1926p6;
        zz0.OooOO0O(C1926p6.class, c1926p6);
    }

    public static void OooOo(C1926p6 c1926p6) {
        c1926p6.getClass();
        c1926p6.zzz = p01.f23170OooOoO;
    }

    public static void OooOo0o(C1926p6 c1926p6, List list) {
        RandomAccess randomAccess = c1926p6.zzz;
        if (!((cz0) randomAccess).f18106OooOo0O) {
            p01 p01Var = (p01) randomAccess;
            int i = p01Var.f23172OooOo;
            c1926p6.zzz = p01Var.OooO0O0(i + i);
        }
        bz0.OooO0OO(list, c1926p6.zzz);
    }

    public static void OooOoO(C1926p6 c1926p6, C2184w5 c2184w5) {
        c1926p6.getClass();
        c1926p6.zzG = c2184w5;
        c1926p6.zzp |= 2048;
    }

    public static void OooOoO0(C1926p6 c1926p6, C2109u4 c2109u4) {
        c1926p6.getClass();
        c1926p6.zzD = c2109u4;
        c1926p6.zzp |= 256;
    }

    public static void OooOoOO(C1926p6 c1926p6, C1778l6 c1778l6) {
        c1926p6.getClass();
        c1926p6.zzA = c1778l6;
        c1926p6.zzp |= 32;
    }

    public static void OooOoo(C1926p6 c1926p6, String str) {
        c1926p6.getClass();
        str.getClass();
        c1926p6.zzp |= 2;
        c1926p6.zzv = str;
    }

    public static void OooOoo0(C1926p6 c1926p6, C1483d5 c1483d5) {
        c1926p6.getClass();
        c1926p6.zzE = c1483d5;
        c1926p6.zzp |= 512;
    }

    public static C1889o6 Oooo00O() {
        return (C1889o6) zzn.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", C1771l.f20740OooOo00, "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
        }
        if (iOooO0O0 == 3) {
            return new C1926p6();
        }
        if (iOooO0O0 == 4) {
            return new C1889o6(zzn);
        }
        if (iOooO0O0 == 5) {
            return zzn;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzo;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1926p6.class) {
            try {
                yz0Var = zzo;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzo = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }

    public final String OooOooO() {
        return this.zzv;
    }

    public final C2109u4 OooOooo() {
        C2109u4 c2109u4 = this.zzD;
        return c2109u4 == null ? C2109u4.OooOoO() : c2109u4;
    }

    public final C1778l6 Oooo000() {
        C1778l6 c1778l6 = this.zzA;
        return c1778l6 == null ? C1778l6.OooOoO0() : c1778l6;
    }
}
