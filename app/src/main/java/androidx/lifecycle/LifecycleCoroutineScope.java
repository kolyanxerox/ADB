package androidx.lifecycle;

import o00O0.o000OOo;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import oo00o.OooOo;

/* loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements o000OO {

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m13472f = "Lifecycle.jvm.kt", m13473l = {55}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 */
    public static final class C05501 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05501(o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$block = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return LifecycleCoroutineScope.this.new C05501(this.$block, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                o00O0O o00o0o = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, o00o0o, this) == oooOo00) {
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
            return ((C05501) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m13472f = "Lifecycle.jvm.kt", m13473l = {93}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 */
    public static final class C05511 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05511(o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$block = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return LifecycleCoroutineScope.this.new C05511(this.$block, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                o00O0O o00o0o = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, o00o0o, this) == oooOo00) {
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
            return ((C05511) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m13472f = "Lifecycle.jvm.kt", m13473l = {74}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 */
    public static final class C05521 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05521(o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$block = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return LifecycleCoroutineScope.this.new C05521(this.$block, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                o00O0O o00o0o = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, o00o0o, this) == oooOo00) {
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
            return ((C05521) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @Override // o00O0oOo.o000OO
    public abstract /* synthetic */ OooOOO0 getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final o00O0O00 launchWhenCreated(o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return o0000OO0.OooOo0(this, null, new C05501(block, null), 3);
    }

    public final o00O0O00 launchWhenResumed(o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return o0000OO0.OooOo0(this, null, new C05511(block, null), 3);
    }

    public final o00O0O00 launchWhenStarted(o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return o0000OO0.OooOo0(this, null, new C05521(block, null), 3);
    }
}
