package com.applovin.impl;

import com.applovin.impl.mediation.C1129h;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.e3 */
/* loaded from: classes.dex */
public abstract class AbstractC1014e3 extends AbstractC1266v2 {
    public AbstractC1014e3(C1284x2 c1284x2, JSONObject jSONObject, JSONObject jSONObject2, C1129h c1129h, C1220k c1220k) {
        super(c1284x2, jSONObject, jSONObject2, c1129h, c1220k);
    }

    /* renamed from: d0 */
    public float m681d0() {
        return m882a("viewability_min_alpha", ((Float) this.f837a.m2866a(C1268v4.f2901u1)).floatValue() / 100.0f);
    }

    /* renamed from: e0 */
    public int m682e0() {
        return m883a("viewability_min_pixels", -1);
    }

    /* renamed from: f0 */
    public int m683f0() {
        MaxAdFormat format = getFormat();
        C1268v4 c1268v4 = format == MaxAdFormat.BANNER ? C1268v4.f2845n1 : format == MaxAdFormat.MREC ? C1268v4.f2861p1 : format == MaxAdFormat.LEADER ? C1268v4.f2877r1 : format == MaxAdFormat.NATIVE ? C1268v4.f2893t1 : null;
        if (c1268v4 != null) {
            return m883a("viewability_min_height", ((Integer) this.f837a.m2866a(c1268v4)).intValue());
        }
        return 0;
    }

    /* renamed from: g0 */
    public float m684g0() {
        return m882a("viewability_min_percentage_dp", -1.0f);
    }

    /* renamed from: h0 */
    public float m685h0() {
        return m882a("viewability_min_percentage_pixels", -1.0f);
    }

    /* renamed from: i0 */
    public long m686i0() {
        return m884a("viewability_timer_min_visible_ms", ((Long) this.f837a.m2866a(C1268v4.f2909v1)).longValue());
    }

    /* renamed from: j0 */
    public int m687j0() {
        MaxAdFormat format = getFormat();
        C1268v4 c1268v4 = format == MaxAdFormat.BANNER ? C1268v4.f2837m1 : format == MaxAdFormat.MREC ? C1268v4.f2853o1 : format == MaxAdFormat.LEADER ? C1268v4.f2869q1 : format == MaxAdFormat.NATIVE ? C1268v4.f2885s1 : null;
        if (c1268v4 != null) {
            return m883a("viewability_min_width", ((Integer) this.f837a.m2866a(c1268v4)).intValue());
        }
        return 0;
    }

    /* renamed from: k0 */
    public boolean m688k0() {
        return m682e0() >= 0 || m684g0() >= 0.0f || m685h0() >= 0.0f;
    }
}
