package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC1300z0 {
    /* renamed from: a */
    public static List m3819a(C1220k c1220k) {
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("ConsentFlowStateProvider", "Generating consent flow states...");
        }
        String strM1167a = AbstractC1078k7.m1167a(C1333R.raw.applovin_consent_flow_unified_cmp, C1220k.m2824o(), c1220k);
        if (TextUtils.isEmpty(strM1167a)) {
            throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strM1167a, null);
        if (jSONObjectJsonObjectFromJsonString == null) {
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("states", jSONObjectJsonObjectFromJsonString);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            arrayList.add(C1255u0.m3380a(JsonUtils.getJSONObject(jSONArrayOooOOoo, i, new JSONObject()), c1220k));
        }
        return arrayList;
    }
}
