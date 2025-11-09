package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3007ch;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.x3 */
/* loaded from: classes.dex */
public class C1285x3 {

    /* renamed from: a */
    private final String f3027a;

    /* renamed from: b */
    private final String f3028b;

    public C1285x3(JSONObject jSONObject, C1220k c1220k) {
        this.f3027a = JsonUtils.getString(jSONObject, C3007ch.f7763x, "");
        this.f3028b = JsonUtils.getString(jSONObject, "price", null);
    }

    /* renamed from: a */
    public String m3647a() {
        return this.f3027a;
    }

    /* renamed from: b */
    public String m3648b() {
        return this.f3028b;
    }
}
