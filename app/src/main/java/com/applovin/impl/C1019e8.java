package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.applovin.impl.e8 */
/* loaded from: classes.dex */
public class C1019e8 {

    /* renamed from: f */
    private static final Set f729f = new HashSet();

    /* renamed from: a */
    private final boolean f730a;

    /* renamed from: b */
    private final C1220k f731b;

    /* renamed from: c */
    private Runnable f732c;

    /* renamed from: d */
    private final Object f733d = new Object();

    /* renamed from: e */
    private final Timer f734e;

    /* renamed from: com.applovin.impl.e8$a */
    public class a extends TimerTask {

        /* renamed from: com.applovin.impl.e8$a$a, reason: collision with other inner class name */
        public class C4552a implements AppLovinBroadcastManager.Receiver {
            public C4552a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                C1019e8.this.m700c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!C1019e8.this.f731b.m2911n0().isApplicationPaused() || C1019e8.this.f730a) {
                C1019e8.this.m700c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C4552a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private C1019e8(long j, boolean z, C1220k c1220k, Runnable runnable) {
        Timer timer = new Timer();
        this.f734e = timer;
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "Cannot create wall clock timer. Invalid timer length: "));
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f730a = z;
        this.f731b = c1220k;
        this.f732c = runnable;
        f729f.add(this);
        timer.schedule(m698b(), j);
    }

    /* renamed from: a */
    public static C1019e8 m696a(long j, boolean z, C1220k c1220k, Runnable runnable) {
        return new C1019e8(j, z, c1220k, runnable);
    }

    /* renamed from: b */
    private TimerTask m698b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m700c() {
        Runnable runnable = this.f732c;
        if (runnable != null) {
            runnable.run();
            m702a();
        }
    }

    /* renamed from: a */
    public void m702a() {
        synchronized (this.f733d) {
            this.f734e.cancel();
            this.f732c = null;
            f729f.remove(this);
        }
    }
}
