package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.ironsource.InterfaceC3173h3;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0;
import o00O0oOo.o00O0O00;
import o00OO000.Oooo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class PausingDispatcherKt {

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m13472f = "PausingDispatcher.jvm.kt", m13473l = {InterfaceC3173h3.c.b.f8814f}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 */
    public static final class C05582 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05582(Lifecycle lifecycle, Lifecycle.State state, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C05582 c05582 = new C05582(this.$this_whenStateAtLeast, this.$minState, this.$block, oooO0OO);
            c05582.L$0 = obj;
            return c05582;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    o000OOo.OooOO0O(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            o000OOo.OooOO0O(obj);
            o00O0O00 o00o0o00 = (o00O0O00) ((o000OO) this.L$0).getCoroutineContext().get(o00O0.f31523OooOo0O);
            if (o00o0o00 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, o00o0o00);
            try {
                o00O0O o00o0o = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = o0000OO0.Oooo00O(o00o0o, pausingDispatcher, this);
                if (obj == oooOo00) {
                    return oooOo00;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05582) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        return whenCreated(lifecycleOwner.getLifecycle(), o00o0o, oooO0OO);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        return whenResumed(lifecycleOwner.getLifecycle(), o00o0o, oooO0OO);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        return whenStarted(lifecycleOwner.getLifecycle(), o00o0o, oooO0OO);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        return o0000OO0.Oooo00O(new C05582(lifecycle, state, o00o0o, null), Oooo0.f31951OooO00o.f31652OooOo, oooO0OO);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, o00o0o, oooO0OO);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, o00o0o, oooO0OO);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, o00o0o, oooO0OO);
    }
}
