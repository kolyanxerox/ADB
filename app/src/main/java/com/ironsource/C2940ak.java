package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ak */
/* loaded from: classes2.dex */
public class C2940ak {

    /* renamed from: a */
    private String f7537a;

    /* renamed from: e */
    private String f7541e;

    /* renamed from: f */
    private Map<String, String> f7542f;

    /* renamed from: g */
    private final InterfaceC3299kp f7543g;

    /* renamed from: h */
    private boolean f7544h;

    /* renamed from: b */
    private boolean f7538b = false;

    /* renamed from: c */
    private boolean f7539c = false;

    /* renamed from: d */
    private C2972bh f7540d = null;

    /* renamed from: i */
    protected boolean f7545i = false;

    /* renamed from: j */
    protected String f7546j = null;

    public C2940ak(String str, InterfaceC3299kp interfaceC3299kp) throws NullPointerException {
        this.f7537a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f7543g = (InterfaceC3299kp) SDKUtils.requireNonNull(interfaceC3299kp, "AdListener name can't be null");
    }

    /* renamed from: a */
    public C2940ak m7811a(C2972bh c2972bh) {
        this.f7540d = c2972bh;
        return this;
    }

    /* renamed from: b */
    public C2940ak m7816b(@Nullable String str) {
        this.f7546j = str;
        return this;
    }

    /* renamed from: c */
    public C2940ak m7819c() {
        this.f7538b = true;
        return this;
    }

    /* renamed from: a */
    public C2940ak m7812a(String str) {
        this.f7541e = str;
        return this;
    }

    /* renamed from: b */
    public C2940ak m7817b(boolean z) {
        this.f7545i = z;
        return this;
    }

    /* renamed from: c */
    public C2940ak m7820c(boolean z) {
        this.f7544h = z;
        return this;
    }

    /* renamed from: a */
    public C2940ak m7813a(Map<String, String> map) {
        this.f7542f = map;
        return this;
    }

    /* renamed from: b */
    public String m7818b() throws JSONException {
        String str = this.f7541e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f7537a);
            jSONObject.put("rewarded", this.f7538b);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.f7539c || this.f7544h) ? C3259jk.m9516a() : C3259jk.m9518a(jSONObject);
    }

    /* renamed from: a */
    public C2940ak m7814a(boolean z) {
        this.f7539c = z;
        return this;
    }

    /* renamed from: a */
    public C3907zj m7815a() {
        return new C3907zj(m7818b(), this.f7537a, this.f7538b, this.f7539c, this.f7544h, this.f7545i, this.f7546j, this.f7542f, this.f7543g, this.f7540d);
    }
}
