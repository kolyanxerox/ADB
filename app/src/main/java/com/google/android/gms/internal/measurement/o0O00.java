package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0O00 extends ooOOOOoo {
    private static final o0O00 zzd;
    private oO00O0o0 zzb = oOo0000O.f26873OooOoO;

    static {
        o0O00 o0o00 = new o0O00();
        zzd = o0o00;
        ooOOOOoo.OooOOO0(o0O00.class, o0o00);
    }

    public static o0O00 OooOOo() {
        return zzd;
    }

    public static o0OoOoOo OooOOo0() {
        return (o0OoOoOo) zzd.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", o0O000o0.class});
        }
        if (i2 == 3) {
            return new o0O00();
        }
        if (i2 == 4) {
            return new o0OoOoOo(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zzb;
    }

    public final void OooOOoo(ArrayList arrayList) {
        oO00O0o0 oo00o0o0 = this.zzb;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zzb = oo00o0o0.OooO00o(size + size);
        }
        AbstractC2346o.OooO0OO(arrayList, this.zzb);
    }
}
