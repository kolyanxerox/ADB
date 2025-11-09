package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.e */
/* loaded from: classes2.dex */
abstract class AbstractC3059e {

    /* renamed from: a */
    private final String f8344a = "eventId";

    /* renamed from: b */
    private final String f8345b = "timestamp";

    /* renamed from: c */
    private final String f8346c = "InterstitialEvents";

    /* renamed from: d */
    private final String f8347d = "events";

    /* renamed from: e */
    private final String f8348e = "events";

    /* renamed from: f */
    JSONObject f8349f;

    /* renamed from: g */
    int f8350g;

    /* renamed from: h */
    private String f8351h;

    /* renamed from: a */
    private String m8424a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    /* renamed from: a */
    public abstract String mo8425a();

    /* renamed from: a */
    public abstract String mo8426a(ArrayList<C3899zb> arrayList, JSONObject jSONObject);

    /* renamed from: b */
    public String m8430b() {
        return TextUtils.isEmpty(this.f8351h) ? mo8425a() : this.f8351h;
    }

    /* renamed from: c */
    public abstract String mo8431c();

    /* renamed from: a */
    public String m8427a(JSONArray jSONArray) throws JSONException {
        try {
            if (this.f8349f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f8349f.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimestamp());
            jSONObject.put(m8424a(this.f8350g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return "";
        }
    }

    /* renamed from: a */
    public JSONObject m8428a(C3899zb c3899zb) throws JSONException {
        try {
            String strM13318a = c3899zb.m13318a();
            JSONObject jSONObject = !TextUtils.isEmpty(strM13318a) ? new JSONObject(strM13318a) : new JSONObject();
            jSONObject.put("eventId", c3899zb.m13323c());
            jSONObject.put("timestamp", c3899zb.m13324d());
            return jSONObject;
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public void m8429a(String str) {
        this.f8351h = str;
    }
}
