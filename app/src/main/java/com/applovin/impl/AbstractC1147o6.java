package com.applovin.impl;

import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.C1166q0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.o6 */
/* loaded from: classes.dex */
public abstract class AbstractC1147o6 extends AbstractRunnableC1036g5 {
    public AbstractC1147o6(String str, C1220k c1220k) {
        super(str, c1220k);
    }

    /* renamed from: a */
    public abstract void mo1149a(JSONObject jSONObject);

    /* renamed from: a */
    public void m2017a(JSONObject jSONObject, C1166q0.e eVar) {
        Map mapM2299c = AbstractC1175r0.m2299c(this.f776a);
        if (((Boolean) this.f776a.m2866a(C1268v4.f2913v5)).booleanValue() || ((Boolean) this.f776a.m2866a(C1268v4.f2857o5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapM2299c);
            mapM2299c = null;
        }
        a aVar = new a(C1235a.m3072a(this.f776a).mo3103b(AbstractC1175r0.m2297b(mo1151f(), this.f776a)).mo3097a(AbstractC1175r0.m2286a(mo1151f(), this.f776a)).mo3104b(mapM2299c).mo3099a(jSONObject).mo3107c("POST").mo3105b(((Boolean) this.f776a.m2866a(C1268v4.f2568E5)).booleanValue()).mo3096a((Object) new JSONObject()).mo3094a(mo1502g()).mo3095a(AbstractC1188s4.a.m2392a(((Integer) this.f776a.m2866a(C1268v4.f2849n5)).intValue())).mo3101a(), this.f776a, eVar);
        aVar.m1097c(C1268v4.f2868q0);
        aVar.m1096b(C1268v4.f2876r0);
        this.f776a.m2918r0().m402a(aVar);
    }

    /* renamed from: e */
    public JSONObject m2018e() {
        JSONObject jSONObject = new JSONObject();
        String strM1108e = this.f776a.m2930x0().m1108e();
        if (((Boolean) this.f776a.m2866a(C1268v4.f2935y3)).booleanValue() && StringUtils.isValidString(strM1108e)) {
            JsonUtils.putString(jSONObject, "cuid", strM1108e);
        }
        if (((Boolean) this.f776a.m2866a(C1268v4.f2534A3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f776a.m2925v());
        }
        if (((Boolean) this.f776a.m2866a(C1268v4.f2550C3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f776a.m2902i0());
        }
        mo1149a(jSONObject);
        return jSONObject;
    }

    /* renamed from: f */
    public abstract String mo1151f();

    /* renamed from: g */
    public abstract int mo1502g();

    /* renamed from: com.applovin.impl.o6$a */
    public class a extends AbstractC1067j6 {

        /* renamed from: m */
        final /* synthetic */ C1166q0.e f1678m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1235a c1235a, C1220k c1220k, C1166q0.e eVar) {
            super(c1235a, c1220k);
            this.f1678m = eVar;
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            this.f1678m.mo933a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            this.f1678m.mo931a(str, i, str2, jSONObject);
        }
    }

    /* renamed from: a */
    public void mo1148a(int i) {
        AbstractC1175r0.m2288a(i, this.f776a);
    }
}
