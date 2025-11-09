package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* renamed from: com.applovin.impl.k0 */
/* loaded from: classes.dex */
public class C1071k0 {

    /* renamed from: a */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f985a;

    public C1071k0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f985a = consentFlowUserGeography;
    }

    /* renamed from: a */
    public boolean m1125a(Object obj) {
        return obj instanceof C1071k0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1071k0)) {
            return false;
        }
        C1071k0 c1071k0 = (C1071k0) obj;
        if (!c1071k0.m1125a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM1124a = m1124a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM1124a2 = c1071k0.m1124a();
        return consentFlowUserGeographyM1124a != null ? consentFlowUserGeographyM1124a.equals(consentFlowUserGeographyM1124a2) : consentFlowUserGeographyM1124a2 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM1124a = m1124a();
        return (consentFlowUserGeographyM1124a == null ? 43 : consentFlowUserGeographyM1124a.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + m1124a() + ")";
    }

    /* renamed from: a */
    public AppLovinSdkConfiguration.ConsentFlowUserGeography m1124a() {
        return this.f985a;
    }
}
