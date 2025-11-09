package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.C3341ls;
import com.ironsource.C3551q9;
import com.ironsource.HandlerThreadC3155gk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import oo00o.OooO0OO;

/* loaded from: classes2.dex */
public final class IronSourceThreadManager {

    /* renamed from: a */
    private static boolean f8443a;

    /* renamed from: c */
    private static final Handler f8445c;

    /* renamed from: d */
    private static final HandlerThreadC3155gk f8446d;

    /* renamed from: e */
    private static final HandlerThreadC3155gk f8447e;

    /* renamed from: f */
    private static final HandlerThreadC3155gk f8448f;

    /* renamed from: g */
    private static final OooO0OO f8449g;

    /* renamed from: h */
    private static final OooO0OO f8450h;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* renamed from: b */
    private static final Handler f8444b = new Handler(Looper.getMainLooper());

    /* renamed from: com.ironsource.environment.thread.IronSourceThreadManager$a */
    public static final class C3086a extends Oooo000 implements OooO0O0 {

        /* renamed from: a */
        public static final C3086a f8451a = new C3086a();

        public C3086a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final C3341ls invoke() {
            return new C3341ls(0, null, null, 7, null);
        }
    }

    /* renamed from: com.ironsource.environment.thread.IronSourceThreadManager$b */
    public static final class C3087b extends Oooo000 implements OooO0O0 {

        /* renamed from: a */
        public static final C3087b f8452a = new C3087b();

        public C3087b() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final HandlerThreadC3155gk invoke() {
            HandlerThreadC3155gk handlerThreadC3155gk = new HandlerThreadC3155gk("managersThread");
            handlerThreadC3155gk.start();
            handlerThreadC3155gk.m8980a();
            return handlerThreadC3155gk;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        f8445c = new Handler(handlerThread.getLooper());
        HandlerThreadC3155gk handlerThreadC3155gk = new HandlerThreadC3155gk("mediationBackground");
        handlerThreadC3155gk.start();
        handlerThreadC3155gk.m8980a();
        f8446d = handlerThreadC3155gk;
        HandlerThreadC3155gk handlerThreadC3155gk2 = new HandlerThreadC3155gk("adapterBackground");
        handlerThreadC3155gk2.start();
        handlerThreadC3155gk2.m8980a();
        f8447e = handlerThreadC3155gk2;
        HandlerThreadC3155gk handlerThreadC3155gk3 = new HandlerThreadC3155gk("publisher-callbacks");
        handlerThreadC3155gk3.start();
        handlerThreadC3155gk3.m8980a();
        f8448f = handlerThreadC3155gk3;
        f8449g = o0OOO0.OooO0oo(C3086a.f8451a);
        f8450h = o0OOO0.OooO0oo(C3087b.f8452a);
    }

    private IronSourceThreadManager() {
    }

    /* renamed from: a */
    private final C3341ls m8532a() {
        return (C3341ls) f8449g.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean z, boolean z2, List<? extends Runnable> tasks) throws InterruptedException {
        OooOo.OooO0o0(tasks, "tasks");
        if (!z) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        Iterator<? extends Runnable> it3 = tasks.iterator();
        while (it3.hasNext()) {
            postMediationBackgroundTask$default(INSTANCE, new OooO0Oo.OooO0O0(18, it3.next(), countDownLatch), 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    public final Handler getInitHandler() {
        return f8445c;
    }

    public final HandlerThreadC3155gk getSharedManagersThread() {
        return (HandlerThreadC3155gk) f8450h.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), LocationRequestCompat.PASSIVE_INTERVAL, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f8443a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        OooOo.OooO0o0(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action) {
        OooOo.OooO0o0(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action) {
        OooOo.OooO0o0(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action) {
        OooOo.OooO0o0(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        OooOo.OooO0o0(action, "action");
        if (m8535a(action)) {
            m8532a().remove(action);
        } else {
            f8447e.m8983b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        OooOo.OooO0o0(action, "action");
        if (m8535a(action)) {
            m8532a().remove(action);
        } else {
            f8446d.m8983b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        OooOo.OooO0o0(action, "action");
        f8444b.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        f8443a = z;
    }

    /* renamed from: a */
    public static final void m8533a(Runnable it, CountDownLatch latch) {
        OooOo.OooO0o0(it, "$it");
        OooOo.OooO0o0(latch, "$latch");
        it.run();
        m8534a(latch);
    }

    public final void postAdapterBackgroundTask(Runnable action, long j) {
        OooOo.OooO0o0(action, "action");
        if (f8443a) {
            m8532a().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            f8447e.m8982a(action, j);
        }
    }

    public final void postMediationBackgroundTask(Runnable action, long j) {
        OooOo.OooO0o0(action, "action");
        if (f8443a) {
            m8532a().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            f8446d.m8982a(action, j);
        }
    }

    public final void postOnUiThreadTask(Runnable action, long j) {
        OooOo.OooO0o0(action, "action");
        f8444b.postDelayed(action, j);
    }

    public final void postPublisherCallback(Runnable action, long j) {
        OooOo.OooO0o0(action, "action");
        f8448f.m8982a(action, j);
    }

    /* renamed from: a */
    private static final void m8534a(CountDownLatch latch) {
        OooOo.OooO0o0(latch, "$latch");
        latch.countDown();
    }

    /* renamed from: a */
    private final boolean m8535a(Runnable runnable) {
        return f8443a && m8532a().getQueue().contains(runnable);
    }
}
