package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.oc */
/* loaded from: classes2.dex */
public class C3484oc {

    /* renamed from: e */
    public static final int f10641e = -1;

    /* renamed from: a */
    private Runnable f10642a = new a();

    /* renamed from: b */
    private int f10643b;

    /* renamed from: c */
    private InterfaceC3471o f10644c;

    /* renamed from: d */
    private C3910zm f10645d;

    /* renamed from: com.ironsource.oc$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            if (C3484oc.this.f10644c != null) {
                C3484oc.this.f10644c.mo10607a();
            }
        }
    }

    public C3484oc(int i, InterfaceC3471o interfaceC3471o) {
        this.f10644c = interfaceC3471o;
        this.f10643b = i;
    }

    /* renamed from: b */
    public boolean m11131b() {
        return this.f10643b > 0;
    }

    /* renamed from: a */
    public void m11129a() {
        if (!m11131b() || this.f10645d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f10645d.m13413e();
        this.f10645d = null;
    }

    /* renamed from: a */
    public void m11130a(long j) {
        if (m11131b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f10643b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f10644c.mo10607a();
                return;
            }
            m11129a();
            this.f10645d = new C3910zm(millis, this.f10642a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}
