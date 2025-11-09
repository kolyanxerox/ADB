package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o00O0O00 extends ooOOOOoo {
    private static final o00O0O00 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private oO00O0o0 zzf = oOo0000O.f26873OooOoO;
    private boolean zzg;
    private o00O0OO zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        o00O0O00 o00o0o00 = new o00O0O00();
        zzl = o00o0o00;
        ooOOOOoo.OooOOO0(o00O0O00.class, o00o0o00);
    }

    public static o00O0 OooOoo0() {
        return (o00O0) zzl.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", o00O0O0O.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new o00O0O00();
        }
        if (i2 == 4) {
            return new o00O0(zzl);
        }
        if (i2 == 5) {
            return zzl;
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

    public final List OooOOoo() {
        return this.zzf;
    }

    public final boolean OooOo() {
        return this.zzi;
    }

    public final o00O0O0O OooOo0(int i) {
        return (o00O0O0O) this.zzf.get(i);
    }

    public final int OooOo00() {
        return this.zzf.size();
    }

    public final boolean OooOo0O() {
        return (this.zzb & 8) != 0;
    }

    public final o00O0OO OooOo0o() {
        o00O0OO o00o0oo = this.zzh;
        return o00o0oo == null ? o00O0OO.OooOoO0() : o00o0oo;
    }

    public final boolean OooOoO() {
        return (this.zzb & 64) != 0;
    }

    public final boolean OooOoO0() {
        return this.zzj;
    }

    public final boolean OooOoOO() {
        return this.zzk;
    }

    public final /* synthetic */ void OooOoo(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void OooOooO(int i, o00O0O0O o00o0o0o) {
        oO00O0o0 oo00o0o0 = this.zzf;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zzf = oo00o0o0.OooO00o(size + size);
        }
        this.zzf.set(i, o00o0o0o);
    }
}
