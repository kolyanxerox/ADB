package com.unity3d.ads.core.domain;

import com.unity3d.services.core.misc.Utilities;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {
    private final o0000O00 mainDispatcher;

    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", m13472f = "CommonSafeCallbackInvoke.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1 */
    public static final class C41041 extends OooOOOO implements o00O0O {
        final /* synthetic */ OooO0O0 $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41041(OooO0O0 oooO0O0, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$block = oooO0O0;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C41041(this.$block, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            final OooO0O0 oooO0O0 = this.$block;
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    oooO0O0.invoke();
                }
            });
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41041) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public CommonSafeCallbackInvoke(o0000O00 mainDispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(mainDispatcher, "mainDispatcher");
        this.mainDispatcher = mainDispatcher;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(OooO0O0 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        o0000OO0.OooOo0(o0000OO0.OooO0O0(this.mainDispatcher), null, new C41041(block, null), 3);
    }
}
