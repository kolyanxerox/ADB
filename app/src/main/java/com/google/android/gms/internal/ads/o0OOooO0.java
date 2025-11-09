package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class o0OOooO0 implements o000O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO0o00 f22159OooO00o;

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        o0OO0o00 o0oo0o00 = this.f22159OooO00o;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((o0oo0o00.f22109OooOoO0.f22139OooO * j) / 1000000);
        long j2 = o0oo0o00.f22105OooOo;
        o000O00O o000o00o2 = new o000O00O(j, Math.max(o0oo0o00.f22107OooOo0o, Math.min((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - r4)).divide(BigInteger.valueOf(o0oo0o00.f22110OooOoOO)).longValue() + r4) - 30000, j2 - 1)));
        return new o000Oo0(o000o00o2, o000o00o2);
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        o0OO0o00 o0oo0o00 = this.f22159OooO00o;
        o0OOOO00 o0oooo00 = o0oo0o00.f22109OooOoO0;
        return (o0oo0o00.f22110OooOoOO * 1000000) / o0oooo00.f22139OooO;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return true;
    }
}
