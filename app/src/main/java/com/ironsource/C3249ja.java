package com.ironsource;

import com.ironsource.AbstractC3100f0;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.ja */
/* loaded from: classes2.dex */
public class C3249ja extends AbstractC3100f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3249ja(AbstractC3718u1 adUnitData, C3272jx waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.AbstractC3100f0
    /* renamed from: a */
    public void mo8581a(AbstractC3887z instance, AbstractC3100f0.b loadSelection) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        kotlin.jvm.internal.OooOo.OooO0o0(loadSelection, "loadSelection");
        IronLog.INTERNAL.verbose(instance.m13267d().name() + " - Instance " + instance.m13277p() + " is ready to load");
        loadSelection.m8589a().add(instance);
    }
}
