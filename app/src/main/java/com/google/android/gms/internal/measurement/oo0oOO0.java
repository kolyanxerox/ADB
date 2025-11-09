package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class oo0oOO0 extends ooOOOOoo {
    private static final oo0oOO0 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private o00O0O0O zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        oo0oOO0 oo0ooo0 = new oo0oOO0();
        zzj = oo0ooo0;
        ooOOOOoo.OooOOO0(oo0oOO0.class, oo0ooo0);
    }

    public static o00O0OOO OooOo() {
        return (o00O0OOO) zzj.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new oo0oOO0();
        }
        if (i2 == 4) {
            return new o00O0OOO(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final String OooOOo() {
        return this.zze;
    }

    public final int OooOOo0() {
        return this.zzd;
    }

    public final o00O0O0O OooOOoo() {
        o00O0O0O o00o0o0o = this.zzf;
        return o00o0o0o == null ? o00O0O0O.OooOo() : o00o0o0o;
    }

    public final boolean OooOo0() {
        return this.zzh;
    }

    public final boolean OooOo00() {
        return this.zzg;
    }

    public final boolean OooOo0O() {
        return (this.zzb & 32) != 0;
    }

    public final boolean OooOo0o() {
        return this.zzi;
    }

    public final /* synthetic */ void OooOoO0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
