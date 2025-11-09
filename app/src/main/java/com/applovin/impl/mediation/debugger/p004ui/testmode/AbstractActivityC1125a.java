package com.applovin.impl.mediation.debugger.p004ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.AbstractActivityC1074k3;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C0984b3;
import com.applovin.impl.C1272w;
import com.applovin.impl.C1281x;
import com.applovin.impl.mediation.debugger.p004ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import com.ironsource.C3678sv;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1125a extends AbstractActivityC1074k3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.InterfaceC1123a, MaxAdRevenueListener, C1272w.a {

    /* renamed from: a */
    private C0984b3 f1394a;

    /* renamed from: b */
    private C1220k f1395b;

    /* renamed from: c */
    private MaxAdView f1396c;

    /* renamed from: d */
    private MaxAdView f1397d;

    /* renamed from: e */
    private MaxInterstitialAd f1398e;

    /* renamed from: f */
    private MaxAppOpenAd f1399f;

    /* renamed from: g */
    private MaxRewardedAd f1400g;

    /* renamed from: h */
    private MaxAd f1401h;

    /* renamed from: i */
    private MaxNativeAdLoader f1402i;

    /* renamed from: j */
    private List f1403j;

    /* renamed from: k */
    private String f1404k;

    /* renamed from: l */
    private AdControlButton f1405l;

    /* renamed from: m */
    private AdControlButton f1406m;

    /* renamed from: n */
    private AdControlButton f1407n;

    /* renamed from: o */
    private AdControlButton f1408o;

    /* renamed from: p */
    private AdControlButton f1409p;

    /* renamed from: q */
    private AdControlButton f1410q;

    /* renamed from: r */
    private Button f1411r;

    /* renamed from: s */
    private Button f1412s;

    /* renamed from: t */
    private FrameLayout f1413t;

    /* renamed from: u */
    private FrameLayout f1414u;

    /* renamed from: v */
    private Switch f1415v;

    /* renamed from: w */
    private Switch f1416w;

    /* renamed from: x */
    private Map f1417x;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a */
    public class a extends MaxNativeAdListener {

        /* renamed from: a */
        final /* synthetic */ MaxNativeAdView f1418a;

        public a(MaxNativeAdView maxNativeAdView) {
            this.f1418a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC1125a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC1125a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC1125a.this.f1401h != null) {
                AbstractActivityC1125a.this.f1402i.destroy(AbstractActivityC1125a.this.f1401h);
            }
            AbstractActivityC1125a.this.f1401h = maxAd;
            AbstractActivityC1125a.this.f1402i.render(this.f1418a, maxAd);
            AbstractActivityC1125a.this.f1414u.removeAllViews();
            AbstractActivityC1125a.this.f1414u.addView(this.f1418a);
            AbstractActivityC1125a.this.onAdLoaded(maxAd);
        }
    }

    /* renamed from: d */
    public /* synthetic */ void m1733d(View view) {
        this.f1397d.removeAllViews();
        this.f1406m.setControlState(AdControlButton.EnumC1124b.LOAD);
    }

    /* renamed from: e */
    private void m1734e() {
        List listM366r = this.f1394a.m366r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listM366r.contains(maxAdFormat)) {
            findViewById(C1333R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f1394a.m361m();
        this.f1404k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f1395b.m2934z0(), this);
        this.f1400g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", C3401a.f9920g);
        this.f1400g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(C1333R.id.rewarded_control_button);
        this.f1409p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f1409p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f1395b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f1394a.m372x() == null || !this.f1394a.m372x().containsKey(maxAdFormat)) ? this.f1394a.m361m() : (String) this.f1394a.m372x().get(maxAdFormat);
    }

    public void initialize(C0984b3 c0984b3) {
        this.f1394a = c0984b3;
        this.f1395b = c0984b3.m363o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        AbstractC1078k7.m1193a(C3678sv.f11949f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        AbstractC1078k7.m1193a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        m1719a(maxAd.getAdUnitId()).setControlState(AdControlButton.EnumC1124b.LOAD);
        AbstractC1078k7.m1195a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        AbstractC1078k7.m1193a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        AbstractC1078k7.m1193a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        AbstractC1078k7.m1193a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonM1719a = m1719a(str);
        adControlButtonM1719a.setControlState(AdControlButton.EnumC1124b.LOAD);
        AbstractC1078k7.m1187a(maxError, adControlButtonM1719a.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton adControlButtonM1719a = m1719a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonM1719a.setControlState(AdControlButton.EnumC1124b.LOAD);
        } else {
            adControlButtonM1719a.setControlState(AdControlButton.EnumC1124b.SHOW);
        }
    }

    @Override // com.applovin.impl.C1272w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f1396c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f1397d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f1398e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f1399f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f1400g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f1402i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m1724a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        AbstractC1078k7.m1193a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p004ui.testmode.AdControlButton.InterfaceC1123a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.EnumC1124b enumC1124b = AdControlButton.EnumC1124b.LOAD;
        if (enumC1124b != adControlButton.getControlState()) {
            if (AdControlButton.EnumC1124b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(enumC1124b);
                m1728b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.EnumC1124b.LOADING);
        Map map = this.f1417x;
        if (map == null || map.get(format) == null) {
            m1724a(format);
        } else {
            ((C1272w) this.f1417x.get(format)).m3580a();
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f1394a == null) {
            C1240o.m3207h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(C1333R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f1394a.m355g() + " Test Ads");
        this.f1403j = this.f1395b.m2922t0().m492b();
        m1722a();
        m1730c();
        m1726b();
        m1734e();
        m1732d();
        findViewById(C1333R.id.app_open_ad_control_view).setVisibility(8);
        this.f1411r = (Button) findViewById(C1333R.id.show_mrec_button);
        this.f1412s = (Button) findViewById(C1333R.id.show_native_button);
        if (this.f1394a.m347J() && this.f1394a.m366r().contains(MaxAdFormat.MREC)) {
            this.f1414u.setVisibility(8);
            this.f1411r.setBackgroundColor(-1);
            this.f1412s.setBackgroundColor(-3355444);
            final int i = 0;
            this.f1411r.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.OooO00o

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ AbstractActivityC1125a f15692OooOo0o;

                {
                    this.f15692OooOo0o = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            this.f15692OooOo0o.m1723a(view);
                            break;
                        case 1:
                            this.f15692OooOo0o.m1727b(view);
                            break;
                        case 2:
                            this.f15692OooOo0o.m1731c(view);
                            break;
                        default:
                            this.f15692OooOo0o.m1733d(view);
                            break;
                    }
                }
            });
            final int i2 = 1;
            this.f1412s.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.OooO00o

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ AbstractActivityC1125a f15692OooOo0o;

                {
                    this.f15692OooOo0o = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f15692OooOo0o.m1723a(view);
                            break;
                        case 1:
                            this.f15692OooOo0o.m1727b(view);
                            break;
                        case 2:
                            this.f15692OooOo0o.m1731c(view);
                            break;
                        default:
                            this.f15692OooOo0o.m1733d(view);
                            break;
                    }
                }
            });
        } else {
            this.f1411r.setVisibility(8);
            this.f1412s.setVisibility(8);
        }
        this.f1415v = (Switch) findViewById(C1333R.id.native_banner_switch);
        this.f1416w = (Switch) findViewById(C1333R.id.native_mrec_switch);
        if (this.f1394a.m348K()) {
            final int i3 = 2;
            this.f1415v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.OooO00o

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ AbstractActivityC1125a f15692OooOo0o;

                {
                    this.f15692OooOo0o = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f15692OooOo0o.m1723a(view);
                            break;
                        case 1:
                            this.f15692OooOo0o.m1727b(view);
                            break;
                        case 2:
                            this.f15692OooOo0o.m1731c(view);
                            break;
                        default:
                            this.f15692OooOo0o.m1733d(view);
                            break;
                    }
                }
            });
            final int i4 = 3;
            this.f1416w.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.OooO00o

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ AbstractActivityC1125a f15692OooOo0o;

                {
                    this.f15692OooOo0o = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f15692OooOo0o.m1723a(view);
                            break;
                        case 1:
                            this.f15692OooOo0o.m1727b(view);
                            break;
                        case 2:
                            this.f15692OooOo0o.m1731c(view);
                            break;
                        default:
                            this.f15692OooOo0o.m1733d(view);
                            break;
                    }
                }
            });
        } else {
            this.f1415v.setVisibility(8);
            this.f1416w.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f1394a.m353e()) && this.f1394a.m352d() != null && this.f1394a.m352d().size() > 0) {
            AdRegistration.getInstance(this.f1394a.m353e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap map = new HashMap(this.f1394a.m352d().size());
            for (MaxAdFormat maxAdFormat : this.f1394a.m352d().keySet()) {
                map.put(maxAdFormat, new C1272w((C1281x) this.f1394a.m352d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
            }
            this.f1417x = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f1395b.m2922t0().m490a(this.f1403j);
        MaxAdView maxAdView = this.f1396c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f1397d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f1398e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f1400g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f1402i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f1401h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f1402i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        AbstractC1078k7.m1193a("onUserRewarded", maxAd, this);
    }

    /* renamed from: b */
    public /* synthetic */ void m1727b(View view) {
        this.f1414u.setVisibility(0);
        this.f1413t.setVisibility(8);
        this.f1412s.setBackgroundColor(-1);
        this.f1411r.setBackgroundColor(-3355444);
    }

    /* renamed from: c */
    public /* synthetic */ void m1731c(View view) {
        this.f1396c.removeAllViews();
        this.f1405l.setControlState(AdControlButton.EnumC1124b.LOAD);
    }

    /* renamed from: a */
    public /* synthetic */ void m1723a(View view) {
        this.f1413t.setVisibility(0);
        this.f1414u.setVisibility(8);
        this.f1411r.setBackgroundColor(-1);
        this.f1412s.setBackgroundColor(-3355444);
    }

    /* renamed from: d */
    private void m1732d() {
        this.f1414u = (FrameLayout) findViewById(C1333R.id.native_ad_view_container);
        if (this.f1394a.m347J()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(C1333R.layout.max_native_ad_template_1).setTitleTextViewId(C1333R.id.applovin_native_title_text_view).setAdvertiserTextViewId(C1333R.id.applovin_native_advertiser_text_view).setBodyTextViewId(C1333R.id.applovin_native_body_text_view).setCallToActionButtonId(C1333R.id.applovin_native_cta_button).setIconImageViewId(C1333R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(C1333R.id.applovin_native_options_view).setStarRatingContentViewGroupId(C1333R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(C1333R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f1402i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1402i.setNativeAdListener(new a(maxNativeAdView));
            this.f1402i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C1333R.id.native_control_button);
            this.f1410q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f1410q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(C1333R.id.native_control_view).setVisibility(8);
        this.f1414u.setVisibility(8);
    }

    /* renamed from: c */
    private void m1730c() {
        this.f1413t = (FrameLayout) findViewById(C1333R.id.mrec_ad_view_container);
        List listM366r = this.f1394a.m366r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listM366r.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f1395b.m2934z0(), this);
            this.f1397d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1397d.setExtraParameter("disable_precache", C3401a.f9920g);
            this.f1397d.setExtraParameter("allow_pause_auto_refresh_immediately", C3401a.f9920g);
            this.f1397d.stopAutoRefresh();
            this.f1397d.setListener(this);
            this.f1413t.addView(this.f1397d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(C1333R.id.mrec_control_button);
            this.f1406m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f1406m.setFormat(maxAdFormat);
            return;
        }
        findViewById(C1333R.id.mrec_control_view).setVisibility(8);
        this.f1413t.setVisibility(8);
    }

    @Override // com.applovin.impl.C1272w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f1397d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f1398e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f1399f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f1400g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f1402i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f1396c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m1724a(maxAdFormat);
    }

    /* renamed from: b */
    private void m1726b() {
        List listM366r = this.f1394a.m366r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listM366r.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f1395b.m2934z0(), this);
            this.f1398e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1398e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C1333R.id.interstitial_control_button);
            this.f1407n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f1407n.setFormat(maxAdFormat);
            return;
        }
        findViewById(C1333R.id.interstitial_control_view).setVisibility(8);
    }

    /* renamed from: a */
    private void m1722a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C1333R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(C1333R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f1394a.m366r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f1395b.m2934z0(), this);
            this.f1396c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f1396c.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1396c.setExtraParameter("disable_precache", C3401a.f9920g);
            this.f1396c.setExtraParameter("allow_pause_auto_refresh_immediately", C3401a.f9920g);
            this.f1396c.stopAutoRefresh();
            this.f1396c.setListener(this);
            frameLayout.addView(this.f1396c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(C1333R.id.banner_control_button);
            this.f1405l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f1405l.setFormat(maxAdFormat);
            return;
        }
        findViewById(C1333R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    /* renamed from: b */
    private void m1728b(MaxAdFormat maxAdFormat) {
        C1240o.m3206g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f1394a.m355g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f1398e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f1399f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f1400g.showAd();
        }
    }

    /* renamed from: a */
    private void m1724a(MaxAdFormat maxAdFormat) {
        C1240o.m3206g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f1394a.m355g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z = false;
        boolean z2 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f1415v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f1416w.isChecked()) {
            z = true;
        }
        if (!z2 && !z) {
            this.f1395b.m2922t0().m489a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f1395b.m2922t0().m489a(this.f1394a.m371w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f1396c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f1397d.loadAd();
            this.f1411r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f1398e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f1399f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f1400g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f1402i.loadAd();
            this.f1412s.callOnClick();
        }
    }

    /* renamed from: a */
    private AdControlButton m1719a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f1406m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f1407n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f1408o;
            }
            if (str.equals(this.f1404k)) {
                return this.f1409p;
            }
            if (str.equals("test_mode_native")) {
                return this.f1410q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f1405l;
    }
}
