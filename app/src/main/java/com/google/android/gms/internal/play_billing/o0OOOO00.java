package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0OOOO00 extends o0OoO00O {
    private static final o0OOOO00 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        o0OOOO00 o0oooo00 = new o0OOOO00();
        zzb = o0oooo00;
        o0OoO00O.OooOO0O(o0OOOO00.class, o0oooo00);
    }

    public static /* synthetic */ void OooOOO(o0OOOO00 o0oooo00, oO0000o0 oo0000o0) {
        o0oooo00.zzf = oo0000o0;
        o0oooo00.zze = 2;
    }

    public static /* synthetic */ void OooOOOO(o0OOOO00 o0oooo00, oO0OOo0o oo0ooo0o) {
        o0oooo00.zzf = oo0ooo0o;
        o0oooo00.zze = 3;
    }

    public static /* synthetic */ void OooOOOo(o0OOOO00 o0oooo00, int i) {
        o0oooo00.zzg = i - 1;
        o0oooo00.zzd |= 1;
    }

    public static o0OOO0OO OooOOo0() {
        return (o0OOO0OO) zzb.OooO0o();
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", o0oOO.f27164OooO0OO, oO0000o0.class, oO0OOo0o.class, oO000O0.class});
        }
        if (i2 == 3) {
            return new o0OOOO00();
        }
        if (i2 == 4) {
            return new o0OOO0OO(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
