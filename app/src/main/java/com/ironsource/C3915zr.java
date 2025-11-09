package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* renamed from: com.ironsource.zr */
/* loaded from: classes2.dex */
public class C3915zr extends C3584r7<InterfaceC3684t2> implements RewardedVideoAdListener {
    public C3915zr(InterfaceC3778vq interfaceC3778vq, C3275k1 c3275k1, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C3353m5 c3353m5, InterfaceC3684t2 interfaceC3684t2) {
        super(interfaceC3778vq, c3275k1, baseAdAdapter, new C2629a3(c3275k1.m9568g(), c3275k1.m9568g().getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), c3353m5, interfaceC3684t2);
    }
}
