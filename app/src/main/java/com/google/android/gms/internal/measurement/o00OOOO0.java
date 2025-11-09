package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00OOOO0 extends ooOOOOoo {
    private static final o00OOOO0 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        o00OOOO0 o00oooo0 = new o00OOOO0();
        zzi = o00oooo0;
        ooOOOOoo.OooOOO0(o00OOOO0.class, o00oooo0);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new o00OOOO0();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
