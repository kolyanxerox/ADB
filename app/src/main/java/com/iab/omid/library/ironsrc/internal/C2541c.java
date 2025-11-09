package com.iab.omid.library.ironsrc.internal;

import com.iab.omid.library.ironsrc.adsession.C2531a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.ironsrc.internal.c */
/* loaded from: classes2.dex */
public class C2541c {

    /* renamed from: c */
    private static C2541c f3616c = new C2541c();

    /* renamed from: a */
    private final ArrayList<C2531a> f3617a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C2531a> f3618b = new ArrayList<>();

    private C2541c() {
    }

    /* renamed from: c */
    public static C2541c m4282c() {
        return f3616c;
    }

    /* renamed from: a */
    public Collection<C2531a> m4283a() {
        return Collections.unmodifiableCollection(this.f3618b);
    }

    /* renamed from: b */
    public Collection<C2531a> m4285b() {
        return Collections.unmodifiableCollection(this.f3617a);
    }

    /* renamed from: d */
    public boolean m4288d() {
        return this.f3618b.size() > 0;
    }

    /* renamed from: a */
    public void m4284a(C2531a c2531a) {
        this.f3617a.add(c2531a);
    }

    /* renamed from: b */
    public void m4286b(C2531a c2531a) {
        boolean zM4288d = m4288d();
        this.f3617a.remove(c2531a);
        this.f3618b.remove(c2531a);
        if (!zM4288d || m4288d()) {
            return;
        }
        C2547i.m4330c().m4334e();
    }

    /* renamed from: c */
    public void m4287c(C2531a c2531a) {
        boolean zM4288d = m4288d();
        this.f3618b.add(c2531a);
        if (zM4288d) {
            return;
        }
        C2547i.m4330c().m4333d();
    }
}
