package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o0oOo0O0 extends ooOOOOoo {
    private static final o0oOo0O0 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        o0oOo0O0 o0ooo0o0 = new o0oOo0O0();
        zzj = o0ooo0o0;
        ooOOOOoo.OooOOO0(o0oOo0O0.class, o0ooo0o0);
    }

    public static o0O0o0 OooOoOO() {
        return (o0O0o0) zzj.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new o0oOo0O0();
        }
        if (i2 == 4) {
            return new o0O0o0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final String OooOOo() {
        return this.zze;
    }

    public final long OooOOo0() {
        return this.zzd;
    }

    public final boolean OooOOoo() {
        return (this.zzb & 4) != 0;
    }

    public final float OooOo() {
        return this.zzh;
    }

    public final boolean OooOo0() {
        return (this.zzb & 8) != 0;
    }

    public final String OooOo00() {
        return this.zzf;
    }

    public final long OooOo0O() {
        return this.zzg;
    }

    public final boolean OooOo0o() {
        return (this.zzb & 16) != 0;
    }

    public final double OooOoO() {
        return this.zzi;
    }

    public final boolean OooOoO0() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void OooOoo(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void OooOoo0(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void OooOooO(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void OooOooo() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void Oooo0() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    public final /* synthetic */ void Oooo000(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void Oooo00O() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void Oooo00o(double d) {
        this.zzb |= 32;
        this.zzi = d;
    }
}
