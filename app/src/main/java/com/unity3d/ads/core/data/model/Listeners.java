package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public interface Listeners {

    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String placementId) {
            OooOo.OooO0o0(placementId, "placementId");
        }

        public static void onComplete(Listeners listeners, String placementId, UnityAds.UnityAdsShowCompletionState state) {
            OooOo.OooO0o0(placementId, "placementId");
            OooOo.OooO0o0(state, "state");
        }

        public static void onError(Listeners listeners, String placementId, UnityAds.UnityAdsShowError error, String message) {
            OooOo.OooO0o0(placementId, "placementId");
            OooOo.OooO0o0(error, "error");
            OooOo.OooO0o0(message, "message");
        }

        public static void onLeftApplication(Listeners listeners, String placementId) {
            OooOo.OooO0o0(placementId, "placementId");
        }

        public static void onStart(Listeners listeners, String placementId) {
            OooOo.OooO0o0(placementId, "placementId");
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
