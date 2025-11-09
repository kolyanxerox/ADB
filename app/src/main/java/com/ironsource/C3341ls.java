package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.ls */
/* loaded from: classes2.dex */
public final class C3341ls extends ScheduledThreadPoolExecutor implements AutoCloseable {

    /* renamed from: a */
    private final o00O0Oo.Oooo000 f9430a;

    /* renamed from: b */
    private final o00O0Oo.Oooo000 f9431b;

    /* renamed from: com.ironsource.ls$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.Oooo000 {

        /* renamed from: a */
        public static final a f9432a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final void m9890a(Throwable th) {
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9890a((Throwable) obj);
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    /* renamed from: com.ironsource.ls$b */
    public static final class b extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.Oooo000 {

        /* renamed from: a */
        public static final b f9433a = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final void m9891a(String it) {
            kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9891a((String) obj);
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    public C3341ls() {
        this(0, null, null, 7, null);
    }

    /* renamed from: a */
    private final String m9889a(String str) {
        return C3341ls.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) throws ExecutionException, InterruptedException {
        o00O0Oo.Oooo000 oooo000;
        Throwable e;
        super.afterExecute(runnable, th);
        if (th != null) {
            this.f9431b.invoke(m9889a(th.toString()));
            this.f9430a.invoke(th);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e2) {
                C3551q9.m11517d().m11519a(e2);
                this.f9431b.invoke(m9889a(e2.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e3) {
                e = e3;
                C3551q9.m11517d().m11519a(e);
                this.f9431b.invoke(m9889a(e.toString()));
                oooo000 = this.f9430a;
                oooo000.invoke(e);
            } catch (ExecutionException e4) {
                C3551q9.m11517d().m11519a(e4);
                this.f9431b.invoke(m9889a(e4.toString()));
                oooo000 = this.f9430a;
                e = e4.getCause();
                oooo000.invoke(e);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3341ls(int i, o00O0Oo.Oooo000 report, o00O0Oo.Oooo000 log) {
        super(i, new ThreadFactoryC3562qk());
        kotlin.jvm.internal.OooOo.OooO0o0(report, "report");
        kotlin.jvm.internal.OooOo.OooO0o0(log, "log");
        this.f9430a = report;
        this.f9431b = log;
    }

    public /* synthetic */ C3341ls(int i, o00O0Oo.Oooo000 oooo000, o00O0Oo.Oooo000 oooo0002, int i2, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i2 & 1) != 0 ? C3430ms.f10324a : i, (i2 & 2) != 0 ? a.f9432a : oooo000, (i2 & 4) != 0 ? b.f9433a : oooo0002);
    }
}
