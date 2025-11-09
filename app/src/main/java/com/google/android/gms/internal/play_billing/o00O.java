package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o00O extends o0O000Oo implements ScheduledFuture, oo0o0O0, Future {

    /* renamed from: OooOo, reason: collision with root package name */
    public final ScheduledFuture f27036OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o00O00O f27037OooOo0o;

    public o00O(o00O00O o00o00o, ScheduledFuture scheduledFuture) {
        super(4);
        this.f27037OooOo0o = o00o00o;
        this.f27036OooOo = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.oo0o0O0
    public final void OooO00o(Runnable runnable, Executor executor) {
        this.f27037OooOo0o.OooO00o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.f27037OooOo0o.cancel(z);
        if (zCancel) {
            this.f27036OooOo.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f27036OooOo.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f27037OooOo0o.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f27036OooOo.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27037OooOo0o.f27054OooOo0O instanceof o000O;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27037OooOo0o.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f27037OooOo0o.get(j, timeUnit);
    }
}
