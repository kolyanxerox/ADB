package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3007ch;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.u0 */
/* loaded from: classes.dex */
public class C1255u0 {

    /* renamed from: a */
    protected final C1220k f2417a;

    /* renamed from: b */
    protected final JSONObject f2418b;

    /* renamed from: com.applovin.impl.u0$a */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* renamed from: a */
        private final int f2424a;

        a(int i) {
            this.f2424a = i;
        }

        /* renamed from: b */
        public int m3388b() {
            return this.f2424a;
        }
    }

    /* renamed from: com.applovin.impl.u0$b */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public C1255u0(JSONObject jSONObject, C1220k c1220k) {
        this.f2417a = c1220k;
        this.f2418b = jSONObject;
    }

    /* renamed from: a */
    public static C1255u0 m3380a(JSONObject jSONObject, C1220k c1220k) {
        b bVarM3381c = m3381c(JsonUtils.getString(jSONObject, "type", null));
        return bVarM3381c == b.ALERT ? new C1264v0(jSONObject, c1220k) : bVarM3381c == b.EVENT ? new C1282x0(jSONObject, c1220k) : new C1255u0(jSONObject, c1220k);
    }

    /* renamed from: b */
    public int m3384b() {
        return JsonUtils.getInt(this.f2418b, C3007ch.f7763x, -1);
    }

    /* renamed from: c */
    public b m3386c() {
        return m3381c(JsonUtils.getString(this.f2418b, "type", null));
    }

    public String toString() {
        return "ConsentFlowState{id=" + m3384b() + ", type=" + m3386c() + "}";
    }

    /* renamed from: c */
    private static b m3381c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("Invalid type provided: ", str));
    }

    /* renamed from: b */
    public String m3385b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f2418b, str, (JSONObject) null);
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("replacements", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayOooOOoo, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f2417a.m2827B().m2988K().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(C1220k.m2798a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return C1220k.m2799a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    /* renamed from: a */
    public a m3383a() {
        return m3379a(JsonUtils.getString(this.f2418b, "decision_type", null));
    }

    /* renamed from: a */
    public int m3382a(Boolean bool) {
        int i = JsonUtils.getInt(this.f2418b, "destination_state_id", -1);
        if (i > 0) {
            return i;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f2418b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f2418b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException(OooO0oO.OooOo.OooO0o(i, "Decision needed for state: "));
    }

    /* renamed from: a */
    private static a m3379a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
