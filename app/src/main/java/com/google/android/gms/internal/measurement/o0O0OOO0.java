package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o0O0OOO0 extends ooOOOOoo {
    private static final o0O0OOO0 zzg;
    private oO0O0OoO zzb;
    private oO0O0OoO zzd;
    private oO00O0o0 zze;
    private oO00O0o0 zzf;

    static {
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        zzg = o0o0ooo0;
        ooOOOOoo.OooOOO0(o0O0OOO0.class, o0o0ooo0);
    }

    public o0O0OOO0() {
        oO00Oo00 oo00oo00 = oO00Oo00.f26701OooOoO;
        this.zzb = oo00oo00;
        this.zzd = oo00oo00;
        oOo0000O ooo0000o = oOo0000O.f26873OooOoO;
        this.zze = ooo0000o;
        this.zzf = ooo0000o;
    }

    public static o0O0OO0 OooOo() {
        return (o0O0OO0) zzg.OooO0oo();
    }

    public static o0O0OOO0 OooOoO0() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", o0O00O0o.class, "zzf", oo0OOoo.class});
        }
        if (i2 == 3) {
            return new o0O0OOO0();
        }
        if (i2 == 4) {
            return new o0O0OO0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zzb;
    }

    public final List OooOOo() {
        return this.zzd;
    }

    public final int OooOOo0() {
        return ((oO00Oo00) this.zzb).size();
    }

    public final int OooOOoo() {
        return ((oO00Oo00) this.zzd).size();
    }

    public final int OooOo0() {
        return this.zze.size();
    }

    public final oO00O0o0 OooOo00() {
        return this.zze;
    }

    public final List OooOo0O() {
        return this.zzf;
    }

    public final int OooOo0o() {
        return this.zzf.size();
    }

    public final void OooOoO(List list) {
        RandomAccess randomAccess = this.zzb;
        if (!((oO00000) randomAccess).f26666OooOo0O) {
            oO00Oo00 oo00oo00 = (oO00Oo00) randomAccess;
            int i = oo00oo00.f26703OooOo;
            this.zzb = oo00oo00.OooO00o(i + i);
        }
        AbstractC2346o.OooO0OO(list, this.zzb);
    }

    public final void OooOoOO() {
        this.zzb = oO00Oo00.f26701OooOoO;
    }

    public final void OooOoo() {
        this.zzd = oO00Oo00.f26701OooOoO;
    }

    public final void OooOoo0(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((oO00000) randomAccess).f26666OooOo0O) {
            oO00Oo00 oo00oo00 = (oO00Oo00) randomAccess;
            int i = oo00oo00.f26703OooOo;
            this.zzd = oo00oo00.OooO00o(i + i);
        }
        AbstractC2346o.OooO0OO(list, this.zzd);
    }

    public final void OooOooO(ArrayList arrayList) {
        oO00O0o0 oo00o0o0 = this.zze;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zze = oo00o0o0.OooO00o(size + size);
        }
        AbstractC2346o.OooO0OO(arrayList, this.zze);
    }

    public final void OooOooo() {
        this.zze = oOo0000O.f26873OooOoO;
    }

    public final void Oooo000(List list) {
        oO00O0o0 oo00o0o0 = this.zzf;
        if (!((oO00000) oo00o0o0).f26666OooOo0O) {
            int size = oo00o0o0.size();
            this.zzf = oo00o0o0.OooO00o(size + size);
        }
        AbstractC2346o.OooO0OO(list, this.zzf);
    }

    public final void Oooo00O() {
        this.zzf = oOo0000O.f26873OooOoO;
    }
}
