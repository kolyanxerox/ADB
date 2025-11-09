package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o0O000o0 extends ooOOOOoo {
    private static final o0O000o0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        o0O000o0 o0o000o0 = new o0O000o0();
        zzf = o0o000o0;
        ooOOOOoo.OooOOO0(o0O000o0.class, o0o000o0);
    }

    public static o0O000Oo OooOOOo() {
        return (o0O000Oo) zzf.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", oo0o0O0.f26902OooO0oo, "zze", oo0o0O0.f26895OooO});
        }
        if (i2 == 3) {
            return new o0O000o0();
        }
        if (i2 == 4) {
            return new o0O000Oo(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int OooOOo() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int OooOOo0() {
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

    public final /* synthetic */ void OooOOoo(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void OooOo00(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
