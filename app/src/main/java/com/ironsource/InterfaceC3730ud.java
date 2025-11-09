package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.ud */
/* loaded from: classes2.dex */
public interface InterfaceC3730ud {
    /* renamed from: a */
    void mo8468a();

    /* renamed from: a */
    void mo8470a(IronSourceError ironSourceError);

    /* renamed from: a */
    void mo8471a(LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: b */
    void mo8472b();

    /* renamed from: b */
    void mo8473b(IronSourceError ironSourceError);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
    }
}
