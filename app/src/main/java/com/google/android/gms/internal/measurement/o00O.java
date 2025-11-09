package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00O extends ooOOOOoo {
    private static final o00O zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private oO00O0o0 zzg = oOo0000O.f26873OooOoO;

    static {
        o00O o00o = new o00O();
        zzh = o00o;
        ooOOOOoo.OooOOO0(o00O.class, o00o);
    }

    public static o00O OooOo0o() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", oo0o0O0.f26897OooO0OO, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new o00O();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final String OooOOo() {
        return this.zze;
    }

    public final boolean OooOOo0() {
        return (this.zzb & 2) != 0;
    }

    public final boolean OooOOoo() {
        return (this.zzb & 4) != 0;
    }

    public final int OooOo() {
        int i;
        switch (this.zzd) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final oO00O0o0 OooOo0() {
        return this.zzg;
    }

    public final boolean OooOo00() {
        return this.zzf;
    }

    public final int OooOo0O() {
        return this.zzg.size();
    }
}
