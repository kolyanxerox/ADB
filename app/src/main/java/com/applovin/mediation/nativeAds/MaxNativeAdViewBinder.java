package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a */
        private final View f3304a;

        /* renamed from: b */
        private final int f3305b;

        /* renamed from: c */
        private int f3306c;

        /* renamed from: d */
        private int f3307d;

        /* renamed from: e */
        private int f3308e;

        /* renamed from: f */
        private int f3309f;

        /* renamed from: g */
        private int f3310g;

        /* renamed from: h */
        private int f3311h;

        /* renamed from: i */
        private int f3312i;

        /* renamed from: j */
        private int f3313j;

        /* renamed from: k */
        private int f3314k;

        /* renamed from: l */
        private int f3315l;

        /* renamed from: m */
        private int f3316m;

        /* renamed from: n */
        private String f3317n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f3304a, this.f3305b, this.f3306c, this.f3307d, this.f3308e, this.f3309f, this.f3310g, this.f3313j, this.f3311h, this.f3312i, this.f3314k, this.f3315l, this.f3316m, this.f3317n);
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.f3307d = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.f3308e = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.f3316m = i;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i) {
            this.f3310g = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.f3309f = i;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i) {
            this.f3315l = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.f3314k = i;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i) {
            this.f3312i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.f3311h = i;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i) {
            this.f3313j = i;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f3317n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.f3306c = i;
            return this;
        }

        public Builder(int i) {
            this(i, null);
        }

        private Builder(int i, View view) {
            this.f3306c = -1;
            this.f3307d = -1;
            this.f3308e = -1;
            this.f3309f = -1;
            this.f3310g = -1;
            this.f3311h = -1;
            this.f3312i = -1;
            this.f3313j = -1;
            this.f3314k = -1;
            this.f3315l = -1;
            this.f3316m = -1;
            this.f3305b = i;
            this.f3304a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.starRatingContentViewGroupId = i7;
        this.optionsContentViewGroupId = i8;
        this.optionsContentFrameLayoutId = i9;
        this.mediaContentViewGroupId = i10;
        this.mediaContentFrameLayoutId = i11;
        this.callToActionButtonId = i12;
        this.templateType = str;
    }
}
