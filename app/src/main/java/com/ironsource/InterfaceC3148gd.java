package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* renamed from: com.ironsource.gd */
/* loaded from: classes2.dex */
public interface InterfaceC3148gd {
    /* renamed from: a */
    void mo8943a();

    /* renamed from: a */
    void mo8944a(LevelPlayAdError levelPlayAdError);

    /* renamed from: a */
    void mo8945a(LevelPlayReward levelPlayReward);

    /* renamed from: b */
    void mo8946b();

    void onAdClicked();

    void onAdClosed();

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
