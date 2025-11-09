package com.ironsource.adqualitysdk.sdk.p009i;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ia */
/* loaded from: classes2.dex */
public final class C2859ia<T> {

    /* renamed from: ﻛ */
    private C2857hz f6718;

    /* renamed from: ｋ */
    private boolean f6719;

    /* renamed from: ﾇ */
    private C2852hu f6720 = new C2852hu();

    /* renamed from: ﻐ */
    private Set<Object> f6717 = new HashSet();

    /* renamed from: ﾒ */
    private Set<T> f6721 = new HashSet();

    /* renamed from: ﱟ */
    private Set<InterfaceC2851ht> f6716 = new HashSet();

    public C2859ia(C2857hz c2857hz) {
        this.f6718 = c2857hz;
    }

    /* renamed from: ﮐ */
    public final Set<T> m7054() {
        return this.f6721;
    }

    /* renamed from: ﱡ */
    public final Set<InterfaceC2851ht> m7055() {
        return this.f6716;
    }

    /* renamed from: ﻐ */
    public final C2857hz m7056() {
        return this.f6718;
    }

    /* renamed from: ﻛ */
    public final C2859ia m7058() {
        this.f6719 = true;
        return this;
    }

    /* renamed from: ｋ */
    public final Set<Object> m7059() {
        return this.f6717;
    }

    /* renamed from: ﾇ */
    public final C2852hu m7061() {
        return this.f6720;
    }

    /* renamed from: ﾒ */
    public final boolean m7062() {
        return this.f6719;
    }

    /* renamed from: ﻐ */
    public final void m7057(InterfaceC2851ht interfaceC2851ht) {
        this.f6716.add(interfaceC2851ht);
    }

    /* renamed from: ｋ */
    public final void m7060(T t) {
        this.f6721.add(t);
    }
}
