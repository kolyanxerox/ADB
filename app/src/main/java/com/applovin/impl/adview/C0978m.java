package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.m */
/* loaded from: classes.dex */
public final class C0978m {

    /* renamed from: a */
    private final JSONObject f324a;

    public C0978m(JSONObject jSONObject) {
        this.f324a = jSONObject;
    }

    /* renamed from: a */
    public Integer m298a() {
        String string = JsonUtils.getString(this.f324a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public WebSettings.PluginState m299b() {
        String string = JsonUtils.getString(this.f324a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* renamed from: c */
    public Boolean m300c() {
        return JsonUtils.getBoolean(this.f324a, "geolocation_enabled", null);
    }

    /* renamed from: d */
    public Boolean m301d() {
        return JsonUtils.getBoolean(this.f324a, "allow_content_access", null);
    }

    /* renamed from: e */
    public Boolean m302e() {
        return JsonUtils.getBoolean(this.f324a, "allow_file_access", null);
    }

    /* renamed from: f */
    public Boolean m303f() {
        return JsonUtils.getBoolean(this.f324a, "allow_file_access_from_file_urls", null);
    }

    /* renamed from: g */
    public Boolean m304g() {
        return JsonUtils.getBoolean(this.f324a, "allow_universal_access_from_file_urls", null);
    }

    /* renamed from: h */
    public Boolean m305h() {
        return JsonUtils.getBoolean(this.f324a, "display_zoom_controls", null);
    }

    /* renamed from: i */
    public Boolean m306i() {
        return JsonUtils.getBoolean(this.f324a, "load_with_overview_mode", null);
    }

    /* renamed from: j */
    public Boolean m307j() {
        return JsonUtils.getBoolean(this.f324a, "need_initial_focus", null);
    }

    /* renamed from: k */
    public Boolean m308k() {
        return JsonUtils.getBoolean(this.f324a, "offscreen_pre_raster", null);
    }

    /* renamed from: l */
    public Boolean m309l() {
        return JsonUtils.getBoolean(this.f324a, "save_form_data", null);
    }

    /* renamed from: m */
    public Boolean m310m() {
        return JsonUtils.getBoolean(this.f324a, "algorithmic_darkening_allowed", null);
    }

    /* renamed from: n */
    public Boolean m311n() {
        return JsonUtils.getBoolean(this.f324a, "block_network_image", null);
    }

    /* renamed from: o */
    public Boolean m312o() {
        return JsonUtils.getBoolean(this.f324a, "loads_images_automatically", null);
    }

    /* renamed from: p */
    public Boolean m313p() {
        return JsonUtils.getBoolean(this.f324a, "use_built_in_zoom_controls", null);
    }

    /* renamed from: q */
    public Boolean m314q() {
        return JsonUtils.getBoolean(this.f324a, "use_wide_view_port", null);
    }
}
