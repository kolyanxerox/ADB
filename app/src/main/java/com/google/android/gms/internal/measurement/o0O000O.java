package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o0O000O extends ooOOOOoo {
    private static final o0O000O zzh;
    private int zzb;
    private int zzd;
    private o0O0OOO0 zze;
    private o0O0OOO0 zzf;
    private boolean zzg;

    static {
        o0O000O o0o000o = new o0O000O();
        zzh = o0o000o;
        ooOOOOoo.OooOOO0(o0O000O.class, o0o000o);
    }

    public static o0O000 OooOo0o() {
        return (o0O000) zzh.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new o0O000O();
        }
        if (i2 == 4) {
            return new o0O000(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final o0O0OOO0 OooOOo() {
        o0O0OOO0 o0o0ooo0 = this.zze;
        return o0o0ooo0 == null ? o0O0OOO0.OooOoO0() : o0o0ooo0;
    }

    public final int OooOOo0() {
        return this.zzd;
    }

    public final boolean OooOOoo() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void OooOo(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final boolean OooOo0() {
        return (this.zzb & 8) != 0;
    }

    public final o0O0OOO0 OooOo00() {
        o0O0OOO0 o0o0ooo0 = this.zzf;
        return o0o0ooo0 == null ? o0O0OOO0.OooOoO0() : o0o0ooo0;
    }

    public final boolean OooOo0O() {
        return this.zzg;
    }

    public final /* synthetic */ void OooOoO(o0O0OOO0 o0o0ooo0) {
        this.zzf = o0o0ooo0;
        this.zzb |= 4;
    }

    public final /* synthetic */ void OooOoO0(o0O0OOO0 o0o0ooo0) {
        this.zze = o0o0ooo0;
        this.zzb |= 2;
    }

    public final /* synthetic */ void OooOoOO(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }
}
