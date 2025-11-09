package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ServerSideVerificationOptions {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f16662OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f16663OooO0O0;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f16664OooO00o = "";

        /* renamed from: OooO0O0, reason: collision with root package name */
        public String f16665OooO0O0 = "";

        @NonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        @NonNull
        public Builder setCustomData(@NonNull String str) {
            this.f16665OooO0O0 = str;
            return this;
        }

        @NonNull
        public Builder setUserId(@NonNull String str) {
            this.f16664OooO00o = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder) {
        this.f16662OooO00o = builder.f16664OooO00o;
        this.f16663OooO0O0 = builder.f16665OooO0O0;
    }

    @NonNull
    public String getCustomData() {
        return this.f16663OooO0O0;
    }

    @NonNull
    public String getUserId() {
        return this.f16662OooO00o;
    }
}
