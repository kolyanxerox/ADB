package com.iab.omid.library.applovin.utils;

import android.os.Build;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.utils.b */
/* loaded from: classes2.dex */
public final class C2506b {
    /* renamed from: a */
    public static String m4125a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m4126b() {
        return C3034d9.f7893d;
    }

    /* renamed from: c */
    public static String m4127c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m4128d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2507c.m4137a(jSONObject, "deviceType", m4125a());
        C2507c.m4137a(jSONObject, "osVersion", m4127c());
        C2507c.m4137a(jSONObject, C3451ne.f10411E, m4126b());
        return jSONObject;
    }
}
