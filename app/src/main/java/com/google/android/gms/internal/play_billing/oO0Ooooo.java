package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO0Ooooo extends o0OoO00O {
    private static final oO0Ooooo zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private oO00000 zzg;
    private oO00000o zzh;

    static {
        oO0Ooooo oo0ooooo = new oO0Ooooo();
        zzb = oo0ooooo;
        o0OoO00O.OooOO0O(oO0Ooooo.class, oo0ooooo);
    }

    public static /* synthetic */ void OooOOO(oO0Ooooo oo0ooooo, o0OOO0 o0ooo0) {
        oo0ooooo.zzf = o0ooo0;
        oo0ooooo.zze = 2;
    }

    public static /* synthetic */ void OooOOOO(oO0Ooooo oo0ooooo, o0OOOO00 o0oooo00) {
        oo0ooooo.zzf = o0oooo00;
        oo0ooooo.zze = 3;
    }

    public static /* synthetic */ void OooOOOo(oO0Ooooo oo0ooooo, oO00000 oo00000) {
        oo00000.getClass();
        oo0ooooo.zzg = oo00000;
        oo0ooooo.zzd |= 1;
    }

    public static /* synthetic */ void OooOOo(oO0Ooooo oo0ooooo, oO000OOo oo000ooo) {
        oo0ooooo.zzf = oo000ooo;
        oo0ooooo.zze = 4;
    }

    public static /* synthetic */ void OooOOo0(oO0Ooooo oo0ooooo, oO0Oo0oo oo0oo0oo) {
        oo0ooooo.zzf = oo0oo0oo;
        oo0ooooo.zze = 8;
    }

    public static oO000O0O OooOOoo() {
        return (oO000O0O) zzb.OooO0o();
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", o0OOO0.class, o0OOOO00.class, oO000OOo.class, ooo0Oo0.class, "zzh", oO0Oo.class, oO0Oo0oo.class});
        }
        if (i2 == 3) {
            return new oO0Ooooo();
        }
        if (i2 == 4) {
            return new oO000O0O(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
