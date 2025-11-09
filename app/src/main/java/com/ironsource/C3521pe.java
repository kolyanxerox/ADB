package com.ironsource;

import android.content.Context;
import com.ironsource.C3451ne;
import com.ironsource.environment.ContextProvider;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.pe */
/* loaded from: classes2.dex */
public class C3521pe {

    /* renamed from: a */
    private static final String f10821a = "adunit_data";

    /* renamed from: a */
    private JSONObject m11382a(Context context, C3451ne.a aVar) throws JSONException {
        String strName = aVar.name();
        JSONObject jSONObjectM11148b = C3486oe.m11141b().m11148b(context);
        JSONObject jSONObjectOptJSONObject = jSONObjectM11148b.optJSONObject(f10821a);
        JSONObject jSONObjectM11384a = m11384a(jSONObjectM11148b);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONObject(strName) != null) {
            JSONObject jSONObject = jSONObjectOptJSONObject.getJSONObject(strName);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM11384a.putOpt(next, jSONObject.opt(next));
            }
        }
        return jSONObjectM11384a;
    }

    /* renamed from: a */
    private JSONObject m11383a(Context context, List<String> list) throws JSONException {
        return m11385a(m11384a(C3486oe.m11141b().m11148b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    public JSONObject m11386a(Context context, String[] strArr) throws JSONException {
        return m11385a(m11384a(C3486oe.m11141b().m11148b(context)), strArr);
    }

    /* renamed from: a */
    public JSONObject m11387a(List<String> list) throws JSONException {
        return m11383a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    /* renamed from: a */
    public JSONObject m11388a(List<String> list, C3451ne.a aVar) throws JSONException {
        return m11385a(m11382a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    private JSONObject m11384a(JSONObject jSONObject) {
        jSONObject.remove(f10821a);
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m11385a(JSONObject jSONObject, String[] strArr) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public JSONObject m11389a(String[] strArr) throws JSONException {
        return m11385a(m11384a(C3486oe.m11141b().m11148b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }
}
