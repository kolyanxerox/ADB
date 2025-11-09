package com.applovin.impl;

import com.ironsource.InterfaceC3173h3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* renamed from: com.applovin.impl.q7 */
/* loaded from: classes.dex */
public enum EnumC1173q7 {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(300),
    TIMED_OUT(301),
    WRAPPER_LIMIT_REACHED(302),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(CommonGatewayClient.CODE_400),
    NO_MEDIA_FILE_PROVIDED(InterfaceC3173h3.a.b.f8796b),
    MEDIA_FILE_TIMEOUT(402),
    MEDIA_FILE_ERROR(InterfaceC3173h3.a.b.f8799e),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED);


    /* renamed from: a */
    private final int f1830a;

    EnumC1173q7(int i) {
        this.f1830a = i;
    }

    /* renamed from: b */
    public int m2282b() {
        return this.f1830a;
    }
}
