package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o0O0o extends ooOOOOoo {
    private static final o0O0o zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private oO00o000 zzl;
    private oO00o000 zzm;

    static {
        o0O0o o0o0o = new o0O0o();
        zzn = o0o0o;
        ooOOOOoo.OooOOO0(o0O0o.class, o0o0o);
    }

    public o0O0o() {
        oO00o000 oo00o000 = oO00o000.f26717OooOo0o;
        this.zzl = oo00o000;
        this.zzm = oo00o000;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    public static o0O0o Oooo() {
        return zzn;
    }

    public static o0O00o0 Oooo0oo() {
        return (o0O00o0) zzn.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", oo00oO.f26894OooO00o, "zzm", o0oOOo.f26647OooO00o});
        }
        if (i2 == 3) {
            return new o0O0o();
        }
        if (i2 == 4) {
            return new o0O00o0(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        throw null;
    }

    public final /* synthetic */ void OooOOOo(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void OooOOo(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void OooOOo0() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void OooOOoo() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final oO00o000 OooOo() {
        oO00o000 oo00o000 = this.zzm;
        if (!oo00o000.f26718OooOo0O) {
            this.zzm = oo00o000.OooO00o();
        }
        return this.zzm;
    }

    public final /* synthetic */ void OooOo0() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void OooOo00(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void OooOo0O(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final oO00o000 OooOo0o() {
        oO00o000 oo00o000 = this.zzl;
        if (!oo00o000.f26718OooOo0O) {
            this.zzl = oo00o000.OooO00o();
        }
        return this.zzl;
    }

    public final String OooOoO() {
        return this.zzd;
    }

    public final boolean OooOoO0() {
        return (this.zzb & 1) != 0;
    }

    public final boolean OooOoOO() {
        return (this.zzb & 2) != 0;
    }

    public final boolean OooOoo() {
        return (this.zzb & 4) != 0;
    }

    public final String OooOoo0() {
        return this.zze;
    }

    public final String OooOooO() {
        return this.zzf;
    }

    public final boolean OooOooo() {
        return (this.zzb & 8) != 0;
    }

    public final boolean Oooo0() {
        return (this.zzb & 32) != 0;
    }

    public final long Oooo000() {
        return this.zzg;
    }

    public final boolean Oooo00O() {
        return (this.zzb & 16) != 0;
    }

    public final String Oooo00o() {
        return this.zzh;
    }

    public final String Oooo0O0() {
        return this.zzi;
    }

    public final boolean Oooo0OO() {
        return (this.zzb & 64) != 0;
    }

    public final boolean Oooo0o() {
        return (this.zzb & 128) != 0;
    }

    public final String Oooo0o0() {
        return this.zzj;
    }

    public final long Oooo0oO() {
        return this.zzk;
    }

    public final /* synthetic */ void OoooO() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void OoooO0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void OoooO00(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void OoooO0O(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void OoooOO0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void OoooOOO(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void o000oOoO() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }
}
