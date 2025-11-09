package com.unity3d.services.core.extensions;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", m13472f = "CoroutineExtensions.kt", m13473l = {41}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ Oooo000 $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(Oooo000 oooo000, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$action = oooo000;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return obj;
        }
        o000OOo.OooOO0O(obj);
        Oooo000 oooo000 = this.$action;
        this.label = 1;
        Object objInvoke = oooo000.invoke(this);
        return objInvoke == oooOo00 ? oooOo00 : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
