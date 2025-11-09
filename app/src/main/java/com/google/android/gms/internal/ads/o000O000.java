package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o000O000 implements o000O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0oO.Oooo0 f21693OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0oO.Oooo0 f21694OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f21695OooO0OO;

    public o000O000(long j, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        af0.OoooO0(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f21693OooO00o = new OooO0oO.Oooo0(length2, 4);
            this.f21694OooO0O0 = new OooO0oO.Oooo0(length2, 4);
        } else {
            int i = length2 + 1;
            OooO0oO.Oooo0 oooo0 = new OooO0oO.Oooo0(i, 4);
            this.f21693OooO00o = oooo0;
            OooO0oO.Oooo0 oooo02 = new OooO0oO.Oooo0(i, 4);
            this.f21694OooO0O0 = oooo02;
            oooo0.OooOO0o(0L);
            oooo02.OooOO0o(0L);
        }
        this.f21693OooO00o.OooOOO0(jArr);
        this.f21694OooO0O0.OooOOO0(jArr2);
        this.f21695OooO0OO = j;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        OooO0oO.Oooo0 oooo0 = this.f21694OooO0O0;
        int i = oooo0.f13285OooOo0o;
        if (i == 0) {
            o000O00O o000o00o2 = o000O00O.f21696OooO0OO;
            return new o000Oo0(o000o00o2, o000o00o2);
        }
        int i2 = i80.f19994OooO00o;
        int i3 = i - 1;
        int i4 = 0;
        int i5 = 0;
        while (i5 <= i3) {
            int i6 = (i5 + i3) >>> 1;
            if (oooo0.OooOO0(i6) < j) {
                i5 = i6 + 1;
            } else {
                i3 = i6 - 1;
            }
        }
        int i7 = i3 + 1;
        if (i7 < oooo0.f13285OooOo0o && oooo0.OooOO0(i7) == j) {
            i4 = i7;
        } else if (i3 != -1) {
            i4 = i3;
        }
        long jOooOO0 = oooo0.OooOO0(i4);
        OooO0oO.Oooo0 oooo02 = this.f21693OooO00o;
        o000O00O o000o00o3 = new o000O00O(jOooOO0, oooo02.OooOO0(i4));
        if (jOooOO0 == j || i4 == oooo0.f13285OooOo0o - 1) {
            return new o000Oo0(o000o00o3, o000o00o3);
        }
        int i8 = i4 + 1;
        return new o000Oo0(o000o00o3, new o000O00O(oooo0.OooOO0(i8), oooo02.OooOO0(i8)));
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f21695OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return this.f21694OooO0O0.f13285OooOo0o > 0;
    }
}
