package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.FlowLiveDataConversions;
import com.ironsource.InterfaceC3173h3;
import java.time.Duration;
import o00O0.o000OOo;
import o00O0O0O.OooOOO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00O0oOo.o00OO0O0;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import o00O0oo0.o0Oo0oo;
import o00O0ooo.InterfaceC4522o;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00OO000.Oooo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class FlowLiveDataConversions {

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m13472f = "FlowLiveData.kt", m13473l = {107, InterfaceC3173h3.d.b.f8827j, 113, 115}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1 */
    public static final class C05471 extends OooOOOO implements o00O0O {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        @o00O0OO0.OooO(m13471c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m13472f = "FlowLiveData.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LiveData<T> liveData, Observer<T> observer, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass1(this.$this_asFlow, this.$observer, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return OooOo.f33195OooO00o;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        @o00O0OO0.OooO(m13471c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m13472f = "FlowLiveData.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return OooOo.f33195OooO00o;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        @o00O0OO0.OooO(m13471c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", m13472f = "FlowLiveData.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends OooOOOO implements o00O0O {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(LiveData<T> liveData, Observer<T> observer, o00O0O0O.OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // o00O0OO0.OooO00o
            public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
                return new AnonymousClass3(this.$this_asFlow, this.$observer, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return OooOo.f33195OooO00o;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
                return ((AnonymousClass3) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05471(LiveData<T> liveData, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$this_asFlow = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(o00oOoo o00oooo, Object obj) {
            ((o0O0ooO) o00oooo).OooO(obj);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C05471 c05471 = new C05471(this.$this_asFlow, oooO0OO);
            c05471.L$0 = obj;
            return c05471;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.Observer, int] */
        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            ?? r1 = this.label;
            try {
            } catch (Throwable th) {
                o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
                OooOOO0 oooOOO0Plus = Oooo0.f31951OooO00o.f31652OooOo.plus(o00OO0O0.f31546OooOo0O);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_asFlow, r1, null);
                this.L$0 = th;
                this.label = 4;
                if (o0000OO0.Oooo00O(anonymousClass3, oooOOO0Plus, this) != oooOo00) {
                    throw th;
                }
            }
            if (r1 == 0) {
                o000OOo.OooOO0O(obj);
                final o00oOoo o00oooo = (o00oOoo) this.L$0;
                observer = new Observer() { // from class: androidx.lifecycle.OooO0O0
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        FlowLiveDataConversions.C05471.invokeSuspend$lambda$0(o00oooo, obj2);
                    }
                };
                o00OO00o.OooO oooO2 = o000O0O0.f31514OooO00o;
                o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer, null);
                this.L$0 = observer;
                this.label = 1;
                if (o0000OO0.Oooo00O(anonymousClass1, o0oo0oo, this) != oooOo00) {
                }
                return oooOo00;
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    observer = (Observer) this.L$0;
                    o000OOo.OooOO0O(obj);
                    this.L$0 = observer;
                    this.label = 3;
                    o0000OO0.OooO0oo(this);
                    return oooOo00;
                }
                if (r1 == 3) {
                    o000OOo.OooOO0O(obj);
                    throw new OooOOO0.OooO00o();
                }
                if (r1 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.L$0;
                o000OOo.OooOO0O(obj);
                throw th2;
            }
            observer = (Observer) this.L$0;
            o000OOo.OooOO0O(obj);
            o00OO00o.OooO oooO3 = o000O0O0.f31514OooO00o;
            o0Oo0oo o0oo0oo2 = Oooo0.f31951OooO00o.f31652OooOo;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, observer, null);
            this.L$0 = observer;
            this.label = 2;
            if (o0000OO0.Oooo00O(anonymousClass2, o0oo0oo2, this) == oooOo00) {
                return oooOo00;
            }
            this.L$0 = observer;
            this.label = 3;
            o0000OO0.OooO0oo(this);
            return oooOo00;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o00oOoo o00oooo, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05471) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m13472f = "FlowLiveData.kt", m13473l = {78}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 */
    public static final class C05481 extends OooOOOO implements o00O0O {
        final /* synthetic */ o0OoOoOo $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05481(o0OoOoOo o0oooooo, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$this_asLiveData = o0oooooo;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C05481 c05481 = new C05481(this.$this_asLiveData, oooO0OO);
            c05481.L$0 = obj;
            return c05481;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(LiveDataScope<T> liveDataScope, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05481) create(liveDataScope, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                o0OoOoOo o0oooooo = this.$this_asLiveData;
                o0O000Oo o0o000oo = new o0O000Oo() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // o00O0ooo.o0O000Oo
                    public final Object emit(T t, o00O0O0O.OooO0OO oooO0OO) {
                        Object objEmit = liveDataScope.emit(t, oooO0OO);
                        return objEmit == OooOo00.f31365OooOo0O ? objEmit : OooOo.f33195OooO00o;
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
    }

    public static final <T> o0OoOoOo asFlow(LiveData<T> liveData) {
        kotlin.jvm.internal.OooOo.OooO0o0(liveData, "<this>");
        return o0o0000.OooO0oO(o0o0000.OooO0oo(new C05471(liveData, null)), -1);
    }

    public static final <T> LiveData<T> asLiveData(o0OoOoOo o0oooooo) {
        kotlin.jvm.internal.OooOo.OooO0o0(o0oooooo, "<this>");
        return asLiveData$default(o0oooooo, (OooOOO0) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(o0OoOoOo o0oooooo, OooOOO0 oooOOO0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            oooOOO0 = OooOOO.f31358OooOo0O;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(o0oooooo, oooOOO0, j);
    }

    public static final <T> LiveData<T> asLiveData(o0OoOoOo o0oooooo, OooOOO0 context) {
        kotlin.jvm.internal.OooOo.OooO0o0(o0oooooo, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return asLiveData$default(o0oooooo, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(o0OoOoOo o0oooooo, OooOOO0 context, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(o0oooooo, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        ComputableLiveData$_liveData$1 computableLiveData$_liveData$1 = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j, new C05481(o0oooooo, null));
        if (o0oooooo instanceof InterfaceC4522o) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                computableLiveData$_liveData$1.setValue(((InterfaceC4522o) o0oooooo).getValue());
                return computableLiveData$_liveData$1;
            }
            computableLiveData$_liveData$1.postValue(((InterfaceC4522o) o0oooooo).getValue());
        }
        return computableLiveData$_liveData$1;
    }

    public static /* synthetic */ LiveData asLiveData$default(o0OoOoOo o0oooooo, Duration duration, OooOOO0 oooOOO0, int i, Object obj) {
        if ((i & 2) != 0) {
            oooOOO0 = OooOOO.f31358OooOo0O;
        }
        return asLiveData(o0oooooo, duration, oooOOO0);
    }

    public static final <T> LiveData<T> asLiveData(o0OoOoOo o0oooooo, Duration timeout, OooOOO0 context) {
        kotlin.jvm.internal.OooOo.OooO0o0(o0oooooo, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(timeout, "timeout");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return asLiveData(o0oooooo, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
