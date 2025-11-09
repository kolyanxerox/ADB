package com.ironsource;

import com.ironsource.C3034d9;
import com.ironsource.InterfaceC3291kh;
import org.json.JSONObject;

/* renamed from: com.ironsource.lh */
/* loaded from: classes2.dex */
public final class C3326lh implements InterfaceC3291kh, InterfaceC3291kh.a {

    /* renamed from: a */
    private JSONObject f9367a = new JSONObject();

    /* renamed from: b */
    private JSONObject f9368b = new JSONObject();

    /* renamed from: c */
    private JSONObject f9369c = new JSONObject();

    /* renamed from: e */
    private final Object m9785e(String str) {
        JSONObject jSONObject;
        if (this.f9369c.has(str)) {
            jSONObject = this.f9369c;
        } else if (this.f9368b.has(str)) {
            jSONObject = this.f9368b;
        } else {
            if (!this.f9367a.has(str)) {
                return null;
            }
            jSONObject = this.f9367a;
        }
        return jSONObject.get(str);
    }

    @Override // com.ironsource.InterfaceC3291kh
    /* renamed from: a */
    public JSONObject mo9671a(String configKey) {
        kotlin.jvm.internal.OooOo.OooO0o0(configKey, "configKey");
        Object objM9785e = m9785e(configKey);
        if (objM9785e instanceof JSONObject) {
            return (JSONObject) objM9785e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3291kh
    /* renamed from: b */
    public Integer mo9672b(String configKey) {
        kotlin.jvm.internal.OooOo.OooO0o0(configKey, "configKey");
        Object objM9785e = m9785e(configKey);
        if (objM9785e instanceof Integer) {
            return (Integer) objM9785e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3291kh
    /* renamed from: c */
    public Boolean mo9673c(String configKey) {
        kotlin.jvm.internal.OooOo.OooO0o0(configKey, "configKey");
        Object objM9785e = m9785e(configKey);
        if (objM9785e instanceof Boolean) {
            return (Boolean) objM9785e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3291kh
    /* renamed from: d */
    public String mo9674d(String configKey) {
        kotlin.jvm.internal.OooOo.OooO0o0(configKey, "configKey");
        Object objM9785e = m9785e(configKey);
        if (objM9785e instanceof String) {
            return (String) objM9785e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3291kh.a
    /* renamed from: a */
    public void mo9675a(JSONObject controllerConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(controllerConfig, "controllerConfig");
        this.f9367a = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(C3034d9.a.f7915b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.f9368b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f9367a.optJSONObject(C3034d9.a.f7916c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.f9369c = jSONObjectOptJSONObject2;
    }
}
