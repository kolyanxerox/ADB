package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse", m13472f = "AndroidHandleGatewayUniversalResponse.kt", m13473l = {35, 41, 44}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1 */
    public static final class C40811 extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40811(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayUniversalResponse.this.invoke(null, this);
        }
    }

    public AndroidHandleGatewayUniversalResponse(SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        if (r12.setPrivacy(r2, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse r11, o00O0O0O.OooO0OO r12) throws com.unity3d.ads.core.data.model.exception.GatewayException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.invoke(gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
