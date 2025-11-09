package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.cn */
/* loaded from: classes2.dex */
public final class C3013cn {

    /* renamed from: c */
    public static final a f7791c = new a(null);

    /* renamed from: d */
    public static final String f7792d = "revenue";

    /* renamed from: e */
    public static final String f7793e = "precision";

    /* renamed from: a */
    private final double f7794a;

    /* renamed from: b */
    private final String f7795b;

    /* renamed from: com.ironsource.cn$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final C3013cn m8187a(JSONObject json) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                kotlin.jvm.internal.OooOo.OooO0Oo(precision, "precision");
                return new C3013cn(d, precision);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                C2951av.m7843a(e);
                return null;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3013cn(double d, String precision) {
        kotlin.jvm.internal.OooOo.OooO0o0(precision, "precision");
        this.f7794a = d;
        this.f7795b = precision;
    }

    /* renamed from: a */
    public final double m8182a() {
        return this.f7794a;
    }

    /* renamed from: b */
    public final String m8184b() {
        return this.f7795b;
    }

    /* renamed from: c */
    public final String m8185c() {
        return this.f7795b;
    }

    /* renamed from: d */
    public final double m8186d() {
        return this.f7794a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3013cn)) {
            return false;
        }
        C3013cn c3013cn = (C3013cn) obj;
        return Double.compare(this.f7794a, c3013cn.f7794a) == 0 && kotlin.jvm.internal.OooOo.OooO00o(this.f7795b, c3013cn.f7795b);
    }

    public int hashCode() {
        return this.f7795b.hashCode() + (Double.hashCode(this.f7794a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadArmData(revenue=");
        sb.append(this.f7794a);
        sb.append(", precision=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f7795b, sb);
    }

    /* renamed from: a */
    public final C3013cn m8183a(double d, String precision) {
        kotlin.jvm.internal.OooOo.OooO0o0(precision, "precision");
        return new C3013cn(d, precision);
    }

    /* renamed from: a */
    public static /* synthetic */ C3013cn m8180a(C3013cn c3013cn, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = c3013cn.f7794a;
        }
        if ((i & 2) != 0) {
            str = c3013cn.f7795b;
        }
        return c3013cn.m8183a(d, str);
    }

    /* renamed from: a */
    public static final C3013cn m8181a(JSONObject jSONObject) {
        return f7791c.m8187a(jSONObject);
    }
}
