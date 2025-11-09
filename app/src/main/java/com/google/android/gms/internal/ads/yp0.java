package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class yp0 implements o00000oO.OooOOO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f25992OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final yp0 f25991OooOo0o = new yp0(null);

    /* renamed from: OooOo, reason: collision with root package name */
    public static final bq0 f25990OooOo = new bq0(yp0.class, 0);

    public yp0(Object obj) {
        this.f25992OooOo0O = obj;
    }

    @Override // o00000oO.OooOOO
    public final void addListener(Runnable runnable, Executor executor) {
        ii0.Oooo0oo(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f25990OooOo.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f25992OooOo0O;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.f25992OooOo0O) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f25992OooOo0O;
    }
}
