package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.u2 */
/* loaded from: classes.dex */
public class C1257u2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a */
    private final int f2438a;

    /* renamed from: b */
    private final MaxNativeAdLoader f2439b;

    /* renamed from: c */
    private final Queue f2440c = new LinkedList();

    /* renamed from: d */
    private boolean f2441d = false;

    /* renamed from: e */
    private final Object f2442e = new Object();

    /* renamed from: f */
    private a f2443f;

    /* renamed from: com.applovin.impl.u2$a */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public C1257u2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f2438a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f2443f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f2439b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, EnumC1050i.NATIVE_AD_PLACER);
    }

    /* renamed from: a */
    public void m3392a(MaxAd maxAd) {
        this.f2439b.destroy(maxAd);
    }

    /* renamed from: b */
    public MaxAd m3394b() {
        MaxAd maxAd;
        synchronized (this.f2442e) {
            maxAd = null;
            while (!this.f2440c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f2440c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            m3397e();
        }
        return maxAd;
    }

    /* renamed from: c */
    public void m3395c() {
        this.f2443f = null;
        m3391a();
        this.f2439b.destroy();
    }

    /* renamed from: d */
    public boolean m3396d() {
        boolean z;
        synchronized (this.f2442e) {
            z = !this.f2440c.isEmpty();
        }
        return z;
    }

    /* renamed from: e */
    public void m3397e() {
        synchronized (this.f2442e) {
            try {
                if (!this.f2441d && this.f2440c.size() < this.f2438a) {
                    this.f2441d = true;
                    this.f2439b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f2443f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f2443f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f2443f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f2442e) {
            this.f2440c.add(maxAd);
            this.f2441d = false;
            m3397e();
        }
        a aVar = this.f2443f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    /* renamed from: a */
    public void m3391a() {
        synchronized (this.f2442e) {
            try {
                Iterator it = this.f2440c.iterator();
                while (it.hasNext()) {
                    m3392a((MaxAd) it.next());
                }
                this.f2440c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public boolean m3393a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f2439b.render(maxNativeAdView, maxAd);
    }
}
