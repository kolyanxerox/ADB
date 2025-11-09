package OoooO0O;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class o000O000 implements Executor {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ThreadPoolExecutor f13961OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AtomicInteger f13960OooOo0O = new AtomicInteger(1);

    /* renamed from: OooOo, reason: collision with root package name */
    public WeakReference f13959OooOo = new WeakReference(null);

    public o000O000() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o000(this, 0));
        this.f13961OooOo0o = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f13959OooOo.get()) {
            runnable.run();
        } else {
            this.f13961OooOo0o.execute(runnable);
        }
    }
}
