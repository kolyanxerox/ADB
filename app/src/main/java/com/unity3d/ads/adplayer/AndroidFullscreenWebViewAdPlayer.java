package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOOO0;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000;
import o00O0oOo.o00000O0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import o00O0oo.o0000oo;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.oO000O0;
import oo00o.OooO0OO;
import oo00o.OooOo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final o0OO0oO0 displayMessages = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);
    private final OooO0OO adObject$delegate;
    private final AdRepository adRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final o0OO0oO0 getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {170, 175, 179, 181}, m13474m = "destroy")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 */
    public static final class C39391 extends o00O0OO0.OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39391(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {190, 191, 192, 193, 194, 196}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 */
    public static final class C39401 extends OooOOOO implements o00O0O {
        final /* synthetic */ DisplayMessage $displayMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39401(DisplayMessage displayMessage, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$displayMessage = displayMessage;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidFullscreenWebViewAdPlayer.this.new C39401(this.$displayMessage, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0066, code lost:
        
            if (r11.requestShow(r1, r10) == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        
            if (r11.emit(r1, r10) == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ac, code lost:
        
            if (r11.sendVisibilityChange(r1, r10) == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
        
            if (r11.sendFocusChange(r1, r10) == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00dc, code lost:
        
            if (r11.sendActivityDestroyed(r10) == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00ec, code lost:
        
            if (r11.destroy(r10) == r0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00ee, code lost:
        
            return r0;
         */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C39401.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39401) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1 */
    public static final class C39411 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00000 $listenerStarted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39411(o00000 o00000Var, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$listenerStarted = o00000Var;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C39411(this.$listenerStarted, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            o00000 o00000Var = this.$listenerStarted;
            OooOo oooOo = OooOo.f33195OooO00o;
            ((o00000O0) o00000Var).Oooo0oO(oooOo);
            return oooOo;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39411) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {144, 149}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10 */
    public static final class C394210 extends OooOOOO implements o00O0O {
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {143}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1 */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass1(this.this$0, this.$showOptions, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == oooOo00) {
                        return oooOo00;
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
            public final Object invoke(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2 */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(oooO0OO);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(OfferwallShowEvent offerwallShowEvent, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(offerwallShowEvent, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return Boolean.valueOf(kotlin.jvm.internal.OooOo.OooO00o((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
            }
        }

        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4 */
        public /* synthetic */ class AnonymousClass4 implements o0O000Oo, OooOOO0 {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // o00O0ooo.o0O000Oo
            public final Object emit(OfferwallEvent offerwallEvent, o00O0O0O.OooO0OO oooO0OO) {
                Object objSendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, oooO0OO);
                return objSendOfferwallEvent == OooOo00.f31365OooOo0O ? objSendOfferwallEvent : OooOo.f33195OooO00o;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof o0O000Oo) && (obj instanceof OooOOO0)) {
                    return kotlin.jvm.internal.OooOo.OooO00o(getFunctionDelegate(), ((OooOOO0) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.OooOOO0
            public final oo00o.OooO00o getFunctionDelegate() {
                return new kotlin.jvm.internal.OooOo00(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C394210(ShowOptions showOptions, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$showOptions = showOptions;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidFullscreenWebViewAdPlayer.this.new C394210(this.$showOptions, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
        
            if (r1.collect(r3, r7) == r0) goto L39;
         */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                o00O0.o000OOo.OooOO0O(r8)
                goto L7c
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                o00O0.o000OOo.OooOO0O(r8)
                goto L42
            L1c:
                o00O0.o000OOo.OooOO0O(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                o00O0ooo.o0OoOoOo r8 = r8.getOnOfferwallEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r1.<init>(r4, r5, r6)
                o00O0ooo.o0oO0O0o r4 = new o00O0ooo.o0oO0O0o
                r4.<init>(r1, r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2 r8 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2
                r8.<init>(r6)
                r7.label = r3
                java.lang.Object r8 = o00O0ooo.o0o0000.OooOOO0(r4, r8, r7)
                if (r8 != r0) goto L42
                goto L7b
            L42:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.core.data.manager.OfferwallManager r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOfferwallManager$p(r8)
                com.unity3d.ads.adplayer.ShowOptions r1 = r7.$showOptions
                com.unity3d.ads.adplayer.AndroidShowOptions r1 = (com.unity3d.ads.adplayer.AndroidShowOptions) r1
                java.lang.String r1 = r1.getOfferwallPlacementName()
                if (r1 != 0) goto L54
                java.lang.String r1 = ""
            L54:
                o00O0ooo.o0OoOoOo r8 = r8.showAd(r1)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r1 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                o00O0oOo.o000OO r1 = r1.getScope()
                r3 = 5
                o00O0ooo.o0OOO00 r8 = o00O0ooo.o0o0000.OooOOo(r8, r1, r3)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1
                r1.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4 r3 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4
                r3.<init>(r8)
                r7.label = r2
                java.lang.Object r8 = r1.collect(r3, r7)
                if (r8 != r0) goto L7c
            L7b:
                return r0
            L7c:
                oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C394210.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C394210) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3 */
    public /* synthetic */ class C39433 extends kotlin.jvm.internal.OooO00o implements o00O0O {
        public C39433(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(DisplayMessage displayMessage, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, oooO0OO);
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$4 */
    public /* synthetic */ class C39444 extends kotlin.jvm.internal.OooOo00 implements o00O0O {
        public C39444(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(VolumeSettingsChange volumeSettingsChange, o00O0O0O.OooO0OO oooO0OO) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, oooO0OO);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {93}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6 */
    public static final class C39456 extends OooOOOO implements o00O0O {
        int label;

        public C39456(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidFullscreenWebViewAdPlayer.this.new C39456(oooO0OO);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(ShowEvent showEvent, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39456) create(showEvent, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                this.label = 1;
                if (androidFullscreenWebViewAdPlayer.destroy(this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7 */
    public /* synthetic */ class C39467 extends kotlin.jvm.internal.OooOo00 implements o00O0O {
        public C39467(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(SessionChange sessionChange, o00O0O0O.OooO0OO oooO0OO) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, oooO0OO);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {113}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8 */
    public static final class C39478 extends OooOOOO implements o00O0O {
        final /* synthetic */ Activity $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ o00000 $listenerStarted;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39478(o00000 o00000Var, Activity activity, Intent intent, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$listenerStarted = o00000Var;
            this.$context = activity;
            this.$intent = intent;
            this.this$0 = androidFullscreenWebViewAdPlayer;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C39478(this.$listenerStarted, this.$context, this.$intent, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o00000 o00000Var = this.$listenerStarted;
                this.label = 1;
                if (((o00000O0) o00000Var).OooOo0(this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            this.$context.startActivity(this.$intent);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen_intent", null, null, null, this.this$0.getAdObject(), null, 46, null);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39478) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {131, 135}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9 */
    public static final class C39489 extends OooOOOO implements o00O0O {
        final /* synthetic */ o0OOO0OO $scarEvents;
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {130}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1 */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass1(this.this$0, this.$showOptions, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == oooOo00) {
                        return oooOo00;
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
            public final Object invoke(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2 */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(oooO0OO);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(ScarEvent scarEvent, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(scarEvent, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return Boolean.valueOf(kotlin.jvm.internal.OooOo.OooO00o((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
            }
        }

        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$4 */
        public /* synthetic */ class AnonymousClass4 implements o0O000Oo, OooOOO0 {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // o00O0ooo.o0O000Oo
            public final Object emit(OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
                Object objSendGmaEvent = this.$tmp0.sendGmaEvent(oooO0O0, oooO0OO);
                return objSendGmaEvent == OooOo00.f31365OooOo0O ? objSendGmaEvent : OooOo.f33195OooO00o;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof o0O000Oo) && (obj instanceof OooOOO0)) {
                    return kotlin.jvm.internal.OooOo.OooO00o(getFunctionDelegate(), ((OooOOO0) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.OooOOO0
            public final oo00o.OooO00o getFunctionDelegate() {
                return new kotlin.jvm.internal.OooOo00(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39489(o0OOO0OO o0ooo0oo, ShowOptions showOptions, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$scarEvents = o0ooo0oo;
            this.$showOptions = showOptions;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidFullscreenWebViewAdPlayer.this.new C39489(this.$scarEvents, this.$showOptions, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        
            if (r1.collect(r3, r7) == r0) goto L33;
         */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                o00O0.o000OOo.OooOO0O(r8)
                goto L5d
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                o00O0.o000OOo.OooOO0O(r8)
                goto L42
            L1c:
                o00O0.o000OOo.OooOO0O(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                o00O0ooo.o0OoOoOo r8 = r8.getOnScarEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r1.<init>(r4, r5, r6)
                o00O0ooo.o0oO0O0o r4 = new o00O0ooo.o0oO0O0o
                r4.<init>(r1, r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2 r8 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2
                r8.<init>(r6)
                r7.label = r3
                java.lang.Object r8 = o00O0ooo.o0o0000.OooOOO0(r4, r8, r7)
                if (r8 != r0) goto L42
                goto L5c
            L42:
                o00O0ooo.o0OOO0OO r8 = r7.$scarEvents
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1
                r1.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$4 r3 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$4
                r3.<init>(r8)
                r7.label = r2
                java.lang.Object r8 = r1.collect(r3, r7)
                if (r8 != r0) goto L5d
            L5c:
                return r0
            L5d:
                oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C39489.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39489) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository) {
        kotlin.jvm.internal.OooOo.OooO0o0(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.OooOo.OooO0o0(opportunityId, "opportunityId");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(scarManager, "scarManager");
        kotlin.jvm.internal.OooOo.OooO0o0(offerwallManager, "offerwallManager");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(adRepository, "adRepository");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.adObject$delegate = o0OOO0.OooO0oo(new AndroidFullscreenWebViewAdPlayer$adObject$2(this));
    }

    private final o00O0O00 displayEventsRouter(DisplayMessage displayMessage) {
        return o0000OO0.OooOo0(getScope(), null, new C39401(displayMessage, null), 3);
    }

    public final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    public final Object handleSessionChange(SessionChange sessionChange, o00O0O0O.OooO0OO oooO0OO) {
        boolean z = sessionChange instanceof SessionChange.UserConsentChange;
        OooOo oooOo = OooOo.f33195OooO00o;
        if (z) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            kotlin.jvm.internal.OooOo.OooO0Oo(byteArray, "change.value.toByteArray()");
            Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, oooO0OO);
            return objSendUserConsentChange == OooOo00.f31365OooOo0O ? objSendUserConsentChange : oooOo;
        }
        if (sessionChange instanceof SessionChange.PrivacyFsmChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
            kotlin.jvm.internal.OooOo.OooO0Oo(byteArray2, "change.value.toByteArray()");
            Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, oooO0OO);
            if (objSendPrivacyFsmChange == OooOo00.f31365OooOo0O) {
                return objSendPrivacyFsmChange;
            }
        }
        return oooOo;
    }

    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, o00O0O0O.OooO0OO oooO0OO) {
        Object objSendVolumeChange;
        boolean z = volumeSettingsChange instanceof VolumeSettingsChange.MuteChange;
        OooOo oooOo = OooOo.f33195OooO00o;
        if (!z) {
            return ((volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) && (objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), oooO0OO)) == OooOo00.f31365OooOo0O) ? objSendVolumeChange : oooOo;
        }
        Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), oooO0OO);
        return objSendMuteChange == OooOo00.f31365OooOo0O ? objSendMuteChange : oooOo;
    }

    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, o00O0O0O.OooO0OO oooO0OO) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return OooOo.f33195OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x009c, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0) != r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0093 A[PHI: r2
  0x0093: PHI (r2v5 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) = 
  (r2v4 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
  (r2v11 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
 binds: [B:67:0x0090, B:54:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(o00O0O0O.OooO0OO r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C39391
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C39391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            o00O0.o000OOo.OooOO0O(r9)
            goto L9f
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            o00O0.o000OOo.OooOO0O(r9)
            goto L93
        L41:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            o00O0.o000OOo.OooOO0O(r9)
            goto L84
        L49:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            o00O0.o000OOo.OooOO0O(r9)
            goto L69
        L51:
            o00O0.o000OOo.OooOO0O(r9)
            o00O0ooo.o0OO0oO0 r9 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r7 = r8.opportunityId
            r2.<init>(r7)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L68
            goto L9e
        L68:
            r2 = r8
        L69:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r2.openMeasurementRepository
            java.lang.String r6 = r2.opportunityId
            com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r6)
            boolean r9 = r9.hasSessionFinished(r6)
            if (r9 == 0) goto L84
            r0.L$0 = r2
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = o00O0oOo.o0000OO0.OooOO0O(r5, r0)
            if (r9 != r1) goto L84
            goto L9e
        L84:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L93
            goto L9e
        L93:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto L9f
        L9e:
            return r1
        L9f:
            oo00o.OooOo r9 = oo00o.OooOo.f33195OooO00o
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0OoOoOo getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o000OO getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.onBroadcastEvent(str, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.requestShow(map, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendActivityDestroyed(oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendFocusChange(z, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendGmaEvent(oooO0O0, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendMuteChange(z, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendVisibilityChange(z, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, o00O0O0O.OooO0OO oooO0OO) {
        return this.webViewAdPlayer.sendVolumeChange(d, oooO0OO);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        kotlin.jvm.internal.OooOo.OooO0o0(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        Activity activity = androidShowOptions.getActivity().get();
        if (activity == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean zIsScarAd = androidShowOptions.isScarAd();
        boolean zIsOfferwallAd = androidShowOptions.isOfferwallAd();
        o00000O0 o00000o0OooO00o = o0000OO0.OooO00o();
        final oO000O0 oo000o0 = new oO000O0(displayMessages, new C39411(o00000o0OooO00o, null));
        o0o0000.OooOOo0(new o0O0OOO0(new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2 */
            public static final class C39352<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(o00O0O0O.OooO0OO oooO0OO) {
                        super(oooO0OO);
                    }

                    @Override // o00O0OO0.OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C39352.this.emit(null, this);
                    }
                }

                public C39352(o0O000Oo o0o000oo, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = o0o000oo;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.C39352.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.C39352.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1
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
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(r4)
                        boolean r2 = kotlin.jvm.internal.OooOo.OooO00o(r2, r4)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.C39352.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
                Object objCollect = oo000o0.collect(new C39352(o0o000oo, this), oooO0OO);
                return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
            }
        }, new C39433(this), 2), getScope());
        o0o0000.OooOOo0(new o0O0OOO0(this.deviceInfoRepository.getVolumeSettingsChange(), new C39444(this), 2), getScope());
        final o0OoOoOo onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        o0o0000.OooOOo0(new o0O0OOO0(new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2 */
            public static final class C39362<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", m13472f = "AndroidFullscreenWebViewAdPlayer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(o00O0O0O.OooO0OO oooO0OO) {
                        super(oooO0OO);
                    }

                    @Override // o00O0OO0.OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C39362.this.emit(null, this);
                    }
                }

                public C39362(o0O000Oo o0o000oo) {
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.C39362.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.C39362.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r7)
                        goto L48
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        o00O0.o000OOo.OooOO0O(r7)
                        o00O0ooo.o0O000Oo r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.core.data.model.ShowEvent r2 = (com.unity3d.ads.core.data.model.ShowEvent) r2
                        boolean r4 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
                        if (r4 != 0) goto L3f
                        boolean r2 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
                        if (r2 == 0) goto L48
                    L3f:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L48
                        return r1
                    L48:
                        oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.C39362.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
                Object objCollect = onShowEvent.collect(new C39362(o0o000oo), oooO0OO);
                return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
            }
        }, new C39456(null), 2), getScope());
        o0o0000.OooOOo0(new o0O0OOO0(this.sessionRepository.getOnChange(), new C39467(this), 2), getScope());
        if (zIsScarAd || zIsOfferwallAd) {
            if (!zIsScarAd) {
                o0000OO0.OooOo0(getScope(), null, new C394210(showOptions, null), 3);
                return;
            }
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            o0000OO0.OooOo0(getScope(), null, new C39489(o0o0000.OooOOo(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), 10), showOptions, null), 3);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
        Intent intent = new Intent(activity, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra("orientation", activity.getRequestedOrientation());
        o0000OO0.OooOo0(getScope(), null, new C39478(o00000o0OooO00o, activity, intent, this, null), 3);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
