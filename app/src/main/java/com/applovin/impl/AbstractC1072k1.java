package com.applovin.impl;

import android.os.Looper;

/* renamed from: com.applovin.impl.k1 */
/* loaded from: classes.dex */
public abstract class AbstractC1072k1 {

    /* renamed from: a */
    private static final Thread f986a = Looper.getMainLooper().getThread();

    /* renamed from: a */
    public static void m1127a(Throwable th) {
    }

    /* renamed from: a */
    public static void m1128a(Throwable th, String str, Object... objArr) {
    }

    /* renamed from: a */
    public static boolean m1131a(boolean z) {
        return m1132a(z, "Assertion failed", new Object[0]);
    }

    /* renamed from: a */
    public static boolean m1132a(boolean z, String str, Object... objArr) {
        if (!z) {
            m1126a(str, objArr);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m1129a(Object obj) {
        return m1130a(obj, "Null value not expected", new Object[0]);
    }

    /* renamed from: a */
    public static boolean m1130a(Object obj, String str, Object... objArr) {
        return m1132a(obj != null, str, objArr);
    }

    /* renamed from: a */
    public static void m1126a(String str, Object... objArr) {
        m1128a((Throwable) null, str, objArr);
    }
}
