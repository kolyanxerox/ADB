package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.AbstractC0970e;

/* renamed from: com.applovin.impl.adview.g */
/* loaded from: classes.dex */
public class C0972g extends FrameLayout {

    /* renamed from: a */
    private AbstractC0970e f313a;

    /* renamed from: b */
    private int f314b;

    public C0972g(AbstractC0970e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        AbstractC0970e abstractC0970eM274a = AbstractC0970e.m274a(aVar, activity);
        this.f313a = abstractC0970eM274a;
        addView(abstractC0970eM274a);
    }

    /* renamed from: a */
    public void m292a(AbstractC0970e.a aVar) {
        if (aVar == null || aVar == this.f313a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f313a.getLayoutParams();
        removeView(this.f313a);
        AbstractC0970e abstractC0970eM274a = AbstractC0970e.m274a(aVar, getContext());
        this.f313a = abstractC0970eM274a;
        addView(abstractC0970eM274a);
        this.f313a.setLayoutParams(layoutParams);
        this.f313a.mo275a(this.f314b);
    }

    /* renamed from: a */
    public void m291a(int i, int i2, int i3, int i4) {
        this.f314b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f313a.setLayoutParams(layoutParams2);
        this.f313a.mo275a(i);
    }
}
