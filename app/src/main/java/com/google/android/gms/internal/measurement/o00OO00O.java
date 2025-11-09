package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00OO00O extends ooOOOOoo {
    private static final o00OO00O zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        o00OO00O o00oo00o = new o00OO00O();
        zzf = o00oo00o;
        ooOOOOoo.OooOOO0(o00OO00O.class, o00oo00o);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            oo0o0O0 oo0o0o0 = oo0o0O0.f26900OooO0o0;
            return new oOo000o0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", oo0o0o0, "zze", oo0o0o0});
        }
        if (i2 == 3) {
            return new o00OO00O();
        }
        if (i2 == 4) {
            return new o00O0OO0(zzf);
        }
        if (i2 == 5) {
            return zzf;
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

    public final int OooOOo0() {
        int iOooOO0O = o0OOO0.OooOO0O(this.zze);
        if (iOooOO0O == 0) {
            return 1;
        }
        return iOooOO0O;
    }
}
