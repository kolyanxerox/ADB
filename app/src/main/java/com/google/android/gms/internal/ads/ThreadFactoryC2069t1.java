package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.t1 */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2069t1 implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24223OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f24224OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f24225OooO0OO;

    public ThreadFactoryC2069t1() {
        this.f24223OooO00o = 0;
        this.f24225OooO0OO = Executors.defaultThreadFactory();
        this.f24224OooO0O0 = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f24223OooO00o) {
            case 0:
                AtomicInteger atomicInteger = this.f24224OooO0O0;
                Thread threadNewThread = ((ThreadFactory) this.f24225OooO0OO).newThread(runnable);
                threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            default:
                return new Thread(runnable, "AdWorker(" + ((String) this.f24225OooO0OO) + ") #" + this.f24224OooO0O0.getAndIncrement());
        }
    }

    public ThreadFactoryC2069t1(String str) {
        this.f24223OooO00o = 1;
        this.f24225OooO0OO = str;
        this.f24224OooO0O0 = new AtomicInteger(1);
    }
}
