package com.applovin.impl.sdk;

import com.applovin.impl.C1254u;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1208c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e */
/* loaded from: classes.dex */
public class C1214e {

    /* renamed from: a */
    private final C1220k f2029a;

    /* renamed from: b */
    private final C1240o f2030b;

    /* renamed from: d */
    private final Map f2032d = new HashMap();

    /* renamed from: e */
    private final Map f2033e = new HashMap();

    /* renamed from: c */
    private final Object f2031c = new Object();

    public C1214e(C1220k c1220k) {
        this.f2029a = c1220k;
        this.f2030b = c1220k.m2847O();
        for (C1254u c1254u : C1254u.m3364a()) {
            this.f2032d.put(c1254u, new C1242q());
            this.f2033e.put(c1254u, new C1242q());
        }
    }

    /* renamed from: c */
    private C1242q m2702c(C1254u c1254u) {
        synchronized (this.f2031c) {
            try {
                C1242q c1242qM2701b = m2701b(c1254u);
                if (c1242qM2701b.m3231b() > 0) {
                    return c1242qM2701b;
                }
                return m2703d(c1254u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    private C1242q m2703d(C1254u c1254u) {
        C1242q c1242q;
        synchronized (this.f2031c) {
            try {
                c1242q = (C1242q) this.f2032d.get(c1254u);
                if (c1242q == null) {
                    c1242q = new C1242q();
                    this.f2032d.put(c1254u, c1242q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1242q;
    }

    /* renamed from: a */
    public void m2705a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f2031c) {
            try {
                m2703d(appLovinAdImpl.getAdZone()).m3230a(appLovinAdImpl);
                if (C1240o.m3200a()) {
                    this.f2030b.m3211a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m2706b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f2031c) {
            m2702c(appLovinAdImpl.getAdZone()).m3232b(appLovinAdImpl);
        }
    }

    /* renamed from: e */
    public AppLovinAdImpl m2707e(C1254u c1254u) {
        C1208c c1208c;
        synchronized (this.f2031c) {
            try {
                C1242q c1242qM2703d = m2703d(c1254u);
                if (c1242qM2703d.m3231b() > 0) {
                    m2701b(c1254u).m3230a(c1242qM2703d.m3229a());
                    c1208c = new C1208c(c1254u, this.f2029a);
                } else {
                    c1208c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1208c != null) {
            if (C1240o.m3200a()) {
                this.f2030b.m3211a("AdPreloadManager", "Retrieved ad of zone " + c1254u + "...");
                return c1208c;
            }
        } else if (C1240o.m3200a()) {
            this.f2030b.m3211a("AdPreloadManager", "Unable to retrieve ad of zone " + c1254u + "...");
        }
        return c1208c;
    }

    /* renamed from: f */
    public AppLovinAdBase m2708f(C1254u c1254u) {
        AppLovinAdImpl appLovinAdImplM3234d;
        synchronized (this.f2031c) {
            appLovinAdImplM3234d = m2702c(c1254u).m3234d();
        }
        return appLovinAdImplM3234d;
    }

    /* renamed from: b */
    private C1242q m2701b(C1254u c1254u) {
        C1242q c1242q;
        synchronized (this.f2031c) {
            try {
                c1242q = (C1242q) this.f2033e.get(c1254u);
                if (c1242q == null) {
                    c1242q = new C1242q();
                    this.f2033e.put(c1254u, c1242q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1242q;
    }

    /* renamed from: a */
    public AppLovinAdImpl m2704a(C1254u c1254u) {
        AppLovinAdImpl appLovinAdImplM3229a;
        synchronized (this.f2031c) {
            appLovinAdImplM3229a = m2702c(c1254u).m3229a();
        }
        return appLovinAdImplM3229a;
    }
}
