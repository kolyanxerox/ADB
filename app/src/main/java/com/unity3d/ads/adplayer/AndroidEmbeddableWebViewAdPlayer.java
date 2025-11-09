package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.ViewUtilities;
import java.util.Map;
import o000ooOO.o000O0Oo;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.o0OOO00;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final LifecycleDataSource lifecycleDataSource;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", m13472f = "AndroidEmbeddableWebViewAdPlayer.kt", m13473l = {125, 128, 130}, m13474m = "destroy")
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 */
    public static final class C39281 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39281(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidEmbeddableWebViewAdPlayer.this.destroy(this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", m13472f = "AndroidEmbeddableWebViewAdPlayer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2 */
    public static final class C39322 extends OooOOOO implements o00O0O {
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Activity $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39322(Activity activity, BannerView bannerView, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$context = activity;
            this.$bannerView = bannerView;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidEmbeddableWebViewAdPlayer.this.new C39322(this.$context, this.$bannerView, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(new ViewGroup.LayoutParams((int) ViewUtilities.pxFromDp(this.$context, this.$bannerView.getSize().getWidth()), (int) ViewUtilities.pxFromDp(this.$context, this.$bannerView.getSize().getHeight())));
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39322) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4", m13472f = "AndroidEmbeddableWebViewAdPlayer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4 */
    public static final class C39344 extends OooOOOO implements o00O0O {
        final /* synthetic */ BannerView $bannerView;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39344(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$bannerView = bannerView;
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C39344(this.$bannerView, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39344) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, LifecycleDataSource lifecycleDataSource) {
        kotlin.jvm.internal.OooOo.OooO0o0(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.OooOo.OooO0o0(opportunityId, "opportunityId");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(scarManager, "scarManager");
        kotlin.jvm.internal.OooOo.OooO0o0(lifecycleDataSource, "lifecycleDataSource");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (o00O0oOo.o0000OO0.OooOO0O(1000, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(o00O0O0O.OooO0OO r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.C39281
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.C39281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            o00O0.o000OOo.OooOO0O(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            o00O0.o000OOo.OooOO0O(r8)
            goto L78
        L3d:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            o00O0.o000OOo.OooOO0O(r8)
            goto L69
        L45:
            o00O0.o000OOo.OooOO0O(r8)
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = r7.webViewAdPlayer
            r8.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r8 = r7.openMeasurementRepository
            java.lang.String r2 = r7.opportunityId
            com.google.protobuf.ByteString r2 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r2)
            boolean r8 = r8.hasSessionFinished(r2)
            if (r8 == 0) goto L68
            r0.L$0 = r7
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = o00O0oOo.o0000OO0.OooOO0O(r5, r0)
            if (r8 != r1) goto L68
            goto L83
        L68:
            r2 = r7
        L69:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.destroy(r0)
            if (r8 != r1) goto L78
            goto L83
        L78:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(o00O0O0O.OooO0OO):java.lang.Object");
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
    public void show(final ShowOptions showOptions) {
        kotlin.jvm.internal.OooOo.OooO0o0(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        Activity activity = androidShowOptions.getActivity().get();
        if (activity == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        final BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            throw new IllegalStateException((bannerViewCache.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found").toString());
        }
        if (!androidShowOptions.isScarAd()) {
            o0000OO0.OooOo0(o0000OO0.OooO0Oo(), null, new C39322(activity, bannerView, null), 3);
            final WebView webView = getWebViewContainer().getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                o0000OO0.OooOo0(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                if (ViewCompat.isAttachedToWindow(webView)) {
                    webView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3927xd1f23ce6(webView, this));
                } else {
                    o0000OO0.OooOo0(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        kotlin.jvm.internal.OooOo.OooO0o0(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        o0000OO0.OooOo0(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                        if (ViewCompat.isAttachedToWindow(view)) {
                            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3927xd1f23ce6(view, this));
                        } else {
                            o0000OO0.OooOo0(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        kotlin.jvm.internal.OooOo.OooO0o0(view, "view");
                    }
                });
            }
            o0000OO0.OooOo0(o0000OO0.OooO0Oo(), null, new C39344(bannerView, this, null), 3);
            return;
        }
        String placementId = androidShowOptions.getPlacementId();
        String str = placementId == null ? "" : placementId;
        String scarQueryId = androidShowOptions.getScarQueryId();
        String str2 = scarQueryId == null ? "" : scarQueryId;
        String scarAdUnitId = androidShowOptions.getScarAdUnitId();
        String str3 = scarAdUnitId == null ? "" : scarAdUnitId;
        String scarAdString = androidShowOptions.getScarAdString();
        o000O0Oo o000o0oo2 = new o000O0Oo(str, str2, str3, scarAdString == null ? "" : scarAdString, 0);
        ScarManager scarManager = this.scarManager;
        UnityBannerSize size = bannerView.getSize();
        kotlin.jvm.internal.OooOo.OooO0Oo(size, "bannerView.size");
        final o0OOO00 o0ooo00OooOOo = o0o0000.OooOOo(scarManager.loadBannerAd(activity, bannerView, o000o0oo2, size, this.opportunityId), getScope(), 10);
        if (!ViewCompat.isAttachedToWindow(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    kotlin.jvm.internal.OooOo.OooO0o0(view, "view");
                    bannerView.removeOnAttachStateChangeListener(this);
                    o0000OO0.OooOo0(this.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, o0ooo00OooOOo, showOptions, null), 3);
                    BannerView bannerView2 = bannerView;
                    if (ViewCompat.isAttachedToWindow(bannerView2)) {
                        bannerView2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3926x3d8f0a64(bannerView2, this));
                    } else {
                        o0000OO0.OooOo0(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    kotlin.jvm.internal.OooOo.OooO0o0(view, "view");
                }
            });
            return;
        }
        o0000OO0.OooOo0(getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, o0ooo00OooOOo, showOptions, null), 3);
        if (ViewCompat.isAttachedToWindow(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3926x3d8f0a64(bannerView, this));
        } else {
            o0000OO0.OooOo0(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3);
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
