package com.unity3d.ads.adplayer;

import androidx.lifecycle.LifecycleOwnerKt;
import com.unity3d.ads.adplayer.DisplayMessage;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o0Oo0oo;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OO0oO0;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {}, m13474m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ o0Oo0oo $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    @OooO(m13471c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", m13472f = "FullScreenWebViewDisplay.kt", m13473l = {102}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1 */
    public static final class C39651 extends OooOOOO implements o00O0O {
        final /* synthetic */ o0Oo0oo $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39651(FullScreenWebViewDisplay fullScreenWebViewDisplay, o0Oo0oo o0oo0oo, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C39651 c39651 = new C39651(this.this$0, this.$continuation, oooO0OO);
            c39651.L$0 = obj;
            return c39651;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o000OO o000oo2;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o000OO o000oo3 = (o000OO) this.L$0;
                o0OO0oO0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(this.this$0.opportunityId);
                this.L$0 = o000oo3;
                this.label = 1;
                if (displayMessages.emit(webViewInstanceRequest, this) == oooOo00) {
                    return oooOo00;
                }
                o000oo2 = o000oo3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000oo2 = (o000OO) this.L$0;
                o000OOo.OooOO0O(obj);
            }
            o0000OO0.OooOO0o(o000oo2.getCoroutineContext());
            o0Oo0oo o0oo0oo = this.$continuation;
            OooOo oooOo = OooOo.f33195OooO00o;
            o0oo0oo.resumeWith(oooOo);
            return oooOo;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39651) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, o0Oo0oo o0oo0oo, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = o0oo0oo;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000OOo.OooOO0O(obj);
        o0000OO0.OooOo0(LifecycleOwnerKt.getLifecycleScope(this.this$0), this.this$0.getDispatchers().getDefault(), new C39651(this.this$0, this.$continuation, null), 2);
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
