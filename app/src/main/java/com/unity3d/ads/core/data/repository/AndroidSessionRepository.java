package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import gatewayprotocol.p014v1.SessionCountersKt;
import gatewayprotocol.p014v1.SessionCountersOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oo.o0000oo;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OO;
import o00O0ooo.o0OO0o;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO00;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OOo000;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class AndroidSessionRepository implements SessionRepository {
    private final o0OO _currentState;
    private o0OO _gameId;
    private final o0OO _gatewayUrl;
    private final o0OO _headerBiddingTokenCounter;
    private final o0OO _initializationState;
    private final o0OO _isFirstInitAttempt;
    private final o0OO _isTestModeEnabled;
    private o0OO0oO0 _onChange;
    private final o0OO _sdkConfiguration;
    private final o0OO _sessionCounters;
    private final o0OO _sessionId;
    private final o0OO _sessionToken;
    private final o0OO _shouldInitialize;
    private final o0OO _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private final o0OO isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final o0OOO0OO onChange;
    private final o0OoOoOo persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats;

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", m13472f = "AndroidSessionRepository.kt", m13473l = {42}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1 */
    public static final class C40471 extends OooOOOO implements o00O0O {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40471(SendDiagnosticEvent sendDiagnosticEvent, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidSessionRepository.this.new C40471(this.$sendDiagnosticEvent, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    o0OO o0oo = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration from = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    OooOo.OooO0Oo(from, "parseFrom(data)");
                    oO00000o oo00000o = (oO00000o) o0oo;
                    oo00000o.getClass();
                    oo00000o.OooO(null, from);
                }
            } catch (Exception e) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, o0O0O00.OooOOOo(new OooOO0("debugReason", message)), null, null, null, 58, null);
            }
            o0OO o0oo2 = AndroidSessionRepository.this.isInit;
            Boolean bool = Boolean.TRUE;
            oO00000o oo00000o2 = (oO00000o) o0oo2;
            oo00000o2.getClass();
            oo00000o2.OooO(null, bool);
            return oo00o.OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40471) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", m13472f = "AndroidSessionRepository.kt", m13473l = {208}, m13474m = "getGatewayCache")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 */
    public static final class C40481 extends o00O0OO0.OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C40481(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", m13472f = "AndroidSessionRepository.kt", m13473l = {211}, m13474m = "getPrivacy")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 */
    public static final class C40491 extends o00O0OO0.OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C40491(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", m13472f = "AndroidSessionRepository.kt", m13473l = {217}, m13474m = "getPrivacyFsm")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 */
    public static final class C40501 extends o00O0OO0.OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C40501(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", m13472f = "AndroidSessionRepository.kt", m13473l = {213, 214}, m13474m = "setPrivacy")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 */
    public static final class C40511 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40511(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", m13472f = "AndroidSessionRepository.kt", m13473l = {219, 220}, m13474m = "setPrivacyFsm")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 */
    public static final class C40521 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40521(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(ByteStringDataSource gatewayCacheDataSource, ByteStringDataSource privacyDataSource, ByteStringDataSource fsmDataSource, ByteStringDataSource nativeConfigDataSource, NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, o0000O00 dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        OooOo.OooO0o0(gatewayCacheDataSource, "gatewayCacheDataSource");
        OooOo.OooO0o0(privacyDataSource, "privacyDataSource");
        OooOo.OooO0o0(fsmDataSource, "fsmDataSource");
        OooOo.OooO0o0(nativeConfigDataSource, "nativeConfigDataSource");
        OooOo.OooO0o0(defaultNativeConfiguration, "defaultNativeConfiguration");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        oO00000o oo00000oOooO0OO = o0o0000.OooO0OO(defaultNativeConfiguration);
        this._sdkConfiguration = oo00000oOooO0OO;
        oO00000o oo00000oOooO0OO2 = o0o0000.OooO0OO(Boolean.FALSE);
        this.isInit = oo00000oOooO0OO2;
        o0000OO0.OooOo0(o0000OO0.OooO0O0(dispatcher), null, new C40471(sendDiagnosticEvent, null), 3);
        final o0OO0o o0oo0o = new o0OO0o(oo00000oOooO0OO, oo00000oOooO0OO2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2 */
            public static final class C40452<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", m13472f = "AndroidSessionRepository.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(OooO0OO oooO0OO) {
                        super(oooO0OO);
                    }

                    @Override // o00O0OO0.OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C40452.this.emit(null, this);
                    }
                }

                public C40452(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.C40452.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.C40452.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r6)
                        goto L4a
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        o00O0.o000OOo.OooOO0O(r6)
                        o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                        r2 = r5
                        oo00o.OooOO0 r2 = (oo00o.OooOO0) r2
                        java.lang.Object r2 = r2.f33186OooOo0o
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L4a
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.C40452.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oo0o.collect(new C40452(o0o000oo), oooO0OO);
                return objCollect == OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        this.persistedNativeConfiguration = new o0OoOoOo() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2 */
            public static final class C40462<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", m13472f = "AndroidSessionRepository.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(OooO0OO oooO0OO) {
                        super(oooO0OO);
                    }

                    @Override // o00O0OO0.OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C40462.this.emit(null, this);
                    }
                }

                public C40462(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.C40462.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.C40462.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r6)
                        goto L41
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        o00O0.o000OOo.OooOO0O(r6)
                        o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                        oo00o.OooOO0 r5 = (oo00o.OooOO0) r5
                        java.lang.Object r5 = r5.f33185OooOo0O
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.C40462.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oooooo.collect(new C40462(o0o000oo), oooO0OO);
                return objCollect == OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        o0OOo000 o0ooo000OooO00o = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);
        this._onChange = o0ooo000OooO00o;
        this.onChange = new o0OOO00(o0ooo000OooO00o);
        String gameId = ClientProperties.getGameId();
        this._gameId = o0o0000.OooO0OO(gameId != null ? gameId : null);
        UUID uuidRandomUUID = UUID.randomUUID();
        OooOo.OooO0Oo(uuidRandomUUID, "randomUUID()");
        this._sessionId = o0o0000.OooO0OO(ProtobufExtensionsKt.toByteString(uuidRandomUUID));
        this._isTestModeEnabled = o0o0000.OooO0OO(Boolean.valueOf(SdkProperties.isTestMode()));
        SessionCountersOuterClass.SessionCounters sessionCountersBuild = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        OooOo.OooO0Oo(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = o0o0000.OooO0OO(sessionCountersBuild);
        this._tokenCounters = o0o0000.OooO0OO(new TokenCounters(0, 0, 0));
        ByteString EMPTY = ByteString.EMPTY;
        OooOo.OooO0Oo(EMPTY, "EMPTY");
        this._sessionToken = o0o0000.OooO0OO(EMPTY);
        this._currentState = o0o0000.OooO0OO(EMPTY);
        this._gatewayUrl = o0o0000.OooO0OO(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = o0o0000.OooO0OO(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = o0o0000.OooO0OO(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = o0o0000.OooO0OO(bool);
        this._isFirstInitAttempt = o0o0000.OooO0OO(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int i) {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusTime(dsl_create.getGlobalAdsFocusTime() + i);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        OooOo.OooO0Oo(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGameId() {
        oO00000o oo00000o;
        Object value;
        String gameId;
        o0OO o0oo = this._gameId;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!oo00000o.OooO0oO(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getGatewayCache(o00O0O0O.OooO0OO r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40481
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            o00O0.o000OOo.OooOO0O(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.gatewayCacheDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "gatewayCacheDataSource.get().data"
            kotlin.jvm.internal.OooOo.OooO0Oo(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache(o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getGatewayState() {
        return (ByteString) ((oO00000o) this._currentState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGatewayUrl() {
        return (String) ((oO00000o) this._gatewayUrl).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        oO00000o oo00000o;
        Object value;
        Number number;
        o0OO o0oo = this._headerBiddingTokenCounter;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            number = (Number) value;
        } while (!oo00000o.OooO0oO(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationState getInitializationState() {
        return (InitializationState) ((oO00000o) this._initializationState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (((Boolean) ((oO00000o) this.isInit).getValue()).booleanValue()) {
            return (NativeConfigurationOuterClass.NativeConfiguration) ((oO00000o) this._sdkConfiguration).getValue();
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new AndroidSessionRepository$nativeConfiguration$1(this, null));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public o0OoOoOo getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public o0OOO0OO getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getPrivacy(o00O0O0O.OooO0OO r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40491
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            o00O0.o000OOo.OooOO0O(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.privacyDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "privacyDataSource.get().data"
            kotlin.jvm.internal.OooOo.OooO0Oo(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy(o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getPrivacyFsm(o00O0O0O.OooO0OO r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40501
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            o00O0.o000OOo.OooOO0O(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.fsmDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "fsmDataSource.get().data"
            kotlin.jvm.internal.OooOo.OooO0Oo(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm(o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<InitializationResponseOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) ((oO00000o) this._sessionCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionId() {
        return (ByteString) ((oO00000o) this._sessionId).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionToken() {
        return (ByteString) ((oO00000o) this._sessionToken).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) ((oO00000o) this._shouldInitialize).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public TokenCounters getTokenCounters() {
        return (TokenCounters) ((oO00000o) this._tokenCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setFocusChangeCount(dsl_create.getFocusChangeCount() + 1);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusChangeCount(dsl_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        oO00000o oo00000o;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!oo00000o.OooO0oO(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        oO00000o oo00000o;
        Object value;
        TokenCounters tokenCounters;
        o0OO o0oo = this._tokenCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!oo00000o.OooO0oO(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        oO00000o oo00000o;
        Object value;
        TokenCounters tokenCounters;
        o0OO o0oo = this._tokenCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!oo00000o.OooO0oO(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        oO00000o oo00000o;
        Object value;
        TokenCounters tokenCounters;
        o0OO o0oo = this._tokenCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!oo00000o.OooO0oO(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        oO00000o oo00000o;
        Object value;
        Boolean bool;
        o0OO o0oo = this._isFirstInitAttempt;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!oo00000o.OooO0oO(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        oO00000o oo00000o;
        Object value;
        boolean zIsTestMode;
        o0OO o0oo = this._isTestModeEnabled;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            ((Boolean) value).getClass();
            zIsTestMode = SdkProperties.isTestMode();
        } while (!oo00000o.OooO0oO(value, Boolean.valueOf(zIsTestMode)));
        return zIsTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object persistNativeConfiguration(OooO0OO oooO0OO) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        OooOo.OooO0Oo(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, oooO0OO);
        return obj == OooOo00.f31365OooOo0O ? obj : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        oO00000o oo00000o;
        Object value;
        o0OO o0oo = this._tokenCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(String str) {
        oO00000o oo00000o;
        Object value;
        o0OO o0oo = this._gameId;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            ClientProperties.setGameId(str);
        } while (!oo00000o.OooO0oO(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setGatewayCache(ByteString byteString, OooO0OO oooO0OO) {
        Object obj = this.gatewayCacheDataSource.set(byteString, oooO0OO);
        return obj == OooOo00.f31365OooOo0O ? obj : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(ByteString value) {
        oO00000o oo00000o;
        Object value2;
        OooOo.OooO0o0(value, "value");
        o0OO o0oo = this._currentState;
        do {
            oo00000o = (oO00000o) o0oo;
            value2 = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(String value) {
        oO00000o oo00000o;
        Object value2;
        OooOo.OooO0o0(value, "value");
        o0OO o0oo = this._gatewayUrl;
        do {
            oo00000o = (oO00000o) o0oo;
            value2 = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(InitializationState value) {
        oO00000o oo00000o;
        Object value2;
        OooOo.OooO0o0(value, "value");
        o0OO o0oo = this._initializationState;
        do {
            oo00000o = (oO00000o) o0oo;
            value2 = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
        oO00000o oo00000o;
        Object value2;
        OooOo.OooO0o0(value, "value");
        o0OO o0oo = this._sdkConfiguration;
        do {
            oo00000o = (oO00000o) o0oo;
            value2 = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value2, value));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacy(com.google.protobuf.ByteString r6, o00O0O0O.OooO0OO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40511
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            o00O0.o000OOo.OooOO0O(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            o00O0.o000OOo.OooOO0O(r7)
            goto L51
        L3e:
            o00O0.o000OOo.OooOO0O(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.privacyDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            o00O0ooo.o0OO0oO0 r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r2 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.ByteString, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString r6, o00O0O0O.OooO0OO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40521
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C40521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            o00O0.o000OOo.OooOO0O(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            o00O0.o000OOo.OooOO0O(r7)
            goto L51
        L3e:
            o00O0.o000OOo.OooOO0O(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.fsmDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            o00O0ooo.o0OO0oO0 r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r2 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.ByteString, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
        oO00000o oo00000o;
        Object value2;
        OooOo.OooO0o0(value, "value");
        o0OO o0oo = this._sessionCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value2 = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(ByteString value) {
        oO00000o oo00000o;
        Object value2;
        OooOo.OooO0o0(value, "value");
        o0OO o0oo = this._sessionToken;
        do {
            oo00000o = (oO00000o) o0oo;
            value2 = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        oO00000o oo00000o;
        Object value;
        o0OO o0oo = this._shouldInitialize;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            ((Boolean) value).getClass();
        } while (!oo00000o.OooO0oO(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(TokenCounters value) {
        oO00000o oo00000o;
        Object value2;
        OooOo.OooO0o0(value, "value");
        o0OO o0oo = this._tokenCounters;
        do {
            oo00000o = (oO00000o) o0oo;
            value2 = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value2, value));
    }
}
