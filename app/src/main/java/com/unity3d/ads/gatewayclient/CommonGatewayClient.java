package com.unity3d.ads.gatewayclient;

import com.google.android.gms.internal.measurement.o0OO0O0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.ironsource.InterfaceC3173h3;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.p014v1.ErrorKt;
import gatewayprotocol.p014v1.ErrorOuterClass;
import gatewayprotocol.p014v1.UniversalRequestOuterClass;
import gatewayprotocol.p014v1.UniversalResponseKt;
import gatewayprotocol.p014v1.UniversalResponseOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O00.OooOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oO.o0OO00O;
import o00O0oOo.o000OO;
import o00oOOo.o0Oo0oo;
import oo00o.OooOo;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes3.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClient httpClient;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", m13472f = "CommonGatewayClient.kt", m13473l = {118}, m13474m = "executeRequest")
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1 */
    public static final class C41951 extends OooO0OO {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41951(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeRequest(null, 0, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", m13472f = "CommonGatewayClient.kt", m13473l = {75, 81, InterfaceC3173h3.d.b.f8823f}, m13474m = "executeWithRetry")
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1 */
    public static final class C41961 extends OooO0OO {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C41961(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeWithRetry(null, null, null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", m13472f = "CommonGatewayClient.kt", m13473l = {59}, m13474m = "request")
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 */
    public static final class C41971 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41971(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.request(null, null, null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", m13472f = "CommonGatewayClient.kt", m13473l = {PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2 */
    public static final class C41982 extends OooOOOO implements o00O0O {
        final /* synthetic */ OperationType $operationType;
        final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
        final /* synthetic */ RequestPolicy $requestPolicy;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41982(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
            this.$operationType = operationType;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return CommonGatewayClient.this.new C41982(this.$url, this.$request, this.$requestPolicy, this.$operationType, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws InvalidProtocolBufferException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, NetworkTimeoutException, InvocationTargetException {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            CommonGatewayClient commonGatewayClient = CommonGatewayClient.this;
            String str = this.$url;
            UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
            RequestPolicy requestPolicy = this.$requestPolicy;
            OperationType operationType = this.$operationType;
            this.label = 1;
            Object objExecuteWithRetry = commonGatewayClient.executeWithRetry(str, universalRequest, requestPolicy, operationType, this);
            return objExecuteWithRetry == oooOo00 ? oooOo00 : objExecuteWithRetry;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C41982) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public CommonGatewayClient(HttpClient httpClient, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository) {
        kotlin.jvm.internal.OooOo.OooO0o0(httpClient, "httpClient");
        kotlin.jvm.internal.OooOo.OooO0o0(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.httpClient = httpClient;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    private final HttpRequest buildHttpRequest(String str, Map<String, ? extends List<String>> map, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest universalRequest) {
        return new HttpRequest(str, null, RequestType.POST, universalRequest.toByteArray(), map, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long j, RequestPolicy requestPolicy, int i) {
        return Math.min(calculateExponentialBackoff(j, requestPolicy, i) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long j, RequestPolicy requestPolicy, int i) {
        if (i == 0) {
            return j;
        }
        return (long) (requestPolicy.getRetryScalingFactor() * j);
    }

    private final long calculateJitter(int i, float f) {
        if (f == 0.0f) {
            return 0L;
        }
        long j = (long) (i * f);
        return o0Oo0oo.f32797OooOo0O.OooO0o0(-j, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object executeRequest(com.unity3d.services.core.network.model.HttpRequest r22, int r23, com.unity3d.ads.core.data.model.OperationType r24, o00O0O0O.OooO0OO r25) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeRequest(com.unity3d.services.core.network.model.HttpRequest, int, com.unity3d.ads.core.data.model.OperationType, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0185 -> B:50:0x018b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object executeWithRetry(java.lang.String r31, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r32, com.unity3d.ads.gatewayclient.RequestPolicy r33, com.unity3d.ads.core.data.model.OperationType r34, o00O0O0O.OooO0OO r35) throws com.google.protobuf.InvalidProtocolBufferException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, com.unity3d.ads.core.data.model.exception.NetworkTimeoutException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, o00O0O0O.OooO0OO):java.lang.Object");
    }

    private final String getGatewayUrl(String str) {
        return !kotlin.jvm.internal.OooOo.OooO00o(str, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? str : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int i) {
        OooOO0 oooOO0OooOOO0 = o0O0O00.OooOOO0();
        oooOO0OooOOO0.put("Content-Type", o0OO0O0.OooOO0o(HEADER_PROTOBUF));
        if (i > 0) {
            oooOO0OooOOO0.put(HEADER_RETRY_ATTEMPT, o0OO0O0.OooOO0o(String.valueOf(i)));
        }
        return o0O0O00.OooOO0o(oooOO0OooOOO0);
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse httpResponse, OperationType operationType) throws InvalidProtocolBufferException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse from = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                kotlin.jvm.internal.OooOo.OooO0Oo(from, "parseFrom(responseBody)");
                return from;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(o0OO00O.f31451OooO00o);
            kotlin.jvm.internal.OooOo.OooO0Oo(bytes, "this as java.lang.String).getBytes(charset)");
            UniversalResponseOuterClass.UniversalResponse from2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            kotlin.jvm.internal.OooOo.OooO0Oo(from2, "parseFrom(\n             ….UTF_8)\n                )");
            return from2;
        } catch (InvalidProtocolBufferException e) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, o0O0O00.OooOOo0(new oo00o.OooOO0("operation", operationType.toString()), new oo00o.OooOO0("reason", "protobuf_parsing"), new oo00o.OooOO0("reason_debug", httpResponse.getBody().toString())), null, null, null, 58, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.Companion;
            UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
            UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.Companion;
            ErrorOuterClass.Error.Builder builderNewBuilder2 = ErrorOuterClass.Error.newBuilder();
            kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder2, "newBuilder()");
            ErrorKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
            dsl_create2.setErrorText("ERROR: Could not parse response from gateway service");
            dsl_create.setError(dsl_create2._build());
            return dsl_create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i, OperationType operationType, o00O0oOO.OooOo00 oooOo00) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), o0O0O00.OooOOo(new oo00o.OooOO0("operation", operationType.toString()), new oo00o.OooOO0("retries", String.valueOf(i)), new oo00o.OooOO0("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), new oo00o.OooOO0("network_client", String.valueOf(unityAdsNetworkException.getClient())), new oo00o.OooOO0("reason_code", String.valueOf(unityAdsNetworkException.getCode())), new oo00o.OooOO0("reason_debug", unityAdsNetworkException.getMessage())), null, null, null, 56, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i, OperationType operationType, o00O0oOO.OooOo00 oooOo00) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), o0O0O00.OooOOo(new oo00o.OooOO0("operation", operationType.toString()), new oo00o.OooOO0("retries", String.valueOf(i)), new oo00o.OooOO0("protocol", httpResponse.getProtocol()), new oo00o.OooOO0("network_client", httpResponse.getClient()), new oo00o.OooOO0("reason_code", String.valueOf(httpResponse.getStatusCode()))), null, null, null, 56, null);
    }

    private final boolean shouldRetry(int i, long j, int i2) {
        return 400 <= i && i < 600 && j < ((long) i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object request(java.lang.String r14, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r15, com.unity3d.ads.gatewayclient.RequestPolicy r16, com.unity3d.ads.core.data.model.OperationType r17, o00O0O0O.OooO0OO r18) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient.C41971
            if (r1 == 0) goto L15
            r1 = r0
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r1 = (com.unity3d.ads.gatewayclient.CommonGatewayClient.C41971) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            o00O0O0o.OooOo00 r9 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r1.label
            r10 = 1
            if (r2 == 0) goto L35
            if (r2 != r10) goto L2d
            java.lang.Object r1 = r1.L$0
            com.unity3d.ads.gatewayclient.RequestPolicy r1 = (com.unity3d.ads.gatewayclient.RequestPolicy) r1
            o00O0.o000OOo.OooOO0O(r0)
            goto L61
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            o00O0.o000OOo.OooOO0O(r0)
            int r0 = o00O0oOO.OooOO0O.f31462OooOoO0
            int r0 = r16.getMaxDuration()
            o00O0oOO.OooOOO r2 = o00O0oOO.OooOOO.f31464OooOo
            long r11 = Oooo0oO.o00000.OooOO0o(r0, r2)
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2 r2 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2
            r8 = 0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r4, r5, r6, r7, r8)
            r1.L$0 = r6
            r1.label = r10
            long r3 = o00O0oOo.o0000OO0.OooOooO(r11)
            java.lang.Object r0 = o00O0oOo.o0000OO0.Oooo00o(r3, r2, r1)
            if (r0 != r9) goto L60
            return r9
        L60:
            r1 = r6
        L61:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r0 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r0
            if (r0 == 0) goto L66
            return r0
        L66:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r2 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Gateway request timed out after "
            r0.<init>(r3)
            int r1 = r1.getMaxDuration()
            r0.append(r1)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r10 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.request(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
