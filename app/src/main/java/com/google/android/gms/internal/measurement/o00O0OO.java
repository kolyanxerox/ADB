package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00O0OO extends ooOOOOoo {
    private static final o00O0OO zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        o00O0OO o00o0oo = new o00O0OO();
        zzi = o00o0oo;
        ooOOOOoo.OooOOO0(o00O0OO.class, o00o0oo);
    }

    public static o00O0OO OooOoO0() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", oo0o0O0.f26896OooO0O0, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new o00O0OO();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final boolean OooOOo() {
        return this.zze;
    }

    public final boolean OooOOo0() {
        return (this.zzb & 2) != 0;
    }

    public final boolean OooOOoo() {
        return (this.zzb & 4) != 0;
    }

    public final String OooOo() {
        return this.zzh;
    }

    public final boolean OooOo0() {
        return (this.zzb & 8) != 0;
    }

    public final String OooOo00() {
        return this.zzf;
    }

    public final String OooOo0O() {
        return this.zzg;
    }

    public final boolean OooOo0o() {
        return (this.zzb & 16) != 0;
    }

    public final int OooOoO() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
