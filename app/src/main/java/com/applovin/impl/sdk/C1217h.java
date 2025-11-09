package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* renamed from: com.applovin.impl.sdk.h */
/* loaded from: classes.dex */
public class C1217h implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1220k f2064a;

    /* renamed from: b */
    private final AtomicReference f2065b;

    /* renamed from: c */
    private final Handler f2066c;

    /* renamed from: d */
    private final Handler f2067d;

    /* renamed from: e */
    private final AtomicLong f2068e = new AtomicLong(0);

    /* renamed from: f */
    private long f2069f;

    /* renamed from: g */
    private long f2070g;

    /* renamed from: h */
    private long f2071h;

    /* renamed from: com.applovin.impl.sdk.h$b */
    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    /* renamed from: com.applovin.impl.sdk.h$c */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (C1217h.this.f2065b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - C1217h.this.f2068e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= C1217h.this.f2069f) {
                C1217h.this.f2067d.postDelayed(this, C1217h.this.f2071h);
                return;
            }
            C1217h.this.f2065b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(C1217h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = OfficeOpenXMLExtended.SECURITY_NONE;
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - C1220k.m2823n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", C1217h.this.f2064a.m2826A0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            C1217h.this.f2064a.m2832E().m576d(C0993c2.f538r0, map);
        }
    }

    /* renamed from: com.applovin.impl.sdk.h$d */
    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1217h.this.f2065b.get() != b.MONITORING) {
                return;
            }
            C1217h.this.f2068e.set(System.currentTimeMillis());
            C1217h.this.f2066c.postDelayed(this, C1217h.this.f2070g);
        }
    }

    public C1217h(C1220k c1220k) {
        this.f2064a = c1220k;
        this.f2065b = new AtomicReference(!AbstractC1078k7.m1228c(c1220k) ? b.IDLE : b.INELIGIBLE);
        this.f2066c = new Handler(C1220k.m2824o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f2067d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            m2744b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m2746c();
        }
    }

    /* renamed from: b */
    private void m2744b() {
        AtomicReference atomicReference = this.f2065b;
        b bVar = b.MONITORING;
        b bVar2 = b.IDLE;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f2066c.removeCallbacksAndMessages(null);
        this.f2067d.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    private void m2746c() {
        if (((Boolean) this.f2064a.m2866a(C1268v4.f2688T5)).booleanValue() && this.f2064a.m2911n0().getCurrentApplicationState() == SessionTracker.EnumC1204e.PAUSED) {
            return;
        }
        AtomicReference atomicReference = this.f2065b;
        b bVar = b.IDLE;
        b bVar2 = b.MONITORING;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f2066c.post(new d());
        this.f2067d.postDelayed(new c(), this.f2071h / 2);
    }

    /* renamed from: d */
    private void m2748d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f2069f = ((Long) this.f2064a.m2866a(C1268v4.f2664Q5)).longValue();
        this.f2070g = ((Long) this.f2064a.m2866a(C1268v4.f2672R5)).longValue();
        this.f2071h = ((Long) this.f2064a.m2866a(C1268v4.f2680S5)).longValue();
        if (((Boolean) this.f2064a.m2866a(C1268v4.f2688T5)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    /* renamed from: a */
    public void m2753a() {
        if (this.f2065b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f2064a.m2866a(C1268v4.f2656P5)).booleanValue()) {
            m2744b();
        } else {
            m2748d();
            m2746c();
        }
    }
}
