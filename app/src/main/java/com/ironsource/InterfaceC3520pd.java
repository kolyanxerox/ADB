package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.pd */
/* loaded from: classes2.dex */
public interface InterfaceC3520pd {
    /* renamed from: a */
    void mo9113a();

    /* renamed from: a */
    void mo9114a(Activity activity, String str);

    /* renamed from: a */
    void mo9115a(LevelPlayAdError levelPlayAdError);

    /* renamed from: b */
    void mo9116b();

    /* renamed from: c */
    LevelPlayAdInfo mo9117c();

    /* renamed from: d */
    InterfaceC3171h1 mo9118d();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
