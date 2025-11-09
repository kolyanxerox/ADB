package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.ExecutionException;
import o00000oO.OooOOO;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O;
import o00O0oOo.o00O0O0O;
import o00O0oOo.oo0o0Oo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final o0000O00 coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final o00000O job;

    /* renamed from: androidx.work.CoroutineWorker$1 */
    public static final class RunnableC08631 implements Runnable {
        public RunnableC08631() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                ((o00O) CoroutineWorker.this.getJob$work_runtime_ktx_release()).OooO00o(null);
            }
        }
    }

    @OooO(m13471c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m13472f = "CoroutineWorker.kt", m13473l = {134}, m13474m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1 */
    public static final class C08641 extends OooOOOO implements o00O0O {
        final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08641(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$jobFuture = jobListenableFuture;
            this.this$0 = coroutineWorker;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C08641(this.$jobFuture, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            JobListenableFuture jobListenableFuture;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
                CoroutineWorker coroutineWorker = this.this$0;
                this.L$0 = jobListenableFuture2;
                this.label = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == oooOo00) {
                    return oooOo00;
                }
                jobListenableFuture = jobListenableFuture2;
                obj = foregroundInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobListenableFuture = (JobListenableFuture) this.L$0;
                o000OOo.OooOO0O(obj);
            }
            jobListenableFuture.complete(obj);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C08641) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.work.CoroutineWorker$startWork$1", m13472f = "CoroutineWorker.kt", m13473l = {68}, m13474m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$startWork$1 */
    public static final class C08651 extends OooOOOO implements o00O0O {
        int label;

        public C08651(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return CoroutineWorker.this.new C08651(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.label = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().set((ListenableWorker.Result) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().setException(th);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C08651) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        kotlin.jvm.internal.OooOo.OooO0o0(appContext, "appContext");
        kotlin.jvm.internal.OooOo.OooO0o0(params, "params");
        this.job = o0000OO0.OooO0OO();
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        kotlin.jvm.internal.OooOo.OooO0Oo(settableFutureCreate, "create()");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.work.CoroutineWorker.1
            public RunnableC08631() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                    ((o00O) CoroutineWorker.this.getJob$work_runtime_ktx_release()).OooO00o(null);
                }
            }
        }, getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = o000O0O0.f31514OooO00o;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, OooO0OO oooO0OO) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(OooO0OO oooO0OO);

    public o0000O00 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(OooO0OO oooO0OO) {
        return getForegroundInfo$suspendImpl(this, oooO0OO);
    }

    @Override // androidx.work.ListenableWorker
    public final OooOOO getForegroundInfoAsync() {
        o00O0O0O o00o0o0oOooO0OO = o0000OO0.OooO0OO();
        o00OO000.OooO0OO oooO0OOOooO0O0 = o0000OO0.OooO0O0(getCoroutineContext().plus(o00o0o0oOooO0OO));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(o00o0o0oOooO0OO, null, 2, null);
        o0000OO0.OooOo0(oooO0OOOooO0O0, null, new C08641(jobListenableFuture, this, null), 3);
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final o00000O getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, OooO0OO oooO0OO) throws Throwable {
        Object objOooOOOo;
        OooOOO foregroundAsync = setForegroundAsync(foregroundInfo);
        kotlin.jvm.internal.OooOo.OooO0Oo(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                objOooOOOo = foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
            oo0o0oo.OooOOo0();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(oo0o0oo, foregroundAsync), DirectExecutor.INSTANCE);
            objOooOOOo = oo0o0oo.OooOOOo();
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        }
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    public final Object setProgress(Data data, OooO0OO oooO0OO) throws Throwable {
        Object objOooOOOo;
        OooOOO progressAsync = setProgressAsync(data);
        kotlin.jvm.internal.OooOo.OooO0Oo(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                objOooOOOo = progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
            oo0o0oo.OooOOo0();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(oo0o0oo, progressAsync), DirectExecutor.INSTANCE);
            objOooOOOo = oo0o0oo.OooOOOo();
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        }
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    @Override // androidx.work.ListenableWorker
    public final OooOOO startWork() {
        o0000OO0.OooOo0(o0000OO0.OooO0O0(getCoroutineContext().plus(this.job)), null, new C08651(null), 3);
        return this.future;
    }
}
