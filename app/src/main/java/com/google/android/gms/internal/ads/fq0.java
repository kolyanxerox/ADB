package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class fq0 extends xh0 implements ScheduledFuture, o00000oO.OooOOO, Future {

    /* renamed from: OooOo, reason: collision with root package name */
    public final ap0 f19110OooOo;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final ScheduledFuture f19111OooOoO0;

    public fq0(ap0 ap0Var, ScheduledFuture scheduledFuture) {
        super(8);
        this.f19110OooOo = ap0Var;
        this.f19111OooOoO0 = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final /* synthetic */ Object OooOO0o() {
        return this.f19110OooOo;
    }

    @Override // o00000oO.OooOOO
    public final void addListener(Runnable runnable, Executor executor) {
        this.f19110OooOo.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.f19110OooOo.cancel(z);
        if (zCancel) {
            this.f19111OooOoO0.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f19111OooOoO0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f19110OooOo.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f19111OooOoO0.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19110OooOo.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19110OooOo.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19110OooOo.get(j, timeUnit);
    }
}
