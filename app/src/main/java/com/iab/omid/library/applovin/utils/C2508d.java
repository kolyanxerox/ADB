package com.iab.omid.library.applovin.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.C2477a;

/* renamed from: com.iab.omid.library.applovin.utils.d */
/* loaded from: classes2.dex */
public final class C2508d {
    /* renamed from: a */
    public static void m4151a(String str) {
        if (!C2477a.f3445a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m4153b(String str) {
        if (!C2477a.f3445a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m4152a(String str, Exception exc) {
        if ((!C2477a.f3445a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
