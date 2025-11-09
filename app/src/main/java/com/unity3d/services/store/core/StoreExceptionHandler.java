package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;

/* loaded from: classes3.dex */
public interface StoreExceptionHandler {
    void handleStoreException(StoreEvent storeEvent, int i, Exception exc);
}
