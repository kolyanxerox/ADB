package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.v5 */
/* loaded from: classes.dex */
public class C1269v5 extends AbstractC1287x5 {

    /* renamed from: j */
    private final C1070k f2949j;

    public C1269v5(C1070k c1070k, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1220k c1220k) {
        super(C1254u.m3363a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, c1220k);
        this.f2949j = c1070k;
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: h */
    public Map mo2076h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f2949j.m1120b());
        map.put("adtoken_prefix", this.f2949j.m1122d());
        return map;
    }
}
