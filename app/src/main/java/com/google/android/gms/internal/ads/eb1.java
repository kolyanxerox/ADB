package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class eb1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f18557OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f18558OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f18559OooO0OO = 0;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public bb1[] f18560OooO0Oo = new bb1[100];

    public final synchronized void OooO00o(int i) {
        int i2 = this.f18557OooO00o;
        this.f18557OooO00o = i;
        if (i < i2) {
            OooO0O0();
        }
    }

    public final synchronized void OooO0O0() {
        int i = this.f18557OooO00o;
        int i2 = i80.f19994OooO00o;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.f18558OooO0O0);
        int i3 = this.f18559OooO0OO;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.f18560OooO0Oo, iMax, i3, (Object) null);
        this.f18559OooO0OO = iMax;
    }
}
