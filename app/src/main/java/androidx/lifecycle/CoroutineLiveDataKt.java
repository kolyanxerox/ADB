package androidx.lifecycle;

import java.time.Duration;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0O0O.OooOOO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00OO000.Oooo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m13472f = "CoroutineLiveData.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 */
    public static final class C05432 extends OooOOOO implements o00O0O {
        final /* synthetic */ LiveData<T> $source;
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        int label;

        /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1 */
        public static final class AnonymousClass1 extends Oooo000 implements o00O0Oo.Oooo000 {
            final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MediatorLiveData<T> mediatorLiveData) {
                super(1);
                this.$this_addDisposableSource = mediatorLiveData;
            }

            @Override // o00O0Oo.Oooo000
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m13526invoke((AnonymousClass1) obj);
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke */
            public final void m13526invoke(T t) {
                this.$this_addDisposableSource.setValue(t);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05432(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C05432(this.$this_addDisposableSource, this.$source, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(mediatorLiveData)));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05432) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, o00O0O0O.OooO0OO oooO0OO) {
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        return o0000OO0.Oooo00O(new C05432(mediatorLiveData, liveData, null), Oooo0.f31951OooO00o.f31652OooOo, oooO0OO);
    }

    public static final <T> LiveData<T> liveData(Duration timeout, o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(timeout, "timeout");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return liveData$default(timeout, (OooOOO0) null, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(OooOOO0 oooOOO0, long j, o00O0O o00o0o, int i, Object obj) {
        if ((i & 1) != 0) {
            oooOOO0 = OooOOO.f31358OooOo0O;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return liveData(oooOOO0, j, o00o0o);
    }

    public static final <T> LiveData<T> liveData(OooOOO0 context, o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return liveData$default((OooOOO0) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, OooOOO0 oooOOO0, o00O0O o00o0o, int i, Object obj) {
        if ((i & 2) != 0) {
            oooOOO0 = OooOOO.f31358OooOo0O;
        }
        return liveData(duration, oooOOO0, o00o0o);
    }

    public static final <T> LiveData<T> liveData(OooOOO0 context, long j, o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return new CoroutineLiveData(context, j, block);
    }

    public static final <T> LiveData<T> liveData(Duration timeout, OooOOO0 context, o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(timeout, "timeout");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
