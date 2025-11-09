package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", m13472f = "InitializeStateReset.kt", m13473l = {42}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InitializeStateReset$doWork$2$1$success$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    @OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", m13472f = "InitializeStateReset.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1 */
    public static final class C43271 extends OooOOOO implements o00O0O {
        final /* synthetic */ WebViewApp $currentApp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43271(WebViewApp webViewApp, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$currentApp = webViewApp;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C43271(this.$currentApp, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            WebView webView = this.$currentApp.getWebView();
            if (webView != null) {
                webView.destroy();
            }
            this.$currentApp.setWebView(null);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C43271) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o0000O00 main = this.this$0.dispatchers.getMain();
            C43271 c43271 = new C43271(this.$currentApp, null);
            this.label = 1;
            if (o0000OO0.Oooo00O(c43271, main, this) == oooOo00) {
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
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((InitializeStateReset$doWork$2$1$success$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
