package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;

/* renamed from: com.ironsource.po */
/* loaded from: classes2.dex */
public final class C3531po implements InterfaceC3496oo {
    @Override // com.ironsource.InterfaceC3496oo
    /* renamed from: a */
    public void mo11232a(C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.m13395e() + " failed. error: " + e.getMessage());
        }
    }
}
