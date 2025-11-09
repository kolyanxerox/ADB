package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o0oOO extends ooOOOOoo {
    private static final o0oOO zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        o0oOO o0ooo = new o0oOO();
        zzi = o0ooo;
        ooOOOOoo.OooOOO0(o0oOO.class, o0ooo);
    }

    public static o0oOO OooOOo() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new o0oOO();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int OooOOOo() {
        return this.zzg;
    }

    public final String OooOOo0() {
        return this.zzh;
    }
}
