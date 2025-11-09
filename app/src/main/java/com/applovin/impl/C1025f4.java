package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.applovin.impl.f4 */
/* loaded from: classes.dex */
public class C1025f4 extends AbstractC0995c4 {
    public C1025f4(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.AbstractC0995c4
    /* renamed from: a */
    public AdSessionContext mo466a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f569b.m2894e0().m785b(), this.f569b.m2894e0().m783a(), this.f568a.getOpenMeasurementVerificationScriptResources(), this.f568a.getOpenMeasurementContentUrl(), this.f568a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.f570c.m3212a(this.f571d, "Failed to create ad session context", th);
            return null;
        }
    }

    @Override // com.applovin.impl.AbstractC0995c4
    /* renamed from: a */
    public AdSessionConfiguration mo465a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.f570c.m3212a(this.f571d, "Failed to create ad session configuration", th);
            return null;
        }
    }
}
