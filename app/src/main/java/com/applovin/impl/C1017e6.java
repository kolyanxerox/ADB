package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.nativeAd.C1234b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.e6 */
/* loaded from: classes.dex */
public class C1017e6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final JSONObject f726g;

    /* renamed from: h */
    private final AppLovinNativeAdLoadListener f727h;

    public C1017e6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1220k c1220k) {
        super("TaskProcessNativeAdResponse", c1220k);
        this.f726g = jSONObject;
        this.f727h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("ads", this.f726g);
        if (jSONArrayOooOOoo.length() > 0) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Processing ad...");
            }
            this.f776a.m2918r0().m402a(new C1234b(JsonUtils.getJSONObject(jSONArrayOooOOoo, 0, new JSONObject()), this.f726g, this.f727h, this.f776a));
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3218k(this.f777b, "No ads were returned from the server");
        }
        AbstractC1078k7.m1194a("native_native", MaxAdFormat.NATIVE, this.f726g, this.f776a);
        this.f727h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
