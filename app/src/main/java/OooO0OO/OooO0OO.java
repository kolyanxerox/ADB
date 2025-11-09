package OooO0oO;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class OooO0OO implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ThreadFactory f13261OooO00o = Executors.defaultThreadFactory();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f13262OooO0O0 = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f13262OooO0O0;
        Thread threadNewThread = this.f13261OooO00o.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
