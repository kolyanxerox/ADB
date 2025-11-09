package com.applovin.mediation.nativeAds.adPlacer;

import OooOo0o.o000oOoO;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.OooO00o;
import com.applovin.impl.C0956a3;
import com.applovin.impl.C1248t2;
import com.applovin.impl.C1257u2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MaxAdPlacer implements C1257u2.a {

    /* renamed from: a */
    private AppLovinSdkUtils.Size f3318a;

    /* renamed from: b */
    private MaxNativeAdViewBinder f3319b;

    /* renamed from: c */
    private final C1248t2 f3320c;

    /* renamed from: d */
    private final C1257u2 f3321d;

    /* renamed from: e */
    private Listener f3322e;
    protected final C1240o logger;
    protected final C1220k sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, C1220k.m2824o());
    }

    /* renamed from: a */
    public /* synthetic */ void m3934a(int i, Collection collection) {
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Clearing trailing ads after position " + i);
        }
        this.f3320c.m3301a(collection);
    }

    /* renamed from: b */
    public /* synthetic */ void m3936b() {
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f3320c.m3299a();
        this.f3321d.m3391a();
    }

    public void clearAds() {
        m3935a(this.f3320c.m3303b(), new o000oOoO(this, 15));
    }

    public Collection<Integer> clearTrailingAds(int i) {
        Collection<Integer> collectionM3309e = this.f3320c.m3309e(i);
        if (!collectionM3309e.isEmpty()) {
            m3935a(collectionM3309e, new OooO00o(i, this, 1, collectionM3309e));
        }
        return collectionM3309e;
    }

    public void destroy() {
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f3321d.m3395c();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return -System.identityHashCode(this.f3320c.m3298a(i));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i) {
        if (isFilledPosition(i)) {
            boolean z = this.f3318a != AppLovinSdkUtils.Size.ZERO;
            C0956a3 c0956a3 = (C0956a3) this.f3320c.m3298a(i);
            if (z) {
                return this.f3318a;
            }
            if (c0956a3.m101m0() != null) {
                View mainView = c0956a3.m101m0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.f3320c.m3302b(i);
    }

    public int getAdjustedPosition(int i) {
        return this.f3320c.m3306c(i);
    }

    public int getOriginalPosition(int i) {
        return this.f3320c.m3308d(i);
    }

    public void insertItem(int i) {
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.f3320c.m3310f(i);
    }

    public boolean isAdPosition(int i) {
        return this.f3320c.m3311g(i);
    }

    public boolean isFilledPosition(int i) {
        return this.f3320c.m3312h(i);
    }

    public void loadAds() {
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Loading ads");
        }
        this.f3321d.m3397e();
    }

    public void moveItem(int i, int i2) {
        this.f3320c.m3304b(i, i2);
    }

    @Override // com.applovin.impl.C1257u2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f3322e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.C1257u2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f3322e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.C1257u2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (C1240o.m3200a()) {
            this.logger.m3214b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.C1257u2.a
    public void onNativeAdLoaded() {
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Native ad enqueued");
        }
        m3932a();
    }

    public void removeItem(int i) {
        m3935a(isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.EMPTY_LIST, new androidx.core.content.res.OooO00o(this, i, 3));
    }

    public void renderAd(int i, ViewGroup viewGroup) {
        MaxAd maxAdM3298a = this.f3320c.m3298a(i);
        if (maxAdM3298a == null) {
            if (C1240o.m3200a()) {
                this.logger.m3211a("MaxAdPlacer", "An ad is not available for position: " + i);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewM101m0 = ((C0956a3) maxAdM3298a).m101m0();
        if (maxNativeAdViewM101m0 == null) {
            if (this.f3319b == null) {
                if (C1240o.m3200a()) {
                    this.logger.m3214b("MaxAdPlacer", "Unable to render ad at position: " + i + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewM101m0 = new MaxNativeAdView(this.f3319b, viewGroup.getContext());
            if (this.f3321d.m3393a(maxNativeAdViewM101m0, maxAdM3298a)) {
                if (C1240o.m3200a()) {
                    this.logger.m3211a("MaxAdPlacer", "Rendered ad at position: " + i);
                }
            } else if (C1240o.m3200a()) {
                this.logger.m3214b("MaxAdPlacer", "Unable to render ad at position: " + i);
            }
        } else if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Using pre-rendered ad at position: " + i);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewM101m0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewM101m0.getParent()).removeView(maxNativeAdViewM101m0);
        }
        viewGroup.addView(maxNativeAdViewM101m0, -1, -1);
    }

    public void setAdSize(int i, int i2) {
        this.f3318a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(Listener listener) {
        this.f3322e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f3319b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.f3320c.m3307c(i, i2);
        if (i == -1 || i2 == -1) {
            return;
        }
        m3932a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f3318a = AppLovinSdkUtils.Size.ZERO;
        C1220k c1220kM3943a = appLovinSdk.m3943a();
        this.sdk = c1220kM3943a;
        C1240o c1240oM2847O = c1220kM3943a.m2847O();
        this.logger = c1240oM2847O;
        this.f3320c = new C1248t2(maxAdPlacerSettings);
        this.f3321d = new C1257u2(maxAdPlacerSettings, context, this);
        if (C1240o.m3200a()) {
            c1240oM2847O.m3211a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m3933a(int i) {
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Removing item at position: " + i);
        }
        this.f3320c.m3313i(i);
    }

    /* renamed from: a */
    private void m3932a() {
        int iM3305c;
        while (this.f3321d.m3396d() && (iM3305c = this.f3320c.m3305c()) != -1) {
            if (C1240o.m3200a()) {
                this.logger.m3211a("MaxAdPlacer", "Placing ad at position: " + iM3305c);
            }
            this.f3320c.m3300a(this.f3321d.m3394b(), iM3305c);
            Listener listener = this.f3322e;
            if (listener != null) {
                listener.onAdLoaded(iM3305c);
            }
        }
    }

    /* renamed from: a */
    private void m3935a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f3321d.m3392a(this.f3320c.m3298a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f3322e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f3322e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
