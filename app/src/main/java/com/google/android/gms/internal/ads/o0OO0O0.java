package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o0OO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00OO f22095OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f22096OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f22097OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f22098OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long[] f22099OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f22100OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f22101OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final long f22102OooO0oo;

    public o0OO0O0(o0OO00OO o0oo00oo, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        af0.OoooO0(length == length2);
        int length3 = jArr.length;
        af0.OoooO0(length3 == length2);
        int length4 = iArr2.length;
        af0.OoooO0(length4 == length2);
        this.f22095OooO00o = o0oo00oo;
        this.f22097OooO0OO = jArr;
        this.f22098OooO0Oo = iArr;
        this.f22100OooO0o0 = i;
        this.f22099OooO0o = jArr2;
        this.f22101OooO0oO = iArr2;
        this.f22102OooO0oo = j;
        this.f22096OooO0O0 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int OooO00o(long j) {
        int i;
        int i2 = i80.f19994OooO00o;
        long[] jArr = this.f22099OooO0o;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            while (true) {
                int i3 = iBinarySearch + 1;
                if (i3 >= jArr.length || jArr[i3] != j) {
                    break;
                }
                iBinarySearch = i3;
            }
            i = iBinarySearch;
        }
        while (i < jArr.length) {
            if ((this.f22101OooO0oO[i] & 1) != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
