package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.nc */
/* loaded from: classes2.dex */
public final class C3449nc {

    /* renamed from: a */
    private final JSONObject f10396a;

    public C3449nc(JSONObject jSONObject) {
        this.f10396a = jSONObject;
    }

    /* renamed from: a */
    public final Boolean m10984a(String key) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        JSONObject jSONObject = this.f10396a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    /* renamed from: b */
    public final Integer m10985b(String key) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        JSONObject jSONObject = this.f10396a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    /* renamed from: c */
    public final String m10986c(String key) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        JSONObject jSONObject = this.f10396a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }
}
