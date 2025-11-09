package com.ironsource.mediationsdk;

import androidx.recyclerview.widget.ItemTouchHelper;

/* loaded from: classes2.dex */
public class ISBannerSize {

    /* renamed from: a */
    private final int f9522a;

    /* renamed from: b */
    private final int f9523b;

    /* renamed from: c */
    private final String f9524c;
    public ISContainerParams containerParams;

    /* renamed from: d */
    private boolean f9525d;
    public static final ISBannerSize BANNER = C3395l.m10353a(C3395l.f9866a, 320, 50);
    public static final ISBannerSize LARGE = C3395l.m10353a(C3395l.f9867b, 320, 90);
    public static final ISBannerSize RECTANGLE = C3395l.m10353a(C3395l.f9868c, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: e */
    protected static final ISBannerSize f9521e = C3395l.m10352a();
    public static final ISBannerSize SMART = C3395l.m10353a(C3395l.f9870e, 0, 0);

    public ISBannerSize(int i, int i2) {
        this(C3395l.f9871f, i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return C3395l.m10367b(i);
    }

    public String getDescription() {
        return this.f9524c;
    }

    public int getHeight() {
        return this.f9523b;
    }

    public int getWidth() {
        return this.f9522a;
    }

    public boolean isAdaptive() {
        return this.f9525d;
    }

    public boolean isSmart() {
        return this.f9524c.equals(C3395l.f9870e);
    }

    public void setAdaptive(boolean z) {
        this.f9525d = z;
    }

    public void setContainerParams(ISContainerParams iSContainerParams) {
        if (C3395l.m10366a(iSContainerParams, this.f9522a, this.f9523b)) {
            this.containerParams = iSContainerParams;
        }
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f9524c = str;
        this.f9522a = i;
        this.f9523b = i2;
        this.containerParams = new ISContainerParams(i, i2);
    }
}
