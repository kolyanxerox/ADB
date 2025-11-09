package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.mediation.C1129h;
import com.applovin.impl.sdk.C1220k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.z2 */
/* loaded from: classes.dex */
public class C1302z2 extends AbstractC1266v2 implements InterfaceC1185s1 {

    /* renamed from: A */
    private String f3213A;

    /* renamed from: u */
    private final Bundle f3214u;

    /* renamed from: v */
    private final AtomicReference f3215v;

    /* renamed from: w */
    private final AtomicBoolean f3216w;

    /* renamed from: x */
    private final AtomicBoolean f3217x;

    /* renamed from: y */
    private final AtomicBoolean f3218y;

    /* renamed from: z */
    private boolean f3219z;

    public C1302z2(C1284x2 c1284x2, JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        super(c1284x2, jSONObject, jSONObject2, null, c1220k);
        this.f3214u = new Bundle();
        this.f3217x = new AtomicBoolean();
        this.f3218y = new AtomicBoolean();
        this.f3215v = new AtomicReference();
        this.f3216w = new AtomicBoolean();
    }

    /* renamed from: e0 */
    private long m3845e0() {
        long jM884a = m884a("ad_expiration_ms", -1L);
        return jM884a < 0 ? m893b("ad_expiration_ms", ((Long) this.f837a.m2866a(AbstractC1144o3.f1612I7)).longValue()) : jM884a;
    }

    @Override // com.applovin.impl.AbstractC1266v2
    /* renamed from: a */
    public AbstractC1266v2 mo98a(C1129h c1129h) {
        return new C1302z2(this, c1129h);
    }

    /* renamed from: d0 */
    public void m3847d0() {
        this.f3216w.set(true);
    }

    /* renamed from: f0 */
    public long m3848f0() {
        return m884a("ahdm", ((Long) this.f837a.m2866a(AbstractC1144o3.f1606C7)).longValue());
    }

    /* renamed from: g0 */
    public long m3849g0() {
        long jM884a = m884a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jM884a >= 0 ? jM884a : m893b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f837a.m2866a(AbstractC1144o3.f1620Q7)).longValue());
    }

    @Override // com.applovin.impl.InterfaceC1185s1
    public long getTimeToLiveMillis() {
        return m3845e0() - (SystemClock.elapsedRealtime() - m3511H());
    }

    /* renamed from: h0 */
    public long m3850h0() {
        long jM884a = m884a("ad_hidden_timeout_ms", -1L);
        return jM884a >= 0 ? jM884a : m893b("ad_hidden_timeout_ms", ((Long) this.f837a.m2866a(AbstractC1144o3.f1617N7)).longValue());
    }

    /* renamed from: i0 */
    public C1085l4 m3851i0() {
        return (C1085l4) this.f3215v.getAndSet(null);
    }

    /* renamed from: j */
    public void m3852j(String str) {
        this.f3213A = str;
    }

    /* renamed from: j0 */
    public long m3853j0() {
        if (m3511H() > 0) {
            return SystemClock.elapsedRealtime() - m3511H();
        }
        return -1L;
    }

    /* renamed from: k0 */
    public Bundle m3854k0() {
        return this.f3214u;
    }

    /* renamed from: l0 */
    public long m3855l0() {
        long jM884a = m884a("fullscreen_display_delay_ms", -1L);
        return jM884a >= 0 ? jM884a : ((Long) this.f837a.m2866a(AbstractC1144o3.f1604A7)).longValue();
    }

    /* renamed from: m0 */
    public String m3856m0() {
        return m896b("mcode", "");
    }

    /* renamed from: n0 */
    public AtomicBoolean m3857n0() {
        return this.f3217x;
    }

    /* renamed from: o0 */
    public String m3858o0() {
        return this.f3213A;
    }

    /* renamed from: p0 */
    public AtomicBoolean m3859p0() {
        return this.f3218y;
    }

    /* renamed from: q0 */
    public boolean m3860q0() {
        return this.f3216w.get();
    }

    /* renamed from: r0 */
    public boolean m3861r0() {
        if (m885a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return m894b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f837a.m2866a(AbstractC1144o3.f1618O7)).booleanValue();
    }

    /* renamed from: s0 */
    public boolean m3862s0() {
        if (m885a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return m894b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f837a.m2866a(AbstractC1144o3.f1619P7)).booleanValue();
    }

    @Override // com.applovin.impl.InterfaceC1185s1
    public void setExpired() {
        this.f3219z = true;
    }

    /* renamed from: t0 */
    public boolean m3863t0() {
        return m885a("susaode", (Boolean) this.f837a.m2866a(AbstractC1144o3.f1605B7)).booleanValue();
    }

    @Override // com.applovin.impl.AbstractC1266v2
    /* renamed from: a */
    public void mo3530a(Bundle bundle) {
        Bundle bundle2;
        super.mo3530a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f3214u.putBundle("applovin_ad_view_info", bundle2);
    }

    /* renamed from: a */
    public void m3846a(C1085l4 c1085l4) {
        this.f3215v.set(c1085l4);
    }

    private C1302z2(C1302z2 c1302z2, C1129h c1129h) {
        super(c1302z2.m3515M(), c1302z2.m889a(), c1302z2.m910g(), c1129h, c1302z2.f837a);
        this.f3214u = new Bundle();
        this.f3217x = new AtomicBoolean();
        this.f3218y = new AtomicBoolean();
        this.f3215v = c1302z2.f3215v;
        this.f3216w = c1302z2.f3216w;
    }
}
