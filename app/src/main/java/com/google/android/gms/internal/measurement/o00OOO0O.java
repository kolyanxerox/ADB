package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class o00OOO0O extends ooOOOOoo {
    private static final o00OOO0O zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private oO00O0o0 zzg;
    private oO00O0o0 zzh;
    private oO00O0o0 zzi;
    private String zzj;
    private boolean zzk;
    private oO00O0o0 zzl;
    private oO00O0o0 zzm;
    private String zzn;
    private String zzo;
    private o00OO0OO zzp;
    private o00OOOO0 zzq;
    private o0oOO zzr;
    private o00OOOOo zzs;
    private o0o0Oo zzt;

    static {
        o00OOO0O o00ooo0o = new o00OOO0O();
        zzu = o00ooo0o;
        ooOOOOoo.OooOOO0(o00OOO0O.class, o00ooo0o);
    }

    public o00OOO0O() {
        oOo0000O ooo0000o = oOo0000O.f26873OooOoO;
        this.zzg = ooo0000o;
        this.zzh = ooo0000o;
        this.zzi = ooo0000o;
        this.zzj = "";
        this.zzl = ooo0000o;
        this.zzm = ooo0000o;
        this.zzn = "";
        this.zzo = "";
    }

    public static o00OOO0 Oooo000() {
        return (o00OOO0) zzu.OooO0oo();
    }

    public static o00OOO0O Oooo00O() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", o00Oo00.class, "zzh", o00OOO00.class, "zzi", oo00o.class, "zzj", "zzk", "zzl", o0OO000.class, "zzm", oo0O.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new o00OOO0O();
        }
        if (i2 == 4) {
            return new o00OOO0(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean OooOOOo() {
        return (this.zzb & 1) != 0;
    }

    public final boolean OooOOo() {
        return (this.zzb & 2) != 0;
    }

    public final long OooOOo0() {
        return this.zzd;
    }

    public final String OooOOoo() {
        return this.zze;
    }

    public final oO00O0o0 OooOo() {
        return this.zzl;
    }

    public final int OooOo0() {
        return this.zzh.size();
    }

    public final oO00O0o0 OooOo00() {
        return this.zzg;
    }

    public final o00OOO00 OooOo0O(int i) {
        return (o00OOO00) this.zzh.get(i);
    }

    public final oO00O0o0 OooOo0o() {
        return this.zzi;
    }

    public final List OooOoO() {
        return this.zzm;
    }

    public final int OooOoO0() {
        return this.zzl.size();
    }

    public final String OooOoOO() {
        return this.zzn;
    }

    public final o00OO0OO OooOoo() {
        o00OO0OO o00oo0oo = this.zzp;
        return o00oo0oo == null ? o00OO0OO.OooOo0O() : o00oo0oo;
    }

    public final boolean OooOoo0() {
        return (this.zzb & 128) != 0;
    }

    public final boolean OooOooO() {
        return (this.zzb & 512) != 0;
    }

    public final o0oOO OooOooo() {
        o0oOO o0ooo = this.zzr;
        return o0ooo == null ? o0oOO.OooOOo() : o0ooo;
    }

    public final void Oooo0() {
        this.zzi = oOo0000O.f26873OooOoO;
    }

    public final void Oooo00o(int i, o00OOO00 o00ooo00) {
        oO00O0o0 oo00o0o0 = this.zzh;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zzh = oo00o0o0.OooO00o(size + size);
        }
        this.zzh.set(i, o00ooo00);
    }

    public final void Oooo0O0() {
        this.zzl = oOo0000O.f26873OooOoO;
    }
}
