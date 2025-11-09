package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;

/* renamed from: com.ironsource.yo */
/* loaded from: classes2.dex */
public final class C3878yo implements InterfaceC3844xo {
    @Override // com.ironsource.InterfaceC3844xo
    /* renamed from: a */
    public String mo13103a() {
        String version = IronSourceNetwork.getVersion();
        kotlin.jvm.internal.OooOo.OooO0Oo(version, "getVersion()");
        return version;
    }

    @Override // com.ironsource.InterfaceC3844xo
    /* renamed from: a */
    public void mo13104a(C3907zj adInstance, C3912zo loadParams) throws Exception {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.m13418a());
    }
}
