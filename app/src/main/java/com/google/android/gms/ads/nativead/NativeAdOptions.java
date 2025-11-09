package com.google.android.gms.ads.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* loaded from: classes2.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;

    /* renamed from: OooO, reason: collision with root package name */
    public final int f16452OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f16453OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f16454OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f16455OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f16456OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f16457OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final VideoOptions f16458OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f16459OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f16460OooO0oo;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public VideoOptions f16465OooO0Oo;

        /* renamed from: OooO00o, reason: collision with root package name */
        public boolean f16462OooO00o = false;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public int f16463OooO0O0 = 0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public boolean f16464OooO0OO = false;

        /* renamed from: OooO0o0, reason: collision with root package name */
        public int f16467OooO0o0 = 1;

        /* renamed from: OooO0o, reason: collision with root package name */
        public boolean f16466OooO0o = false;

        /* renamed from: OooO0oO, reason: collision with root package name */
        public boolean f16468OooO0oO = false;

        /* renamed from: OooO0oo, reason: collision with root package name */
        public int f16469OooO0oo = 0;

        /* renamed from: OooO, reason: collision with root package name */
        public int f16461OooO = 1;

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        @NonNull
        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i, boolean z) {
            this.f16468OooO0oO = z;
            this.f16469OooO0oo = i;
            return this;
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f16467OooO0o0 = i;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.f16463OooO0O0 = i;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f16466OooO0o = z;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z) {
            this.f16464OooO0OO = z;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.f16462OooO00o = z;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions) {
            this.f16465OooO0Oo = videoOptions;
            return this;
        }

        @NonNull
        public final Builder zzi(int i) {
            this.f16461OooO = i;
            return this;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f16453OooO00o = builder.f16462OooO00o;
        this.f16454OooO0O0 = builder.f16463OooO0O0;
        this.f16455OooO0OO = builder.f16464OooO0OO;
        this.f16456OooO0Oo = builder.f16467OooO0o0;
        this.f16458OooO0o0 = builder.f16465OooO0Oo;
        this.f16457OooO0o = builder.f16466OooO0o;
        this.f16459OooO0oO = builder.f16468OooO0oO;
        this.f16460OooO0oo = builder.f16469OooO0oo;
        this.f16452OooO = builder.f16461OooO;
    }

    public int getAdChoicesPlacement() {
        return this.f16456OooO0Oo;
    }

    public int getMediaAspectRatio() {
        return this.f16454OooO0O0;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.f16458OooO0o0;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f16455OooO0OO;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f16453OooO00o;
    }

    public final int zza() {
        return this.f16460OooO0oo;
    }

    public final boolean zzb() {
        return this.f16459OooO0oO;
    }

    public final boolean zzc() {
        return this.f16457OooO0o;
    }

    public final int zzd() {
        return this.f16452OooO;
    }
}
