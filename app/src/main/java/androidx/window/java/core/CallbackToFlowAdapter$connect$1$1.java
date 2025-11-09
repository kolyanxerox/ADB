package androidx.window.java.core;

import androidx.core.util.Consumer;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OoOoOo;
import oo00o.OooOo;

@OooO(m13471c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", m13472f = "CallbackToFlowAdapter.kt", m13473l = {46}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CallbackToFlowAdapter$connect$1$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ Consumer<T> $consumer;
    final /* synthetic */ o0OoOoOo $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackToFlowAdapter$connect$1$1(o0OoOoOo o0oooooo, Consumer<T> consumer, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$flow = o0oooooo;
        this.$consumer = consumer;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new CallbackToFlowAdapter$connect$1$1(this.$flow, this.$consumer, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o0OoOoOo o0oooooo = this.$flow;
            final Consumer<T> consumer = this.$consumer;
            o0O000Oo o0o000oo = new o0O000Oo() { // from class: androidx.window.java.core.CallbackToFlowAdapter$connect$1$1.1
                @Override // o00O0ooo.o0O000Oo
                public final Object emit(T t, OooO0OO oooO0OO) {
                    consumer.accept(t);
                    return OooOo.f33195OooO00o;
                }
            };
            this.label = 1;
            if (o0oooooo.collect(o0o000oo, this) == oooOo00) {
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
        return ((CallbackToFlowAdapter$connect$1$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
