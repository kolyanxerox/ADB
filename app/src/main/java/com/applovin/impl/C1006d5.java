package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.applovin.impl.d5 */
/* loaded from: classes.dex */
public class C1006d5 {

    /* renamed from: a */
    private final Set f658a = new HashSet(32);

    /* renamed from: b */
    private final Object f659b = new Object();

    /* renamed from: a */
    public boolean m599a(String str) {
        synchronized (this.f659b) {
            try {
                Iterator it = this.f658a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((C1016e5) it.next()).m694b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m600b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        C1016e5 c1016e5M597a;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f659b) {
                c1016e5M597a = m597a(str, appLovinCommunicatorSubscriber);
            }
            if (c1016e5M597a != null) {
                c1016e5M597a.m693a(false);
                AppLovinBroadcastManager.unregisterReceiver(c1016e5M597a);
            }
        }
    }

    /* renamed from: a */
    public boolean m598a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f659b) {
                try {
                    C1016e5 c1016e5M597a = m597a(str, appLovinCommunicatorSubscriber);
                    if (c1016e5M597a != null) {
                        C1240o.m3207h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!c1016e5M597a.m695c()) {
                            c1016e5M597a.m693a(true);
                            AppLovinBroadcastManager.registerReceiver(c1016e5M597a, new IntentFilter(str));
                        }
                        return true;
                    }
                    C1016e5 c1016e5 = new C1016e5(str, appLovinCommunicatorSubscriber);
                    this.f658a.add(c1016e5);
                    AppLovinBroadcastManager.registerReceiver(c1016e5, new IntentFilter(str));
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1240o.m3207h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    /* renamed from: a */
    private C1016e5 m597a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (C1016e5 c1016e5 : this.f658a) {
            if (str.equals(c1016e5.m694b()) && appLovinCommunicatorSubscriber.equals(c1016e5.m692a())) {
                return c1016e5;
            }
        }
        return null;
    }
}
