package com.unity3d.ads.beta;

/* loaded from: classes2.dex */
public enum UnityAdsPrivacyValue {
    NOT_SET(0),
    TRUE(1),
    FALSE(2);

    private final int value;

    UnityAdsPrivacyValue(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
