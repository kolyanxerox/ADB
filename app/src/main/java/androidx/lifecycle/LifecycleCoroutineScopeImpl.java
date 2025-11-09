package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o00O0.o000OOo;
import o00O0O0O.OooOOO0;
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
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final OooOOO0 coroutineContext;
    private final Lifecycle lifecycle;

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m13472f = "Lifecycle.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 */
    public static final class C05531 extends OooOOOO implements o00O0O {
        private /* synthetic */ Object L$0;
        int label;

        public C05531(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C05531 c05531 = LifecycleCoroutineScopeImpl.this.new C05531(oooO0OO);
            c05531.L$0 = obj;
            return c05531;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            o000OO o000oo2 = (o000OO) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                o00O0O00 o00o0o00 = (o00O0O00) o000oo2.getCoroutineContext().get(o00O0.f31523OooOo0O);
                if (o00o0o00 != null) {
                    o00o0o00.OooO00o(null);
                }
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05531) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, OooOOO0 coroutineContext) {
        o00O0O00 o00o0o00;
        kotlin.jvm.internal.OooOo.OooO0o0(lifecycle, "lifecycle");
        kotlin.jvm.internal.OooOo.OooO0o0(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() != Lifecycle.State.DESTROYED || (o00o0o00 = (o00O0O00) getCoroutineContext().get(o00O0.f31523OooOo0O)) == null) {
            return;
        }
        o00o0o00.OooO00o(null);
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, o00O0oOo.o000OO
    public OooOOO0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            o00O0O00 o00o0o00 = (o00O0O00) getCoroutineContext().get(o00O0.f31523OooOo0O);
            if (o00o0o00 != null) {
                o00o0o00.OooO00o(null);
            }
        }
    }

    public final void register() {
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o0000OO0.OooOo0(this, Oooo0.f31951OooO00o.f31652OooOo, new C05531(null), 2);
    }
}
