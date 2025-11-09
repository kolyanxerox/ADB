package com.applovin.mediation.ads;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.OooO00o;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.InterfaceC1110a {

    /* renamed from: b */
    private static WeakReference f3267b = new WeakReference(null);

    /* renamed from: a */
    private final MaxFullscreenAdImpl f3268a;

    public MaxInterstitialAd(String str) {
        this(str, C1220k.m2824o());
    }

    public void destroy() {
        this.f3268a.logApiCall("destroy()");
        this.f3268a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.InterfaceC1110a
    public Activity getActivity() {
        this.f3268a.logApiCall("getActivity()");
        return (Activity) f3267b.get();
    }

    public String getAdUnitId() {
        return this.f3268a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f3268a.isReady();
        this.f3268a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f3268a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f3268a.logApiCall("loadAd()");
        this.f3268a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f3268a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f3268a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f3268a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f3268a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f3268a.logApiCall(OooOo.OooOO0o("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f3268a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f3268a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f3268a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f3268a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f3268a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f3268a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f3268a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f3268a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f3268a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f3268a;
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1118a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f3267b = new WeakReference((Activity) context);
                }
                this.f3268a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.m3943a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3268a;
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbOooOOo0.append(activity);
        sbOooOOo0.append(")");
        maxFullscreenAdImpl.logApiCall(sbOooOOo0.toString());
        AbstractC1078k7.m1217b(str2, "MaxInterstitialAd");
        this.f3268a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd((String) null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3268a;
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbOooOOo0.append(viewGroup);
        sbOooOOo0.append(", lifecycle=");
        sbOooOOo0.append(lifecycle);
        sbOooOOo0.append(", activity=");
        sbOooOOo0.append(activity);
        sbOooOOo0.append(")");
        maxFullscreenAdImpl.logApiCall(sbOooOOo0.toString());
        this.f3268a.showAd(str, str2, viewGroup, lifecycle, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f3268a.logApiCall(OooOo.OooOO0o("showAd(placement=", str, ", customData=", str2, ")"));
        AbstractC1078k7.m1217b(str2, "MaxInterstitialAd");
        this.f3268a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd((String) null, viewGroup, lifecycle);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(str, (String) null, viewGroup, lifecycle);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3268a;
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbOooOOo0.append(viewGroup);
        sbOooOOo0.append(", lifecycle=");
        sbOooOOo0.append(lifecycle);
        sbOooOOo0.append(")");
        maxFullscreenAdImpl.logApiCall(sbOooOOo0.toString());
        this.f3268a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }
}
