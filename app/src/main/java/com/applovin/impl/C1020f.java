package com.applovin.impl;

import com.applovin.impl.C0993c2;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.f */
/* loaded from: classes.dex */
public class C1020f extends AbstractC1003d2 {
    public C1020f(C1220k c1220k) {
        super(c1220k, C0993c2.b.AD);
    }

    /* renamed from: a */
    public void m705a(C0993c2 c0993c2, AbstractC1207b abstractC1207b) {
        m706a(c0993c2, abstractC1207b, new HashMap());
    }

    /* renamed from: a */
    public void m706a(C0993c2 c0993c2, AbstractC1207b abstractC1207b, Map map) {
        m704a(c0993c2, abstractC1207b != null ? abstractC1207b.getAdZone() : null, abstractC1207b, null, map);
    }

    /* renamed from: a */
    public void m707a(C0993c2 c0993c2, C1254u c1254u, AppLovinError appLovinError) {
        m704a(c0993c2, c1254u, null, appLovinError, new HashMap());
    }

    /* renamed from: a */
    private void m704a(C0993c2 c0993c2, C1254u c1254u, AbstractC1207b abstractC1207b, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.f637a.m2866a(C1268v4.f2586H)).booleanValue() && this.f637a.m2838H0()) {
            return;
        }
        if (abstractC1207b != null) {
            map.putAll(AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207b));
        } else if (c1254u != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", c1254u.m3375e(), map);
            MaxAdFormat maxAdFormatM3374d = c1254u.m3374d();
            if (maxAdFormatM3374d != null) {
                CollectionUtils.putStringIfValid("ad_format", maxAdFormatM3374d.getLabel(), map);
            }
        }
        AppLovinAdSize appLovinAdSizeM703a = m703a(c1254u, abstractC1207b);
        if (appLovinAdSizeM703a != null) {
            CollectionUtils.putStringIfValid("ad_size", appLovinAdSizeM703a.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        m576d(c0993c2, map);
    }

    /* renamed from: a */
    private AppLovinAdSize m703a(C1254u c1254u, AbstractC1207b abstractC1207b) {
        AppLovinAdSize appLovinAdSizeM3376f = c1254u != null ? c1254u.m3376f() : null;
        if (appLovinAdSizeM3376f != null) {
            return appLovinAdSizeM3376f;
        }
        if (abstractC1207b != null) {
            return abstractC1207b.getSize();
        }
        return null;
    }
}
