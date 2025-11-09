package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzq implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final long f16157OooOo0O;

    public zzq(long j) {
        this.f16157OooOo0O = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.zzz.remove(Long.valueOf(this.f16157OooOo0O)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
