package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class oOO00OO implements o000O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0O0OOOo f22788OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f22789OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f22790OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f22791OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f22792OooO0o0;

    public oOO00OO(o0O0OOOo o0o0oooo, int i, long j, long j2) {
        this.f22788OooO00o = o0o0oooo;
        this.f22789OooO0O0 = i;
        this.f22790OooO0OO = j;
        long j3 = (j2 - j) / o0o0oooo.f21965OooOo;
        this.f22791OooO0Oo = j3;
        this.f22792OooO0o0 = OooO0O0(j3);
    }

    public final long OooO0O0(long j) {
        return i80.OooOo0(j * this.f22789OooO0O0, 1000000L, this.f22788OooO00o.f21967OooOo0o, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        long j2 = this.f22789OooO0O0;
        o0O0OOOo o0o0oooo = this.f22788OooO00o;
        long j3 = (o0o0oooo.f21967OooOo0o * j) / (j2 * 1000000);
        long j4 = this.f22791OooO0Oo;
        long jMax = Math.max(0L, Math.min(j3, j4 - 1));
        long jOooO0O0 = OooO0O0(jMax);
        long j5 = this.f22790OooO0OO;
        o000O00O o000o00o2 = new o000O00O(jOooO0O0, (o0o0oooo.f21965OooOo * jMax) + j5);
        if (jOooO0O0 >= j || jMax == j4 - 1) {
            return new o000Oo0(o000o00o2, o000o00o2);
        }
        long j6 = jMax + 1;
        return new o000Oo0(o000o00o2, new o000O00O(OooO0O0(j6), (j6 * o0o0oooo.f21965OooOo) + j5));
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f22792OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return true;
    }
}
