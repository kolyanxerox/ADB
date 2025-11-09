package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class df0 implements o00000oO.OooOOO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o00000oO.OooOOO f18244OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f18245OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f18246OooOo0o;

    public df0(Object obj, String str, o00000oO.OooOOO oooOOO) {
        this.f18245OooOo0O = obj;
        this.f18246OooOo0o = str;
        this.f18244OooOo = oooOOO;
    }

    @Override // o00000oO.OooOOO
    public final void addListener(Runnable runnable, Executor executor) {
        this.f18244OooOo.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f18244OooOo.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f18244OooOo.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18244OooOo.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f18244OooOo.isDone();
    }

    public final String toString() {
        return this.f18246OooOo0o + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f18244OooOo.get(j, timeUnit);
    }
}
