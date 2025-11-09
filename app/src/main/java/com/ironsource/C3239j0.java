package com.ironsource;

import com.ironsource.C3473o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.j0 */
/* loaded from: classes2.dex */
public final class C3239j0 {

    /* renamed from: a */
    private final int f9052a;

    /* renamed from: b */
    private final List<C3170h0> f9053b = new CopyOnWriteArrayList();

    public C3239j0(int i) {
        this.f9052a = i;
    }

    /* renamed from: b */
    private final boolean m9401b() {
        return this.f9052a == 0;
    }

    /* renamed from: c */
    private final boolean m9402c() {
        return this.f9052a != -1;
    }

    /* renamed from: a */
    public final void m9403a(C3170h0 c3170h0) {
        if (m9401b()) {
            return;
        }
        if (m9400a()) {
            List<C3170h0> list = this.f9053b;
            kotlin.jvm.internal.OooOo.OooO0o0(list, "<this>");
            if (!list.isEmpty()) {
                list.remove(0);
            }
        }
        if (c3170h0 == null) {
            c3170h0 = new C3170h0(C3473o1.a.NotPartOfWaterfall);
        }
        this.f9053b.add(c3170h0);
    }

    /* renamed from: d */
    public final String m9404d() {
        List<C3170h0> list = this.f9053b;
        ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C3170h0) it.next()).m9029b().ordinal()));
        }
        return o00O0.OooOo00.OooOooo(arrayList, ",", null, null, null, 62);
    }

    /* renamed from: a */
    private final boolean m9400a() {
        return m9402c() && this.f9053b.size() >= this.f9052a;
    }
}
