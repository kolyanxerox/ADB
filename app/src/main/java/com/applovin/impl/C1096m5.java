package com.applovin.impl;

import com.applovin.impl.AbstractC1263v;
import com.applovin.impl.sdk.C1220k;

/* renamed from: com.applovin.impl.m5 */
/* loaded from: classes.dex */
public class C1096m5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final a f1199g;

    /* renamed from: com.applovin.impl.m5$a */
    public interface a {
        /* renamed from: a */
        void mo1500a(AbstractC1263v.a aVar);
    }

    public C1096m5(C1220k c1220k, a aVar) {
        super("TaskCollectAdvertisingId", c1220k, true);
        this.f1199g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1199g.mo1500a(this.f776a.m2827B().m2997f());
    }
}
