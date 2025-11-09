package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.p010om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import gatewayprotocol.p014v1.UniversalResponseOuterClass;
import java.lang.reflect.InvocationTargetException;
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
import o00O0oO.o0000;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00OOOOo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final o0000O00 defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", m13472f = "AndroidInitializeBoldSDK.kt", m13473l = {124, 125, 128}, m13474m = "initializationSuccess")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 */
    public static final class C40831 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40831(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidInitializeBoldSDK.this.initializationSuccess(null, null, false, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", m13472f = "AndroidInitializeBoldSDK.kt", m13473l = {65, 82}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2 */
    public static final class C40842 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $source;
        int I$0;
        long J$0;
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", m13472f = "AndroidInitializeBoldSDK.kt", m13473l = {66, 68, 70, 71}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ boolean $isRetry;
            final /* synthetic */ String $source;
            int label;
            final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, oooO0OO);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
            
                if (r1.handleResponse((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13, r12) != r0) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[PHI: r9 r13
  0x0076: PHI (r9v2 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1) = 
  (r9v1 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
  (r9v3 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
 binds: [B:21:0x0073, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:21:0x0073, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // o00O0OO0.OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.unity3d.ads.core.data.model.exception.InitializationException {
                /*
                    r12 = this;
                    o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                    int r1 = r12.label
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2d
                    if (r1 == r5) goto L29
                    if (r1 == r4) goto L25
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    o00O0.o000OOo.OooOO0O(r13)
                    r9 = r12
                    goto L83
                L18:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L20:
                    o00O0.o000OOo.OooOO0O(r13)
                    r9 = r12
                    goto L76
                L25:
                    o00O0.o000OOo.OooOO0O(r13)
                    goto L54
                L29:
                    o00O0.o000OOo.OooOO0O(r13)
                    goto L40
                L2d:
                    o00O0.o000OOo.OooOO0O(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    java.lang.String r1 = r12.$source
                    boolean r6 = r12.$isRetry
                    r12.label = r5
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r13, r1, r6, r12)
                    if (r13 != r0) goto L40
                L3e:
                    r9 = r12
                    goto L82
                L40:
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetInitializationRequest r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r13)
                    r12.label = r4
                    java.lang.Object r13 = r13.invoke(r12)
                    if (r13 != r0) goto L54
                    goto L3e
                L54:
                    r6 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r13)
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                    r12.label = r3
                    r5 = 0
                    r10 = 1
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L76
                    goto L82
                L76:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r1 = r9.this$0
                    r9.label = r2
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$handleResponse(r1, r13, r12)
                    if (r13 != r0) goto L83
                L82:
                    return r0
                L83:
                    oo00o.OooOo r13 = oo00o.OooOo.f33195OooO00o
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.C40842.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40842(String str, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$source = str;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidInitializeBoldSDK.this.new C40842(this.$source, oooO0OO);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String, long] */
        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            long jOooO0O0;
            ?? r6;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            OooOo oooOo = OooOo.f33195OooO00o;
            try {
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    jOooO0O0 = o00O0oOO.OooOOOO.OooO0O0();
                    ?? r1 = !AndroidInitializeBoldSDK.this.sessionRepository.isFirstInitAttempt();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidInitializeBoldSDK.this, this.$source, r1, null);
                    this.J$0 = jOooO0O0;
                    this.I$0 = r1;
                    this.label = 1;
                    i = r1;
                    if (o0000OO0.OooOoo0(new o00OOOOo(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, this), anonymousClass1) != oooOo00) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                    return oooOo;
                }
                int i2 = this.I$0;
                jOooO0O0 = this.J$0;
                o000OOo.OooOO0O(obj);
                i = i2;
                AndroidInitializeBoldSDK androidInitializeBoldSDK = AndroidInitializeBoldSDK.this;
                o00O0oOO.OooOo oooOo2 = new o00O0oOO.OooOo(jOooO0O0);
                r6 = this.$source;
                boolean z = i != 0;
                this.label = 2;
                return androidInitializeBoldSDK.initializationSuccess(oooOo2, r6, z, this) == oooOo00 ? oooOo00 : oooOo;
            } catch (Exception e) {
                InitializationException from = InitializationException.Companion.parseFrom(e);
                if (e instanceof GatewayException) {
                    AndroidInitializeBoldSDK.this.sessionRepository.setShouldInitialize(false);
                }
                AndroidInitializeBoldSDK.this.initializationFailure(new o00O0oOO.OooOo(r6), from, this.$source, i != 0);
                return oooOo;
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40842) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidInitializeBoldSDK(o0000O00 defaultDispatcher, InitializeOMSDK initializeOM, GetInitializationRequest getInitializeRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader legacyConfigurationReader, SDKPropertiesManager sdkPropertiesManager, GetGameId getGameId, AndroidHandleFocusCounters handleFocusCounters) {
        kotlin.jvm.internal.OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(initializeOM, "initializeOM");
        kotlin.jvm.internal.OooOo.OooO0o0(getInitializeRequest, "getInitializeRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.OooOo.OooO0o0(cleanAssets, "cleanAssets");
        kotlin.jvm.internal.OooOo.OooO0o0(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        kotlin.jvm.internal.OooOo.OooO0o0(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(eventObservers, "eventObservers");
        kotlin.jvm.internal.OooOo.OooO0o0(triggerInitializeListener, "triggerInitializeListener");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(storageManager, "storageManager");
        kotlin.jvm.internal.OooOo.OooO0o0(legacyConfigurationReader, "legacyConfigurationReader");
        kotlin.jvm.internal.OooOo.OooO0o0(sdkPropertiesManager, "sdkPropertiesManager");
        kotlin.jvm.internal.OooOo.OooO0o0(getGameId, "getGameId");
        kotlin.jvm.internal.OooOo.OooO0o0(handleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
        this.handleFocusCounters = handleFocusCounters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws InitializationException {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        String strInvoke = this.getGameId.invoke();
        if ((strInvoke != null ? o0000.OooOoOO(strInvoke) : null) == null) {
            throw new InitializationException(OooO0oO.OooOo.OooOO0O("gameId \"", strInvoke, "\" should be a number."), null, "invalid_game_id", strInvoke, 2, null);
        }
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z) {
        OooOO0 oooOO0OooOOO0 = o0O0O00.OooOOO0();
        oooOO0OooOOO0.put("operation", OperationType.INITIALIZATION.toString());
        oooOO0OooOOO0.put("reason", initializationException.getReason());
        oooOO0OooOOO0.put("source", str);
        oooOO0OooOOO0.put("is_retry", String.valueOf(z));
        if (initializationException.getReasonDebug() != null) {
            oooOO0OooOOO0.put("reason_debug", initializationException.getReasonDebug());
        }
        return o0O0O00.OooOO0o(oooOO0OooOOO0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, o00O0O0O.OooO0OO oooO0OO) throws InitializationException {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
        }
        HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        kotlin.jvm.internal.OooOo.OooO0Oo(initializationResponse, "response.payload.initializationResponse");
        Object objInvoke = handleGatewayInitializationResponse.invoke(initializationResponse, oooO0OO);
        return objInvoke == OooOo00.f31365OooOo0O ? objInvoke : OooOo.f33195OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(o00O0oOO.OooOo00 oooOo00, InitializationException initializationException, String str, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Initialization Failure: " + initializationException.getMessage());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), getTags(initializationException, str, z), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z, o00O0O0O.OooO0OO oooO0OO) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Initialization Start");
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, o0O0O00.OooOOo0(new oo00o.OooOO0("source", str), new oo00o.OooOO0("is_retry", String.valueOf(z))), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object objInvoke = this.eventObservers.invoke(oooO0OO);
        return objInvoke == OooOo00.f31365OooOo0O ? objInvoke : OooOo.f33195OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializationSuccess(o00O0oOO.OooOo00 r18, java.lang.String r19, boolean r20, o00O0O0O.OooO0OO r21) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(o00O0oOO.OooOo00, java.lang.String, boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        kotlin.jvm.internal.OooOo.OooO0Oo(config, "config");
        diagnosticEventRepository.configure(config);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        Object objOooo00O = o0000OO0.Oooo00O(new C40842(str, null), this.defaultDispatcher, oooO0OO);
        return objOooo00O == OooOo00.f31365OooOo0O ? objOooo00O : OooOo.f33195OooO00o;
    }
}
