package com.iab.omid.library.unity3d.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.unity3d.C2579a;

/* renamed from: com.iab.omid.library.unity3d.utils.d */
/* loaded from: classes2.dex */
public final class C2606d {
    /* renamed from: a */
    public static void m4644a(String str) {
        if (!C2579a.f3715a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m4645a(String str, Exception exc) {
        if ((!C2579a.f3715a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
