package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.mediation.C1129h;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a3 */
/* loaded from: classes.dex */
public class C0956a3 extends AbstractC1014e3 implements InterfaceC1185s1 {

    /* renamed from: u */
    private final AtomicBoolean f177u;

    /* renamed from: v */
    private final AtomicBoolean f178v;

    public C0956a3(C1284x2 c1284x2, JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        super(c1284x2, jSONObject, jSONObject2, null, c1220k);
        this.f177u = new AtomicBoolean();
        this.f178v = new AtomicBoolean();
    }

    /* renamed from: l0 */
    private long m97l0() {
        long jM884a = m884a("ad_expiration_ms", -1L);
        return jM884a < 0 ? m893b("ad_expiration_ms", ((Long) this.f837a.m2866a(AbstractC1144o3.f1613J7)).longValue()) : jM884a;
    }

    @Override // com.applovin.impl.AbstractC1266v2
    /* renamed from: a */
    public AbstractC1266v2 mo98a(C1129h c1129h) {
        return new C0956a3(this, c1129h);
    }

    @Override // com.applovin.impl.InterfaceC1185s1
    public long getTimeToLiveMillis() {
        return m97l0() - (SystemClock.elapsedRealtime() - m3511H());
    }

    /* renamed from: m0 */
    public MaxNativeAdView m101m0() {
        return this.f2522n.m1836f();
    }

    /* renamed from: n0 */
    public ViewGroup m102n0() {
        return this.f2522n.m1838h();
    }

    /* renamed from: o0 */
    public AtomicBoolean m103o0() {
        return this.f177u;
    }

    /* renamed from: p0 */
    public AtomicBoolean m104p0() {
        return this.f178v;
    }

    /* renamed from: q0 */
    public boolean m105q0() {
        return m885a("inacc", (Boolean) this.f837a.m2866a(AbstractC1144o3.f1632c8)).booleanValue();
    }

    /* renamed from: r0 */
    public boolean m106r0() {
        return this.f2522n == null;
    }

    @Override // com.applovin.impl.InterfaceC1185s1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    /* renamed from: a */
    public void m100a(MaxNativeAdView maxNativeAdView) {
        this.f2522n.m1828a(maxNativeAdView);
    }

    /* renamed from: a */
    public void m99a(ViewGroup viewGroup) {
        this.f2522n.m1824a(viewGroup);
    }

    private C0956a3(C0956a3 c0956a3, C1129h c1129h) {
        super(c0956a3.m3515M(), c0956a3.m889a(), c0956a3.m910g(), c1129h, c0956a3.f837a);
        this.f177u = new AtomicBoolean();
        this.f178v = new AtomicBoolean();
    }
}
