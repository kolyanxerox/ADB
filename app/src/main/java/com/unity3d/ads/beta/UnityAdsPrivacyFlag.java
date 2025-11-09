package com.unity3d.ads.beta;

/* loaded from: classes2.dex */
public enum UnityAdsPrivacyFlag {
    USER_OVER_AGE_LIMIT(0),
    NON_BEHAVIORAL(1);

    private final int value;

    UnityAdsPrivacyFlag(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
