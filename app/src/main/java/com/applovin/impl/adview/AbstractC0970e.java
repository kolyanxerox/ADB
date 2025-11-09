package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.applovin.impl.adview.e */
/* loaded from: classes.dex */
public abstract class AbstractC0970e extends View {

    /* renamed from: a */
    protected float f297a;

    /* renamed from: b */
    protected final Context f298b;

    /* renamed from: com.applovin.impl.adview.e$a */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* renamed from: a */
        private final int f304a;

        a(int i) {
            this.f304a = i;
        }

        /* renamed from: b */
        public int m277b() {
            return this.f304a;
        }
    }

    public AbstractC0970e(Context context) {
        super(context);
        this.f297a = 1.0f;
        this.f298b = context;
    }

    /* renamed from: a */
    public void mo275a(int i) {
        setViewScale(i / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f297a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f) {
        this.f297a = f;
    }

    /* renamed from: a */
    public static AbstractC0970e m274a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new C0973h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new C0974i(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new C0975j(context);
        }
        return new C0979n(context);
    }
}
