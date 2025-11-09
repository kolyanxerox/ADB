package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.x5 */
/* loaded from: classes.dex */
public abstract class AbstractC1287x5 extends AbstractC1155p5 {

    /* renamed from: i */
    private final AppLovinNativeAdLoadListener f3074i;

    public AbstractC1287x5(C1254u c1254u, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1220k c1220k) {
        super(c1254u, str, c1220k);
        this.f3074i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: a */
    public AbstractRunnableC1036g5 mo2071a(JSONObject jSONObject) {
        return new C1017e6(jSONObject, this.f3074i, this.f776a);
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: e */
    public String mo2074e() {
        return AbstractC1175r0.m2301d(this.f776a);
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: f */
    public String mo2075f() {
        return AbstractC1175r0.m2302e(this.f776a);
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: a */
    public void mo2072a(int i, String str) {
        super.mo2072a(i, str);
        this.f3074i.onNativeAdLoadFailed(new AppLovinError(i, str));
    }
}
