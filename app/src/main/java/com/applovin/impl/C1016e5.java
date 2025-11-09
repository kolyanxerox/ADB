package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1240o;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.e5 */
/* loaded from: classes.dex */
public class C1016e5 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b */
    private final String f722b;

    /* renamed from: c */
    private final WeakReference f723c;

    /* renamed from: a */
    private boolean f721a = true;

    /* renamed from: d */
    private final Set f724d = new LinkedHashSet();

    /* renamed from: e */
    private final Object f725e = new Object();

    public C1016e5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f722b = str;
        this.f723c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    /* renamed from: a */
    public AppLovinCommunicatorSubscriber m692a() {
        return (AppLovinCommunicatorSubscriber) this.f723c.get();
    }

    /* renamed from: b */
    public String m694b() {
        return this.f722b;
    }

    /* renamed from: c */
    public boolean m695c() {
        return this.f721a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1016e5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f723c.get();
        C1016e5 c1016e5 = (C1016e5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) c1016e5.f723c.get();
        return m694b().equals(c1016e5.m694b()) && (appLovinCommunicatorSubscriber == null ? appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2 : appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2));
    }

    public int hashCode() {
        int iHashCode = this.f722b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f723c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z;
        if (m692a() == null) {
            C1240o.m3207h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f725e) {
            try {
                if (this.f724d.contains(communicatorMessageImpl.getUniqueId())) {
                    z = false;
                } else {
                    this.f724d.add(communicatorMessageImpl.getUniqueId());
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m692a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    /* renamed from: a */
    public void m693a(boolean z) {
        this.f721a = z;
    }
}
