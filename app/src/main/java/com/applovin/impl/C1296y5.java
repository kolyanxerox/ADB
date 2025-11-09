package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.y5 */
/* loaded from: classes.dex */
public class C1296y5 extends C1278w5 {

    /* renamed from: j */
    private final C1070k f3160j;

    public C1296y5(C1070k c1070k, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        super(C1254u.m3363a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", c1220k);
        this.f3160j = c1070k;
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: h */
    public Map mo2076h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f3160j.m1120b());
        map.put("adtoken_prefix", this.f3160j.m1122d());
        return map;
    }
}
