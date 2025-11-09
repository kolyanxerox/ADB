package com.unity3d.ads.adplayer;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1", m13472f = "AndroidWebViewContainer.kt", m13473l = {}, m13474m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AndroidWebViewContainer$applySafeAreaInsets$1$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ String $js;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$applySafeAreaInsets$1$1(AndroidWebViewContainer androidWebViewContainer, String str, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = androidWebViewContainer;
        this.$js = str;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        AndroidWebViewContainer$applySafeAreaInsets$1$1 androidWebViewContainer$applySafeAreaInsets$1$1 = new AndroidWebViewContainer$applySafeAreaInsets$1$1(this.this$0, this.$js, oooO0OO);
        androidWebViewContainer$applySafeAreaInsets$1$1.L$0 = obj;
        return androidWebViewContainer$applySafeAreaInsets$1$1;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000OOo.OooOO0O(obj);
        AndroidWebViewContainer androidWebViewContainer = this.this$0;
        try {
            androidWebViewContainer.getWebView().evaluateJavascript(this.$js, null);
        } catch (Throwable th) {
            o000OOo.OooO0O0(th);
        }
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((AndroidWebViewContainer$applySafeAreaInsets$1$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
