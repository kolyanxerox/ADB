package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.logger.c */
/* loaded from: classes2.dex */
class C3398c {

    /* renamed from: a */
    private IronSourceLogger.IronSourceTag f9902a;

    /* renamed from: b */
    private String f9903b;

    /* renamed from: c */
    private String f9904c;

    /* renamed from: d */
    private int f9905d;

    public C3398c(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.f9902a = ironSourceTag;
        this.f9903b = str;
        this.f9904c = str2;
        this.f9905d = i;
    }

    /* renamed from: a */
    public int m10384a() {
        return this.f9905d;
    }

    /* renamed from: b */
    public JSONObject m10385b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f9903b);
            jSONObject.put("tag", this.f9902a);
            jSONObject.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f9905d);
            jSONObject.put(Constants.MESSAGE, this.f9904c);
            return jSONObject;
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
