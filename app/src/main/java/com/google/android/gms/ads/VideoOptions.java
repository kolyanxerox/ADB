package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzga;

/* loaded from: classes2.dex */
public final class VideoOptions {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f15925OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f15926OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f15927OooO0OO;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public boolean f15928OooO00o = true;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public boolean f15929OooO0O0 = false;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public boolean f15930OooO0OO = false;

        @NonNull
        public VideoOptions build() {
            return new VideoOptions(this);
        }

        @NonNull
        public Builder setClickToExpandRequested(boolean z) {
            this.f15930OooO0OO = z;
            return this;
        }

        @NonNull
        public Builder setCustomControlsRequested(boolean z) {
            this.f15929OooO0O0 = z;
            return this;
        }

        @NonNull
        public Builder setStartMuted(boolean z) {
            this.f15928OooO00o = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder) {
        this.f15925OooO00o = builder.f15928OooO00o;
        this.f15926OooO0O0 = builder.f15929OooO0O0;
        this.f15927OooO0OO = builder.f15930OooO0OO;
    }

    public boolean getClickToExpandRequested() {
        return this.f15927OooO0OO;
    }

    public boolean getCustomControlsRequested() {
        return this.f15926OooO0O0;
    }

    public boolean getStartMuted() {
        return this.f15925OooO00o;
    }

    public VideoOptions(zzga zzgaVar) {
        this.f15925OooO00o = zzgaVar.zza;
        this.f15926OooO0O0 = zzgaVar.zzb;
        this.f15927OooO0OO = zzgaVar.zzc;
    }
}
