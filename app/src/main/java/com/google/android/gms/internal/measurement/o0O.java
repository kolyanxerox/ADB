package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0O extends ooOOOOoo {
    private static final o0O zzf;
    private int zzb;
    private String zzd = "";
    private oO00O0o0 zze = oOo0000O.f26873OooOoO;

    static {
        o0O o0o = new o0O();
        zzf = o0o;
        ooOOOOoo.OooOOO0(o0O.class, o0o);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", o0OO000o.class});
        }
        if (i2 == 3) {
            return new o0O();
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

    public final List OooOOo0() {
        return this.zze;
    }
}
