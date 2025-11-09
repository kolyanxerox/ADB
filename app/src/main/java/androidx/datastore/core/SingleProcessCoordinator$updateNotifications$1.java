package androidx.datastore.core;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0ooo.o0O000Oo;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", m13472f = "SingleProcessCoordinator.kt", m13473l = {}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SingleProcessCoordinator$updateNotifications$1 extends OooOOOO implements o00O0O {
    int label;

    public SingleProcessCoordinator$updateNotifications$1(OooO0OO oooO0OO) {
        super(2, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new SingleProcessCoordinator$updateNotifications$1(oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000OOo.OooOO0O(obj);
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
