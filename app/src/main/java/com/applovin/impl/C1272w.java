package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.w */
/* loaded from: classes.dex */
public class C1272w implements DTBAdCallback {

    /* renamed from: a */
    private final MaxAdFormat f2983a;

    /* renamed from: b */
    private final a f2984b;

    /* renamed from: c */
    private DTBAdRequest f2985c;

    /* renamed from: com.applovin.impl.w$a */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C1272w(C1281x c1281x, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(c1281x.m3635a()), maxAdFormat, context, aVar);
    }

    /* renamed from: a */
    public void m3580a() {
        DTBAdRequest dTBAdRequest = this.f2985c;
        if (dTBAdRequest == null) {
            this.f2984b.onAdLoadFailed(null, this.f2983a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f2984b.onAdLoadFailed(adError, this.f2983a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f2984b.onAdResponseLoaded(dTBAdResponse, this.f2983a);
    }

    public C1272w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f2983a = maxAdFormat;
        this.f2984b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i] = (DTBAdSize) obj;
                }
            }
            if (AbstractC1078k7.m1158a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class<?> cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class<?> cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.f2985c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, cls2).newInstance(context.getApplicationContext(), cls2.getConstructor(cls).newInstance(cls.getField("MAX").get(null)));
            } else {
                this.f2985c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f2985c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
