package com.applovin.impl.mediation.nativeAds;

import android.view.View;
import com.applovin.impl.mediation.ads.C1119b;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdImpl {
    private C1119b adViewTracker;
    private List<View> clickableViews;

    public C1119b getAdViewTracker() {
        return this.adViewTracker;
    }

    public List<View> getClickableViews() {
        return this.clickableViews;
    }

    public void setAdViewTracker(C1119b c1119b) {
        this.adViewTracker = c1119b;
    }

    public void setClickableViews(List<View> list) {
        this.clickableViews = list;
    }
}
