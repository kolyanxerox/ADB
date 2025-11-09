package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.eq */
/* loaded from: classes2.dex */
public final class C3091eq {

    /* renamed from: a */
    private final Boolean f8455a;

    /* renamed from: b */
    private final Integer f8456b;

    /* renamed from: c */
    private final EnumC3480o8 f8457c;

    public C3091eq(JSONObject features) {
        kotlin.jvm.internal.OooOo.OooO0o0(features, "features");
        this.f8455a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f8456b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f8457c = EnumC3480o8.Second;
    }

    /* renamed from: a */
    public final Boolean m8538a() {
        return this.f8455a;
    }

    /* renamed from: b */
    public final Integer m8539b() {
        return this.f8456b;
    }

    /* renamed from: c */
    public final EnumC3480o8 m8540c() {
        return this.f8457c;
    }
}
