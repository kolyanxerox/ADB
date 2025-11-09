package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.s */
/* loaded from: classes2.dex */
public final class C3611s {

    /* renamed from: d */
    public static final c f11239d = new c(null);

    /* renamed from: e */
    public static final String f11240e = "capping";

    /* renamed from: f */
    public static final String f11241f = "pacing";

    /* renamed from: g */
    public static final String f11242g = "delivery";

    /* renamed from: h */
    public static final String f11243h = "progressiveLoadingConfig";

    /* renamed from: i */
    public static final String f11244i = "expiredDurationInMinutes";

    /* renamed from: j */
    public static final String f11245j = "reward";

    /* renamed from: k */
    public static final String f11246k = "name";

    /* renamed from: l */
    public static final String f11247l = "amount";

    /* renamed from: m */
    public static final String f11248m = "virtualItemName";

    /* renamed from: n */
    public static final String f11249n = "virtualItemCount";

    /* renamed from: o */
    public static final long f11250o = 60;

    /* renamed from: a */
    private final Map<String, d> f11251a;

    /* renamed from: b */
    private final d f11252b;

    /* renamed from: c */
    private final Map<String, d> f11253c;

    /* renamed from: com.ironsource.s$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.Oooo000 {

        /* renamed from: a */
        public static final a f11254a = new a();

        public a() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.s$b */
    public static final class b extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.Oooo000 {

        /* renamed from: a */
        public static final b f11255a = new b();

        public b() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.s$c */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.s$d */
    public static final class d {

        /* renamed from: a */
        private final C3247j8 f11256a;

        /* renamed from: b */
        private final C3091eq f11257b;

        /* renamed from: c */
        private final C3552qa f11258c;

        /* renamed from: d */
        private final Long f11259d;

        /* renamed from: e */
        private final C3266jr f11260e;

        /* renamed from: f */
        private final C3266jr f11261f;

        /* renamed from: g */
        private final C3880yq f11262g;

        public d(JSONObject features) throws JSONException {
            C3247j8 c3247j8;
            C3091eq c3091eq;
            kotlin.jvm.internal.OooOo.OooO0o0(features, "features");
            C3880yq c3880yq = null;
            if (features.has(C3611s.f11240e)) {
                JSONObject jSONObject = features.getJSONObject(C3611s.f11240e);
                kotlin.jvm.internal.OooOo.OooO0Oo(jSONObject, "features.getJSONObject(key)");
                c3247j8 = new C3247j8(jSONObject);
            } else {
                c3247j8 = null;
            }
            this.f11256a = c3247j8;
            if (features.has(C3611s.f11241f)) {
                JSONObject jSONObject2 = features.getJSONObject(C3611s.f11241f);
                kotlin.jvm.internal.OooOo.OooO0Oo(jSONObject2, "features.getJSONObject(key)");
                c3091eq = new C3091eq(jSONObject2);
            } else {
                c3091eq = null;
            }
            this.f11257b = c3091eq;
            this.f11258c = features.has(C3611s.f11242g) ? new C3552qa(features.getBoolean(C3611s.f11242g)) : null;
            this.f11259d = features.has(C3611s.f11244i) ? Long.valueOf(features.getLong(C3611s.f11244i)) : null;
            JSONObject jSONObjectOptJSONObject = features.optJSONObject(C3611s.f11245j);
            this.f11260e = jSONObjectOptJSONObject != null ? new C3266jr(jSONObjectOptJSONObject, "name", "amount") : null;
            C3266jr c3266jr = new C3266jr(features, C3611s.f11248m, C3611s.f11249n);
            String strM9537b = c3266jr.m9537b();
            this.f11261f = (strM9537b == null || strM9537b.length() == 0 || c3266jr.m9536a() == null) ? null : c3266jr;
            if (features.has(C3611s.f11243h)) {
                JSONObject jSONObject3 = features.getJSONObject(C3611s.f11243h);
                kotlin.jvm.internal.OooOo.OooO0Oo(jSONObject3, "features.getJSONObject(key)");
                c3880yq = new C3880yq(jSONObject3);
            }
            this.f11262g = c3880yq;
        }

        /* renamed from: a */
        public final C3266jr m11788a() {
            return this.f11260e;
        }

        /* renamed from: b */
        public final C3247j8 m11789b() {
            return this.f11256a;
        }

        /* renamed from: c */
        public final C3552qa m11790c() {
            return this.f11258c;
        }

        /* renamed from: d */
        public final Long m11791d() {
            return this.f11259d;
        }

        /* renamed from: e */
        public final C3091eq m11792e() {
            return this.f11257b;
        }

        /* renamed from: f */
        public final C3266jr m11793f() {
            return this.f11261f;
        }

        /* renamed from: g */
        public final C3880yq m11794g() {
            return this.f11262g;
        }
    }

    public C3611s(JSONObject configurations) {
        kotlin.jvm.internal.OooOo.OooO0o0(configurations, "configurations");
        this.f11251a = new C3743uq(configurations).m12714a(b.f11255a);
        this.f11252b = new d(configurations);
        this.f11253c = new C3788w2(configurations).m12838a(a.f11254a);
    }

    /* renamed from: a */
    public final Map<String, d> m11783a() {
        return this.f11253c;
    }

    /* renamed from: b */
    public final d m11784b() {
        return this.f11252b;
    }

    /* renamed from: c */
    public final Map<String, d> m11785c() {
        return this.f11251a;
    }
}
