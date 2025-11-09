package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
public final class nq0 extends sp0 implements RunnableFuture {

    /* renamed from: OooOoo, reason: collision with root package name */
    public volatile aq0 f21567OooOoo;

    public nq0(Callable callable) {
        this.f21567OooOoo = new mq0(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final String OooO0Oo() {
        aq0 aq0Var = this.f21567OooOoo;
        return aq0Var != null ? OooO0oO.OooOo.OooOO0O("task=[", aq0Var.toString(), C3034d9.i.f8179e) : super.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final void OooO0o0() {
        aq0 aq0Var;
        if (OooOOO0() && (aq0Var = this.f21567OooOoo) != null) {
            aq0Var.OooO0oo();
        }
        this.f21567OooOoo = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        aq0 aq0Var = this.f21567OooOoo;
        if (aq0Var != null) {
            aq0Var.run();
        }
        this.f21567OooOoo = null;
    }
}
