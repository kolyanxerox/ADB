package com.ironsource;

import com.ironsource.C3584r7;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;

/* renamed from: com.ironsource.q7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3549q7<Smash extends C3584r7<?>> extends AbstractC3444n7<Smash, AdapterAdRewardListener> implements InterfaceC3684t2 {
    public AbstractC3549q7(C3682t0 c3682t0, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        super(c3682t0, c3840xk, ironSourceSegment);
    }

    @Override // com.ironsource.InterfaceC3684t2
    /* renamed from: a */
    public void mo11506a(C3584r7<?> c3584r7, Placement placement) {
        IronLog.INTERNAL.verbose(m11349b(c3584r7.m11872k()));
        this.f10787t.mo8555b(placement, c3584r7.m11867f());
    }
}
