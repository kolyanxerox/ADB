package androidx.datastore.core;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", m13472f = "MultiProcessCoordinator.android.kt", m13473l = {}, m13474m = "invokeSuspend")
/* renamed from: androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1 */
/* loaded from: classes.dex */
public final class C0312xb55e9682 extends OooOOOO implements o00O0O {
    int label;
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312xb55e9682(MultiProcessCoordinator multiProcessCoordinator, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new C0312xb55e9682(this.this$0, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000OOo.OooOO0O(obj);
        return new Integer(this.this$0.getSharedCounter().incrementAndGetValue());
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((C0312xb55e9682) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
