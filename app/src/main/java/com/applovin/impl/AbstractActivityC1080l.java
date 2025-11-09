package com.applovin.impl;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.C1090m;
import com.applovin.impl.C1272w;
import com.applovin.impl.mediation.debugger.p004ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* renamed from: com.applovin.impl.l */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1080l extends AbstractActivityC1074k3 implements AdControlButton.InterfaceC1123a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C1272w.a {

    /* renamed from: a */
    private C1220k f1015a;

    /* renamed from: b */
    private C1130n f1016b;

    /* renamed from: c */
    private C1029f8 f1017c;

    /* renamed from: d */
    private C1090m f1018d;

    /* renamed from: e */
    private MaxAdView f1019e;

    /* renamed from: f */
    private MaxInterstitialAd f1020f;

    /* renamed from: g */
    private MaxAppOpenAd f1021g;

    /* renamed from: h */
    private MaxRewardedAd f1022h;

    /* renamed from: i */
    private MaxNativeAdView f1023i;

    /* renamed from: j */
    private MaxNativeAdLoader f1024j;

    /* renamed from: k */
    private MaxAd f1025k;

    /* renamed from: l */
    private DialogC1174r f1026l;

    /* renamed from: m */
    private List f1027m;

    /* renamed from: n */
    private ListView f1028n;

    /* renamed from: o */
    private View f1029o;

    /* renamed from: p */
    private AdControlButton f1030p;

    /* renamed from: q */
    private TextView f1031q;

    /* renamed from: r */
    private C1272w f1032r;

    /* renamed from: com.applovin.impl.l$a */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC1080l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC1080l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC1080l.this.f1025k != null) {
                AbstractActivityC1080l.this.f1024j.destroy(AbstractActivityC1080l.this.f1025k);
            }
            AbstractActivityC1080l.this.f1025k = maxAd;
            AbstractActivityC1080l.this.f1024j.render(AbstractActivityC1080l.this.f1023i, maxAd);
            AbstractActivityC1080l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f1015a;
    }

    public void initialize(C1130n c1130n, C1140o c1140o, C1029f8 c1029f8, C1220k c1220k) {
        List listM1489a;
        this.f1015a = c1220k;
        this.f1016b = c1130n;
        this.f1017c = c1029f8;
        this.f1027m = c1220k.m2922t0().m492b();
        C1090m c1090m = new C1090m(c1130n, c1140o, c1029f8, this);
        this.f1018d = c1090m;
        c1090m.m2059a(new o0O0O00(this, c1220k, c1130n, c1140o));
        m1275b();
        if (c1130n.m1876f().m1929f()) {
            if ((c1029f8 != null && !c1029f8.m762b().m2313d().m341D()) || (listM1489a = c1220k.m2856U().m1489a(c1130n.m1873c())) == null || listM1489a.isEmpty()) {
                return;
            }
            this.f1032r = new C1272w(listM1489a, c1130n.m1871a(), getApplicationContext(), this);
        }
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
        this.f1030p.setControlState(AdControlButton.EnumC1124b.LOAD);
        this.f1031q.setText("");
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
        this.f1030p.setControlState(AdControlButton.EnumC1124b.LOAD);
        this.f1031q.setText("");
        if (204 == maxError.getCode()) {
            AbstractC1078k7.m1195a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        AbstractC1078k7.m1195a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f1031q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f1030p.setControlState(AdControlButton.EnumC1124b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            m1270a(this.f1019e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f1016b.m1871a()) {
            m1270a(this.f1023i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.C1272w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f1019e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f1020f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f1021g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f1022h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f1024j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m1273a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        AbstractC1078k7.m1193a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p004ui.testmode.AdControlButton.InterfaceC1123a
    public void onClick(AdControlButton adControlButton) {
        if (this.f1015a.m2922t0().m493c()) {
            AbstractC1078k7.m1195a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f1018d.m1436j() != this.f1016b.m1876f()) {
            AbstractC1078k7.m1195a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatM1871a = this.f1016b.m1871a();
        AdControlButton.EnumC1124b enumC1124b = AdControlButton.EnumC1124b.LOAD;
        if (enumC1124b == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.EnumC1124b.LOADING);
            C1272w c1272w = this.f1032r;
            if (c1272w != null) {
                c1272w.m3580a();
                return;
            } else {
                m1273a(maxAdFormatM1871a);
                return;
            }
        }
        if (AdControlButton.EnumC1124b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatM1871a.isAdViewAd() && maxAdFormatM1871a != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(enumC1124b);
            }
            m1276b(maxAdFormatM1871a);
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f1018d.m1437k());
        this.f1028n = (ListView) findViewById(C1333R.id.listView);
        this.f1029o = findViewById(C1333R.id.ad_presenter_view);
        this.f1030p = (AdControlButton) findViewById(C1333R.id.ad_control_button);
        this.f1031q = (TextView) findViewById(C1333R.id.status_textview);
        this.f1028n.setAdapter((ListAdapter) this.f1018d);
        this.f1031q.setText(m1268a());
        this.f1031q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f1030p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f1029o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f1017c != null) {
            this.f1015a.m2922t0().m490a(this.f1027m);
        }
        MaxAdView maxAdView = this.f1019e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f1020f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f1021g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f1022h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f1024j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f1025k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f1024j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        AbstractC1078k7.m1193a("onUserRewarded", maxAd, this);
    }

    /* renamed from: b */
    private void m1275b() {
        String strM1873c = this.f1016b.m1873c();
        if (this.f1016b.m1871a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strM1873c, this.f1016b.m1871a());
            this.f1019e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f1019e.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1019e.setExtraParameter("disable_precache", C3401a.f9920g);
            this.f1019e.setExtraParameter("allow_pause_auto_refresh_immediately", C3401a.f9920g);
            this.f1019e.stopAutoRefresh();
            this.f1019e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f1016b.m1871a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strM1873c);
            this.f1020f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1020f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f1016b.m1871a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strM1873c);
            this.f1021g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1021g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f1016b.m1871a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strM1873c);
            this.f1022h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1022h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f1016b.m1871a()) {
            this.f1023i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(C1333R.layout.max_native_ad_template_1).setTitleTextViewId(C1333R.id.applovin_native_title_text_view).setAdvertiserTextViewId(C1333R.id.applovin_native_advertiser_text_view).setBodyTextViewId(C1333R.id.applovin_native_body_text_view).setCallToActionButtonId(C1333R.id.applovin_native_cta_button).setIconImageViewId(C1333R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(C1333R.id.applovin_native_options_view).setStarRatingContentViewGroupId(C1333R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(C1333R.id.applovin_native_media_content_view).build(), C1220k.m2824o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strM1873c);
            this.f1024j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", C3401a.f9920g);
            this.f1024j.setNativeAdListener(new a());
            this.f1024j.setRevenueListener(this);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m1272a(C1220k c1220k, C1130n c1130n, C1140o c1140o, C1053i2 c1053i2, C1143o2 c1143o2) {
        if (c1143o2 instanceof C1090m.b) {
            AbstractC1000d.m506a(this, MaxDebuggerAdUnitDetailActivity.class, c1220k.m2893e(), new o0O0O00(c1143o2, c1130n, c1140o, c1220k));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m1271a(C1143o2 c1143o2, C1130n c1130n, C1140o c1140o, C1220k c1220k, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1130n, c1140o, ((C1090m.b) c1143o2).m1441v(), c1220k);
    }

    @Override // com.applovin.impl.C1272w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f1019e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f1020f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f1021g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f1022h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f1024j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m1273a(maxAdFormat);
    }

    /* renamed from: a */
    private void m1273a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        C1029f8 c1029f8 = this.f1017c;
        sb.append(c1029f8 != null ? c1029f8.m762b().m2310a() : this.f1018d.m1436j().m1926c());
        C1240o.m3206g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.f1017c != null) {
            this.f1015a.m2922t0().m490a(this.f1017c.m762b().m2311b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f1019e.setPlacement("[Mediation Debugger Live Ad]");
            this.f1019e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f1016b.m1871a()) {
            this.f1020f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f1016b.m1871a()) {
            this.f1021g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f1016b.m1871a()) {
            this.f1022h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f1016b.m1871a()) {
            this.f1024j.setPlacement("[Mediation Debugger Live Ad]");
            this.f1024j.loadAd();
        } else {
            AbstractC1078k7.m1191a("Live ads currently unavailable for ad format", this);
        }
    }

    /* renamed from: a */
    private void m1270a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f1026l != null) {
            return;
        }
        DialogC1174r dialogC1174r = new DialogC1174r(viewGroup, size, this);
        this.f1026l = dialogC1174r;
        dialogC1174r.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.o000OOo
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f15766OooOo0O.m1269a(dialogInterface);
            }
        });
        this.f1026l.show();
    }

    /* renamed from: a */
    public /* synthetic */ void m1269a(DialogInterface dialogInterface) {
        this.f1026l = null;
    }

    /* renamed from: a */
    private String m1268a() {
        if (this.f1015a.m2922t0().m493c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f1018d.m1436j() != this.f1016b.m1876f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    /* renamed from: b */
    private void m1276b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        C1029f8 c1029f8 = this.f1017c;
        sb.append(c1029f8 != null ? c1029f8.m762b().m2310a() : this.f1018d.m1436j().m1926c());
        C1240o.m3206g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            m1270a(this.f1019e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f1016b.m1871a()) {
            this.f1020f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f1016b.m1871a()) {
            this.f1021g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f1016b.m1871a()) {
            this.f1022h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f1016b.m1871a()) {
            m1270a(this.f1023i, MaxAdFormat.MREC.getSize());
        }
    }
}
