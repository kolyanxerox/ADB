package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO0Oo0oo extends o0OoO00O {
    private static final oO0Oo0oo zzb;
    private int zzd;
    private o0OOo000 zze;

    static {
        oO0Oo0oo oo0oo0oo = new oO0Oo0oo();
        zzb = oo0oo0oo;
        o0OoO00O.OooOO0O(oO0Oo0oo.class, oo0oo0oo);
    }

    public static /* synthetic */ void OooOOO(oO0Oo0oo oo0oo0oo, o0OOo000 o0ooo000) {
        oo0oo0oo.zze = o0ooo000;
        oo0oo0oo.zzd |= 1;
    }

    public static oO0OoOO0 OooOOOO() {
        return (oO0OoOO0) zzb.OooO0o();
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new oO0Oo0oo();
        }
        if (i2 == 4) {
            return new oO0OoOO0(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
