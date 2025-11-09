package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.f */
/* loaded from: classes2.dex */
public abstract class AbstractC3099f<T> {

    /* renamed from: a */
    private Object f8468a = new Object();

    /* renamed from: b */
    private Timer f8469b;

    /* renamed from: c */
    protected long f8470c;

    /* renamed from: d */
    protected T f8471d;

    /* renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3099f.this.mo8576b();
        }
    }

    public AbstractC3099f() {
    }

    /* renamed from: a */
    public void m8574a(T t) {
        if (m8575a() || t == null) {
            return;
        }
        this.f8471d = t;
        m8577c();
        synchronized (this.f8468a) {
            Timer timer = new Timer();
            this.f8469b = timer;
            timer.schedule(new a(), this.f8470c);
        }
    }

    /* renamed from: b */
    public abstract void mo8576b();

    /* renamed from: c */
    public void m8577c() {
        synchronized (this.f8468a) {
            try {
                Timer timer = this.f8469b;
                if (timer != null) {
                    timer.cancel();
                    this.f8469b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public void m8578d() {
        this.f8471d = null;
    }

    public AbstractC3099f(long j) {
        this.f8470c = j;
    }

    /* renamed from: a */
    public boolean m8575a() {
        return this.f8470c <= 0;
    }
}
