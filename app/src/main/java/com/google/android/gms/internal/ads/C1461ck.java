package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ck */
/* loaded from: classes2.dex */
public final class C1461ck {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f18004OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1421bg f18005OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f18006OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f18007OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean[] f18008OooO0o0;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C1461ck(C1421bg c1421bg, boolean z, int[] iArr, boolean[] zArr) {
        int i = c1421bg.f17492OooO00o;
        this.f18004OooO00o = i;
        af0.OoooO0(i == iArr.length && i == zArr.length);
        this.f18005OooO0O0 = c1421bg;
        this.f18006OooO0OO = z && i > 1;
        this.f18007OooO0Oo = (int[]) iArr.clone();
        this.f18008OooO0o0 = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1461ck.class == obj.getClass()) {
            C1461ck c1461ck = (C1461ck) obj;
            if (this.f18006OooO0OO == c1461ck.f18006OooO0OO && this.f18005OooO0O0.equals(c1461ck.f18005OooO0O0) && Arrays.equals(this.f18007OooO0Oo, c1461ck.f18007OooO0Oo) && Arrays.equals(this.f18008OooO0o0, c1461ck.f18008OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18008OooO0o0) + ((Arrays.hashCode(this.f18007OooO0Oo) + (((this.f18005OooO0O0.hashCode() * 31) + (this.f18006OooO0OO ? 1 : 0)) * 31)) * 31);
    }
}
