package com.iab.omid.library.unity3d.internal;

import com.iab.omid.library.unity3d.adsession.C2580a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.unity3d.internal.c */
/* loaded from: classes2.dex */
public class C2590c {

    /* renamed from: c */
    private static C2590c f3752c = new C2590c();

    /* renamed from: a */
    private final ArrayList<C2580a> f3753a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C2580a> f3754b = new ArrayList<>();

    private C2590c() {
    }

    /* renamed from: c */
    public static C2590c m4538c() {
        return f3752c;
    }

    /* renamed from: a */
    public Collection<C2580a> m4539a() {
        return Collections.unmodifiableCollection(this.f3754b);
    }

    /* renamed from: b */
    public Collection<C2580a> m4541b() {
        return Collections.unmodifiableCollection(this.f3753a);
    }

    /* renamed from: d */
    public boolean m4544d() {
        return this.f3754b.size() > 0;
    }

    /* renamed from: a */
    public void m4540a(C2580a c2580a) {
        this.f3753a.add(c2580a);
    }

    /* renamed from: b */
    public void m4542b(C2580a c2580a) {
        boolean zM4544d = m4544d();
        this.f3753a.remove(c2580a);
        this.f3754b.remove(c2580a);
        if (!zM4544d || m4544d()) {
            return;
        }
        C2595h.m4578c().m4582e();
    }

    /* renamed from: c */
    public void m4543c(C2580a c2580a) {
        boolean zM4544d = m4544d();
        this.f3754b.add(c2580a);
        if (zM4544d) {
            return;
        }
        C2595h.m4578c().m4581d();
    }
}
