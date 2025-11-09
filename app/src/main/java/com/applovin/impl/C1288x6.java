package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3007ch;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.x6 */
/* loaded from: classes.dex */
public class C1288x6 {

    /* renamed from: a */
    private final a f3075a;

    /* renamed from: b */
    private final Integer f3076b;

    /* renamed from: c */
    private final String f3077c;

    /* renamed from: d */
    private final String f3078d;

    /* renamed from: e */
    private Boolean f3079e;

    /* renamed from: com.applovin.impl.x6$a */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* renamed from: b */
        public static a m3660b(int i) {
            return i != 0 ? i != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public C1288x6(JSONObject jSONObject, String str) {
        this.f3078d = str;
        this.f3075a = a.m3660b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f3076b = JsonUtils.getInteger(jSONObject, C3007ch.f7763x, null);
        this.f3077c = JsonUtils.getString(jSONObject, "name", null);
    }

    /* renamed from: a */
    public void m3652a(Boolean bool) {
        this.f3079e = bool;
    }

    /* renamed from: b */
    public String m3653b() {
        return this.f3078d;
    }

    /* renamed from: c */
    public String m3654c() {
        return this.f3077c;
    }

    /* renamed from: d */
    public Integer m3655d() {
        return this.f3076b;
    }

    /* renamed from: e */
    public String m3656e() {
        Boolean bool = this.f3079e;
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder("\n"), this.f3078d, " - ", bool != null ? String.valueOf(bool) : AbstractC1150p0.m2046b().m2051a(C1220k.m2824o()));
    }

    /* renamed from: f */
    public a m3657f() {
        return this.f3075a;
    }

    /* renamed from: a */
    public Boolean m3651a() {
        return this.f3079e;
    }
}
