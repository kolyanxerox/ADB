package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.core.os.Profiling;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class Profiling {
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    @OooO(m13471c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m13472f = "Profiling.kt", m13473l = {79}, m13474m = "invokeSuspend")
    /* renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1 */
    public static final class C02191 extends OooOOOO implements o00O0O {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1$2 */
        public static final class AnonymousClass2 extends Oooo000 implements o00O0Oo.OooO0O0 {
            final /* synthetic */ Consumer<ProfilingResult> $listener;
            final /* synthetic */ ProfilingManager $service;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
                super(0);
                this.$service = profilingManager;
                this.$listener = consumer;
            }

            @Override // o00O0Oo.OooO0O0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13512invoke();
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke */
            public final void m13512invoke() {
                this.$service.unregisterForAllProfilingResults(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02191(Context context, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$context = context;
        }

        public static final void invokeSuspend$lambda$0(o00oOoo o00oooo, ProfilingResult result) {
            kotlin.jvm.internal.OooOo.OooO0Oo(result, "result");
            ((o0O0ooO) o00oooo).OooO(result);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C02191 c02191 = new C02191(this.$context, oooO0OO);
            c02191.L$0 = obj;
            return c02191;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.OooO00o, java.util.function.Consumer] */
        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final o00oOoo o00oooo = (o00oOoo) this.L$0;
                ?? r1 = new Consumer() { // from class: androidx.core.os.OooO00o
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.C02191.invokeSuspend$lambda$0(o00oooo, (ProfilingResult) obj2);
                    }
                };
                ProfilingManager profilingManagerOooOOo0 = OooO0o0.OooO0O0.OooOOo0(this.$context.getSystemService(OooO0o0.OooO0O0.OooOOo()));
                profilingManagerOooOOo0.registerForAllProfilingResults(new OooO0O0(), r1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(profilingManagerOooOOo0, r1);
                this.label = 1;
                if (o00O0O0O.OooO00o(o00oooo, anonymousClass2, this) == oooOo00) {
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
        public final Object invoke(o00oOoo o00oooo, OooO0OO oooO0OO) {
            return ((C02191) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public static final o0OoOoOo registerForAllProfilingResults(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return o0o0000.OooO0oo(new C02191(context, null));
    }

    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(profilingRequest, "profilingRequest");
        OooO0o0.OooO0O0.OooOOo0(context.getSystemService(OooO0o0.OooO0O0.OooOOo())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        OooO0o0.OooO0O0.OooOOo0(context.getSystemService(OooO0o0.OooO0O0.OooOOo())).unregisterForAllProfilingResults(listener);
    }

    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(executor, "executor");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        OooO0o0.OooO0O0.OooOOo0(context.getSystemService(OooO0o0.OooO0O0.OooOOo())).registerForAllProfilingResults(executor, listener);
    }
}
