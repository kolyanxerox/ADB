package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.ai */
/* loaded from: classes2.dex */
public final class C2938ai {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m7803b(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        if (strOptString.length() == 0) {
            return null;
        }
        return strOptString;
    }
}
