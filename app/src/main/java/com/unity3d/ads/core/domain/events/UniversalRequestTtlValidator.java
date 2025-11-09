package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.p014v1.UniversalRequestOuterClass;

/* loaded from: classes3.dex */
public interface UniversalRequestTtlValidator {
    boolean invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy);
}
