package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.l6 */
/* loaded from: classes.dex */
public class C1087l6 extends AbstractC1097m6 {

    /* renamed from: g */
    private final C1302z2 f1119g;

    public C1087l6(C1302z2 c1302z2, C1220k c1220k) {
        super("TaskReportMaxReward", c1220k);
        this.f1119g = c1302z2;
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1149a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f1119g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f1119g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f1119g.m907e());
        String strM3856m0 = this.f1119g.m3856m0();
        if (!StringUtils.isValidString(strM3856m0)) {
            strM3856m0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strM3856m0);
        String strM3506C = this.f1119g.m3506C();
        if (!StringUtils.isValidString(strM3506C)) {
            strM3506C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strM3506C);
    }

    @Override // com.applovin.impl.AbstractC1097m6
    /* renamed from: b */
    public void mo1150b(JSONObject jSONObject) {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Reported reward successfully for mediated ad: " + this.f1119g);
        }
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: f */
    public String mo1151f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.AbstractC1097m6
    /* renamed from: h */
    public C1085l4 mo1152h() {
        return this.f1119g.m3851i0();
    }

    @Override // com.applovin.impl.AbstractC1097m6
    /* renamed from: i */
    public void mo1153i() {
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "No reward result was found for mediated ad: " + this.f1119g);
        }
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1148a(int i) {
        super.mo1148a(i);
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Failed to report reward for mediated ad: " + this.f1119g + " - error code: " + i);
        }
        this.f776a.m2848P().m3595a(C0993c2.f516g0, this.f1119g);
    }
}
