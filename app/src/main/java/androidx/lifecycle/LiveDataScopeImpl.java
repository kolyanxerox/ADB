package androidx.lifecycle;

import o00O0.o000OOo;
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
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final OooOOO0 coroutineContext;
    private CoroutineLiveData<T> target;

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m13472f = "CoroutineLiveData.kt", m13473l = {99}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2 */
    public static final class C05562 extends OooOOOO implements o00O0O {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05562(LiveDataScopeImpl<T> liveDataScopeImpl, T t, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = liveDataScopeImpl;
            this.$value = t;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C05562(this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                this.label = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05562) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m13472f = "CoroutineLiveData.kt", m13473l = {94}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2 */
    public static final class C05572 extends OooOOOO implements o00O0O {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05572(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C05572(this.this$0, this.$source, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(liveData, this);
            return objEmitSource$lifecycle_livedata_release == oooOo00 ? oooOo00 : objEmitSource$lifecycle_livedata_release;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05572) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> target, OooOOO0 context) {
        kotlin.jvm.internal.OooOo.OooO0o0(target, "target");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.target = target;
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        this.coroutineContext = context.plus(Oooo0.f31951OooO00o.f31652OooOo);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emit(T t, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        Object objOooo00O = o0000OO0.Oooo00O(new C05562(this, t, null), this.coroutineContext, oooO0OO);
        return objOooo00O == OooOo00.f31365OooOo0O ? objOooo00O : OooOo.f33195OooO00o;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, o00O0O0O.OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C05572(this, liveData, null), this.coroutineContext, oooO0OO);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        kotlin.jvm.internal.OooOo.OooO0o0(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
