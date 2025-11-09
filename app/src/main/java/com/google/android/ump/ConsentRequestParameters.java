package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes2.dex */
public class ConsentRequestParameters {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f28002OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f28003OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ConsentDebugSettings f28004OooO0OO;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public boolean f28005OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public String f28006OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public ConsentDebugSettings f28007OooO0OO;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        public Builder setAdMobAppId(@Nullable String str) {
            this.f28006OooO0O0 = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f28007OooO0OO = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.f28005OooO00o = z;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.f28002OooO00o = builder.f28005OooO00o;
        this.f28003OooO0O0 = builder.f28006OooO0O0;
        this.f28004OooO0OO = builder.f28007OooO0OO;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f28004OooO0OO;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f28002OooO00o;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f28003OooO0O0;
    }
}
