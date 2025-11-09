package com.applovin.impl;

import com.applovin.impl.mediation.C1129h;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.y2 */
/* loaded from: classes.dex */
public class C1293y2 extends AbstractC1014e3 {
    public C1293y2(C1284x2 c1284x2, JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        super(c1284x2, jSONObject, jSONObject2, null, c1220k);
    }

    @Override // com.applovin.impl.AbstractC1266v2
    /* renamed from: a */
    public AbstractC1266v2 mo98a(C1129h c1129h) {
        return new C1293y2(this, c1129h);
    }

    /* renamed from: l0 */
    public long m3732l0() {
        long jM884a = m884a("ad_refresh_ms", -1L);
        return jM884a >= 0 ? jM884a : m893b("ad_refresh_ms", ((Long) this.f837a.m2866a(AbstractC1144o3.f1657p7)).longValue());
    }

    /* renamed from: m0 */
    public long m3733m0() {
        return AbstractC1078k7.m1236e(m887a("bg_color", (String) null));
    }

    /* renamed from: n0 */
    public int m3734n0() {
        int iM883a = m883a("ad_view_height", -2);
        if (iM883a != -2) {
            return iM883a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: o0 */
    public long m3735o0() {
        return m884a("viewability_imp_delay_ms", ((Long) this.f837a.m2866a(C1268v4.f2829l1)).longValue());
    }

    /* renamed from: p0 */
    public int m3736p0() {
        int iM883a = m883a("ad_view_width", -2);
        if (iM883a != -2) {
            return iM883a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: q0 */
    public boolean m3737q0() {
        return m3732l0() >= 0;
    }

    /* renamed from: r0 */
    public boolean m3738r0() {
        return m885a("proe", (Boolean) this.f837a.m2866a(AbstractC1144o3.f1621R7)).booleanValue();
    }

    private C1293y2(C1293y2 c1293y2, C1129h c1129h) {
        super(c1293y2.m3515M(), c1293y2.m889a(), c1293y2.m910g(), c1129h, c1293y2.f837a);
    }
}
