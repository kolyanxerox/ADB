package com.ironsource;

import com.ironsource.C3034d9;
import org.json.JSONObject;

/* renamed from: com.ironsource.vu */
/* loaded from: classes2.dex */
public class C3782vu {

    /* renamed from: a */
    private final JSONObject f12422a;

    public C3782vu(JSONObject jSONObject) {
        this.f12422a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public boolean m12820a() {
        return this.f12422a.optBoolean("uxt", false);
    }

    /* renamed from: b */
    public boolean m12821b() {
        return this.f12422a.optBoolean(C3034d9.a.f7928o, false);
    }

    /* renamed from: c */
    public boolean m12822c() {
        return this.f12422a.optBoolean(C3034d9.a.f7929p, false);
    }

    /* renamed from: d */
    public boolean m12823d() {
        return this.f12422a.optBoolean(C3034d9.a.f7925l, false);
    }

    /* renamed from: e */
    public boolean m12824e() {
        return this.f12422a.optBoolean(C3034d9.a.f7927n, false);
    }
}
