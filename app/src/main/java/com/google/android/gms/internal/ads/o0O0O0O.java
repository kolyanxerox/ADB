package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o0O0O0O implements o0O00oO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long[] f21953OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f21954OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f21955OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f21956OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f21957OooO0o0;

    public o0O0O0O(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.f21953OooO00o = jArr;
        this.f21954OooO0O0 = jArr2;
        this.f21955OooO0OO = j;
        this.f21956OooO0Oo = j2;
        this.f21957OooO0o0 = i;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long OooO00o(long j) {
        return this.f21953OooO00o[i80.OooOO0(this.f21954OooO0O0, j, true)];
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        long[] jArr = this.f21953OooO00o;
        int iOooOO0 = i80.OooOO0(jArr, j, true);
        long j2 = jArr[iOooOO0];
        long[] jArr2 = this.f21954OooO0O0;
        o000O00O o000o00o2 = new o000O00O(j2, jArr2[iOooOO0]);
        if (j2 >= j || iOooOO0 == jArr.length - 1) {
            return new o000Oo0(o000o00o2, o000o00o2);
        }
        int i = iOooOO0 + 1;
        return new o000Oo0(o000o00o2, new o000O00O(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f21955OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final int zzc() {
        return this.f21957OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.o0O00oO0
    public final long zzd() {
        return this.f21956OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return true;
    }
}
