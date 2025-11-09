package com.ironsource;

import com.ironsource.C3419mh;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.jk */
/* loaded from: classes2.dex */
public class C3259jk {

    /* renamed from: a */
    static String f9128a = "ManRewInst_";

    /* renamed from: a */
    public static String m9516a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: b */
    public static String m9519b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m9517a(C3907zj c3907zj) {
        return (c3907zj.m13399i() ? C3419mh.e.Banner : c3907zj.m13404n() ? C3419mh.e.RewardedVideo : C3419mh.e.Interstitial).toString();
    }

    /* renamed from: a */
    public static String m9518a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f9128a + jSONObject.optString("name");
    }
}
