package com.ironsource;

import android.util.Log;
import com.ironsource.lifecycle.C3331b;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.ym */
/* loaded from: classes2.dex */
public class C3876ym {

    /* renamed from: g */
    private static final String f12758g = "ym";

    /* renamed from: a */
    private final C3331b f12759a;

    /* renamed from: b */
    private final Runnable f12760b;

    /* renamed from: c */
    private final C3097ew f12761c;

    /* renamed from: e */
    private Timer f12763e;

    /* renamed from: d */
    private final Object f12762d = new Object();

    /* renamed from: f */
    private final InterfaceC3737uk f12764f = new a();

    /* renamed from: com.ironsource.ym$a */
    public class a implements InterfaceC3737uk {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: a */
        public void mo4890a() {
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: b */
        public void mo4891b() {
            C3876ym.this.f12761c.m8572c(System.currentTimeMillis());
            C3876ym.this.m13211c();
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: c */
        public void mo4892c() {
            C3876ym.this.f12761c.m8571b(System.currentTimeMillis());
            C3876ym c3876ym = C3876ym.this;
            c3876ym.m13208b(c3876ym.f12761c.m8568a());
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: d */
        public void mo4893d() {
        }
    }

    /* renamed from: com.ironsource.ym$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3876ym.this.f12759a.m9809b(C3876ym.this.f12764f);
            C3876ym.this.f12761c.m8570b();
            C3876ym.this.f12760b.run();
        }
    }

    public C3876ym(Runnable runnable, C3331b c3331b, C3097ew c3097ew) {
        this.f12760b = runnable;
        this.f12759a = c3331b;
        this.f12761c = c3097ew;
    }

    /* renamed from: b */
    public void m13216b() {
        m13211c();
        this.f12759a.m9809b(this.f12764f);
        this.f12761c.m8570b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m13208b(long j) {
        synchronized (this.f12762d) {
            m13211c();
            Timer timer = new Timer();
            this.f12763e = timer;
            timer.schedule(new b(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m13211c() {
        synchronized (this.f12762d) {
            try {
                Timer timer = this.f12763e;
                if (timer != null) {
                    timer.cancel();
                    this.f12763e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m13214a() {
        m13215a(0L);
    }

    /* renamed from: a */
    public void m13215a(long j) {
        if (j < 0) {
            Log.d(f12758g, "cannot start timer with delay < 0");
            return;
        }
        this.f12759a.m9807a(this.f12764f);
        this.f12761c.m8569a(j);
        if (this.f12759a.m9813e()) {
            this.f12761c.m8572c(System.currentTimeMillis());
        } else {
            m13208b(j);
        }
    }
}
