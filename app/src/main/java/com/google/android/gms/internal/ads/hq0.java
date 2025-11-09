package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class hq0 extends C2163vl implements dq0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final ScheduledExecutorService f19839OooOo;

    public hq0(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f19839OooOo = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        nq0 nq0Var = new nq0(Executors.callable(runnable, null));
        return new fq0(nq0Var, this.f19839OooOo.schedule(nq0Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        gq0 gq0Var = new gq0(runnable);
        return new fq0(gq0Var, this.f19839OooOo.scheduleAtFixedRate(gq0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        gq0 gq0Var = new gq0(runnable);
        return new fq0(gq0Var, this.f19839OooOo.scheduleWithFixedDelay(gq0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        nq0 nq0Var = new nq0(callable);
        return new fq0(nq0Var, this.f19839OooOo.schedule(nq0Var, j, timeUnit));
    }
}
