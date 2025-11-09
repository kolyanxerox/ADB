package com.applovin.impl.sdk.p005ad;

import OooO0oO.OooOo;
import android.os.Bundle;
import com.applovin.impl.AbstractC0995c4;
import com.applovin.impl.C1254u;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.c */
/* loaded from: classes.dex */
public final class C1208c extends AppLovinAdImpl {

    /* renamed from: d */
    private AppLovinAd f2013d;

    /* renamed from: e */
    private final C1254u f2014e;

    public C1208c(C1254u c1254u, C1220k c1220k) {
        super(new JSONObject(), new JSONObject(), c1220k);
        this.f2014e = c1254u;
    }

    /* renamed from: d */
    private AppLovinAd m2650d() {
        return (AppLovinAd) this.sdk.m2901i().m2708f(this.f2014e);
    }

    /* renamed from: e */
    private String m2651e() {
        C1254u adZone = getAdZone();
        if (adZone == null || adZone.m3378i()) {
            return null;
        }
        return adZone.m3375e();
    }

    /* renamed from: a */
    public void m2652a(AppLovinAd appLovinAd) {
        this.f2013d = appLovinAd;
    }

    /* renamed from: c */
    public AppLovinAd m2653c() {
        AppLovinAd appLovinAd = this.f2013d;
        return appLovinAd != null ? appLovinAd : m2650d();
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1208c.class != obj.getClass()) {
            return false;
        }
        AppLovinAd appLovinAdM2653c = m2653c();
        return appLovinAdM2653c != null ? appLovinAdM2653c.equals(obj) : super.equals(obj);
    }

    /* renamed from: f */
    public AppLovinAd m2654f() {
        return this.f2013d;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public AbstractC0995c4 getAdEventTracker() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        AppLovinAd appLovinAdM2653c = m2653c();
        if (appLovinAdM2653c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM2653c).getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public C1254u getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) m2653c();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f2014e;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd appLovinAdM2653c = m2653c();
        if (appLovinAdM2653c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM2653c).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        return new Bundle();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public String getMediationServeId() {
        AppLovinAd appLovinAdM2653c = m2653c();
        if (appLovinAdM2653c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM2653c).getMediationServeId();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd appLovinAdM2653c = m2653c();
        if (appLovinAdM2653c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM2653c).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().m3376f();
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().m3377g();
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f2014e.m3378i()) {
            return null;
        }
        return this.f2014e.m3375e();
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd appLovinAdM2653c = m2653c();
        return appLovinAdM2653c != null ? appLovinAdM2653c.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public boolean isExpired() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) m2653c();
        return appLovinAdImpl != null && appLovinAdImpl.isExpired();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public boolean isVideoAd() {
        AppLovinAd appLovinAdM2653c = m2653c();
        return (appLovinAdM2653c instanceof AppLovinAdImpl) && ((AppLovinAdImpl) appLovinAdM2653c).isVideoAd();
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinAd{ #");
        sb.append(getAdIdNumber());
        sb.append(", adType=");
        sb.append(getType());
        sb.append(", adSize=");
        sb.append(getSize());
        sb.append(", zoneId='");
        return OooOo.OooOOOo(sb, m2651e(), "'}");
    }
}
