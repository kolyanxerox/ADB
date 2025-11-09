package com.ironsource.adqualitysdk.sdk.p009i;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cw */
/* loaded from: classes2.dex */
public final class C2719cw extends C2722cz {
    /* renamed from: ﻐ */
    public static Object m6404(C2712cp c2712cp, List<Object> list) {
        c2712cp.m6301((JSONObject) C2722cz.m6459(list, 0, JSONObject.class));
        return null;
    }

    /* renamed from: ﾇ */
    public static JSONObject m6405(List<Object> list) {
        return C2915kc.m7430((JSONObject) C2722cz.m6459(list, 0, JSONObject.class), list.size() > 1 ? ((Boolean) C2722cz.m6459(list, 1, Boolean.class)).booleanValue() : true);
    }

    /* renamed from: ﾒ */
    public static Object m6406(List<Object> list) throws JSONException {
        C2915kc.m7445((JSONObject) C2722cz.m6459(list, 0, JSONObject.class), (JSONObject) C2722cz.m6459(list, 1, JSONObject.class), list.size() > 2 ? ((Boolean) C2722cz.m6459(list, 2, Boolean.class)).booleanValue() : true);
        return null;
    }

    /* renamed from: ﾒ */
    public static JSONObject m6407(C2712cp c2712cp) {
        return c2712cp.m6298();
    }
}
