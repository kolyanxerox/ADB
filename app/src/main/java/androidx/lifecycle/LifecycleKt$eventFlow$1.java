package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import oo00o.OooOo;

@o00O0OO0.OooO(m13471c = "androidx.lifecycle.LifecycleKt$eventFlow$1", m13472f = "Lifecycle.kt", m13473l = {388}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LifecycleKt$eventFlow$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: androidx.lifecycle.LifecycleKt$eventFlow$1$1 */
    public static final class C05541 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ LifecycleEventObserver $observer;
        final /* synthetic */ Lifecycle $this_eventFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05541(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            super(0);
            this.$this_eventFlow = lifecycle;
            this.$observer = lifecycleEventObserver;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13527invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13527invoke() {
            this.$this_eventFlow.removeObserver(this.$observer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$this_eventFlow = lifecycle;
    }

    public static final void invokeSuspend$lambda$0(o00oOoo o00oooo, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ((o0O0ooO) o00oooo).OooO(event);
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, oooO0OO);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o00oOoo o00oooo = (o00oOoo) this.L$0;
            OooO0o oooO0o = new OooO0o(o00oooo, 0);
            this.$this_eventFlow.addObserver(oooO0o);
            C05541 c05541 = new C05541(this.$this_eventFlow, oooO0o);
            this.label = 1;
            if (o00O0O0O.OooO00o(o00oooo, c05541, this) == oooOo00) {
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
    public final Object invoke(o00oOoo o00oooo, o00O0O0O.OooO0OO oooO0OO) {
        return ((LifecycleKt$eventFlow$1) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
