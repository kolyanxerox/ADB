package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.mediation.C1129h;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.v2 */
/* loaded from: classes.dex */
public abstract class AbstractC1266v2 extends C1044h3 implements MaxAd {

    /* renamed from: k */
    private final AtomicBoolean f2519k;

    /* renamed from: l */
    private final AtomicBoolean f2520l;

    /* renamed from: m */
    private final C1284x2 f2521m;

    /* renamed from: n */
    protected C1129h f2522n;

    /* renamed from: o */
    private final String f2523o;

    /* renamed from: p */
    private MaxAdWaterfallInfo f2524p;

    /* renamed from: q */
    private long f2525q;

    /* renamed from: r */
    private String f2526r;

    /* renamed from: s */
    private String f2527s;

    /* renamed from: t */
    private Bundle f2528t;

    public AbstractC1266v2(C1284x2 c1284x2, JSONObject jSONObject, JSONObject jSONObject2, C1129h c1129h, C1220k c1220k) {
        super(c1284x2.m3645e(), jSONObject, jSONObject2, c1220k);
        this.f2519k = new AtomicBoolean();
        this.f2520l = new AtomicBoolean();
        this.f2521m = c1284x2;
        this.f2522n = c1129h;
        this.f2523o = c1129h != null ? c1129h.m1831b() : null;
    }

    /* renamed from: I */
    private long m3496I() {
        return m884a("load_started_time_ms", 0L);
    }

    /* renamed from: a */
    public static AbstractC1266v2 m3497a(C1284x2 c1284x2, JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new C1293y2(c1284x2, jSONObject, jSONObject2, c1220k);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new C0956a3(c1284x2, jSONObject, jSONObject2, c1220k);
        }
        if (fromString.isFullscreenAd()) {
            return new C1302z2(c1284x2, jSONObject, jSONObject2, c1220k);
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("Unsupported ad format: ", string));
    }

    /* renamed from: b */
    public static /* synthetic */ JSONObject m3498b(C1026f5 c1026f5) {
        return JsonUtils.deepCopy(c1026f5.m731a("ad_values", new JSONObject()));
    }

    /* renamed from: c */
    public /* synthetic */ Bundle m3499c(C1026f5 c1026f5) {
        JSONObject jSONObjectM731a;
        if (c1026f5.m735a("credentials")) {
            jSONObjectM731a = c1026f5.m731a("credentials", new JSONObject());
        } else {
            jSONObjectM731a = c1026f5.m731a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectM731a, "placement_id", m3519Q());
        }
        return JsonUtils.toBundle(jSONObjectM731a);
    }

    /* renamed from: d */
    public static /* synthetic */ JSONObject m3500d(C1026f5 c1026f5) {
        return JsonUtils.deepCopy(c1026f5.m731a("publisher_extra_info", new JSONObject()));
    }

    /* renamed from: e */
    public static /* synthetic */ Double m3501e(C1026f5 c1026f5) {
        return Double.valueOf(JsonUtils.getDouble(c1026f5.m731a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* renamed from: f */
    public static /* synthetic */ JSONObject m3502f(C1026f5 c1026f5) {
        return JsonUtils.deepCopy(c1026f5.m731a("revenue_parameters", new JSONObject()));
    }

    /* renamed from: g */
    public static /* synthetic */ String m3503g(C1026f5 c1026f5) {
        return JsonUtils.getString(c1026f5.m731a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    /* renamed from: A */
    public C1129h m3504A() {
        return this.f2522n;
    }

    /* renamed from: B */
    public Bundle m3505B() {
        return this.f2528t;
    }

    /* renamed from: C */
    public String m3506C() {
        return m887a("bcode", "");
    }

    /* renamed from: D */
    public long m3507D() {
        return m884a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, m915l()));
    }

    /* renamed from: E */
    public String m3508E() {
        return m887a("bid_response", (String) null);
    }

    /* renamed from: F */
    public Bundle m3509F() {
        JSONObject jSONObjectM890a;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return (Bundle) c1026f5.m726a(new o000000(this, 6));
        }
        if (m903c("credentials")) {
            jSONObjectM890a = m890a("credentials", new JSONObject());
        } else {
            jSONObjectM890a = m890a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectM890a, "placement_id", m3519Q());
        }
        return JsonUtils.toBundle(jSONObjectM890a);
    }

    /* renamed from: G */
    public long m3510G() {
        if (m3496I() > 0) {
            return m3511H() - m3496I();
        }
        return -1L;
    }

    /* renamed from: H */
    public long m3511H() {
        return m884a("load_completed_time_ms", 0L);
    }

    /* renamed from: J */
    public String m3512J() {
        return this.f2526r;
    }

    /* renamed from: K */
    public int m3513K() {
        return m883a("mspc", ((Integer) this.f837a.m2866a(AbstractC1144o3.f1626W7)).intValue());
    }

    /* renamed from: L */
    public JSONObject m3514L() {
        C1026f5 c1026f5 = this.f844h;
        return c1026f5 != null ? (JSONObject) c1026f5.m726a(new OooOOo0.o0ooOOo(16)) : m890a("publisher_extra_info", new JSONObject());
    }

    /* renamed from: M */
    public C1284x2 m3515M() {
        return this.f2521m;
    }

    /* renamed from: N */
    public String m3516N() {
        return JsonUtils.getString(m3517O(), "revenue_event", "");
    }

    /* renamed from: O */
    public JSONObject m3517O() {
        C1026f5 c1026f5 = this.f844h;
        return c1026f5 != null ? (JSONObject) c1026f5.m726a(new OooOOo0.o0ooOOo(12)) : m890a("revenue_parameters", new JSONObject());
    }

    /* renamed from: P */
    public String m3518P() {
        return m896b("event_id", "");
    }

    /* renamed from: Q */
    public String m3519Q() {
        return m887a("third_party_ad_placement_id", (String) null);
    }

    /* renamed from: R */
    public List m3520R() {
        return m897b("mwf_info_urls");
    }

    /* renamed from: S */
    public String m3521S() {
        return m896b("waterfall_name", "");
    }

    /* renamed from: T */
    public String m3522T() {
        return m896b("waterfall_test_name", "");
    }

    /* renamed from: U */
    public boolean m3523U() {
        return StringUtils.isValidString(m3508E());
    }

    /* renamed from: V */
    public boolean m3524V() {
        C1129h c1129h = this.f2522n;
        return c1129h != null && c1129h.m1841k() && this.f2522n.m1840j();
    }

    /* renamed from: W */
    public boolean m3525W() {
        return m885a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    /* renamed from: X */
    public boolean m3526X() {
        return m885a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    /* renamed from: Y */
    public void m3527Y() {
        m901c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: Z */
    public void m3528Z() {
        m901c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    public abstract AbstractC1266v2 mo98a(C1129h c1129h);

    /* renamed from: a0 */
    public Boolean m3533a0() {
        return m885a("destroy_on_ui_thread", (Boolean) null);
    }

    /* renamed from: b0 */
    public Boolean m3534b0() {
        return m885a("load_on_ui_thread", (Boolean) null);
    }

    /* renamed from: c0 */
    public Boolean m3535c0() {
        return m885a("show_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f2527s;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return m887a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return m887a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return m887a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(m887a("ad_format", m896b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        C1129h c1129h = this.f2522n;
        if (c1129h != null) {
            return c1129h.m1835e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return m887a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(m3519Q());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f2525q;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f837a.m2866a(AbstractC1144o3.f1631b8)).booleanValue() || !getFormat().isFullscreenAd() || m3539u().get()) {
            C1026f5 c1026f5 = this.f844h;
            return c1026f5 != null ? ((Double) c1026f5.m726a(new OooOOo0.o0ooOOo(13))).doubleValue() : JsonUtils.getDouble(m890a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f837a.m2847O();
        if (!C1240o.m3200a()) {
            return 0.0d;
        }
        this.f837a.m2847O().m3214b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        C1026f5 c1026f5 = this.f844h;
        return c1026f5 != null ? (String) c1026f5.m726a(new OooOOo0.o0ooOOo(15)) : JsonUtils.getString(m890a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iM883a = m883a("ad_width", -3);
        int iM883a2 = m883a("ad_height", -3);
        return (iM883a == -3 || iM883a2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iM883a, iM883a2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f2524p;
    }

    /* renamed from: h */
    public void m3536h(String str) {
        this.f2527s = str;
    }

    /* renamed from: i */
    public void m3537i(String str) {
        this.f2526r = str;
    }

    /* renamed from: t */
    public void m3538t() {
        this.f2522n = null;
        this.f2524p = null;
    }

    @Override // com.applovin.impl.C1044h3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + m3519Q() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    /* renamed from: u */
    public AtomicBoolean m3539u() {
        return this.f2519k;
    }

    /* renamed from: v */
    public String m3540v() {
        return m887a("adomain", (String) null);
    }

    /* renamed from: w */
    public AtomicBoolean m3541w() {
        return this.f2520l;
    }

    /* renamed from: x */
    public JSONObject m3542x() {
        C1026f5 c1026f5 = this.f844h;
        return c1026f5 != null ? (JSONObject) c1026f5.m726a(new OooOOo0.o0ooOOo(14)) : m890a("ad_values", new JSONObject());
    }

    /* renamed from: y */
    public View m3543y() {
        C1129h c1129h;
        if (!m3524V() || (c1129h = this.f2522n) == null) {
            return null;
        }
        return c1129h.m1834d();
    }

    /* renamed from: z */
    public String m3544z() {
        return this.f2523o;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectM3542x = m3542x();
        if (jSONObjectM3542x.has(str)) {
            return JsonUtils.getString(jSONObjectM3542x, str, str2);
        }
        Bundle bundleM915l = m915l();
        if (bundleM915l.containsKey(str)) {
            return bundleM915l.getString(str);
        }
        JSONObject jSONObjectM3514L = m3514L();
        return jSONObjectM3514L.has(str) ? JsonUtils.getString(jSONObjectM3514L, str, str2) : m887a(str, str2);
    }

    /* renamed from: a */
    public void m3531a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f2524p = maxAdWaterfallInfo;
    }

    /* renamed from: a */
    public void m3529a(long j) {
        this.f2525q = j;
    }

    /* renamed from: a */
    public void m3532a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectM3514L = m3514L();
        JsonUtils.putAll(jSONObjectM3514L, jSONObject);
        m891a("publisher_extra_info", (Object) jSONObjectM3514L);
    }

    /* renamed from: a */
    public void mo3530a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !m903c("creative_id")) {
            m902c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !m903c("ad_width") && bundle.containsKey("ad_height") && !m903c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            m900c("ad_width", i);
            m900c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            m3532a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
        if (bundle.containsKey("array_parameters")) {
            this.f2528t = bundle.getBundle("array_parameters");
        }
    }
}
