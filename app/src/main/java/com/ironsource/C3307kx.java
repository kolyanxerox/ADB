package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3619s7;
import com.ironsource.C3350m2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.kx */
/* loaded from: classes2.dex */
public class C3307kx<Smash extends AbstractC3619s7<?>> {

    /* renamed from: d */
    AbstractC3619s7<?> f9282d;

    /* renamed from: e */
    private final List<String> f9283e;

    /* renamed from: f */
    private final int f9284f;

    /* renamed from: h */
    InterfaceC3346lx f9286h;

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f9279a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private String f9280b = "";

    /* renamed from: c */
    private String f9281c = "";

    /* renamed from: g */
    private final Timer f9285g = new Timer();

    /* renamed from: i */
    private final int f9287i = 5;

    /* renamed from: com.ironsource.kx$a */
    public class a extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ String f9288a;

        public a(String str) {
            this.f9288a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f9288a + " from memory");
                C3307kx.this.f9279a.remove(this.f9288a);
                ironLog.verbose("waterfall size is currently " + C3307kx.this.f9279a.size());
            } finally {
                cancel();
            }
        }
    }

    public C3307kx(List<String> list, int i, InterfaceC3346lx interfaceC3346lx) {
        this.f9283e = list;
        this.f9284f = i;
        this.f9286h = interfaceC3346lx;
    }

    /* renamed from: a */
    private void m9716a() {
        for (Smash smash : m9722b()) {
            if (!smash.equals(this.f9282d)) {
                smash.m11859M();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m9717e() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.s7<?> r0 = r2.f9282d     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            boolean r0 = r0.m11857C()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            com.ironsource.s7<?> r0 = r2.f9282d     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.m11869h()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.f9281c     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r2)
            return r0
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3307kx.m9717e():boolean");
    }

    /* renamed from: b */
    public List<Smash> m9722b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f9279a.get(this.f9280b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* renamed from: c */
    public String m9724c() {
        return this.f9280b;
    }

    /* renamed from: d */
    public AbstractC3619s7<?> m9725d() {
        return this.f9282d;
    }

    /* renamed from: a */
    public void m9718a(C3350m2.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m9716a();
        if (aVar == C3350m2.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == C3350m2.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f9279a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f9281c)) {
                if (m9717e()) {
                    StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                    sb.append(this.f9281c);
                    sb.append(" is still showing - the current waterfall ");
                    AbstractC2183w4.OooOOo(sb, this.f9280b, " will be deleted instead", ironLog);
                    String str2 = this.f9280b;
                    this.f9280b = this.f9281c;
                    this.f9281c = str2;
                }
                this.f9285g.schedule(new a(this.f9281c), this.f9284f);
            }
        } else {
            this.f9279a.clear();
            this.f9279a.put(str, copyOnWriteArrayList);
        }
        this.f9281c = this.f9280b;
        this.f9280b = str;
        if (this.f9279a.size() > 5) {
            this.f9286h.mo9934a(this.f9279a.size());
        }
    }

    /* renamed from: b */
    public synchronized void m9723b(AbstractC3619s7<?> abstractC3619s7) {
        IronLog.INTERNAL.verbose();
        this.f9282d = abstractC3619s7;
    }

    /* renamed from: a */
    public synchronized void m9719a(AbstractC3619s7<?> abstractC3619s7) {
        IronLog.INTERNAL.verbose();
        AbstractC3619s7<?> abstractC3619s72 = this.f9282d;
        if (abstractC3619s72 != null && !abstractC3619s72.equals(abstractC3619s7)) {
            this.f9282d.m11859M();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:31:0x004b, B:6:0x0008, B:8:0x000d, B:13:0x0014, B:15:0x0018, B:18:0x001f, B:20:0x0023, B:23:0x0030, B:25:0x0034, B:27:0x003c), top: B:36:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m9720a(com.ironsource.C3350m2.a r1, java.lang.String r2, java.lang.String r3, com.ironsource.mediationsdk.LoadWhileShowSupportState r4, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface r5, com.ironsource.mediationsdk.IronSource.AD_UNIT r6) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r5 = r0.m9721a(r5, r6, r2)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L8
            goto L48
        L8:
            com.ironsource.m2$a r5 = com.ironsource.C3350m2.a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch: java.lang.Throwable -> L12
            r6 = 1
            if (r1 == r5) goto L14
            com.ironsource.m2$a r5 = com.ironsource.C3350m2.a.MANUAL_WITH_LOAD_ON_SHOW     // Catch: java.lang.Throwable -> L12
            if (r1 == r5) goto L14
            goto L49
        L12:
            r1 = move-exception
            goto L63
        L14:
            com.ironsource.s7<?> r1 = r0.f9282d     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L49
            boolean r1 = r1.m11857C()     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1f
            goto L49
        L1f:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r1 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L12
            if (r4 != r1) goto L30
            com.ironsource.s7<?> r1 = r0.f9282d     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.mo9129c()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L30
            goto L48
        L30:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r1 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L12
            if (r4 == r1) goto L3c
            java.util.List<java.lang.String> r1 = r0.f9283e     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L49
        L3c:
            com.ironsource.s7<?> r1 = r0.f9282d     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.m11875n()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L49
        L48:
            r6 = 0
        L49:
            if (r6 != 0) goto L61
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r3.<init>()     // Catch: java.lang.Throwable -> L12
            r3.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = " will not be added to the auction request"
            r3.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L12
            r1.verbose(r2)     // Catch: java.lang.Throwable -> L12
        L61:
            monitor-exit(r0)
            return r6
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3307kx.m9720a(com.ironsource.m2$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.ironsource.mediationsdk.IronSource$AD_UNIT):boolean");
    }

    /* renamed from: a */
    public boolean m9721a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }
}
