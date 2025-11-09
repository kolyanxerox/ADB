package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.f1 */
/* loaded from: classes.dex */
public class C1022f1 {

    /* renamed from: a */
    private final JSONObject f739a;

    public C1022f1(JSONObject jSONObject) {
        this.f739a = jSONObject;
    }

    /* renamed from: a */
    public Integer m713a() {
        return JsonUtils.getInteger(this.f739a, "dark_mode_toolbar_color", null);
    }

    /* renamed from: b */
    public String m714b() {
        return JsonUtils.getString(this.f739a, "digital_asset_link_url", null);
    }

    /* renamed from: c */
    public Boolean m715c() {
        return JsonUtils.getBoolean(this.f739a, "instant_apps_enabled", null);
    }

    /* renamed from: d */
    public String m716d() {
        return JsonUtils.getString(this.f739a, "referrer", null);
    }

    /* renamed from: e */
    public Integer m717e() {
        return JsonUtils.getInteger(this.f739a, "session_url_relation", null);
    }

    /* renamed from: f */
    public Integer m718f() {
        return JsonUtils.getInteger(this.f739a, "share_state", null);
    }

    /* renamed from: g */
    public Boolean m719g() {
        return JsonUtils.getBoolean(this.f739a, "should_show_title", null);
    }

    /* renamed from: h */
    public Integer m720h() {
        return JsonUtils.getInteger(this.f739a, "toolbar_color", null);
    }

    /* renamed from: i */
    public Boolean m721i() {
        return JsonUtils.getBoolean(this.f739a, "url_bar_hiding_enabled", null);
    }
}
