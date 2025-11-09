package com.applovin.impl;

import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.j2 */
/* loaded from: classes.dex */
public abstract class AbstractC1063j2 {

    /* renamed from: a */
    private static boolean f926a;

    /* renamed from: a */
    public static /* synthetic */ void m1037a(C1220k c1220k) {
        if (f926a) {
            return;
        }
        c1220k.m2832E().m571a(C0993c2.f474E0, "no_ads_loaded");
    }

    /* renamed from: b */
    public static void m1038b(C1220k c1220k) {
        Long l = (Long) c1220k.m2866a(AbstractC1144o3.f1634d8);
        if (l.longValue() <= 0) {
            return;
        }
        c1220k.m2918r0().m404a(new C1156p6(c1220k, true, "submitIntegrationErrorReport", new oo0o0Oo(0, c1220k)), C0987b6.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    /* renamed from: a */
    public static void m1036a() {
        f926a = true;
    }
}
