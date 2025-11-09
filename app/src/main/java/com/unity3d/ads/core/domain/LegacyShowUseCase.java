package com.unity3d.ads.core.domain;

import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.InterfaceC3173h3;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import gatewayprotocol.p014v1.OperativeEventErrorDataKt;
import gatewayprotocol.p014v1.OperativeEventRequestOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0Oo.o00oO0o;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOO0;
import oo00o.OooOo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final o0OO hasStarted;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final o0OO timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.LegacyShowUseCase", m13472f = "LegacyShowUseCase.kt", m13473l = {90, 95, InterfaceC3173h3.d.b.f8823f, 113, 121, WebSocketProtocol.PAYLOAD_SHORT, 132, 139, 144, 175}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1 */
    public static final class C41111 extends OooO0OO {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41111(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", m13472f = "LegacyShowUseCase.kt", m13473l = {158, 164, 165}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2 */
    public static final class C41122 extends OooOOOO implements o00O0O {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ String $placement;
        final /* synthetic */ o00oO0o $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41122(boolean z, AdObject adObject, boolean z2, o00oO0o o00oo0o, String str, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$isBanner = z;
            this.$adObject = adObject;
            this.$useTimeout = z2;
            this.$reportShowError = o00oo0o;
            this.$placement = str;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C41122 c41122 = LegacyShowUseCase.this.new C41122(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, oooO0OO);
            c41122.L$0 = obj;
            return c41122;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
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
                oo00o.OooOo r2 = oo00o.OooOo.f33195OooO00o
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r11.L$0
                o00O0Oo.OooO0O0 r0 = (o00O0Oo.OooO0O0) r0
                o00O0.o000OOo.OooOO0O(r12)
                goto Lb6
            L1a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L22:
                java.lang.Object r1 = r11.L$0
                o00O0Oo.OooO0O0 r1 = (o00O0Oo.OooO0O0) r1
                o00O0.o000OOo.OooOO0O(r12)
                goto L91
            L2a:
                java.lang.Object r1 = r11.L$0
                o00O0Oo.OooO0O0 r1 = (o00O0Oo.OooO0O0) r1
                o00O0.o000OOo.OooOO0O(r12)
                goto L7a
            L32:
                o00O0.o000OOo.OooOO0O(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                o00O0Oo.OooO0O0 r1 = (o00O0Oo.OooO0O0) r1
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                o00O0ooo.o0OO r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r12)
                o00O0ooo.oO00000o r12 = (o00O0ooo.oO00000o) r12
                java.lang.Object r12 = r12.getValue()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto Lb9
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                o00O0ooo.o0OO r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r12)
                o00O0ooo.oO00000o r12 = (o00O0ooo.oO00000o) r12
                java.lang.Object r12 = r12.getValue()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto Lb9
                boolean r12 = r11.$isBanner
                if (r12 == 0) goto L67
                goto Lb9
            L67:
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r6 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
                com.unity3d.ads.core.data.model.AdObject r7 = r11.$adObject
                r11.L$0 = r1
                r11.label = r5
                java.lang.String r5 = "timeout"
                java.lang.Object r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r12, r6, r5, r7, r11)
                if (r12 != r0) goto L7a
                goto Lb4
            L7a:
                boolean r12 = r11.$useTimeout
                if (r12 == 0) goto Lb9
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                com.unity3d.ads.core.domain.Show r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r12)
                com.unity3d.ads.core.data.model.AdObject r5 = r11.$adObject
                r11.L$0 = r1
                r11.label = r4
                java.lang.Object r12 = r12.terminate(r5, r11)
                if (r12 != r0) goto L91
                goto Lb4
            L91:
                o00O0Oo.o00oO0o r4 = r11.$reportShowError
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r5 = "[UnityAds] Timeout while trying to show "
                r12.<init>(r5)
                java.lang.String r5 = r11.$placement
                r12.append(r5)
                java.lang.String r7 = r12.toString()
                r11.L$0 = r1
                r11.label = r3
                java.lang.String r5 = "timeout"
                r8 = 0
                r9 = 0
                r10 = r11
                java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                r0 = r1
            Lb6:
                r0.invoke()
            Lb9:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.C41122.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
            return ((C41122) create(oooO0O0, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", m13472f = "LegacyShowUseCase.kt", m13473l = {170}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3 */
    public static final class C41133 extends OooOOOO implements o00Oo0 {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ o00oO0o $reportShowError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41133(o00oO0o o00oo0o, boolean z, o00O0O0O.OooO0OO oooO0OO) {
            super(3, oooO0OO);
            this.$reportShowError = o00oo0o;
            this.$isBanner = z;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            C41133 c41133;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Throwable th = (Throwable) this.L$0;
                o00oO0o o00oo0o = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                this.label = 1;
                c41133 = this;
                if (o00oo0o.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, c41133) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                c41133 = this;
            }
            if (!c41133.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00Oo0
        public final Object invoke(o0O000Oo o0o000oo, Throwable th, o00O0O0O.OooO0OO oooO0OO) {
            C41133 c41133 = new C41133(this.$reportShowError, this.$isBanner, oooO0OO);
            c41133.L$0 = th;
            return c41133.invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4 */
    public static final class C41144<T> implements o0O000Oo {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ o00oO0o $reportShowError;
        final /* synthetic */ long $startTime;

        public C41144(long j, String str, Listeners listeners, AdObject adObject, o00oO0o o00oo0o) {
            this.$startTime = j;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = o00oo0o;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        @Override // o00O0ooo.o0O000Oo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r20, o00O0O0O.OooO0OO r21) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                Method dump skipped, instructions count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.C41144.emit(com.unity3d.ads.core.data.model.ShowEvent, o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$1 */
    public static final class C41151 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41151(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13775invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13775invoke() {
            this.$listeners.onClick(this.$placement);
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$1 */
    public static final class C41161 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ ShowStatus $status;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41161(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
            this.$status = showStatus;
            this.this$0 = legacyShowUseCase;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13776invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13776invoke() {
            Listeners listeners = this.$listeners;
            String str = this.$placement;
            ShowStatus showStatus = this.$status;
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this.this$0.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
            kotlin.jvm.internal.OooOo.OooO0Oo(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
            listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", m13472f = "LegacyShowUseCase.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1 */
    public static final class C41171 extends OooOOOO implements o00oO0o {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ o00O0oOO.OooOo00 $startTime;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ Listeners $listeners;
            final /* synthetic */ String $message;
            final /* synthetic */ String $placement;
            final /* synthetic */ UnityAds.UnityAdsShowError $reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                super(0);
                this.$listeners = listeners;
                this.$placement = str;
                this.$reason = unityAdsShowError;
                this.$message = str2;
            }

            @Override // o00O0Oo.OooO0O0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13777invoke();
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13777invoke() {
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41171(String str, LegacyShowUseCase legacyShowUseCase, o00O0oOO.OooOo00 oooOo00, Listeners listeners, o00O0O0O.OooO0OO oooO0OO) {
            super(6, oooO0OO);
            this.$placement = str;
            this.this$0 = legacyShowUseCase;
            this.$startTime = oooOo00;
            this.$listeners = listeners;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            String str = (String) this.L$0;
            UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_failure_time", new Double(TimeExtensionsKt.elapsedMillis(this.$startTime)), this.this$0.getTags(str, num, str3), null, this.this$0.adObject, null, 40, null);
            this.this$0.safeCallbackInvoke.invoke(new AnonymousClass1(this.$listeners, this.$placement, unityAdsShowError, str2));
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00oO0o
        public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, o00O0O0O.OooO0OO oooO0OO) {
            C41171 c41171 = new C41171(this.$placement, this.this$0, this.$startTime, this.$listeners, oooO0OO);
            c41171.L$0 = str;
            c41171.L$1 = unityAdsShowError;
            c41171.L$2 = str2;
            c41171.L$3 = num;
            c41171.L$4 = str3;
            return c41171.invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$1 */
    public static final class C41181 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41181(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13778invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13778invoke() {
            this.$listeners.onStart(this.$placement);
        }
    }

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke) {
        kotlin.jvm.internal.OooOo.OooO0o0(show, "show");
        kotlin.jvm.internal.OooOo.OooO0o0(adRepository, "adRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.OooOo.OooO0o0(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(safeCallbackInvoke, "safeCallbackInvoke");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = o0o0000.OooO0OO(bool);
        this.timeoutCancellationRequested = o0o0000.OooO0OO(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(o00O0oOO.OooOo00 oooOo00, String str, Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Left Application for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), null, null, this.adObject, null, 44, null);
        listeners.onLeftApplication(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(o00O0oOO.OooOo00 oooOo00) {
        o0OO o0oo = this.timeoutCancellationRequested;
        Boolean bool = Boolean.TRUE;
        oO00000o oo00000o = (oO00000o) o0oo;
        oo00000o.getClass();
        oo00000o.OooO(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), null, null, this.adObject, null, 44, null);
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object objOpt;
        String string;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null || (string = objOpt.toString()) == null) {
            return null;
        }
        return UUID.fromString(string).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        LinkedHashMap linkedHashMapOooOOo = o0O0O00.OooOOo(new OooOO0("operation", OperationType.SHOW.toString()), new OooOO0("reason", str));
        if (num != null) {
        }
        if (str2 != null) {
            linkedHashMapOooOOo.put("reason_debug", str2);
        }
        return linkedHashMapOooOOo;
    }

    private final AdObject getTmpAdObject() {
        Object objOooO0O0;
        ByteString opportunityIdByteString;
        ByteString byteStringUtf8;
        try {
            UnityAdsShowOptions unityAdsShowOptions = this.unityAdsShowOptions;
            objOooO0O0 = unityAdsShowOptions != null ? getOpportunityId(unityAdsShowOptions) : null;
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        String str = (String) (objOooO0O0 instanceof oo00o.OooOO0O ? null : objOooO0O0);
        if (str == null) {
            opportunityIdByteString = ByteString.EMPTY;
        } else {
            UUID uuidFromString = UUID.fromString(str);
            kotlin.jvm.internal.OooOo.OooO0Oo(uuidFromString, "fromString(opportunityId)");
            opportunityIdByteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        }
        AdRepository adRepository = this.adRepository;
        kotlin.jvm.internal.OooOo.OooO0Oo(opportunityIdByteString, "opportunityIdByteString");
        AdObject ad = adRepository.getAd(opportunityIdByteString);
        if (ad != null) {
            return ad;
        }
        if (str == null || (byteStringUtf8 = ByteStringsKt.toByteStringUtf8(str)) == null) {
            byteStringUtf8 = ByteString.EMPTY;
        }
        ByteString byteString = byteStringUtf8;
        kotlin.jvm.internal.OooOo.OooO0Oo(byteString, "opportunityId?.toByteStr…tf8() ?: ByteString.EMPTY");
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        ByteString EMPTY = ByteString.EMPTY;
        kotlin.jvm.internal.OooOo.OooO0Oo(EMPTY, "EMPTY");
        return new AdObject(byteString, str2, EMPTY, false, null, null, null, false, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, o00O0O0O.OooO0OO oooO0OO) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        kotlin.jvm.internal.OooOo.OooO0Oo(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, oooO0OO);
        return objInvoke == OooOo00.f31365OooOo0O ? objInvoke : OooOo.f33195OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(o00O0oOO.OooOo00 oooOo00, String str, Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Clicked for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new C41151(listeners, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(o00O0oOO.OooOo00 oooOo00, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Completed for placement " + str);
        o00O0O00.OooOO0 oooOO0OooOOO0 = o0O0O00.OooOOO0();
        if (str2 != null) {
        }
        if (str3 != null) {
            oooOO0OooOOO0.put("reason_debug", str3);
        }
        o00O0O00.OooOO0 oooOO0OooOO0o = o0O0O00.OooOO0o(oooOO0OooOOO0);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), oooOO0OooOO0o, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new C41161(listeners, str, showStatus, this));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, o00O0oOO.OooOo00 oooOo00, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, int i, Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(oooOo00, str, showStatus, listeners, str2, str3);
    }

    private final o00oO0o showError(o00O0oOO.OooOo00 oooOo00, String str, Listeners listeners) {
        return new C41171(str, this, oooOo00, listeners, null);
    }

    private final void showStart() {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(o00O0oOO.OooOo00 oooOo00, String str, Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show WV Start for placement " + str);
        o0OO o0oo = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        oO00000o oo00000o = (oO00000o) o0oo;
        oo00000o.getClass();
        oo00000o.OooO(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new C41181(listeners, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0285 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0286 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(android.app.Activity r26, java.lang.String r27, com.unity3d.ads.UnityAdsShowOptions r28, com.unity3d.ads.core.data.model.Listeners r29, o00O0O0O.OooO0OO r30) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(android.app.Activity, java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
