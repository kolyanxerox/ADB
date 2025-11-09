package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO0Oo extends o0OoO00O {
    private static final oO0Oo zzb;

    static {
        oO0Oo oo0oo = new oO0Oo();
        zzb = oo0oo;
        o0OoO00O.OooOO0O(oO0Oo.class, oo0oo);
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new oO0Oo();
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
