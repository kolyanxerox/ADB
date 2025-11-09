package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o00OOO00 extends ooOOOOoo {
    private static final o00OOO00 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        o00OOO00 o00ooo00 = new o00OOO00();
        zzh = o00ooo00;
        ooOOOOoo.OooOOO0(o00OOO00.class, o00ooo00);
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new o00OOO00();
        }
        if (i2 == 4) {
            return new o00OO(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String OooOOOo() {
        return this.zzd;
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

    public final boolean OooOo0() {
        return (this.zzb & 8) != 0;
    }

    public final boolean OooOo00() {
        return this.zzf;
    }

    public final int OooOo0O() {
        return this.zzg;
    }

    public final /* synthetic */ void OooOo0o(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
