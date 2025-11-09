package com.unity3d.ads.adplayer.model;

import com.ironsource.mediationsdk.C3395l;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class OnScarBannerEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnScarBannerEvent(BannerBridge.BannerEvent bannerEvent) {
        OooOo.OooO0o0(bannerEvent, "bannerEvent");
        this.category = C3395l.f9866a;
        this.name = bannerEvent.name();
        this.parameters = new Object[0];
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
