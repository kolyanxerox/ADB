package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.gatewayclient.GatewayClient;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidRefresh implements Refresh {
    private final o0000O00 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidRefresh", m13472f = "AndroidRefresh.kt", m13473l = {25}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 */
    public static final class C40861 extends OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C40861(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRefresh.this.invoke(null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", m13472f = "AndroidRefresh.kt", m13473l = {26, 28}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$2 */
    public static final class C40872 extends OooOOOO implements o00O0O {
        final /* synthetic */ ByteString $adDataRefreshToken;
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40872(ByteString byteString, ByteString byteString2, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$adDataRefreshToken = byteString;
            this.$opportunityId = byteString2;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidRefresh.this.new C40872(this.$adDataRefreshToken, this.$opportunityId, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r12 == r0) goto L15;
         */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                o00O0.o000OOo.OooOO0O(r12)
                goto L54
            L10:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L18:
                o00O0.o000OOo.OooOO0O(r12)
                goto L32
            L1c:
                o00O0.o000OOo.OooOO0O(r12)
                com.unity3d.ads.core.domain.AndroidRefresh r12 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.core.domain.GetAdDataRefreshRequest r12 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetAdDataRefreshRequest$p(r12)
                com.google.protobuf.ByteString r1 = r11.$adDataRefreshToken
                com.google.protobuf.ByteString r4 = r11.$opportunityId
                r11.label = r3
                java.lang.Object r12 = r12.invoke(r1, r4, r11)
                if (r12 != r0) goto L32
                goto L53
            L32:
                r5 = r12
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r5 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r5
                com.unity3d.ads.core.domain.AndroidRefresh r12 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.core.domain.GetRequestPolicy r12 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetRequestPolicy$p(r12)
                com.unity3d.ads.gatewayclient.RequestPolicy r6 = r12.invoke()
                com.unity3d.ads.core.domain.AndroidRefresh r12 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.gatewayclient.GatewayClient r3 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGatewayClient$p(r12)
                com.unity3d.ads.core.data.model.OperationType r7 = com.unity3d.ads.core.data.model.OperationType.REFRESH
                r11.label = r2
                r4 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L54
            L53:
                return r0
            L54:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r12 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r12
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload r12 = r12.getPayload()
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r12 = r12.getAdDataRefreshResponse()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.C40872.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40872) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidRefresh(o0000O00 defaultDispatcher, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        kotlin.jvm.internal.OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.OooOo.OooO0o0(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.Refresh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString r6, com.google.protobuf.ByteString r7, o00O0O0O.OooO0OO r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidRefresh.C40861
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidRefresh.C40861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            o00O0.o000OOo.OooOO0O(r8)
            o00O0oOo.o0000O00 r8 = r5.defaultDispatcher
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$2 r2 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$2
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.label = r3
            java.lang.Object r8 = o00O0oOo.o0000OO0.Oooo00O(r2, r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            java.lang.String r6 = "override suspend fun inv…RefreshResponse\n        }"
            kotlin.jvm.internal.OooOo.OooO0Oo(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.invoke(com.google.protobuf.ByteString, com.google.protobuf.ByteString, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
