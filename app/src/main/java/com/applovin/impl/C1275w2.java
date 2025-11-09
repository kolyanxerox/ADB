package com.applovin.impl;

import com.applovin.impl.C0993c2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.w2 */
/* loaded from: classes.dex */
public class C1275w2 extends AbstractC1003d2 {
    public C1275w2(C1220k c1220k) {
        super(c1220k, C0993c2.b.MEDIATED_AD);
    }

    /* renamed from: a */
    public void m3595a(C0993c2 c0993c2, AbstractC1266v2 abstractC1266v2) {
        m3597a(c0993c2, abstractC1266v2, new HashMap());
    }

    /* renamed from: a */
    public void m3597a(C0993c2 c0993c2, AbstractC1266v2 abstractC1266v2, Map map) {
        m3594a(c0993c2, abstractC1266v2.getFormat(), abstractC1266v2.getAdUnitId(), abstractC1266v2, null, map);
    }

    /* renamed from: a */
    public void m3596a(C0993c2 c0993c2, AbstractC1266v2 abstractC1266v2, MaxError maxError) {
        m3594a(c0993c2, abstractC1266v2.getFormat(), abstractC1266v2.getAdUnitId(), abstractC1266v2, maxError, new HashMap());
    }

    /* renamed from: a */
    public void m3598a(C0993c2 c0993c2, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        m3594a(c0993c2, maxAdFormat, str, null, maxError, new HashMap());
    }

    /* renamed from: a */
    private void m3594a(C0993c2 c0993c2, MaxAdFormat maxAdFormat, String str, AbstractC1266v2 abstractC1266v2, MaxError maxError, Map map) {
        if (abstractC1266v2 != null) {
            map.putAll(AbstractC1013e2.m678a(abstractC1266v2));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            map.putAll(AbstractC1013e2.m679a(maxError));
        }
        m576d(c0993c2, map);
    }
}
