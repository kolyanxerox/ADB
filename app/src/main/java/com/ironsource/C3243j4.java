package com.ironsource;

import com.ironsource.C3034d9;
import org.json.JSONObject;

/* renamed from: com.ironsource.j4 */
/* loaded from: classes2.dex */
public final class C3243j4 {

    /* renamed from: a */
    private final JSONObject f9057a;

    /* renamed from: b */
    private final boolean f9058b;

    /* renamed from: c */
    private final String f9059c;

    /* renamed from: d */
    private final boolean f9060d;

    /* renamed from: e */
    private final boolean f9061e;

    /* renamed from: f */
    private final int f9062f;

    /* renamed from: g */
    private final boolean f9063g;

    /* renamed from: h */
    private final boolean f9064h;

    /* renamed from: i */
    private final int f9065i;

    /* renamed from: j */
    private final boolean f9066j;

    /* renamed from: k */
    private final boolean f9067k;

    /* renamed from: l */
    private final JSONObject f9068l;

    public C3243j4(JSONObject config) {
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        this.f9057a = config;
        this.f9058b = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", C3554qc.f10924j);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f9059c = strOptString;
        this.f9060d = config.optBoolean(C3451ne.f10462b1, true);
        this.f9061e = config.optBoolean("radvid", false);
        this.f9062f = config.optInt("uaeh", 0);
        this.f9063g = config.optBoolean("sharedThreadPool", false);
        this.f9064h = config.optBoolean("sharedThreadPoolADP", true);
        this.f9065i = config.optInt(C3451ne.f10440R0, -1);
        this.f9066j = config.optBoolean("axal", false);
        this.f9067k = config.optBoolean("psrt", false);
        this.f9068l = config.optJSONObject(C3034d9.a.f7916c);
    }

    /* renamed from: a */
    public static /* synthetic */ C3243j4 m9416a(C3243j4 c3243j4, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = c3243j4.f9057a;
        }
        return c3243j4.m9418a(jSONObject);
    }

    /* renamed from: b */
    public final int m9419b() {
        return this.f9065i;
    }

    /* renamed from: c */
    public final JSONObject m9420c() {
        return this.f9068l;
    }

    /* renamed from: d */
    public final String m9421d() {
        return this.f9059c;
    }

    /* renamed from: e */
    public final boolean m9422e() {
        return this.f9067k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3243j4) && kotlin.jvm.internal.OooOo.OooO00o(this.f9057a, ((C3243j4) obj).f9057a);
    }

    /* renamed from: f */
    public final boolean m9423f() {
        return this.f9061e;
    }

    /* renamed from: g */
    public final boolean m9424g() {
        return this.f9060d;
    }

    /* renamed from: h */
    public final boolean m9425h() {
        return this.f9063g;
    }

    public int hashCode() {
        return this.f9057a.hashCode();
    }

    /* renamed from: i */
    public final boolean m9426i() {
        return this.f9064h;
    }

    /* renamed from: j */
    public final int m9427j() {
        return this.f9062f;
    }

    /* renamed from: k */
    public final boolean m9428k() {
        return this.f9066j;
    }

    /* renamed from: l */
    public final boolean m9429l() {
        return this.f9058b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f9057a + ')';
    }

    /* renamed from: a */
    public final C3243j4 m9418a(JSONObject config) {
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        return new C3243j4(config);
    }

    /* renamed from: a */
    private final JSONObject m9417a() {
        return this.f9057a;
    }
}
