package com.applovin.impl;

import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.h6 */
/* loaded from: classes.dex */
public class C1047h6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final JSONObject f849g;

    /* renamed from: h */
    private final JSONObject f850h;

    /* renamed from: i */
    private final AppLovinAdLoadListener f851i;

    public C1047h6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        super("TaskRenderAppLovinAd", c1220k);
        this.f849g = jSONObject;
        this.f850h = jSONObject2;
        this.f851i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Rendering ad...");
        }
        C1206a c1206a = new C1206a(this.f849g, this.f850h, this.f776a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f849g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f849g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        C1076k5 c1076k5 = new C1076k5(c1206a, this.f776a, this.f851i);
        c1076k5.m1147c(zBooleanValue2);
        c1076k5.m1146b(zBooleanValue);
        this.f776a.m2918r0().m403a((AbstractRunnableC1036g5) c1076k5, C0987b6.b.CACHING);
    }
}
