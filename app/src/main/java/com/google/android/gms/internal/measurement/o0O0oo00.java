package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0O0oo00 extends ooOOOOoo {
    private static final o0O0oo00 zzd;
    private oO00O0o0 zzb = oOo0000O.f26873OooOoO;

    static {
        o0O0oo00 o0o0oo00 = new o0O0oo00();
        zzd = o0o0oo00;
        ooOOOOoo.OooOOO0(o0O0oo00.class, o0o0oo00);
    }

    public static o0O0oo00 OooOOo() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", o0O.class});
        }
        if (i2 == 3) {
            return new o0O0oo00();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zzb;
    }

    public final int OooOOo0() {
        return this.zzb.size();
    }
}
