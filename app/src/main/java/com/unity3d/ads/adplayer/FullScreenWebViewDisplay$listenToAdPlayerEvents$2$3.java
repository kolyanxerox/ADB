package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {}, m13474m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends OooOOOO implements o00O0O {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, oooO0OO);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(DisplayMessage displayMessage, OooO0OO oooO0OO) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000OOo.OooOO0O(obj);
        DisplayMessage displayMessage = (DisplayMessage) this.L$0;
        if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
            this.this$0.finish();
        } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
            this.this$0.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
        } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
            this.this$0.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
        }
        return OooOo.f33195OooO00o;
    }
}
