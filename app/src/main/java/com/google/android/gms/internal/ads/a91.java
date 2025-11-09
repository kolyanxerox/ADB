package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class a91 extends w81 {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f16985OooO0o0 = new Object();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f16986OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f16987OooO0Oo;

    public a91(AbstractC1787lf abstractC1787lf, Object obj, Object obj2) {
        super(abstractC1787lf);
        this.f16986OooO0OO = obj;
        this.f16987OooO0Oo = obj2;
    }

    @Override // com.google.android.gms.internal.ads.w81, com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO00o(Object obj) {
        Object obj2;
        if (f16985OooO0o0.equals(obj) && (obj2 = this.f16987OooO0Oo) != null) {
            obj = obj2;
        }
        return this.f25266OooO0O0.OooO00o(obj);
    }

    @Override // com.google.android.gms.internal.ads.w81, com.google.android.gms.internal.ads.AbstractC1787lf
    public final C1528ee OooO0Oo(int i, C1528ee c1528ee, boolean z) {
        this.f25266OooO0O0.OooO0Oo(i, c1528ee, z);
        if (Objects.equals(c1528ee.f18575OooO0O0, this.f16987OooO0Oo) && z) {
            c1528ee.f18575OooO0O0 = f16985OooO0o0;
        }
        return c1528ee;
    }

    @Override // com.google.android.gms.internal.ads.w81, com.google.android.gms.internal.ads.AbstractC1787lf
    public final Object OooO0o(int i) {
        Object objOooO0o = this.f25266OooO0O0.OooO0o(i);
        return Objects.equals(objOooO0o, this.f16987OooO0Oo) ? f16985OooO0o0 : objOooO0o;
    }

    @Override // com.google.android.gms.internal.ads.w81, com.google.android.gms.internal.ads.AbstractC1787lf
    public final C2045se OooO0o0(int i, C2045se c2045se, long j) {
        this.f25266OooO0O0.OooO0o0(i, c2045se, j);
        if (Objects.equals(c2045se.f24070OooO00o, this.f16986OooO0OO)) {
            c2045se.f24070OooO00o = C2045se.f24068OooOOO0;
        }
        return c2045se;
    }
}
