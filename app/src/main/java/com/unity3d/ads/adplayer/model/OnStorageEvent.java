package com.unity3d.ads.adplayer.model;

import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class OnStorageEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnStorageEvent(StorageEvent eventType, StorageManager.StorageType storageType, Object obj) {
        OooOo.OooO0o0(eventType, "eventType");
        OooOo.OooO0o0(storageType, "storageType");
        this.category = "STORAGE";
        this.name = eventType.name();
        this.parameters = new Object[]{storageType.name(), obj};
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
