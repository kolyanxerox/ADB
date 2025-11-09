package com.iab.omid.library.applovin.internal;

import com.iab.omid.library.applovin.adsession.C2480a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.applovin.internal.c */
/* loaded from: classes2.dex */
public class C2490c {

    /* renamed from: c */
    private static C2490c f3481c = new C2490c();

    /* renamed from: a */
    private final ArrayList<C2480a> f3482a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C2480a> f3483b = new ArrayList<>();

    private C2490c() {
    }

    /* renamed from: c */
    public static C2490c m4029c() {
        return f3481c;
    }

    /* renamed from: a */
    public Collection<C2480a> m4030a() {
        return Collections.unmodifiableCollection(this.f3483b);
    }

    /* renamed from: b */
    public Collection<C2480a> m4032b() {
        return Collections.unmodifiableCollection(this.f3482a);
    }

    /* renamed from: d */
    public boolean m4035d() {
        return this.f3483b.size() > 0;
    }

    /* renamed from: a */
    public void m4031a(C2480a c2480a) {
        this.f3482a.add(c2480a);
    }

    /* renamed from: b */
    public void m4033b(C2480a c2480a) {
        boolean zM4035d = m4035d();
        this.f3482a.remove(c2480a);
        this.f3483b.remove(c2480a);
        if (!zM4035d || m4035d()) {
            return;
        }
        C2496i.m4077c().m4081e();
    }

    /* renamed from: c */
    public void m4034c(C2480a c2480a) {
        boolean zM4035d = m4035d();
        this.f3483b.add(c2480a);
        if (zM4035d) {
            return;
        }
        C2496i.m4077c().m4080d();
    }
}
