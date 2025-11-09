package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i, Exception exception) throws Exception {
        OooOo.OooO0o0(storeEvent, "storeEvent");
        OooOo.OooO0o0(exception, "exception");
        throw exception;
    }
}
