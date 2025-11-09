package com.google.android.gms.ads;

import OooO0oO.OooOo;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f15888OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f15889OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f15890OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15891OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f15892OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f15893OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f15894OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f15895OooO0oo;

    @NonNull
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");

    @NonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");

    @NonNull
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");

    @NonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");

    @NonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");

    @NonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @NonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");

    @NonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");

    @NonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");

    @NonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    @NonNull
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : String.valueOf(i)) + "x" + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    public static AdSize OooO00o(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.f15895OooO0oo = i2;
        adSize.f15894OooO0oO = true;
        return adSize;
    }

    @NonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 0);
        adSizeZzd.f15891OooO0Oo = true;
        return adSizeZzd;
    }

    @NonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.f15892OooO0o = iZza;
        adSize.f15893OooO0o0 = true;
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getCurrentOrientationInterscrollerAdSize(@NonNull Context context, int i) {
        return OooO00o(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0));
    }

    @NonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.f15892OooO0o = i2;
        adSize.f15893OooO0o0 = true;
        if (i2 < 32) {
            zzo.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    @NonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 2);
        adSizeZzd.f15891OooO0Oo = true;
        return adSizeZzd;
    }

    @NonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.f15892OooO0o = iZza;
        adSize.f15893OooO0o0 = true;
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getLandscapeInterscrollerAdSize(@NonNull Context context, int i) {
        return OooO00o(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2));
    }

    @NonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 1);
        adSizeZzd.f15891OooO0Oo = true;
        return adSizeZzd;
    }

    @NonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.f15892OooO0o = iZza;
        adSize.f15893OooO0o0 = true;
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getPortraitInterscrollerAdSize(@NonNull Context context, int i) {
        return OooO00o(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f15888OooO00o == adSize.f15888OooO00o && this.f15889OooO0O0 == adSize.f15889OooO0O0 && this.f15890OooO0OO.equals(adSize.f15890OooO0OO);
    }

    public int getHeight() {
        return this.f15889OooO0O0;
    }

    public int getHeightInPixels(@NonNull Context context) {
        int i = this.f15889OooO0O0;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzs.zza(context.getResources().getDisplayMetrics());
        }
        zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
    }

    public int getWidth() {
        return this.f15888OooO00o;
    }

    public int getWidthInPixels(@NonNull Context context) {
        int i = this.f15888OooO00o;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            zzbc.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzs> creator = zzs.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.f15890OooO0OO.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f15889OooO0O0 == -2;
    }

    public boolean isFluid() {
        return this.f15888OooO00o == -3 && this.f15889OooO0O0 == -4;
    }

    public boolean isFullWidth() {
        return this.f15888OooO00o == -1;
    }

    @NonNull
    public String toString() {
        return this.f15890OooO0OO;
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(OooOo.OooO0o(i, "Invalid width for AdSize: "));
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new IllegalArgumentException(OooOo.OooO0o(i2, "Invalid height for AdSize: "));
        }
        this.f15888OooO00o = i;
        this.f15889OooO0O0 = i2;
        this.f15890OooO0OO = str;
    }
}
