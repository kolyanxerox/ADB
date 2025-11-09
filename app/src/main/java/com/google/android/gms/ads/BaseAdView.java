package com.google.android.gms.ads;

import Oooo00O.o000000O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1643hi;

/* loaded from: classes2.dex */
public abstract class BaseAdView extends ViewGroup {

    /* renamed from: OooOo0O */
    public final zzel f15901OooOo0O;

    public BaseAdView(Context context) {
        super(context);
        this.f15901OooOo0O = new zzel(this, 0);
    }

    public void destroy() {
        AbstractC1448c7.OooO00o(getContext());
        if (((Boolean) AbstractC1559f8.f18807OooO0o0.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f15901OooOo0O.zzk();
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(baseAdView.getContext()).OooO00o("BaseAdView.destroy", e);
                        }
                    }
                });
                return;
            }
        }
        this.f15901OooOo0O.zzk();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.f15901OooOo0O.zza();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.f15901OooOo0O.zzb();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f15901OooOo0O.zzj();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.f15901OooOo0O.zzc();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.f15901OooOo0O.zzd();
    }

    public boolean isCollapsible() {
        return this.f15901OooOo0O.zzA();
    }

    public boolean isLoading() {
        return this.f15901OooOo0O.zzB();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdRequest adRequest) {
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(getContext());
        if (((Boolean) AbstractC1559f8.f18806OooO0o.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f15901OooOo0O.zzm(adRequest.f15887OooO00o);
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(baseAdView.getContext()).OooO00o("BaseAdView.loadAd", e);
                        }
                    }
                });
                return;
            }
        }
        this.f15901OooOo0O.zzm(adRequest.f15887OooO00o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzo.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        AbstractC1448c7.OooO00o(getContext());
        if (((Boolean) AbstractC1559f8.f18808OooO0oO.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOo00)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f15901OooOo0O.zzn();
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(baseAdView.getContext()).OooO00o("BaseAdView.pause", e);
                        }
                    }
                });
                return;
            }
        }
        this.f15901OooOo0O.zzn();
    }

    public void resume() {
        AbstractC1448c7.OooO00o(getContext());
        if (((Boolean) AbstractC1559f8.f18809OooO0oo.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOo0)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f15901OooOo0O.zzp();
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(baseAdView.getContext()).OooO00o("BaseAdView.resume", e);
                        }
                    }
                });
                return;
            }
        }
        this.f15901OooOo0O.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull AdListener adListener) {
        zzel zzelVar = this.f15901OooOo0O;
        zzelVar.zzr(adListener);
        if (adListener == 0) {
            zzelVar.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzelVar.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzelVar.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.f15901OooOo0O.zzs(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f15901OooOo0O.zzu(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.f15901OooOo0O.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15901OooOo0O = new zzel(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f15901OooOo0O = new zzel(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, Object obj) {
        super(context, attributeSet, i);
        this.f15901OooOo0O = new zzel(this, attributeSet, true, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f15901OooOo0O = new zzel(this, attributeSet, true);
    }
}
