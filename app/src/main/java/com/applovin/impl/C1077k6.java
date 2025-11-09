package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.k6 */
/* loaded from: classes.dex */
public class C1077k6 extends AbstractC1097m6 {

    /* renamed from: g */
    private final AbstractC1207b f997g;

    public C1077k6(AbstractC1207b abstractC1207b, C1220k c1220k) {
        super("TaskReportAppLovinReward", c1220k);
        this.f997g = abstractC1207b;
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1149a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f997g.getAdZone().m3375e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f997g.m2569Z());
        String clCode = this.f997g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.AbstractC1097m6
    /* renamed from: b */
    public void mo1150b(JSONObject jSONObject) {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Reported reward successfully for ad: " + this.f997g);
        }
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: f */
    public String mo1151f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.AbstractC1097m6
    /* renamed from: h */
    public C1085l4 mo1152h() {
        return this.f997g.m2606i();
    }

    @Override // com.applovin.impl.AbstractC1097m6
    /* renamed from: i */
    public void mo1153i() {
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "No reward result was found for ad: " + this.f997g);
        }
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1148a(int i) {
        super.mo1148a(i);
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Failed to report reward for ad: " + this.f997g + " - error code: " + i);
        }
        this.f776a.m2897g().m705a(C0993c2.f543u, this.f997g);
    }
}
