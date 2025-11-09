package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.h9 */
/* loaded from: classes2.dex */
public class C3179h9 {

    /* renamed from: a */
    public static final String f8849a = "SSA_CORE.SDKController.runFunction";

    /* renamed from: a */
    public static String m9100a(C3214i9 c3214i9) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f8849a, c3214i9.m9300b(), m9101a(c3214i9.m9301c()), m9102b(c3214i9));
    }

    /* renamed from: b */
    private static String m9102b(C3214i9 c3214i9) {
        return (c3214i9.m9302d() == null || c3214i9.m9299a() == null) ? "" : String.format(", '%1$s', '%2$s'", c3214i9.m9302d(), c3214i9.m9299a());
    }

    /* renamed from: a */
    private static String m9101a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? "" : jSONObject.toString();
    }
}
