package com.applovin.impl.mediation;

import com.applovin.impl.C1031g0;
import com.applovin.impl.C1302z2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;

/* renamed from: com.applovin.impl.mediation.c */
/* loaded from: classes.dex */
public class C1121c {

    /* renamed from: a */
    private final C1220k f1351a;

    /* renamed from: b */
    private final C1240o f1352b;

    /* renamed from: c */
    private final a f1353c;

    /* renamed from: d */
    private C1031g0 f1354d;

    /* renamed from: com.applovin.impl.mediation.c$a */
    public interface a {
        /* renamed from: a */
        void mo1682a(C1302z2 c1302z2);
    }

    public C1121c(C1220k c1220k, a aVar) {
        this.f1351a = c1220k;
        this.f1352b = c1220k.m2847O();
        this.f1353c = aVar;
    }

    /* renamed from: a */
    public void m1686a(C1302z2 c1302z2, long j) {
        if (C1240o.m3200a()) {
            this.f1352b.m3211a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f1354d = C1031g0.m768a(j, this.f1351a, new OooOOOO(3, this, c1302z2));
    }

    /* renamed from: a */
    public /* synthetic */ void m1684a(C1302z2 c1302z2) {
        if (C1240o.m3200a()) {
            this.f1352b.m3211a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f1353c.mo1682a(c1302z2);
    }

    /* renamed from: a */
    public void m1685a() {
        if (C1240o.m3200a()) {
            this.f1352b.m3211a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C1031g0 c1031g0 = this.f1354d;
        if (c1031g0 != null) {
            c1031g0.m771a();
            this.f1354d = null;
        }
    }
}
