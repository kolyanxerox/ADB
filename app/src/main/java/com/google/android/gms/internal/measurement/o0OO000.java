package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0OO000 extends ooOOOOoo {
    private static final o0OO000 zzf;
    private int zzb;
    private oO00O0o0 zzd = oOo0000O.f26873OooOoO;
    private o0O0oo00 zze;

    static {
        o0OO000 o0oo000 = new o0OO000();
        zzf = o0oo000;
        ooOOOOoo.OooOOO0(o0OO000.class, o0oo000);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", o0OO000o.class, "zze"});
        }
        if (i2 == 3) {
            return new o0OO000();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zzd;
    }

    public final o0O0oo00 OooOOo0() {
        o0O0oo00 o0o0oo00 = this.zze;
        return o0o0oo00 == null ? o0O0oo00.OooOOo() : o0o0oo00;
    }
}
