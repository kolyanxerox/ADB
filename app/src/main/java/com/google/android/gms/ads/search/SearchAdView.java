package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class SearchAdView extends ViewGroup {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zzel f16671OooOo0O;

    public SearchAdView(@NonNull Context context) {
        super(context);
        this.f16671OooOo0O = new zzel(this);
    }

    public void destroy() {
        this.f16671OooOo0O.zzk();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.f16671OooOo0O.zza();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.f16671OooOo0O.zzb();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f16671OooOo0O.zzj();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull SearchAdRequest searchAdRequest) {
        this.f16671OooOo0O.zzm(searchAdRequest.f16669OooO00o);
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
        this.f16671OooOo0O.zzn();
    }

    public void resume() {
        this.f16671OooOo0O.zzp();
    }

    public void setAdListener(@NonNull AdListener adListener) {
        this.f16671OooOo0O.zzr(adListener);
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.f16671OooOo0O.zzs(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f16671OooOo0O.zzu(str);
    }

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16671OooOo0O = new zzel(this, attributeSet, false);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.f16671OooOo0O.zzm(dynamicHeightSearchAdRequest.f16666OooO00o.f16669OooO00o);
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16671OooOo0O = new zzel(this, attributeSet, false);
    }
}
