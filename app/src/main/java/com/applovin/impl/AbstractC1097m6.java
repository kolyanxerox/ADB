package com.applovin.impl;

import com.applovin.impl.C1166q0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.m6 */
/* loaded from: classes.dex */
public abstract class AbstractC1097m6 extends AbstractC1147o6 {
    public AbstractC1097m6(String str, C1220k c1220k) {
        super(str, c1220k);
    }

    /* renamed from: a */
    private JSONObject m1501a(C1085l4 c1085l4) {
        JSONObject jSONObjectM2018e = m2018e();
        JsonUtils.putString(jSONObjectM2018e, "result", c1085l4.m1330b());
        Map mapM1329a = c1085l4.m1329a();
        if (mapM1329a != null) {
            JsonUtils.putJSONObject(jSONObjectM2018e, "params", new JSONObject(mapM1329a));
        }
        return jSONObjectM2018e;
    }

    /* renamed from: b */
    public abstract void mo1150b(JSONObject jSONObject);

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: g */
    public int mo1502g() {
        return ((Integer) this.f776a.m2866a(C1268v4.f2773e1)).intValue();
    }

    /* renamed from: h */
    public abstract C1085l4 mo1152h();

    /* renamed from: i */
    public abstract void mo1153i();

    @Override // java.lang.Runnable
    public void run() {
        C1085l4 c1085l4Mo1152h = mo1152h();
        if (c1085l4Mo1152h == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Pending reward not found");
            }
            mo1153i();
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Reporting pending reward: " + c1085l4Mo1152h + "...");
        }
        m2017a(m1501a(c1085l4Mo1152h), new a());
    }

    /* renamed from: com.applovin.impl.m6$a */
    public class a implements C1166q0.e {
        public a() {
        }

        @Override // com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            AbstractC1097m6.this.mo1150b(jSONObject);
        }

        @Override // com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            AbstractC1097m6.this.mo1148a(i);
        }
    }
}
