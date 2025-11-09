package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.u3 */
/* loaded from: classes2.dex */
public final class C3720u3 extends AbstractC3724u7 {
    public C3720u3() {
        this.f12170H = "outcome";
        this.f12169G = 4;
        this.f12171I = IronSourceConstants.APP_EVENT_TYPE;
        m12626e();
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
    public boolean mo8394d(C3899zb event) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        int iM13323c = event.m13323c();
        return iM13323c == EnumC2638ac.FIRST_INSTANCE.m4887b() || iM13323c == EnumC2638ac.INIT_COMPLETE.m4887b() || iM13323c == EnumC2638ac.SDK_INIT_FAILED.m4887b() || iM13323c == EnumC2638ac.SDK_INIT_SUCCESS.m4887b();
    }
}
