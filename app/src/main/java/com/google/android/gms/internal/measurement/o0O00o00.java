package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0O00o00 extends ooOOOOoo {
    private static final o0O00o00 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private oO00O0o0 zzi = oOo0000O.f26873OooOoO;

    static {
        o0O00o00 o0o00o00 = new o0O00o00();
        zzj = o0o00o00;
        ooOOOOoo.OooOOO0(o0O00o00.class, o0o00o00);
    }

    public static o0oO0Ooo OooOoo0() {
        return (o0oO0Ooo) zzj.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", o0O00o00.class});
        }
        if (i2 == 3) {
            return new o0O00o00();
        }
        if (i2 == 4) {
            return new o0oO0Ooo(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final boolean OooOOo() {
        return (this.zzb & 2) != 0;
    }

    public final String OooOOo0() {
        return this.zzd;
    }

    public final String OooOOoo() {
        return this.zze;
    }

    public final boolean OooOo() {
        return (this.zzb & 16) != 0;
    }

    public final long OooOo0() {
        return this.zzf;
    }

    public final boolean OooOo00() {
        return (this.zzb & 4) != 0;
    }

    public final boolean OooOo0O() {
        return (this.zzb & 8) != 0;
    }

    public final float OooOo0o() {
        return this.zzg;
    }

    public final List OooOoO() {
        return this.zzi;
    }

    public final double OooOoO0() {
        return this.zzh;
    }

    public final int OooOoOO() {
        return this.zzi.size();
    }

    public final /* synthetic */ void OooOoo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void OooOooO(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void OooOooo() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void Oooo0() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final /* synthetic */ void Oooo000(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void Oooo00O() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void Oooo00o(double d) {
        this.zzb |= 16;
        this.zzh = d;
    }

    public final void Oooo0O0(o0O00o00 o0o00o00) {
        oO00O0o0 oo00o0o0 = this.zzi;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zzi = oo00o0o0.OooO00o(size + size);
        }
        this.zzi.add(o0o00o00);
    }

    public final void Oooo0OO(ArrayList arrayList) {
        oO00O0o0 oo00o0o0 = this.zzi;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zzi = oo00o0o0.OooO00o(size + size);
        }
        AbstractC2346o.OooO0OO(arrayList, this.zzi);
    }

    public final void Oooo0o0() {
        this.zzi = oOo0000O.f26873OooOoO;
    }
}
