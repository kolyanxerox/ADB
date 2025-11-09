package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.ironsource.C3034d9;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    private static final AppLovinExceptionHandler f1924e = new AppLovinExceptionHandler();

    /* renamed from: a */
    private final Set f1925a = new HashSet(2);

    /* renamed from: b */
    private final AtomicBoolean f1926b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f1927c = new AtomicBoolean();

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f1928d;

    /* renamed from: a */
    private String m2441a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f1924e;
    }

    public void addSdk(C1220k c1220k) {
        if (this.f1925a.contains(c1220k)) {
            return;
        }
        this.f1925a.add(c1220k);
    }

    public void enable() {
        if (this.f1926b.compareAndSet(false, true)) {
            this.f1928d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        if (this.f1927c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (C1220k c1220k : this.f1925a) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3211a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) c1220k.m2866a(C1268v4.f2922w6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", m2441a(th, num.intValue()));
            }
            c1220k.m2832E().m576d(C0993c2.f470C0, mapHashMap);
            c1220k.m2836G().trackEventSynchronously(C3034d9.h.f8102e0);
            jLongValue = ((Long) c1220k.m2866a(C1268v4.f2831l3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1928d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
