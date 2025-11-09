package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import org.apache.tika.metadata.MachineMetadata;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* renamed from: com.applovin.impl.s2 */
/* loaded from: classes.dex */
public class C1186s2 {

    /* renamed from: a */
    private final StringBuilder f1875a = new StringBuilder();

    /* renamed from: a */
    public C1186s2 m2368a(String str, Object obj) {
        return m2369a(str, obj, "");
    }

    /* renamed from: b */
    public C1186s2 m2371b(String str) {
        this.f1875a.append(str);
        return this;
    }

    public String toString() {
        return this.f1875a.toString();
    }

    /* renamed from: a */
    public C1186s2 m2369a(String str, Object obj, String str2) {
        StringBuilder sb = this.f1875a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    /* renamed from: b */
    public C1186s2 m2370b(AbstractC1207b abstractC1207b) {
        m2368a("Target", abstractC1207b.m2601g0()).m2368a("close_style", abstractC1207b.m2628q()).m2369a("close_delay_graphic", Long.valueOf(abstractC1207b.m2632s()), "s");
        if (abstractC1207b instanceof C1206a) {
            C1206a c1206a = (C1206a) abstractC1207b;
            m2368a("HTML", c1206a.m2488s1().substring(0, Math.min(c1206a.m2488s1().length(), 64)));
        }
        if (abstractC1207b.hasVideoUrl()) {
            m2369a("close_delay", Long.valueOf(abstractC1207b.m2620n0()), "s").m2368a("skip_style", abstractC1207b.m2595e0()).m2368a("Streaming", Boolean.valueOf(abstractC1207b.mo1358O0())).m2368a("Video Location", abstractC1207b.mo1360S()).m2368a("video_button_properties", abstractC1207b.m2616l0());
        }
        return this;
    }

    /* renamed from: a */
    public C1186s2 m2367a(String str) {
        StringBuilder sb = this.f1875a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    /* renamed from: a */
    public C1186s2 m2361a() {
        this.f1875a.append("\n========================================");
        return this;
    }

    /* renamed from: a */
    public C1186s2 m2364a(AbstractC1207b abstractC1207b) {
        boolean z = abstractC1207b instanceof C1088l7;
        m2368a("Format", abstractC1207b.getAdZone().m3374d() != null ? abstractC1207b.getAdZone().m3374d().getLabel() : null).m2368a("Ad ID", Long.valueOf(abstractC1207b.getAdIdNumber())).m2368a("Zone ID", abstractC1207b.getAdZone().m3375e()).m2368a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = abstractC1207b.getDspName();
        if (StringUtils.isValidString(dspName)) {
            m2368a("DSP Name", dspName);
        }
        if (z) {
            m2368a("VAST DSP", ((C1088l7) abstractC1207b).m1374z1());
        }
        return this;
    }

    /* renamed from: a */
    public C1186s2 m2366a(AbstractC1266v2 abstractC1266v2) {
        C1186s2 c1186s2M2368a = m2368a(AndroidInitializeBoldSDK.MSG_NETWORK, abstractC1266v2.m899c()).m2368a("Adapter Version", abstractC1266v2.m3544z()).m2368a("Format", abstractC1266v2.getFormat().getLabel()).m2368a("Ad Unit ID", abstractC1266v2.getAdUnitId()).m2368a("Placement", abstractC1266v2.getPlacement()).m2368a("Network Placement", abstractC1266v2.m3519Q()).m2368a("Serve ID", abstractC1266v2.m3518P());
        boolean zIsValidString = StringUtils.isValidString(abstractC1266v2.getCreativeId());
        String dspId = OfficeOpenXMLExtended.SECURITY_NONE;
        C1186s2 c1186s2M2368a2 = c1186s2M2368a.m2368a("Creative ID", zIsValidString ? abstractC1266v2.getCreativeId() : OfficeOpenXMLExtended.SECURITY_NONE).m2368a("Ad Domain", StringUtils.isValidString(abstractC1266v2.m3540v()) ? abstractC1266v2.m3540v() : OfficeOpenXMLExtended.SECURITY_NONE).m2368a("DSP Name", StringUtils.isValidString(abstractC1266v2.getDspName()) ? abstractC1266v2.getDspName() : OfficeOpenXMLExtended.SECURITY_NONE);
        if (StringUtils.isValidString(abstractC1266v2.getDspId())) {
            dspId = abstractC1266v2.getDspId();
        }
        return c1186s2M2368a2.m2368a("DSP ID", dspId).m2368a("Server Parameters", abstractC1266v2.m915l());
    }

    /* renamed from: a */
    public C1186s2 m2363a(AppLovinAdView appLovinAdView) {
        return m2368a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).m2368a(MachineMetadata.MACHINE_ALPHA, Float.valueOf(appLovinAdView.getAlpha())).m2368a("Visibility", AbstractC0989b8.m424a(appLovinAdView.getVisibility()));
    }

    /* renamed from: a */
    public C1186s2 m2365a(C1220k c1220k) {
        return m2368a("Muted", Boolean.valueOf(c1220k.m2912o0().isMuted()));
    }

    /* renamed from: a */
    public C1186s2 m2362a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                m2368a(str, bundle.get(str));
            }
        }
        return this;
    }
}
