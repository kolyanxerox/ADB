package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO000OOo extends o0OoO00O {
    private static final oO000OOo zzb;
    private int zzd;
    private int zze;

    static {
        oO000OOo oo000ooo = new oO000OOo();
        zzb = oo000ooo;
        o0OoO00O.OooOO0O(oO000OOo.class, oo000ooo);
    }

    public static oO000OOo OooOOO() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", o0oOO.f27162OooO});
        }
        if (i2 == 3) {
            return new oO000OOo();
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
