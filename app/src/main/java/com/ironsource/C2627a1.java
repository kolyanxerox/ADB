package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;

/* renamed from: com.ironsource.a1 */
/* loaded from: classes2.dex */
public final class C2627a1 implements InterfaceC3888z0 {

    /* renamed from: a */
    private final InterfaceC3050dp f3875a;

    public C2627a1(InterfaceC3050dp networkShowApi) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkShowApi, "networkShowApi");
        this.f3875a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC3888z0
    /* renamed from: a */
    public void mo4763a(Activity activity, C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.m13397g() + " adInstanceId=" + adInstance.m13395e());
        this.f3875a.mo8385a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC3888z0
    /* renamed from: a */
    public boolean mo4764a(C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        return this.f3875a.mo8386a(adInstance);
    }
}
