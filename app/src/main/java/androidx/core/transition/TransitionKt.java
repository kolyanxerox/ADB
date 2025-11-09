package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class TransitionKt {

    /* renamed from: androidx.core.transition.TransitionKt$addListener$1 */
    public static final class C02311 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02311 INSTANCE = new C02311();

        public C02311() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$addListener$2 */
    public static final class C02322 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02322 INSTANCE = new C02322();

        public C02322() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$addListener$3 */
    public static final class C02333 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02333 INSTANCE = new C02333();

        public C02333() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$addListener$4 */
    public static final class C02344 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02344 INSTANCE = new C02344();

        public C02344() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$addListener$5 */
    public static final class C02355 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02355 INSTANCE = new C02355();

        public C02355() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return OooOo.f33195OooO00o;
        }
    }

    public static final Transition.TransitionListener addListener(Transition transition, o00O0Oo.Oooo000 oooo000, o00O0Oo.Oooo000 oooo0002, o00O0Oo.Oooo000 oooo0003, o00O0Oo.Oooo000 oooo0004, o00O0Oo.Oooo000 oooo0005) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(oooo000, oooo0004, oooo0005, oooo0003, oooo0002);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, o00O0Oo.Oooo000 oooo000, o00O0Oo.Oooo000 oooo0002, o00O0Oo.Oooo000 oooo0003, o00O0Oo.Oooo000 oooo0004, o00O0Oo.Oooo000 oooo0005, int i, Object obj) {
        if ((i & 1) != 0) {
            oooo000 = C02311.INSTANCE;
        }
        if ((i & 2) != 0) {
            oooo0002 = C02322.INSTANCE;
        }
        o00O0Oo.Oooo000 oooo0006 = oooo0002;
        if ((i & 4) != 0) {
            oooo0003 = C02333.INSTANCE;
        }
        if ((i & 8) != 0) {
            oooo0004 = C02344.INSTANCE;
        }
        if ((i & 16) != 0) {
            oooo0005 = C02355.INSTANCE;
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(oooo000, oooo0004, oooo0005, oooo0003, oooo0006);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final o00O0Oo.Oooo000 oooo000) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                oooo000.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final o00O0Oo.Oooo000 oooo000) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                oooo000.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final o00O0Oo.Oooo000 oooo000) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                oooo000.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final o00O0Oo.Oooo000 oooo000) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                oooo000.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final o00O0Oo.Oooo000 oooo000) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                oooo000.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
