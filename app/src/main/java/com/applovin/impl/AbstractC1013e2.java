package com.applovin.impl;

import android.net.Uri;
import android.text.format.Formatter;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.e2 */
/* loaded from: classes.dex */
public abstract class AbstractC1013e2 {
    /* renamed from: a */
    public static Map m675a(AppLovinAdImpl appLovinAdImpl) {
        HashMap map = new HashMap(10);
        if (appLovinAdImpl != null) {
            CollectionUtils.putStringIfValid("ad_domain", appLovinAdImpl.getAdDomain(), map);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinAdImpl.getAdIdNumber()), map);
            MaxAdFormat maxAdFormatM3374d = appLovinAdImpl.getAdZone().m3374d();
            CollectionUtils.putStringIfValid("ad_format", maxAdFormatM3374d != null ? maxAdFormatM3374d.getLabel() : null, map);
            CollectionUtils.putStringIfValid("ad_zone_id", appLovinAdImpl.getAdZone().m3375e(), map);
            CollectionUtils.putStringIfValid("clcode", appLovinAdImpl.getClCode(), map);
            CollectionUtils.putStringIfValid("dsp_id", appLovinAdImpl.getDspId(), map);
            CollectionUtils.putStringIfValid("dsp_name", appLovinAdImpl.getDspName(), map);
            CollectionUtils.putStringIfValid("ad_size", appLovinAdImpl.getSize().getLabel(), map);
            CollectionUtils.putStringIfValid("ad_event_id", appLovinAdImpl.getMediationServeId(), map);
            CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinAdImpl.isOpenMeasurementEnabled()), map);
            if (appLovinAdImpl instanceof AbstractC1207b) {
                CollectionUtils.putStringIfValid("is_persisted_ad", String.valueOf(((AbstractC1207b) appLovinAdImpl).mo1355K0()), map);
            }
        }
        return map;
    }

    /* renamed from: b */
    public static String m680b(AbstractC1207b abstractC1207b) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "reshow_count", abstractC1207b.m2583b0());
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static Map m676a(AbstractC1207b abstractC1207b) {
        HashMap map = new HashMap();
        if (abstractC1207b != null) {
            C1220k sdk = abstractC1207b.getSdk();
            if (((Boolean) sdk.m2866a(C1268v4.f2602J)).booleanValue()) {
                HashMap map2 = new HashMap();
                Iterator it = abstractC1207b.m2615l().iterator();
                while (it.hasNext()) {
                    String path = ((Uri) it.next()).getPath();
                    map2.put(path, Formatter.formatFileSize(C1220k.m2824o(), new File(path).length()));
                }
                map.put("path", map2.toString());
            }
            if ((abstractC1207b instanceof C1206a) && ((Boolean) sdk.m2866a(C1268v4.f2610K)).booleanValue()) {
                map.put("details", ((C1206a) abstractC1207b).m2488s1());
            }
        }
        return map;
    }

    /* renamed from: a */
    public static Map m677a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        HashMap map = new HashMap(7);
        if (appLovinNativeAdImpl == null) {
            return map;
        }
        CollectionUtils.putStringIfValid("ad_domain", appLovinNativeAdImpl.getAdDomain(), map);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinNativeAdImpl.getAdIdNumber()), map);
        CollectionUtils.putStringIfValid("clcode", appLovinNativeAdImpl.getClCode(), map);
        CollectionUtils.putStringIfValid("dsp_id", appLovinNativeAdImpl.getDspId(), map);
        CollectionUtils.putStringIfValid("dsp_name", appLovinNativeAdImpl.getDspName(), map);
        CollectionUtils.putStringIfValid("ad_size", AppLovinAdSize.NATIVE.toString(), map);
        CollectionUtils.putStringIfValid("ad_event_id", appLovinNativeAdImpl.getMediationServeId(), map);
        CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinNativeAdImpl.isOpenMeasurementEnabled()), map);
        return map;
    }

    /* renamed from: a */
    public static Map m678a(AbstractC1266v2 abstractC1266v2) {
        Map mapM674a = m674a((C1044h3) abstractC1266v2);
        CollectionUtils.putStringIfValid("bcode", abstractC1266v2.m3506C(), mapM674a);
        CollectionUtils.putStringIfValid("creative_id", abstractC1266v2.getCreativeId(), mapM674a);
        CollectionUtils.putStringIfValid("ad_unit_id", abstractC1266v2.getAdUnitId(), mapM674a);
        CollectionUtils.putStringIfValid("ad_event_id", abstractC1266v2.m3518P(), mapM674a);
        CollectionUtils.putStringIfValid("ad_format", abstractC1266v2.getFormat().getLabel(), mapM674a);
        CollectionUtils.putStringIfValid("dsp_id", abstractC1266v2.getDspId(), mapM674a);
        CollectionUtils.putStringIfValid("dsp_name", abstractC1266v2.getDspName(), mapM674a);
        return mapM674a;
    }

    /* renamed from: a */
    public static Map m674a(C1044h3 c1044h3) {
        HashMap map = new HashMap(3);
        CollectionUtils.putStringIfValid("network_name", c1044h3.m899c(), map);
        String strM895b = c1044h3.m895b();
        CollectionUtils.putStringIfValid("adapter_class", strM895b, map);
        CollectionUtils.putStringIfValid("adapter_version", AbstractC1249t3.m3314a(strM895b).getAdapterVersion(), map);
        return map;
    }

    /* renamed from: a */
    public static Map m679a(MaxError maxError) {
        HashMap map = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), map);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), map);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), map);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), map);
        return map;
    }

    /* renamed from: a */
    public static String m673a(String str) {
        return StringUtils.prefixToIndex(1000, str);
    }
}
