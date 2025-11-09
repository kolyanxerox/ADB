package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o0O00O0o extends ooOOOOoo {
    private static final o0O00O0o zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        o0O00O0o o0o00o0o = new o0O00O0o();
        zzf = o0o00o0o;
        ooOOOOoo.OooOOO0(o0O00O0o.class, o0o00o0o);
    }

    public static o0OoO00O OooOo00() {
        return (o0OoO00O) zzf.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new o0O00O0o();
        }
        if (i2 == 4) {
            return new o0OoO00O(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final boolean OooOOo() {
        return (this.zzb & 2) != 0;
    }

    public final int OooOOo0() {
        return this.zzd;
    }

    public final long OooOOoo() {
        return this.zze;
    }

    public final /* synthetic */ void OooOo0(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void OooOo0O(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
