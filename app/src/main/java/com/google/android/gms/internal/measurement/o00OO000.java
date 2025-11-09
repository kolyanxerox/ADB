package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00OO000 extends ooOOOOoo {
    private static final o00OO000 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        o00OO000 o00oo000 = new o00OO000();
        zzg = o00oo000;
        ooOOOOoo.OooOOO0(o00OO000.class, o00oo000);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", oo0o0O0.f26900OooO0o0, "zze", oo0o0O0.f26898OooO0Oo, "zzf", oo0o0O0.f26899OooO0o});
        }
        if (i2 == 3) {
            return new o00OO000();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int OooOOOo() {
        int iOooOO0O = o0OOO0.OooOO0O(this.zzd);
        if (iOooOO0O == 0) {
            return 1;
        }
        return iOooOO0O;
    }

    public final int OooOOo() {
        int i;
        int i2 = this.zzf;
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
}
