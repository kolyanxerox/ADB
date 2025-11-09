package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.g0 */
/* loaded from: classes.dex */
public class C1031g0 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c */
    private static final Set f766c = new HashSet();

    /* renamed from: a */
    private final C1008d7 f767a;

    /* renamed from: b */
    private final C1220k f768b;

    private C1031g0(long j, boolean z, C1220k c1220k, Runnable runnable) {
        this.f767a = C1008d7.m630a(j, z, c1220k, new o0OoOo0(this, z, runnable, 0));
        this.f768b = c1220k;
        f766c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* renamed from: a */
    public static C1031g0 m768a(long j, C1220k c1220k, Runnable runnable) {
        return m769a(j, false, c1220k, runnable);
    }

    /* renamed from: b */
    public long m772b() {
        return this.f767a.m641c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f767a.m642d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f767a.m643e();
        }
    }

    /* renamed from: a */
    public static C1031g0 m769a(long j, boolean z, C1220k c1220k, Runnable runnable) {
        return new C1031g0(j, z, c1220k, runnable);
    }

    /* renamed from: a */
    public /* synthetic */ void m770a(boolean z, Runnable runnable) {
        if (!z) {
            m771a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void m771a() {
        this.f767a.m640a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f766c.remove(this);
    }
}
