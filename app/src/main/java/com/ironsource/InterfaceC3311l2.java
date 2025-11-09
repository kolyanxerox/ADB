package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.l2 */
/* loaded from: classes2.dex */
public interface InterfaceC3311l2 {
    /* renamed from: a */
    void m9732a();

    /* renamed from: a */
    void m9733a(IronSourceError ironSourceError);

    /* renamed from: a */
    void m9734a(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
    }
}
