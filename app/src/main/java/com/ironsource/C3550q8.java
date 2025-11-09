package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.q8 */
/* loaded from: classes2.dex */
public final class C3550q8 implements InterfaceC3729uc {

    /* renamed from: a */
    private final JSONObject f10891a;

    /* renamed from: com.ironsource.q8$a */
    public static final class a {

        /* renamed from: a */
        public static final a f10892a = new a();

        /* renamed from: b */
        public static final boolean f10893b = false;

        /* renamed from: c */
        public static final String f10894c = "curlError";

        private a() {
        }
    }

    public C3550q8(JSONObject jSONObject) {
        this.f10891a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC3729uc
    /* renamed from: c */
    public boolean mo11507c() {
        return this.f10891a.optBoolean("enabled", false);
    }

    /* renamed from: d */
    public final boolean m11508d() {
        return this.f10891a.optBoolean("closeActivity", true);
    }

    /* renamed from: e */
    public final boolean m11509e() {
        return this.f10891a.optBoolean("reportController", true);
    }
}
