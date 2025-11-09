package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.C0956a3;
import com.applovin.impl.C0999c8;
import com.applovin.impl.C1009d8;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;

/* renamed from: com.applovin.impl.mediation.ads.b */
/* loaded from: classes.dex */
public class C1119b implements C1009d8.a {

    /* renamed from: a */
    private final C1220k f1343a;

    /* renamed from: b */
    private final C0956a3 f1344b;

    /* renamed from: c */
    private final C1009d8 f1345c;

    /* renamed from: d */
    private final C0999c8 f1346d;

    /* renamed from: e */
    private final AbstractC1118a.a f1347e;

    public C1119b(C0956a3 c0956a3, ViewGroup viewGroup, AbstractC1118a.a aVar, C1220k c1220k) {
        this.f1343a = c1220k;
        this.f1344b = c0956a3;
        this.f1347e = aVar;
        this.f1346d = new C0999c8(viewGroup, c1220k);
        C1009d8 c1009d8 = new C1009d8(viewGroup, c1220k, this);
        this.f1345c = c1009d8;
        c1009d8.m652a(c0956a3);
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    /* renamed from: a */
    public void m1676a() {
        this.f1345c.m653b();
    }

    /* renamed from: b */
    public C0956a3 m1677b() {
        return this.f1344b;
    }

    /* renamed from: c */
    public void m1678c() {
        this.f1343a.m2847O();
        if (C1240o.m3200a()) {
            this.f1343a.m2847O().m3211a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f1344b.m103o0().compareAndSet(false, true)) {
            this.f1343a.m2847O();
            if (C1240o.m3200a()) {
                this.f1343a.m2847O().m3211a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f1344b.getNativeAd().isExpired()) {
                C1240o.m3207h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f1343a.m2895f().m2478a(this.f1344b);
            }
            this.f1343a.m2860X().processRawAdImpression(this.f1344b, this.f1347e);
        }
    }

    @Override // com.applovin.impl.C1009d8.a
    public void onLogVisibilityImpression() {
        m1675a(this.f1346d.m495a(this.f1344b));
    }

    /* renamed from: a */
    private void m1675a(long j) {
        if (this.f1344b.m104p0().compareAndSet(false, true)) {
            this.f1343a.m2847O();
            if (C1240o.m3200a()) {
                this.f1343a.m2847O().m3211a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f1343a.m2860X().processViewabilityAdImpressionPostback(this.f1344b, j, this.f1347e);
        }
    }
}
