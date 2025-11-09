package com.google.android.gms.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f15881OooOo0O;

    AdFormat(int i) {
        this.f15881OooOo0O = i;
    }

    @Nullable
    public static AdFormat getAdFormat(int i) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.f15881OooOo0O;
    }
}
