package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00OOOOo extends ooOOOOoo {
    private static final o00OOOOo zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        o00OOOOo o00ooooo = new o00OOOOo();
        zzf = o00ooooo;
        ooOOOOoo.OooOOO0(o00OOOOo.class, o00ooooo);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new o00OOOOo();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
