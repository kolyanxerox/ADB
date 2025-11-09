package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0O0O.OooOOO;
import o00O0O0o.OooOo00;
import o00O0oOo.o0000O00;
import o00O0oOo.o000O0O0;
import o00O0oOo.o0Oo0oo;
import o00O0oOo.oo0o0Oo;
import o00OO000.Oooo0;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 */
    public static final class C05712 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ o00O0Oo.OooO0O0 $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05712(o00O0Oo.OooO0O0 oooO0O0) {
            super(0);
            this.$block = oooO0O0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
        @Override // o00O0Oo.OooO0O0
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z, o0000O00 o0000o00, final o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        final oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        final ?? r7 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Object objOooO0O0;
                OooOo.OooO0o0(source, "source");
                OooOo.OooO0o0(event, "event");
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        oo0o0oo.resumeWith(o000OOo.OooO0O0(new LifecycleDestroyedException()));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                o0Oo0oo o0oo0oo = oo0o0oo;
                try {
                    objOooO0O0 = oooO0O0.invoke();
                } catch (Throwable th) {
                    objOooO0O0 = o000OOo.OooO0O0(th);
                }
                o0oo0oo.resumeWith(objOooO0O0);
            }
        };
        if (z) {
            o0000o00.dispatch(OooOOO.f31358OooOo0O, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r7);
                }
            });
        } else {
            lifecycle.addObserver(r7);
        }
        oo0o0oo.OooOo00(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(o0000o00, lifecycle, r7));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return oooO0O0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return oooO0O0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return oooO0O0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return oooO0O0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
            o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return oooO0O0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
            o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return oooO0O0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return oooO0O0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return oooO0O0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, o00O0Oo.OooO0O0 oooO0O0, o00O0O0O.OooO0OO oooO0OO) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
            o00O0oo0.o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
            boolean zIsDispatchNeeded = o0oo0oo.isDispatchNeeded(oooO0OO.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return oooO0O0.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, o0oo0oo, new C05712(oooO0O0), oooO0OO);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
