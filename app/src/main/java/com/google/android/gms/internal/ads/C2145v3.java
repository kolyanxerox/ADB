package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.v3 */
/* loaded from: classes2.dex */
public final class C2145v3 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final C2145v3 f24840OooO0O0 = new C2145v3(new OooO00o[0]);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f24841OooO0OO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o[] f24842OooO00o;

    static {
        OooO00o oooO00o = new OooO00o(-1, new int[0], new C1550f[0], new long[0]);
        int[] iArr = oooO00o.f16778OooO0Oo;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = oooO00o.f16779OooO0o0;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f24841OooO0OO = new OooO00o(0, iArrCopyOf, (C1550f[]) Arrays.copyOf(oooO00o.f16777OooO0OO, 0), jArrCopyOf);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C2145v3(OooO00o[] oooO00oArr) {
        this.f24842OooO00o = oooO00oArr;
    }

    public final OooO00o OooO00o(int i) {
        return i < 0 ? f24841OooO0OO : this.f24842OooO00o[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2145v3.class == obj.getClass() && Arrays.equals(this.f24842OooO00o, ((C2145v3) obj).f24842OooO00o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24842OooO00o) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOO0("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
