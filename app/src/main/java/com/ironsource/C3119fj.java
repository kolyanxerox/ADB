package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* renamed from: com.ironsource.fj */
/* loaded from: classes2.dex */
public final class C3119fj {

    /* renamed from: a */
    private final Handler f8581a;

    /* renamed from: com.ironsource.fj$a */
    public static final class a extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ Runnable f8582a;

        public a(Runnable runnable) {
            this.f8582a = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            this.f8582a.run();
        }
    }

    public C3119fj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.ironsource.ks] */
    /* renamed from: c */
    private final void m8704c(Runnable runnable) {
        a aVar = runnable instanceof AbstractRunnableC3302ks ? (AbstractRunnableC3302ks) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f8581a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            m8703a(this, aVar, 0L, 2, null);
        }
    }

    /* renamed from: a */
    public final Handler m8705a() {
        return this.f8581a;
    }

    /* renamed from: b */
    public final void m8709b(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        m8704c(runnable);
    }

    public C3119fj(Handler handler) {
        kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
        this.f8581a = handler;
    }

    /* renamed from: a */
    public static /* synthetic */ void m8703a(C3119fj c3119fj, AbstractRunnableC3302ks abstractRunnableC3302ks, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3119fj.m8707a(abstractRunnableC3302ks, j);
    }

    public /* synthetic */ C3119fj(Handler handler, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    /* renamed from: a */
    public final void m8706a(AbstractRunnableC3302ks task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        this.f8581a.removeCallbacks(task);
    }

    /* renamed from: a */
    public final void m8707a(AbstractRunnableC3302ks task, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        this.f8581a.postDelayed(task, j);
    }

    /* renamed from: a */
    public final void m8708a(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        m8704c(callback);
    }
}
