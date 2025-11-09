package com.applovin.impl;

import com.applovin.impl.C1166q0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.s6 */
/* loaded from: classes.dex */
public abstract class AbstractC1190s6 extends AbstractC1147o6 {
    public AbstractC1190s6(String str, C1220k c1220k) {
        super(str, c1220k);
    }

    /* renamed from: b */
    private C1085l4 m2399b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("results", jSONObject), 0, new JSONObject());
        AbstractC1175r0.m2300c(jSONObject2, this.f776a);
        AbstractC1175r0.m2298b(jSONObject, this.f776a);
        AbstractC1175r0.m2289a(jSONObject, this.f776a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return C1085l4.m1328a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m2400c(JSONObject jSONObject) {
        C1085l4 c1085l4M2399b = m2399b(jSONObject);
        mo2279a(c1085l4M2399b);
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Pending reward handled: " + c1085l4M2399b);
        }
    }

    /* renamed from: a */
    public abstract void mo2279a(C1085l4 c1085l4);

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: g */
    public int mo1502g() {
        return ((Integer) this.f776a.m2866a(C1268v4.f2765d1)).intValue();
    }

    /* renamed from: h */
    public abstract boolean mo2280h();

    @Override // java.lang.Runnable
    public void run() {
        m2017a(m2018e(), new a());
    }

    /* renamed from: com.applovin.impl.s6$a */
    public class a implements C1166q0.e {
        public a() {
        }

        @Override // com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            if (AbstractC1190s6.this.mo2280h()) {
                C1240o c1240o = AbstractC1190s6.this.f778c;
                if (C1240o.m3200a()) {
                    AbstractC1190s6 abstractC1190s6 = AbstractC1190s6.this;
                    abstractC1190s6.f778c.m3214b(abstractC1190s6.f777b, "Reward validation succeeded with code " + i + " but task was cancelled already");
                }
                C1240o c1240o2 = AbstractC1190s6.this.f778c;
                if (C1240o.m3200a()) {
                    AbstractC1190s6 abstractC1190s62 = AbstractC1190s6.this;
                    abstractC1190s62.f778c.m3214b(abstractC1190s62.f777b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            C1240o c1240o3 = AbstractC1190s6.this.f778c;
            if (C1240o.m3200a()) {
                AbstractC1190s6 abstractC1190s63 = AbstractC1190s6.this;
                abstractC1190s63.f778c.m3211a(abstractC1190s63.f777b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
            }
            AbstractC1190s6.this.m2400c(jSONObject);
        }

        @Override // com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            if (AbstractC1190s6.this.mo2280h()) {
                C1240o c1240o = AbstractC1190s6.this.f778c;
                if (C1240o.m3200a()) {
                    AbstractC1190s6 abstractC1190s6 = AbstractC1190s6.this;
                    abstractC1190s6.f778c.m3214b(abstractC1190s6.f777b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            C1240o c1240o2 = AbstractC1190s6.this.f778c;
            if (C1240o.m3200a()) {
                AbstractC1190s6 abstractC1190s62 = AbstractC1190s6.this;
                abstractC1190s62.f778c.m3214b(abstractC1190s62.f777b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            AbstractC1190s6.this.mo1148a(i);
        }
    }
}
