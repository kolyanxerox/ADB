package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f16774OooO0o = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f16775OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Uri[] f16776OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1550f[] f16777OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f16778OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f16779OooO0o0;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public OooO00o(int i, int[] iArr, C1550f[] c1550fArr, long[] jArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = c1550fArr.length;
        int i2 = 0;
        af0.OoooO0(length == length2);
        this.f16775OooO00o = i;
        this.f16778OooO0Oo = iArr;
        this.f16777OooO0OO = c1550fArr;
        this.f16779OooO0o0 = jArr;
        this.f16776OooO0O0 = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f16776OooO0O0;
            if (i2 >= uriArr.length) {
                return;
            }
            C1550f c1550f = c1550fArr[i2];
            if (c1550f == null) {
                uri = null;
            } else {
                oO00o00O oo00o00o = c1550f.f18716OooO0O0;
                oo00o00o.getClass();
                uri = oo00o00o.f22536OooO00o;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OooO00o.class == obj.getClass()) {
            OooO00o oooO00o = (OooO00o) obj;
            if (this.f16775OooO00o == oooO00o.f16775OooO00o && Arrays.equals(this.f16777OooO0OO, oooO00o.f16777OooO0OO) && Arrays.equals(this.f16778OooO0Oo, oooO00o.f16778OooO0Oo) && Arrays.equals(this.f16779OooO0o0, oooO00o.f16779OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f16779OooO0o0) + ((Arrays.hashCode(this.f16778OooO0Oo) + ((Arrays.hashCode(this.f16777OooO0OO) + (((this.f16775OooO00o * 31) - 1) * 961)) * 31)) * 31)) * 961;
    }
}
