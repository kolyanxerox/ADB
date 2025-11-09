package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.p014v1.TransactionEventRequestOuterClass;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class TransactionEventObserver {
    private final o0000O00 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final o0OO isRunning;
    private final TransactionEventRepository transactionEventRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", m13472f = "TransactionEventObserver.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2 */
    public static final class C41282 extends OooOOOO implements o00O0O {
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", m13472f = "TransactionEventObserver.kt", m13473l = {44, 46, 55}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransactionEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TransactionEventObserver transactionEventObserver, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = transactionEventObserver;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, oooO0OO);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(transactionEventRequest, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
            
                if (r13.set(r1, r12) == r0) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
            @Override // o00O0OO0.OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                    int r1 = r12.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r4) goto L26
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    o00O0.o000OOo.OooOO0O(r13)
                    r9 = r12
                    goto Lad
                L15:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1d:
                    java.lang.Object r1 = r12.L$0
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                    o00O0.o000OOo.OooOO0O(r13)
                    r9 = r12
                    goto L7e
                L26:
                    o00O0.o000OOo.OooOO0O(r13)
                    goto L59
                L2a:
                    o00O0.o000OOo.OooOO0O(r13)
                    java.lang.Object r13 = r12.L$0
                    gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                    gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.p014v1.UniversalRequestKt.INSTANCE
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                    java.lang.String r6 = "newBuilder()"
                    kotlin.jvm.internal.OooOo.OooO0Oo(r5, r6)
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)
                    r1.setTransactionEventRequest(r13)
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = r12.this$0
                    com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)
                    r12.label = r4
                    java.lang.Object r13 = r1.invoke(r13, r12)
                    if (r13 != r0) goto L59
                    r9 = r12
                    goto Lac
                L59:
                    r6 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT
                    r12.L$0 = r6
                    r12.label = r3
                    r5 = 0
                    r10 = 1
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L7d
                    goto Lac
                L7d:
                    r1 = r6
                L7e:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    gatewayprotocol.v1.ErrorOuterClass$Error r13 = r13.getError()
                    if (r13 == 0) goto Lad
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r9.this$0
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()
                    gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()
                    com.google.protobuf.Timestamp r1 = r1.getTimestamp()
                    com.google.protobuf.ByteString r1 = r1.toByteString()
                    java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                    kotlin.jvm.internal.OooOo.OooO0Oo(r1, r3)
                    r3 = 0
                    r9.L$0 = r3
                    r9.label = r2
                    java.lang.Object r13 = r13.set(r1, r12)
                    if (r13 != r0) goto Lad
                Lac:
                    return r0
                Lad:
                    oo00o.OooOo r13 = oo00o.OooOo.f33195OooO00o
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver.C41282.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C41282(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return TransactionEventObserver.this.new C41282(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            oO00000o oo00000o;
            Object value;
            Boolean bool;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            o0OO o0oo = TransactionEventObserver.this.isRunning;
            do {
                oo00000o = (oO00000o) o0oo;
                value = oo00000o.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!oo00000o.OooO0oO(value, Boolean.TRUE));
            boolean zBooleanValue = bool.booleanValue();
            OooOo oooOo = OooOo.f33195OooO00o;
            if (zBooleanValue) {
                return oooOo;
            }
            o0o0000.OooOOo0(new o0O0OOO0(TransactionEventObserver.this.transactionEventRepository.getTransactionEvents(), new AnonymousClass2(TransactionEventObserver.this, null), 2), o0000OO0.OooO0O0(TransactionEventObserver.this.defaultDispatcher));
            return oooOo;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41282) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, o0000O00 defaultDispatcher, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource iapTransactionStore) {
        kotlin.jvm.internal.OooOo.OooO0o0(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.OooOo.OooO0o0(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.OooOo.OooO0o0(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = o0o0000.OooO0OO(Boolean.FALSE);
    }

    public final Object invoke(OooO0OO oooO0OO) throws Throwable {
        Object objOooo00O = o0000OO0.Oooo00O(new C41282(null), this.defaultDispatcher, oooO0OO);
        return objOooo00O == OooOo00.f31365OooOo0O ? objOooo00O : OooOo.f33195OooO00o;
    }
}
