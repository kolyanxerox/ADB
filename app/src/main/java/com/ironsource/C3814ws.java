package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.ws */
/* loaded from: classes2.dex */
public final class C3814ws {

    /* renamed from: a */
    private final C3571qt f12530a;

    /* renamed from: b */
    private final C2982br f12531b;

    /* renamed from: c */
    private final C3052dr f12532c;

    /* renamed from: d */
    private final C3760v8 f12533d;

    /* renamed from: e */
    private final C3449nc f12534e;

    public C3814ws(C3571qt fullResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(fullResponse, "fullResponse");
        this.f12530a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.m11640i().optJSONObject(C3848xs.f12667a);
        this.f12531b = new C2982br(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.m11640i().optJSONObject(C3848xs.f12668b);
        this.f12532c = new C3052dr(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.m11640i().optJSONObject("configurations");
        this.f12533d = new C3760v8(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.m11640i().optJSONObject(C3848xs.f12670d);
        this.f12534e = new C3449nc(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    /* renamed from: a */
    public final C3760v8 m12964a() {
        return this.f12533d;
    }

    /* renamed from: b */
    public final C3449nc m12965b() {
        return this.f12534e;
    }

    /* renamed from: c */
    public final C3571qt m12966c() {
        return this.f12530a;
    }

    /* renamed from: d */
    public final C2982br m12967d() {
        return this.f12531b;
    }

    /* renamed from: e */
    public final C3052dr m12968e() {
        return this.f12532c;
    }
}
