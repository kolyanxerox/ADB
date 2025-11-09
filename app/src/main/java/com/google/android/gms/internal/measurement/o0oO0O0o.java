package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0oO0O0o extends ooOOOOoo {
    private static final o0oO0O0o zzh;
    private int zzb;
    private oO00O0o0 zzd = oOo0000O.f26873OooOoO;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        o0oO0O0o o0oo0o0o = new o0oO0O0o();
        zzh = o0oo0o0o;
        ooOOOOoo.OooOOO0(o0oO0O0o.class, o0oo0o0o);
    }

    public static o0O0O0O OooOo(o0oO0O0o o0oo0o0o) {
        oO000OOo oo000oooOooO0oo = zzh.OooO0oo();
        oo000oooOooO0oo.OooO0o(o0oo0o0o);
        return (o0O0O0O) oo000oooOooO0oo;
    }

    public static o0O0O0O OooOo0o() {
        return (o0O0O0O) zzh.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", o0O0O0Oo.class, "zze", "zzf", "zzg", oo0o0O0.f26903OooOO0});
        }
        if (i2 == 3) {
            return new o0oO0O0o();
        }
        if (i2 == 4) {
            return new o0O0O0O(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List OooOOOo() {
        return this.zzd;
    }

    public final o0O0O0Oo OooOOo(int i) {
        return (o0O0O0Oo) this.zzd.get(i);
    }

    public final int OooOOo0() {
        return this.zzd.size();
    }

    public final boolean OooOOoo() {
        return (this.zzb & 1) != 0;
    }

    public final boolean OooOo0() {
        return (this.zzb & 2) != 0;
    }

    public final String OooOo00() {
        return this.zze;
    }

    public final String OooOo0O() {
        return this.zzf;
    }

    public final /* synthetic */ void OooOoO(o0O0O0Oo o0o0o0oo) {
        OooOooo();
        this.zzd.add(o0o0o0oo);
    }

    public final /* synthetic */ void OooOoO0(int i, o0O0O0Oo o0o0o0oo) {
        OooOooo();
        this.zzd.set(i, o0o0o0oo);
    }

    public final /* synthetic */ void OooOoOO(ArrayList arrayList) {
        OooOooo();
        AbstractC2346o.OooO0OO(arrayList, this.zzd);
    }

    public final /* synthetic */ void OooOoo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final void OooOoo0() {
        this.zzd = oOo0000O.f26873OooOoO;
    }

    public final /* synthetic */ void OooOooO(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void OooOooo() {
        oO00O0o0 oo00o0o0 = this.zzd;
        if (((oO00000) oo00o0o0).f26666OooOo0O) {
            return;
        }
        int size = oo00o0o0.size();
        this.zzd = oo00o0o0.OooO00o(size + size);
    }
}
