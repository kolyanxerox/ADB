package com.applovin.impl;

import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.q1 */
/* loaded from: classes.dex */
public class C1167q1 extends AbstractC1003d2 {

    /* renamed from: i */
    private JSONObject f1789i;

    public C1167q1(C1220k c1220k) {
        super(c1220k, C0993c2.b.ERROR);
    }

    /* renamed from: a */
    public void m2152a(String str, Throwable th) {
        m2153a(str, th, new HashMap());
    }

    /* renamed from: b */
    public void m2154b() {
        this.f1789i = JsonUtils.deserialize((String) this.f637a.m2866a(C1268v4.f2594I));
    }

    /* renamed from: c */
    public void m2148a(String str, String str2, Throwable th) {
        m2151a(str, str2, th, new HashMap());
    }

    /* renamed from: a */
    public void m2151a(String str, String str2, Throwable th, Map map) {
        m2153a(OooO0oO.OooOo.OooOoo(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2), th, map);
    }

    /* renamed from: b */
    public void m2155b(String str, String str2, Throwable th) {
        this.f637a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f637a, "reportCaughtException", new OooOo0O.OooO0O0(this, str, str2, th, 8)), C0987b6.b.OTHER);
    }

    /* renamed from: a */
    public void m2153a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        m574a(C0993c2.f466A0, arrayList, 0L);
    }

    /* renamed from: a */
    public void m2150a(String str, String str2, AbstractC1207b abstractC1207b) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (abstractC1207b != null) {
            map.putAll(AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207b));
            map.putAll(AbstractC1013e2.m676a(abstractC1207b));
            boolean zMo1358O0 = abstractC1207b.mo1358O0();
            map.put("is_video_stream", String.valueOf(zMo1358O0));
            if (zMo1358O0 && (abstractC1207b instanceof C1206a)) {
                CollectionUtils.putStringIfValid("video_url", ((C1206a) abstractC1207b).m2490u1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", abstractC1207b.mo1360S(), map);
            }
        }
        m576d(C0993c2.f476F0, map);
    }

    /* renamed from: a */
    public void m2149a(String str, String str2, int i, String str3) {
        List listM2147a = m2147a(str2);
        boolean z = listM2147a != null;
        if (z && listM2147a.contains(Integer.valueOf(i))) {
            return;
        }
        if (z || i >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put("url", StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i));
            map.put("error_message", AbstractC1013e2.m673a(str3));
            m576d(C0993c2.f482I0, map);
        }
    }

    /* renamed from: a */
    private List m2147a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f1789i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f1789i, "default", null) : integerList;
    }
}
