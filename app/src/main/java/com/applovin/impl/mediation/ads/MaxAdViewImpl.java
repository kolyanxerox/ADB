package com.applovin.impl.mediation.ads;

import OooO0oO.OooOo;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.location.LocationRequestCompat;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1183s;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C0999c8;
import com.applovin.impl.C1009d8;
import com.applovin.impl.C1060j;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1293y2;
import com.applovin.impl.EnumC1050i;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.C1215f;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends AbstractC1118a implements C1215f.a, C1009d8.a, C1060j.b {

    /* renamed from: A */
    private boolean f1266A;

    /* renamed from: B */
    private boolean f1267B;

    /* renamed from: C */
    private boolean f1268C;

    /* renamed from: D */
    private boolean f1269D;

    /* renamed from: a */
    private final Context f1270a;

    /* renamed from: b */
    private final MaxAdView f1271b;

    /* renamed from: c */
    private final String f1272c;

    /* renamed from: d */
    private final View f1273d;

    /* renamed from: e */
    private long f1274e;

    /* renamed from: f */
    private C1293y2 f1275f;

    /* renamed from: g */
    private String f1276g;

    /* renamed from: h */
    private String f1277h;

    /* renamed from: i */
    private final MaxAdViewConfiguration f1278i;

    /* renamed from: j */
    private final C1107b f1279j;

    /* renamed from: k */
    private final C1109d f1280k;

    /* renamed from: l */
    private final C1215f f1281l;

    /* renamed from: m */
    private final C0999c8 f1282m;

    /* renamed from: n */
    private final C1009d8 f1283n;

    /* renamed from: o */
    private final Object f1284o;

    /* renamed from: p */
    private final Object f1285p;

    /* renamed from: q */
    private C1293y2 f1286q;

    /* renamed from: r */
    private MaxAd f1287r;

    /* renamed from: s */
    private boolean f1288s;

    /* renamed from: t */
    private boolean f1289t;

    /* renamed from: u */
    private boolean f1290u;

    /* renamed from: v */
    private final AtomicBoolean f1291v;

    /* renamed from: w */
    private boolean f1292w;

    /* renamed from: x */
    private boolean f1293x;

    /* renamed from: y */
    private boolean f1294y;

    /* renamed from: z */
    private boolean f1295z;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$b */
    public class C1107b extends AbstractC1108c {
        private C1107b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            C1240o c1240o = MaxAdViewImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                C1240o c1240o2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o2, str2);
            }
            AbstractC1168q2.m2170a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.m1582a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.m1584a()) {
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m3211a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.m2860X().destroyAd(maxAd);
                return;
            }
            C1293y2 c1293y2 = (C1293y2) maxAd;
            c1293y2.m911g(MaxAdViewImpl.this.f1276g);
            c1293y2.m909f(MaxAdViewImpl.this.f1277h);
            if (c1293y2.m3543y() == null) {
                MaxAdViewImpl.this.sdk.m2860X().destroyAd(c1293y2);
                onAdLoadFailed(c1293y2.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (c1293y2.m3737q0()) {
                long jM3732l0 = c1293y2.m3732l0();
                MaxAdViewImpl.this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    C1240o c1240oM2847O = MaxAdViewImpl.this.sdk.m2847O();
                    String str = MaxAdViewImpl.this.tag;
                    StringBuilder sbOooOOo = OooOo.OooOOo(jM3732l0, "Scheduling banner ad refresh ", " milliseconds from now for '");
                    sbOooOOo.append(MaxAdViewImpl.this.adUnitId);
                    sbOooOOo.append("'...");
                    c1240oM2847O.m3211a(str, sbOooOOo.toString());
                }
                MaxAdViewImpl.this.f1281l.m2716a(jM3732l0);
                if (MaxAdViewImpl.this.f1281l.m2720g() || MaxAdViewImpl.this.f1290u) {
                    C1240o c1240o2 = MaxAdViewImpl.this.logger;
                    if (C1240o.m3200a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.m3211a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f1281l.m2722j();
                }
            }
            C1240o c1240o3 = MaxAdViewImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                C1240o c1240o4 = maxAdViewImpl3.logger;
                String str2 = maxAdViewImpl3.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o4, str2);
            }
            AbstractC1168q2.m2249f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.m1597d(c1293y2);
        }

        public /* synthetic */ C1107b(MaxAdViewImpl maxAdViewImpl, C1106a c1106a) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$c */
    public abstract class AbstractC1108c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, AbstractC1118a.a {
        private AbstractC1108c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f1286q)) {
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    C1240o c1240o2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o2, str);
                }
                AbstractC1168q2.m2168a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f1287r)) {
                MaxAdViewImpl.this.f1287r = null;
                if ((MaxAdViewImpl.this.f1286q.m3738r0() || MaxAdViewImpl.this.f1267B) && MaxAdViewImpl.this.f1288s) {
                    MaxAdViewImpl.this.f1288s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    C1240o c1240o2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o2, str);
                }
                AbstractC1168q2.m2208b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f1286q)) {
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    C1240o c1240o2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb.append(maxAd);
                    sb.append(", error=");
                    sb.append(maxError);
                    sb.append("), listener=");
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o2, str);
                }
                AbstractC1168q2.m2165a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f1286q)) {
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    C1240o c1240o2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o2, str);
                }
                AbstractC1168q2.m2228c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f1286q)) {
                MaxAdViewImpl.this.f1287r = maxAd;
                if ((MaxAdViewImpl.this.f1286q.m3738r0() || MaxAdViewImpl.this.f1267B) && !MaxAdViewImpl.this.f1281l.m2720g()) {
                    MaxAdViewImpl.this.f1288s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    C1240o c1240o2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o2, str);
                }
                AbstractC1168q2.m2237d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f1286q)) {
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    C1240o c1240o2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxAdViewImpl.this.adListener, c1240o2, str);
                }
                AbstractC1168q2.m2244e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            C1240o c1240o = MaxAdViewImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                C1240o c1240o2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbOooOoO0 = OooOo.OooOoO0("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbOooOoO0.append(MaxAdViewImpl.this.requestListener);
                c1240o2.m3211a(str2, sbOooOoO0.toString());
            }
            AbstractC1168q2.m2172a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1240o c1240o = MaxAdViewImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.m3211a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            AbstractC1168q2.m2174a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ AbstractC1108c(MaxAdViewImpl maxAdViewImpl, C1106a c1106a) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$d */
    public class C1109d extends AbstractC1108c {
        private C1109d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            C1240o c1240o = MaxAdViewImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.m3211a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.m1582a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f1293x) {
                C1240o c1240o = MaxAdViewImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m3211a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.m2866a(AbstractC1144o3.f1670y7)).booleanValue()) {
                    MaxAdViewImpl.this.m1588b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.m1581a(maxAd);
                    return;
                }
            }
            C1240o c1240o2 = MaxAdViewImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.m3211a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.m2860X().destroyAd(maxAd);
        }

        public /* synthetic */ C1109d(MaxAdViewImpl maxAdViewImpl, C1106a c1106a) {
            this();
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).m3943a());
        this.f1272c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f1274e = LocationRequestCompat.PASSIVE_INTERVAL;
        this.f1284o = new Object();
        this.f1285p = new Object();
        this.f1286q = null;
        this.f1287r = null;
        this.f1291v = new AtomicBoolean();
        this.f1293x = false;
        this.f1270a = context.getApplicationContext();
        this.f1271b = maxAdView;
        this.f1273d = view;
        this.f1279j = new C1107b();
        this.f1280k = new C1109d();
        this.f1281l = new C1215f(this.sdk, this);
        this.f1282m = new C0999c8(maxAdView, this.sdk);
        this.f1283n = new C1009d8(maxAdView, this.sdk, this);
        this.f1278i = maxAdViewConfiguration;
        this.sdk.m2903j().m1028a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1118a
    public void destroy() {
        if (((Boolean) this.sdk.m2866a(AbstractC1144o3.f1671z7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new OooO00o(this, 0));
        } else {
            m1603g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f1276g;
    }

    public void loadAd() {
        loadAd(EnumC1050i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.C1215f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.m2866a(AbstractC1144o3.f1670y7)).booleanValue()) {
            m1600f();
        } else {
            m1599e();
        }
    }

    @Override // com.applovin.impl.C1060j.b
    public void onCreativeIdGenerated(String str, String str2) {
        C1293y2 c1293y2 = this.f1286q;
        if (c1293y2 != null && c1293y2.m3518P().equalsIgnoreCase(str)) {
            this.f1286q.m3536h(str2);
            AbstractC1168q2.m2209b(this.adReviewListener, str2, this.f1286q);
            return;
        }
        C1293y2 c1293y22 = this.f1275f;
        if (c1293y22 == null || !c1293y22.m3518P().equalsIgnoreCase(str)) {
            return;
        }
        this.f1275f.m3536h(str2);
    }

    @Override // com.applovin.impl.C1009d8.a
    public void onLogVisibilityImpression() {
        m1580a(this.f1286q, this.f1282m.m495a(this.f1286q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.m2866a(AbstractC1144o3.f1667v7)).booleanValue() && this.f1281l.m2721h()) {
            if (AbstractC0989b8.m435b(i)) {
                if (C1240o.m3200a()) {
                    this.logger.m3211a(this.tag, "Ad view visible");
                }
                this.f1281l.m2719d();
            } else {
                if (C1240o.m3200a()) {
                    this.logger.m3211a(this.tag, "Ad view hidden");
                }
                this.f1281l.m2718c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f1286q != null && C1240o.m3200a()) {
            C1240o c1240o = this.logger;
            String str2 = this.tag;
            StringBuilder sbOooOoO0 = OooOo.OooOoO0("Setting custom data (", str, ") for Ad Unit ID (");
            sbOooOoO0.append(this.adUnitId);
            sbOooOoO0.append(") after an ad has been loaded already.");
            c1240o.m3218k(str2, sbOooOoO0.toString());
        }
        AbstractC1078k7.m1217b(str, this.tag);
        this.f1277h = str;
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1118a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        m1583a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f1286q != null && C1240o.m3200a()) {
            C1240o c1240o = this.logger;
            String str2 = this.tag;
            StringBuilder sbOooOoO0 = OooOo.OooOoO0("Setting placement (", str, ") for Ad Unit ID (");
            sbOooOoO0.append(this.adUnitId);
            sbOooOoO0.append(") after an ad has been loaded already.");
            c1240o.m3218k(str2, sbOooOoO0.toString());
        }
        this.f1276g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f1274e = i;
    }

    public void startAutoRefresh() {
        this.f1290u = false;
        if (!this.f1281l.m2720g()) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f1281l.m2723m();
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Resumed auto-refresh with remaining time: " + this.f1281l.m2717b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f1286q == null) {
            if (this.f1294y || ((Boolean) this.sdk.m2866a(AbstractC1144o3.f1669x7)).booleanValue()) {
                this.f1290u = true;
                return;
            } else {
                C1240o.m3209j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Pausing auto-refresh with remaining time: " + this.f1281l.m2717b() + "ms");
        }
        this.f1281l.m2722j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f1271b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, m1584a(), '}');
    }

    /* renamed from: d */
    public void m1597d(C1293y2 c1293y2) {
        AppLovinSdkUtils.runOnUiThread(new OooO0O0(this, c1293y2, 1));
    }

    /* renamed from: e */
    private void m1599e() {
        this.f1291v.set(false);
        if (this.f1275f != null) {
            m1606i();
            return;
        }
        if (!m1589b()) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Refreshing ad from network...");
            }
            loadAd(EnumC1050i.REFRESH);
        } else if (this.f1289t) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(EnumC1050i.REFRESH);
        } else {
            if (C1240o.m3200a()) {
                this.logger.m3214b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f1291v.set(true);
        }
    }

    /* renamed from: f */
    private void m1600f() {
        boolean z;
        boolean z2;
        synchronized (this.f1285p) {
            try {
                z = false;
                this.f1291v.set(false);
                z2 = this.f1275f != null;
                if (!z2) {
                    if (m1589b()) {
                        if (!this.f1289t) {
                            if (C1240o.m3200a()) {
                                this.logger.m3214b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f1291v.set(true);
                        } else if (C1240o.m3200a()) {
                            this.logger.m3211a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (C1240o.m3200a()) {
                        this.logger.m3211a(this.tag, "Refreshing ad from network...");
                    }
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            m1606i();
        } else if (z) {
            loadAd(EnumC1050i.REFRESH);
        }
    }

    /* renamed from: g */
    public void m1603g() {
        m1604h();
        if (this.f1275f != null) {
            this.sdk.m2860X().destroyAd(this.f1275f);
        }
        synchronized (this.f1284o) {
            this.f1293x = true;
        }
        this.f1281l.m2715a();
        this.sdk.m2903j().m1029b(this);
        if (this.sdk.m2851R() != null) {
            this.sdk.m2851R().m1753c(this.adUnitId, this.f1272c);
        } else {
            this.sdk.m2849Q().m1703c(this.adUnitId, this.f1272c);
        }
        super.destroy();
    }

    /* renamed from: h */
    private void m1604h() {
        C1293y2 c1293y2;
        MaxAdView maxAdView = this.f1271b;
        if (maxAdView != null) {
            AbstractC1183s.m2358a(maxAdView, this.f1273d);
        }
        this.f1283n.m653b();
        synchronized (this.f1284o) {
            c1293y2 = this.f1286q;
        }
        MaxAd maxAd = this.f1287r;
        if (maxAd != null && maxAd.equals(c1293y2)) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Collapsing ad manually for removed ad.");
            }
            AbstractC1168q2.m2207b(this.f1279j, maxAd);
        }
        if (c1293y2 != null) {
            this.sdk.m2860X().destroyAd(c1293y2);
        }
    }

    /* renamed from: i */
    private void m1606i() {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Rendering for cached ad: " + this.f1275f + "...");
        }
        this.f1279j.onAdLoaded(this.f1275f);
        this.f1275f = null;
    }

    public void loadAd(EnumC1050i enumC1050i) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z = this.f1294y || ((Boolean) this.sdk.m2866a(AbstractC1144o3.f1669x7)).booleanValue();
        if (z && !this.f1281l.m2720g() && this.f1281l.m2721h()) {
            C1240o.m3207h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f1281l.m2717b()) + " seconds.");
            return;
        }
        if (!z) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Loading ad...");
            }
            m1574a(enumC1050i, this.f1279j);
        } else if (this.f1275f != null) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Rendering cached ad");
            }
            m1606i();
        } else if (this.f1292w) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f1291v.set(true);
        } else {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Loading ad...");
            }
            m1574a(enumC1050i, this.f1279j);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m1587b(C1293y2 c1293y2) {
        View viewM3543y = c1293y2.m3543y();
        String str = viewM3543y == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f1271b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (C1240o.m3200a()) {
                this.logger.m3214b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (C1240o.m3200a()) {
                C1240o c1240o = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(c1293y2);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str2);
            }
            AbstractC1168q2.m2165a(this.adListener, (MaxAd) c1293y2, (MaxError) maxErrorImpl, true);
            this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c1293y2);
            return;
        }
        m1604h();
        m1674a((AbstractC1266v2) c1293y2);
        if (c1293y2.m688k0()) {
            this.f1283n.m652a(c1293y2);
        }
        maxAdView.setDescendantFocusability(393216);
        if (c1293y2.m3733m0() != LocationRequestCompat.PASSIVE_INTERVAL) {
            this.f1273d.setBackgroundColor((int) c1293y2.m3733m0());
        } else {
            long j = this.f1274e;
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                this.f1273d.setBackgroundColor((int) j);
            } else {
                this.f1273d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewM3543y);
        m1573a(viewM3543y, c1293y2);
        this.sdk.m2933z().m551d(c1293y2);
        m1593c(c1293y2);
        synchronized (this.f1284o) {
            this.f1286q = c1293y2;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.m2860X().processRawAdImpression(c1293y2, this.f1279j);
        if (StringUtils.isValidString(this.f1286q.getAdReviewCreativeId())) {
            AbstractC1168q2.m2176a(this.adReviewListener, this.f1286q.getAdReviewCreativeId(), (MaxAd) this.f1286q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new OooO0O0(this, c1293y2, 0), c1293y2.m3735o0());
    }

    /* renamed from: c */
    public /* synthetic */ void m1592c() {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Loading ad for precache request...");
        }
        m1574a(EnumC1050i.SEQUENTIAL_OR_PRECACHE, this.f1280k);
    }

    /* renamed from: d */
    private void m1596d() {
        if (m1589b()) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Scheduling refresh precache request now");
            }
            this.f1292w = true;
            this.sdk.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.sdk, "loadMaxAdForPrecacheRequest", new OooO00o(this, 1)), C0987b6.b.MEDIATION);
        }
    }

    /* renamed from: c */
    private void m1593c(C1293y2 c1293y2) {
        int height = this.f1271b.getHeight();
        int width = this.f1271b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f1270a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f1270a, width);
            MaxAdFormat format = c1293y2.getFormat();
            int height2 = (this.f1269D ? format.getAdaptiveSize(iPxToDp2, this.f1271b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), AbstractC1141o0.m1938b(this.f1270a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sbOooOo0o = OooOo.OooOo0o("\n**************************************************\n`MaxAdView` size ", iPxToDp2, "x", iPxToDp, " dp smaller than required ");
                sbOooOo0o.append(this.f1269D ? "adaptive " : "");
                sbOooOo0o.append("size: ");
                sbOooOo0o.append(iMin);
                sbOooOo0o.append("x");
                String strOooOOO = OooOo.OooOOO(sbOooOo0o, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (C1240o.m3200a()) {
                    this.logger.m3214b("AppLovinSdk", strOooOOO);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1574a(EnumC1050i enumC1050i, AbstractC1118a.a aVar) {
        if (m1584a()) {
            boolean zM1228c = AbstractC1078k7.m1228c(this.sdk);
            this.sdk.m2832E().m572a(C0993c2.f474E0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zM1228c));
            if (!zM1228c) {
                C1240o.m3207h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new androidx.webkit.OooO00o(this, aVar, enumC1050i, 10));
    }

    /* renamed from: a */
    public /* synthetic */ void m1578a(AbstractC1118a.a aVar, EnumC1050i enumC1050i) {
        int adaptiveWidth;
        C1293y2 c1293y2 = this.f1286q;
        if (c1293y2 != null) {
            long jM495a = this.f1282m.m495a(c1293y2);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f1286q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jM495a));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f1271b.getContext(), this.f1271b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f1271b.getContext(), this.f1271b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f1281l.m2720g() || this.f1290u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f1295z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f1278i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            C1240o.m3209j(this.tag, OooOo.OooO("The requested adaptive ad view width (", adaptiveWidth, " dp) is different from the MaxAdView width (", iPxToDp, " dp)."));
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + aVar + "...");
        }
        this.sdk.m2860X().loadAd(this.adUnitId, this.f1272c, this.adFormat, enumC1050i, this.localExtraParameters, this.extraParameters, this.f1270a, aVar);
    }

    /* renamed from: a */
    private void m1583a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f1294y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f1295z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f1266A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f1267B = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f1268C = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            if (this.f1278i == null) {
                C1240o.m3207h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://developers.applovin.com/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.f1269D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* renamed from: b */
    public void m1588b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f1292w = false;
        synchronized (this.f1285p) {
            try {
                zCompareAndSet = this.f1291v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (C1240o.m3200a()) {
                        this.logger.m3211a(this.tag, "Saving precache ad...");
                    }
                    C1293y2 c1293y2 = (C1293y2) maxAd;
                    this.f1275f = c1293y2;
                    c1293y2.m911g(this.f1276g);
                    this.f1275f.m909f(this.f1277h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zCompareAndSet) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f1279j.onAdLoaded(maxAd);
        }
    }

    /* renamed from: b */
    private boolean m1589b() {
        if (this.f1266A) {
            return false;
        }
        return ((Boolean) this.sdk.m2866a(AbstractC1144o3.f1608E7)).booleanValue();
    }

    /* renamed from: a */
    public /* synthetic */ void m1579a(C1293y2 c1293y2) {
        long jM495a = this.f1282m.m495a(c1293y2);
        if (!c1293y2.m688k0()) {
            m1580a(c1293y2, jM495a);
        }
        m1572a(jM495a);
    }

    /* renamed from: a */
    public void m1582a(MaxError maxError) {
        if (m1584a()) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.m2888c(AbstractC1144o3.f1661r7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.m2847O();
            if (C1240o.m3200a()) {
                this.sdk.m2847O().m3211a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f1290u && !this.f1281l.m2720g()) {
            this.f1289t = true;
            this.f1292w = false;
            long jLongValue = ((Long) this.sdk.m2866a(AbstractC1144o3.f1659q7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    C1240o c1240oM2847O = this.sdk.m2847O();
                    String str = this.tag;
                    StringBuilder sbOooOOo = OooOo.OooOOo(jLongValue, "Scheduling failed banner ad refresh ", " milliseconds from now for '");
                    sbOooOOo.append(this.adUnitId);
                    sbOooOOo.append("'...");
                    c1240oM2847O.m3211a(str, sbOooOOo.toString());
                }
                this.f1281l.m2716a(jLongValue);
                return;
            }
            return;
        }
        if (this.f1292w) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f1292w = false;
        }
        if (this.f1291v.get()) {
            if (C1240o.m3200a()) {
                C1240o c1240o = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(this.adUnitId);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str2);
            }
            AbstractC1168q2.m2170a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    /* renamed from: a */
    private void m1573a(View view, C1293y2 c1293y2) {
        int iM3736p0 = c1293y2.m3736p0();
        int iM3734n0 = c1293y2.m3734n0();
        int iDpToPx = iM3736p0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iM3736p0);
        int iDpToPx2 = iM3734n0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iM3734n0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, OooOo.OooO("Pinning ad view to MAX ad view with width: ", iDpToPx, " and height: ", iDpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : AbstractC0989b8.m431a(this.f1271b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m1580a(C1293y2 c1293y2, long j) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.m2860X().processViewabilityAdImpressionPostback(c1293y2, j, this.f1279j);
    }

    /* renamed from: a */
    private void m1572a(long j) {
        if (AbstractC1078k7.m1200a(j, ((Long) this.sdk.m2866a(AbstractC1144o3.f1607D7)).longValue()) && !this.f1268C) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            }
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f1289t = true;
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f1289t = false;
        m1596d();
    }

    /* renamed from: a */
    public void m1581a(MaxAd maxAd) {
        this.f1292w = false;
        if (this.f1291v.compareAndSet(true, false)) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f1279j.onAdLoaded(maxAd);
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Saving precache ad...");
        }
        C1293y2 c1293y2 = (C1293y2) maxAd;
        this.f1275f = c1293y2;
        c1293y2.m911g(this.f1276g);
        this.f1275f.m909f(this.f1277h);
    }

    /* renamed from: a */
    public boolean m1584a() {
        boolean z;
        synchronized (this.f1284o) {
            z = this.f1293x;
        }
        return z;
    }
}
