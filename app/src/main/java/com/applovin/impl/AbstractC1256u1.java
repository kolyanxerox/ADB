package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C0972g;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* renamed from: com.applovin.impl.u1 */
/* loaded from: classes.dex */
abstract class AbstractC1256u1 {

    /* renamed from: a */
    final C1220k f2433a;

    /* renamed from: b */
    final Activity f2434b;

    /* renamed from: c */
    final AbstractC1207b f2435c;

    /* renamed from: d */
    final ViewGroup f2436d;

    /* renamed from: e */
    final FrameLayout.LayoutParams f2437e;

    public AbstractC1256u1(AbstractC1207b abstractC1207b, Activity activity, C1220k c1220k) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f2437e = layoutParams;
        this.f2435c = abstractC1207b;
        this.f2433a = c1220k;
        this.f2434b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f2436d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo93a(View view) {
        this.f2436d.removeView(view);
    }

    /* renamed from: a */
    public void mo95a(C0972g c0972g) {
        if (c0972g == null || c0972g.getParent() != null) {
            return;
        }
        m3390a(this.f2435c.m2622o(), (this.f2435c.m2535E0() ? 3 : 5) | 48, c0972g);
    }

    /* renamed from: a */
    public void m3390a(AbstractC1207b.d dVar, int i, C0972g c0972g) {
        c0972g.m291a(dVar.f2001a, dVar.f2005e, dVar.f2004d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c0972g.getLayoutParams());
        int i2 = dVar.f2003c;
        layoutParams.setMargins(i2, dVar.f2002b, i2, 0);
        layoutParams.gravity = i;
        this.f2436d.addView(c0972g, layoutParams);
    }
}
