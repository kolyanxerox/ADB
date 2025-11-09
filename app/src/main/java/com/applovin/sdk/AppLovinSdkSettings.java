package com.applovin.sdk;

import OooO0oO.OooOo;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1246t0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1221l;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a */
    private boolean f3349a;

    /* renamed from: b */
    private boolean f3350b;

    /* renamed from: e */
    private String f3353e;

    /* renamed from: f */
    private String f3354f;

    /* renamed from: g */
    private String f3355g;

    /* renamed from: j */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f3358j;

    /* renamed from: k */
    private C1220k f3359k;

    /* renamed from: l */
    private String f3360l;

    /* renamed from: d */
    private boolean f3352d = true;
    private final Map<String, Object> localSettings = new HashMap();

    /* renamed from: h */
    private final Map f3356h = Collections.synchronizedMap(new HashMap());

    /* renamed from: i */
    private final Map f3357i = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private boolean f3351c = true;

    public AppLovinSdkSettings(Context context) {
        this.f3360l = "";
        if (context == null) {
            C1240o.m3207h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextM1237e = AbstractC1078k7.m1237e(context);
        this.f3349a = AbstractC1078k7.m1255m(contextM1237e);
        this.f3358j = C1246t0.m3267a(contextM1237e);
        this.f3360l = contextM1237e.getPackageName();
        m3946a(contextM1237e);
    }

    /* renamed from: a */
    private void m3946a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strM1167a = AbstractC1078k7.m1167a(identifier, context, (C1220k) null);
        this.f3356h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strM1167a) ? JsonUtils.jsonObjectFromJsonString(strM1167a, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(C1220k c1220k) {
        this.f3359k = c1220k;
        if (StringUtils.isValidString(this.f3353e)) {
            c1220k.m2922t0().m490a(Arrays.asList(this.f3353e.split(",")));
            this.f3353e = null;
        }
        if (this.f3354f != null) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Setting user id: "), this.f3354f, c1220k.m2847O(), "AppLovinSdkSettings");
            }
            c1220k.m2930x0().m1102a(this.f3354f);
            this.f3354f = null;
        }
        if (StringUtils.isValidString(this.f3355g)) {
            C1221l.m2957a(this.f3355g, c1220k);
            this.f3355g = null;
        }
        for (Map.Entry entry : this.f3357i.entrySet()) {
            c1220k.m2928w0().m572a(C0993c2.f521j, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + ((String) entry.getValue())));
        }
        this.f3357i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f3356h) {
            map = CollectionUtils.map(this.f3356h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f3358j;
    }

    public String getUserIdentifier() {
        C1220k c1220k = this.f3359k;
        return c1220k == null ? this.f3354f : c1220k.m2930x0().m1108e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f3351c;
    }

    public boolean isMuted() {
        return this.f3350b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f3349a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        C1240o.m3205e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        if (this.f3351c == z) {
            return;
        }
        this.f3351c = z;
        C1220k c1220k = this.f3359k;
        if (c1220k == null) {
            return;
        }
        if (z) {
            c1220k.m2933z().m554l();
        } else {
            c1220k.m2933z().m553k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        C1240o.m3205e("AppLovinSdkSettings", OooOo.OooOO0o("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            C1240o.m3207h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f3359k == null) {
                this.f3353e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f3359k.m2922t0().m490a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f3359k.m2922t0().m489a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f3360l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            C1240o.m3199a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            C1220k c1220k = this.f3359k;
            if (c1220k != null) {
                C1221l.m2957a(strTrim, c1220k);
            } else {
                this.f3355g = strTrim;
            }
        }
        if (this.f3359k != null) {
            this.f3359k.m2928w0().m572a(C0993c2.f521j, "postInitExtraParameter", CollectionUtils.hashMap("details", str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2));
        } else {
            this.f3357i.put(str, strTrim);
        }
        this.f3356h.put(str, strTrim);
    }

    public void setMuted(boolean z) {
        C1240o.m3205e("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.f3350b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        C1240o.m3205e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.f3352d = z;
    }

    public void setUserIdentifier(String str) {
        C1240o.m3205e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > AbstractC1078k7.m1230d(8)) {
            C1240o.m3207h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + AbstractC1078k7.m1230d(8) + " maximum)");
        }
        C1220k c1220k = this.f3359k;
        if (c1220k == null) {
            this.f3354f = str;
            return;
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Setting user id: ", str, this.f3359k.m2847O(), "AppLovinSdkSettings");
        }
        this.f3359k.m2930x0().m1102a(str);
    }

    public void setVerboseLogging(boolean z) {
        C1240o.m3205e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (!AbstractC1078k7.m1252k()) {
            this.f3349a = z;
            return;
        }
        C1240o.m3207h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (AbstractC1078k7.m1255m(null) != z) {
            C1240o.m3207h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f3352d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb.append(this.f3349a);
        sb.append(", muted=");
        sb.append(this.f3350b);
        sb.append(", creativeDebuggerEnabled=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f3351c, '}');
    }
}
