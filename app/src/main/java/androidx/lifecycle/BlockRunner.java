package androidx.lifecycle;

import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import o00OO000.Oooo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class BlockRunner<T> {
    private final o00O0O block;
    private o00O0O00 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final o00O0Oo.OooO0O0 onDone;
    private o00O0O00 runningJob;
    private final o000OO scope;
    private final long timeoutInMs;

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.BlockRunner$cancel$1", m13472f = "CoroutineLiveData.kt", m13473l = {188}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.BlockRunner$cancel$1 */
    public static final class C05401 extends OooOOOO implements o00O0O {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05401(BlockRunner<T> blockRunner, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = blockRunner;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C05401(this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                long j = ((BlockRunner) this.this$0).timeoutInMs;
                this.label = 1;
                if (o0000OO0.OooOO0O(j, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                o00O0O00 o00o0o00 = ((BlockRunner) this.this$0).runningJob;
                if (o00o0o00 != null) {
                    o00o0o00.OooO00o(null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05401) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.BlockRunner$maybeRun$1", m13472f = "CoroutineLiveData.kt", m13473l = {177}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.BlockRunner$maybeRun$1 */
    public static final class C05411 extends OooOOOO implements o00O0O {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05411(BlockRunner<T> blockRunner, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = blockRunner;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C05411 c05411 = new C05411(this.this$0, oooO0OO);
            c05411.L$0 = obj;
            return c05411;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((o000OO) this.L$0).getCoroutineContext());
                o00O0O o00o0o = ((BlockRunner) this.this$0).block;
                this.label = 1;
                if (o00o0o.invoke(liveDataScopeImpl, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05411) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public BlockRunner(CoroutineLiveData<T> liveData, o00O0O block, long j, o000OO scope, o00O0Oo.OooO0O0 onDone) {
        kotlin.jvm.internal.OooOo.OooO0o0(liveData, "liveData");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        kotlin.jvm.internal.OooOo.OooO0o0(scope, "scope");
        kotlin.jvm.internal.OooOo.OooO0o0(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j;
        this.scope = scope;
        this.onDone = onDone;
    }

    public final void cancel() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        o000OO o000oo2 = this.scope;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        this.cancellationJob = o0000OO0.OooOo0(o000oo2, Oooo0.f31951OooO00o.f31652OooOo, new C05401(this, null), 2);
    }

    public final void maybeRun() {
        o00O0O00 o00o0o00 = this.cancellationJob;
        if (o00o0o00 != null) {
            o00o0o00.OooO00o(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = o0000OO0.OooOo0(this.scope, null, new C05411(this, null), 3);
    }
}
