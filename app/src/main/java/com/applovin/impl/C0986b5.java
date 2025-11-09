package com.applovin.impl;

import com.applovin.impl.C1304z4;
import com.applovin.impl.sdk.C1220k;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.b5 */
/* loaded from: classes.dex */
public class C0986b5 extends C1044h3 {

    /* renamed from: k */
    private final C1284x2 f399k;

    public C0986b5(C1284x2 c1284x2, JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        super(c1284x2.m3645e(), jSONObject, jSONObject2, c1220k);
        this.f399k = c1284x2;
    }

    /* renamed from: A */
    public boolean m382A() {
        return m885a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    /* renamed from: t */
    public C1304z4.b m383t() {
        return C1304z4.b.values()[m883a("signal_cache_level", ((Integer) this.f837a.m2866a(AbstractC1144o3.f1611H7)).intValue())];
    }

    @Override // com.applovin.impl.C1044h3
    public String toString() {
        return "SignalProviderSpec{adObject=" + m889a() + '}';
    }

    /* renamed from: u */
    public C1284x2 m384u() {
        return this.f399k;
    }

    /* renamed from: v */
    public long m385v() {
        return m884a("signal_expiration_ms", ((Long) this.f837a.m2866a(AbstractC1144o3.f1610G7)).longValue());
    }

    /* renamed from: w */
    public boolean m386w() {
        return m885a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    /* renamed from: x */
    public boolean m387x() {
        return m885a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    /* renamed from: y */
    public boolean m388y() {
        return m885a("fail_collection_for_empty_signal", (Boolean) this.f837a.m2866a(AbstractC1144o3.f1654n8)).booleanValue();
    }

    /* renamed from: z */
    public boolean m389z() {
        return m885a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
