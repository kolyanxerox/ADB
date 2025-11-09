package com.applovin.impl.sdk;

import OooOo0o.o000oOoO;
import com.applovin.impl.C1008d7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.InterfaceC1185s1;
import com.applovin.impl.sdk.C1205a;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.b */
/* loaded from: classes.dex */
public class C1211b {

    /* renamed from: a */
    private final C1220k f2015a;

    /* renamed from: b */
    private final WeakReference f2016b;

    /* renamed from: c */
    private final WeakReference f2017c;

    /* renamed from: d */
    private C1008d7 f2018d;

    private C1211b(InterfaceC1185s1 interfaceC1185s1, C1205a.a aVar, C1220k c1220k) {
        this.f2016b = new WeakReference(interfaceC1185s1);
        this.f2017c = new WeakReference(aVar);
        this.f2015a = c1220k;
    }

    /* renamed from: a */
    public static C1211b m2655a(InterfaceC1185s1 interfaceC1185s1, C1205a.a aVar, C1220k c1220k) {
        C1211b c1211b = new C1211b(interfaceC1185s1, aVar, c1220k);
        c1211b.m2658a(interfaceC1185s1.getTimeToLiveMillis());
        return c1211b;
    }

    /* renamed from: c */
    public /* synthetic */ void m2656c() {
        m2660d();
        this.f2015a.m2895f().m2479a(this);
    }

    /* renamed from: b */
    public InterfaceC1185s1 m2659b() {
        return (InterfaceC1185s1) this.f2016b.get();
    }

    /* renamed from: d */
    public void m2660d() {
        m2657a();
        InterfaceC1185s1 interfaceC1185s1M2659b = m2659b();
        if (interfaceC1185s1M2659b == null) {
            return;
        }
        interfaceC1185s1M2659b.setExpired();
        C1205a.a aVar = (C1205a.a) this.f2017c.get();
        if (aVar == null) {
            return;
        }
        aVar.onAdExpired(interfaceC1185s1M2659b);
    }

    /* renamed from: a */
    public void m2658a(long j) {
        m2657a();
        if (((Boolean) this.f2015a.m2866a(C1268v4.f2739a1)).booleanValue() || !this.f2015a.m2911n0().isApplicationPaused()) {
            this.f2018d = C1008d7.m629a(j, this.f2015a, new o000oOoO(this, 10));
        }
    }

    /* renamed from: a */
    public void m2657a() {
        C1008d7 c1008d7 = this.f2018d;
        if (c1008d7 != null) {
            c1008d7.m640a();
            this.f2018d = null;
        }
    }
}
