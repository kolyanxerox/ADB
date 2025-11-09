package o000Oooo;

import com.google.android.gms.internal.ads.y91;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o000000 {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final Date f30592OooO0oo = new Date(0);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final JSONObject f30593OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f30594OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Date f30595OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final JSONArray f30596OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f30597OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final JSONObject f30598OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final JSONArray f30599OooO0oO;

    public o000000(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f30594OooO0O0 = jSONObject;
        this.f30595OooO0OO = date;
        this.f30596OooO0Oo = jSONArray;
        this.f30598OooO0o0 = jSONObject2;
        this.f30597OooO0o = j;
        this.f30599OooO0oO = jSONArray2;
        this.f30593OooO00o = jSONObject3;
    }

    public static o000000 OooO00o(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new o000000(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static y91 OooO0OO() {
        y91 y91Var = new y91();
        y91Var.f25875OooO0O0 = new JSONObject();
        y91Var.f25876OooO0OO = f30592OooO0oo;
        y91Var.f25877OooO0Oo = new JSONArray();
        y91Var.f25879OooO0o0 = new JSONObject();
        y91Var.f25874OooO00o = 0L;
        y91Var.f25878OooO0o = new JSONArray();
        return y91Var;
    }

    public final HashMap OooO0O0() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f30599OooO0oO;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000000) {
            return this.f30593OooO00o.toString().equals(((o000000) obj).f30593OooO00o.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f30593OooO00o.hashCode();
    }

    public final String toString() {
        return this.f30593OooO00o.toString();
    }
}
