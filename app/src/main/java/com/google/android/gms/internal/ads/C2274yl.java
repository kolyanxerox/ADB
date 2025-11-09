package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.yl */
/* loaded from: classes2.dex */
public class C2274yl implements o00000oO.OooOOO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final jq0 f25934OooOo0O = new jq0();

    @Override // o00000oO.OooOOO
    public final void addListener(Runnable runnable, Executor executor) {
        this.f25934OooOo0O.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f25934OooOo0O.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f25934OooOo0O.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f25934OooOo0O.f17078OooOo0O instanceof no0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f25934OooOo0O.isDone();
    }

    public final boolean zzc(@Nullable Object obj) {
        boolean zOooO0o = this.f25934OooOo0O.OooO0o(obj);
        if (!zOooO0o) {
            zzv.zzp().OooO0oO("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zOooO0o;
    }

    public final boolean zzd(Throwable th) {
        boolean zOooO0oO = this.f25934OooOo0O.OooO0oO(th);
        if (!zOooO0oO) {
            zzv.zzp().OooO0oO("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zOooO0oO;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f25934OooOo0O.get(j, timeUnit);
    }
}
