package com.unity3d.ads.adplayer.model;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class OnOfferwallEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnOfferwallEvent(OfferwallEvent offerwallEvent) {
        OooOo.OooO0o0(offerwallEvent, "offerwallEvent");
        this.category = "OFFERWALL";
        this.name = offerwallEvent.name();
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
