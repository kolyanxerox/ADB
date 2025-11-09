package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o0oO0O0o implements o0O00oO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f22244OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f22245OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f22246OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f22247OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f22248OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f22249OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final long[] f22250OooO0oO;

    public o0oO0O0o(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f22244OooO00o = j;
        this.f22245OooO0O0 = i;
        this.f22246OooO0OO = j2;
        this.f22247OooO0Oo = i2;
        this.f22249OooO0o0 = j3;
        this.f22250OooO0oO = jArr;
        this.f22248OooO0o = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long OooO00o(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.f22244OooO00o;
        if (j2 <= this.f22245OooO0O0) {
            return 0L;
        }
        long[] jArr = this.f22250OooO0oO;
        af0.OooOo0O(jArr);
        double d = (j2 * 256.0d) / this.f22249OooO0o0;
        int iOooOO0 = i80.OooOO0(jArr, (long) d, true);
        long j3 = this.f22246OooO0OO;
        long j4 = (iOooOO0 * j3) / 100;
        long j5 = jArr[iOooOO0];
        int i = iOooOO0 + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iOooOO0 == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        double d;
        double d2;
        boolean zZzh = zzh();
        int i = this.f22245OooO0O0;
        long j2 = this.f22244OooO00o;
        if (!zZzh) {
            o000O00O o000o00o2 = new o000O00O(0L, j2 + i);
            return new o000Oo0(o000o00o2, o000o00o2);
        }
        long j3 = this.f22246OooO0OO;
        long jMax = Math.max(0L, Math.min(j, j3));
        double d3 = (jMax * 100.0d) / j3;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.f22250OooO0oO;
            af0.OooOo0O(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.f22249OooO0o0;
        o000O00O o000o00o3 = new o000O00O(jMax, Math.max(i, Math.min(Math.round((d4 / d) * j4), j4 - 1)) + j2);
        return new o000Oo0(o000o00o3, o000o00o3);
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f22246OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final int zzc() {
        return this.f22247OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long zzd() {
        return this.f22248OooO0o;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return this.f22250OooO0oO != null;
    }
}
