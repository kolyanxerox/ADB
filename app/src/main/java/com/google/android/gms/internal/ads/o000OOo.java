package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o000OOo implements o000O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f21718OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f21719OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f21720OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long[] f21721OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f21722OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f21723OooO0o0;

    public o000OOo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f21719OooO0O0 = iArr;
        this.f21720OooO0OO = jArr;
        this.f21721OooO0Oo = jArr2;
        this.f21723OooO0o0 = jArr3;
        int length = iArr.length;
        this.f21718OooO00o = length;
        if (length <= 0) {
            this.f21722OooO0o = 0L;
        } else {
            int i = length - 1;
            this.f21722OooO0o = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        long[] jArr = this.f21723OooO0o0;
        int iOooOO0 = i80.OooOO0(jArr, j, true);
        long j2 = jArr[iOooOO0];
        long[] jArr2 = this.f21720OooO0OO;
        o000O00O o000o00o2 = new o000O00O(j2, jArr2[iOooOO0]);
        if (j2 >= j || iOooOO0 == this.f21718OooO00o - 1) {
            return new o000Oo0(o000o00o2, o000o00o2);
        }
        int i = iOooOO0 + 1;
        return new o000Oo0(o000o00o2, new o000O00O(jArr[i], jArr2[i]));
    }

    public final String toString() {
        String string = Arrays.toString(this.f21719OooO0O0);
        String string2 = Arrays.toString(this.f21720OooO0OO);
        String string3 = Arrays.toString(this.f21723OooO0o0);
        String string4 = Arrays.toString(this.f21721OooO0Oo);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.f21718OooO00o);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, string2, ", timeUs=", string3, ", durationsUs=");
        return OooO0oO.OooOo.OooOOOo(sb, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        return this.f21722OooO0o;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        return true;
    }
}
