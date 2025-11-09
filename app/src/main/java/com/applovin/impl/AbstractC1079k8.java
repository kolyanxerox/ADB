package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.k8 */
/* loaded from: classes.dex */
public abstract class AbstractC1079k8 {

    /* renamed from: a */
    private static String f1008a;

    /* renamed from: d */
    private static int f1011d;

    /* renamed from: e */
    private static String f1012e;

    /* renamed from: f */
    private static String f1013f;

    /* renamed from: b */
    private static final Object f1009b = new Object();

    /* renamed from: c */
    private static final AtomicBoolean f1010c = new AtomicBoolean();

    /* renamed from: g */
    private static final AtomicBoolean f1014g = new AtomicBoolean();

    static {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null && ((Boolean) c1220k.m2866a(C1268v4.f2742a4)).booleanValue() && m1265e()) {
            f1008a = (String) C1295y4.m3787a(C1286x4.f3040L, "", C1220k.m2824o());
        } else {
            f1008a = "";
            C1295y4.m3793b(C1286x4.f3040L, (Object) null, C1220k.m2824o());
        }
    }

    /* renamed from: a */
    public static void m1258a(C1220k c1220k) {
        if (f1010c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new oo0o0Oo(1, c1220k));
    }

    /* renamed from: b */
    public static String m1259b() {
        return f1013f;
    }

    /* renamed from: c */
    public static String m1262c() {
        return f1012e;
    }

    /* renamed from: d */
    public static int m1263d() {
        return f1011d;
    }

    /* renamed from: e */
    private static boolean m1265e() {
        boolean zIsValidString;
        synchronized (f1009b) {
            zIsValidString = StringUtils.isValidString((String) C1295y4.m3787a(C1286x4.f3040L, "", C1220k.m2824o()));
        }
        return zIsValidString;
    }

    /* renamed from: b */
    public static void m1260b(C1220k c1220k) {
        if (f1014g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoM1261c = m1261c(c1220k);
        if (packageInfoM1261c != null) {
            f1011d = packageInfoM1261c.versionCode;
            f1012e = packageInfoM1261c.versionName;
            f1013f = packageInfoM1261c.packageName;
        } else {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    /* renamed from: c */
    private static PackageInfo m1261c(C1220k c1220k) {
        PackageManager packageManager = C1220k.m2824o().getPackageManager();
        if (AbstractC1141o0.m1952h()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = c1220k.m2888c(C1268v4.f2832l4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public static /* synthetic */ void m1264d(C1220k c1220k) {
        try {
            synchronized (f1009b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(C1220k.m2824o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f1008a = defaultUserAgent;
                        C1295y4.m3793b(C1286x4.f3040L, f1008a, C1220k.m2824o());
                    } else {
                        c1220k.m2847O();
                        if (C1240o.m3200a()) {
                            c1220k.m2847O().m3214b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        c1220k.m2832E().m571a(C0993c2.f492N0, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            c1220k.m2832E().m2148a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    /* renamed from: a */
    public static String m1257a() {
        String str;
        synchronized (f1009b) {
            str = f1008a;
        }
        return str;
    }
}
