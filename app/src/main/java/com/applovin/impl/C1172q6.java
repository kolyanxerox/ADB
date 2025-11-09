package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.q6 */
/* loaded from: classes.dex */
public class C1172q6 extends AbstractC1190s6 {

    /* renamed from: g */
    private final AbstractC1207b f1811g;

    /* renamed from: h */
    private final AppLovinAdRewardListener f1812h;

    public C1172q6(AbstractC1207b abstractC1207b, AppLovinAdRewardListener appLovinAdRewardListener, C1220k c1220k) {
        super("TaskValidateAppLovinReward", c1220k);
        this.f1811g = abstractC1207b;
        this.f1812h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1149a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f1811g.getAdZone().m3375e());
        String clCode = this.f1811g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: f */
    public String mo1151f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.AbstractC1190s6
    /* renamed from: h */
    public boolean mo2280h() {
        return this.f1811g.m2564W0();
    }

    @Override // com.applovin.impl.AbstractC1190s6
    /* renamed from: a */
    public void mo2279a(C1085l4 c1085l4) {
        this.f1811g.m2575a(c1085l4);
        String strM1330b = c1085l4.m1330b();
        Map<String, String> mapM1329a = c1085l4.m1329a();
        if (strM1330b.equals("accepted")) {
            this.f1812h.userRewardVerified(this.f1811g, mapM1329a);
            return;
        }
        if (strM1330b.equals("quota_exceeded")) {
            this.f1812h.userOverQuota(this.f1811g, mapM1329a);
        } else if (strM1330b.equals("rejected")) {
            this.f1812h.userRewardRejected(this.f1811g, mapM1329a);
        } else {
            this.f1812h.validationRequestFailed(this.f1811g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.AbstractC1147o6
    /* renamed from: a */
    public void mo1148a(int i) {
        String str;
        super.mo1148a(i);
        if (i >= 400 && i < 500) {
            this.f1812h.userRewardRejected(this.f1811g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f1812h.validationRequestFailed(this.f1811g, i);
            str = "network_timeout";
        }
        this.f1811g.m2575a(C1085l4.m1327a(str));
    }
}
