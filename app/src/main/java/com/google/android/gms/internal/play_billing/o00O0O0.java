package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.bq0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class o00O0O0 implements oo0o0O0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final bq0 f27057OooOo0O = new bq0(o00O0O0.class, 1);

    @Override // com.google.android.gms.internal.play_billing.oo0o0O0
    public final void OooO00o(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f27057OooOo0O.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return 0;
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
        Integer num = 0;
        return super.toString() + "[status=SUCCESS, result=[" + num.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return 0;
    }
}
