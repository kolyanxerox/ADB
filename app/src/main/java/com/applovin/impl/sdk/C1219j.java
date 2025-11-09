package com.applovin.impl.sdk;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC1018e7;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1249t3;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1060j;
import com.applovin.impl.C1131n0;
import com.applovin.impl.C1268v4;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.network.C1238d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3007ch;
import com.ironsource.C3034d9;
import com.ironsource.C3571qt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.j */
/* loaded from: classes.dex */
public class C1219j implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a */
    private final C1220k f2087a;

    /* renamed from: b */
    private final AppLovinCommunicator f2088b;

    public C1219j(C1220k c1220k) {
        this.f2087a = c1220k;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(C1220k.m2824o());
        this.f2088b = appLovinCommunicator;
        if (((Boolean) c1220k.m2866a(C1268v4.f2753b7)).booleanValue()) {
            appLovinCommunicator.m62a(c1220k);
            appLovinCommunicator.subscribe(this, AbstractC1018e7.f728a);
        }
    }

    /* renamed from: a */
    public void m2776a(JSONObject jSONObject, boolean z) {
        if (m2767b("safedk_init") && C1060j.m1026c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f2087a.m2904j0());
            bundle.putString("applovin_random_token", this.f2087a.m2902i0());
            bundle.putString("compass_random_token", this.f2087a.m2925v());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(C1220k.m2824o()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(AbstractC1249t3.m3325b(this.f2087a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f2087a.m2930x0().m1108e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f2087a.m2866a(C1268v4.f2762c7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f2087a.m2847O();
            if (C1240o.m3200a()) {
                this.f2087a.m2847O().m3211a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            m2769a(bundle2, "safedk_init");
        }
    }

    /* renamed from: b */
    public void m2780b(String str, String str2) {
        if (m2767b("user_info") && C1060j.m1026c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            m2769a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j;
        int i;
        long j2;
        Map<String, Object> map2;
        if (((Boolean) this.f2087a.m2866a(C1268v4.f2753b7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString(C3007ch.f7763x, "");
                if (!map3.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map3.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f2087a.m2904j0());
                }
                this.f2087a.m2896f0().m3131e(new C1238d.b().m3174d(messageData.getString("url")).m3164a(messageData.getString("backup_url")).m3169b(stringMap).m3172c(map3).m3165a(stringMap2).m3166a(((Boolean) this.f2087a.m2866a(C1268v4.f2743a5)).booleanValue()).m3168b(string).m3167a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f2087a.m2905k().addCustomQueryParams(AbstractC1078k7.m1180a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f2087a.m2905k().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f2087a.m2860X().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f2087a.m2866a(C1268v4.f2799h3)).longValue();
            int i2 = messageData2.getInt("retry_count", ((Integer) this.f2087a.m2866a(C1268v4.f2807i3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f2087a.m2866a(C1268v4.f2815j3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f2087a.m2827B().m2993a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                j = millis;
                i = i2;
                j2 = millis2;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapM2984E = this.f2087a.m2827B().m2984E();
                    Map mapM2999o = this.f2087a.m2827B().m2999o();
                    j2 = millis2;
                    if (mapM2999o.containsKey("idfv") && mapM2999o.containsKey("idfv_scope")) {
                        i = i2;
                        String str = (String) mapM2999o.get("idfv");
                        j = millis;
                        Integer num = (Integer) mapM2999o.get("idfv_scope");
                        num.getClass();
                        mapM2999o.remove("idfv");
                        mapM2999o.remove("idfv_scope");
                        mapM2984E.put("idfv", str);
                        mapM2984E.put("idfv_scope", num);
                    } else {
                        j = millis;
                        i = i2;
                    }
                    mapM2984E.put("server_installed_at", this.f2087a.m2866a(C1268v4.f2851o));
                    mapM2984E.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f2087a.m2904j0());
                    map.put("app", mapM2984E);
                    map.put(C3034d9.h.f8068G, mapM2999o);
                } else {
                    j = millis;
                    i = i2;
                    j2 = millis2;
                }
            }
            this.f2087a.m2918r0().m403a((AbstractRunnableC1036g5) new C1131n0(appLovinCommunicatorMessage.getPublisherId(), C1235a.m3072a(this.f2087a).mo3103b(messageData2.getString("url")).mo3097a(messageData2.getString("backup_url")).mo3104b(stringMap3).mo3107c(string2).mo3098a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).mo3099a(map != null ? new JSONObject(map) : null).mo3106c((int) j).mo3094a(i).mo3102b((int) j2).mo3096a((Object) new JSONObject()).mo3100a(messageData2.getBoolean("is_encoding_enabled", false)).mo3101a(), this.f2087a), C0987b6.b.OTHER);
        }
    }

    /* renamed from: b */
    public void m2779b(AbstractC1266v2 abstractC1266v2, String str) {
        if (m2767b("max_ad_events")) {
            Bundle bundleM2766a = m2766a(abstractC1266v2);
            bundleM2766a.putString("type", str);
            this.f2087a.m2847O();
            if (C1240o.m3200a()) {
                this.f2087a.m2847O().m3211a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleM2766a);
            }
            m2769a(bundleM2766a, "max_ad_events");
        }
    }

    /* renamed from: b */
    public void m2778b(AbstractC1266v2 abstractC1266v2) {
        if (m2767b("max_revenue_events")) {
            Bundle bundleM2766a = m2766a(abstractC1266v2);
            bundleM2766a.putAll(JsonUtils.toBundle(abstractC1266v2.m3517O()));
            bundleM2766a.putString("country_code", this.f2087a.m2927w().getCountryCode());
            m2769a(bundleM2766a, "max_revenue_events");
        }
    }

    /* renamed from: b */
    public void m2781b(List list) {
        if (m2767b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                m2769a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            m2769a(bundle, "test_mode_networks_updated");
        }
    }

    /* renamed from: a */
    public void m2770a(AbstractC1266v2 abstractC1266v2, String str) {
        if (m2767b("ad_callback_blocked_after_hidden")) {
            Bundle bundleM2766a = m2766a(abstractC1266v2);
            bundleM2766a.putString("callback_name", str);
            m2769a(bundleM2766a, "ad_callback_blocked_after_hidden");
        }
    }

    /* renamed from: b */
    private boolean m2767b(String str) {
        if (((Boolean) this.f2087a.m2866a(C1268v4.f2753b7)).booleanValue()) {
            return this.f2087a.m2888c(C1268v4.f2745a7).contains(str) || this.f2088b.hasSubscriber(str);
        }
        return false;
    }

    /* renamed from: a */
    public void m2771a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (m2767b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            m2769a(bundle, "adapter_initialization_status");
        }
    }

    /* renamed from: a */
    public void m2768a() {
        if (m2767b("privacy_setting_updated")) {
            m2769a(new Bundle(), "privacy_setting_updated");
        }
    }

    /* renamed from: a */
    public void m2772a(String str, String str2) {
        if (m2767b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            m2769a(bundle, "network_sdk_version_updated");
        }
    }

    /* renamed from: a */
    public void m2775a(List list) {
        if (m2767b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                m2769a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            m2769a(bundle, "live_networks_updated");
        }
    }

    /* renamed from: a */
    public void m2774a(String str, String str2, String str3) {
        if (m2767b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString(C3571qt.f11099n, strMaybeConvertToIndentedString2);
            m2769a(bundle, "responses");
        }
    }

    /* renamed from: a */
    public void m2773a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (m2767b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString(C3007ch.f7763x, str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle(C3034d9.h.f8065E0, JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            m2769a(bundle, "receive_http_response");
        }
    }

    /* renamed from: a */
    public void m2769a(Bundle bundle, String str) {
        if (m2767b(str)) {
            this.f2088b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f2087a.m2888c(C1268v4.f2745a7).contains(str)));
        }
    }

    /* renamed from: a */
    public boolean m2777a(String str) {
        return AbstractC1018e7.f728a.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle m2766a(com.applovin.impl.AbstractC1266v2 r5) {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r5.m3518P()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.m899c()
            java.lang.String r2 = "network_name"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.getAdUnitId()
            java.lang.String r2 = "max_ad_unit_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.m3519Q()
            java.lang.String r2 = "third_party_ad_placement_id"
            r0.putString(r2, r1)
            com.applovin.mediation.MaxAdFormat r1 = r5.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.getCreativeId()
            java.lang.String r2 = "creative_id"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.m3540v()
            java.lang.String r2 = "adomain"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.getDspName()
            java.lang.String r2 = "dsp_name"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.m899c()
            java.lang.String r2 = "CUSTOM_NETWORK_SDK"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L66
            java.lang.String r1 = r5.getNetworkName()
            java.lang.String r2 = "custom_sdk_network_name"
            r0.putString(r2, r1)
        L66:
            org.json.JSONObject r1 = r5.m3542x()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle(r1)
            r0.putAll(r1)
            boolean r1 = r5 instanceof com.applovin.impl.AbstractC1014e3
            java.lang.String r2 = "ad_view"
            java.lang.String r3 = "N/A"
            if (r1 == 0) goto Lab
            boolean r1 = r5 instanceof com.applovin.impl.C1293y2
            if (r1 == 0) goto L84
            com.applovin.impl.y2 r5 = (com.applovin.impl.C1293y2) r5
            android.view.View r5 = r5.m3543y()
            goto La1
        L84:
            boolean r1 = r5 instanceof com.applovin.impl.C0956a3
            if (r1 == 0) goto La0
            com.applovin.impl.a3 r5 = (com.applovin.impl.C0956a3) r5
            boolean r1 = r5.m106r0()
            if (r1 != 0) goto La0
            com.applovin.mediation.nativeAds.MaxNativeAdView r1 = r5.m101m0()
            if (r1 == 0) goto L9b
            com.applovin.mediation.nativeAds.MaxNativeAdView r5 = r5.m101m0()
            goto La1
        L9b:
            android.view.ViewGroup r5 = r5.m102n0()
            goto La1
        La0:
            r5 = 0
        La1:
            if (r5 == 0) goto La7
            java.lang.String r3 = com.applovin.impl.AbstractC0989b8.m425a(r5)
        La7:
            r0.putString(r2, r3)
            return r0
        Lab:
            boolean r1 = r5 instanceof com.applovin.impl.C1302z2
            if (r1 == 0) goto Lcf
            com.applovin.impl.z2 r5 = (com.applovin.impl.C1302z2) r5
            android.os.Bundle r5 = r5.m3854k0()
            java.lang.String r1 = "applovin_ad_view_info"
            android.os.Bundle r5 = r5.getBundle(r1)
            java.lang.String r1 = "ad_view_address"
            java.lang.String r1 = com.applovin.impl.sdk.utils.BundleUtils.getString(r1, r3, r5)
            r0.putString(r2, r1)
            java.lang.String r1 = "video_view_address"
            java.lang.String r5 = com.applovin.impl.sdk.utils.BundleUtils.getString(r1, r3, r5)
            java.lang.String r1 = "video_view"
            r0.putString(r1, r5)
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1219j.m2766a(com.applovin.impl.v2):android.os.Bundle");
    }
}
