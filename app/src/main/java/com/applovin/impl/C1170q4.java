package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.applovin.impl.q4 */
/* loaded from: classes.dex */
public final class C1170q4 {

    /* renamed from: h */
    public static final Executor f1798h = new androidx.arch.core.executor.OooO00o(5);

    /* renamed from: i */
    public static final Executor f1799i = new androidx.arch.core.executor.OooO00o(2);

    /* renamed from: b */
    private final String f1801b;

    /* renamed from: f */
    private volatile Object f1805f;

    /* renamed from: g */
    private volatile Object f1806g;

    /* renamed from: a */
    private final Object f1800a = new Object();

    /* renamed from: c */
    private final List f1802c = new ArrayList();

    /* renamed from: d */
    private volatile boolean f1803d = false;

    /* renamed from: e */
    private volatile boolean f1804e = false;

    /* renamed from: com.applovin.impl.q4$a */
    public interface a {
        /* renamed from: a */
        void mo1567a(Object obj);
    }

    /* renamed from: com.applovin.impl.q4$b */
    public interface b {
        /* renamed from: a */
        void mo3a(boolean z, Object obj, Object obj2);
    }

    public C1170q4(String str) {
        this.f1801b = str;
    }

    /* renamed from: a */
    public static C1170q4 m2258a(String str, Object obj) {
        return new C1170q4(str).m2271b(obj);
    }

    /* renamed from: b */
    public C1170q4 m2271b(Object obj) {
        m2263a(true, obj, null);
        return this;
    }

    /* renamed from: c */
    public boolean m2273c() {
        return this.f1803d;
    }

    /* renamed from: d */
    public boolean m2274d() {
        return this.f1803d && !this.f1804e;
    }

    public String toString() {
        String str;
        if (!this.f1803d) {
            str = "Waiting";
        } else if (this.f1804e) {
            str = "Success -> " + this.f1805f;
        } else {
            str = "Failed -> " + this.f1806g;
        }
        return "Promise(" + m2272b() + ": " + str + ")";
    }

    /* renamed from: c */
    private Runnable m2265c(Executor executor, b bVar) {
        return new androidx.webkit.OooO00o(this, executor, bVar, 15);
    }

    /* renamed from: a */
    public C1170q4 m2266a(Object obj) {
        m2263a(false, null, obj);
        return this;
    }

    /* renamed from: b */
    public String m2272b() {
        String str = this.f1801b;
        return str != null ? str : super.toString();
    }

    /* renamed from: b */
    public /* synthetic */ void m2264b(Executor executor, b bVar) {
        try {
            executor.execute(new OooO(22, this, bVar));
        } catch (Throwable th) {
            m2262a(th);
        }
    }

    /* renamed from: a */
    public void m2270a(Executor executor, Runnable runnable) {
        m2269a(executor, new o000000(runnable, 2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2261a(Runnable runnable, boolean z, Object obj, Object obj2) {
        if (z) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void m2268a(Executor executor, a aVar) {
        m2269a(executor, new o000000(aVar, 1));
    }

    /* renamed from: a */
    public static /* synthetic */ void m2259a(a aVar, boolean z, Object obj, Object obj2) {
        if (z) {
            return;
        }
        aVar.mo1567a(obj2);
    }

    /* renamed from: a */
    public void m2269a(Executor executor, b bVar) {
        Runnable runnableM2265c = m2265c(executor, bVar);
        synchronized (this.f1800a) {
            try {
                if (!this.f1803d) {
                    this.f1802c.add(runnableM2265c);
                } else {
                    runnableM2265c.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public Object m2267a() {
        AbstractC1072k1.m1131a(m2274d());
        return this.f1806g;
    }

    /* renamed from: a */
    private void m2263a(boolean z, Object obj, Object obj2) {
        synchronized (this.f1800a) {
            try {
                if (this.f1803d) {
                    return;
                }
                this.f1805f = obj;
                this.f1806g = obj2;
                this.f1804e = z;
                this.f1803d = true;
                Iterator it = this.f1802c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f1802c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m2260a(b bVar) {
        try {
            bVar.mo3a(this.f1804e, this.f1805f, this.f1806g);
        } catch (Throwable th) {
            m2262a(th);
        }
    }

    /* renamed from: a */
    private void m2262a(Throwable th) {
        AbstractC1072k1.m1127a(th);
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null) {
            c1220k.m2832E().m2148a("Promise", "PromiseCallback: " + m2272b(), th);
        }
    }
}
