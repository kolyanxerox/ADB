package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.ironsource.C3824x4;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.b6 */
/* loaded from: classes.dex */
public class C0987b6 {

    /* renamed from: r */
    private static final ExecutorService f400r = Executors.newFixedThreadPool(4);

    /* renamed from: a */
    private final C1220k f401a;

    /* renamed from: b */
    private final C1240o f402b;

    /* renamed from: c */
    private final ScheduledThreadPoolExecutor f403c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f404d;

    /* renamed from: e */
    private final ScheduledThreadPoolExecutor f405e;

    /* renamed from: f */
    private final ScheduledThreadPoolExecutor f406f;

    /* renamed from: g */
    private final ScheduledThreadPoolExecutor f407g;

    /* renamed from: h */
    private final ScheduledThreadPoolExecutor f408h;

    /* renamed from: i */
    private final ScheduledThreadPoolExecutor f409i;

    /* renamed from: k */
    private ExecutorService f411k;

    /* renamed from: l */
    private ExecutorService f412l;

    /* renamed from: o */
    private boolean f415o;

    /* renamed from: p */
    private boolean f416p;

    /* renamed from: q */
    private final boolean f417q;

    /* renamed from: j */
    private final Map f410j = new HashMap();

    /* renamed from: m */
    private final List f413m = new ArrayList(5);

    /* renamed from: n */
    private final Object f414n = new Object();

    /* renamed from: com.applovin.impl.b6$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f418a;

        static {
            int[] iArr = new int[b.values().length];
            f418a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f418a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f418a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f418a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.applovin.impl.b6$b */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* renamed from: com.applovin.impl.b6$c */
    public static class c extends e {

        /* renamed from: f */
        private final long f425f;

        public c(C1220k c1220k, AbstractRunnableC1036g5 abstractRunnableC1036g5, b bVar, long j) {
            super(c1220k, abstractRunnableC1036g5, bVar);
            this.f425f = j;
        }
    }

    /* renamed from: com.applovin.impl.b6$d */
    public class d implements ThreadFactory {

        /* renamed from: a */
        private final String f426a;

        /* renamed from: com.applovin.impl.b6$d$a */
        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                C1240o unused = C0987b6.this.f402b;
                if (C1240o.m3200a()) {
                    C0987b6.this.f402b.m3212a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        public d(String str) {
            this.f426a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f426a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) C0987b6.this.f401a.m2866a(C1268v4.f2642O)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* renamed from: com.applovin.impl.b6$e */
    public static class e implements Runnable {

        /* renamed from: a */
        private final C1220k f429a;

        /* renamed from: b */
        private final String f430b;

        /* renamed from: c */
        private final C1240o f431c;

        /* renamed from: d */
        protected final AbstractRunnableC1036g5 f432d;

        /* renamed from: e */
        protected final b f433e;

        public e(C1220k c1220k, AbstractRunnableC1036g5 abstractRunnableC1036g5, b bVar) {
            this.f429a = c1220k;
            this.f431c = c1220k.m2847O();
            this.f430b = abstractRunnableC1036g5.m797c();
            this.f432d = abstractRunnableC1036g5;
            this.f433e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC1141o0.m1935a();
                if (!this.f429a.m2835F0() || this.f432d.m798d()) {
                    ScheduledFuture scheduledFutureM796b = this.f432d.m796b(Thread.currentThread(), ((Long) this.f429a.m2866a(C1268v4.f2915w)).longValue());
                    this.f432d.run();
                    if (scheduledFutureM796b != null) {
                        scheduledFutureM796b.cancel(false);
                    }
                } else {
                    if (C1240o.m3200a()) {
                        this.f431c.m3215d(this.f430b, "Task re-scheduled...");
                    }
                    this.f429a.m2918r0().m404a(this.f432d, this.f433e, 2000L);
                }
            } catch (Throwable th) {
                try {
                    if (C1240o.m3200a()) {
                        this.f431c.m3212a(this.f430b, "Task failed execution", th);
                    }
                    this.f432d.m793a(th);
                    if (C1240o.m3200a()) {
                        this.f431c.m3215d(this.f430b, this.f433e + " queue finished task " + this.f432d.m797c());
                    }
                } finally {
                    if (C1240o.m3200a()) {
                        this.f431c.m3215d(this.f430b, this.f433e + " queue finished task " + this.f432d.m797c());
                    }
                }
            }
        }
    }

    public C0987b6(C1220k c1220k) {
        this.f401a = c1220k;
        this.f402b = c1220k.m2847O();
        this.f416p = ((Boolean) c1220k.m2866a(C1268v4.f2666R)).booleanValue();
        this.f417q = ((Boolean) c1220k.m2866a(C1268v4.f2585G6)).booleanValue();
        this.f403c = m396b("auxiliary_operations", ((Integer) c1220k.m2866a(C1268v4.f2626M)).intValue());
        this.f404d = m396b("shared_thread_pool", ((Integer) c1220k.m2866a(C1268v4.f2618L)).intValue());
        this.f405e = m396b("core", ((Integer) c1220k.m2866a(C1268v4.f2674S)).intValue());
        this.f407g = m396b("caching", ((Integer) c1220k.m2866a(C1268v4.f2682T)).intValue());
        this.f408h = m396b("mediation", ((Integer) c1220k.m2866a(C1268v4.f2690U)).intValue());
        this.f406f = m396b("timeout", ((Integer) c1220k.m2866a(C1268v4.f2698V)).intValue());
        this.f409i = m396b(C3824x4.f12569d, ((Integer) c1220k.m2866a(C1268v4.f2706W)).intValue());
        if (((Boolean) c1220k.m2866a(C1268v4.f2595I0)).booleanValue() && ((Boolean) c1220k.m2866a(C1268v4.f2603J0)).booleanValue()) {
            this.f411k = Executors.newFixedThreadPool(((Integer) c1220k.m2866a(C1268v4.f2611K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f412l = Executors.newFixedThreadPool(((Integer) c1220k.m2866a(C1268v4.f2619L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    /* renamed from: c */
    public ExecutorService m410c() {
        return this.f416p ? this.f407g : f400r;
    }

    /* renamed from: d */
    public Executor m411d() {
        return this.f416p ? this.f405e : this.f404d;
    }

    /* renamed from: e */
    public ExecutorService m412e() {
        return this.f412l;
    }

    /* renamed from: f */
    public boolean m413f() {
        return (m400a() == null || m412e() == null) ? false : true;
    }

    /* renamed from: g */
    public boolean m414g() {
        return this.f415o;
    }

    /* renamed from: h */
    public void m415h() {
        synchronized (this.f414n) {
            try {
                this.f415o = true;
                for (e eVar : this.f413m) {
                    if (this.f417q) {
                        c cVar = (c) eVar;
                        m404a(cVar.f432d, cVar.f433e, cVar.f425f);
                    } else {
                        m403a(eVar.f432d, eVar.f433e);
                    }
                }
                this.f413m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public void m416i() {
        synchronized (this.f414n) {
            this.f415o = false;
        }
    }

    /* renamed from: a */
    public ExecutorService m400a() {
        return this.f411k;
    }

    /* renamed from: b */
    public ScheduledFuture m409b(AbstractRunnableC1036g5 abstractRunnableC1036g5, b bVar, long j) {
        return this.f416p ? m391a(new e(this.f401a, abstractRunnableC1036g5, bVar)).schedule(abstractRunnableC1036g5, j, TimeUnit.MILLISECONDS) : this.f403c.schedule(abstractRunnableC1036g5, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void m403a(AbstractRunnableC1036g5 abstractRunnableC1036g5, b bVar) {
        m404a(abstractRunnableC1036g5, bVar, 0L);
    }

    /* renamed from: a */
    public void m404a(AbstractRunnableC1036g5 abstractRunnableC1036g5, b bVar, long j) {
        m405a(abstractRunnableC1036g5, bVar, j, false);
    }

    /* renamed from: a */
    public void m405a(AbstractRunnableC1036g5 abstractRunnableC1036g5, b bVar, long j, boolean z) {
        AbstractRunnableC1036g5 abstractRunnableC1036g52;
        long j2;
        e eVar;
        if (abstractRunnableC1036g5 == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j >= 0) {
            if (this.f417q) {
                abstractRunnableC1036g52 = abstractRunnableC1036g5;
                j2 = j;
                eVar = new c(this.f401a, abstractRunnableC1036g52, bVar, j2);
            } else {
                abstractRunnableC1036g52 = abstractRunnableC1036g5;
                j2 = j;
                eVar = new e(this.f401a, abstractRunnableC1036g52, bVar);
            }
            if (!m397b(eVar)) {
                m392a(eVar, j2, z);
                return;
            } else {
                if (C1240o.m3200a()) {
                    this.f402b.m3215d(abstractRunnableC1036g52.m797c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "Invalid delay (millis) specified: "));
    }

    /* renamed from: b */
    public ExecutorService m408b() {
        return this.f416p ? this.f409i : this.f403c;
    }

    /* renamed from: b */
    private boolean m397b(e eVar) {
        if (eVar.f432d.m798d()) {
            return false;
        }
        synchronized (this.f414n) {
            try {
                if (this.f415o) {
                    return false;
                }
                this.f413m.add(eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private ScheduledThreadPoolExecutor m396b(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new d(str));
    }

    /* renamed from: a */
    public void m407a(Runnable runnable, b bVar) {
        if (this.f416p) {
            C1220k c1220k = this.f401a;
            e eVar = new e(c1220k, new C1156p6(c1220k, "auxiliaryOperation", runnable), bVar);
            m391a(eVar).submit(eVar);
            return;
        }
        this.f403c.submit(runnable);
    }

    /* renamed from: a */
    public Executor m399a(final String str) {
        return new Executor() { // from class: com.applovin.impl.OooO0o
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f15582OooOo0O.m393a(str, runnable);
            }
        };
    }

    /* renamed from: a */
    public /* synthetic */ void m393a(String str, Runnable runnable) {
        m402a(new C1156p6(this.f401a, str, runnable));
    }

    /* renamed from: a */
    public void m402a(AbstractRunnableC1036g5 abstractRunnableC1036g5) {
        if (abstractRunnableC1036g5 != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f416p ? this.f405e : this.f404d;
            try {
                if (AbstractC1078k7.m1246h()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f401a, abstractRunnableC1036g5, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureM796b = abstractRunnableC1036g5.m796b(Thread.currentThread(), ((Long) this.f401a.m2866a(C1268v4.f2915w)).longValue());
                abstractRunnableC1036g5.run();
                if (scheduledFutureM796b != null) {
                    scheduledFutureM796b.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (C1240o.m3200a()) {
                    this.f402b.m3212a(abstractRunnableC1036g5.m797c(), "Task failed execution", th);
                }
                abstractRunnableC1036g5.m793a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    /* renamed from: a */
    public void m406a(AbstractRunnableC1036g5 abstractRunnableC1036g5, C1044h3 c1044h3) {
        String strM895b = c1044h3.m895b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM396b = (ScheduledThreadPoolExecutor) this.f410j.get(strM895b);
        if (scheduledThreadPoolExecutorM396b == null) {
            scheduledThreadPoolExecutorM396b = m396b(strM895b, 1);
            this.f410j.put(strM895b, scheduledThreadPoolExecutorM396b);
        }
        scheduledThreadPoolExecutorM396b.submit(new e(this.f401a, abstractRunnableC1036g5, b.MEDIATION));
    }

    /* renamed from: a */
    private void m392a(e eVar, long j, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM391a = this.f416p ? m391a(eVar) : this.f404d;
        if (j <= 0) {
            scheduledThreadPoolExecutorM391a.submit(eVar);
        } else if (z) {
            C1031g0.m768a(j, this.f401a, new OooO(0, scheduledThreadPoolExecutorM391a, eVar));
        } else {
            scheduledThreadPoolExecutorM391a.schedule(eVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m391a(e eVar) {
        int i = a.f418a[eVar.f433e.ordinal()];
        if (i == 1) {
            return this.f405e;
        }
        if (i == 2) {
            return this.f407g;
        }
        if (i == 3) {
            return this.f408h;
        }
        if (i != 4) {
            return this.f409i;
        }
        return this.f406f;
    }

    /* renamed from: a */
    public ExecutorService m401a(String str, int i) {
        return Executors.newFixedThreadPool(i, new d(str));
    }

    /* renamed from: a */
    public List m398a(List list, ExecutorService executorService) {
        try {
            if (C1240o.m3200a()) {
                this.f402b.m3211a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.f402b.m3212a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
