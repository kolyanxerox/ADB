package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o00OO0OO extends ooOOOOoo {
    private static final o00OO0OO zzi;
    private int zzb;
    private oO00O0o0 zzd;
    private oO00O0o0 zze;
    private oO00O0o0 zzf;
    private boolean zzg;
    private oO00O0o0 zzh;

    static {
        o00OO0OO o00oo0oo = new o00OO0OO();
        zzi = o00oo0oo;
        ooOOOOoo.OooOOO0(o00OO0OO.class, o00oo0oo);
    }

    public o00OO0OO() {
        oOo0000O ooo0000o = oOo0000O.f26873OooOoO;
        this.zzd = ooo0000o;
        this.zze = ooo0000o;
        this.zzf = ooo0000o;
        this.zzh = ooo0000o;
    }

    public static o00OO0OO OooOo0O() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", o00OO000.class, "zze", o00OO00O.class, "zzf", o00OO0O0.class, "zzg", "zzh", o00OO000.class});
        }
        if (i2 == 3) {
            return new o00OO0OO();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zzd;
    }

    public final List OooOOo() {
        return this.zzf;
    }

    public final List OooOOo0() {
        return this.zze;
    }

    public final boolean OooOOoo() {
        return (this.zzb & 1) != 0;
    }

    public final oO00O0o0 OooOo0() {
        return this.zzh;
    }

    public final boolean OooOo00() {
        return this.zzg;
    }
}
