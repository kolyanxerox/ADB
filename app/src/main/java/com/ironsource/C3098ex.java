package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ex */
/* loaded from: classes2.dex */
public class C3098ex {

    /* renamed from: a */
    public static final String f8467a = "errMsg";

    /* renamed from: a */
    public static JSONObject m8573a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
            return jSONObject;
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
