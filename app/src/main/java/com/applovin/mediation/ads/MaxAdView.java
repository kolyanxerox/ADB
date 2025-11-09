package com.applovin.mediation.ads;

import OooO0oO.OooOo;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC1183s;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a */
    private MaxAdViewImpl f3263a;

    /* renamed from: b */
    private View f3264b;

    /* renamed from: c */
    private int f3265c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    /* renamed from: a */
    private void m3911a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i, Context context) {
        View view = new View(context.getApplicationContext());
        this.f3264b = view;
        view.setBackgroundColor(0);
        addView(this.f3264b);
        this.f3264b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f3265c = getVisibility();
        this.f3263a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f3264b, context);
        setGravity(i);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f3263a.logApiCall("destroy()");
        this.f3263a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f3263a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f3263a.getAdUnitId();
    }

    public String getPlacement() {
        this.f3263a.logApiCall("getPlacement()");
        return this.f3263a.getPlacement();
    }

    public void loadAd() {
        this.f3263a.logApiCall("loadAd()");
        this.f3263a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (isInEditMode()) {
            return;
        }
        this.f3263a.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.f3263a != null && AbstractC0989b8.m428a(this.f3265c, i)) {
            this.f3263a.onWindowVisibilityChanged(i);
        }
        this.f3265c = i;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f3263a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f3263a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.f3263a.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.f3264b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f3263a.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl = this.f3263a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i);
        }
        View view = this.f3264b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(String str) {
        this.f3263a.logApiCall("setCustomData(value=" + str + ")");
        this.f3263a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f3263a.logApiCall(OooOo.OooOO0o("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f3263a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f3263a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f3263a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f3263a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f3263a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f3263a.logApiCall("setPlacement(placement=" + str + ")");
        this.f3263a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f3263a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f3263a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f3263a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f3263a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f3263a.logApiCall("startAutoRefresh()");
        this.f3263a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f3263a.logApiCall("stopAutoRefresh()");
        this.f3263a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f3263a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, AbstractC1183s.m2355a(C1220k.m2824o()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration) {
        super(C1220k.m2824o());
        AbstractC1118a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        m3911a(str, maxAdFormat, maxAdViewConfiguration, 49, C1220k.m2824o());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        MaxAdFormat maxAdFormatM2355a;
        super(context, attributeSet, i);
        String strM2357a = AbstractC1183s.m2357a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strM2357a2 = AbstractC1183s.m2357a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strM2357a2)) {
            maxAdFormatM2355a = MaxAdFormat.formatFromString(strM2357a2);
        } else {
            maxAdFormatM2355a = AbstractC1183s.m2355a(context);
        }
        MaxAdFormat maxAdFormat = maxAdFormatM2355a;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strM2357a != null) {
            if (!TextUtils.isEmpty(strM2357a)) {
                if (isInEditMode()) {
                    m3910a(context);
                    return;
                } else {
                    m3911a(strM2357a, maxAdFormat, null, attributeIntValue, context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    /* renamed from: a */
    private void m3910a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, AbstractC1183s.m2355a(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        AbstractC1118a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        m3911a(str, maxAdFormat, null, 49, context);
    }
}
