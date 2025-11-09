package com.unity3d.ads.adplayer;

import android.util.Base64;
import androidx.annotation.CallSuper;
import com.ironsource.InterfaceC3173h3;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.OooOo00;
import o00O.o0OoOo0;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0Oo.OooO0O0;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o0000oo;
import o00O0oOo.o000OO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OO;
import o00O0ooo.o0OO0o;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final o0000O00 dispatcher;
    private final o0OO isCompletedManually;
    private final o0OoOoOo onBroadcastEvents;
    private final o0OoOoOo onLoadEvent;
    private final o0OoOoOo onOfferwallEvent;
    private final o0OoOoOo onScarEvent;
    private final o0OoOoOo onShowEvent;
    private final o000OO scope;
    private final o0000O0 scopeCancellationHandler;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Oooo000 storageEventCallback;
    private final WebViewContainer webViewContainer;

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$1 */
    public /* synthetic */ class C39861 extends OooOo00 implements o00O0O {
        public C39861(Object obj) {
            super(2, obj, o0OO0oO0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(String str, OooO0OO oooO0OO) {
            return ((o0OO0oO0) this.receiver).emit(str, oooO0OO);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2 */
    public /* synthetic */ class C39872 extends OooOo00 implements o00O0O {
        public C39872(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(String str, OooO0OO oooO0OO) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, oooO0OO);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$onAllowedPiiChange$2 */
    public static final class C39882 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39882(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            OooOo.OooO0Oo(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnAllowedPiiChangeEvent(strEncodeToString);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$onBroadcastEvent$2 */
    public static final class C39892 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ String $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39892(String str) {
            super(0);
            this.$event = str;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject(this.$event);
            String eventType = jSONObject.getString("eventType");
            String strOptString = jSONObject.optString("data");
            OooOo.OooO0Oo(eventType, "eventType");
            return new OnBroadcastEvent(eventType, strOptString);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer", m13472f = "WebViewAdPlayer.kt", m13473l = {178, 179, 194}, m13474m = "requestShow")
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1 */
    public static final class C39901 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C39901(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendActivityDestroyed$2 */
    public static final class C39912 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        public static final C39912 INSTANCE = new C39912();

        public C39912() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnActivityDestroyedEvent();
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer", m13472f = "WebViewAdPlayer.kt", m13473l = {InterfaceC3173h3.c.b.f8815g, 220}, m13474m = "sendEvent")
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 */
    public static final class C39921 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39921(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.sendEvent(null, this);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendFocusChange$2 */
    public static final class C39932 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ boolean $isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39932(boolean z) {
            super(0);
            this.$isFocused = z;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnFocusChangeEvent(this.$isFocused);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendGmaEvent$2 */
    public static final class C39942 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ com.unity3d.scar.adapter.common.OooO0O0 $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39942(com.unity3d.scar.adapter.common.OooO0O0 oooO0O0) {
            super(0);
            this.$event = oooO0O0;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnGmaEvent(this.$event);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendMuteChange$2 */
    public static final class C39952 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ boolean $isMuted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39952(boolean z) {
            super(0);
            this.$isMuted = z;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnMuteChangeEvent(this.$isMuted);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendOfferwallEvent$2 */
    public static final class C39962 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ OfferwallEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39962(OfferwallEvent offerwallEvent) {
            super(0);
            this.$event = offerwallEvent;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnOfferwallEvent(this.$event);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendPrivacyFsmChange$2 */
    public static final class C39972 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39972(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            OooOo.OooO0Oo(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnPrivacyFsmChangeEvent(strEncodeToString);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendScarBannerEvent$2 */
    public static final class C39982 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ BannerBridge.BannerEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39982(BannerBridge.BannerEvent bannerEvent) {
            super(0);
            this.$event = bannerEvent;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnScarBannerEvent(this.$event);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendUserConsentChange$2 */
    public static final class C39992 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39992(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            OooOo.OooO0Oo(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnUserConsentChangeEvent(strEncodeToString);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVisibilityChange$2 */
    public static final class C40002 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ boolean $isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40002(boolean z) {
            super(0);
            this.$isVisible = z;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnVisibilityChangeEvent(this.$isVisible);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVolumeChange$2 */
    public static final class C40012 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ double $volume;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40012(double d) {
            super(0);
            this.$volume = d;
        }

        @Override // o00O0Oo.OooO0O0
        public final WebViewEvent invoke() {
            return new OnVolumeChangeEvent(this.$volume);
        }
    }

    public WebViewAdPlayer(WebViewBridge bridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, o0000O00 dispatcher, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, o000OO adPlayerScope) {
        OooOo.OooO0o0(bridge, "bridge");
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        OooOo.OooO0o0(webViewContainer, "webViewContainer");
        OooOo.OooO0o0(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        oO00000o oo00000oOooO0OO = o0o0000.OooO0OO(Boolean.FALSE);
        this.isCompletedManually = oo00000oOooO0OO;
        WebViewAdPlayer$storageEventCallback$1 webViewAdPlayer$storageEventCallback$1 = new WebViewAdPlayer$storageEventCallback$1(this);
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$1;
        WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 = new WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(o0000oo.f31508OooOo0O, this);
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = o0000OO0.OooOo0o(o0000OO0.OooOo0o(o0000OO0.OooOo0o(adPlayerScope, dispatcher), new o0000O0O("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1);
        final o0OOO0OO onInvocation = bridge.getOnInvocation();
        final o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2 */
            public static final class C39762<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", m13472f = "WebViewAdPlayer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return C39762.this.emit(null, this);
                    }
                }

                public C39762(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, o00O0O0O.OooO0OO r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.C39762.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.C39762.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r7)
                        goto L50
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        o00O0.o000OOo.OooOO0O(r7)
                        o00O0ooo.o0O000Oo r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = o00O0.OooOOO.Oooo00O(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.C39762.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = onInvocation.collect(new C39762(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        this.onScarEvent = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2 */
            public static final class C39812<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", m13472f = "WebViewAdPlayer.kt", m13473l = {224, 223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C39812.this.emit(null, this);
                    }
                }

                public C39812(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, o00O0O0O.OooO0OO r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.C39812.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.C39812.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L3f
                        if (r2 == r4) goto L33
                        if (r2 != r3) goto L2b
                        o00O0.o000OOo.OooOO0O(r8)
                        goto L6e
                    L2b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L33:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        o00O0ooo.o0O000Oo r2 = (o00O0ooo.o0O000Oo) r2
                        o00O0.o000OOo.OooOO0O(r8)
                        goto L53
                    L3f:
                        o00O0.o000OOo.OooOO0O(r8)
                        o00O0ooo.o0O000Oo r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L53
                        goto L6d
                    L53:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        boolean r8 = kotlin.jvm.internal.OooOo.OooO00o(r8, r4)
                        if (r8 == 0) goto L71
                        com.unity3d.ads.core.data.model.ScarEvent$Show r7 = com.unity3d.ads.core.data.model.ScarEvent.Show.INSTANCE
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L6e
                    L6d:
                        return r1
                    L6e:
                        oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                        return r7
                    L71:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Unexpected location: "
                        r0.<init>(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.C39812.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oooooo.collect(new C39812(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        final o0OOO0OO onInvocation2 = bridge.getOnInvocation();
        final o0OoOoOo o0oooooo2 = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2 */
            public static final class C39772<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", m13472f = "WebViewAdPlayer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
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
                        return C39772.this.emit(null, this);
                    }
                }

                public C39772(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, o00O0O0O.OooO0OO r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.C39772.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.C39772.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r7)
                        goto L50
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        o00O0.o000OOo.OooOO0O(r7)
                        o00O0ooo.o0O000Oo r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = o00O0.OooOOO.Oooo00O(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.C39772.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = onInvocation2.collect(new C39772(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        this.onOfferwallEvent = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2 */
            public static final class C39822<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", m13472f = "WebViewAdPlayer.kt", m13473l = {224, 223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C39822.this.emit(null, this);
                    }
                }

                public C39822(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, o00O0O0O.OooO0OO r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.C39822.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.C39822.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L3f
                        if (r2 == r4) goto L33
                        if (r2 != r3) goto L2b
                        o00O0.o000OOo.OooOO0O(r8)
                        goto L6e
                    L2b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L33:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        o00O0ooo.o0O000Oo r2 = (o00O0ooo.o0O000Oo) r2
                        o00O0.o000OOo.OooOO0O(r8)
                        goto L53
                    L3f:
                        o00O0.o000OOo.OooOO0O(r8)
                        o00O0ooo.o0O000Oo r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L53
                        goto L6d
                    L53:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        boolean r8 = kotlin.jvm.internal.OooOo.OooO00o(r8, r4)
                        if (r8 == 0) goto L71
                        com.unity3d.ads.core.data.model.OfferwallShowEvent$Show r7 = com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L6e
                    L6d:
                        return r1
                    L6e:
                        oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                        return r7
                    L71:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Unexpected location: "
                        r0.<init>(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.C39822.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oooooo2.collect(new C39822(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        final o0OOO0OO onInvocation3 = bridge.getOnInvocation();
        final o0OoOoOo o0oooooo3 = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2 */
            public static final class C39782<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", m13472f = "WebViewAdPlayer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
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
                        return C39782.this.emit(null, this);
                    }
                }

                public C39782(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, o00O0O0O.OooO0OO r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.C39782.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.C39782.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r7)
                        goto L4e
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        o00O0.o000OOo.OooOO0O(r7)
                        o00O0ooo.o0O000Oo r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getSHOW_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = o00O0.OooOOO.Oooo00O(r4, r2)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.C39782.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = onInvocation3.collect(new C39782(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        this.onShowEvent = new o0OO0o(new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2 */
            public static final class C39832<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", m13472f = "WebViewAdPlayer.kt", m13473l = {244, 223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
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
                        return C39832.this.emit(null, this);
                    }
                }

                public C39832(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0107, code lost:
                
                    if (r2.emit(r13, r0) == r1) goto L55;
                 */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r13, o00O0O0O.OooO0OO r14) {
                    /*
                        Method dump skipped, instructions count: 320
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.C39832.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oooooo3.collect(new C39832(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        }, oo00000oOooO0OO, new WebViewAdPlayer$onShowEvent$3(null));
        final o0OOO0OO onInvocation4 = bridge.getOnInvocation();
        final o0OoOoOo o0oooooo4 = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2 */
            public static final class C39792<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", m13472f = "WebViewAdPlayer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
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
                        return C39792.this.emit(null, this);
                    }
                }

                public C39792(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, o00O0O0O.OooO0OO r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.C39792.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.C39792.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r7)
                        goto L4e
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        o00O0.o000OOo.OooOO0O(r7)
                        o00O0ooo.o0O000Oo r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getLOAD_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = o00O0.OooOOO.Oooo00O(r4, r2)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.C39792.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = onInvocation4.collect(new C39792(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        this.onLoadEvent = new o0OoOo0(o0o0000.OooOOo(new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2 */
            public static final class C39842<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", m13472f = "WebViewAdPlayer.kt", m13473l = {224, 223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
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
                        return C39842.this.emit(null, this);
                    }
                }

                public C39842(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
                
                    if (r2.emit(r4, r0) == r1) goto L25;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, o00O0O0O.OooO0OO r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.C39842.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.C39842.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L3f
                        if (r2 == r4) goto L33
                        if (r2 != r3) goto L2b
                        o00O0.o000OOo.OooOO0O(r9)
                        goto L94
                    L2b:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L33:
                        java.lang.Object r8 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        java.lang.Object r2 = r0.L$0
                        o00O0ooo.o0O000Oo r2 = (o00O0ooo.o0O000Oo) r2
                        o00O0.o000OOo.OooOO0O(r9)
                        goto L53
                    L3f:
                        o00O0.o000OOo.OooOO0O(r9)
                        o00O0ooo.o0O000Oo r2 = r7.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        r0.L$0 = r2
                        r0.L$1 = r8
                        r0.label = r4
                        java.lang.Object r9 = com.unity3d.ads.adplayer.Invocation.handle$default(r8, r5, r0, r4, r5)
                        if (r9 != r1) goto L53
                        goto L93
                    L53:
                        java.lang.String r9 = r8.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.loadError"
                        boolean r9 = kotlin.jvm.internal.OooOo.OooO00o(r9, r4)
                        if (r9 == 0) goto L85
                        java.lang.Object[] r8 = r8.getParameters()
                        java.lang.Object r8 = o00O0.OooOOO.OoooOO0(r8)
                        java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                        kotlin.jvm.internal.OooOo.OooO0OO(r8, r9)
                        org.json.JSONObject r8 = (org.json.JSONObject) r8
                        java.lang.String r9 = "code"
                        int r9 = r8.optInt(r9)
                        java.lang.String r4 = "message"
                        java.lang.String r8 = r8.optString(r4)
                        com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                        java.lang.String r6 = "errorMessage"
                        kotlin.jvm.internal.OooOo.OooO0Oo(r8, r6)
                        r4.<init>(r8, r9)
                        goto L87
                    L85:
                        com.unity3d.ads.adplayer.model.LoadEvent$Completed r4 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                    L87:
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r8 = r2.emit(r4, r0)
                        if (r8 != r1) goto L94
                    L93:
                        return r1
                    L94:
                        oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.C39842.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oooooo4.collect(new C39842(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        }, getScope(), 1), 2);
        final o0OOO0OO onInvocation5 = bridge.getOnInvocation();
        final o0OoOoOo o0oooooo5 = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2 */
            public static final class C39802<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", m13472f = "WebViewAdPlayer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
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
                        return C39802.this.emit(null, this);
                    }
                }

                public C39802(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, o00O0O0O.OooO0OO r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.C39802.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.C39802.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r7)
                        goto L4c
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        o00O0.o000OOo.OooOO0O(r7)
                        o00O0ooo.o0O000Oo r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r2 = r2.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.broadcastEvent"
                        boolean r2 = kotlin.jvm.internal.OooOo.OooO00o(r2, r4)
                        if (r2 == 0) goto L4c
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4c
                        return r1
                    L4c:
                        oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.C39802.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = onInvocation5.collect(new C39802(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        o0OoOoOo o0oooooo6 = new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2 */
            public static final class C39852<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", m13472f = "WebViewAdPlayer.kt", m13473l = {224, 223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
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
                        return C39852.this.emit(null, this);
                    }
                }

                public C39852(o0O000Oo o0o000oo) {
                    this.$this_unsafeFlow = o0o000oo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, o00O0O0O.OooO0OO r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.C39852.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.C39852.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L3f
                        if (r2 == r4) goto L33
                        if (r2 != r3) goto L2b
                        o00O0.o000OOo.OooOO0O(r8)
                        goto L6c
                    L2b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L33:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        o00O0ooo.o0O000Oo r2 = (o00O0ooo.o0O000Oo) r2
                        o00O0.o000OOo.OooOO0O(r8)
                        goto L53
                    L3f:
                        o00O0.o000OOo.OooOO0O(r8)
                        o00O0ooo.o0O000Oo r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L53
                        goto L6b
                    L53:
                        java.lang.Object[] r7 = r7.getParameters()
                        java.lang.Object r7 = o00O0.OooOOO.OoooOO0(r7)
                        java.lang.String r7 = r7.toString()
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L6c
                    L6b:
                        return r1
                    L6c:
                        oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.C39852.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oooooo5.collect(new C39852(o0o000oo), oooO0OO);
                return objCollect == o00O0O0o.OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
            }
        };
        this.onBroadcastEvents = o0oooooo6;
        Storage.Companion.addStorageEventCallback(webViewAdPlayer$storageEventCallback$1);
        AdPlayer.Companion companion = AdPlayer.Companion;
        o0o0000.OooOOo0(new o0O0OOO0(o0oooooo6, new C39861(companion.getBroadcastEventChannel()), 2), getScope());
        o0o0000.OooOOo0(new o0O0OOO0(companion.getBroadcastEventChannel(), new C39872(this), 2), getScope());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendEvent(o00O0Oo.OooO0O0 r19, o00O0O0O.OooO0OO r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.C39921
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer.C39921) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            o00O0O0o.OooOo00 r3 = o00O0O0o.OooOo00.f31365OooOo0O
            int r4 = r2.label
            oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L44
            if (r4 == r7) goto L38
            if (r4 != r6) goto L30
            o00O0.o000OOo.OooOO0O(r1)
            return r5
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r4 = r2.L$1
            o00O0Oo.OooO0O0 r4 = (o00O0Oo.OooO0O0) r4
            java.lang.Object r7 = r2.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r7 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r7
            o00O0.o000OOo.OooOO0O(r1)
            goto L5b
        L44:
            o00O0.o000OOo.OooOO0O(r1)
            o00O0ooo.o0OoOoOo r1 = r0.getOnLoadEvent()
            r2.L$0 = r0
            r4 = r19
            r2.L$1 = r4
            r2.label = r7
            java.lang.Object r1 = o00O0ooo.o0o0000.OooOOoo(r1, r2)
            if (r1 != r3) goto L5a
            goto Lb3
        L5a:
            r7 = r0
        L5b:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r8 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r8 == 0) goto L9e
            com.unity3d.ads.core.domain.SendDiagnosticEvent r9 = r7.sendDiagnosticEvent
            oo00o.OooOO0 r2 = new oo00o.OooOO0
            java.lang.String r3 = "reason"
            java.lang.String r4 = "adviewer"
            r2.<init>(r3, r4)
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r3 = r1.getMessage()
            oo00o.OooOO0 r4 = new oo00o.OooOO0
            java.lang.String r6 = "reason_debug"
            r4.<init>(r6, r3)
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            oo00o.OooOO0 r3 = new oo00o.OooOO0
            java.lang.String r6 = "reason_code"
            r3.<init>(r6, r1)
            oo00o.OooOO0[] r1 = new oo00o.OooOO0[]{r2, r4, r3}
            java.util.Map r12 = o00O0.o0O0O00.OooOOo0(r1)
            r14 = 0
            r15 = 0
            java.lang.String r10 = "bridge_send_event_failed"
            r11 = 0
            r13 = 0
            r16 = 58
            r17 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L9e:
            java.lang.Object r1 = r4.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r4 = r7.bridge
            r7 = 0
            r2.L$0 = r7
            r2.L$1 = r7
            r2.label = r6
            java.lang.Object r1 = r4.sendEvent(r1, r2)
            if (r1 != r3) goto Lb4
        Lb3:
            return r3
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(o00O0Oo.OooO0O0, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @CallSuper
    public Object destroy(OooO0OO oooO0OO) {
        return AdPlayer.DefaultImpls.destroy(this, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        o0OO o0oo = this.isCompletedManually;
        Boolean bool = Boolean.TRUE;
        oO00000o oo00000o = (oO00000o) o0oo;
        oo00000o.getClass();
        oo00000o.OooO(null, bool);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o000OO getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39882(bArr), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39892(str), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0185, code lost:
    
        if (r10.bridge.request(com.ironsource.C3034d9.h.f8076K, com.ironsource.C3353m5.f9472v, new java.lang.Object[]{r8}, r0) != r1) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> r14, o00O0O0O.OooO0OO r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(C39912.INSTANCE, oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39932(z), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(com.unity3d.scar.adapter.common.OooO0O0 oooO0O0, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39942(oooO0O0), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39952(z), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39962(offerwallEvent), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39972(bArr), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39982(bannerEvent), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C39992(bArr), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C40002(z), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, OooO0OO oooO0OO) {
        Object objSendEvent = sendEvent(new C40012(d), oooO0OO);
        return objSendEvent == o00O0O0o.OooOo00.f31365OooOo0O ? objSendEvent : oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
