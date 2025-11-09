package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OOO0OO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1", m13472f = "AndroidEmbeddableWebViewAdPlayer.kt", m13473l = {75, 79}, m13474m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ o0OOO0OO $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1", m13472f = "AndroidEmbeddableWebViewAdPlayer.kt", m13473l = {73}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1 */
    public static final class C39291 extends OooOOOO implements o00O0O {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39291(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = androidEmbeddableWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C39291(this.this$0, this.$showOptions, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
                this.label = 1;
                if (webViewAdPlayer.requestShow(unityAdsShowOptions, this) == oooOo00) {
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
        public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
            return ((C39291) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2", m13472f = "AndroidEmbeddableWebViewAdPlayer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2 */
    public static final class C39302 extends OooOOOO implements o00O0O {
        /* synthetic */ Object L$0;
        int label;

        public C39302(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C39302 c39302 = new C39302(oooO0OO);
            c39302.L$0 = obj;
            return c39302;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(ScarEvent scarEvent, OooO0OO oooO0OO) {
            return ((C39302) create(scarEvent, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
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

    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4 */
    public /* synthetic */ class C39314 implements o0O000Oo, OooOOO0 {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public C39314(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        @Override // o00O0ooo.o0O000Oo
        public final Object emit(BannerBridge.BannerEvent bannerEvent, OooO0OO oooO0OO) {
            Object objSendScarBannerEvent = this.$tmp0.sendScarBannerEvent(bannerEvent, oooO0OO);
            return objSendScarBannerEvent == OooOo00.f31365OooOo0O ? objSendScarBannerEvent : OooOo.f33195OooO00o;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof o0O000Oo) && (obj instanceof OooOOO0)) {
                return kotlin.jvm.internal.OooOo.OooO00o(getFunctionDelegate(), ((OooOOO0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.OooOOO0
        public final oo00o.OooO00o getFunctionDelegate() {
            return new kotlin.jvm.internal.OooOo00(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, o0OOO0OO o0ooo0oo, ShowOptions showOptions, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$scarEvents = o0ooo0oo;
        this.$showOptions = showOptions;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$1(this.this$0, this.$scarEvents, this.$showOptions, oooO0OO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r1.collect(r3, r7) == r0) goto L15;
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
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            o00O0ooo.o0OoOoOo r8 = r8.getOnScarEvent()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r4 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
            r6 = 0
            r1.<init>(r4, r5, r6)
            o00O0ooo.o0oO0O0o r4 = new o00O0ooo.o0oO0O0o
            r4.<init>(r1, r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2 r8 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2
            r8.<init>(r6)
            r7.label = r3
            java.lang.Object r8 = o00O0ooo.o0o0000.OooOOO0(r4, r8, r7)
            if (r8 != r0) goto L42
            goto L5c
        L42:
            o00O0ooo.o0OOO0OO r8 = r7.$scarEvents
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1
            r1.<init>()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4 r3 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4
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
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
