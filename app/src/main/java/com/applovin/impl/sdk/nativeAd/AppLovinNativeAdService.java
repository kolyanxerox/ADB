package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1175r0;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1017e6;
import com.applovin.impl.C1070k;
import com.applovin.impl.C1269v5;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final C1240o logger;
    private final C1220k sdk;

    public AppLovinNativeAdService(C1220k c1220k) {
        this.sdk = c1220k;
        this.logger = c1220k.m2847O();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            C1240o.m3207h(TAG, "Empty ad token");
            AbstractC1168q2.m2206b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        C1070k c1070k = new C1070k(strTrim, this.sdk);
        if (c1070k.m1121c() == C1070k.a.REGULAR) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(TAG, "Loading next ad for token: " + c1070k);
            }
            this.sdk.m2918r0().m403a((AbstractRunnableC1036g5) new C1269v5(c1070k, appLovinNativeAdLoadListener, this.sdk), C0987b6.b.CORE);
            return;
        }
        if (c1070k.m1121c() != C1070k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            C1240o.m3207h(TAG, "Invalid token type");
            AbstractC1168q2.m2206b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject jSONObjectM1119a = c1070k.m1119a();
        if (jSONObjectM1119a == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1070k.m1120b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            C1240o.m3207h(TAG, str2);
            AbstractC1168q2.m2206b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        AbstractC1175r0.m2300c(jSONObjectM1119a, this.sdk);
        AbstractC1175r0.m2298b(jSONObjectM1119a, this.sdk);
        AbstractC1175r0.m2289a(jSONObjectM1119a, this.sdk);
        if (JsonUtils.getJSONArray(jSONObjectM1119a, "ads", new JSONArray()).length() > 0) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(TAG, "Rendering ad for token: " + c1070k);
            }
            this.sdk.m2918r0().m403a((AbstractRunnableC1036g5) new C1017e6(jSONObjectM1119a, appLovinNativeAdLoadListener, this.sdk), C0987b6.b.CORE);
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3214b(TAG, "No ad returned from the server for token: " + c1070k);
        }
        AbstractC1168q2.m2206b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
