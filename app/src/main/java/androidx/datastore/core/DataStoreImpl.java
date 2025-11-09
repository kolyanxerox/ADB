package androidx.datastore.core;

import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0Oo0oo;
import kotlin.jvm.internal.o0ooOOo;
import o00O.o0OoOo0;
import o00O0.OooOo00;
import o00O0.o000OOo;
import o00O0.oo000o;
import o00O0O0O.OooOOO0;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000O0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import o00O0ooo.o0OoOoOo;
import oo00o.OooO0OO;
import oo00o.OooOO0;

/* loaded from: classes.dex */
public final class DataStoreImpl<T> implements DataStore<T> {
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;
    private o00O0O00 collectorJob;
    private final o00OO0O0.OooO00o collectorMutex;
    private final OooO0OO coordinator$delegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final o0OoOoOo data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final o000OO scope;
    private final Storage<T> storage;
    private final OooO0OO storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public final class InitDataStore extends RunOnce {
        private List<? extends o00O0O> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends o00O0O> initTasksList) {
            OooOo.OooO0o0(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = OooOo00.Oooo0o0(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x006c  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object doRun(o00O0O0O.OooO0OO r7) throws androidx.datastore.core.CorruptionException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                o00O0.o000OOo.OooOO0O(r7)
                goto L69
            L2e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L36:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                o00O0.o000OOo.OooOO0O(r7)
                goto L7b
            L3e:
                o00O0.o000OOo.OooOO0O(r7)
                java.util.List<? extends o00O0Oo.o00O0O> r7 = r6.initTasks
                if (r7 == 0) goto L6c
                kotlin.jvm.internal.OooOo.OooO0O0(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L4f
                goto L6c
            L4f:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L68
                goto L79
            L68:
                r0 = r6
            L69:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7d
            L6c:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7a
            L79:
                return r1
            L7a:
                r0 = r6
            L7b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7d:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl", m13472f = "DataStoreImpl.kt", m13473l = {544}, m13474m = "decrementCollector")
    /* renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1 */
    public static final class C02911 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02911(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m13472f = "DataStoreImpl.kt", m13473l = {416}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 */
    public static final class C02923 extends OooOOOO implements Oooo000 {
        final /* synthetic */ Oooo000 $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02923(Oooo000 oooo000, o00O0O0O.OooO0OO oooO0OO) {
            super(1, oooO0OO);
            this.$block = oooo000;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(o00O0O0O.OooO0OO oooO0OO) {
            return new C02923(this.$block, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            Oooo000 oooo000 = this.$block;
            this.label = 1;
            Object objInvoke = oooo000.invoke(this);
            return objInvoke == oooOo00 ? oooOo00 : objInvoke;
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(o00O0O0O.OooO0OO oooO0OO) {
            return ((C02923) create(oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl", m13472f = "DataStoreImpl.kt", m13473l = {237, 243, 246}, m13474m = "handleUpdate")
    /* renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1 */
    public static final class C02931 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02931(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl", m13472f = "DataStoreImpl.kt", m13473l = {544}, m13474m = "incrementCollector")
    /* renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1 */
    public static final class C02941 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02941(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl", m13472f = "DataStoreImpl.kt", m13473l = {264, 266}, m13474m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 */
    public static final class C02961 extends o00O0OO0.OooO0OO {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02961(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl", m13472f = "DataStoreImpl.kt", m13473l = {287, 296, 304}, m13474m = "readDataAndUpdateCache")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 */
    public static final class C02971 extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02971(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m13472f = "DataStoreImpl.kt", m13473l = {298, 300}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 */
    public static final class C02983 extends OooOOOO implements Oooo000 {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02983(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
            super(1, oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(o00O0O0O.OooO0OO oooO0OO) {
            return new C02983(this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            State readException;
            o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
            } catch (Throwable th2) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th2;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != oooOo00) {
                    th = th2;
                    obj = version;
                }
            }
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                if (obj == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$0;
                    o000OOo.OooOO0O(obj);
                    readException = new ReadException(th, ((Number) obj).intValue());
                    return new OooOO0(readException, Boolean.TRUE);
                }
                o000OOo.OooOO0O(obj);
            }
            readException = (State) obj;
            return new OooOO0(readException, Boolean.TRUE);
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(o00O0O0O.OooO0OO oooO0OO) {
            return ((C02983) create(oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m13472f = "DataStoreImpl.kt", m13473l = {306, 309}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 */
    public static final class C02994 extends OooOOOO implements o00O0O {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02994(DataStoreImpl<T> dataStoreImpl, int i, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C02994 c02994 = new C02994(this.this$0, this.$cachedVersion, oooO0OO);
            c02994.Z$0 = ((Boolean) obj).booleanValue();
            return c02994;
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (o00O0O0O.OooO0OO) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int iIntValue;
            boolean z;
            State state;
            boolean z2;
            o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
            boolean z3 = this.label;
            try {
            } catch (Throwable th2) {
                if (z3 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th2;
                    this.Z$0 = z3;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != oooOo00) {
                        z = z3;
                        th = th2;
                        obj = version;
                    }
                } else {
                    boolean z4 = z3;
                    th = th2;
                    iIntValue = this.$cachedVersion;
                    z = z4;
                }
            }
            if (z3 == 0) {
                o000OOo.OooOO0O(obj);
                boolean z5 = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z5;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(z5, this);
                z3 = z5;
                if (obj == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (z3 != 1) {
                    if (z3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    th = (Throwable) this.L$0;
                    o000OOo.OooOO0O(obj);
                    iIntValue = ((Number) obj).intValue();
                    ReadException readException = new ReadException(th, iIntValue);
                    z2 = z;
                    state = readException;
                    return new OooOO0(state, Boolean.valueOf(z2));
                }
                boolean z6 = this.Z$0;
                o000OOo.OooOO0O(obj);
                z3 = z6;
            }
            state = (State) obj;
            z2 = z3;
            return new OooOO0(state, Boolean.valueOf(z2));
        }

        public final Object invoke(boolean z, o00O0O0O.OooO0OO oooO0OO) {
            return ((C02994) create(Boolean.valueOf(z), oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl", m13472f = "DataStoreImpl.kt", m13473l = {365, 366, 368, 369, 380, 384}, m13474m = "readDataOrHandleCorruption")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 */
    public static final class C03001 extends o00O0OO0.OooO0OO {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03001(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = dataStoreImpl;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m13472f = "DataStoreImpl.kt", m13473l = {370, 371}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 */
    public static final class C03012 extends OooOOOO implements o00O0O {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03012(DataStoreImpl<T> dataStoreImpl, int i, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C03012 c03012 = new C03012(this.this$0, this.$preLockVersion, oooO0OO);
            c03012.Z$0 = ((Boolean) obj).booleanValue();
            return c03012;
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (o00O0O0O.OooO0OO) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x005c  */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                java.lang.Object r0 = r5.L$0
                o00O0.o000OOo.OooOO0O(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                boolean r1 = r5.Z$0
                o00O0.o000OOo.OooOO0O(r6)
                goto L32
            L20:
                o00O0.o000OOo.OooOO0O(r6)
                boolean r1 = r5.Z$0
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                r5.Z$0 = r1
                r5.label = r3
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)
                if (r6 != r0) goto L32
                goto L44
            L32:
                if (r1 == 0) goto L4e
                androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r1 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r1 = r1.getVersion(r5)
                if (r1 != r0) goto L45
            L44:
                return r0
            L45:
                r0 = r6
                r6 = r1
            L47:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L53
            L4e:
                int r0 = r5.$preLockVersion
                r4 = r0
                r0 = r6
                r6 = r4
            L53:
                androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
                if (r0 == 0) goto L5c
                int r2 = r0.hashCode()
                goto L5d
            L5c:
                r2 = 0
            L5d:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C03012.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(boolean z, o00O0O0O.OooO0OO oooO0OO) {
            return ((C03012) create(Boolean.valueOf(z), oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m13472f = "DataStoreImpl.kt", m13473l = {387, 388, 390}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 */
    public static final class C03023 extends OooOOOO implements Oooo000 {
        final /* synthetic */ o0Oo0oo $newData;
        final /* synthetic */ o0ooOOo $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03023(o0Oo0oo o0oo0oo, DataStoreImpl<T> dataStoreImpl, o0ooOOo o0ooooo, o00O0O0O.OooO0OO oooO0OO) {
            super(1, oooO0OO);
            this.$newData = o0oo0oo;
            this.this$0 = dataStoreImpl;
            this.$version = o0ooooo;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(o00O0O0O.OooO0OO oooO0OO) {
            return new C03023(this.$newData, this.this$0, this.$version, oooO0OO);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o0ooOOo o0ooooo;
            o0Oo0oo o0oo0oo;
            o0ooOOo o0ooooo2;
            o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
            } catch (CorruptionException unused) {
                o0ooOOo o0ooooo3 = this.$version;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                Object obj2 = this.$newData.f28880OooOo0O;
                this.L$0 = o0ooooo3;
                this.label = 3;
                Object objWriteData$datastore_core_release = dataStoreImpl.writeData$datastore_core_release(obj2, true, this);
                if (objWriteData$datastore_core_release != oooOo00) {
                    o0ooooo = o0ooooo3;
                    obj = objWriteData$datastore_core_release;
                }
            }
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0oo0oo = this.$newData;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                this.L$0 = o0oo0oo;
                this.label = 1;
                obj = dataStoreImpl2.readDataFromFileOrDefault(this);
                if (obj == oooOo00) {
                }
                return oooOo00;
            }
            if (i != 1) {
                if (i == 2) {
                    o0ooooo2 = (o0ooOOo) this.L$0;
                    o000OOo.OooOO0O(obj);
                    o0ooooo2.f28882OooOo0O = ((Number) obj).intValue();
                    return oo00o.OooOo.f33195OooO00o;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0ooooo = (o0ooOOo) this.L$0;
                o000OOo.OooOO0O(obj);
                o0ooooo.f28882OooOo0O = ((Number) obj).intValue();
                return oo00o.OooOo.f33195OooO00o;
            }
            o0oo0oo = (o0Oo0oo) this.L$0;
            o000OOo.OooOO0O(obj);
            o0oo0oo.f28880OooOo0O = obj;
            o0ooooo2 = this.$version;
            InterProcessCoordinator coordinator = this.this$0.getCoordinator();
            this.L$0 = o0ooooo2;
            this.label = 2;
            obj = coordinator.getVersion(this);
            if (obj == oooOo00) {
                return oooOo00;
            }
            o0ooooo2.f28882OooOo0O = ((Number) obj).intValue();
            return oo00o.OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(o00O0O0O.OooO0OO oooO0OO) {
            return ((C03023) create(oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$readState$2", m13472f = "DataStoreImpl.kt", m13473l = {218, 226}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readState$2 */
    public static final class C03032 extends OooOOOO implements o00O0O {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03032(DataStoreImpl<T> dataStoreImpl, boolean z, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C03032(this.this$0, this.$requireLock, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x004f, code lost:
        
            if (r5 == r0) goto L51;
         */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                o00O0.o000OOo.OooOO0O(r5)
                goto L52
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                o00O0.o000OOo.OooOO0O(r5)     // Catch: java.lang.Throwable -> L1c
                goto L45
            L1c:
                r5 = move-exception
                goto L55
            L1e:
                o00O0.o000OOo.OooOO0O(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                boolean r5 = r5 instanceof androidx.datastore.core.Final
                if (r5 == 0) goto L3a
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                return r5
            L3a:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1c
                r4.label = r3     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r5, r4)     // Catch: java.lang.Throwable -> L1c
                if (r5 != r0) goto L45
                goto L51
            L45:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                boolean r1 = r4.$requireLock
                r4.label = r2
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                return r5
            L55:
                androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C03032.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C03032) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m13472f = "DataStoreImpl.kt", m13473l = {330, 331, 337}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2 */
    public static final class C03042 extends OooOOOO implements Oooo000 {
        final /* synthetic */ OooOOO0 $callerContext;
        final /* synthetic */ o00O0O $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03042(DataStoreImpl<T> dataStoreImpl, OooOOO0 oooOOO0, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
            super(1, oooO0OO);
            this.this$0 = dataStoreImpl;
            this.$callerContext = oooOOO0;
            this.$transform = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(o00O0O0O.OooO0OO oooO0OO) {
            return new C03042(this.this$0, this.$callerContext, this.$transform, oooO0OO);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x005c  */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r8.L$0
                o00O0.o000OOo.OooOO0O(r9)
                return r0
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                java.lang.Object r1 = r8.L$0
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                o00O0.o000OOo.OooOO0O(r9)
                goto L4f
            L25:
                o00O0.o000OOo.OooOO0O(r9)
                goto L37
            L29:
                o00O0.o000OOo.OooOO0O(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                r8.label = r4
                java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r4, r8)
                if (r9 != r0) goto L37
                goto L68
            L37:
                r1 = r9
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                o00O0O0O.OooOOO0 r9 = r8.$callerContext
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
                o00O0Oo.o00O0O r6 = r8.$transform
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = o00O0oOo.o0000OO0.Oooo00O(r5, r9, r8)
                if (r9 != r0) goto L4f
                goto L68
            L4f:
                r1.checkHashCode()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = kotlin.jvm.internal.OooOo.OooO00o(r1, r9)
                if (r1 != 0) goto L69
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                r8.L$0 = r9
                r8.label = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
                if (r1 != r0) goto L69
            L68:
                return r0
            L69:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C03042.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(o00O0O0O.OooO0OO oooO0OO) {
            return ((C03042) create(oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.DataStoreImpl$updateData$2", m13472f = "DataStoreImpl.kt", m13473l = {169}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$updateData$2 */
    public static final class C03052 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03052(DataStoreImpl<T> dataStoreImpl, o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.this$0 = dataStoreImpl;
            this.$transform = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C03052 c03052 = new C03052(this.this$0, this.$transform, oooO0OO);
            c03052.L$0 = obj;
            return c03052;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            o000OO o000oo2 = (o000OO) this.L$0;
            o00000O0 o00000o0OooO00o = o0000OO0.OooO00o();
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, o00000o0OooO00o, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), o000oo2.getCoroutineContext()));
            this.label = 1;
            Object objOooOo0 = o00000o0OooO00o.OooOo0(this);
            return objOooOo0 == oooOo00 ? oooOo00 : objOooOo0;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C03052) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends o00O0O> initTasksList, CorruptionHandler<T> corruptionHandler, o000OO scope) {
        OooOo.OooO0o0(storage, "storage");
        OooOo.OooO0o0(initTasksList, "initTasksList");
        OooOo.OooO0o0(corruptionHandler, "corruptionHandler");
        OooOo.OooO0o0(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = new o0OoOo0(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = o00OO0O0.OooO.OooO00o();
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = o0OOO0.OooO0oo(new DataStoreImpl$storageConnectionDelegate$1(this));
        this.coordinator$delegate = o0OOO0.OooO0oo(new DataStoreImpl$coordinator$2(this));
        this.writeActor = new SimpleActor<>(scope, new DataStoreImpl$writeActor$1(this), DataStoreImpl$writeActor$2.INSTANCE, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object decrementCollector(o00O0O0O.OooO0OO r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.DataStoreImpl.C02911
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C02911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            o00OO0O0.OooO00o r1 = (o00OO0O0.OooO00o) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            o00O0.o000OOo.OooOO0O(r5)
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            o00O0.o000OOo.OooOO0O(r5)
            o00OO0O0.OooO00o r5 = r4.collectorMutex
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            o00OO0O0.OooO0o r5 = (o00OO0O0.OooO0o) r5
            java.lang.Object r0 = r5.OooO0Oo(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
            r1 = r5
        L4d:
            r5 = 0
            int r2 = r0.collectorCounter     // Catch: java.lang.Throwable -> L60
            int r2 = r2 + (-1)
            r0.collectorCounter = r2     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L62
            o00O0oOo.o00O0O00 r2 = r0.collectorJob     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L5d
            r2.OooO00o(r5)     // Catch: java.lang.Throwable -> L60
        L5d:
            r0.collectorJob = r5     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r0 = move-exception
            goto L6a
        L62:
            o00OO0O0.OooO0o r1 = (o00OO0O0.OooO0o) r1
            r1.OooO0o(r5)
            oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
            return r5
        L6a:
            o00OO0O0.OooO0o r1 = (o00OO0O0.OooO0o) r1
            r1.OooO0o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.decrementCollector(o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final <R> Object doWithWriteFileLock(boolean z, Oooo000 oooo000, o00O0O0O.OooO0OO oooO0OO) {
        return z ? oooo000.invoke(oooO0OO) : getCoordinator().lock(new C02923(oooo000, null), oooO0OO);
    }

    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00b5, code lost:
    
        if (r9 != r1) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, o00O0O0O.OooO0OO r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object incrementCollector(o00O0O0O.OooO0OO r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C02941
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C02941) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            o00OO0O0.OooO00o r1 = (o00OO0O0.OooO00o) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            o00O0.o000OOo.OooOO0O(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            o00O0.o000OOo.OooOO0O(r6)
            o00OO0O0.OooO00o r6 = r5.collectorMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            o00OO0O0.OooO0o r6 = (o00OO0O0.OooO0o) r6
            java.lang.Object r0 = r6.OooO0Oo(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
            r1 = r6
        L4d:
            r6 = 0
            int r2 = r0.collectorCounter     // Catch: java.lang.Throwable -> L64
            int r2 = r2 + r3
            r0.collectorCounter = r2     // Catch: java.lang.Throwable -> L64
            if (r2 != r3) goto L66
            o00O0oOo.o000OO r2 = r0.scope     // Catch: java.lang.Throwable -> L64
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r3 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L64
            r3.<init>(r0, r6)     // Catch: java.lang.Throwable -> L64
            r4 = 3
            o00O0oOo.o00OOO00 r2 = o00O0oOo.o0000OO0.OooOo0(r2, r6, r3, r4)     // Catch: java.lang.Throwable -> L64
            r0.collectorJob = r2     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r0 = move-exception
            goto L6e
        L66:
            o00OO0O0.OooO0o r1 = (o00OO0O0.OooO0o) r1
            r1.OooO0o(r6)
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        L6e:
            o00OO0O0.OooO0o r1 = (o00OO0O0.OooO0o) r1
            r1.OooO0o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.incrementCollector(o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0067, code lost:
    
        if (r4.runIfNeeded(r0) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(o00O0O0O.OooO0OO r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C02961
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl.C02961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            o00O0.o000OOo.OooOO0O(r6)     // Catch: java.lang.Throwable -> L30
            goto L6a
        L30:
            r6 = move-exception
            goto L71
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            o00O0.o000OOo.OooOO0O(r6)
            goto L55
        L42:
            o00O0.o000OOo.OooOO0O(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L54
            goto L69
        L54:
            r2 = r5
        L55:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6d
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6d
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        L6d:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L71:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a5, code lost:
    
        if (r11 == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00be, code lost:
    
        if (r11 == r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, o00O0O0O.OooO0OO r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final Object readDataFromFileOrDefault(o00O0O0O.OooO0OO oooO0OO) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r10, o00O0O0O.OooO0OO r11) throws androidx.datastore.core.CorruptionException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final Object readState(boolean z, o00O0O0O.OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C03032(this, z, null), this.scope.getCoroutineContext(), oooO0OO);
    }

    public final Object transformAndWrite(o00O0O o00o0o, OooOOO0 oooOOO0, o00O0O0O.OooO0OO oooO0OO) {
        return getCoordinator().lock(new C03042(this, oooOOO0, o00o0o, null), oooO0OO);
    }

    @Override // androidx.datastore.core.DataStore
    public o0OoOoOo getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) oooO0OO.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return o0000OO0.Oooo00O(new C03052(this, o00o0o, null), new UpdatingDataContextElement(updatingDataContextElement, this), oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object writeData$datastore_core_release(T r11, boolean r12, o00O0O0O.OooO0OO r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r11 = r0.L$0
            kotlin.jvm.internal.o0ooOOo r11 = (kotlin.jvm.internal.o0ooOOo) r11
            o00O0.o000OOo.OooOO0O(r13)
            goto L54
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            o00O0.o000OOo.OooOO0O(r13)
            kotlin.jvm.internal.o0ooOOo r5 = new kotlin.jvm.internal.o0ooOOo
            r5.<init>()
            androidx.datastore.core.StorageConnection r13 = r10.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r11 = r13.writeScope(r4, r0)
            if (r11 != r1) goto L53
            return r1
        L53:
            r11 = r5
        L54:
            int r11 = r11.f28882OooOo0O
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core_release(java.lang.Object, boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, o000OO o000oo2, int i, OooOO0O oooOO0O) {
        this(storage, (i & 2) != 0 ? oo000o.f31251OooOo0O : list, (i & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i & 8) != 0 ? o0000OO0.OooO0O0(Actual_jvmKt.ioDispatcher().plus(o0000OO0.OooO0o0())) : o000oo2);
    }
}
