package com.applovin.impl.sdk;

import OooO0oO.OooOo;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractC1042h1;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1176r1;
import com.applovin.impl.C1268v4;
import com.applovin.impl.o0000O0;
import com.applovin.impl.sdk.network.C1238d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3007ch;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", C3034d9.h.f8102e0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a */
    private final C1220k f1945a;

    /* renamed from: b */
    private final AtomicBoolean f1946b = new AtomicBoolean();

    public EventServiceImpl(C1220k c1220k) {
        this.f1945a = c1220k;
    }

    /* renamed from: a */
    private void m2455a(String str, Map map) {
        boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f1945a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f1945a, zContains, "submitTrackEventPostback", new o0000O0(this, str, map, zContains, 6)), C0987b6.b.OTHER);
    }

    /* renamed from: b */
    public /* synthetic */ void m2458b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        C1238d.b bVarM3175d = C1238d.m3134b().m3174d(m2457b()).m3164a(m2450a()).m3165a(map3).m3172c(m2453a(str, map, map2)).m3166a(((Boolean) this.f1945a.m2866a(C1268v4.f2743a5)).booleanValue()).m3163a(AbstractC1188s4.a.m2392a(((Integer) this.f1945a.m2866a(C1268v4.f2833l5)).intValue())).m3175d(false);
        if (this.f1945a.m2922t0().m493c()) {
            bVarM3175d.m3169b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f1945a.m2896f0().m3131e(bVarM3175d.m3167a());
    }

    /* renamed from: c */
    private void m2460c(String str, Map map, Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                m2454a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    m2454a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        this.f1945a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f1945a, false, OooOo.OooOO0("track_event:", str), new OooOo0O.OooO0O0(this, str, map, map2, 10)), C0987b6.b.OTHER);
    }

    /* renamed from: d */
    private String m2461d() {
        return OooOo.OooOOOo(new StringBuilder(), (String) this.f1945a.m2866a(C1268v4.f2884s0), "4.0/pix");
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f1946b.compareAndSet(false, true)) {
            this.f1945a.m2836G().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f1945a.m2847O();
        if (C1240o.m3200a()) {
            this.f1945a.m2847O().m3211a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        C1176r1 c1176r1 = new C1176r1(str, new HashMap());
        boolean zContains = this.f1945a.m2888c(C1268v4.f2940z0).contains(c1176r1.m2307c());
        Map mapM2452a = m2452a(c1176r1, true, zContains);
        HashMap map = new HashMap(c1176r1.m2308d());
        if (((Boolean) this.f1945a.m2866a(C1268v4.f2897t5)).booleanValue() || ((Boolean) this.f1945a.m2866a(C1268v4.f2857o5)).booleanValue()) {
            map.putAll(mapM2452a);
            mapM2452a = null;
        }
        this.f1945a.m2896f0().m3131e(C1238d.m3134b().m3174d(m2461d()).m3164a(m2459c()).m3169b(mapM2452a).m3172c(map).m3165a(m2451a(c1176r1, zContains)).m3173c(((Boolean) this.f1945a.m2866a(C1268v4.f2560D5)).booleanValue()).m3166a(((Boolean) this.f1945a.m2866a(C1268v4.f2743a5)).booleanValue()).m3167a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f1945a.m2832E().m2148a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    /* renamed from: a */
    public /* synthetic */ void m2456a(String str, Map map, boolean z) {
        C1176r1 c1176r1 = new C1176r1(str, map);
        boolean zContains = this.f1945a.m2888c(C1268v4.f2940z0).contains(c1176r1.m2307c());
        Map mapM2452a = m2452a(c1176r1, false, zContains);
        HashMap map2 = new HashMap(c1176r1.m2308d());
        if (((Boolean) this.f1945a.m2866a(C1268v4.f2897t5)).booleanValue() || ((Boolean) this.f1945a.m2866a(C1268v4.f2857o5)).booleanValue()) {
            map2.putAll(mapM2452a);
            mapM2452a = null;
        }
        this.f1945a.m2896f0().m3131e(C1238d.m3134b().m3174d(m2461d()).m3164a(m2459c()).m3165a(m2451a(c1176r1, zContains)).m3169b(mapM2452a).m3172c(map2).m3173c(((Boolean) this.f1945a.m2866a(C1268v4.f2560D5)).booleanValue()).m3166a(((Boolean) this.f1945a.m2866a(C1268v4.f2743a5)).booleanValue()).m3175d(z).m3163a(AbstractC1188s4.a.m2392a(((Integer) this.f1945a.m2866a(C1268v4.f2825k5)).intValue())).m3167a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            m2454a("Unable to track empty event");
        } else if (this.f1945a.m2888c(C1268v4.f2531A0).contains(str)) {
            m2460c(str, map, map2);
        } else {
            m2455a(str, map);
        }
    }

    /* renamed from: b */
    private String m2457b() {
        return OooOo.OooOOOo(new StringBuilder(), (String) this.f1945a.m2866a(C1268v4.f2900u0), "v1/app");
    }

    /* renamed from: c */
    private String m2459c() {
        return OooOo.OooOOOo(new StringBuilder(), (String) this.f1945a.m2866a(C1268v4.f2892t0), "4.0/pix");
    }

    /* renamed from: a */
    private void m2454a(String str) {
        C1240o.m3207h("AppLovinEventService", str);
        if (AbstractC1078k7.m1228c(this.f1945a)) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    private Map m2452a(C1176r1 c1176r1, boolean z, boolean z2) {
        Map mapM2993a = this.f1945a.m2827B().m2993a((Map) null, z, false);
        mapM2993a.put("event_id", c1176r1.m2306b());
        mapM2993a.put("ts", Long.toString(c1176r1.m2305a()));
        if (z2) {
            mapM2993a.put(NotificationCompat.CATEGORY_EVENT, c1176r1.m2307c());
        } else {
            mapM2993a.put(NotificationCompat.CATEGORY_EVENT, "postinstall");
            mapM2993a.put("sub_event", c1176r1.m2307c());
        }
        return AbstractC1078k7.m1180a(mapM2993a);
    }

    /* renamed from: a */
    private Map m2451a(C1176r1 c1176r1, boolean z) {
        HashMap map = new HashMap();
        if (z) {
            map.put("AppLovin-Event", c1176r1.m2307c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", c1176r1.m2307c());
        return map;
    }

    /* renamed from: a */
    private Map m2453a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        C1176r1 c1176r1 = new C1176r1(str, map);
        map3.put(C3007ch.f7763x, c1176r1.m2306b());
        map3.put("name", c1176r1.m2307c());
        map3.put("data", c1176r1.m2308d());
        map3.put("timestamp", AbstractC1042h1.m848a(c1176r1.m2305a()));
        Map mapM2984E = this.f1945a.m2827B().m2984E();
        map3.put("app_info", mapM2984E);
        map3.put("device_info", this.f1945a.m2827B().m2999o());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f1945a.m2917r());
        CollectionUtils.putStringIfValid("eventId", this.f1945a.m2834F(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1945a.m2904j0());
        map4.put(C3451ne.f10417G, this.f1945a.m2827B().m3000y());
        if (((Boolean) this.f1945a.m2866a(C1268v4.f2582G3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f1945a.m2919s(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapM2984E.get("ia_v2"));
        map5.put("lastVisitTs", mapM2984E.get("last_launch_ms"));
        map5.put("visitCount", mapM2984E.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapM2984E.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    /* renamed from: a */
    private String m2450a() {
        return OooOo.OooOOOo(new StringBuilder(), (String) this.f1945a.m2866a(C1268v4.f2908v0), "v1/app");
    }
}
