package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.C1006d5;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: e */
    private static AppLovinCommunicator f156e;

    /* renamed from: f */
    private static final Object f157f = new Object();

    /* renamed from: a */
    private C1220k f158a;

    /* renamed from: b */
    private C1240o f159b;

    /* renamed from: c */
    private final C1006d5 f160c = new C1006d5();

    /* renamed from: d */
    private final MessagingServiceImpl f161d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(C1220k.m2824o());
    }

    /* renamed from: a */
    public void m62a(C1220k c1220k) {
        this.f158a = c1220k;
        this.f159b = c1220k.m2847O();
        m61a("Attached SDK instance: " + c1220k + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f161d;
    }

    public boolean hasSubscriber(String str) {
        return this.f160c.m599a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f158a.m2923u().m2777a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f158a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f157f) {
            try {
                if (f156e == null) {
                    f156e = new AppLovinCommunicator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f156e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f160c.m598a(appLovinCommunicatorSubscriber, str)) {
                this.f161d.maybeSendStickyMessages(str);
            } else {
                m61a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            m61a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f160c.m600b(appLovinCommunicatorSubscriber, str);
        }
    }

    /* renamed from: a */
    private void m61a(String str) {
        if (this.f159b == null || !C1240o.m3200a()) {
            return;
        }
        this.f159b.m3211a("AppLovinCommunicator", str);
    }
}
