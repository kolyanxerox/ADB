package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00O0O0O extends ooOOOOoo {
    private static final o00O0O0O zzh;
    private int zzb;
    private o00O zzd;
    private o00O0OO zze;
    private boolean zzf;
    private String zzg = "";

    static {
        o00O0O0O o00o0o0o = new o00O0O0O();
        zzh = o00o0o0o;
        ooOOOOoo.OooOOO0(o00O0O0O.class, o00o0o0o);
    }

    public static o00O0O0O OooOo() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new o00O0O0O();
        }
        if (i2 == 4) {
            return new o00O0O0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final boolean OooOOo() {
        return (this.zzb & 2) != 0;
    }

    public final o00O OooOOo0() {
        o00O o00o = this.zzd;
        return o00o == null ? o00O.OooOo0o() : o00o;
    }

    public final o00O0OO OooOOoo() {
        o00O0OO o00o0oo = this.zze;
        return o00o0oo == null ? o00O0OO.OooOoO0() : o00o0oo;
    }

    public final boolean OooOo0() {
        return this.zzf;
    }

    public final boolean OooOo00() {
        return (this.zzb & 4) != 0;
    }

    public final boolean OooOo0O() {
        return (this.zzb & 8) != 0;
    }

    public final String OooOo0o() {
        return this.zzg;
    }

    public final /* synthetic */ void OooOoO0(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
