package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    @OooO(m13471c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", m13472f = "UniversalRequestEventSender.kt", m13473l = {21, 35}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 */
    public static final class C41291 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41291(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator) {
        OooOo.OooO0o0(gatewayClient, "gatewayClient");
        OooOo.OooO0o0(handleGatewayEventResponse, "handleGatewayEventResponse");
        OooOo.OooO0o0(universalRequestTtlValidator, "universalRequestTtlValidator");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r13, com.unity3d.ads.gatewayclient.RequestPolicy r14, o00O0O0O.OooO0OO r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender.C41291
            if (r0 == 0) goto L14
            r0 = r15
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender.C41291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.result
            o00O0O0o.OooOo00 r9 = o00O0O0o.OooOo00.f31365OooOo0O
            int r0 = r6.label
            oo00o.OooOo r10 = oo00o.OooOo.f33195OooO00o
            r11 = 2
            r1 = 1
            if (r0 == 0) goto L41
            if (r0 == r1) goto L36
            if (r0 != r11) goto L2e
            o00O0.o000OOo.OooOO0O(r15)
            return r10
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            java.lang.Object r13 = r6.L$0
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r13 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) r13
            o00O0.o000OOo.OooOO0O(r15)     // Catch: java.lang.Throwable -> L3e
            goto L63
        L3e:
            r0 = move-exception
            r14 = r0
            goto L69
        L41:
            o00O0.o000OOo.OooOO0O(r15)
            com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator r15 = r12.universalRequestTtlValidator
            boolean r15 = r15.invoke(r13, r14)
            if (r15 != 0) goto L4d
            goto L89
        L4d:
            r15 = r1
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r12.gatewayClient     // Catch: java.lang.Throwable -> L66
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT     // Catch: java.lang.Throwable -> L66
            r6.L$0 = r12     // Catch: java.lang.Throwable -> L66
            r6.label = r15     // Catch: java.lang.Throwable -> L66
            r7 = 1
            r8 = 0
            r2 = 0
            r3 = r13
            r4 = r14
            java.lang.Object r15 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L66
            if (r15 != r9) goto L62
            goto L88
        L62:
            r13 = r12
        L63:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r15 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r15     // Catch: java.lang.Throwable -> L3e
            goto L6d
        L66:
            r0 = move-exception
            r14 = r0
            r13 = r12
        L69:
            oo00o.OooOO0O r15 = o00O0.o000OOo.OooO0O0(r14)
        L6d:
            java.lang.Throwable r14 = oo00o.OooOOO0.OooO00o(r15)
            boolean r14 = r14 instanceof com.unity3d.ads.core.data.model.exception.GatewayException
            if (r14 == 0) goto L76
            goto L89
        L76:
            com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r13 = r13.handleGatewayEventResponse
            o00O0.o000OOo.OooOO0O(r15)
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r15 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r15
            r14 = 0
            r6.L$0 = r14
            r6.label = r11
            java.lang.Object r13 = r13.invoke(r15, r6)
            if (r13 != r9) goto L89
        L88:
            return r9
        L89:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
