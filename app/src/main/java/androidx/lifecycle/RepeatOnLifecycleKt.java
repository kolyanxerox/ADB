package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00O0oo0.o0Oo0oo;
import o00OO000.Oooo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m13472f = "RepeatOnLifecycle.kt", m13473l = {84}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 */
    public static final class C05593 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @o00O0OO0.OooO(m13471c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m13472f = "RepeatOnLifecycle.kt", m13473l = {166}, m13474m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ o000OO $$this$coroutineScope;
            final /* synthetic */ o00O0O $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, o000OO o000oo2, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = o000oo2;
                this.$block = o00o0o;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, oooO0OO);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
            @Override // o00O0OO0.OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    r14 = this;
                    o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                    int r1 = r14.label
                    oo00o.OooOo r2 = oo00o.OooOo.f33195OooO00o
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L36
                    if (r1 != r4) goto L2e
                    java.lang.Object r0 = r14.L$5
                    o00O0Oo.o00O0O r0 = (o00O0Oo.o00O0O) r0
                    java.lang.Object r0 = r14.L$4
                    o00O0oOo.o000OO r0 = (o00O0oOo.o000OO) r0
                    java.lang.Object r0 = r14.L$3
                    androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                    java.lang.Object r0 = r14.L$2
                    androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                    java.lang.Object r0 = r14.L$1
                    r1 = r0
                    kotlin.jvm.internal.o0Oo0oo r1 = (kotlin.jvm.internal.o0Oo0oo) r1
                    java.lang.Object r0 = r14.L$0
                    r4 = r0
                    kotlin.jvm.internal.o0Oo0oo r4 = (kotlin.jvm.internal.o0Oo0oo) r4
                    o00O0.o000OOo.OooOO0O(r15)     // Catch: java.lang.Throwable -> L2a
                    goto L90
                L2a:
                    r0 = move-exception
                    r15 = r0
                    goto La8
                L2e:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L36:
                    o00O0.o000OOo.OooOO0O(r15)
                    androidx.lifecycle.Lifecycle r15 = r14.$this_repeatOnLifecycle
                    androidx.lifecycle.Lifecycle$State r15 = r15.getCurrentState()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                    if (r15 != r1) goto L44
                    goto La4
                L44:
                    kotlin.jvm.internal.o0Oo0oo r7 = new kotlin.jvm.internal.o0Oo0oo
                    r7.<init>()
                    kotlin.jvm.internal.o0Oo0oo r1 = new kotlin.jvm.internal.o0Oo0oo
                    r1.<init>()
                    androidx.lifecycle.Lifecycle$State r15 = r14.$state     // Catch: java.lang.Throwable -> La5
                    androidx.lifecycle.Lifecycle r13 = r14.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La5
                    o00O0oOo.o000OO r8 = r14.$$this$coroutineScope     // Catch: java.lang.Throwable -> La5
                    o00O0Oo.o00O0O r12 = r14.$block     // Catch: java.lang.Throwable -> La5
                    r14.L$0 = r7     // Catch: java.lang.Throwable -> La5
                    r14.L$1 = r1     // Catch: java.lang.Throwable -> La5
                    r14.L$2 = r15     // Catch: java.lang.Throwable -> La5
                    r14.L$3 = r13     // Catch: java.lang.Throwable -> La5
                    r14.L$4 = r8     // Catch: java.lang.Throwable -> La5
                    r14.L$5 = r12     // Catch: java.lang.Throwable -> La5
                    r14.label = r4     // Catch: java.lang.Throwable -> La5
                    o00O0oOo.oo0o0Oo r10 = new o00O0oOo.oo0o0Oo     // Catch: java.lang.Throwable -> La5
                    o00O0O0O.OooO0OO r5 = Oooo0o0.OooO.OooOOOO(r14)     // Catch: java.lang.Throwable -> La5
                    r10.<init>(r4, r5)     // Catch: java.lang.Throwable -> La5
                    r10.OooOOo0()     // Catch: java.lang.Throwable -> La5
                    androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> La5
                    androidx.lifecycle.Lifecycle$Event r6 = r4.upTo(r15)     // Catch: java.lang.Throwable -> La5
                    androidx.lifecycle.Lifecycle$Event r9 = r4.downFrom(r15)     // Catch: java.lang.Throwable -> La5
                    o00OO0O0.OooO0o r11 = o00OO0O0.OooO.OooO00o()     // Catch: java.lang.Throwable -> La5
                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r5 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La5
                    r5.<init>()     // Catch: java.lang.Throwable -> La5
                    r1.f28880OooOo0O = r5     // Catch: java.lang.Throwable -> La5
                    r13.addObserver(r5)     // Catch: java.lang.Throwable -> La5
                    java.lang.Object r15 = r10.OooOOOo()     // Catch: java.lang.Throwable -> La5
                    if (r15 != r0) goto L8f
                    return r0
                L8f:
                    r4 = r7
                L90:
                    java.lang.Object r15 = r4.f28880OooOo0O
                    o00O0oOo.o00O0O00 r15 = (o00O0oOo.o00O0O00) r15
                    if (r15 == 0) goto L99
                    r15.OooO00o(r3)
                L99:
                    java.lang.Object r15 = r1.f28880OooOo0O
                    androidx.lifecycle.LifecycleEventObserver r15 = (androidx.lifecycle.LifecycleEventObserver) r15
                    if (r15 == 0) goto La4
                    androidx.lifecycle.Lifecycle r0 = r14.$this_repeatOnLifecycle
                    r0.removeObserver(r15)
                La4:
                    return r2
                La5:
                    r0 = move-exception
                    r15 = r0
                    r4 = r7
                La8:
                    java.lang.Object r0 = r4.f28880OooOo0O
                    o00O0oOo.o00O0O00 r0 = (o00O0oOo.o00O0O00) r0
                    if (r0 == 0) goto Lb1
                    r0.OooO00o(r3)
                Lb1:
                    java.lang.Object r0 = r1.f28880OooOo0O
                    androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                    if (r0 == 0) goto Lbc
                    androidx.lifecycle.Lifecycle r1 = r14.$this_repeatOnLifecycle
                    r1.removeObserver(r0)
                Lbc:
                    throw r15
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt.C05593.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05593(Lifecycle lifecycle, Lifecycle.State state, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C05593 c05593 = new C05593(this.$this_repeatOnLifecycle, this.$state, this.$block, oooO0OO);
            c05593.L$0 = obj;
            return c05593;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o000OO o000oo2 = (o000OO) this.L$0;
                o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
                o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, o000oo2, this.$block, null);
                this.label = 1;
                if (o0000OO0.Oooo00O(anonymousClass1, o0oo0oo, this) == oooOo00) {
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
            return ((C05593) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        Object objOooOO0;
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        Lifecycle.State currentState = lifecycle.getCurrentState();
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        OooOo oooOo = OooOo.f33195OooO00o;
        return (currentState != state2 && (objOooOO0 = o0000OO0.OooOO0(new C05593(lifecycle, state, o00o0o, null), oooO0OO)) == OooOo00.f31365OooOo0O) ? objOooOO0 : oooOo;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, o00o0o, oooO0OO);
        return objRepeatOnLifecycle == OooOo00.f31365OooOo0O ? objRepeatOnLifecycle : OooOo.f33195OooO00o;
    }
}
