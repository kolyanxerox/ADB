package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO0000o0 extends o0OoO00O {
    private static final oO0000o0 zzb;
    private int zzd;
    private int zze;

    static {
        oO0000o0 oo0000o0 = new oO0000o0();
        zzb = oo0000o0;
        o0OoO00O.OooOO0O(oO0000o0.class, oo0000o0);
    }

    public static /* synthetic */ void OooOOO(oO0000o0 oo0000o0, int i) {
        oo0000o0.zze = i - 1;
        oo0000o0.zzd |= 1;
    }

    public static oO0000O OooOOOO() {
        return (oO0000O) zzb.OooO0o();
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", o0oOO.f27168OooO0oO});
        }
        if (i2 == 3) {
            return new oO0000o0();
        }
        if (i2 == 4) {
            return new oO0000O(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
