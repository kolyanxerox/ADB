package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.r6 */
/* loaded from: classes.dex */
public class C1181r6 extends AbstractC1190s6 {

    /* renamed from: g */
    private final C1302z2 f1863g;

    public C1181r6(C1302z2 c1302z2, C1220k c1220k) {
        super("TaskValidateMaxReward", c1220k);
        this.f1863g = c1302z2;
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1149a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f1863g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f1863g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f1863g.m907e());
        JsonUtils.putString(jSONObject, "ad_format", this.f1863g.getFormat().getLabel());
        String strM3856m0 = this.f1863g.m3856m0();
        if (!StringUtils.isValidString(strM3856m0)) {
            strM3856m0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strM3856m0);
        String strM3506C = this.f1863g.m3506C();
        if (!StringUtils.isValidString(strM3506C)) {
            strM3506C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strM3506C);
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: f */
    public String mo1151f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.AbstractC1190s6
    /* renamed from: h */
    public boolean mo2280h() {
        return this.f1863g.m3860q0();
    }

    @Override // com.applovin.impl.AbstractC1190s6
    /* renamed from: a */
    public void mo2279a(C1085l4 c1085l4) {
        this.f1863g.m3846a(c1085l4);
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1148a(int i) {
        String str;
        super.mo1148a(i);
        if (i >= 400 && i < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f1863g.m3846a(C1085l4.m1327a(str));
        this.f776a.m2848P().m3597a(C0993c2.f518h0, this.f1863g, CollectionUtils.hashMap("error_message", str));
    }
}
