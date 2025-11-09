package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* renamed from: com.ironsource.hb */
/* loaded from: classes2.dex */
public interface InterfaceC3181hb<T> extends InterfaceC3602rp {
    /* renamed from: b */
    String mo8061b();

    /* renamed from: b */
    void mo8062b(C3769vh c3769vh);

    /* renamed from: c */
    InterfaceC3866yc mo8063c();

    /* renamed from: h */
    default boolean m9109h() {
        return mo8065j().exists();
    }

    /* renamed from: i */
    o00O0Oo.Oooo000 mo8064i();

    /* renamed from: j */
    C3769vh mo8065j();

    /* renamed from: k */
    InterfaceC3801wf mo8066k();

    /* renamed from: l */
    default void m9110l() {
        mo8066k().mo8936a(this);
        if (mo8065j().exists()) {
            IronSourceStorageUtils.deleteFile(mo8065j());
        }
        try {
            mo8066k().mo8938a(mo8065j(), mo8063c().value(), 5, 5);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(e), mo8064i());
        }
    }
}
