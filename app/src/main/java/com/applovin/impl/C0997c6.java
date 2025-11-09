package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.c6 */
/* loaded from: classes.dex */
public class C0997c6 extends AbstractRunnableC1036g5 implements InterfaceC1083l2 {

    /* renamed from: g */
    private final JSONObject f582g;

    /* renamed from: h */
    private final C1254u f583h;

    /* renamed from: i */
    private final AppLovinAdLoadListener f584i;

    /* renamed from: j */
    private final boolean f585j;

    public C0997c6(JSONObject jSONObject, C1254u c1254u, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        this(jSONObject, c1254u, false, appLovinAdLoadListener, c1220k);
    }

    /* renamed from: a */
    private void m486a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Starting task for AppLovin ad...");
            }
            this.f776a.m2918r0().m402a(new C1047h6(jSONObject, this.f582g, this, this.f776a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Starting task for VAST ad...");
            }
            this.f776a.m2918r0().m402a(AbstractC1027f6.m744a(jSONObject, this.f582g, this, this.f776a));
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, OooO0oO.OooOo.OooOO0("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f584i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f585j || !(appLovinAd instanceof AbstractC1207b)) {
            return;
        }
        this.f776a.m2897g().m705a(C0993c2.f529n, (AbstractC1207b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.InterfaceC1083l2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f584i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof InterfaceC1083l2) {
            ((InterfaceC1083l2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f585j) {
            return;
        }
        this.f776a.m2897g().m707a(C0993c2.f531o, this.f583h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("ads", this.f582g);
        if (jSONArrayOooOOoo.length() > 0) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Processing ad...");
            }
            m486a(JsonUtils.getJSONObject(jSONArrayOooOOoo, 0, new JSONObject()));
        } else {
            if (C1240o.m3200a()) {
                this.f778c.m3218k(this.f777b, "No ads were returned from the server");
            }
            AbstractC1078k7.m1194a(this.f583h.m3375e(), this.f583h.m3374d(), this.f582g, this.f776a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public C0997c6(JSONObject jSONObject, C1254u c1254u, boolean z, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        super("TaskProcessAdResponse", c1220k);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1254u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f582g = jSONObject;
        this.f583h = c1254u;
        this.f584i = appLovinAdLoadListener;
        this.f585j = z;
    }
}
