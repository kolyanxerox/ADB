package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class RequestConfiguration {

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f15904OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f15905OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f15906OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f15907OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final PublisherPrivacyPersonalizationState f15908OooO0o0;

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @NonNull
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public int f15909OooO00o = -1;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public int f15910OooO0O0 = -1;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public String f15911OooO0OO = null;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f15912OooO0Oo = new ArrayList();

        /* renamed from: OooO0o0, reason: collision with root package name */
        public PublisherPrivacyPersonalizationState f15913OooO0o0 = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.f15909OooO00o, this.f15910OooO0O0, this.f15911OooO0OO, this.f15912OooO0Oo, this.f15913OooO0o0);
        }

        @NonNull
        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.f15911OooO0OO = null;
                return this;
            }
            if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.f15911OooO0OO = str;
                return this;
            }
            zzo.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
            return this;
        }

        @NonNull
        public Builder setPublisherPrivacyPersonalizationState(@NonNull PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.f15913OooO0o0 = publisherPrivacyPersonalizationState;
            return this;
        }

        @NonNull
        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f15909OooO00o = i;
                return this;
            }
            zzo.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i);
            return this;
        }

        @NonNull
        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f15910OooO0O0 = i;
                return this;
            }
            zzo.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(List<String> list) {
            ArrayList arrayList = this.f15912OooO0Oo;
            arrayList.clear();
            if (list != null) {
                arrayList.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* renamed from: OooOo0O, reason: collision with root package name */
        public final int f15915OooOo0O;

        PublisherPrivacyPersonalizationState(int i) {
            this.f15915OooOo0O = i;
        }

        public int getValue() {
            return this.f15915OooOo0O;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i, int i2, String str, ArrayList arrayList, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
        this.f15904OooO00o = i;
        this.f15905OooO0O0 = i2;
        this.f15906OooO0OO = str;
        this.f15907OooO0Oo = arrayList;
        this.f15908OooO0o0 = publisherPrivacyPersonalizationState;
    }

    @NonNull
    public String getMaxAdContentRating() {
        String str = this.f15906OooO0OO;
        return str == null ? "" : str;
    }

    @NonNull
    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.f15908OooO0o0;
    }

    public int getTagForChildDirectedTreatment() {
        return this.f15904OooO00o;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.f15905OooO0O0;
    }

    @NonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.f15907OooO0Oo);
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.f15904OooO00o);
        builder.setTagForUnderAgeOfConsent(this.f15905OooO0O0);
        builder.setMaxAdContentRating(this.f15906OooO0OO);
        builder.setTestDeviceIds(this.f15907OooO0Oo);
        return builder;
    }
}
