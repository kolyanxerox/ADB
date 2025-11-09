package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class up0 extends tp0 {

    /* renamed from: OooOoo */
    public final o00000oO.OooOOO f24759OooOoo;

    public up0(o00000oO.OooOOO oooOOO) {
        oooOOO.getClass();
        this.f24759OooOoo = oooOOO;
    }

    @Override // com.google.android.gms.internal.ads.ap0, o00000oO.OooOOO
    public final void addListener(Runnable runnable, Executor executor) {
        this.f24759OooOoo.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.ap0, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f24759OooOoo.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.ap0, java.util.concurrent.Future
    public final Object get() {
        return this.f24759OooOoo.get();
    }

    @Override // com.google.android.gms.internal.ads.ap0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24759OooOoo.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.ap0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24759OooOoo.isDone();
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final String toString() {
        return this.f24759OooOoo.toString();
    }

    @Override // com.google.android.gms.internal.ads.ap0, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f24759OooOoo.get(j, timeUnit);
    }
}
