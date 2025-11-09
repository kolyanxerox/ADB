package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.uk */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2125uk implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24651OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f24652OooO0O0;

    public ThreadFactoryC2125uk(int i) {
        this.f24651OooO00o = i;
        switch (i) {
            case 1:
                this.f24652OooO0O0 = new AtomicInteger(1);
                break;
            default:
                this.f24652OooO0O0 = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f24651OooO00o) {
            case 0:
                return new Thread(runnable, OooO0oO.OooOo.OooO0o(this.f24652OooO0O0.getAndIncrement(), "AdWorker(SCION_TASK_EXECUTOR) #"));
            default:
                return new Thread(runnable, OooO0oO.OooOo.OooO0o(this.f24652OooO0O0.getAndIncrement(), "AdWorker(NG) #"));
        }
    }
}
