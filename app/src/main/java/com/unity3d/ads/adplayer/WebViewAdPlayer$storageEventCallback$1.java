package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.services.core.device.StorageEventInfo;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public final class WebViewAdPlayer$storageEventCallback$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ WebViewAdPlayer this$0;

    @OooO(m13471c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", m13472f = "WebViewAdPlayer.kt", m13473l = {67}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1 */
    public static final class C40021 extends OooOOOO implements o00O0O {
        final /* synthetic */ StorageEventInfo $it;
        int label;
        final /* synthetic */ WebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40021(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = webViewAdPlayer;
            this.$it = storageEventInfo;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C40021(this.this$0, this.$it, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                WebViewBridge webViewBridge = this.this$0.bridge;
                OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                this.label = 1;
                if (webViewBridge.sendEvent(onStorageEvent, this) == oooOo00) {
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
            return ((C40021) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$storageEventCallback$1(WebViewAdPlayer webViewAdPlayer) {
        super(1);
        this.this$0 = webViewAdPlayer;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StorageEventInfo) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(StorageEventInfo it) {
        kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
        o0000OO0.OooOo0(this.this$0.getScope(), null, new C40021(this.this$0, it, null), 3);
    }
}
