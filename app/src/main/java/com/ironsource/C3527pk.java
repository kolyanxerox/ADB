package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3034d9;
import com.ironsource.C3419mh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.pk */
/* loaded from: classes2.dex */
public class C3527pk {

    /* renamed from: b */
    private static final String f10831b = "pk";

    /* renamed from: c */
    private static final String f10832c = "supersonic_shared_preferen";

    /* renamed from: d */
    private static final String f10833d = "version";

    /* renamed from: e */
    private static final String f10834e = "back_button_state";

    /* renamed from: f */
    private static final String f10835f = "search_keys";

    /* renamed from: g */
    private static final String f10836g = "^\\d+_\\d+$";

    /* renamed from: h */
    private static C3527pk f10837h;

    /* renamed from: a */
    private SharedPreferences f10838a;

    private C3527pk(Context context) {
        this.f10838a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* renamed from: a */
    public static synchronized C3527pk m11415a(Context context) {
        try {
            if (f10837h == null) {
                f10837h = new C3527pk(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10837h;
    }

    /* renamed from: e */
    public static synchronized C3527pk m11417e() {
        return f10837h;
    }

    /* renamed from: b */
    public C3419mh.a m11422b() throws NumberFormatException {
        int i = Integer.parseInt(this.f10838a.getString(f10834e, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION));
        return i == 0 ? C3419mh.a.None : i == 1 ? C3419mh.a.Device : i == 2 ? C3419mh.a.Controller : C3419mh.a.Controller;
    }

    /* renamed from: c */
    public String m11423c() {
        return this.f10838a.getString("version", C3824x4.f12571f);
    }

    /* renamed from: d */
    public List<String> m11425d() {
        String string = this.f10838a.getString(f10835f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C3233is c3233is = new C3233is(string);
            if (c3233is.m9389a(C3034d9.h.f8085R)) {
                try {
                    arrayList.addAll(c3233is.m9386a((JSONArray) c3233is.m9390b(C3034d9.h.f8085R)));
                    return arrayList;
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private boolean m11416b(String str) {
        return str.matches(f10836g);
    }

    /* renamed from: a */
    public String m11418a(String str) {
        String string = this.f10838a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    /* renamed from: c */
    public void m11424c(String str) {
        SharedPreferences.Editor editorEdit = this.f10838a.edit();
        editorEdit.putString(f10834e, str);
        editorEdit.apply();
    }

    /* renamed from: d */
    public void m11426d(String str) {
        if (m11423c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f10838a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    /* renamed from: e */
    public void m11427e(String str) {
        SharedPreferences.Editor editorEdit = this.f10838a.edit();
        editorEdit.putString(f10835f, str);
        editorEdit.apply();
    }

    /* renamed from: a */
    public ArrayList<String> m11419a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f10838a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f10838a.edit();
        for (String str : strArr) {
            if (m11416b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }

    /* renamed from: a */
    public void m11420a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f10838a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    /* renamed from: a */
    public boolean m11421a(String str, String str2, String str3) throws JSONException {
        String string = this.f10838a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f10838a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
