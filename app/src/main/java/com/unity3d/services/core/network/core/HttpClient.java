package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, OooO0OO oooO0OO);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
