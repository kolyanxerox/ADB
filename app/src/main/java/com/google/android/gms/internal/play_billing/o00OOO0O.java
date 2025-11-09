package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o00OOO0O extends o0OoO00O {
    private static final o00OOO0O zzb;
    private int zzd;
    private o00Oo00 zze;
    private o00Oo00 zzf;
    private int zzg;

    static {
        o00OOO0O o00ooo0o = new o00OOO0O();
        zzb = o00ooo0o;
        o0OoO00O.OooOO0O(o00OOO0O.class, o00ooo0o);
    }

    public static o00OOO0 OooOOO() {
        return (o00OOO0) zzb.OooO0o();
    }

    public static /* synthetic */ void OooOOOO(o00OOO0O o00ooo0o, o00Oo00 o00oo00) {
        o00ooo0o.zze = o00oo00;
        o00ooo0o.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", o0oOO.f27163OooO0O0});
        }
        if (i2 == 3) {
            return new o00OOO0O();
        }
        if (i2 == 4) {
            return new o00OOO0(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
