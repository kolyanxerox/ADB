package com.applovin.impl.sdk;

import OooOo0o.o000oOoO;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.C1008d7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.f */
/* loaded from: classes.dex */
public class C1215f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private C1008d7 f2034a;

    /* renamed from: b */
    private final Object f2035b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f2036c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f2037d;

    /* renamed from: e */
    private final C1220k f2038e;

    /* renamed from: f */
    private final WeakReference f2039f;

    /* renamed from: g */
    private long f2040g;

    /* renamed from: com.applovin.impl.sdk.f$a */
    public interface a {
        void onAdRefresh();
    }

    public C1215f(C1220k c1220k, a aVar) {
        this.f2039f = new WeakReference(aVar);
        this.f2038e = c1220k;
    }

    /* renamed from: e */
    private void m2709e() {
        if (((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1666u7)).booleanValue()) {
            m2712k();
        }
    }

    /* renamed from: f */
    private void m2710f() {
        if (((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1666u7)).booleanValue()) {
            synchronized (this.f2035b) {
                try {
                    if (this.f2037d) {
                        this.f2038e.m2847O();
                        if (C1240o.m3200a()) {
                            this.f2038e.m2847O().m3211a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f2038e.m2911n0().isApplicationPaused()) {
                        this.f2038e.m2847O();
                        if (C1240o.m3200a()) {
                            this.f2038e.m2847O().m3211a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        C1008d7 c1008d7 = this.f2034a;
                        if (c1008d7 != null) {
                            c1008d7.m643e();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: i */
    public /* synthetic */ void m2711i() {
        m2713l();
        a aVar = (a) this.f2039f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    /* renamed from: k */
    private void m2712k() {
        synchronized (this.f2035b) {
            try {
                C1008d7 c1008d7 = this.f2034a;
                if (c1008d7 != null) {
                    c1008d7.m642d();
                } else {
                    this.f2038e.m2847O();
                    if (C1240o.m3200a()) {
                        this.f2038e.m2847O().m3211a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f2036c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    private void m2713l() {
        synchronized (this.f2035b) {
            try {
                this.f2034a = null;
                if (!((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1667v7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    private void m2714n() {
        synchronized (this.f2035b) {
            try {
                C1008d7 c1008d7 = this.f2034a;
                if (c1008d7 != null) {
                    c1008d7.m643e();
                } else {
                    this.f2036c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2716a(long j) {
        synchronized (this.f2035b) {
            try {
                m2715a();
                this.f2040g = j;
                this.f2034a = C1008d7.m629a(j, this.f2038e, new o000oOoO(this, 11));
                if (!((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1667v7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1666u7)).booleanValue() && (this.f2038e.m2839I().m3049c() || this.f2038e.m2911n0().isApplicationPaused())) {
                    this.f2034a.m642d();
                }
                if (this.f2036c.compareAndSet(true, false) && ((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1668w7)).booleanValue()) {
                    this.f2038e.m2847O();
                    if (C1240o.m3200a()) {
                        this.f2038e.m2847O().m3211a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f2034a.m642d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public long m2717b() {
        long jM641c;
        synchronized (this.f2035b) {
            try {
                C1008d7 c1008d7 = this.f2034a;
                jM641c = c1008d7 != null ? c1008d7.m641c() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jM641c;
    }

    /* renamed from: c */
    public void m2718c() {
        if (((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1665t7)).booleanValue()) {
            m2712k();
        }
    }

    /* renamed from: d */
    public void m2719d() {
        boolean z;
        a aVar;
        if (((Boolean) this.f2038e.m2866a(AbstractC1144o3.f1665t7)).booleanValue()) {
            synchronized (this.f2035b) {
                try {
                    if (this.f2037d) {
                        this.f2038e.m2847O();
                        if (C1240o.m3200a()) {
                            this.f2038e.m2847O().m3211a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f2038e.m2839I().m3049c()) {
                        this.f2038e.m2847O();
                        if (C1240o.m3200a()) {
                            this.f2038e.m2847O().m3211a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f2034a != null) {
                        long jM2717b = this.f2040g - m2717b();
                        long jLongValue = ((Long) this.f2038e.m2866a(AbstractC1144o3.f1663s7)).longValue();
                        if (jLongValue < 0 || jM2717b <= jLongValue) {
                            this.f2034a.m643e();
                            z = false;
                        } else {
                            m2715a();
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (!z || (aVar = (a) this.f2039f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: g */
    public boolean m2720g() {
        return this.f2037d;
    }

    /* renamed from: h */
    public boolean m2721h() {
        boolean z;
        synchronized (this.f2035b) {
            z = this.f2034a != null;
        }
        return z;
    }

    /* renamed from: j */
    public void m2722j() {
        synchronized (this.f2035b) {
            m2712k();
            this.f2037d = true;
        }
    }

    /* renamed from: m */
    public void m2723m() {
        synchronized (this.f2035b) {
            m2714n();
            this.f2037d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            m2718c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m2719d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            m2709e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m2710f();
        }
    }

    /* renamed from: a */
    public void m2715a() {
        synchronized (this.f2035b) {
            try {
                C1008d7 c1008d7 = this.f2034a;
                if (c1008d7 != null) {
                    c1008d7.m640a();
                    m2713l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
