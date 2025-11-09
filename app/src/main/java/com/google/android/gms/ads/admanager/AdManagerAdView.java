package com.google.android.gms.ads.admanager;

import Oooo00O.o000000O;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1643hi;

/* loaded from: classes2.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context) {
        super(context);
        o000000O.OooO(context, "Context cannot be null");
    }

    @Nullable
    public AdSize[] getAdSizes() {
        return this.f15901OooOo0O.zzC();
    }

    @Nullable
    public AppEventListener getAppEventListener() {
        return this.f15901OooOo0O.zzh();
    }

    @NonNull
    public VideoController getVideoController() {
        return this.f15901OooOo0O.zzf();
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.f15901OooOo0O.zzg();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdManagerAdRequest adManagerAdRequest) {
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(getContext());
        if (((Boolean) AbstractC1559f8.f18806OooO0o.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView adManagerAdView = this.zza;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        adManagerAdView.getClass();
                        try {
                            adManagerAdView.f15901OooOo0O.zzm(adManagerAdRequest2.zza());
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(adManagerAdView.getContext()).OooO00o("AdManagerAdView.loadAd", e);
                        }
                    }
                });
                return;
            }
        }
        this.f15901OooOo0O.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.f15901OooOo0O.zzo();
    }

    public void setAdSizes(@NonNull AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f15901OooOo0O.zzt(adSizeArr);
    }

    public void setAppEventListener(@Nullable AppEventListener appEventListener) {
        this.f15901OooOo0O.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f15901OooOo0O.zzw(z);
    }

    public void setVideoOptions(@NonNull VideoOptions videoOptions) {
        this.f15901OooOo0O.zzy(videoOptions);
    }

    public final boolean zzb(zzby zzbyVar) {
        return this.f15901OooOo0O.zzz(zzbyVar);
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o000000O.OooO(context, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (Object) null);
        o000000O.OooO(context, "Context cannot be null");
    }
}
