package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes2.dex */
public class PreloadConfiguration {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f16651OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AdFormat f16652OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final AdRequest f16653OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f16654OooO0Oo;

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final String f16655OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final AdFormat f16656OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public AdRequest f16657OooO0OO = new AdRequest.Builder().build();

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public int f16658OooO0Oo;

        public Builder(@NonNull String str, @NonNull AdFormat adFormat) {
            this.f16655OooO00o = str;
            this.f16656OooO0O0 = adFormat;
        }

        @NonNull
        public PreloadConfiguration build() {
            return new PreloadConfiguration(this);
        }

        @NonNull
        public Builder setAdRequest(@NonNull AdRequest adRequest) {
            this.f16657OooO0OO = adRequest;
            return this;
        }

        @NonNull
        public Builder setBufferSize(int i) {
            this.f16658OooO0Oo = i;
            return this;
        }
    }

    public /* synthetic */ PreloadConfiguration(Builder builder) {
        this.f16651OooO00o = builder.f16655OooO00o;
        this.f16652OooO0O0 = builder.f16656OooO0O0;
        this.f16653OooO0OO = builder.f16657OooO0OO;
        this.f16654OooO0Oo = builder.f16658OooO0Oo;
    }

    @NonNull
    public AdFormat getAdFormat() {
        return this.f16652OooO0O0;
    }

    @NonNull
    public AdRequest getAdRequest() {
        return this.f16653OooO0OO;
    }

    @NonNull
    public String getAdUnitId() {
        return this.f16651OooO00o;
    }

    public int getBufferSize() {
        return this.f16654OooO0Oo;
    }
}
