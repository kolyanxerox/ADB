package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.y3 */
/* loaded from: classes2.dex */
public final class C3857y3 {

    /* renamed from: a */
    private final C3228in f12705a;

    /* renamed from: b */
    private final boolean f12706b;

    /* renamed from: c */
    private final C2994c4 f12707c;

    /* renamed from: d */
    private final C3243j4 f12708d;

    /* renamed from: e */
    private final C3789w3 f12709e;

    public C3857y3(JSONObject applicationConfigurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationConfigurations, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(C2630a4.f3886a);
        this.f12705a = new C3228in(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f12706b = applicationConfigurations.optBoolean(C2630a4.f3892g, false);
        JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject(C2630a4.f3893h);
        this.f12707c = new C2994c4(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.f12708d = new C3243j4(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject(C2630a4.f3891f);
        this.f12709e = new C3789w3(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    /* renamed from: a */
    public final C3789w3 m13151a() {
        return this.f12709e;
    }

    /* renamed from: b */
    public final C2994c4 m13152b() {
        return this.f12707c;
    }

    /* renamed from: c */
    public final C3243j4 m13153c() {
        return this.f12708d;
    }

    /* renamed from: d */
    public final boolean m13154d() {
        return this.f12706b;
    }

    /* renamed from: e */
    public final C3228in m13155e() {
        return this.f12705a;
    }
}
