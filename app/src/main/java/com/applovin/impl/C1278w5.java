package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.w5 */
/* loaded from: classes.dex */
public class C1278w5 extends AbstractC1155p5 {

    /* renamed from: i */
    private final AppLovinAdLoadListener f3002i;

    public C1278w5(C1254u c1254u, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        this(c1254u, appLovinAdLoadListener, "TaskFetchNextAd", c1220k);
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: a */
    public AbstractRunnableC1036g5 mo2071a(JSONObject jSONObject) {
        return new C0997c6(jSONObject, this.f1721g, this.f3002i, this.f776a);
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: e */
    public String mo2074e() {
        return AbstractC1175r0.m2285a(this.f776a);
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: f */
    public String mo2075f() {
        return AbstractC1175r0.m2296b(this.f776a);
    }

    public C1278w5(C1254u c1254u, AppLovinAdLoadListener appLovinAdLoadListener, String str, C1220k c1220k) {
        super(c1254u, str, c1220k);
        this.f3002i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.AbstractC1155p5
    /* renamed from: a */
    public void mo2072a(int i, String str) {
        super.mo2072a(i, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3002i;
        if (!(appLovinAdLoadListener instanceof InterfaceC1083l2)) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        } else {
            ((InterfaceC1083l2) this.f3002i).failedToReceiveAdV2(new AppLovinError(i, str));
        }
    }
}
