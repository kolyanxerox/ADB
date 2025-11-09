package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes3.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", m13472f = "AndroidGetInitializationRequestPayload.kt", m13473l = {24, 25, 33, 34, 45, 50, 55, PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1 */
    public static final class C40651 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C40651(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader) {
        OooOo.OooO0o0(getClientInfo, "getClientInfo");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        OooOo.OooO0o0(legacyUserConsentRepository, "legacyUserConsentRepository");
        OooOo.OooO0o0(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0294 A[PHI: r1 r4 r5 r9
  0x0294: PHI (r1v70 java.lang.Object) = (r1v69 java.lang.Object), (r1v1 java.lang.Object) binds: [B:59:0x0291, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r4v28 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v25 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v30 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:59:0x0291, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v10 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v15 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:59:0x0291, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r9v20 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v17 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v22 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:59:0x0291, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0310  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(o00O0O0O.OooO0OO r21) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(o00O0O0O.OooO0OO):java.lang.Object");
    }
}
