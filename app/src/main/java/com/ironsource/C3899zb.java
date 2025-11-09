package com.ironsource;

import com.ironsource.InterfaceC3621s9;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.zb */
/* loaded from: classes2.dex */
public class C3899zb {

    /* renamed from: e */
    static final String f12947e = "euid";

    /* renamed from: f */
    static final String f12948f = "esat";

    /* renamed from: g */
    static final String f12949g = "esfr";

    /* renamed from: h */
    static final int f12950h = 1;

    /* renamed from: a */
    private int f12951a;

    /* renamed from: b */
    private long f12952b;

    /* renamed from: c */
    private int f12953c;

    /* renamed from: d */
    private final JSONObject f12954d;

    public C3899zb(int i, long j, String str) throws JSONException {
        this(i, j, new JSONObject(str));
    }

    /* renamed from: a */
    public String m13318a() {
        return this.f12954d.toString();
    }

    /* renamed from: b */
    public JSONObject m13322b() {
        return this.f12954d;
    }

    /* renamed from: c */
    public int m13323c() {
        return this.f12951a;
    }

    /* renamed from: d */
    public long m13324d() {
        return this.f12952b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3899zb c3899zb = (C3899zb) obj;
        return this.f12951a == c3899zb.f12951a && this.f12952b == c3899zb.f12952b && this.f12953c == c3899zb.f12953c && C3081el.m8512a(this.f12954d, c3899zb.f12954d);
    }

    public int hashCode() {
        return ((this.f12954d.toString().hashCode() + ((Long.hashCode(this.f12952b) + (Integer.hashCode(this.f12951a) * 31)) * 31)) * 31) + this.f12953c;
    }

    public String toString() {
        return ("{\"eventId\":" + m13323c() + ",\"timestamp\":" + m13324d() + "," + m13318a().substring(1) + "}").replace(",", "\n");
    }

    public C3899zb(int i, long j, JSONObject jSONObject) throws JSONException {
        this.f12953c = 1;
        this.f12951a = i;
        this.f12952b = j;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f12954d = jSONObject;
        if (!jSONObject.has(f12947e)) {
            m13321a(f12947e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f12948f)) {
            this.f12953c = jSONObject.optInt(f12948f, 1);
        } else {
            m13321a(f12948f, Integer.valueOf(this.f12953c));
        }
    }

    /* renamed from: a */
    public void m13319a(int i) {
        this.f12951a = i;
    }

    public C3899zb(int i, JSONObject jSONObject) {
        this(i, new InterfaceC3621s9.a().mo11889a(), jSONObject);
    }

    /* renamed from: a */
    public void m13320a(String str) throws JSONException {
        m13321a(f12949g, str);
        int i = this.f12953c + 1;
        this.f12953c = i;
        m13321a(f12948f, Integer.valueOf(i));
    }

    public C3899zb(EnumC2638ac enumC2638ac, long j, JSONObject jSONObject) {
        this(enumC2638ac.m4887b(), j, jSONObject);
    }

    /* renamed from: a */
    public void m13321a(String str, Object obj) throws JSONException {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f12954d.put(str, obj);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C3899zb(EnumC2638ac enumC2638ac, JSONObject jSONObject) {
        this(enumC2638ac.m4887b(), jSONObject);
    }
}
