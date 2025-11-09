package androidx.datastore.core;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0ooo.o0O000Oo;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.DataStoreImpl$data$1", m13472f = "DataStoreImpl.kt", m13473l = {72, 74, 100}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DataStoreImpl$data$1 extends OooOOOO implements o00O0O {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$data$1$1", m13472f = "DataStoreImpl.kt", m13473l = {102}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1 */
    public static final class C02871 extends OooOOOO implements o00O0O {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02871(DataStoreImpl<T> dataStoreImpl, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C02871(this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == oooOo00) {
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
        public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
            return ((C02871) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$data$1$2", m13472f = "DataStoreImpl.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2 */
    public static final class C02882 extends OooOOOO implements o00O0O {
        /* synthetic */ Object L$0;
        int label;

        public C02882(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C02882 c02882 = new C02882(oooO0OO);
            c02882.L$0 = obj;
            return c02882;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(State<T> state, OooO0OO oooO0OO) {
            return ((C02882) create(state, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return Boolean.valueOf(!(((State) this.L$0) instanceof Final));
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$data$1$3", m13472f = "DataStoreImpl.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$3 */
    public static final class C02893 extends OooOOOO implements o00O0O {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02893(State<T> state, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$startState = state;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C02893 c02893 = new C02893(this.$startState, oooO0OO);
            c02893.L$0 = obj;
            return c02893;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(State<T> state, OooO0OO oooO0OO) {
            return ((C02893) create(state, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            State state = (State) this.L$0;
            return Boolean.valueOf((state instanceof Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$data$1$5", m13472f = "DataStoreImpl.kt", m13473l = {116}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$5 */
    public static final class C02905 extends OooOOOO implements o00Oo0 {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02905(DataStoreImpl<T> dataStoreImpl, OooO0OO oooO0OO) {
            super(3, oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == oooOo00) {
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

        @Override // o00O0Oo.o00Oo0
        public final Object invoke(o0O000Oo o0o000oo, Throwable th, OooO0OO oooO0OO) {
            return new C02905(this.this$0, oooO0OO).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = dataStoreImpl;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, oooO0OO);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
        return ((DataStoreImpl$data$1) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
