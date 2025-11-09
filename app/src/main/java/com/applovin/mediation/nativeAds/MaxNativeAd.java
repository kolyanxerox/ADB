package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* renamed from: a */
        private MaxAdFormat f3273a;

        /* renamed from: b */
        private String f3274b;

        /* renamed from: c */
        private String f3275c;

        /* renamed from: d */
        private String f3276d;

        /* renamed from: e */
        private String f3277e;

        /* renamed from: f */
        private MaxNativeAdImage f3278f;

        /* renamed from: g */
        private View f3279g;

        /* renamed from: h */
        private View f3280h;

        /* renamed from: i */
        private View f3281i;

        /* renamed from: j */
        private MaxNativeAdImage f3282j;

        /* renamed from: k */
        private float f3283k;

        /* renamed from: l */
        private Double f3284l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f3273a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f3275c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f3276d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f3277e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f3278f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f3279g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f3282j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.f3283k = f;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f3281i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f3280h = view;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.f3284l = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.f3274b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f3273a;
        this.title = builder.f3274b;
        this.advertiser = builder.f3275c;
        this.body = builder.f3276d;
        this.callToAction = builder.f3277e;
        this.icon = builder.f3278f;
        this.iconView = builder.f3279g;
        this.optionsView = builder.f3280h;
        this.mediaView = builder.f3281i;
        this.mainImage = builder.f3282j;
        this.mediaContentAspectRatio = builder.f3283k;
        Double d = builder.f3284l;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    public static class MaxNativeAdImage {

        /* renamed from: a */
        private Drawable f3285a;

        /* renamed from: b */
        private Uri f3286b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f3285a = drawable;
        }

        public Drawable getDrawable() {
            return this.f3285a;
        }

        public Uri getUri() {
            return this.f3286b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f3286b = uri;
        }
    }
}
