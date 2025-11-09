package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o00Oo00 extends o0OoO00O {
    private static final o00Oo00 zzb;
    private int zzd;
    private String zze = "";

    static {
        o00Oo00 o00oo00 = new o00Oo00();
        zzb = o00oo00;
        o0OoO00O.OooOO0O(o00Oo00.class, o00oo00);
    }

    public static o00OOOOo OooOOO() {
        return (o00OOOOo) zzb.OooO0o();
    }

    public static /* synthetic */ void OooOOOO(o00Oo00 o00oo00, String str) {
        o00oo00.zzd |= 1;
        o00oo00.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new o00Oo00();
        }
        if (i2 == 4) {
            return new o00OOOOo(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
