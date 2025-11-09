package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a */
    private C0962a f134a;

    public AppLovinAdView(AppLovinAdSize appLovinAdSize) {
        this(appLovinAdSize, (String) null);
    }

    /* renamed from: a */
    private void m43a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            m42a(attributeSet, context);
            return;
        }
        C0962a c0962a = new C0962a();
        this.f134a = c0962a;
        c0962a.m207a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
    }

    public void destroy() {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m218b();
        }
    }

    public C0962a getController() {
        return this.f134a;
    }

    public AppLovinAdSize getSize() {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            return c0962a.m230k();
        }
        return null;
    }

    public String getZoneId() {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            return c0962a.m231l();
        }
        return null;
    }

    public void loadNextAd() {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m232u();
        } else {
            C1240o.m3208i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m199B();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m200C();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m217a(z);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m221c(i);
        }
    }

    public void pause() {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m201D();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m223c(appLovinAd);
        }
    }

    public void resume() {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m202F();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m212a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m213a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m214a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m208a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        C0962a c0962a = this.f134a;
        if (c0962a != null) {
            c0962a.m216a(str, obj);
        }
    }

    @Override // android.view.View
    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str) {
        super(C1220k.m2824o());
        m43a(appLovinAdSize, str, AppLovinSdk.getInstance(C1220k.m2824o()), C1220k.m2824o(), null);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43a(null, null, null, context, attributeSet);
    }

    /* renamed from: a */
    private void m42a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, i, iApplyDimension);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        m43a(appLovinAdSize, str, null, context, null);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        m43a(appLovinAdSize, str, appLovinSdk, context, null);
    }
}
