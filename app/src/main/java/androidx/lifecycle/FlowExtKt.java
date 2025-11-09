package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class FlowExtKt {

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m13472f = "FlowExt.kt", m13473l = {91}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 */
    public static final class C05461 extends OooOOOO implements o00O0O {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ o0OoOoOo $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @o00O0OO0.OooO(m13471c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m13472f = "FlowExt.kt", m13473l = {92}, m13474m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ o00oOoo $$this$callbackFlow;
            final /* synthetic */ o0OoOoOo $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(o0OoOoOo o0oooooo, o00oOoo o00oooo, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$this_flowWithLifecycle = o0oooooo;
                this.$$this$callbackFlow = o00oooo;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o0OoOoOo o0oooooo = this.$this_flowWithLifecycle;
                    final o00oOoo o00oooo = this.$$this$callbackFlow;
                    o0O000Oo o0o000oo = new o0O000Oo() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // o00O0ooo.o0O000Oo
                        public final Object emit(T t, o00O0O0O.OooO0OO oooO0OO) {
                            Object objOooOOO0 = ((o0O0ooO) o00oooo).f31651OooOoO0.OooOOO0(t, oooO0OO);
                            return objOooOOO0 == OooOo00.f31365OooOo0O ? objOooOOO0 : OooOo.f33195OooO00o;
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
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05461(Lifecycle lifecycle, Lifecycle.State state, o0OoOoOo o0oooooo, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = o0oooooo;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C05461 c05461 = new C05461(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, oooO0OO);
            c05461.L$0 = obj;
            return c05461;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o00oOoo o00oooo;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o00oOoo o00oooo2 = (o00oOoo) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, o00oooo2, null);
                this.L$0 = o00oooo2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == oooOo00) {
                    return oooOo00;
                }
                o00oooo = o00oooo2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oooo = (o00oOoo) this.L$0;
                o000OOo.OooOO0O(obj);
            }
            ((o0O0ooO) o00oooo).OooOOO(null);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o00oOoo o00oooo, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05461) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public static final <T> o0OoOoOo flowWithLifecycle(o0OoOoOo o0oooooo, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        kotlin.jvm.internal.OooOo.OooO0o0(o0oooooo, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(lifecycle, "lifecycle");
        kotlin.jvm.internal.OooOo.OooO0o0(minActiveState, "minActiveState");
        return o0o0000.OooO0oo(new C05461(lifecycle, minActiveState, o0oooooo, null));
    }

    public static /* synthetic */ o0OoOoOo flowWithLifecycle$default(o0OoOoOo o0oooooo, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(o0oooooo, lifecycle, state);
    }
}
