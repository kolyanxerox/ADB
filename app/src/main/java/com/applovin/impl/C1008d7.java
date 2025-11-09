package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.applovin.impl.d7 */
/* loaded from: classes.dex */
public class C1008d7 {

    /* renamed from: a */
    private final C1220k f677a;

    /* renamed from: b */
    private Timer f678b;

    /* renamed from: c */
    private long f679c;

    /* renamed from: d */
    private long f680d;

    /* renamed from: e */
    private long f681e;

    /* renamed from: f */
    private boolean f682f;

    /* renamed from: g */
    private final Runnable f683g;

    /* renamed from: h */
    private long f684h;

    /* renamed from: i */
    private final Object f685i = new Object();

    /* renamed from: com.applovin.impl.d7$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                C1008d7.this.f683g.run();
                synchronized (C1008d7.this.f685i) {
                    try {
                        if (C1008d7.this.f682f) {
                            C1008d7.this.f679c = System.currentTimeMillis();
                            C1008d7 c1008d7 = C1008d7.this;
                            c1008d7.f680d = c1008d7.f681e;
                        } else {
                            C1008d7.this.f678b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (C1008d7.this.f677a != null) {
                        C1008d7.this.f677a.m2847O();
                        if (C1240o.m3200a()) {
                            C1008d7.this.f677a.m2847O().m3212a("Timer", "Encountered error while executing timed task", th);
                        }
                        C1008d7.this.f677a.m2832E().m2148a("Timer", "executingTimedTask", th);
                    }
                    synchronized (C1008d7.this.f685i) {
                        try {
                            if (C1008d7.this.f682f) {
                                C1008d7.this.f679c = System.currentTimeMillis();
                                C1008d7 c1008d72 = C1008d7.this;
                                c1008d72.f680d = c1008d72.f681e;
                            } else {
                                C1008d7.this.f678b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (C1008d7.this.f685i) {
                        try {
                            if (C1008d7.this.f682f) {
                                C1008d7.this.f679c = System.currentTimeMillis();
                                C1008d7 c1008d73 = C1008d7.this;
                                c1008d73.f680d = c1008d73.f681e;
                            } else {
                                C1008d7.this.f678b = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private C1008d7(C1220k c1220k, Runnable runnable) {
        this.f677a = c1220k;
        this.f683g = runnable;
    }

    /* renamed from: c */
    public long m641c() {
        if (this.f678b == null) {
            return this.f680d - this.f684h;
        }
        return this.f680d - (System.currentTimeMillis() - this.f679c);
    }

    /* renamed from: d */
    public void m642d() {
        synchronized (this.f685i) {
            Timer timer = this.f678b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f684h = Math.max(1L, System.currentTimeMillis() - this.f679c);
                } catch (Throwable th) {
                    try {
                        C1220k c1220k = this.f677a;
                        if (c1220k != null) {
                            c1220k.m2847O();
                            if (C1240o.m3200a()) {
                                this.f677a.m2847O();
                                if (C1240o.m3200a()) {
                                    this.f677a.m2847O().m3212a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f678b = null;
                    } finally {
                        this.f678b = null;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m643e() {
        C1008d7 c1008d7;
        synchronized (this.f685i) {
            try {
                try {
                    long j = this.f684h;
                    if (j > 0) {
                        try {
                            long j2 = this.f680d - j;
                            this.f680d = j2;
                            if (j2 < 0) {
                                this.f680d = 0L;
                            }
                            this.f678b = new Timer();
                            c1008d7 = this;
                            try {
                                c1008d7.m633a(m636b(), this.f680d, this.f682f, this.f681e);
                                c1008d7.f679c = System.currentTimeMillis();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    C1220k c1220k = c1008d7.f677a;
                                    if (c1220k != null) {
                                        c1220k.m2847O();
                                        if (C1240o.m3200a()) {
                                            c1008d7.f677a.m2847O();
                                            if (C1240o.m3200a()) {
                                                c1008d7.f677a.m2847O().m3212a("Timer", "Encountered error while resuming timer", th);
                                            }
                                        }
                                    }
                                    c1008d7.f684h = 0L;
                                } finally {
                                    c1008d7.f684h = 0L;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c1008d7 = this;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    /* renamed from: b */
    private TimerTask m636b() {
        return new a();
    }

    /* renamed from: a */
    public static C1008d7 m629a(long j, C1220k c1220k, Runnable runnable) {
        return m630a(j, false, c1220k, runnable);
    }

    /* renamed from: a */
    public static C1008d7 m630a(long j, boolean z, C1220k c1220k, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable != null) {
            C1008d7 c1008d7 = new C1008d7(c1220k, runnable);
            c1008d7.f679c = System.currentTimeMillis();
            c1008d7.f680d = j;
            c1008d7.f682f = z;
            c1008d7.f681e = j;
            try {
                c1008d7.f678b = new Timer();
                c1008d7.m633a(c1008d7.m636b(), j, z, c1008d7.f681e);
                return c1008d7;
            } catch (OutOfMemoryError e) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("Timer", "Failed to create timer due to OOM error", e);
                }
                return c1008d7;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    /* renamed from: a */
    public void m640a() {
        synchronized (this.f685i) {
            Timer timer = this.f678b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f678b = null;
                } catch (Throwable th) {
                    try {
                        C1220k c1220k = this.f677a;
                        if (c1220k != null) {
                            c1220k.m2847O();
                            if (C1240o.m3200a()) {
                                this.f677a.m2847O();
                                if (C1240o.m3200a()) {
                                    this.f677a.m2847O().m3212a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f678b = null;
                    } catch (Throwable th2) {
                        this.f678b = null;
                        this.f684h = 0L;
                        throw th2;
                    }
                }
                this.f684h = 0L;
            }
        }
    }

    /* renamed from: a */
    private void m633a(TimerTask timerTask, long j, boolean z, long j2) {
        if (z) {
            this.f678b.schedule(timerTask, j, j2);
        } else {
            this.f678b.schedule(timerTask, j);
        }
    }
}
