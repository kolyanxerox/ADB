package com.applovin.impl.sdk.p005ad;

import androidx.core.location.LocationRequestCompat;
import com.applovin.impl.C1026f5;
import com.applovin.impl.C1254u;
import com.applovin.impl.C1268v4;
import com.applovin.impl.InterfaceC1185s1;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, InterfaceC1185s1 {

    /* renamed from: a */
    private C1254u f1976a;

    /* renamed from: b */
    private boolean f1977b;

    /* renamed from: c */
    private C1208c f1978c;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        super(jSONObject, jSONObject2, c1220k);
    }

    /* renamed from: b */
    private long m2481b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.m2866a(C1268v4.f2747b1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && m2481b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdM2653c;
        if ((obj instanceof C1208c) && (appLovinAdM2653c = ((C1208c) obj).m2653c()) != null) {
            obj = appLovinAdM2653c;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public C1254u getAdZone() {
        C1254u c1254u = this.f1976a;
        if (c1254u != null) {
            if (c1254u.m3376f() != null && this.f1976a.m3377g() != null) {
                return this.f1976a;
            }
            if (getSize() == null && getType() == null) {
                return this.f1976a;
            }
        }
        C1254u c1254uM3362a = C1254u.m3362a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f1976a = c1254uM3362a;
        return c1254uM3362a;
    }

    public C1208c getDummyAd() {
        return this.f1978c;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String string;
        C1026f5 c1026f5 = this.synchronizedFullResponse;
        if (c1026f5 != null) {
            return c1026f5.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.InterfaceC1185s1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return m2481b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().m3378i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.m2847O();
        if (!C1240o.m3200a()) {
            return false;
        }
        this.sdk.m2847O().m3214b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f1977b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(C1208c c1208c) {
        this.f1978c = c1208c;
    }

    @Override // com.applovin.impl.InterfaceC1185s1
    public void setExpired() {
        this.f1977b = true;
    }

    public void setHasShown(boolean z) {
        try {
            C1026f5 c1026f5 = this.synchronizedAdObject;
            if (c1026f5 != null) {
                c1026f5.m733a("shown", (Object) Boolean.valueOf(z));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
