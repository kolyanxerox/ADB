package com.google.android.gms.ads.formats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

@Deprecated
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

    @Deprecated
    public static final int ORIENTATION_ANY = 0;

    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;

    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f15932OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f15933OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f15934OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f15935OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final VideoOptions f15936OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f15937OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f15938OooO0oO;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {

        /* renamed from: OooO0o0, reason: collision with root package name */
        public VideoOptions f15944OooO0o0;

        /* renamed from: OooO00o, reason: collision with root package name */
        public boolean f15939OooO00o = false;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public int f15940OooO0O0 = -1;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public int f15941OooO0OO = 0;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f15942OooO0Oo = false;

        /* renamed from: OooO0o, reason: collision with root package name */
        public int f15943OooO0o = 1;

        /* renamed from: OooO0oO, reason: collision with root package name */
        public boolean f15945OooO0oO = false;

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f15943OooO0o = i;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setImageOrientation(int i) {
            this.f15940OooO0O0 = i;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.f15941OooO0OO = i;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f15945OooO0oO = z;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z) {
            this.f15942OooO0Oo = z;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.f15939OooO00o = z;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions) {
            this.f15944OooO0o0 = videoOptions;
            return this;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f15932OooO00o = builder.f15939OooO00o;
        this.f15933OooO0O0 = builder.f15940OooO0O0;
        this.f15934OooO0OO = builder.f15941OooO0OO;
        this.f15935OooO0Oo = builder.f15942OooO0Oo;
        this.f15937OooO0o0 = builder.f15943OooO0o;
        this.f15936OooO0o = builder.f15944OooO0o0;
        this.f15938OooO0oO = builder.f15945OooO0oO;
    }

    public int getAdChoicesPlacement() {
        return this.f15937OooO0o0;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.f15933OooO0O0;
    }

    public int getMediaAspectRatio() {
        return this.f15934OooO0OO;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.f15936OooO0o;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f15935OooO0Oo;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f15932OooO00o;
    }

    public final boolean zza() {
        return this.f15938OooO0oO;
    }
}
