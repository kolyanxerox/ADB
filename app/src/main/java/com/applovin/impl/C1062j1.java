package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.j1 */
/* loaded from: classes.dex */
public class C1062j1 {

    /* renamed from: a */
    private final String f923a;

    /* renamed from: b */
    private final String f924b;

    /* renamed from: c */
    private final boolean f925c;

    public C1062j1(JSONObject jSONObject, C1220k c1220k) {
        this.f923a = JsonUtils.getString(jSONObject, "name", "");
        this.f924b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f925c = AbstractC1078k7.m1206a(list);
        } else {
            this.f925c = AbstractC1078k7.m1203a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    /* renamed from: a */
    public String m1033a() {
        return this.f924b;
    }

    /* renamed from: b */
    public String m1034b() {
        return this.f923a;
    }

    /* renamed from: c */
    public boolean m1035c() {
        return this.f925c;
    }

    /* renamed from: a */
    public static boolean m1032a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || AbstractC1078k7.m1158a(str2, str) != 1) {
            return str3 == null || AbstractC1078k7.m1158a(str3, str) != -1;
        }
        return false;
    }
}
