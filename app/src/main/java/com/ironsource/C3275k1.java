package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* renamed from: com.ironsource.k1 */
/* loaded from: classes2.dex */
public class C3275k1 {

    /* renamed from: a */
    private IronSource.AD_UNIT f9192a;

    /* renamed from: b */
    private String f9193b;

    /* renamed from: c */
    private NetworkSettings f9194c;

    /* renamed from: d */
    private int f9195d;

    /* renamed from: e */
    private int f9196e;

    /* renamed from: f */
    private JSONObject f9197f;

    /* renamed from: g */
    private String f9198g;

    /* renamed from: h */
    private int f9199h;

    /* renamed from: i */
    private String f9200i;

    public C3275k1(IronSource.AD_UNIT ad_unit, String str, int i, JSONObject jSONObject, String str2, int i2, String str3, NetworkSettings networkSettings, int i3) {
        this.f9192a = ad_unit;
        this.f9193b = str;
        this.f9196e = i;
        this.f9197f = jSONObject;
        this.f9198g = str2;
        this.f9199h = i2;
        this.f9200i = str3;
        this.f9194c = networkSettings;
        this.f9195d = i3;
    }

    /* renamed from: a */
    public IronSource.AD_UNIT m9562a() {
        return this.f9192a;
    }

    /* renamed from: b */
    public String m9563b() {
        return this.f9200i;
    }

    /* renamed from: c */
    public String m9564c() {
        return this.f9198g;
    }

    /* renamed from: d */
    public int m9565d() {
        return this.f9199h;
    }

    /* renamed from: e */
    public JSONObject m9566e() {
        return this.f9197f;
    }

    /* renamed from: f */
    public int m9567f() {
        return this.f9195d;
    }

    /* renamed from: g */
    public NetworkSettings m9568g() {
        return this.f9194c;
    }

    /* renamed from: h */
    public int m9569h() {
        return this.f9196e;
    }

    /* renamed from: i */
    public String m9570i() {
        return this.f9193b;
    }
}
