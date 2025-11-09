package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.j8 */
/* loaded from: classes2.dex */
public final class C3247j8 {

    /* renamed from: a */
    private final Boolean f9091a;

    /* renamed from: b */
    private final Integer f9092b;

    /* renamed from: c */
    private final EnumC3480o8 f9093c;

    public C3247j8(JSONObject features) {
        kotlin.jvm.internal.OooOo.OooO0o0(features, "features");
        this.f9091a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f9092b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f9093c = features.has("unit") ? EnumC3480o8.f10632c.m11126a(features.optString("unit")) : null;
    }

    /* renamed from: a */
    public final Boolean m9463a() {
        return this.f9091a;
    }

    /* renamed from: b */
    public final Integer m9464b() {
        return this.f9092b;
    }

    /* renamed from: c */
    public final EnumC3480o8 m9465c() {
        return this.f9093c;
    }
}
