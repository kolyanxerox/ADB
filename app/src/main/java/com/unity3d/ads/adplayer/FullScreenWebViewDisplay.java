package com.unity3d.ads.adplayer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.IServiceProvider;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.oo0o0Oo;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.oO000O0;
import oo00o.OooO0OO;
import oo00o.OooO0o;
import oo00o.OooOO0;
import oo00o.OooOO0O;
import oo00o.OooOo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {
    private final OooO0OO adObject$delegate;
    private final OooO0OO dispatchers$delegate;
    private String opportunityId = "";
    private final OooO0OO sendDiagnosticEvent$delegate;
    private Map<String, ? extends Object> showOptions;

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1 */
    public static final class C39661 extends OooOOOO implements o00O0O {
        final /* synthetic */ WebView $webView;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {125}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass1(this.this$0, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, this.this$0.showOptions);
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
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {131}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FullScreenWebViewDisplay fullScreenWebViewDisplay, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass2(this.this$0, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.this$0.opportunityId, "WebView failed to attach to FullScreenWebViewDisplay.");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == oooOo00) {
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
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39661(WebView webView, FullScreenWebViewDisplay fullScreenWebViewDisplay, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$webView = webView;
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C39661(this.$webView, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo oooOo = OooOo.f33195OooO00o;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            try {
                ViewParent parent = this.$webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.$webView);
                }
                this.this$0.setContentView(this.$webView);
                o0000OO0.OooOo0(o0000OO0.OooO0O0(this.this$0.getDispatchers().getDefault()), null, new AnonymousClass1(this.this$0, null), 3);
                return oooOo;
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    o0000OO0.OooOo0(o0000OO0.OooO0O0(this.this$0.getDispatchers().getDefault()), null, new AnonymousClass2(this.this$0, null), 3);
                    String message = th.getMessage();
                    if (message == null) {
                        message = "Unknown";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_failed_to_attach_webview", null, o0O0O00.OooOOOo(new OooOO0("reason", message)), null, this.this$0.getAdObject(), null, 42, null);
                    this.this$0.setResult(0);
                    this.this$0.finish();
                }
                return oooOo;
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39661) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {IronSourceConstants.RETRY_LIMIT}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1 */
    public static final class C39671 extends OooOOOO implements o00O0O {
        int label;

        public C39671(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return FullScreenWebViewDisplay.this.new C39671(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "Opportunity ID not found");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39671) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {75}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2 */
    public static final class C39682 extends OooOOOO implements o00O0O {
        int label;

        public C39682(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return FullScreenWebViewDisplay.this.new C39682(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "AdPlayer is not active. Could be because show was called while the app was in background.");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39682) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {93}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6 */
    public static final class C39696 extends OooOOOO implements o00O0O {
        int label;

        public C39696(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return FullScreenWebViewDisplay.this.new C39696(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                FullScreenWebViewDisplay fullScreenWebViewDisplay = FullScreenWebViewDisplay.this;
                this.label = 1;
                if (fullScreenWebViewDisplay.listenToAdPlayerEvents(this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.this.getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_success_time", null, null, null, FullScreenWebViewDisplay.this.getAdObject(), null, 46, null);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39696) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {158}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1 */
    public static final class C39701 extends OooOOOO implements o00O0O {
        int label;

        public C39701(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return FullScreenWebViewDisplay.this.new C39701(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, false);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39701) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {163}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2 */
    public static final class C39712 extends OooOOOO implements o00O0O {
        int label;

        public C39712(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return FullScreenWebViewDisplay.this.new C39712(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39712) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {150}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1 */
    public static final class C39721 extends OooOOOO implements o00O0O {
        int label;

        public C39721(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return FullScreenWebViewDisplay.this.new C39721(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, true);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39721) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {180}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1 */
    public static final class C39731 extends OooOOOO implements o00O0O {
        final /* synthetic */ boolean $hasFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39731(boolean z, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$hasFocus = z;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return FullScreenWebViewDisplay.this.new C39731(this.$hasFocus, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.FocusChanged focusChanged = new DisplayMessage.FocusChanged(FullScreenWebViewDisplay.this.opportunityId, this.$hasFocus);
                this.label = 1;
                if (displayMessages.emit(focusChanged, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C39731) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public FullScreenWebViewDisplay() {
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        this.sendDiagnosticEvent$delegate = o0OOO0.OooO0oO(oooO0o, new FullScreenWebViewDisplay$special$$inlined$inject$default$1(this, ""));
        this.adObject$delegate = o0OOO0.OooO0oo(new FullScreenWebViewDisplay$adObject$2(this));
        this.dispatchers$delegate = o0OOO0.OooO0oO(oooO0o, new FullScreenWebViewDisplay$special$$inlined$inject$default$2(this, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(o00O0O0O.OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        final oO000O0 oo000o0 = new oO000O0(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, oo0o0oo, null));
        o0o0000.OooOOo0(new o0O0OOO0(new o0OoOoOo() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1

            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements o0O000Oo {
                final /* synthetic */ o0O000Oo $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(o0O000Oo o0o000oo, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = o0o000oo;
                    this.this$0 = fullScreenWebViewDisplay;
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.C3964xaf13d6bb.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.C3964xaf13d6bb.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1
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
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
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
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.C3964xaf13d6bb.AnonymousClass2.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO2) {
                Object objCollect = oo000o0.collect(new AnonymousClass2(o0o000oo, this), oooO0OO2);
                return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null), 2), LifecycleOwnerKt.getLifecycleScope(this));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        o0000OO0.OooOo0(o0000OO0.OooO0O0(getDispatchers().getMain()), null, new C39661(webView, this, null), 3);
    }

    @Override // com.unity3d.services.core.p012di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        o000OO scope;
        Object objOooO0O0;
        Map<String, ? extends Object> map;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_starts", null, o0O0O00.OooOOOo(new OooOO0("intentOpportunityId", this.opportunityId)), null, getAdObject(), null, 42, null);
        if (kotlin.jvm.internal.OooOo.OooO00o(this.opportunityId, "not_provided")) {
            setResult(0);
            o0000OO0.OooOo0(o0000OO0.OooO0O0(getDispatchers().getDefault()), null, new C39671(null), 3);
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_fails", null, o0O0O00.OooOOOo(new OooOO0("reason_debug", "no_opportunity_id")), null, null, null, 58, null);
            finish();
            return;
        }
        AdObject adObject = getAdObject();
        AdPlayer adPlayer = adObject != null ? adObject.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !o0000OO0.OooOo00(scope)) {
            setResult(0);
            o0000OO0.OooOo0(o0000OO0.OooO0O0(getDispatchers().getDefault()), null, new C39682(null), 3);
            finish();
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_fails", null, o0O0O00.OooOOOo(new OooOO0("reason_debug", "ad_player_scope_not_active")), null, null, null, 58, null);
            return;
        }
        boolean zHasExtra = getIntent().hasExtra("orientation");
        Boolean boolValueOf = Boolean.valueOf(zHasExtra);
        if (!zHasExtra) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                objOooO0O0 = JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2));
            } catch (Throwable th) {
                objOooO0O0 = o000OOo.OooO0O0(th);
            }
            if (objOooO0O0 instanceof OooOO0O) {
                objOooO0O0 = null;
            }
            map = (Map) objOooO0O0;
        } else {
            map = null;
        }
        this.showOptions = map;
        o0000OO0.OooOo0(LifecycleOwnerKt.getLifecycleScope(this), null, new C39696(null), 3);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_destroyed", null, null, null, getAdObject(), null, 46, null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 4;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        o0000OO0.OooOo0(o0000OO0.OooO0O0(getDispatchers().getDefault()), null, new C39701(null), 3);
        if (isFinishing()) {
            o0000OO0.OooOo0(o0000OO0.OooO0O0(getDispatchers().getDefault()), null, new C39712(null), 3);
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_finishing", null, null, null, getAdObject(), null, 46, null);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        o0000OO0.OooOo0(o0000OO0.OooO0O0(getDispatchers().getDefault()), null, new C39721(null), 3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        o0000OO0.OooOo0(o0000OO0.OooO0O0(getDispatchers().getDefault()), null, new C39731(z, null), 3);
    }
}
