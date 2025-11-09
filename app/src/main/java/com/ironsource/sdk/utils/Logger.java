package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3419mh;

/* loaded from: classes2.dex */
public class Logger {

    /* renamed from: a */
    private static boolean f11857a;

    /* renamed from: d */
    public static void m12262d(String str, String str2) {
        if (f11857a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m12264e(String str, String str2) {
        if (f11857a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i) {
        f11857a = C3419mh.d.MODE_0.m10813a() != i;
    }

    /* renamed from: i */
    public static void m12266i(String str, String str2) {
        if (f11857a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: v */
    public static void m12268v(String str, String str2) {
        if (f11857a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m12270w(String str, String str2) {
        if (f11857a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m12263d(String str, String str2, Throwable th) {
        if (f11857a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m12265e(String str, String str2, Throwable th) {
        if (f11857a) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m12267i(String str, String str2, Throwable th) {
        if (!f11857a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    /* renamed from: v */
    public static void m12269v(String str, String str2, Throwable th) {
        if (f11857a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m12271w(String str, String str2, Throwable th) {
        if (f11857a) {
            Log.w(str, str2, th);
        }
    }
}
