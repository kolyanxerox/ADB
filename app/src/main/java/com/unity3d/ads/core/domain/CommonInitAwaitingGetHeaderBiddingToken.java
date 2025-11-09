package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.jvm.internal.Oooo000;
import o00O0.OooOOO;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O00.OooOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", m13472f = "CommonInitAwaitingGetHeaderBiddingToken.kt", m13473l = {73}, m13474m = "fetchToken")
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 */
    public static final class C40991 extends OooO0OO {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40991(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(0, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", m13472f = "CommonInitAwaitingGetHeaderBiddingToken.kt", m13473l = {54, 66}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 */
    public static final class C41001 extends OooO0OO {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41001(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.invoke(0, null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", m13472f = "CommonInitAwaitingGetHeaderBiddingToken.kt", m13473l = {57}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 */
    public static final class C41012 extends OooOOOO implements o00O0O {
        int label;

        public C41012(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return CommonInitAwaitingGetHeaderBiddingToken.this.new C41012(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                if (OooOOO.Oooo00O(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null))) {
                    CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                    AwaitInitialization awaitInitialization = CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization();
                    this.label = 1;
                    if (AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null) == oooOo00) {
                        return oooOo00;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C41012) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenFailure$2 */
    public static final class C41022 extends Oooo000 implements OooO0O0 {
        public C41022() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13771invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13771invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(null);
            }
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1 */
    public static final class C41031 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41031(String str) {
            super(0);
            this.$token = str;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13772invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13772invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(this.$token);
            }
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke) {
        kotlin.jvm.internal.OooOo.OooO0o0(getHeaderBiddingToken, "getHeaderBiddingToken");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.OooOo.OooO0o0(awaitInitialization, "awaitInitialization");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(safeCallbackInvoke, "safeCallbackInvoke");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.startTime = o00O0oOO.OooOOOO.OooO0O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchToken(int r6, com.unity3d.ads.TokenConfiguration r7, o00O0O0O.OooO0OO r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C40991
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C40991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r7 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r7
            o00O0.o000OOo.OooOO0O(r8)     // Catch: java.lang.Exception -> L2e
            goto L4b
        L2e:
            r8 = move-exception
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            o00O0.o000OOo.OooOO0O(r8)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r8 = r5.getHeaderBiddingToken     // Catch: java.lang.Exception -> L51
            r0.L$0 = r5     // Catch: java.lang.Exception -> L51
            r0.I$0 = r6     // Catch: java.lang.Exception -> L51
            r0.label = r3     // Catch: java.lang.Exception -> L51
            java.lang.Object r8 = r8.invoke(r6, r7, r0)     // Catch: java.lang.Exception -> L51
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r7 = r5
        L4b:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L2e
            r0 = r4
            r4 = r8
            r8 = r0
            goto L5a
        L51:
            r8 = move-exception
            r7 = r5
        L53:
            r0 = 0
            java.lang.String r8 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r8, r0, r3, r4)
            java.lang.String r0 = "uncaught_exception"
        L5a:
            if (r4 != 0) goto L60
            r7.tokenFailure(r6, r0, r8)
            goto L63
        L60:
            r7.tokenSuccess(r6, r4)
        L63:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(int, com.unity3d.ads.TokenConfiguration, o00O0O0O.OooO0OO):java.lang.Object");
    }

    private final void tokenFailure(int i, String str, String str2) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double dValueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new o00O0oOO.OooOo(this.startTime)));
        OooOO0 oooOO0OooOOO0 = o0O0O00.OooOOO0();
        oooOO0OooOOO0.put("sync", "false");
        oooOO0OooOOO0.put("state", String.valueOf(this.startState));
        oooOO0OooOOO0.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        oooOO0OooOOO0.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
        }
        if (str2 != null) {
            oooOO0OooOOO0.put("reason_debug", str2);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", dValueOf, o0O0O00.OooOO0o(oooOO0OooOOO0), null, null, Integer.valueOf(i), 24, null);
        this.safeCallbackInvoke.invoke(new C41022());
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2);
    }

    private final void tokenStart(int i) {
        InitializationState initializationStateInvoke$default = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        this.startState = initializationStateInvoke$default;
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, o0O0O00.OooOOo0(new oo00o.OooOO0("sync", "false"), new oo00o.OooOO0("state", String.valueOf(initializationStateInvoke$default))), null, null, Integer.valueOf(i), 26, null);
    }

    private final void tokenSuccess(int i, String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(new o00O0oOO.OooOo(this.startTime))), o0O0O00.OooOOo0(new oo00o.OooOO0("sync", "false"), new oo00o.OooOO0("state", String.valueOf(this.startState)), new oo00o.OooOO0("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new oo00o.OooOO0("awaited_init", String.valueOf(this.didAwaitInit))), null, null, Integer.valueOf(i), 24, null);
        this.safeCallbackInvoke.invoke(new C41031(str));
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name */
    public final long m13770getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r10, com.unity3d.ads.TokenConfiguration r11, com.unity3d.ads.IUnityAdsTokenListener r12, o00O0O0O.OooO0OO r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C41001
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C41001) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            java.lang.String r3 = "!sessionRepository.shouldInitialize"
            java.lang.String r4 = "gateway"
            r5 = 2
            r6 = 1
            r7 = 0
            oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
            if (r2 == 0) goto L47
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            o00O0.o000OOo.OooOO0O(r13)
            goto La2
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            com.unity3d.ads.TokenConfiguration r11 = (com.unity3d.ads.TokenConfiguration) r11
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r12 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r12
            o00O0.o000OOo.OooOO0O(r13)
            goto L89
        L47:
            o00O0.o000OOo.OooOO0O(r13)
            r9.listener = r12
            r9.tokenStart(r10)
            if (r12 != 0) goto L59
            java.lang.String r11 = "listener_null"
            java.lang.String r12 = "IUnityAdsTokenListener is null"
            r9.tokenFailure(r10, r11, r12)
            return r8
        L59:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r9.sessionRepository
            boolean r12 = r12.getShouldInitialize()
            if (r12 != 0) goto L65
            r9.tokenFailure(r10, r4, r3)
            return r8
        L65:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r9.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r12 = r12.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfiguration r12 = r12.getAdOperations()
            int r12 = r12.getGetTokenTimeoutMs()
            long r12 = (long) r12
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 r2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2
            r2.<init>(r7)
            r0.L$0 = r9
            r0.L$1 = r11
            r0.I$0 = r10
            r0.label = r6
            java.lang.Object r12 = o00O0oOo.o0000OO0.Oooo00o(r12, r2, r0)
            if (r12 != r1) goto L88
            goto La1
        L88:
            r12 = r9
        L89:
            com.unity3d.ads.core.data.repository.SessionRepository r13 = r12.sessionRepository
            boolean r13 = r13.getShouldInitialize()
            if (r13 != 0) goto L95
            r12.tokenFailure(r10, r4, r3)
            return r8
        L95:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r10 = r12.fetchToken(r10, r11, r0)
            if (r10 != r1) goto La2
        La1:
            return r1
        La2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
