package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3034d9;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.w0 */
/* loaded from: classes.dex */
public class C1273w0 {

    /* renamed from: a */
    private final JSONObject f2986a;

    /* renamed from: com.applovin.impl.w0$a */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private C1273w0(JSONObject jSONObject) {
        this.f2986a = jSONObject;
    }

    /* renamed from: a */
    public static C1273w0 m3581a(JSONObject jSONObject, C1220k c1220k) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, C3034d9.h.f8063D0, (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && c1220k.m2931y().m3282h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && c1220k.m2931y().m3280f() == null) {
            return null;
        }
        return new C1273w0(jSONObject);
    }

    /* renamed from: b */
    public String m3583b() {
        return JsonUtils.getString(this.f2986a, NotificationCompat.CATEGORY_EVENT, null);
    }

    /* renamed from: c */
    public a m3584c() {
        String string = JsonUtils.getString(this.f2986a, "style", null);
        return "default".equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    /* renamed from: d */
    public String m3585d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f2986a, C3034d9.h.f8063D0, (JSONObject) null);
        return C1220k.m2799a(JsonUtils.getString(jSONObject, "key", ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + m3585d() + ", destinationStateId=" + m3582a() + ", event=" + m3583b() + "}";
    }

    /* renamed from: a */
    public int m3582a() {
        return JsonUtils.getInt(this.f2986a, "destination_state_id", -1);
    }
}
