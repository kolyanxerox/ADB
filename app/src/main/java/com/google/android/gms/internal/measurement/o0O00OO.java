package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0O00OO extends ooOOOOoo {
    private static final o0O00OO zzj;
    private int zzb;
    private oO00O0o0 zzd = oOo0000O.f26873OooOoO;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        o0O00OO o0o00oo = new o0O00OO();
        zzj = o0o00oo;
        ooOOOOoo.OooOOO0(o0O00OO.class, o0o00oo);
    }

    public static o0O00O OooOoO() {
        return (o0O00O) zzj.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", o0O00o00.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new o0O00OO();
        }
        if (i2 == 4) {
            return new o0O00O(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zzd;
    }

    public final o0O00o00 OooOOo(int i) {
        return (o0O00o00) this.zzd.get(i);
    }

    public final int OooOOo0() {
        return this.zzd.size();
    }

    public final String OooOOoo() {
        return this.zze;
    }

    public final boolean OooOo() {
        return (this.zzb & 8) != 0;
    }

    public final long OooOo0() {
        return this.zzf;
    }

    public final boolean OooOo00() {
        return (this.zzb & 2) != 0;
    }

    public final boolean OooOo0O() {
        return (this.zzb & 4) != 0;
    }

    public final long OooOo0o() {
        return this.zzg;
    }

    public final int OooOoO0() {
        return this.zzh;
    }

    public final /* synthetic */ void OooOoOO(int i, o0O00o00 o0o00o00) {
        Oooo0O0();
        this.zzd.set(i, o0o00o00);
    }

    public final /* synthetic */ void OooOoo(Iterable iterable) {
        Oooo0O0();
        AbstractC2346o.OooO0OO(iterable, this.zzd);
    }

    public final /* synthetic */ void OooOoo0(o0O00o00 o0o00o00) {
        o0o00o00.getClass();
        Oooo0O0();
        this.zzd.add(o0o00o00);
    }

    public final void OooOooO() {
        this.zzd = oOo0000O.f26873OooOoO;
    }

    public final /* synthetic */ void OooOooo(int i) {
        Oooo0O0();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void Oooo0(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void Oooo000(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void Oooo00O(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void Oooo00o(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final void Oooo0O0() {
        oO00O0o0 oo00o0o0 = this.zzd;
        if (((oO00000) oo00o0o0).f26666OooOo0O) {
            return;
        }
        int size = oo00o0o0.size();
        this.zzd = oo00o0o0.OooO00o(size + size);
    }
}
