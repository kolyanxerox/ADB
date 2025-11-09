package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.AbstractC0980b;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C1268v4;
import com.ironsource.C3034d9;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a */
    final C1220k f1953a;

    /* renamed from: b */
    private final String f1954b = UUID.randomUUID().toString();

    /* renamed from: c */
    private final AtomicBoolean f1955c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f1956d = new AtomicBoolean();

    /* renamed from: e */
    private final AtomicInteger f1957e = new AtomicInteger();

    /* renamed from: f */
    private final AtomicLong f1958f = new AtomicLong();

    /* renamed from: g */
    private final AtomicLong f1959g = new AtomicLong();

    /* renamed from: h */
    private Date f1960h;

    /* renamed from: i */
    private Date f1961i;

    /* renamed from: com.applovin.impl.sdk.SessionTracker$a */
    public class C1200a extends AbstractC0980b {
        public C1200a() {
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.m2469b();
        }
    }

    /* renamed from: com.applovin.impl.sdk.SessionTracker$b */
    public class ComponentCallbacks2C1201b implements ComponentCallbacks2 {
        public ComponentCallbacks2C1201b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            SessionTracker.this.f1957e.set(i);
            if (i == 20) {
                SessionTracker.this.m2466a();
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.SessionTracker$c */
    public class C1202c extends BroadcastReceiver {
        public C1202c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (AbstractC1078k7.m1244g()) {
                    SessionTracker.this.m2469b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.m2466a();
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.SessionTracker$d */
    public static /* synthetic */ class C1203d {

        /* renamed from: a */
        static final /* synthetic */ int[] f1965a;

        static {
            int[] iArr = new int[EnumC1204e.values().length];
            f1965a = iArr;
            try {
                iArr[EnumC1204e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1965a[EnumC1204e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1965a[EnumC1204e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.SessionTracker$e */
    public enum EnumC1204e {
        STARTED(C3034d9.h.f8100d0),
        PAUSED(C3034d9.h.f8102e0),
        RESUMED("resumed");


        /* renamed from: a */
        private final String f1970a;

        EnumC1204e(String str) {
            this.f1970a = str;
        }

        /* renamed from: b */
        public String m2474b() {
            return this.f1970a;
        }
    }

    public SessionTracker(C1220k c1220k) {
        this.f1953a = c1220k;
        Application application = (Application) C1220k.m2824o();
        application.registerActivityLifecycleCallbacks(new C1200a());
        application.registerComponentCallbacks(new ComponentCallbacks2C1201b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new C1202c(), intentFilter);
    }

    /* renamed from: d */
    private void m2472d() {
        this.f1953a.m2847O();
        if (C1240o.m3200a()) {
            this.f1953a.m2847O().m3211a("SessionTracker", "Application Resumed");
        }
        this.f1959g.set(System.currentTimeMillis());
        boolean zBooleanValue = ((Boolean) this.f1953a.m2866a(C1268v4.f2879r3)).booleanValue();
        long jLongValue = ((Long) this.f1953a.m2866a(C1268v4.f2887s3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f1955c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f1961i == null || System.currentTimeMillis() - this.f1961i.getTime() >= millis) {
            this.f1953a.m2836G().trackEvent("resumed");
            if (zBooleanValue) {
                this.f1961i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f1961i = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f1958f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f1959g.get();
    }

    public EnumC1204e getCurrentApplicationState() {
        return this.f1956d.get() ? EnumC1204e.PAUSED : this.f1958f.get() != 0 ? EnumC1204e.RESUMED : EnumC1204e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jM2823n;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = C1203d.f1965a[getCurrentApplicationState().ordinal()];
        if (i == 1) {
            jM2823n = C1220k.m2823n();
        } else if (i == 2) {
            jM2823n = this.f1958f.get();
        } else {
            if (i != 3) {
                return -1L;
            }
            jM2823n = this.f1959g.get();
        }
        return jCurrentTimeMillis - jM2823n;
    }

    public int getLastTrimMemoryLevel() {
        return this.f1957e.get();
    }

    public String getSessionId() {
        return this.f1954b;
    }

    public boolean isApplicationPaused() {
        return this.f1956d.get();
    }

    public void pauseForClick() {
        this.f1955c.set(true);
    }

    public void resumeForClick() {
        this.f1955c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2466a() {
        if (this.f1956d.compareAndSet(false, true)) {
            m2470c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m2469b() {
        if (this.f1956d.compareAndSet(true, false)) {
            m2472d();
        }
    }

    /* renamed from: c */
    private void m2470c() {
        this.f1953a.m2847O();
        if (C1240o.m3200a()) {
            this.f1953a.m2847O().m3211a("SessionTracker", "Application Paused");
        }
        this.f1958f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f1955c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f1953a.m2866a(C1268v4.f2879r3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f1953a.m2866a(C1268v4.f2895t3)).longValue());
        if (this.f1960h == null || System.currentTimeMillis() - this.f1960h.getTime() >= millis) {
            this.f1953a.m2836G().trackEvent(C3034d9.h.f8102e0);
            if (zBooleanValue) {
                this.f1960h = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f1960h = new Date();
    }
}
