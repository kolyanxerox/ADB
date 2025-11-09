package com.applovin.impl.sdk;

import com.applovin.impl.AbstractC1249t3;
import com.applovin.impl.C1268v4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.n */
/* loaded from: classes.dex */
public class C1223n {

    /* renamed from: j */
    private static final a f2207j = new a();

    /* renamed from: a */
    private final C1220k f2208a;

    /* renamed from: c */
    private long f2210c;

    /* renamed from: f */
    private long f2213f;

    /* renamed from: g */
    private Object f2214g;

    /* renamed from: b */
    private final AtomicBoolean f2209b = new AtomicBoolean();

    /* renamed from: d */
    private final Object f2211d = new Object();

    /* renamed from: e */
    private final AtomicBoolean f2212e = new AtomicBoolean();

    /* renamed from: h */
    private final Map f2215h = new HashMap();

    /* renamed from: i */
    private final Object f2216i = new Object();

    /* renamed from: com.applovin.impl.sdk.n$a */
    public static class a {

        /* renamed from: a */
        private long f2217a = -1;

        /* renamed from: b */
        private int f2218b;

        /* renamed from: a */
        public boolean m3054a(Object obj) {
            return obj instanceof a;
        }

        /* renamed from: b */
        public long m3055b() {
            return this.f2217a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.m3054a((Object) this) && m3055b() == aVar.m3055b() && m3053a() == aVar.m3053a();
        }

        public int hashCode() {
            long jM3055b = m3055b();
            return m3053a() + ((((int) (jM3055b ^ (jM3055b >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + m3055b() + ", attemptCount=" + m3053a() + ")";
        }

        /* renamed from: a */
        public static /* synthetic */ int m3051a(a aVar) {
            int i = aVar.f2218b;
            aVar.f2218b = i + 1;
            return i;
        }

        /* renamed from: a */
        public int m3053a() {
            return this.f2218b;
        }
    }

    public C1223n(C1220k c1220k) {
        this.f2208a = c1220k;
    }

    /* renamed from: a */
    public void m3044a(boolean z) {
        synchronized (this.f2211d) {
            try {
                this.f2212e.set(z);
                if (z) {
                    this.f2213f = System.currentTimeMillis();
                    this.f2208a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f2208a.m2847O().m3211a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f2213f);
                    }
                    Long l = (Long) this.f2208a.m2866a(C1268v4.f2588H1);
                    if (l.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new OooO0O0(5, this, l), l.longValue());
                    }
                } else {
                    this.f2213f = 0L;
                    this.f2208a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f2208a.m2847O().m3211a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public long m3045b() {
        return this.f2210c;
    }

    /* renamed from: c */
    public boolean m3049c() {
        return this.f2209b.get();
    }

    /* renamed from: d */
    public boolean m3050d() {
        return this.f2212e.get();
    }

    /* renamed from: b */
    public void m3047b(Object obj) {
        if (!AbstractC1249t3.m3322a(obj) && this.f2209b.compareAndSet(true, false)) {
            this.f2214g = null;
            this.f2208a.m2847O();
            if (C1240o.m3200a()) {
                this.f2208a.m2847O().m3211a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    /* renamed from: c */
    public void m3048c(String str) {
        synchronized (this.f2216i) {
            try {
                a aVar = (a) this.f2215h.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f2215h.put(str, aVar);
                }
                aVar.f2217a = System.currentTimeMillis();
                a.m3051a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public a m3046b(String str) {
        a aVar;
        synchronized (this.f2216i) {
            aVar = (a) this.f2215h.get(str);
            if (aVar == null) {
                aVar = f2207j;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public /* synthetic */ void m3039a(Long l) {
        if (m3050d() && System.currentTimeMillis() - this.f2213f >= l.longValue()) {
            this.f2208a.m2847O();
            if (C1240o.m3200a()) {
                this.f2208a.m2847O().m3211a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f2212e.set(false);
        }
    }

    /* renamed from: a */
    public Object m3041a() {
        return this.f2214g;
    }

    /* renamed from: a */
    public void m3042a(Object obj) {
        if (!AbstractC1249t3.m3322a(obj) && this.f2209b.compareAndSet(false, true)) {
            this.f2214g = obj;
            this.f2210c = System.currentTimeMillis();
            this.f2208a.m2847O();
            if (C1240o.m3200a()) {
                this.f2208a.m2847O().m3211a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f2210c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l = (Long) this.f2208a.m2866a(C1268v4.f2596I1);
            if (l.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new OooO00o(this, l, obj, 3), l.longValue());
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m3040a(Long l, Object obj) {
        if (this.f2209b.get() && System.currentTimeMillis() - this.f2210c >= l.longValue()) {
            this.f2208a.m2847O();
            if (C1240o.m3200a()) {
                this.f2208a.m2847O().m3211a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            m3047b(obj);
        }
    }

    /* renamed from: a */
    public void m3043a(String str) {
        synchronized (this.f2216i) {
            this.f2215h.remove(str);
        }
    }
}
