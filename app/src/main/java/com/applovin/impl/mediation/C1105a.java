package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC0980b;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C0990c;
import com.applovin.impl.C1302z2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;

/* renamed from: com.applovin.impl.mediation.a */
/* loaded from: classes.dex */
public class C1105a extends AbstractC0980b {

    /* renamed from: a */
    private final C0990c f1260a;

    /* renamed from: b */
    private final C1240o f1261b;

    /* renamed from: c */
    private final String f1262c;

    /* renamed from: d */
    private a f1263d;

    /* renamed from: e */
    private C1302z2 f1264e;

    /* renamed from: f */
    private String f1265f;

    /* renamed from: com.applovin.impl.mediation.a$a */
    public interface a {
        /* renamed from: b */
        void mo1570b(C1302z2 c1302z2);
    }

    public C1105a(C1220k c1220k) {
        this.f1261b = c1220k.m2847O();
        this.f1260a = c1220k.m2893e();
        this.f1262c = AbstractC1078k7.m1169a(C1220k.m2824o(), "AdActivityObserver", c1220k);
    }

    /* renamed from: a */
    public void m1569a(C1302z2 c1302z2, a aVar) {
        if (C1240o.m3200a()) {
            this.f1261b.m3211a("AdActivityObserver", "Starting for ad " + c1302z2.getAdUnitId() + "...");
        }
        m1568a();
        this.f1263d = aVar;
        this.f1264e = c1302z2;
        this.f1260a.m438a(this);
    }

    @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f1262c) && this.f1264e.m3862s0()) {
            if (C1240o.m3200a()) {
                this.f1261b.m3211a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f1263d != null) {
                if (C1240o.m3200a()) {
                    this.f1261b.m3211a("AdActivityObserver", "Invoking callback...");
                }
                this.f1263d.mo1570b(this.f1264e);
            }
            m1568a();
            return;
        }
        if (this.f1265f == null) {
            this.f1265f = activity.getClass().getName();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Started tracking ad Activity: "), this.f1265f, this.f1261b, "AdActivityObserver");
            }
        }
    }

    @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f1265f)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Ad Activity destroyed: "), this.f1265f, this.f1261b, "AdActivityObserver");
            }
            if (this.f1263d != null) {
                if (C1240o.m3200a()) {
                    this.f1261b.m3211a("AdActivityObserver", "Invoking callback...");
                }
                this.f1263d.mo1570b(this.f1264e);
            }
            m1568a();
        }
    }

    /* renamed from: a */
    public void m1568a() {
        if (C1240o.m3200a()) {
            this.f1261b.m3211a("AdActivityObserver", "Cancelling...");
        }
        this.f1260a.m440b(this);
        this.f1263d = null;
        this.f1264e = null;
        this.f1265f = null;
    }
}
