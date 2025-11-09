package com.ironsource;

import com.ironsource.AbstractC3619s7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* renamed from: com.ironsource.ma */
/* loaded from: classes2.dex */
public final class C3358ma<Smash extends AbstractC3619s7<?>> extends AbstractC3610rx<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3358ma(int i, boolean z, List<? extends Smash> waterfall) {
        super(i, z, waterfall);
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
    }

    @Override // com.ironsource.AbstractC3610rx
    /* renamed from: c */
    public void mo10013c(Smash smash) {
        kotlin.jvm.internal.OooOo.OooO0o0(smash, "smash");
        IronLog.INTERNAL.verbose(smash.m11868g().name() + " - Smash " + smash.m11872k() + " is ready to load");
        smash.m11863a(true);
        m11778c().add(smash);
    }
}
