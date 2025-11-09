package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class AnimatorKt {

    /* renamed from: androidx.core.animation.AnimatorKt$addListener$1 */
    public static final class C01941 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C01941 INSTANCE = new C01941();

        public C01941() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$addListener$2 */
    public static final class C01952 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C01952 INSTANCE = new C01952();

        public C01952() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$addListener$3 */
    public static final class C01963 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C01963 INSTANCE = new C01963();

        public C01963() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$addListener$4 */
    public static final class C01974 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C01974 INSTANCE = new C01974();

        public C01974() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$addPauseListener$1 */
    public static final class C01981 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C01981 INSTANCE = new C01981();

        public C01981() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return OooOo.f33195OooO00o;
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$addPauseListener$2 */
    public static final class C01992 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C01992 INSTANCE = new C01992();

        public C01992() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return OooOo.f33195OooO00o;
        }
    }

    public static final Animator.AnimatorListener addListener(Animator animator, o00O0Oo.Oooo000 oooo000, o00O0Oo.Oooo000 oooo0002, o00O0Oo.Oooo000 oooo0003, o00O0Oo.Oooo000 oooo0004) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(oooo0004, oooo000, oooo0003, oooo0002);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, o00O0Oo.Oooo000 oooo000, o00O0Oo.Oooo000 oooo0002, o00O0Oo.Oooo000 oooo0003, o00O0Oo.Oooo000 oooo0004, int i, Object obj) {
        if ((i & 1) != 0) {
            oooo000 = C01941.INSTANCE;
        }
        if ((i & 2) != 0) {
            oooo0002 = C01952.INSTANCE;
        }
        if ((i & 4) != 0) {
            oooo0003 = C01963.INSTANCE;
        }
        if ((i & 8) != 0) {
            oooo0004 = C01974.INSTANCE;
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(oooo0004, oooo000, oooo0003, oooo0002);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final o00O0Oo.Oooo000 oooo000, final o00O0Oo.Oooo000 oooo0002) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                oooo0002.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                oooo000.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, o00O0Oo.Oooo000 oooo000, o00O0Oo.Oooo000 oooo0002, int i, Object obj) {
        if ((i & 1) != 0) {
            oooo000 = C01981.INSTANCE;
        }
        if ((i & 2) != 0) {
            oooo0002 = C01992.INSTANCE;
        }
        return addPauseListener(animator, oooo000, oooo0002);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final o00O0Oo.Oooo000 oooo000) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                oooo000.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final o00O0Oo.Oooo000 oooo000) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                oooo000.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, o00O0Oo.Oooo000 oooo000) {
        return addPauseListener$default(animator, null, oooo000, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final o00O0Oo.Oooo000 oooo000) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                oooo000.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, o00O0Oo.Oooo000 oooo000) {
        return addPauseListener$default(animator, oooo000, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final o00O0Oo.Oooo000 oooo000) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                oooo000.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
