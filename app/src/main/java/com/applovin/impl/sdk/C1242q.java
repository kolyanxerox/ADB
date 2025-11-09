package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.sdk.q */
/* loaded from: classes.dex */
class C1242q {

    /* renamed from: a */
    private final Queue f2349a = new LinkedList();

    /* renamed from: b */
    private final Object f2350b = new Object();

    /* renamed from: a */
    public void m3230a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f2350b) {
            try {
                if (m3231b() <= 25) {
                    this.f2349a.offer(appLovinAdImpl);
                } else {
                    C1240o.m3207h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public int m3231b() {
        int size;
        synchronized (this.f2350b) {
            size = this.f2349a.size();
        }
        return size;
    }

    /* renamed from: c */
    public boolean m3233c() {
        boolean z;
        synchronized (this.f2350b) {
            z = m3231b() == 0;
        }
        return z;
    }

    /* renamed from: d */
    public AppLovinAdImpl m3234d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f2350b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f2349a.peek();
        }
        return appLovinAdImpl;
    }

    /* renamed from: b */
    public void m3232b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f2350b) {
            this.f2349a.remove(appLovinAdImpl);
        }
    }

    /* renamed from: a */
    public AppLovinAdImpl m3229a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f2350b) {
            try {
                appLovinAdImpl = !m3233c() ? (AppLovinAdImpl) this.f2349a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
