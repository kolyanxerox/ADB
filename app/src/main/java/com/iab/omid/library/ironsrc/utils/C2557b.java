package com.iab.omid.library.ironsrc.utils;

import android.os.Build;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.utils.b */
/* loaded from: classes2.dex */
public final class C2557b {
    /* renamed from: a */
    public static String m4378a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m4379b() {
        return C3034d9.f7893d;
    }

    /* renamed from: c */
    public static String m4380c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m4381d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2558c.m4390a(jSONObject, "deviceType", m4378a());
        C2558c.m4390a(jSONObject, "osVersion", m4380c());
        C2558c.m4390a(jSONObject, C3451ne.f10411E, m4379b());
        return jSONObject;
    }
}
