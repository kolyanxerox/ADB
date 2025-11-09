package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;

/* loaded from: classes2.dex */
public final class DynamicHeightSearchAdRequest {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SearchAdRequest f16666OooO00o;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final zzb f16667OooO00o = new zzb();

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final Bundle f16668OooO0O0 = new Bundle();

        @NonNull
        public Builder addCustomEventExtrasBundle(@NonNull Class<? extends CustomEvent> cls, @NonNull Bundle bundle) {
            this.f16667OooO00o.zzb(cls, bundle);
            return this;
        }

        @NonNull
        public Builder addNetworkExtras(@NonNull NetworkExtras networkExtras) {
            this.f16667OooO00o.zzc(networkExtras);
            return this;
        }

        @NonNull
        public Builder addNetworkExtrasBundle(@NonNull Class<? extends MediationAdapter> cls, @NonNull Bundle bundle) {
            this.f16667OooO00o.zzd(cls, bundle);
            return this;
        }

        @NonNull
        public DynamicHeightSearchAdRequest build() {
            this.f16667OooO00o.zzd(AdMobAdapter.class, this.f16668OooO0O0);
            return new DynamicHeightSearchAdRequest(this);
        }

        @NonNull
        public Builder setAdBorderSelectors(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_adBorderSelectors", str);
            return this;
        }

        @NonNull
        public Builder setAdTest(boolean z) {
            this.f16668OooO0O0.putString("csa_adtest", true != z ? "off" : "on");
            return this;
        }

        @NonNull
        public Builder setAdjustableLineHeight(int i) {
            this.f16668OooO0O0.putString("csa_adjustableLineHeight", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setAdvancedOptionValue(@NonNull String str, @NonNull String str2) {
            this.f16668OooO0O0.putString(str, str2);
            return this;
        }

        @NonNull
        public Builder setAttributionSpacingBelow(int i) {
            this.f16668OooO0O0.putString("csa_attributionSpacingBelow", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setBorderSelections(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_borderSelections", str);
            return this;
        }

        @NonNull
        public Builder setChannel(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_channel", str);
            return this;
        }

        @NonNull
        public Builder setColorAdBorder(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorAdBorder", str);
            return this;
        }

        @NonNull
        public Builder setColorAdSeparator(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorAdSeparator", str);
            return this;
        }

        @NonNull
        public Builder setColorAnnotation(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorAnnotation", str);
            return this;
        }

        @NonNull
        public Builder setColorAttribution(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorAttribution", str);
            return this;
        }

        @NonNull
        public Builder setColorBackground(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorBackground", str);
            return this;
        }

        @NonNull
        public Builder setColorBorder(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorBorder", str);
            return this;
        }

        @NonNull
        public Builder setColorDomainLink(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorDomainLink", str);
            return this;
        }

        @NonNull
        public Builder setColorText(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorText", str);
            return this;
        }

        @NonNull
        public Builder setColorTitleLink(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorTitleLink", str);
            return this;
        }

        @NonNull
        public Builder setCssWidth(int i) {
            this.f16668OooO0O0.putString("csa_width", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setDetailedAttribution(boolean z) {
            this.f16668OooO0O0.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setFontFamily(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_fontFamily", str);
            return this;
        }

        @NonNull
        public Builder setFontFamilyAttribution(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        @NonNull
        public Builder setFontSizeAnnotation(int i) {
            this.f16668OooO0O0.putString("csa_fontSizeAnnotation", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setFontSizeAttribution(int i) {
            this.f16668OooO0O0.putString("csa_fontSizeAttribution", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setFontSizeDescription(int i) {
            this.f16668OooO0O0.putString("csa_fontSizeDescription", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setFontSizeDomainLink(int i) {
            this.f16668OooO0O0.putString("csa_fontSizeDomainLink", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setFontSizeTitle(int i) {
            this.f16668OooO0O0.putString("csa_fontSizeTitle", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setHostLanguage(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_hl", str);
            return this;
        }

        @NonNull
        public Builder setIsClickToCallEnabled(boolean z) {
            this.f16668OooO0O0.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsLocationEnabled(boolean z) {
            this.f16668OooO0O0.putString("csa_location", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsPlusOnesEnabled(boolean z) {
            this.f16668OooO0O0.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsSellerRatingsEnabled(boolean z) {
            this.f16668OooO0O0.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsSiteLinksEnabled(boolean z) {
            this.f16668OooO0O0.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsTitleBold(boolean z) {
            this.f16668OooO0O0.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsTitleUnderlined(boolean z) {
            this.f16668OooO0O0.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        @NonNull
        public Builder setLocationColor(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_colorLocation", str);
            return this;
        }

        @NonNull
        public Builder setLocationFontSize(int i) {
            this.f16668OooO0O0.putString("csa_fontSizeLocation", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setLongerHeadlines(boolean z) {
            this.f16668OooO0O0.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setNumber(int i) {
            this.f16668OooO0O0.putString("csa_number", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setPage(int i) {
            this.f16668OooO0O0.putString("csa_adPage", Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder setQuery(@NonNull String str) {
            this.f16667OooO00o.zze(str);
            return this;
        }

        @NonNull
        public Builder setStyleId(@NonNull String str) {
            this.f16668OooO0O0.putString("csa_styleId", str);
            return this;
        }

        @NonNull
        public Builder setVerticalSpacing(int i) {
            this.f16668OooO0O0.putString("csa_verticalSpacing", Integer.toString(i));
            return this;
        }
    }

    public /* synthetic */ DynamicHeightSearchAdRequest(Builder builder) {
        this.f16666OooO00o = new SearchAdRequest(builder.f16667OooO00o);
    }

    @Nullable
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@NonNull Class<T> cls) {
        return this.f16666OooO00o.getCustomEventExtrasBundle(cls);
    }

    @Nullable
    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(@NonNull Class<T> cls) {
        return this.f16666OooO00o.getNetworkExtrasBundle(cls);
    }

    @NonNull
    public String getQuery() {
        return this.f16666OooO00o.getQuery();
    }

    public boolean isTestDevice(@NonNull Context context) {
        return this.f16666OooO00o.isTestDevice(context);
    }
}
