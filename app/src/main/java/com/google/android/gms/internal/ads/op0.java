package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class op0 extends aq0 {

    /* renamed from: OooOo */
    public final Executor f23077OooOo;

    /* renamed from: OooOoO */
    public final Callable f23078OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ pp0 f23079OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ pp0 f23080OooOoOO;

    public op0(pp0 pp0Var, Callable callable, Executor executor) {
        this.f23080OooOoOO = pp0Var;
        this.f23079OooOoO0 = pp0Var;
        executor.getClass();
        this.f23077OooOo = executor;
        this.f23078OooOoO = callable;
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final Object OooO00o() {
        return this.f23078OooOoO.call();
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final String OooO0O0() {
        return this.f23078OooOoO.toString();
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final void OooO0o(Object obj) {
        this.f23079OooOoO0.f23398Oooo0OO = null;
        this.f23080OooOoOO.OooO0o(obj);
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final void OooO0o0(Throwable th) {
        pp0 pp0Var = this.f23079OooOoO0;
        pp0Var.f23398Oooo0OO = null;
        if (th instanceof ExecutionException) {
            pp0Var.OooO0oO(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            pp0Var.cancel(false);
        } else {
            pp0Var.OooO0oO(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final boolean OooO0oO() {
        return this.f23079OooOoO0.isDone();
    }
}
