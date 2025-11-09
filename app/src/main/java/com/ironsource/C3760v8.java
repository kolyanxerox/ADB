package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.v8 */
/* loaded from: classes2.dex */
public final class C3760v8 {

    /* renamed from: a */
    private final C3611s f12311a;

    /* renamed from: b */
    private final C3611s f12312b;

    /* renamed from: c */
    private final C3688t6 f12313c;

    /* renamed from: d */
    private final C3740un f12314d;

    /* renamed from: e */
    private final C3857y3 f12315e;

    /* renamed from: f */
    private final Map<LevelPlay.AdFormat, C3611s> f12316f;

    public C3760v8(JSONObject configurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(configurations, "configurations");
        C3611s c3611s = new C3611s(m12748a(configurations, "rewarded"));
        this.f12311a = c3611s;
        C3611s c3611s2 = new C3611s(m12748a(configurations, "interstitial"));
        this.f12312b = c3611s2;
        this.f12313c = new C3688t6(m12748a(configurations, "banner"));
        this.f12314d = new C3740un(m12748a(configurations, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.f12315e = new C3857y3(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f12316f = o00O0.o0O0O00.OooOOo0(new oo00o.OooOO0(LevelPlay.AdFormat.INTERSTITIAL, c3611s2), new oo00o.OooOO0(LevelPlay.AdFormat.REWARDED, c3611s));
    }

    /* renamed from: a */
    public final Map<LevelPlay.AdFormat, C3611s> m12749a() {
        return this.f12316f;
    }

    /* renamed from: b */
    public final C3857y3 m12750b() {
        return this.f12315e;
    }

    /* renamed from: c */
    public final C3688t6 m12751c() {
        return this.f12313c;
    }

    /* renamed from: d */
    public final C3740un m12752d() {
        return this.f12314d;
    }

    /* renamed from: a */
    private final JSONObject m12748a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
    }
}
