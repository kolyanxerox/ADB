package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.AbstractC1265v1;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.m2 */
/* loaded from: classes.dex */
public class C1093m2 implements AppLovinInterstitialAdDialog {

    /* renamed from: a */
    protected final C1220k f1169a;

    /* renamed from: b */
    private final WeakReference f1170b;

    /* renamed from: c */
    private final Map f1171c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private volatile AppLovinAdLoadListener f1172d;

    /* renamed from: e */
    private volatile AppLovinAdDisplayListener f1173e;

    /* renamed from: f */
    private volatile AppLovinAdVideoPlaybackListener f1174f;

    /* renamed from: g */
    private volatile AppLovinAdClickListener f1175g;

    /* renamed from: h */
    private volatile AbstractC1207b f1176h;

    /* renamed from: com.applovin.impl.m2$a */
    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            C1093m2.this.m1463b(appLovinAd);
            C1093m2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            C1093m2.this.m1459b(i);
        }
    }

    public C1093m2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f1169a = appLovinSdk.m3943a();
        this.f1170b = new WeakReference(context);
    }

    /* renamed from: e */
    private Context m1464e() {
        return (Context) this.f1170b.get();
    }

    /* renamed from: g */
    private long m1465g() {
        String str = this.f1169a.m2912o0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f1169a.m2866a(C1268v4.f2684T1)).longValue());
        }
        return 0L;
    }

    /* renamed from: c */
    public AppLovinAdDisplayListener m1469c() {
        return this.f1173e;
    }

    /* renamed from: d */
    public AppLovinAdVideoPlaybackListener m1470d() {
        return this.f1174f;
    }

    /* renamed from: f */
    public AbstractC1207b m1471f() {
        return this.f1176h;
    }

    /* renamed from: h */
    public Map m1472h() {
        return this.f1171c;
    }

    /* renamed from: i */
    public boolean m1473i() {
        AbstractC1207b abstractC1207b = this.f1176h;
        if (abstractC1207b == null) {
            return false;
        }
        abstractC1207b.m2527A0();
        abstractC1207b.setHasShown(false);
        AppLovinSdkUtils.runOnUiThread(true, new OooO(13, this, abstractC1207b));
        return true;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1175g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1173e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1172d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1174f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f1171c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        m1456a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAd", mapM675a);
            this.f1169a.m2897g().m576d(C0993c2.f533p, mapM675a);
        }
        AppLovinAd appLovinAdM1165a = AbstractC1078k7.m1165a(appLovinAd, this.f1169a);
        Context contextM1464e = m1464e();
        String strM1444a = m1444a(appLovinAdM1165a, appLovinAd, contextM1464e);
        if (StringUtils.isValidString(strM1444a)) {
            m1457a("interstitialAdShowFailed", strM1444a, appLovinAd);
        } else {
            if (((Boolean) this.f1169a.m2866a(C1268v4.f2624L5)).booleanValue() && m1467a((AbstractC1207b) appLovinAdM1165a)) {
                return;
            }
            m1451a((AbstractC1207b) appLovinAdM1165a, contextM1464e);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    /* renamed from: b */
    public AppLovinAdClickListener m1468b() {
        return this.f1175g;
    }

    /* renamed from: b */
    public /* synthetic */ void m1461b(AbstractC1207b abstractC1207b) {
        this.f1169a.m2847O();
        if (C1240o.m3200a()) {
            this.f1169a.m2847O().m3211a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(abstractC1207b);
    }

    /* renamed from: a */
    public /* synthetic */ void m1448a(Lifecycle lifecycle, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        m1452a((AbstractC1207b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(lifecycle, this), activity);
    }

    /* renamed from: b */
    public static void m1462b(AbstractC1207b abstractC1207b, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        m1453a(abstractC1207b, appLovinAdDisplayListener, str, th, (AppLovinFullscreenActivity) null);
    }

    /* renamed from: b */
    public void m1446a(Context context) {
        Intent intent = new Intent(context, (Class<?>) (this.f1176h.m2566X0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f1169a.m2904j0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f1169a.m2893e().m437a() == null && ((Boolean) this.f1169a.m2866a(C1268v4.f2838m2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* renamed from: a */
    public boolean m1467a(AbstractC1207b abstractC1207b) {
        List listM1179a = AbstractC1078k7.m1179a(!abstractC1207b.mo1358O0(), abstractC1207b, this.f1169a, C1220k.m2824o());
        if (listM1179a.isEmpty()) {
            return false;
        }
        String str = "Missing ad resources: " + listM1179a;
        if (((Boolean) this.f1169a.m2866a(C1268v4.f2592H5)).booleanValue()) {
            C1240o.m3207h("InterstitialAdDialogWrapper", "Failing ad display due to missing resources: " + listM1179a);
            m1457a("missingCachedAdResources", str, abstractC1207b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", mapHashMap);
            this.f1169a.m2832E().m572a(C0993c2.f554z0, "missingCachedAdResources", mapHashMap);
            return true;
        }
        C1240o.m3207h("InterstitialAdDialogWrapper", "Streaming ad due to missing ad resources: " + listM1179a);
        abstractC1207b.mo1359Q0();
        HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("error_message", str);
        CollectionUtils.putStringIfValid("details", "Streaming ad", mapHashMap2);
        this.f1169a.m2832E().m572a(C0993c2.f554z0, "missingCachedAdResources", mapHashMap2);
        return false;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAdView", mapM675a);
            this.f1169a.m2897g().m576d(C0993c2.f533p, mapM675a);
        }
        if (viewGroup != null && lifecycle != null) {
            AppLovinAd appLovinAdM1165a = AbstractC1078k7.m1165a(appLovinAd, this.f1169a);
            Activity activityM2926v0 = this.f1169a.m2926v0();
            String strM1444a = m1444a(appLovinAdM1165a, appLovinAd, activityM2926v0);
            if (StringUtils.isValidString(strM1444a)) {
                m1457a("interstitialAdShowFailed", strM1444a, appLovinAd);
                return;
            } else {
                if (((Boolean) this.f1169a.m2866a(C1268v4.f2624L5)).booleanValue() && m1467a((AbstractC1207b) appLovinAdM1165a)) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new OooOo00(this, lifecycle, appLovinAdM1165a, viewGroup, activityM2926v0, 1));
                return;
            }
        }
        C1240o.m3207h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        m1457a("interstitialAdShowFailed", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object", appLovinAd);
    }

    /* renamed from: com.applovin.impl.m2$b */
    public class b implements AbstractC1265v1.g {

        /* renamed from: a */
        final /* synthetic */ Activity f1178a;

        /* renamed from: b */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f1179b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f1180c;

        public b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f1178a = activity;
            this.f1179b = appLovinFullscreenAdViewObserver;
            this.f1180c = viewGroup;
        }

        @Override // com.applovin.impl.AbstractC1265v1.g
        /* renamed from: a */
        public void mo56a(AbstractC1265v1 abstractC1265v1) {
            if (AbstractC1000d.m510d(this.f1178a)) {
                C1240o.m3207h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                C1093m2.m1462b(C1093m2.this.f1176h, C1093m2.this.f1173e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, this.f1179b);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", "Failed to show interstitial: attempting to show ad when parent activity is finishing", mapHashMap);
                C1093m2.this.f1169a.m2897g().m706a(C0993c2.f539s, C1093m2.this.f1176h, mapHashMap);
                return;
            }
            this.f1179b.setPresenter(abstractC1265v1);
            try {
                abstractC1265v1.mo3458a(this.f1180c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                C1240o.m3207h("InterstitialAdDialogWrapper", str);
                C1093m2.m1462b(C1093m2.this.f1176h, C1093m2.this.f1173e, str, th, this.f1179b);
                HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("source", "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str, mapHashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap2);
                C1093m2.this.f1169a.m2897g().m706a(C0993c2.f539s, C1093m2.this.f1176h, mapHashMap2);
            }
        }

        @Override // com.applovin.impl.AbstractC1265v1.g
        /* renamed from: a */
        public void mo57a(String str, Throwable th) {
            C1093m2.m1462b(C1093m2.this.f1176h, C1093m2.this.f1173e, str, th, this.f1179b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            C1093m2.this.f1169a.m2897g().m706a(C0993c2.f539s, C1093m2.this.f1176h, mapHashMap);
        }
    }

    /* renamed from: b */
    public void m1463b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new OooO(15, this, appLovinAd));
    }

    /* renamed from: b */
    public void m1459b(int i) {
        AppLovinSdkUtils.runOnUiThread(new oo000o(this, i, 1));
    }

    /* renamed from: a */
    public static void m1453a(AbstractC1207b abstractC1207b, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        C1240o.m3204c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof InterfaceC1073k2) {
            AbstractC1168q2.m2182a(appLovinAdDisplayListener, str);
        } else {
            AbstractC1168q2.m2212b(appLovinAdDisplayListener, abstractC1207b);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    /* renamed from: a */
    public void m1466a() {
        this.f1175g = null;
        this.f1172d = null;
        this.f1174f = null;
        this.f1173e = null;
    }

    /* renamed from: a */
    private void m1456a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1169a.m2905k().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* renamed from: a */
    private String m1444a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            C1240o.m3207h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            C1240o.m3207h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f1169a.m2866a(C1268v4.f2580G1)).booleanValue()) {
            return null;
        }
        C1240o.m3207h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    /* renamed from: a */
    private void m1451a(AbstractC1207b abstractC1207b, Context context) {
        this.f1169a.m2895f().m2478a(abstractC1207b);
        this.f1176h = abstractC1207b;
        long jM1465g = m1465g();
        this.f1169a.m2847O();
        if (C1240o.m3200a()) {
            this.f1169a.m2847O().m3211a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jM1465g + "ms...");
        }
        if (((Boolean) this.f1169a.m2866a(C1268v4.f2707W0)).booleanValue()) {
            this.f1169a.m2899h().m2696a(this.f1176h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new OooO(14, this, context), jM1465g);
    }

    /* renamed from: a */
    private void m1452a(AbstractC1207b abstractC1207b, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Activity activity) {
        this.f1169a.m2895f().m2478a(abstractC1207b);
        this.f1176h = abstractC1207b;
        long jM1465g = m1465g();
        this.f1169a.m2847O();
        if (C1240o.m3200a()) {
            this.f1169a.m2847O().m3211a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jM1465g + "ms...");
        }
        if (((Boolean) this.f1169a.m2866a(C1268v4.f2707W0)).booleanValue()) {
            this.f1169a.m2899h().m2696a(this.f1176h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new OooOo0O.OooO0O0(this, viewGroup, activity, appLovinFullscreenAdViewObserver, 4), jM1465g);
    }

    /* renamed from: a */
    public /* synthetic */ void m1447a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f1169a.m2847O();
        if (C1240o.m3200a()) {
            this.f1169a.m2847O().m3211a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        AbstractC1265v1.m3431a(this.f1176h, this.f1175g, this.f1173e, this.f1174f, this.f1171c, this.f1169a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    /* renamed from: a */
    private void m1457a(String str, String str2, AppLovinAd appLovinAd) {
        if (this.f1173e != null) {
            if (this.f1173e instanceof InterfaceC1073k2) {
                ((InterfaceC1073k2) this.f1173e).onAdDisplayFailed(str2);
            } else {
                this.f1173e.adHidden(appLovinAd);
            }
        }
        Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", str, mapM675a);
        CollectionUtils.putStringIfValid("error_message", str2, mapM675a);
        this.f1169a.m2897g().m576d(C0993c2.f539s, mapM675a);
    }

    /* renamed from: a */
    public /* synthetic */ void m1455a(AppLovinAd appLovinAd) {
        if (this.f1172d != null) {
            this.f1172d.adReceived(appLovinAd);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m1445a(int i) {
        if (this.f1172d != null) {
            this.f1172d.failedToReceiveAd(i);
        }
    }
}
