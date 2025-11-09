package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.applovin.impl.adview.C0972g;
import com.applovin.impl.adview.C0976k;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* renamed from: com.applovin.impl.a2 */
/* loaded from: classes.dex */
public class C0955a2 extends AbstractC1256u1 {
    public C0955a2(AbstractC1207b abstractC1207b, Activity activity, C1220k c1220k) {
        super(abstractC1207b, activity, c1220k);
    }

    @Override // com.applovin.impl.AbstractC1256u1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo95a(C0972g c0972g) {
        super.mo95a(c0972g);
    }

    @Override // com.applovin.impl.AbstractC1256u1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo93a(View view) {
        super.mo93a(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m94a(android.widget.ImageView r18, com.applovin.impl.adview.C0972g r19, com.applovin.impl.adview.C0977l r20, com.applovin.impl.C0952a r21, android.widget.ProgressBar r22, com.applovin.impl.C1051i0 r23, android.view.View r24, android.view.View r25, com.applovin.adview.AppLovinAdView r26, com.applovin.impl.adview.C0976k r27, android.widget.ImageView r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C0955a2.m94a(android.widget.ImageView, com.applovin.impl.adview.g, com.applovin.impl.adview.l, com.applovin.impl.a, android.widget.ProgressBar, com.applovin.impl.i0, android.view.View, android.view.View, com.applovin.adview.AppLovinAdView, com.applovin.impl.adview.k, android.widget.ImageView, android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public void m96a(C0972g c0972g, C0976k c0976k, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        AbstractC1183s.m2358a(this.f2436d, view);
        if (c0972g != null) {
            m3390a(this.f2435c.m2622o(), (this.f2435c.m2535E0() ? 3 : 5) | 48, c0972g);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f2433a.m2866a(C1268v4.f2854o2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f2433a.m2866a(C1268v4.f2862p2)).intValue());
            this.f2436d.addView(progressBar, layoutParams);
        }
        if (c0976k != null) {
            this.f2436d.addView(c0976k, this.f2437e);
        }
    }
}
