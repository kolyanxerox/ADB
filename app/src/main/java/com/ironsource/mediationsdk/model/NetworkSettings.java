package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkSettings {

    /* renamed from: r */
    private static final String f9932r = "customNetwork";

    /* renamed from: s */
    private static final String f9933s = "customNetworkPackage";

    /* renamed from: t */
    private static final String f9934t = "customNetworkAdapterName";

    /* renamed from: a */
    private String f9935a;

    /* renamed from: b */
    private String f9936b;

    /* renamed from: c */
    private JSONObject f9937c;

    /* renamed from: d */
    private JSONObject f9938d;

    /* renamed from: e */
    private JSONObject f9939e;

    /* renamed from: f */
    private JSONObject f9940f;

    /* renamed from: g */
    private JSONObject f9941g;

    /* renamed from: h */
    private String f9942h;

    /* renamed from: i */
    private String f9943i;

    /* renamed from: j */
    private boolean f9944j;

    /* renamed from: k */
    private String f9945k;

    /* renamed from: l */
    private int f9946l;

    /* renamed from: m */
    private int f9947m;

    /* renamed from: n */
    private int f9948n;

    /* renamed from: o */
    private int f9949o;

    /* renamed from: p */
    private String f9950p;

    /* renamed from: q */
    private String f9951q;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f9935a = networkSettings.getProviderName();
        this.f9945k = networkSettings.getProviderName();
        this.f9936b = networkSettings.getProviderTypeForReflection();
        this.f9938d = networkSettings.getRewardedVideoSettings();
        this.f9939e = networkSettings.getInterstitialSettings();
        this.f9940f = networkSettings.getBannerSettings();
        this.f9941g = networkSettings.getNativeAdSettings();
        this.f9937c = networkSettings.getApplicationSettings();
        this.f9946l = networkSettings.getRewardedVideoPriority();
        this.f9947m = networkSettings.getInterstitialPriority();
        this.f9948n = networkSettings.getBannerPriority();
        this.f9949o = networkSettings.getNativeAdPriority();
        this.f9950p = networkSettings.getProviderDefaultInstance();
        this.f9951q = networkSettings.getProviderNetworkKey();
    }

    public String getAdSourceNameForEvents() {
        return this.f9943i;
    }

    public JSONObject getApplicationSettings() {
        return this.f9937c;
    }

    public int getBannerPriority() {
        return this.f9948n;
    }

    public JSONObject getBannerSettings() {
        return this.f9940f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f9937c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f9937c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f9938d) != null) || ((ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f9939e) != null) || (ad_unit.equals(IronSource.AD_UNIT.BANNER) && (jSONObject2 = this.f9940f) != null)))) {
            return jSONObject2.optString(f9934t);
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) || (jSONObject = this.f9941g) == null) {
            return null;
        }
        return jSONObject.optString(f9934t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f9937c;
        return jSONObject != null ? jSONObject.optString(f9933s, "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 1;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f9947m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f9939e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 99;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("maxAdsPerSession", 99);
    }

    public int getNativeAdPriority() {
        return this.f9949o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f9941g;
    }

    public String getProviderDefaultInstance() {
        return this.f9950p;
    }

    public String getProviderInstanceName() {
        return this.f9945k;
    }

    public String getProviderName() {
        return this.f9935a;
    }

    public String getProviderNetworkKey() {
        return this.f9951q;
    }

    public String getProviderTypeForReflection() {
        return this.f9936b;
    }

    public int getRewardedVideoPriority() {
        return this.f9946l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f9938d;
    }

    public String getSubProviderId() {
        return this.f9942h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f9944j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f9943i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f9937c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f9948n = i;
    }

    public void setBannerSettings(String str, Object obj) throws JSONException {
        try {
            this.f9940f.put(str, obj);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setInterstitialPriority(int i) {
        this.f9947m = i;
    }

    public void setInterstitialSettings(String str, Object obj) throws JSONException {
        try {
            this.f9939e.put(str, obj);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setIsMultipleInstances(boolean z) {
        this.f9944j = z;
    }

    public void setNativeAdPriority(int i) {
        this.f9949o = i;
    }

    public void setNativeAdSettings(String str, Object obj) throws JSONException {
        try {
            this.f9941g.put(str, obj);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setProviderNetworkKey(String str) {
        this.f9951q = str;
    }

    public void setRewardedVideoPriority(int i) {
        this.f9946l = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) throws JSONException {
        try {
            this.f9938d.put(str, obj);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setSubProviderId(String str) {
        this.f9942h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f9937c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public NetworkSettings(String str) {
        this.f9935a = str;
        this.f9945k = str;
        this.f9936b = str;
        this.f9950p = str;
        this.f9951q = str;
        this.f9938d = new JSONObject();
        this.f9939e = new JSONObject();
        this.f9940f = new JSONObject();
        this.f9941g = new JSONObject();
        this.f9937c = new JSONObject();
        this.f9946l = -1;
        this.f9947m = -1;
        this.f9948n = -1;
        this.f9949o = -1;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f9940f = jSONObject;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f9939e = jSONObject;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f9941g = jSONObject;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f9938d = jSONObject;
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f9935a = str;
        this.f9945k = str;
        this.f9936b = str2;
        this.f9950p = str3;
        this.f9951q = str4;
        this.f9938d = jSONObject2;
        this.f9939e = jSONObject3;
        this.f9940f = jSONObject4;
        this.f9941g = jSONObject5;
        this.f9937c = jSONObject;
        this.f9946l = -1;
        this.f9947m = -1;
        this.f9948n = -1;
        this.f9949o = -1;
    }
}
