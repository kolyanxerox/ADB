package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class NativeAdMapper {

    /* renamed from: OooO, reason: collision with root package name */
    public String f16403OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f16404OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public List f16405OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f16406OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public NativeAd.Image f16407OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f16408OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public String f16409OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public Double f16410OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public String f16411OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f16412OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public View f16413OooOO0O;
    public View OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f16414OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public Bundle f16415OooOOO0 = new Bundle();

    /* renamed from: OooOOOO, reason: collision with root package name */
    public boolean f16416OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public float f16417OooOOOo;

    @NonNull
    public View getAdChoicesContent() {
        return this.f16413OooOO0O;
    }

    @NonNull
    public final String getAdvertiser() {
        return this.f16408OooO0o;
    }

    @NonNull
    public final String getBody() {
        return this.f16406OooO0OO;
    }

    @NonNull
    public final String getCallToAction() {
        return this.f16409OooO0o0;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    @NonNull
    public final Bundle getExtras() {
        return this.f16415OooOOO0;
    }

    @NonNull
    public final String getHeadline() {
        return this.f16404OooO00o;
    }

    @NonNull
    public final NativeAd.Image getIcon() {
        return this.f16407OooO0Oo;
    }

    @NonNull
    public final List<NativeAd.Image> getImages() {
        return this.f16405OooO0O0;
    }

    public float getMediaContentAspectRatio() {
        return this.f16417OooOOOo;
    }

    public final boolean getOverrideClickHandling() {
        return this.f16416OooOOOO;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f16414OooOOO;
    }

    @NonNull
    public final String getPrice() {
        return this.f16403OooO;
    }

    @NonNull
    public final Double getStarRating() {
        return this.f16410OooO0oO;
    }

    @NonNull
    public final String getStore() {
        return this.f16411OooO0oo;
    }

    public void handleClick(@NonNull View view) {
    }

    public boolean hasVideoContent() {
        return this.f16412OooOO0;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(@NonNull View view) {
        this.f16413OooOO0O = view;
    }

    public final void setAdvertiser(@NonNull String str) {
        this.f16408OooO0o = str;
    }

    public final void setBody(@NonNull String str) {
        this.f16406OooO0OO = str;
    }

    public final void setCallToAction(@NonNull String str) {
        this.f16409OooO0o0 = str;
    }

    public final void setExtras(@NonNull Bundle bundle) {
        this.f16415OooOOO0 = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.f16412OooOO0 = z;
    }

    public final void setHeadline(@NonNull String str) {
        this.f16404OooO00o = str;
    }

    public final void setIcon(@NonNull NativeAd.Image image) {
        this.f16407OooO0Oo = image;
    }

    public final void setImages(@NonNull List<NativeAd.Image> list) {
        this.f16405OooO0O0 = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.f16417OooOOOo = f;
    }

    public void setMediaView(@NonNull View view) {
        this.OooOO0o = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f16416OooOOOO = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f16414OooOOO = z;
    }

    public final void setPrice(@NonNull String str) {
        this.f16403OooO = str;
    }

    public final void setStarRating(@NonNull Double d) {
        this.f16410OooO0oO = d;
    }

    public final void setStore(@NonNull String str) {
        this.f16411OooO0oo = str;
    }

    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
    }

    public void untrackView(@NonNull View view) {
    }

    @NonNull
    public final View zza() {
        return this.OooOO0o;
    }
}
