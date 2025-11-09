package com.unity3d.ads.adplayer;

import OooO0oo.o00Oo0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oO.o000000O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.InterfaceC4522o;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OO;
import o00O0ooo.o0OOO0;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOO0O;
import oo00o.OooOo;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class AndroidWebViewContainer implements WebViewContainer {
    private final o0OO _lastInputEvent;
    private final Context context;
    private final InterfaceC4522o lastInputEvent;
    private final o000OO scope;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", m13472f = "AndroidWebViewContainer.kt", m13473l = {42}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2 */
    public static final class C39502 extends OooOOOO implements o00O0O {
        int label;

        public C39502(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidWebViewContainer.this.new C39502(oooO0OO);
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (OooO0OO) obj2);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == oooOo00) {
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

        public final Object invoke(boolean z, OooO0OO oooO0OO) {
            return ((C39502) create(Boolean.valueOf(z), oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", m13472f = "AndroidWebViewContainer.kt", m13473l = {98}, m13474m = "addJavascriptInterface")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 */
    public static final class C39511 extends o00O0OO0.OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C39511(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", m13472f = "AndroidWebViewContainer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 */
    public static final class C39522 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $name;
        final /* synthetic */ WebViewBridge $webViewBridgeInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39522(String str, WebViewBridge webViewBridge, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidWebViewContainer.this.new C39522(this.$name, this.$webViewBridgeInterface, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            AndroidWebViewContainer.this.getWebView().addJavascriptInterface(new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
                    kotlin.jvm.internal.OooOo.OooO0o0(callbackId, "callbackId");
                    kotlin.jvm.internal.OooOo.OooO0o0(callbackStatus, "callbackStatus");
                    kotlin.jvm.internal.OooOo.OooO0o0(rawParameters, "rawParameters");
                    webViewBridge.handleCallback(callbackId, callbackStatus, rawParameters);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleInvocation(String message) {
                    kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
                    webViewBridge.handleInvocation(message);
                }
            }, this.$name);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39522) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", m13472f = "AndroidWebViewContainer.kt", m13473l = {116}, m13474m = "destroy")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 */
    public static final class C39531 extends o00O0OO0.OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39531(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.destroy(this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", m13472f = "AndroidWebViewContainer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 */
    public static final class C39542 extends OooOOOO implements o00O0O {
        int label;

        public C39542(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidWebViewContainer.this.new C39542(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            ViewParent parent = AndroidWebViewContainer.this.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(AndroidWebViewContainer.this.getWebView());
            }
            AndroidWebViewContainer.this.getWebView().destroy();
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39542) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", m13472f = "AndroidWebViewContainer.kt", m13473l = {88}, m13474m = "evaluateJavascript")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 */
    public static final class C39551 extends o00O0OO0.OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C39551(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.evaluateJavascript(null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", m13472f = "AndroidWebViewContainer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2 */
    public static final class C39562 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $script;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39562(String str, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$script = str;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidWebViewContainer.this.new C39562(this.$script, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidWebViewContainer.this.getWebView().evaluateJavascript("javascript:" + this.$script, null);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39562) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", m13472f = "AndroidWebViewContainer.kt", m13473l = {74, 78, 80}, m13474m = "loadUrl")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 */
    public static final class C39571 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39571(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", m13472f = "AndroidWebViewContainer.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 */
    public static final class C39582 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39582(String str, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$url = str;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidWebViewContainer.this.new C39582(this.$url, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39582) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", m13472f = "AndroidWebViewContainer.kt", m13473l = {IronSourceConstants.RETRY_LIMIT}, m13474m = "onRenderProcessGone")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 */
    public static final class C39591 extends o00O0OO0.OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39591(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.onRenderProcessGone(this);
        }
    }

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient webViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, o0000O00 mainDispatcher, o0000O00 defaultDispatcher, o000OO adPlayerScope, Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(webView, "webView");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewClient, "webViewClient");
        kotlin.jvm.internal.OooOo.OooO0o0(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        kotlin.jvm.internal.OooOo.OooO0o0(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        o00OO000.OooO0OO oooO0OOOooOo0o = o0000OO0.OooOo0o(o0000OO0.OooOo0o(adPlayerScope, mainDispatcher), new o0000O0O("AndroidWebViewContainer"));
        this.scope = oooO0OOOooOo0o;
        oO00000o oo00000oOooO0OO = o0o0000.OooO0OO(null);
        this._lastInputEvent = oo00000oOooO0OO;
        this.lastInputEvent = new o0OOO0(oo00000oOooO0OO);
        final InterfaceC4522o interfaceC4522oIsRenderProcessGone = webViewClient.isRenderProcessGone();
        o0o0000.OooOOo0(new o0O0OOO0(new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2 */
            public static final class C39492<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", m13472f = "AndroidWebViewContainer.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return C39492.this.emit(null, this);
                    }
                }

                public C39492(o0O000Oo o0o000oo) {
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.C39492.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.C39492.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r6)
                        goto L46
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        o00O0.o000OOo.OooOO0O(r6)
                        o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L46
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.C39492.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = interfaceC4522oIsRenderProcessGone.collect(new C39492(o0o000oo), oooO0OO);
                return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
            }
        }, new C39502(null), 2), o0000OO0.OooOo0o(oooO0OOOooOo0o, defaultDispatcher));
        webView.setOnTouchListener(new OooO00o(this, 0));
        applySafeAreaInsets();
    }

    public static final boolean _init_$lambda$1(AndroidWebViewContainer this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        oO00000o oo00000o = (oO00000o) this$0._lastInputEvent;
        oo00000o.getClass();
        oo00000o.OooO(null, motionEvent);
        return false;
    }

    private final void applySafeAreaInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(this.webView, new o00Oo0(this, 13));
    }

    public static final WindowInsetsCompat applySafeAreaInsets$lambda$3(AndroidWebViewContainer this$0, View v, WindowInsetsCompat insets) {
        Object objOooO0O0;
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(v, "v");
        kotlin.jvm.internal.OooOo.OooO0o0(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        kotlin.jvm.internal.OooOo.OooO0Oo(insets2, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
        kotlin.jvm.internal.OooOo.OooO0Oo(insets3, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            objOooO0O0 = Float.valueOf(this$0.context.getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        Object objValueOf = Float.valueOf(1.0f);
        if (objOooO0O0 instanceof OooOO0O) {
            objOooO0O0 = objValueOf;
        }
        float fFloatValue = ((Number) objOooO0O0).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.left, insets3.left), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.top, insets3.top), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx3 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.right, insets3.right), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx4 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.bottom, insets3.bottom), fFloatValue);
        StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", iApplySafeAreaInsets$lambda$3$toPx, "px');\n                    root.style.setProperty('--safe-area-inset-right', '", iApplySafeAreaInsets$lambda$3$toPx3, "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        sbOooOo0o.append(iApplySafeAreaInsets$lambda$3$toPx2);
        sbOooOo0o.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        sbOooOo0o.append(iApplySafeAreaInsets$lambda$3$toPx4);
        sbOooOo0o.append("px');\n                })();\n            ");
        o0000OO0.OooOo0(this$0.scope, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(this$0, o000000O.OooOoO0(sbOooOo0o.toString()), null), 3);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i, float f) {
        return (int) (i / f);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onRenderProcessGone(o00O0O0O.OooO0OO r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C39591
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C39591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            o00O0.o000OOo.OooOO0O(r7)
            goto L42
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            o00O0.o000OOo.OooOO0O(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r6.destroy(r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            r0 = r6
        L42:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r7 = r0.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.adplayer.model.WebViewClientError r0 = new com.unity3d.ads.adplayer.model.WebViewClientError
            com.unity3d.ads.adplayer.model.ErrorReason r2 = com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Render process gone"
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = com.google.android.gms.internal.measurement.o0OO0O0.OooOO0o(r0)
            r7.invoke(r0)
            oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone(o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge r6, java.lang.String r7, o00O0O0O.OooO0OO r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C39511
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C39511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r8)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            o00O0.o000OOo.OooOO0O(r8)
            o00O0oOo.o000OO r8 = r5.scope     // Catch: java.util.concurrent.CancellationException -> L47
            o00O0O0O.OooOOO0 r8 = r8.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L47
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2     // Catch: java.util.concurrent.CancellationException -> L47
            r4 = 0
            r2.<init>(r7, r6, r4)     // Catch: java.util.concurrent.CancellationException -> L47
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r6 = o00O0oOo.o0000OO0.Oooo00O(r2, r8, r0)     // Catch: java.util.concurrent.CancellationException -> L47
            if (r6 != r1) goto L47
            return r1
        L47:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge, java.lang.String, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(o00O0O0O.OooO0OO r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C39531
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C39531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            o00O0.o000OOo.OooOO0O(r6)
            goto L54
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            o00O0.o000OOo.OooOO0O(r6)
            o00O0oOo.o000OO r6 = r5.scope
            o00O0O0O.OooOOO0 r6 = r6.getCoroutineContext()
            o00O0oOo.o00OO0O0 r2 = o00O0oOo.o00OO0O0.f31546OooOo0O
            o00O0O0O.OooOOO0 r6 = r6.plus(r2)
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2
            r4 = 0
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = o00O0oOo.o0000OO0.Oooo00O(r2, r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r5
        L54:
            o00O0oOo.o000OO r6 = r0.scope
            o00O0oOo.o0000OO0.OooO(r6)
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy(o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evaluateJavascript(java.lang.String r6, o00O0O0O.OooO0OO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C39551
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C39551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r7)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            o00O0.o000OOo.OooOO0O(r7)
            o00O0oOo.o000OO r7 = r5.scope     // Catch: java.util.concurrent.CancellationException -> L47
            o00O0O0O.OooOOO0 r7 = r7.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L47
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2     // Catch: java.util.concurrent.CancellationException -> L47
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.util.concurrent.CancellationException -> L47
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r6 = o00O0oOo.o0000OO0.Oooo00O(r2, r7, r0)     // Catch: java.util.concurrent.CancellationException -> L47
            if (r6 != r1) goto L47
            return r1
        L47:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(java.lang.String, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public InterfaceC4522o getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final o000OO getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final o0OO get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009b  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadUrl(java.lang.String r8, o00O0O0O.OooO0OO r9) throws com.unity3d.ads.adplayer.LoadWebViewError {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C39571
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C39571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            o00O0.o000OOo.OooOO0O(r9)
            goto L90
        L3d:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            o00O0.o000OOo.OooOO0O(r9)
            goto L79
        L45:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            o00O0.o000OOo.OooOO0O(r9)
            goto L68
        L4d:
            o00O0.o000OOo.OooOO0O(r9)
            o00O0oOo.o000OO r9 = r7.scope
            o00O0O0O.OooOOO0 r9 = r9.getCoroutineContext()
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2
            r6 = 0
            r2.<init>(r8, r6)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = o00O0oOo.o0000OO0.Oooo00O(r2, r9, r0)
            if (r8 != r1) goto L67
            goto L8d
        L67:
            r8 = r7
        L68:
            com.unity3d.ads.adplayer.AndroidWebViewClient r9 = r8.webViewClient
            o00O0oOo.o000O0o r9 = r9.getOnLoadFinished()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.OooO0OO(r0)
            if (r9 != r1) goto L79
            goto L8d
        L79:
            java.util.List r9 = (java.util.List) r9
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L9b
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r8.destroy(r0)
            if (r0 != r1) goto L8e
        L8d:
            return r1
        L8e:
            r0 = r8
            r8 = r9
        L90:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r9 = r0.sendWebViewClientErrorDiagnostics
            r9.invoke(r8)
            com.unity3d.ads.adplayer.LoadWebViewError r9 = new com.unity3d.ads.adplayer.LoadWebViewError
            r9.<init>(r8)
            throw r9
        L9b:
            oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl(java.lang.String, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
