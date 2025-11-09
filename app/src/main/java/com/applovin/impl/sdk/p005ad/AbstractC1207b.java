package com.applovin.impl.sdk.p005ad;

import OooO0oo.o00Oo0;
import OooOOo0.o0ooOOo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractC0995c4;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1079k8;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.C0961a8;
import com.applovin.impl.C1022f1;
import com.applovin.impl.C1026f5;
import com.applovin.impl.C1085l4;
import com.applovin.impl.C1268v4;
import com.applovin.impl.InterfaceC1135n4;
import com.applovin.impl.adview.AbstractC0970e;
import com.applovin.impl.adview.C0978m;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import io.flutter.plugins.firebase.analytics.Constants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.b */
/* loaded from: classes.dex */
public abstract class AbstractC1207b extends AppLovinAdImpl implements InterfaceC1135n4 {

    /* renamed from: d */
    private final List f1983d;

    /* renamed from: e */
    private final AtomicBoolean f1984e;

    /* renamed from: f */
    private final AtomicBoolean f1985f;

    /* renamed from: g */
    private final AtomicReference f1986g;

    /* renamed from: h */
    private final Bundle f1987h;

    /* renamed from: i */
    private String f1988i;

    /* renamed from: j */
    private long f1989j;

    /* renamed from: k */
    private int f1990k;

    /* renamed from: l */
    private String f1991l;

    /* renamed from: m */
    private d f1992m;

    /* renamed from: com.applovin.impl.sdk.ad.b$b */
    public enum b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* renamed from: com.applovin.impl.sdk.ad.b$c */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* renamed from: com.applovin.impl.sdk.ad.b$d */
    public class d {

        /* renamed from: a */
        public final int f2001a;

        /* renamed from: b */
        public final int f2002b;

        /* renamed from: c */
        public final int f2003c;

        /* renamed from: d */
        public final int f2004d;

        /* renamed from: e */
        public final int f2005e;

        public /* synthetic */ d(AbstractC1207b abstractC1207b, a aVar) {
            this();
        }

        private d() {
            this.f2001a = AppLovinSdkUtils.dpToPx(C1220k.m2824o(), AbstractC1207b.this.m2625p());
            this.f2002b = AppLovinSdkUtils.dpToPx(C1220k.m2824o(), AbstractC1207b.this.m2631r());
            this.f2003c = AppLovinSdkUtils.dpToPx(C1220k.m2824o(), AbstractC1207b.this.m2619n());
            this.f2004d = AppLovinSdkUtils.dpToPx(C1220k.m2824o(), ((Integer) ((AppLovinAdBase) AbstractC1207b.this).sdk.m2866a(C1268v4.f2797h1)).intValue());
            this.f2005e = AppLovinSdkUtils.dpToPx(C1220k.m2824o(), ((Integer) ((AppLovinAdBase) AbstractC1207b.this).sdk.m2866a(C1268v4.f2789g1)).intValue());
        }
    }

    /* renamed from: com.applovin.impl.sdk.ad.b$e */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public AbstractC1207b(JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        super(jSONObject, jSONObject2, c1220k);
        this.f1983d = CollectionUtils.synchronizedList();
        this.f1984e = new AtomicBoolean();
        this.f1985f = new AtomicBoolean();
        this.f1986g = new AtomicReference();
        this.f1987h = new Bundle();
    }

    /* renamed from: O */
    private List m2494O() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* renamed from: i */
    public /* synthetic */ List m2514i(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: k */
    public static /* synthetic */ Bundle m2516k(C1026f5 c1026f5) {
        return JsonUtils.toBundle(c1026f5.m731a("ah_parameters", (JSONObject) null));
    }

    /* renamed from: m */
    public static /* synthetic */ Map m2518m(C1026f5 c1026f5) {
        try {
            return JsonUtils.toStringMap(c1026f5.m731a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: o */
    public static /* synthetic */ String m2520o(C1026f5 c1026f5) {
        return JsonUtils.getString(c1026f5.m731a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    /* renamed from: p */
    public /* synthetic */ C0961a8 m2521p(C1026f5 c1026f5) {
        return new C0961a8(c1026f5.m731a("video_button_properties", (JSONObject) null), this.sdk);
    }

    /* renamed from: r0 */
    private String m2524r0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* renamed from: A */
    public C1022f1 m2526A() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (C1022f1) c1026f5.m726a(new o0ooOOo(4));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new C1022f1(jsonObjectFromAdObject);
        }
        return null;
    }

    /* renamed from: A0 */
    public void m2527A0() {
        this.f1990k++;
    }

    /* renamed from: B */
    public List m2528B() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 2));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: B0 */
    public boolean m2529B0() {
        return getBooleanFromAdObject("aocve", (Boolean) this.sdk.m2866a(C1268v4.f2810i6));
    }

    /* renamed from: C */
    public List m2530C() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 0));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: C0 */
    public boolean m2531C0() {
        return this.f1990k > 0;
    }

    /* renamed from: D */
    public List m2532D() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.EMPTY_LIST);
    }

    /* renamed from: D0 */
    public boolean m2533D0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.m2866a(C1268v4.f2704V5));
    }

    /* renamed from: E */
    public boolean m2534E() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    /* renamed from: E0 */
    public boolean m2535E0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.m2866a(C1268v4.f2604J1));
    }

    /* renamed from: F */
    public String m2536F() {
        return this.f1988i;
    }

    /* renamed from: F0 */
    public boolean m2537F0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    /* renamed from: G */
    public int m2538G() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    /* renamed from: G0 */
    public boolean m2539G0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    /* renamed from: H */
    public int m2540H() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    /* renamed from: H0 */
    public boolean m2541H0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    /* renamed from: I */
    public int m2542I() {
        return AbstractC1078k7.m1156a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    /* renamed from: I0 */
    public boolean m2543I0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    /* renamed from: J */
    public long m2544J() {
        return this.f1989j;
    }

    /* renamed from: J0 */
    public boolean m2545J0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    /* renamed from: K */
    public List mo1354K() {
        List listM1177a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 7));
        }
        synchronized (this.adObjectLock) {
            listM1177a = AbstractC1078k7.m1177a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, m2557T(), m2578a1(), this.sdk);
        }
        return listM1177a;
    }

    /* renamed from: K0 */
    public abstract boolean mo1355K0();

    /* renamed from: L */
    public int m2546L() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.m2866a(C1268v4.f2675S0)).intValue());
    }

    /* renamed from: L0 */
    public AtomicBoolean m2547L0() {
        return this.f1984e;
    }

    /* renamed from: M */
    public boolean m2548M() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    /* renamed from: M0 */
    public boolean m2549M0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.m2866a(C1268v4.f2708W1));
    }

    /* renamed from: N */
    public List m2550N() {
        List listM2494O = m2494O();
        if (listM2494O == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM2494O.size());
        Iterator it = listM2494O.iterator();
        while (it.hasNext()) {
            arrayList.add(m2571a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    /* renamed from: N0 */
    public boolean mo1357N0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    /* renamed from: O0 */
    public abstract boolean mo1358O0();

    /* renamed from: P */
    public List m2551P() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    /* renamed from: P0 */
    public boolean m2552P0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(AbstractC1078k7.m1251j(C1220k.m2824o()) || AbstractC1078k7.m1247h(C1220k.m2824o()) || ((Boolean) this.sdk.m2866a(C1268v4.f2850n6)).booleanValue()));
    }

    /* renamed from: Q */
    public Uri m2553Q() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: Q0 */
    public abstract void mo1359Q0();

    /* renamed from: R */
    public List m2554R() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    /* renamed from: R0 */
    public boolean m2555R0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.m2866a(C1268v4.f2902u2));
    }

    /* renamed from: S */
    public abstract String mo1360S();

    /* renamed from: S0 */
    public boolean m2556S0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.m2866a(C1268v4.f2781f1));
    }

    /* renamed from: T */
    public Map m2557T() {
        HashMap map = new HashMap();
        try {
            C1026f5 c1026f5 = this.synchronizedAdObject;
            map.putAll(c1026f5 != null ? (Map) c1026f5.m726a(new o0ooOOo(7)) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e2) {
            this.sdk.m2847O();
            if (C1240o.m3200a()) {
                this.sdk.m2847O().m3212a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", AbstractC1079k8.m1257a());
        }
        return map;
    }

    /* renamed from: T0 */
    public boolean m2558T0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    /* renamed from: U */
    public b m2559U() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return b.DO_NOT_DISMISS;
            }
        }
        return b.UNSPECIFIED;
    }

    /* renamed from: U0 */
    public boolean m2560U0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.m2866a(C1268v4.f2882r6));
    }

    /* renamed from: V */
    public int m2561V() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    /* renamed from: V0 */
    public boolean m2562V0() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        return c1026f5 != null ? ((Boolean) c1026f5.m726a(new o0ooOOo(5))).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    /* renamed from: W */
    public long m2563W() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    /* renamed from: W0 */
    public boolean m2564W0() {
        return this.f1985f.get();
    }

    /* renamed from: X */
    public List m2565X() {
        return getStringListFromAdObject("pbpn", this.sdk.m2888c(C1268v4.f2553C6));
    }

    /* renamed from: X0 */
    public boolean m2566X0() {
        return m2605h1() || m2599f1() || m2602g1();
    }

    /* renamed from: Y */
    public long m2567Y() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    /* renamed from: Y0 */
    public boolean m2568Y0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    /* renamed from: Z */
    public int m2569Z() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    /* renamed from: Z0 */
    public boolean m2570Z0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.m2866a(C1268v4.f2667R0));
    }

    /* renamed from: a0 */
    public List m2577a0() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    /* renamed from: a1 */
    public boolean m2578a1() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    /* renamed from: b0 */
    public int m2583b0() {
        return this.f1990k;
    }

    /* renamed from: b1 */
    public boolean m2584b1() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    /* renamed from: c */
    public void m2587c(String str) {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m732a(new OooO00o(str, 1));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    /* renamed from: c0 */
    public List m2588c0() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.m2888c(C1268v4.f2571F0));
        if (AbstractC1078k7.m1251j(C1220k.m2824o())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    /* renamed from: c1 */
    public boolean m2589c1() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    /* renamed from: d */
    public List m2590d(MotionEvent motionEvent, boolean z, boolean z2) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.EMPTY_LIST);
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map mapM2502a = m2502a(motionEvent, z, z2);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(StringUtils.replace(it.next(), mapM2502a));
        }
        return arrayList;
    }

    /* renamed from: d0 */
    public List m2592d0() {
        return getStringListFromAdObject("rea", m2577a0());
    }

    /* renamed from: d1 */
    public boolean m2593d1() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    /* renamed from: e */
    public List m2594e() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 1));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: e0 */
    public AbstractC0970e.a m2595e0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? m2628q() : m2571a(intFromAdObject);
    }

    /* renamed from: e1 */
    public boolean m2596e1() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    /* renamed from: f */
    public long m2597f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    /* renamed from: f0 */
    public List m2598f0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.EMPTY_LIST);
    }

    /* renamed from: f1 */
    public boolean m2599f1() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.m2888c(C1268v4.f2894t2)).contains(NotificationCompat.CATEGORY_NAVIGATION);
    }

    /* renamed from: g */
    public long m2600g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    /* renamed from: g0 */
    public c m2601g0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? c.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    /* renamed from: g1 */
    public boolean m2602g1() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.m2888c(C1268v4.f2894t2)).contains("none");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public abstract AbstractC0995c4 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        return c1026f5 != null ? (Bundle) c1026f5.m726a(new o0ooOOo(8)) : JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public List getOpenMeasurementVerificationScriptResources() {
        List listM2501a;
        OooO0O0 oooO0O0 = new OooO0O0(this, 8);
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new o00Oo0(oooO0O0, 11));
        }
        synchronized (this.adObjectLock) {
            listM2501a = m2501a(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return listM2501a;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.EMPTY_LIST);
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    /* renamed from: h */
    public Bundle m2603h() {
        return this.f1987h;
    }

    /* renamed from: h0 */
    public String m2604h0() {
        return this.f1991l;
    }

    /* renamed from: h1 */
    public boolean m2605h1() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.m2888c(C1268v4.f2894t2)).contains("status");
    }

    /* renamed from: i0 */
    public Uri m2607i0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: i1 */
    public boolean m2608i1() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public abstract boolean isOpenMeasurementEnabled();

    /* renamed from: j */
    public List m2609j() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 6));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: j0 */
    public String m2610j0() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        return c1026f5 != null ? (String) c1026f5.m726a(new o0ooOOo(9)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    /* renamed from: j1 */
    public boolean m2611j1() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    /* renamed from: k0 */
    public String m2613k0() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        return c1026f5 != null ? (String) c1026f5.m726a(new o0ooOOo(10)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    /* renamed from: k1 */
    public boolean m2614k1() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    /* renamed from: l */
    public List m2615l() {
        return this.f1983d;
    }

    /* renamed from: l0 */
    public C0961a8 m2616l0() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        return c1026f5 != null ? (C0961a8) c1026f5.m726a(new OooO0O0(this, 9)) : new C0961a8(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    /* renamed from: l1 */
    public boolean m2617l1() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    /* renamed from: m */
    public abstract Uri mo1365m();

    /* renamed from: m0 */
    public abstract Uri mo1366m0();

    /* renamed from: m1 */
    public boolean m2618m1() {
        return m2600g() >= 0;
    }

    /* renamed from: n */
    public int m2619n() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.m2866a(C1268v4.f2612K1)).intValue());
    }

    /* renamed from: n0 */
    public long m2620n0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    /* renamed from: n1 */
    public boolean m2621n1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    /* renamed from: o0 */
    public long m2623o0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    /* renamed from: o1 */
    public boolean m2624o1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    /* renamed from: p0 */
    public int m2626p0() {
        return AbstractC1078k7.m1222c(getIntFromAdObject("video_completion_percent", -1));
    }

    /* renamed from: p1 */
    public boolean m2627p1() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.m2866a(C1268v4.f2545B6));
    }

    /* renamed from: q */
    public AbstractC0970e.a m2628q() {
        List listM2494O = m2494O();
        int intFromAdObject = getIntFromAdObject("close_style", (listM2494O == null || listM2494O.size() <= 0) ? -1 : ((Integer) listM2494O.get(0)).intValue());
        return intFromAdObject == -1 ? m2495a(hasVideoUrl()) : m2571a(intFromAdObject);
    }

    /* renamed from: q0 */
    public List m2629q0() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 10));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), m2524r0(), this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: q1 */
    public boolean m2630q1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    /* renamed from: r */
    public int m2631r() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.m2866a(C1268v4.f2628M1)).intValue());
    }

    /* renamed from: s */
    public long m2632s() {
        List listM2551P = m2551P();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listM2551P == null || listM2551P.size() <= 0) ? 0L : ((Integer) listM2551P.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    /* renamed from: s0 */
    public e m2633s0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? e.TOP : "bottom".equals(stringFromAdObject) ? e.BOTTOM : "left".equals(stringFromAdObject) ? e.LEFT : "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    /* renamed from: t */
    public int m2634t() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    /* renamed from: t0 */
    public int m2635t0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    /* renamed from: u */
    public int m2636u() {
        return getIntFromAdObject("countdown_length", 0);
    }

    /* renamed from: u0 */
    public boolean m2637u0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    /* renamed from: v */
    public Bundle m2638v() {
        Map map;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            map = (Map) c1026f5.m726a(new OooO0O0(this, 12));
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e2) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3212a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", AbstractC1079k8.m1257a());
        }
        return bundle;
    }

    /* renamed from: v0 */
    public abstract Uri mo1370v0();

    /* renamed from: w */
    public List m2639w() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 4));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: w0 */
    public int m2640w0() {
        return getIntFromAdObject("whalt", AbstractC1078k7.m1202a(getSize()) ? 1 : ((Boolean) this.sdk.m2866a(C1268v4.f2648O5)).booleanValue() ? 0 : -1);
    }

    /* renamed from: x */
    public List m2641x() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 3));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: x0 */
    public C0978m m2642x0() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (C0978m) c1026f5.m726a(new o0ooOOo(6));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new C0978m(jsonObjectFromAdObject);
        }
        return null;
    }

    /* renamed from: y */
    public List m2643y() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 5));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: y0 */
    public List m2644y0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    /* renamed from: z */
    public List m2645z() {
        List listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO0O0(this, 11));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM1176a;
    }

    /* renamed from: z0 */
    public List m2646z0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    /* renamed from: f */
    public /* synthetic */ List m2511f(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: g */
    public /* synthetic */ List m2512g(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: h */
    public static /* synthetic */ C1022f1 m2513h(C1026f5 c1026f5) {
        JSONObject jSONObjectM731a = c1026f5.m731a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectM731a != null) {
            return new C1022f1(jSONObjectM731a);
        }
        return null;
    }

    /* renamed from: l */
    public /* synthetic */ List m2517l(C1026f5 c1026f5) {
        return AbstractC1078k7.m1177a(c1026f5.m731a("imp_urls", new JSONObject()), getClCode(), null, null, m2557T(), m2578a1(), this.sdk);
    }

    /* renamed from: n */
    public static /* synthetic */ String m2519n(C1026f5 c1026f5) {
        return JsonUtils.getString(c1026f5.m731a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    /* renamed from: r */
    public static /* synthetic */ C0978m m2523r(C1026f5 c1026f5) {
        JSONObject jSONObjectM731a = c1026f5.m731a("web_view_settings", (JSONObject) null);
        if (jSONObjectM731a != null) {
            return new C0978m(jSONObjectM731a);
        }
        return null;
    }

    /* renamed from: a */
    public void m2576a(String str) {
        this.f1988i = str;
    }

    /* renamed from: b */
    public void m2581b(String str) {
        this.f1991l = str;
    }

    /* renamed from: a */
    public void m2573a(long j) {
        this.f1989j = j;
    }

    /* renamed from: b */
    public void m2582b(boolean z) {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m734a("html_resources_cached", z);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z);
        }
    }

    /* renamed from: i */
    public C1085l4 m2606i() {
        return (C1085l4) this.f1986g.getAndSet(null);
    }

    /* renamed from: k */
    public String m2612k() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* renamed from: o */
    public d m2622o() {
        if (this.f1992m == null) {
            this.f1992m = new d();
        }
        return this.f1992m;
    }

    /* renamed from: p */
    public int m2625p() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.m2866a(C1268v4.f2620L1)).intValue());
    }

    /* renamed from: a */
    public /* synthetic */ List m2501a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, Constants.PARAMETERS, null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3212a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public static /* synthetic */ Boolean m2525s(C1026f5 c1026f5) {
        return JsonUtils.getBoolean(c1026f5.m731a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    /* renamed from: q */
    public /* synthetic */ List m2522q(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("video_end_urls", new JSONObject()), getClCode(), m2524r0(), this.sdk);
    }

    /* renamed from: d */
    public /* synthetic */ List m2509d(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: e */
    public /* synthetic */ List m2510e(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: j */
    public /* synthetic */ List m2515j(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: c */
    public long m2585c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    /* renamed from: b */
    public /* synthetic */ List m2506b(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: c */
    private String m2507c(MotionEvent motionEvent, boolean z, boolean z2) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapM2502a = m2502a(motionEvent, z, z2);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapM2502a);
        }
        return null;
    }

    /* renamed from: d */
    public void m2591d() {
        this.f1985f.set(true);
    }

    /* renamed from: b */
    private List m2505b(final MotionEvent motionEvent, final boolean z, final boolean z2) {
        List listM1178a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new Function() { // from class: com.applovin.impl.sdk.ad.OooO0OO
                @Override // androidx.arch.core.util.Function, OooOOO.OooO0o
                public final Object apply(Object obj) {
                    return this.f15843OooOo0O.m2498a(motionEvent, z, z2, (C1026f5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM1178a = AbstractC1078k7.m1178a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), m2502a(motionEvent, z, z2), m2507c(motionEvent, z, z2), m2557T(), m2578a1(), this.sdk);
        }
        return listM1178a;
    }

    /* renamed from: c */
    public /* synthetic */ Map m2508c(C1026f5 c1026f5) {
        try {
            return JsonUtils.toStringMap(c1026f5.m731a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e2) {
            this.sdk.m2847O();
            if (C1240o.m3200a()) {
                this.sdk.m2847O().m3212a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new HashMap();
        }
    }

    /* renamed from: c */
    public void m2586c(Uri uri) {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m740b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ List m2499a(Function function, C1026f5 c1026f5) {
        return (List) function.apply(c1026f5.m729a("omid_verification_script_resources", (JSONArray) null));
    }

    /* renamed from: a */
    public void m2574a(Uri uri) {
        this.f1983d.add(uri);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2503a(String str, C1026f5 c1026f5) {
        JsonUtils.putString(c1026f5.m731a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    /* renamed from: a */
    public /* synthetic */ List m2500a(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: b */
    public List m2579b(final MotionEvent motionEvent, final boolean z) {
        List listM1178a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            listM1178a = (List) c1026f5.m726a(new Function() { // from class: com.applovin.impl.sdk.ad.OooO0o
                @Override // androidx.arch.core.util.Function, OooOOO.OooO0o
                public final Object apply(Object obj) {
                    return this.f15847OooOo0O.m2497a(motionEvent, z, (C1026f5) obj);
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                listM1178a = AbstractC1078k7.m1178a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), m2502a(motionEvent, true, z), null, m2557T(), m2578a1(), this.sdk);
            }
        }
        return listM1178a.isEmpty() ? m2505b(motionEvent, true, z) : listM1178a;
    }

    /* renamed from: a */
    public List m2572a(MotionEvent motionEvent, boolean z) {
        return m2505b(motionEvent, false, z);
    }

    /* renamed from: a */
    public /* synthetic */ List m2498a(MotionEvent motionEvent, boolean z, boolean z2, C1026f5 c1026f5) {
        return AbstractC1078k7.m1178a(c1026f5.m731a("click_tracking_urls", new JSONObject()), m2502a(motionEvent, z, z2), m2507c(motionEvent, z, z2), m2557T(), m2578a1(), this.sdk);
    }

    /* renamed from: a */
    public /* synthetic */ List m2497a(MotionEvent motionEvent, boolean z, C1026f5 c1026f5) {
        return AbstractC1078k7.m1178a(c1026f5.m731a("video_click_tracking_urls", new JSONObject()), m2502a(motionEvent, true, z), null, m2557T(), m2578a1(), this.sdk);
    }

    /* renamed from: b */
    public void m2580b(Uri uri) {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m740b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    /* renamed from: a */
    private Map m2502a(MotionEvent motionEvent, boolean z, boolean z2) {
        Point pointM1938b = AbstractC1141o0.m1938b(C1220k.m2824o());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointM1938b.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointM1938b.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z));
        map.put("{IS_INSTALL}", String.valueOf(z2));
        return map;
    }

    /* renamed from: a */
    public void m2575a(C1085l4 c1085l4) {
        this.f1986g.set(c1085l4);
    }

    /* renamed from: a */
    private AbstractC0970e.a m2495a(boolean z) {
        return z ? AbstractC0970e.a.WHITE_ON_TRANSPARENT : AbstractC0970e.a.WHITE_ON_BLACK;
    }

    /* renamed from: a */
    public AbstractC0970e.a m2571a(int i) {
        if (i == 1) {
            return AbstractC0970e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return AbstractC0970e.a.INVISIBLE;
        }
        if (i == 3) {
            return AbstractC0970e.a.TRANSPARENT_SKIP;
        }
        return AbstractC0970e.a.WHITE_ON_BLACK;
    }
}
