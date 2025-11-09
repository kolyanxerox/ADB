package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o0O0000O extends ooOOOOoo {
    private static final o0O0000O zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        o0O0000O o0o0000o = new o0O0000O();
        zzk = o0o0000o;
        ooOOOOoo.OooOOO0(o0O0000O.class, o0o0000o);
    }

    public static o0O0000O OooOo() {
        return zzk;
    }

    public static o0O00000 OooOo0o() {
        return (o0O00000) zzk.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new o0O0000O();
        }
        if (i2 == 4) {
            return new o0O00000(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return this.zzd;
    }

    public final boolean OooOOo() {
        return this.zzf;
    }

    public final boolean OooOOo0() {
        return this.zze;
    }

    public final boolean OooOOoo() {
        return this.zzg;
    }

    public final boolean OooOo0() {
        return this.zzi;
    }

    public final boolean OooOo00() {
        return this.zzh;
    }

    public final boolean OooOo0O() {
        return this.zzj;
    }

    public final /* synthetic */ void OooOoO(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void OooOoO0(boolean z) {
        this.zzb |= 1;
        this.zzd = z;
    }

    public final /* synthetic */ void OooOoOO(boolean z) {
        this.zzb |= 4;
        this.zzf = z;
    }

    public final /* synthetic */ void OooOoo(boolean z) {
        this.zzb |= 16;
        this.zzh = z;
    }

    public final /* synthetic */ void OooOoo0(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void OooOooO(boolean z) {
        this.zzb |= 32;
        this.zzi = z;
    }

    public final /* synthetic */ void OooOooo(boolean z) {
        this.zzb |= 64;
        this.zzj = z;
    }
}
