package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class oO00O0o implements oo0o0O0 {

    /* renamed from: OooOo0O */
    public final WeakReference f27196OooOo0O;

    /* renamed from: OooOo0o */
    public final oO00O0o0 f27197OooOo0o = new oO00O0o0(this);

    public oO00O0o(oO0O0OoO oo0o0ooo) {
        this.f27196OooOo0O = new WeakReference(oo0o0ooo);
    }

    @Override // com.google.android.gms.internal.play_billing.oo0o0O0
    public final void OooO00o(Runnable runnable, Executor executor) {
        this.f27197OooOo0o.OooO00o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        oO0O0OoO oo0o0ooo = (oO0O0OoO) this.f27196OooOo0O.get();
        boolean zCancel = this.f27197OooOo0o.cancel(z);
        if (!zCancel || oo0o0ooo == null) {
            return zCancel;
        }
        oo0o0ooo.f27199OooO00o = null;
        oo0o0ooo.f27200OooO0O0 = null;
        oo0o0ooo.f27201OooO0OO.OooO0oo(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f27197OooOo0o.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27197OooOo0o.f27194OooOo0O instanceof o0O0o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27197OooOo0o.isDone();
    }

    public final String toString() {
        return this.f27197OooOo0o.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f27197OooOo0o.get(j, timeUnit);
    }
}
