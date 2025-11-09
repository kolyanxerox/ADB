package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00Oo00 extends ooOOOOoo {
    private static final o00Oo00 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        o00Oo00 o00oo00 = new o00Oo00();
        zzf = o00oo00;
        ooOOOOoo.OooOOO0(o00Oo00.class, o00oo00);
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
            return new o00Oo00();
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

    public final String OooOOo0() {
        return this.zze;
    }
}
