package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.C1186s2;
import com.applovin.impl.C1268v4;
import com.ironsource.C3034d9;

/* renamed from: com.applovin.impl.sdk.o */
/* loaded from: classes.dex */
public class C1240o {

    /* renamed from: b */
    private static boolean f2339b;

    /* renamed from: a */
    private final C1220k f2340a;

    public C1240o(C1220k c1220k) {
        this.f2340a = c1220k;
        m3198a("SDK Session Begin");
    }

    /* renamed from: a */
    public static void m3199a(boolean z) {
        f2339b = z;
    }

    /* renamed from: c */
    public static void m3204c(String str, String str2, Throwable th) {
        if (!f2339b || m3200a()) {
            Log.e("AppLovinSdk", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o(C3034d9.i.f8177d, str, "] ", str2), th);
        }
    }

    /* renamed from: e */
    public static void m3205e(String str, String str2) {
        m3206g(str, str2);
    }

    /* renamed from: g */
    public static void m3206g(String str, String str2) {
        if (!f2339b || m3200a()) {
            Log.d("AppLovinSdk", C3034d9.i.f8177d + str + "] " + str2);
        }
    }

    /* renamed from: h */
    public static void m3207h(String str, String str2) {
        m3204c(str, str2, null);
    }

    /* renamed from: i */
    public static void m3208i(String str, String str2) {
        if (!f2339b || m3200a()) {
            Log.i("AppLovinSdk", C3034d9.i.f8177d + str + "] " + str2);
        }
    }

    /* renamed from: j */
    public static void m3209j(String str, String str2) {
        if (!f2339b || m3200a()) {
            Log.w("AppLovinSdk", C3034d9.i.f8177d + str + "] " + str2);
        }
    }

    /* renamed from: l */
    public static void m3210l(String str, String str2) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k == null) {
            return;
        }
        c1220k.m2847O();
        if (m3200a()) {
            C1220k.f2089D0.m2847O().m3218k(str, str2);
        }
    }

    /* renamed from: b */
    public void m3214b(String str, String str2) {
        m3212a(str, str2, null);
    }

    /* renamed from: d */
    public void m3215d(String str, String str2) {
        Log.i("AppLovinSdk", C3034d9.i.f8177d + str + "] " + str2);
    }

    /* renamed from: f */
    public void m3217f(String str, String str2) {
        int iIntValue;
        if (m3201a(this.f2340a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f2340a.m2866a(C1268v4.f2875r)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + iIntValue) - 1) / iIntValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * iIntValue;
                m3211a(str, str2.substring(i3, Math.min(length, i3 + iIntValue)));
            }
        }
    }

    /* renamed from: k */
    public void m3218k(String str, String str2) {
        m3216d(str, str2, null);
    }

    /* renamed from: a */
    private void m3198a(String str) {
        C1186s2 c1186s2 = new C1186s2();
        c1186s2.m2361a().m2367a(str).m2361a();
        m3206g("AppLovinSdk", c1186s2.toString());
    }

    /* renamed from: b */
    public static void m3202b(String str, String str2, Throwable th) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k == null) {
            return;
        }
        c1220k.m2847O();
        if (m3200a()) {
            C1220k.f2089D0.m2847O().m3212a(str, str2, th);
        }
    }

    /* renamed from: d */
    public void m3216d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o(C3034d9.i.f8177d, str, "] ", str2), th);
    }

    /* renamed from: a */
    public void m3213a(String str, Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            m3214b(str, th2.toString());
        }
    }

    /* renamed from: a */
    public void m3211a(String str, String str2) {
        Log.d("AppLovinSdk", C3034d9.i.f8177d + str + "] " + str2);
    }

    /* renamed from: a */
    public void m3212a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o(C3034d9.i.f8177d, str, "] ", str2), th);
    }

    /* renamed from: c */
    public static void m3203c(String str, String str2) {
        m3202b(str, str2, null);
    }

    /* renamed from: a */
    public static boolean m3200a() {
        return m3201a(C1220k.f2089D0);
    }

    /* renamed from: a */
    public static boolean m3201a(C1220k c1220k) {
        return c1220k != null && c1220k.m2914p0().m3613c();
    }
}
