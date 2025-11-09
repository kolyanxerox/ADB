package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.h8 */
/* loaded from: classes.dex */
public class C1049h8 {

    /* renamed from: a */
    private final String f855a;

    /* renamed from: b */
    private final String f856b;

    /* renamed from: c */
    private final List f857c;

    public C1049h8(JSONObject jSONObject) {
        this.f855a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f856b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f857c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    /* renamed from: a */
    public String m955a() {
        return this.f855a;
    }

    /* renamed from: b */
    public String m956b() {
        return this.f856b;
    }

    /* renamed from: c */
    public List m957c() {
        return this.f857c;
    }
}
