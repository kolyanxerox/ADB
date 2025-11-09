package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.fs */
/* loaded from: classes2.dex */
public class C3128fs {

    /* renamed from: a */
    private C3477o5 f8652a;

    /* renamed from: b */
    private InterfaceC3163gs f8653b;

    /* renamed from: c */
    private Timer f8654c = null;

    /* renamed from: com.ironsource.fs$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3128fs.this.f8653b.mo9014b();
        }
    }

    /* renamed from: com.ironsource.fs$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3128fs.this.f8653b.mo9014b();
        }
    }

    public C3128fs(C3477o5 c3477o5, InterfaceC3163gs interfaceC3163gs) {
        this.f8652a = c3477o5;
        this.f8653b = interfaceC3163gs;
    }

    /* renamed from: d */
    private void m8791d() {
        Timer timer = this.f8654c;
        if (timer != null) {
            timer.cancel();
            this.f8654c = null;
        }
    }

    /* renamed from: b */
    public void m8793b() {
        synchronized (this) {
            m8791d();
        }
        this.f8653b.mo9014b();
    }

    /* renamed from: c */
    public synchronized void m8794c() {
        m8791d();
        Timer timer = new Timer();
        this.f8654c = timer;
        timer.schedule(new a(), this.f8652a.m11097j());
    }

    /* renamed from: a */
    public synchronized void m8792a() {
        m8791d();
        Timer timer = new Timer();
        this.f8654c = timer;
        timer.schedule(new b(), this.f8652a.m11089b());
    }
}
