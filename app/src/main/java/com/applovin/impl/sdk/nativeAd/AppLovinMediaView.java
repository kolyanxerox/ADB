package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.C1333R;

/* loaded from: classes.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final C1240o logger;
    protected final C1220k sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, C1220k c1220k, Context context) {
        super(context);
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.sdk = c1220k;
        this.logger = c1220k.m2847O();
        LayoutInflater.from(context).inflate(C1333R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        C1088l7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri uriMo1370v0 = vastAd != null ? vastAd.mo1370v0() : null;
        if (mainImageUri == null && uriMo1370v0 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) c1220k.m2866a(C1268v4.f2557D2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(c1220k, C1268v4.f2812j0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView = (ImageView) findViewById(C1333R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }
}
