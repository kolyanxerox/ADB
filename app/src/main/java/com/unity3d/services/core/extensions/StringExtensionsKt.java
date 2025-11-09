package com.unity3d.services.core.extensions;

import OooO0oO.OooOo;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        return (str == null || str.length() == 0) ? "[Unity Ads] Internal error" : OooOo.OooOO0(UnityAdsConstants.Messages.MSG_UNITY_BASE, str);
    }
}
