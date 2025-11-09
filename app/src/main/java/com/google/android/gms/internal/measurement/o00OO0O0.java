package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00OO0O0 extends ooOOOOoo {
    private static final o00OO0O0 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        o00OO0O0 o00oo0o0 = new o00OO0O0();
        zzf = o00oo0o0;
        ooOOOOoo.OooOOO0(o00OO0O0.class, o00oo0o0);
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
            return new o00OO0O0();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String OooOOOo() {
        return this.zzd;
    }
}
