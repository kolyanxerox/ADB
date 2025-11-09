package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class eq0 implements Executor {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Executor f18678OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ sp0 f18679OooOo0o;

    public eq0(Executor executor, sp0 sp0Var) {
        this.f18678OooOo0O = executor;
        this.f18679OooOo0o = sp0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f18678OooOo0O.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f18679OooOo0o.OooO0oO(e);
        }
    }
}
