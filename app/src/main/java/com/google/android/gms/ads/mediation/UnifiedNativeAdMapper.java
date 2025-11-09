package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class UnifiedNativeAdMapper {

    /* renamed from: OooO, reason: collision with root package name */
    public String f16418OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f16419OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public List f16420OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f16421OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public NativeAd.Image f16422OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f16423OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public String f16424OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public Double f16425OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public String f16426OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public VideoController f16427OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f16428OooOO0O;
    public View OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public Object f16429OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public View f16430OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public Bundle f16431OooOOOO = new Bundle();

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f16432OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public float f16433OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public boolean f16434OooOOo0;

    @NonNull
    public View getAdChoicesContent() {
        return this.OooOO0o;
    }

    @NonNull
    public final String getAdvertiser() {
        return this.f16423OooO0o;
    }

    @NonNull
    public final String getBody() {
        return this.f16421OooO0OO;
    }

    @NonNull
    public final String getCallToAction() {
        return this.f16424OooO0o0;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    @NonNull
    public final Bundle getExtras() {
        return this.f16431OooOOOO;
    }

    @NonNull
    public final String getHeadline() {
        return this.f16419OooO00o;
    }

    @NonNull
    public final NativeAd.Image getIcon() {
        return this.f16422OooO0Oo;
    }

    @NonNull
    public final List<NativeAd.Image> getImages() {
        return this.f16420OooO0O0;
    }

    public float getMediaContentAspectRatio() {
        return this.f16433OooOOo;
    }

    public final boolean getOverrideClickHandling() {
        return this.f16434OooOOo0;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f16432OooOOOo;
    }

    @NonNull
    public final String getPrice() {
        return this.f16418OooO;
    }

    @NonNull
    public final Double getStarRating() {
        return this.f16425OooO0oO;
    }

    @NonNull
    public final String getStore() {
        return this.f16426OooO0oo;
    }

    public void handleClick(@NonNull View view) {
    }

    public boolean hasVideoContent() {
        return this.f16428OooOO0O;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(@NonNull View view) {
        this.OooOO0o = view;
    }

    public final void setAdvertiser(@NonNull String str) {
        this.f16423OooO0o = str;
    }

    public final void setBody(@NonNull String str) {
        this.f16421OooO0OO = str;
    }

    public final void setCallToAction(@NonNull String str) {
        this.f16424OooO0o0 = str;
    }

    public final void setExtras(@NonNull Bundle bundle) {
        this.f16431OooOOOO = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.f16428OooOO0O = z;
    }

    public final void setHeadline(@NonNull String str) {
        this.f16419OooO00o = str;
    }

    public final void setIcon(@NonNull NativeAd.Image image) {
        this.f16422OooO0Oo = image;
    }

    public final void setImages(@NonNull List<NativeAd.Image> list) {
        this.f16420OooO0O0 = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.f16433OooOOo = f;
    }

    public void setMediaView(@NonNull View view) {
        this.f16430OooOOO0 = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f16434OooOOo0 = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f16432OooOOOo = z;
    }

    public final void setPrice(@NonNull String str) {
        this.f16418OooO = str;
    }

    public final void setStarRating(@NonNull Double d) {
        this.f16425OooO0oO = d;
    }

    public final void setStore(@NonNull String str) {
        this.f16426OooO0oo = str;
    }

    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
    }

    public void untrackView(@NonNull View view) {
    }

    @NonNull
    public final View zza() {
        return this.f16430OooOOO0;
    }

    @NonNull
    public final VideoController zzb() {
        return this.f16427OooOO0;
    }

    @NonNull
    public final Object zzc() {
        return this.f16429OooOOO;
    }

    public final void zzd(@NonNull Object obj) {
        this.f16429OooOOO = obj;
    }

    public final void zze(@NonNull VideoController videoController) {
        this.f16427OooOO0 = videoController;
    }
}
