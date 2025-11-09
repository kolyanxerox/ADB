package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import gatewayprotocol.p014v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    @OooO(m13471c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", m13472f = "GetOperativeEventApi.kt", m13473l = {21}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 */
    public static final class C41251 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41251(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetOperativeEventApi.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository, GetOperativeEventRequest operativeEventRequest) {
        OooOo.OooO0o0(operativeEventRepository, "operativeEventRepository");
        OooOo.OooO0o0(operativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = operativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, InitializationResponseOuterClass.AdFormat adFormat, o00O0O0O.OooO0OO oooO0OO, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            adFormat = null;
        }
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, str, adFormat, oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r11, com.google.protobuf.ByteString r12, com.google.protobuf.ByteString r13, com.google.protobuf.ByteString r14, java.lang.String r15, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat r16, o00O0O0O.OooO0OO r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi.C41251
            if (r1 == 0) goto L16
            r1 = r0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r1 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi.C41251) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r1 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r9.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r9.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r11 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) r11
            o00O0.o000OOo.OooOO0O(r0)
            goto L4f
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            o00O0.o000OOo.OooOO0O(r0)
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r2 = r10.operativeEventRequest
            r9.L$0 = r10
            r9.label = r3
            r3 = r11
            r5 = r12
            r4 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            java.lang.Object r0 = r2.invoke(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r11 = r10
        L4f:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r0 = (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) r0
            com.unity3d.ads.core.data.repository.OperativeEventRepository r11 = r11.operativeEventRepository
            r11.addOperativeEvent(r0)
            oo00o.OooOo r11 = oo00o.OooOo.f33195OooO00o
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass$AdFormat, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, AdObject adObject, ByteString byteString, o00O0O0O.OooO0OO oooO0OO) {
        Object objInvoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER : null, oooO0OO);
        return objInvoke == OooOo00.f31365OooOo0O ? objInvoke : oo00o.OooOo.f33195OooO00o;
    }
}
