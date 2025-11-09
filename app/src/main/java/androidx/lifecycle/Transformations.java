package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0Oo0oo;
import kotlin.jvm.internal.oo000o;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class Transformations {

    /* renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1 */
    public static final class C05611 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ oo000o $firstTime;
        final /* synthetic */ MediatorLiveData<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05611(MediatorLiveData<X> mediatorLiveData, oo000o oo000oVar) {
            super(1);
            this.$outputLiveData = mediatorLiveData;
            this.$firstTime = oo000oVar;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m13528invoke((C05611) obj);
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13528invoke(X x) {
            Object value = this.$outputLiveData.getValue();
            if (this.$firstTime.f28883OooOo0O || ((value == null && x != 0) || !(value == null || value.equals(x)))) {
                this.$firstTime.f28883OooOo0O = false;
                this.$outputLiveData.setValue(x);
            }
        }
    }

    /* renamed from: androidx.lifecycle.Transformations$map$1 */
    public static final class C05621 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ o00O0Oo.Oooo000 $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05621(MediatorLiveData<Y> mediatorLiveData, o00O0Oo.Oooo000 oooo000) {
            super(1);
            this.$result = mediatorLiveData;
            this.$transform = oooo000;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m13529invoke((C05621) obj);
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13529invoke(X x) {
            this.$result.setValue(this.$transform.invoke(x));
        }
    }

    /* renamed from: androidx.lifecycle.Transformations$map$2 */
    public static final class C05632 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ Function $mapFunction;
        final /* synthetic */ MediatorLiveData $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05632(MediatorLiveData mediatorLiveData, Function function) {
            super(1);
            this.$result = mediatorLiveData;
            this.$mapFunction = function;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m13530invoke(obj);
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13530invoke(Object obj) {
            this.$result.setValue(this.$mapFunction.apply(obj));
        }
    }

    /* renamed from: androidx.lifecycle.Transformations$switchMap$1 */
    public static final class C05641 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ o0Oo0oo $liveData;
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ o00O0Oo.Oooo000 $transform;

        /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1 */
        public static final class AnonymousClass1 extends Oooo000 implements o00O0Oo.Oooo000 {
            final /* synthetic */ MediatorLiveData<Y> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MediatorLiveData<Y> mediatorLiveData) {
                super(1);
                this.$result = mediatorLiveData;
            }

            @Override // o00O0Oo.Oooo000
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m13532invoke((AnonymousClass1) obj);
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke */
            public final void m13532invoke(Y y) {
                this.$result.setValue(y);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05641(o00O0Oo.Oooo000 oooo000, o0Oo0oo o0oo0oo, MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.$transform = oooo000;
            this.$liveData = o0oo0oo;
            this.$result = mediatorLiveData;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m13531invoke((C05641) obj);
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13531invoke(X x) {
            LiveData liveData = (LiveData) this.$transform.invoke(x);
            Object obj = this.$liveData.f28880OooOo0O;
            if (obj != liveData) {
                if (obj != null) {
                    MediatorLiveData<Y> mediatorLiveData = this.$result;
                    kotlin.jvm.internal.OooOo.OooO0O0(obj);
                    mediatorLiveData.removeSource((LiveData) obj);
                }
                this.$liveData.f28880OooOo0O = liveData;
                if (liveData != null) {
                    MediatorLiveData<Y> mediatorLiveData2 = this.$result;
                    kotlin.jvm.internal.OooOo.OooO0O0(liveData);
                    mediatorLiveData2.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this.$result)));
                }
            }
        }
    }

    /* renamed from: androidx.lifecycle.Transformations$switchMap$2 */
    public static final class C05652 implements Observer {
        final /* synthetic */ MediatorLiveData $result;
        private LiveData liveData;

        public C05652(MediatorLiveData mediatorLiveData) {
            mediatorLiveData = mediatorLiveData;
        }

        public final LiveData getLiveData() {
            return this.liveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            LiveData liveData = (LiveData) function.apply(obj);
            LiveData liveData2 = this.liveData;
            if (liveData2 == liveData) {
                return;
            }
            if (liveData2 != null) {
                mediatorLiveData.removeSource(liveData2);
            }
            this.liveData = liveData;
            if (liveData != null) {
                MediatorLiveData mediatorLiveData = mediatorLiveData;
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData)));
            }
        }

        public final void setLiveData(LiveData liveData) {
            this.liveData = liveData;
        }
    }

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        MediatorLiveData mediatorLiveData;
        kotlin.jvm.internal.OooOo.OooO0o0(liveData, "<this>");
        oo000o oo000oVar = new oo000o();
        oo000oVar.f28883OooOo0O = true;
        if (liveData.isInitialized()) {
            oo000oVar.f28883OooOo0O = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C05611(mediatorLiveData, oo000oVar)));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, o00O0Oo.Oooo000 transform) {
        kotlin.jvm.internal.OooOo.OooO0o0(liveData, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(transform, "transform");
        MediatorLiveData mediatorLiveData = liveData.isInitialized() ? new MediatorLiveData(transform.invoke(liveData.getValue())) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C05621(mediatorLiveData, transform)));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, o00O0Oo.Oooo000 transform) {
        LiveData liveData2;
        kotlin.jvm.internal.OooOo.OooO0o0(liveData, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(transform, "transform");
        o0Oo0oo o0oo0oo = new o0Oo0oo();
        MediatorLiveData mediatorLiveData = (liveData.isInitialized() && (liveData2 = (LiveData) transform.invoke(liveData.getValue())) != null && liveData2.isInitialized()) ? new MediatorLiveData(liveData2.getValue()) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C05641(transform, o0oo0oo, mediatorLiveData)));
        return mediatorLiveData;
    }

    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        kotlin.jvm.internal.OooOo.OooO0o0(liveData, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C05632(mediatorLiveData, mapFunction)));
        return mediatorLiveData;
    }

    public static final /* synthetic */ LiveData switchMap(LiveData liveData, Function switchMapFunction) {
        kotlin.jvm.internal.OooOo.OooO0o0(liveData, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(switchMapFunction, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations.switchMap.2
            final /* synthetic */ MediatorLiveData $result;
            private LiveData liveData;

            public C05652(MediatorLiveData mediatorLiveData2) {
                mediatorLiveData = mediatorLiveData2;
            }

            public final LiveData getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData liveData2 = (LiveData) function.apply(obj);
                LiveData liveData22 = this.liveData;
                if (liveData22 == liveData2) {
                    return;
                }
                if (liveData22 != null) {
                    mediatorLiveData.removeSource(liveData22);
                }
                this.liveData = liveData2;
                if (liveData2 != null) {
                    MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                    mediatorLiveData2.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData2)));
                }
            }

            public final void setLiveData(LiveData liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData2;
    }
}
