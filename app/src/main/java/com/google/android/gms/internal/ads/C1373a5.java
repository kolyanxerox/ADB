package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.a5 */
/* loaded from: classes2.dex */
public final class C1373a5 extends zz0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final f01 zzn = new o0O(26);
    private static final C1373a5 zzo;
    private static volatile y01 zzp;
    private C2220x4 zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private d01 zzz = a01.f16868OooOoO;

    static {
        C1373a5 c1373a5 = new C1373a5();
        zzo = c1373a5;
        zz0.OooOO0O(C1373a5.class, c1373a5);
    }

    public static void OooOo(C1373a5 c1373a5, EnumC1852n6 enumC1852n6) {
        c1373a5.getClass();
        c1373a5.zzC = enumC1852n6.f21419OooOo0O;
        c1373a5.zzu |= 64;
    }

    public static void OooOo0o(C1373a5 c1373a5, ArrayList arrayList) {
        RandomAccess randomAccess = c1373a5.zzz;
        if (!((cz0) randomAccess).f18106OooOo0O) {
            a01 a01Var = (a01) randomAccess;
            int i = a01Var.f16870OooOo;
            c1373a5.zzz = a01Var.OooO0O0(i + i);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((a01) c1373a5.zzz).OooO0oO(((EnumC1484d6) obj).f18176OooOo0O);
        }
    }

    public static void OooOoO(C1373a5 c1373a5, int i) {
        c1373a5.zzu |= 256;
        c1373a5.zzE = i;
    }

    public static void OooOoO0(C1373a5 c1373a5, EnumC1852n6 enumC1852n6) {
        c1373a5.getClass();
        c1373a5.zzD = enumC1852n6.f21419OooOo0O;
        c1373a5.zzu |= 128;
    }

    public static void OooOoOO(C1373a5 c1373a5, EnumC1446c5 enumC1446c5) {
        c1373a5.getClass();
        c1373a5.zzG = enumC1446c5.f17692OooOo0O;
        c1373a5.zzu |= 1024;
    }

    public static void OooOoo(C1373a5 c1373a5, EnumC1852n6 enumC1852n6) {
        c1373a5.getClass();
        c1373a5.zzF = enumC1852n6.f21419OooOo0O;
        c1373a5.zzu |= 512;
    }

    public static void OooOoo0(C1373a5 c1373a5, C2220x4 c2220x4) {
        c1373a5.getClass();
        c1373a5.zzA = c2220x4;
        c1373a5.zzu |= 16;
    }

    public static void OooOooO(C1373a5 c1373a5, long j) {
        c1373a5.zzu |= 8;
        c1373a5.zzy = j;
    }

    public static void OooOooo(C1373a5 c1373a5, long j) {
        c1373a5.zzu |= 4;
        c1373a5.zzx = j;
    }

    public static void Oooo0(C1373a5 c1373a5, EnumC1852n6 enumC1852n6) {
        c1373a5.getClass();
        c1373a5.zzB = enumC1852n6.f21419OooOo0O;
        c1373a5.zzu |= 32;
    }

    public static void Oooo000(C1373a5 c1373a5, EnumC1852n6 enumC1852n6) {
        c1373a5.getClass();
        c1373a5.zzw = enumC1852n6.f21419OooOo0O;
        c1373a5.zzu |= 2;
    }

    public static void Oooo00O(C1373a5 c1373a5, long j) {
        c1373a5.zzu |= 1;
        c1373a5.zzv = j;
    }

    public static void Oooo00o(C1373a5 c1373a5, long j) {
        c1373a5.zzu |= 2048;
        c1373a5.zzH = j;
    }

    public static C1373a5 Oooo0o(byte[] bArr) throws k01 {
        C1373a5 c1373a5 = zzo;
        int length = bArr.length;
        tz0 tz0Var = tz0.f24541OooO00o;
        a11 a11Var = a11.f16875OooO0OO;
        zz0 zz0VarOooOo0 = zz0.OooOo0(c1373a5, bArr, length, tz0.f24542OooO0O0);
        zz0.OooOo00(zz0VarOooOo0);
        return (C1373a5) zz0VarOooOo0;
    }

    public static C2294z4 Oooo0o0() {
        return (C2294z4) zzo.OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            C1771l c1771l = C1771l.f20740OooOo00;
            return new c11(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", c1771l, "zzx", "zzy", "zzz", C1771l.f20736OooOOo, "zzA", "zzB", c1771l, "zzC", c1771l, "zzD", c1771l, "zzE", "zzF", c1771l, "zzG", C1771l.f20734OooOOOO, "zzH"});
        }
        if (iOooO0O0 == 3) {
            return new C1373a5();
        }
        if (iOooO0O0 == 4) {
            return new C2294z4(zzo);
        }
        if (iOooO0O0 == 5) {
            return zzo;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzp;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (C1373a5.class) {
            try {
                yz0Var = zzp;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzp = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }

    public final long Oooo0O0() {
        return this.zzv;
    }

    public final EnumC1852n6 Oooo0OO() {
        int i = this.zzw;
        EnumC1852n6 enumC1852n6 = EnumC1852n6.ENUM_FALSE;
        EnumC1852n6 enumC1852n62 = i != 0 ? i != 1 ? i != 1000 ? null : EnumC1852n6.ENUM_UNKNOWN : EnumC1852n6.ENUM_TRUE : enumC1852n6;
        return enumC1852n62 == null ? enumC1852n6 : enumC1852n62;
    }
}
