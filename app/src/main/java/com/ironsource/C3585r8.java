package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.r8 */
/* loaded from: classes2.dex */
public final class C3585r8 implements InterfaceC3729uc {

    /* renamed from: a */
    private final JSONObject f11179a;

    /* renamed from: com.ironsource.r8$a */
    public static final class a {

        /* renamed from: a */
        public static final a f11180a = new a();

        /* renamed from: b */
        public static final boolean f11181b = false;

        private a() {
        }
    }

    public C3585r8(JSONObject jSONObject) {
        this.f11179a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC3729uc
    /* renamed from: c */
    public boolean mo11507c() {
        return this.f11179a.optBoolean("clickCheck", false);
    }
}
