package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o00OO00O extends oo0oOO0 implements o00O0OOO {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ScheduledExecutorService f27063OooOo0o;

    public o00OO00O(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f27063OooOo0o = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        o00OO o00oo = new o00OO(Executors.callable(runnable, null));
        return new o00O(o00oo, this.f27063OooOo0o.schedule(o00oo, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        o00OO000 o00oo000 = new o00OO000(runnable);
        return new o00O(o00oo000, this.f27063OooOo0o.scheduleAtFixedRate(o00oo000, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        o00OO000 o00oo000 = new o00OO000(runnable);
        return new o00O(o00oo000, this.f27063OooOo0o.scheduleWithFixedDelay(o00oo000, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        o00OO o00oo = new o00OO(callable);
        return new o00O(o00oo, this.f27063OooOo0o.schedule(o00oo, j, timeUnit));
    }
}
