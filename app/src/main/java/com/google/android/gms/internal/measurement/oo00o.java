package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class oo00o extends ooOOOOoo {
    private static final oo00o zzi;
    private int zzb;
    private int zzd;
    private oO00O0o0 zze;
    private oO00O0o0 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        oo00o oo00oVar = new oo00o();
        zzi = oo00oVar;
        ooOOOOoo.OooOOO0(oo00o.class, oo00oVar);
    }

    public oo00o() {
        oOo0000O ooo0000o = oOo0000O.f26873OooOoO;
        this.zze = ooo0000o;
        this.zzf = ooo0000o;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", oo0oOO0.class, "zzf", o00O0O00.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new oo00o();
        }
        if (i2 == 4) {
            return new o00O00o0(zzi);
        }
        if (i2 == 5) {
            return zzi;
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
        return this.zze.size();
    }

    public final void OooOo(int i, oo0oOO0 oo0ooo0) {
        oO00O0o0 oo00o0o0 = this.zze;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zze = oo00o0o0.OooO00o(size + size);
        }
        this.zze.set(i, oo0ooo0);
    }

    public final oO00O0o0 OooOo0() {
        return this.zzf;
    }

    public final oo0oOO0 OooOo00(int i) {
        return (oo0oOO0) this.zze.get(i);
    }

    public final int OooOo0O() {
        return this.zzf.size();
    }

    public final o00O0O00 OooOo0o(int i) {
        return (o00O0O00) this.zzf.get(i);
    }

    public final void OooOoO0(int i, o00O0O00 o00o0o00) {
        oO00O0o0 oo00o0o0 = this.zzf;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zzf = oo00o0o0.OooO00o(size + size);
        }
        this.zzf.set(i, o00o0o00);
    }
}
