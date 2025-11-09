package com.ironsource;

import com.ironsource.lifecycle.C3331b;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.zm */
/* loaded from: classes2.dex */
public class C3910zm implements InterfaceC3737uk {

    /* renamed from: b */
    private Timer f13022b;

    /* renamed from: e */
    private long f13025e;

    /* renamed from: f */
    private Runnable f13026f;

    /* renamed from: a */
    private String f13021a = "INTERNAL";

    /* renamed from: c */
    private boolean f13023c = false;

    /* renamed from: d */
    private Long f13024d = null;

    /* renamed from: com.ironsource.zm$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3910zm.this.f13026f.run();
        }
    }

    public C3910zm(long j, Runnable runnable, boolean z) {
        this.f13025e = j;
        this.f13026f = runnable;
        if (z) {
            m13414g();
        }
    }

    /* renamed from: f */
    private synchronized void m13411f() {
        Timer timer = this.f13022b;
        if (timer != null) {
            timer.cancel();
            this.f13022b = null;
        }
    }

    /* renamed from: h */
    private synchronized void m13412h() {
        if (this.f13022b == null) {
            Timer timer = new Timer();
            this.f13022b = timer;
            timer.schedule(new a(), this.f13025e);
            Calendar.getInstance().setTimeInMillis(this.f13024d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: b */
    public void mo4891b() {
        if (this.f13022b != null) {
            m13411f();
        }
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: c */
    public void mo4892c() {
        Long l;
        if (this.f13022b == null && (l = this.f13024d) != null) {
            long jLongValue = l.longValue() - System.currentTimeMillis();
            this.f13025e = jLongValue;
            if (jLongValue > 0) {
                m13412h();
            } else {
                m13413e();
                this.f13026f.run();
            }
        }
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: d */
    public void mo4893d() {
    }

    /* renamed from: e */
    public void m13413e() {
        m13411f();
        this.f13023c = false;
        this.f13024d = null;
        C3331b.m9799d().m9809b(this);
    }

    /* renamed from: g */
    public void m13414g() {
        if (this.f13023c) {
            return;
        }
        this.f13023c = true;
        C3331b.m9799d().m9807a(this);
        this.f13024d = Long.valueOf(System.currentTimeMillis() + this.f13025e);
        if (C3331b.m9799d().m9813e()) {
            return;
        }
        m13412h();
    }

    @Override // com.ironsource.InterfaceC3737uk
    /* renamed from: a */
    public void mo4890a() {
    }
}
