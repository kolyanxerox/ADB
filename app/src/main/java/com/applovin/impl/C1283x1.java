package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C0972g;
import com.applovin.impl.adview.C0976k;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* renamed from: com.applovin.impl.x1 */
/* loaded from: classes.dex */
public class C1283x1 extends AbstractC1256u1 {
    public C1283x1(AbstractC1207b abstractC1207b, Activity activity, C1220k c1220k) {
        super(abstractC1207b, activity, c1220k);
    }

    @Override // com.applovin.impl.AbstractC1256u1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo95a(C0972g c0972g) {
        super.mo95a(c0972g);
    }

    /* renamed from: a */
    public void m3639a(C0972g c0972g, C0976k c0976k, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f2436d.addView(appLovinAdView);
        if (c0972g != null) {
            m3390a(this.f2435c.m2622o(), (this.f2435c.m2535E0() ? 3 : 5) | 48, c0972g);
        }
        if (c0976k != null) {
            this.f2436d.addView(c0976k, this.f2437e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f2436d);
        } else {
            this.f2434b.setContentView(this.f2436d);
        }
    }
}
