package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData", m13472f = "AndroidGetUniversalRequestSharedData.kt", m13473l = {24}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 */
    public static final class C40711 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C40711(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetUniversalRequestSharedData.this.invoke(this);
        }
    }

    public AndroidGetUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, GetLimitedSessionToken getLimitedSessionToken, DeveloperConsentRepository developerConsentRepository) {
        OooOo.OooO0o0(getSharedDataTimestamps, "getSharedDataTimestamps");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        OooOo.OooO0o0(getLimitedSessionToken, "getLimitedSessionToken");
        OooOo.OooO0o0(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(o00O0O0O.OooO0OO r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.C40711
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.C40711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$3
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r1 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r1
            java.lang.Object r2 = r0.L$2
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r2 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r2
            java.lang.Object r3 = r0.L$1
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r3 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData) r0
            o00O0.o000OOo.OooOO0O(r6)
            goto L7d
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            o00O0.o000OOo.OooOO0O(r6)
            gatewayprotocol.v1.UniversalRequestKt r6 = gatewayprotocol.p014v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl$Companion r6 = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData$Builder r2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r2, r4)
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r6 = r6._create(r2)
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r5.sessionRepository
            com.google.protobuf.ByteString r2 = r2.getSessionToken()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L65
            r6.setSessionToken(r2)
            r0 = r5
            r3 = r6
            goto L83
        L65:
            com.unity3d.ads.core.domain.GetLimitedSessionToken r2 = r5.getLimitedSessionToken
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L78
            return r1
        L78:
            r1 = r6
            r2 = r1
            r3 = r2
            r6 = r0
            r0 = r5
        L7d:
            gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) r6
            r1.setLimitedSessionToken(r6)
            r6 = r2
        L83:
            com.unity3d.ads.core.domain.GetSharedDataTimestamps r1 = r0.getSharedDataTimestamps
            gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.invoke()
            r6.setTimestamps(r1)
            long r1 = com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()
            com.google.protobuf.Timestamp r1 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r1)
            r6.setSdkStartTime(r1)
            long r1 = com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()
            com.google.protobuf.Timestamp r1 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r1)
            r6.setAppStartTime(r1)
            com.unity3d.ads.core.data.repository.DeveloperConsentRepository r1 = r0.developerConsentRepository
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent r1 = r1.getDeveloperConsent()
            r6.setDeveloperConsent(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r0 = r0.deviceInfoRepository
            gatewayprotocol.v1.PiiOuterClass$Pii r0 = r0.getPiiData()
            com.google.protobuf.ByteString r1 = r0.getAdvertisingId()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lc5
            com.google.protobuf.ByteString r1 = r0.getOpenAdvertisingTrackingId()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lc8
        Lc5:
            r6.setPii(r0)
        Lc8:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r6 = r3._build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke(o00O0O0O.OooO0OO):java.lang.Object");
    }
}
