package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.jx */
/* loaded from: classes2.dex */
public final class C3272jx {

    /* renamed from: a */
    private final List<AbstractC3887z> f9188a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3272jx(List<? extends AbstractC3887z> instances) {
        kotlin.jvm.internal.OooOo.OooO0o0(instances, "instances");
        this.f9188a = instances;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3272jx m9555a(C3272jx c3272jx, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c3272jx.f9188a;
        }
        return c3272jx.m9557a(list);
    }

    /* renamed from: b */
    public final List<AbstractC3887z> m9559b() {
        return this.f9188a;
    }

    /* renamed from: c */
    public final int m9560c() {
        return this.f9188a.size();
    }

    /* renamed from: d */
    public final String m9561d() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC3887z abstractC3887z : this.f9188a) {
            arrayList.add(m9556a(abstractC3887z.m13270h(), abstractC3887z.m13278q()));
        }
        return o00O0.OooOo00.OooOooo(arrayList, ",", null, null, null, 62);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3272jx) && kotlin.jvm.internal.OooOo.OooO00o(this.f9188a, ((C3272jx) obj).f9188a);
    }

    public int hashCode() {
        return this.f9188a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.f9188a + ')';
    }

    /* renamed from: a */
    public final C3272jx m9557a(List<? extends AbstractC3887z> instances) {
        kotlin.jvm.internal.OooOo.OooO0o0(instances, "instances");
        return new C3272jx(instances);
    }

    /* renamed from: a */
    private final String m9556a(C3353m5 c3353m5, int i) {
        return String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c3353m5.m9986c()}, 2));
    }

    /* renamed from: a */
    public final List<AbstractC3887z> m9558a() {
        return this.f9188a;
    }
}
