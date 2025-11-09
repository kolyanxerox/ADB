package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class o0O00OOO implements o0O00oO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long[] f21950OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f21951OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f21952OooO0OO;

    public o0O00OOO(long j, long[] jArr, long[] jArr2) {
        this.f21950OooO00o = jArr;
        this.f21951OooO0O0 = jArr2;
        this.f21952OooO0OO = j == -9223372036854775807L ? i80.OooOOoo(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair OooO0O0(long j, long[] jArr, long[] jArr2) {
        int iOooOO0 = i80.OooOO0(jArr, j, true);
        long j2 = jArr[iOooOO0];
        long j3 = jArr2[iOooOO0];
        int i = iOooOO0 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long OooO00o(long j) {
        return i80.OooOOoo(((Long) OooO0O0(j, this.f21950OooO00o, this.f21951OooO0O0).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        Pair pairOooO0O0 = OooO0O0(i80.OooOo0O(Math.max(0L, Math.min(j, this.f21952OooO0OO))), this.f21951OooO0O0, this.f21950OooO00o);
        o000O00O o000o00o2 = new o000O00O(i80.OooOOoo(((Long) pairOooO0O0.first).longValue()), ((Long) pairOooO0O0.second).longValue());
        return new o000Oo0(o000o00o2, o000o00o2);
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f21952OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return true;
    }
}
