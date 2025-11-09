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
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.InterfaceC1110a {

    /* renamed from: b */
    private static final Map f3269b = new HashMap();

    /* renamed from: c */
    private static final Object f3270c = new Object();

    /* renamed from: d */
    private static WeakReference f3271d = new WeakReference(null);

    /* renamed from: a */
    private final MaxRewardedAdImpl f3272a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f3272a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.m3943a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, C1220k.m2824o());
    }

    public void destroy() {
        this.f3272a.logApiCall("destroy()");
        synchronized (f3270c) {
            f3269b.remove(this.f3272a.getAdUnitId());
        }
        this.f3272a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.InterfaceC1110a
    public Activity getActivity() {
        this.f3272a.logApiCall("getActivity()");
        return (Activity) f3271d.get();
    }

    public String getAdUnitId() {
        return this.f3272a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f3272a.isReady();
        this.f3272a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f3272a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f3272a.logApiCall("loadAd()");
        this.f3272a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f3272a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f3272a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f3272a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f3272a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f3272a.logApiCall(OooOo.OooOO0o("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f3272a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f3272a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f3272a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f3272a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f3272a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f3272a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f3272a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f3272a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f3272a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f3272a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1118a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f3271d = new WeakReference((Activity) context);
                }
                synchronized (f3270c) {
                    try {
                        Map map = f3269b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f3272a;
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbOooOOo0.append(activity);
        sbOooOOo0.append(")");
        maxRewardedAdImpl.logApiCall(sbOooOOo0.toString());
        AbstractC1078k7.m1217b(str2, "MaxRewardedAd");
        this.f3272a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd((String) null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f3272a;
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbOooOOo0.append(viewGroup);
        sbOooOOo0.append(", lifecycle=");
        sbOooOOo0.append(lifecycle);
        sbOooOOo0.append(", activity=");
        sbOooOOo0.append(activity);
        sbOooOOo0.append(")");
        maxRewardedAdImpl.logApiCall(sbOooOOo0.toString());
        this.f3272a.showAd(str, str2, viewGroup, lifecycle, activity);
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
        this.f3272a.logApiCall(OooOo.OooOO0o("showAd(placement=", str, ", customData=", str2, ")"));
        AbstractC1078k7.m1217b(str2, "MaxRewardedAd");
        this.f3272a.showAd(str, str2, getActivity());
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
        MaxRewardedAdImpl maxRewardedAdImpl = this.f3272a;
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbOooOOo0.append(viewGroup);
        sbOooOOo0.append(", lifecycle=");
        sbOooOOo0.append(lifecycle);
        sbOooOOo0.append(")");
        maxRewardedAdImpl.logApiCall(sbOooOOo0.toString());
        this.f3272a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }
}
