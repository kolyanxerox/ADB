package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class oo0OOoo extends ooOOOOoo {
    private static final oo0OOoo zzf;
    private int zzb;
    private int zzd;
    private oO0O0OoO zze = oO00Oo00.f26701OooOoO;

    static {
        oo0OOoo oo0oooo = new oo0OOoo();
        zzf = oo0oooo;
        ooOOOOoo.OooOOO0(oo0OOoo.class, oo0oooo);
    }

    public static o0O0OOOo OooOo0() {
        return (o0O0OOOo) zzf.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new oo0OOoo();
        }
        if (i2 == 4) {
            return new o0O0OOOo(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final List OooOOo() {
        return this.zze;
    }

    public final int OooOOo0() {
        return this.zzd;
    }

    public final int OooOOoo() {
        return ((oO00Oo00) this.zze).size();
    }

    public final long OooOo00(int i) {
        return ((oO00Oo00) this.zze).OooO0o0(i);
    }

    public final /* synthetic */ void OooOo0O(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void OooOo0o(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((oO00000) randomAccess).f26666OooOo0O) {
            oO00Oo00 oo00oo00 = (oO00Oo00) randomAccess;
            int i = oo00oo00.f26703OooOo;
            this.zze = oo00oo00.OooO00o(i + i);
        }
        AbstractC2346o.OooO0OO(list, this.zze);
    }
}
