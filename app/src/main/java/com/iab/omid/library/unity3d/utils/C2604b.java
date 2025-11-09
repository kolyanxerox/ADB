package com.iab.omid.library.unity3d.utils;

import android.os.Build;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.utils.b */
/* loaded from: classes2.dex */
public final class C2604b {
    /* renamed from: a */
    public static String m4619a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m4620b() {
        return C3034d9.f7893d;
    }

    /* renamed from: c */
    public static String m4621c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m4622d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2605c.m4631a(jSONObject, "deviceType", m4619a());
        C2605c.m4631a(jSONObject, "osVersion", m4621c());
        C2605c.m4631a(jSONObject, C3451ne.f10411E, m4620b());
        return jSONObject;
    }
}
