package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class hm0 extends km0 {
    public static final km0 OooO0o(int i) {
        return i < 0 ? km0.f20622OooO0O0 : i > 0 ? km0.f20623OooO0OO : km0.f20621OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final int OooO00o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final km0 OooO0O0(int i, int i2) {
        return OooO0o(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final km0 OooO0OO(Object obj, Object obj2, Comparator comparator) {
        return OooO0o(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final km0 OooO0Oo(boolean z, boolean z2) {
        return OooO0o(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final km0 OooO0o0(boolean z, boolean z2) {
        return OooO0o(Boolean.compare(z2, z));
    }
}
