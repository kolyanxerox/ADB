package com.ironsource;

import com.ironsource.mediationsdk.metadata.C3401a;
import org.json.JSONObject;

/* renamed from: com.ironsource.ze */
/* loaded from: classes2.dex */
public final class C3902ze implements InterfaceC3766ve {

    /* renamed from: a */
    private final JSONObject f12964a;

    /* renamed from: com.ironsource.ze$a */
    public static final class a {

        /* renamed from: b */
        public static final boolean f12966b = false;

        /* renamed from: d */
        public static final int f12968d = 24;

        /* renamed from: a */
        public static final a f12965a = new a();

        /* renamed from: c */
        private static final int f12967c = EnumC2935af.SendEvent.m7756b();

        private a() {
        }

        /* renamed from: a */
        public final int m13330a() {
            return f12967c;
        }
    }

    public C3902ze(JSONObject jSONObject) {
        this.f12964a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC3766ve
    /* renamed from: a */
    public long mo12776a() {
        return this.f12964a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.InterfaceC3766ve
    /* renamed from: b */
    public EnumC2935af mo12777b() {
        return EnumC2935af.f7494b.m7757a(this.f12964a.optInt("strategy", a.f12965a.m13330a()));
    }

    @Override // com.ironsource.InterfaceC3729uc
    /* renamed from: c */
    public boolean mo11507c() {
        return this.f12964a.optBoolean(C3401a.f9923j, false);
    }
}
