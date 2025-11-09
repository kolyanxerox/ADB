package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u4 */
/* loaded from: classes2.dex */
public final class C2109u4 extends zz0 {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final C2109u4 zzl;
    private static volatile y01 zzm;
    private C2000r6 zzA;
    private C2037s6 zzB;
    private h01 zzC;
    private int zzn;
    private int zzo;
    private int zzp = 1000;
    private C1557f6 zzu;
    private C1631h6 zzv;
    private h01 zzw;
    private C1704j6 zzx;
    private C1519e5 zzy;
    private C2257y4 zzz;

    static {
        C2109u4 c2109u4 = new C2109u4();
        zzl = c2109u4;
        zz0.OooOO0O(C2109u4.class, c2109u4);
    }

    public C2109u4() {
        b11 b11Var = b11.f17344OooOoO;
        this.zzw = b11Var;
        this.zzC = b11Var;
    }

    public static void OooOo(C2109u4 c2109u4, C1631h6 c1631h6) {
        c2109u4.getClass();
        c2109u4.zzv = c1631h6;
        c2109u4.zzn |= 8;
    }

    public static void OooOo0o(C2109u4 c2109u4, EnumC2035s4 enumC2035s4) {
        c2109u4.getClass();
        c2109u4.zzo = enumC2035s4.f23999OooOo0O;
        c2109u4.zzn |= 1;
    }

    public static C2109u4 OooOoO() {
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", C1771l.OooOO0o, "zzp", C1771l.f20740OooOo00, "zzu", "zzv", "zzw", C1520e6.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", C1777l5.class});
        }
        if (iOooO0O0 == 3) {
            return new C2109u4();
        }
        if (iOooO0O0 == 4) {
            return new C2072t4(zzl);
        }
        if (iOooO0O0 == 5) {
            return zzl;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzm;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C2109u4.class) {
            try {
                yz0Var = zzm;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzm = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }

    public final C1631h6 OooOoO0() {
        C1631h6 c1631h6 = this.zzv;
        return c1631h6 == null ? C1631h6.OooOo() : c1631h6;
    }
}
