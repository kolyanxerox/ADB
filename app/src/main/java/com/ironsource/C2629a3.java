package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.ironsource.a3 */
/* loaded from: classes2.dex */
public class C2629a3 {

    /* renamed from: a */
    private NetworkSettings f3879a;

    /* renamed from: b */
    private JSONObject f3880b;

    /* renamed from: c */
    private IronSource.AD_UNIT f3881c;

    /* renamed from: d */
    private boolean f3882d;

    /* renamed from: e */
    private boolean f3883e;

    /* renamed from: f */
    private int f3884f;

    /* renamed from: g */
    private int f3885g;

    public C2629a3(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f3879a = networkSettings;
        this.f3880b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f3884f = iOptInt;
        this.f3882d = iOptInt == 2;
        this.f3883e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f3885g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f3881c = ad_unit;
    }

    /* renamed from: a */
    public String m4766a() {
        return this.f3879a.getAdSourceNameForEvents();
    }

    /* renamed from: b */
    public IronSource.AD_UNIT m4767b() {
        return this.f3881c;
    }

    /* renamed from: c */
    public JSONObject m4768c() {
        return this.f3880b;
    }

    /* renamed from: d */
    public int m4769d() {
        return this.f3884f;
    }

    /* renamed from: e */
    public int m4770e() {
        return this.f3885g;
    }

    /* renamed from: f */
    public String m4771f() {
        return this.f3879a.getProviderName();
    }

    /* renamed from: g */
    public String m4772g() {
        return this.f3879a.getProviderTypeForReflection();
    }

    /* renamed from: h */
    public NetworkSettings m4773h() {
        return this.f3879a;
    }

    /* renamed from: i */
    public String m4774i() {
        return this.f3879a.getSubProviderId();
    }

    /* renamed from: j */
    public boolean m4775j() {
        return this.f3882d;
    }

    /* renamed from: k */
    public boolean m4776k() {
        return this.f3883e;
    }
}
