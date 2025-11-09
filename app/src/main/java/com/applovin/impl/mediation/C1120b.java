package com.applovin.impl.mediation;

import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.C1302z2;
import com.applovin.impl.mediation.C1105a;
import com.applovin.impl.mediation.C1121c;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.mediation.b */
/* loaded from: classes.dex */
public class C1120b implements C1105a.a, C1121c.a {

    /* renamed from: a */
    private final C1220k f1348a;

    /* renamed from: b */
    private final C1105a f1349b;

    /* renamed from: c */
    private final C1121c f1350c;

    public C1120b(C1220k c1220k) {
        this.f1348a = c1220k;
        this.f1349b = new C1105a(c1220k);
        this.f1350c = new C1121c(c1220k, this);
    }

    /* renamed from: d */
    public void m1679c(C1302z2 c1302z2) {
        C1129h c1129hM3504A;
        if (c1302z2 == null || (c1129hM3504A = c1302z2.m3504A()) == null || !c1302z2.m3541w().compareAndSet(false, true)) {
            return;
        }
        AbstractC1168q2.m2243e(c1129hM3504A.m1833c(), c1302z2);
    }

    /* renamed from: a */
    public void m1681a() {
        this.f1350c.m1685a();
        this.f1349b.m1568a();
    }

    @Override // com.applovin.impl.mediation.C1105a.a
    /* renamed from: b */
    public void mo1570b(C1302z2 c1302z2) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new OooOOOO(2, this, c1302z2), c1302z2.m3849g0());
    }

    /* renamed from: e */
    public void m1683e(C1302z2 c1302z2) {
        long jM3850h0 = c1302z2.m3850h0();
        if (jM3850h0 >= 0) {
            this.f1350c.m1686a(c1302z2, jM3850h0);
        }
        if (c1302z2.m3861r0() || c1302z2.m3862s0()) {
            this.f1349b.m1569a(c1302z2, this);
        }
    }

    @Override // com.applovin.impl.mediation.C1121c.a
    /* renamed from: a */
    public void mo1682a(C1302z2 c1302z2) {
        m1679c(c1302z2);
    }
}
