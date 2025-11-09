package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO000O0 extends o0OoO00O {
    private static final oO000O0 zzb;
    private o0O00OOO zzd = o0O.f27071OooOoO;

    static {
        oO000O0 oo000o0 = new oO000O0();
        zzb = oo000o0;
        o0OoO00O.OooOO0O(oO000O0.class, oo000o0);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", oO000.class});
        }
        if (i2 == 3) {
            return new oO000O0();
        }
        if (i2 == 4) {
            return new o0o0000(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
