package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.x */
/* loaded from: classes.dex */
public class C1281x {

    /* renamed from: a */
    private final String f3014a;

    /* renamed from: b */
    private final DTBAdSize f3015b;

    /* renamed from: com.applovin.impl.x$a */
    public enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C1281x(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f3014a = str;
        this.f3015b = m3633a(JsonUtils.getInt(jSONObject, "type", m3634a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    /* renamed from: a */
    public DTBAdSize m3635a() {
        return this.f3015b;
    }

    /* renamed from: a */
    private a m3634a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    /* renamed from: a */
    private DTBAdSize m3633a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
