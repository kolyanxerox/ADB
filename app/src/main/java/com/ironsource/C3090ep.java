package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;

/* renamed from: com.ironsource.ep */
/* loaded from: classes2.dex */
public final class C3090ep implements InterfaceC3050dp {
    @Override // com.ironsource.InterfaceC3050dp
    /* renamed from: a */
    public void mo8385a(Activity activity, C3907zj adInstance, Map<String, String> showParams) throws Exception {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.InterfaceC3050dp
    /* renamed from: a */
    public boolean mo8386a(C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
