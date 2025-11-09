package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.np */
/* loaded from: classes2.dex */
public interface InterfaceC3462np extends InterfaceC3299kp {
    void onInterstitialAdRewarded(String str, int i);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess(C3907zj c3907zj);

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
