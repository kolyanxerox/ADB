package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;

/* renamed from: com.ironsource.kq */
/* loaded from: classes2.dex */
public final class C3300kq extends AbstractC3724u7 {

    /* renamed from: P */
    public static final C3300kq f9270P;

    /* renamed from: com.ironsource.kq$a */
    public static final class a {
        /* renamed from: a */
        public final void m9696a() {
            new C3190hk().m9141b(ContextProvider.getInstance().getApplicationContext());
            C3300kq.f9270P.mo12605a(new C3899zb(EnumC2638ac.INIT_DEFERRED_DATA, new C3770vi().m12785a()));
        }
    }

    static {
        C3300kq c3300kq = new C3300kq();
        f9270P = c3300kq;
        c3300kq.f12170H = "outcome";
        c3300kq.f12169G = 0;
        c3300kq.f12171I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c3300kq.m12626e();
    }

    private C3300kq() {
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: a */
    public void mo9693a(ArrayList<C3899zb> arrayList) {
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: c */
    public int mo8392c(C3899zb c3899zb) {
        return 1;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: d */
    public void mo8393d() {
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: e */
    public String mo8395e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: f */
    public void mo8396f(C3899zb c3899zb) {
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: g */
    public boolean mo9694g(C3899zb c3899zb) {
        return false;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: h */
    public boolean mo9695h(C3899zb c3899zb) {
        return false;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: j */
    public boolean mo8397j(C3899zb c3899zb) {
        return false;
    }

    @Override // com.ironsource.AbstractC3724u7
    /* renamed from: d */
    public boolean mo8394d(C3899zb c3899zb) {
        return true;
    }
}
