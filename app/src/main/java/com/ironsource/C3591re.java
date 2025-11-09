package com.ironsource;

import android.content.Context;
import com.ironsource.C3451ne;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.re */
/* loaded from: classes2.dex */
public class C3591re {

    /* renamed from: a */
    private static final String f11186a = "adunit_data";

    /* renamed from: a */
    public void m11712a(Context context) {
        C3486oe.m11141b().m11151c(context);
    }

    /* renamed from: a */
    public void m11713a(String str, C3451ne.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            C3486oe c3486oeM11141b = C3486oe.m11141b();
            JSONObject jSONObjectOptJSONObject2 = c3486oeM11141b.m11148b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f11186a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            c3486oeM11141b.m11150b(f11186a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: a */
    public void m11714a(String str, Object obj) {
        C3486oe.m11141b().m11150b(str, obj);
    }

    /* renamed from: a */
    public void m11715a(String str, Object obj, C3451ne.a aVar) throws JSONException {
        JSONObject jSONObjectPut;
        try {
            String strName = aVar.name();
            C3486oe c3486oeM11141b = C3486oe.m11141b();
            JSONObject jSONObjectOptJSONObject = c3486oeM11141b.m11148b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f11186a);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectPut = new JSONObject().put(strName, new JSONObject().put(str, obj));
            } else {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
                jSONObjectPut = jSONObjectOptJSONObject2 == null ? jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)) : jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj));
            }
            c3486oeM11141b.m11150b(f11186a, jSONObjectPut);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: a */
    public void m11716a(String str, JSONArray jSONArray) {
        C3486oe.m11141b().m11145a(str, jSONArray);
    }

    /* renamed from: a */
    public void m11717a(String str, JSONObject jSONObject) throws JSONException {
        C3486oe.m11141b().m11146a(str, jSONObject);
    }

    /* renamed from: a */
    public void m11718a(Map<String, Object> map) {
        C3486oe.m11141b().m11147a(map);
    }
}
