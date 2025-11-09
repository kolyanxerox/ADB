package com.ironsource;

import com.ironsource.C3350m2;
import com.ironsource.lifecycle.C3331b;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.o2 */
/* loaded from: classes2.dex */
public class C3474o2 {

    /* renamed from: a */
    private final C3350m2 f10597a;

    /* renamed from: b */
    private final InterfaceC3193hn f10598b;

    /* renamed from: c */
    private final C3876ym f10599c = m11072c();

    /* renamed from: d */
    private Timer f10600d;

    /* renamed from: com.ironsource.o2$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3474o2.this.f10598b.mo8903b();
        }
    }

    /* renamed from: com.ironsource.o2$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3474o2.this.f10598b.mo8903b();
        }
    }

    public C3474o2(C3350m2 c3350m2, InterfaceC3193hn interfaceC3193hn) {
        this.f10597a = c3350m2;
        this.f10598b = interfaceC3193hn;
    }

    /* renamed from: c */
    private C3876ym m11072c() {
        return new C3876ym(new a(), C3331b.m9799d(), new C3097ew());
    }

    /* renamed from: j */
    private synchronized void m11073j() {
        Timer timer = this.f10600d;
        if (timer != null) {
            timer.cancel();
            this.f10600d = null;
        }
    }

    /* renamed from: b */
    public C3350m2 m11076b() {
        return this.f10597a;
    }

    /* renamed from: d */
    public boolean m11077d() {
        return this.f10597a.m9976c() > 0;
    }

    /* renamed from: e */
    public void m11078e() {
        if (this.f10597a.m9978e()) {
            IronLog.INTERNAL.verbose();
            m11071b(this.f10597a.m9976c());
        }
    }

    /* renamed from: f */
    public void m11079f() {
        if (this.f10597a.m9974a() == C3350m2.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            m11071b(this.f10597a.m9977d());
        }
    }

    /* renamed from: g */
    public void m11080g() {
        if (this.f10597a.m9978e()) {
            IronLog.INTERNAL.verbose();
            m11071b(0L);
        }
    }

    /* renamed from: h */
    public void m11081h() {
        if (this.f10597a.m9974a() != C3350m2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f10597a.m9977d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        m11071b(this.f10597a.m9977d());
    }

    /* renamed from: i */
    public void m11082i() {
        C3876ym c3876ym = this.f10599c;
        if (c3876ym != null) {
            c3876ym.m13216b();
        }
    }

    /* renamed from: k */
    public void m11083k() {
        if (this.f10597a.m9974a() != C3350m2.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f10597a.m9975b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        m11075a(this.f10597a.m9975b());
    }

    /* renamed from: b */
    private synchronized void m11071b(long j) {
        m11073j();
        Timer timer = new Timer();
        this.f10600d = timer;
        timer.schedule(new b(), j);
    }

    /* renamed from: a */
    public void m11074a() {
        if (this.f10597a.m9974a() == C3350m2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            m11082i();
        }
    }

    /* renamed from: a */
    public void m11075a(long j) {
        C3876ym c3876ym = this.f10599c;
        if (c3876ym != null) {
            c3876ym.m13215a(j);
        }
    }
}
