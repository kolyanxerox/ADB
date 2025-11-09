package com.ironsource;

import com.ironsource.mediationsdk.C3395l;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.t6 */
/* loaded from: classes2.dex */
public final class C3688t6 {

    /* renamed from: a */
    private final b f12025a;

    /* renamed from: b */
    private final Map<String, b> f12026b;

    /* renamed from: com.ironsource.t6$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.Oooo000 {

        /* renamed from: a */
        public static final a f12027a = new a();

        public a() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject it) {
            kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
            return new b(it);
        }
    }

    /* renamed from: com.ironsource.t6$b */
    public static final class b {

        /* renamed from: a */
        private final Boolean f12028a;

        /* renamed from: b */
        private final JSONObject f12029b;

        /* renamed from: c */
        private final int f12030c;

        /* renamed from: d */
        private final boolean f12031d;

        /* renamed from: e */
        private final float f12032e;

        /* renamed from: f */
        private final List<String> f12033f;

        public b(JSONObject features) {
            kotlin.jvm.internal.OooOo.OooO0o0(features, "features");
            JSONObject jSONObject = features.has("isLoadWhileShow") ? features : null;
            Boolean boolValueOf = jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("isLoadWhileShow")) : null;
            this.f12028a = boolValueOf;
            JSONObject jSONObject2 = features.has(C3758v6.f12300c) ? features : null;
            JSONObject jSONObjectOptJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(C3758v6.f12300c) : null;
            this.f12029b = jSONObjectOptJSONObject;
            Boolean bool = Boolean.TRUE;
            int iOptInt = 25;
            boolean zOptBoolean = true;
            if (!kotlin.jvm.internal.OooOo.OooO00o(boolValueOf, bool)) {
                iOptInt = features.optInt(C3758v6.f12298a, 25);
            } else if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("enabled")) {
                int iOptInt2 = jSONObjectOptJSONObject.optInt(C3758v6.f12301d, 25000);
                iOptInt = iOptInt2 == 0 ? 0 : iOptInt2 / 1000;
            }
            this.f12030c = iOptInt;
            if (!kotlin.jvm.internal.OooOo.OooO00o(boolValueOf, bool)) {
                zOptBoolean = features.optBoolean(C3758v6.f12298a, true);
            } else if (jSONObjectOptJSONObject != null) {
                zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
            }
            this.f12031d = zOptBoolean;
            this.f12032e = features.has(C3758v6.f12304g) ? features.optInt(C3758v6.f12304g) / 100.0f : 0.15f;
            List<String> listM12451b = features.has(C3758v6.f12305h) ? C3702tk.m12451b(features.getJSONArray(C3758v6.f12305h)) : o00O0.OooOo.OooOOo(C3395l.f9866a, C3395l.f9869d);
            kotlin.jvm.internal.OooOo.OooO0Oo(listM12451b, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f12033f = listM12451b;
        }

        /* renamed from: a */
        public final List<String> m12396a() {
            return this.f12033f;
        }

        /* renamed from: b */
        public final int m12397b() {
            return this.f12030c;
        }

        /* renamed from: c */
        public final float m12398c() {
            return this.f12032e;
        }

        /* renamed from: d */
        public final boolean m12399d() {
            return this.f12031d;
        }

        /* renamed from: e */
        public final Boolean m12400e() {
            return this.f12028a;
        }
    }

    public C3688t6(JSONObject bannerConfigurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(bannerConfigurations, "bannerConfigurations");
        this.f12025a = new b(bannerConfigurations);
        this.f12026b = new C3788w2(bannerConfigurations).m12838a(a.f12027a);
    }

    /* renamed from: a */
    public final Map<String, b> m12393a() {
        return this.f12026b;
    }

    /* renamed from: b */
    public final b m12394b() {
        return this.f12025a;
    }
}
