package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o0O00OO implements o0O00oO0, o000O00 {

    /* renamed from: OooO, reason: collision with root package name */
    public final int f21940OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f21941OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f21942OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f21943OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f21944OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f21945OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f21946OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final long f21947OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f21948OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final long f21949OooOO0;

    public o0O00OO(int i, int i2, long j, long j2) {
        long jMax;
        this.f21941OooO00o = j;
        this.f21942OooO0O0 = j2;
        this.f21943OooO0OO = i2 == -1 ? 1 : i2;
        this.f21946OooO0o0 = i;
        if (j == -1) {
            this.f21944OooO0Oo = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f21944OooO0Oo = j3;
            jMax = (Math.max(0L, j3) * 8000000) / i;
        }
        this.f21945OooO0o = jMax;
        this.f21947OooO0oO = j2;
        this.f21948OooO0oo = i;
        this.f21940OooO = i2;
        this.f21949OooOO0 = j == -1 ? -1L : j;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long OooO00o(long j) {
        return (Math.max(0L, j - this.f21942OooO0O0) * 8000000) / this.f21946OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        long j2 = this.f21944OooO0Oo;
        long j3 = this.f21942OooO0O0;
        if (j2 == -1) {
            o000O00O o000o00o2 = new o000O00O(0L, j3);
            return new o000Oo0(o000o00o2, o000o00o2);
        }
        int i = this.f21946OooO0o0;
        long j4 = this.f21943OooO0OO;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / i;
        o000O00O o000o00o3 = new o000O00O(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f21941OooO00o) {
                return new o000Oo0(o000o00o3, new o000O00O((Math.max(0L, j5 - j3) * 8000000) / i, j5));
            }
        }
        return new o000Oo0(o000o00o3, o000o00o3);
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f21945OooO0o;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final int zzc() {
        return this.f21948OooO0oo;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long zzd() {
        return this.f21949OooOO0;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return this.f21944OooO0Oo != -1;
    }
}
