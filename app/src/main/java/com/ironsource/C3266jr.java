package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.jr */
/* loaded from: classes2.dex */
public final class C3266jr {

    /* renamed from: a */
    private final String f9171a;

    /* renamed from: b */
    private final Integer f9172b;

    public C3266jr(JSONObject features, String nameKey, String amountKey) {
        kotlin.jvm.internal.OooOo.OooO0o0(features, "features");
        kotlin.jvm.internal.OooOo.OooO0o0(nameKey, "nameKey");
        kotlin.jvm.internal.OooOo.OooO0o0(amountKey, "amountKey");
        this.f9171a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f9172b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    /* renamed from: a */
    public final Integer m9536a() {
        return this.f9172b;
    }

    /* renamed from: b */
    public final String m9537b() {
        return this.f9171a;
    }
}
