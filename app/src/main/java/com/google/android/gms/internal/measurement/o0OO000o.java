package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0OO000o extends ooOOOOoo {
    private static final o0OO000o zzj;
    private int zzb;
    private int zzd;
    private oO00O0o0 zze = oOo0000O.f26873OooOoO;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        o0OO000o o0oo000o = new o0OO000o();
        zzj = o0oo000o;
        ooOOOOoo.OooOOO0(o0OO000o.class, o0oo000o);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", oo0o0O0.f26907OooOOOO, "zze", o0OO000o.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new o0OO000o();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zze;
    }

    public final boolean OooOOo() {
        return (this.zzb & 4) != 0;
    }

    public final String OooOOo0() {
        return this.zzf;
    }

    public final String OooOOoo() {
        return this.zzg;
    }

    public final int OooOo() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final boolean OooOo0() {
        return this.zzh;
    }

    public final boolean OooOo00() {
        return (this.zzb & 8) != 0;
    }

    public final boolean OooOo0O() {
        return (this.zzb & 16) != 0;
    }

    public final double OooOo0o() {
        return this.zzi;
    }
}
