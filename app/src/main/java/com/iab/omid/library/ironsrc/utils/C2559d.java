package com.iab.omid.library.ironsrc.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C2528a;

/* renamed from: com.iab.omid.library.ironsrc.utils.d */
/* loaded from: classes2.dex */
public final class C2559d {
    /* renamed from: a */
    public static void m4404a(String str) {
        if (!C2528a.f3580a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m4406b(String str) {
        if (!C2528a.f3580a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m4405a(String str, Exception exc) {
        if ((!C2528a.f3580a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
