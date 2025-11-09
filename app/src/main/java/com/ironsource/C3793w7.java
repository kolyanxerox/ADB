package com.ironsource;

import com.ironsource.AbstractC3100f0;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.w7 */
/* loaded from: classes2.dex */
public final class C3793w7 extends AbstractC3100f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3793w7(AbstractC3718u1 adUnitData, C3272jx waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.AbstractC3100f0
    /* renamed from: a */
    public void mo8581a(AbstractC3887z instance, AbstractC3100f0.b loadSelection) {
        String str;
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        kotlin.jvm.internal.OooOo.OooO0o0(loadSelection, "loadSelection");
        if (!instance.m13281t()) {
            IronLog.INTERNAL.verbose(instance.m13267d().name() + " - Instance " + instance.m13276o() + " (non-bidder) is ready to load");
            loadSelection.m8589a().add(instance);
            return;
        }
        loadSelection.m8590a(true);
        if (loadSelection.m8594e()) {
            str = "Advanced Loading: Starting to load bidder " + instance.m13276o() + ". No other instances will be loaded at the same time.";
            loadSelection.m8589a().add(instance);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + instance.m13276o() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(instance.m13267d().name() + " - " + str);
    }

    @Override // com.ironsource.AbstractC3100f0
    /* renamed from: a */
    public boolean mo8583a(AbstractC3100f0.b loadSelection) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadSelection, "loadSelection");
        return super.mo8583a(loadSelection) || loadSelection.m8593d();
    }
}
