package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.InterfaceC1185s1;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.a */
/* loaded from: classes.dex */
public class C1205a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: e */
    private static final long f1971e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a */
    private final C1220k f1972a;

    /* renamed from: b */
    private final C1240o f1973b;

    /* renamed from: c */
    private final HashSet f1974c = new HashSet();

    /* renamed from: d */
    private final Object f1975d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a */
    public interface a {
        void onAdExpired(InterfaceC1185s1 interfaceC1185s1);
    }

    public C1205a(C1220k c1220k) {
        this.f1972a = c1220k;
        this.f1973b = c1220k.m2847O();
    }

    /* renamed from: b */
    private C1211b m2476b(InterfaceC1185s1 interfaceC1185s1) {
        synchronized (this.f1975d) {
            try {
                if (interfaceC1185s1 == null) {
                    return null;
                }
                Iterator it = this.f1974c.iterator();
                while (it.hasNext()) {
                    C1211b c1211b = (C1211b) it.next();
                    if (interfaceC1185s1 == c1211b.m2659b()) {
                        return c1211b;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public boolean m2480a(InterfaceC1185s1 interfaceC1185s1, a aVar) {
        synchronized (this.f1975d) {
            try {
                if (m2476b(interfaceC1185s1) != null) {
                    if (C1240o.m3200a()) {
                        this.f1973b.m3211a("AdExpirationManager", "Ad expiration already scheduled for ad: " + interfaceC1185s1);
                    }
                    return true;
                }
                if (interfaceC1185s1.getTimeToLiveMillis() <= f1971e) {
                    if (C1240o.m3200a()) {
                        this.f1973b.m3211a("AdExpirationManager", "Ad has already expired: " + interfaceC1185s1);
                    }
                    interfaceC1185s1.setExpired();
                    return false;
                }
                if (C1240o.m3200a()) {
                    this.f1973b.m3211a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(interfaceC1185s1.getTimeToLiveMillis()) + " seconds from now for " + interfaceC1185s1 + "...");
                }
                if (this.f1974c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f1974c.add(C1211b.m2655a(interfaceC1185s1, aVar, this.f1972a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            m2475a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m2477b();
        }
    }

    /* renamed from: b */
    private void m2477b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f1975d) {
            try {
                Iterator it = this.f1974c.iterator();
                while (it.hasNext()) {
                    C1211b c1211b = (C1211b) it.next();
                    InterfaceC1185s1 interfaceC1185s1M2659b = c1211b.m2659b();
                    if (interfaceC1185s1M2659b == null) {
                        hashSet.add(c1211b);
                    } else {
                        long timeToLiveMillis = interfaceC1185s1M2659b.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (C1240o.m3200a()) {
                                this.f1973b.m3211a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + interfaceC1185s1M2659b);
                            }
                            hashSet.add(c1211b);
                        } else {
                            if (C1240o.m3200a()) {
                                this.f1973b.m3211a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + interfaceC1185s1M2659b);
                            }
                            c1211b.m2658a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C1211b c1211b2 = (C1211b) it2.next();
            m2479a(c1211b2);
            c1211b2.m2660d();
        }
    }

    /* renamed from: a */
    public void m2478a(InterfaceC1185s1 interfaceC1185s1) {
        synchronized (this.f1975d) {
            try {
                C1211b c1211bM2476b = m2476b(interfaceC1185s1);
                if (c1211bM2476b != null) {
                    if (C1240o.m3200a()) {
                        this.f1973b.m3211a("AdExpirationManager", "Cancelling expiration timer for ad: " + interfaceC1185s1);
                    }
                    c1211bM2476b.m2657a();
                    m2479a(c1211bM2476b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2479a(C1211b c1211b) {
        synchronized (this.f1975d) {
            try {
                this.f1974c.remove(c1211b);
                if (this.f1974c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m2475a() {
        synchronized (this.f1975d) {
            try {
                Iterator it = this.f1974c.iterator();
                while (it.hasNext()) {
                    ((C1211b) it.next()).m2657a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
