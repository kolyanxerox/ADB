package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.c1 */
/* loaded from: classes.dex */
public class C0992c1 extends AbstractViewOnClickListenerC1152p2 {

    /* renamed from: e */
    private C1220k f458e;

    /* renamed from: f */
    private List f459f;

    /* renamed from: g */
    private final AtomicBoolean f460g;

    /* renamed from: h */
    private List f461h;

    /* renamed from: com.applovin.impl.c1$a */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public C0992c1(Context context) {
        super(context);
        this.f460g = new AtomicBoolean();
        this.f461h = new ArrayList();
    }

    /* renamed from: a */
    public void m444a(List list, C1220k c1220k) {
        Activity activityM2926v0;
        this.f458e = c1220k;
        this.f459f = list;
        if (!(this.f1703a instanceof Activity) && (activityM2926v0 = c1220k.m2926v0()) != null) {
            this.f1703a = activityM2926v0;
        }
        if (list != null && this.f460g.compareAndSet(false, true)) {
            this.f461h = m443a(this.f459f);
        }
        AppLovinSdkUtils.runOnUiThread(new o0OO00O(this, 4));
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: b */
    public int mo131b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: c */
    public List mo132c(int i) {
        return this.f461h;
    }

    /* renamed from: d */
    public List m445d() {
        return this.f459f;
    }

    /* renamed from: e */
    public C1220k m446e() {
        return this.f458e;
    }

    /* renamed from: f */
    public boolean m447f() {
        return this.f461h.size() == 0;
    }

    /* renamed from: g */
    public void m448g() {
        this.f460g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f460g.get() + "}";
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: d */
    public int mo133d(int i) {
        return this.f461h.size();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: e */
    public C1143o2 mo134e(int i) {
        return new C1250t4("RECENT ADS");
    }

    /* renamed from: a */
    private List m443a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1142o1((C1151p1) it.next(), this.f1703a));
        }
        return arrayList;
    }
}
