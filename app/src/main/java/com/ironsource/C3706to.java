package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

/* renamed from: com.ironsource.to */
/* loaded from: classes2.dex */
public final class C3706to implements InterfaceC3671so {
    @Override // com.ironsource.InterfaceC3671so
    /* renamed from: a */
    public void mo12295a(int i) {
        SDKUtils.setDebugMode(i);
    }

    @Override // com.ironsource.InterfaceC3671so
    /* renamed from: b */
    public void mo12299b(String controllerUrl) {
        kotlin.jvm.internal.OooOo.OooO0o0(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC3671so
    /* renamed from: a */
    public void mo12296a(Context applicationContext, String applicationKey, String userId, Map<String, String> initParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationContext, "applicationContext");
        kotlin.jvm.internal.OooOo.OooO0o0(applicationKey, "applicationKey");
        kotlin.jvm.internal.OooOo.OooO0o0(userId, "userId");
        kotlin.jvm.internal.OooOo.OooO0o0(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC3671so
    /* renamed from: a */
    public void mo12297a(InterfaceC3532pp onNetworkSDKInitListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC3671so
    /* renamed from: a */
    public void mo12298a(String controllerConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }
}
