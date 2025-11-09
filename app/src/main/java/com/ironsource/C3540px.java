package com.ironsource;

import com.ironsource.AbstractC3619s7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.px */
/* loaded from: classes2.dex */
public final class C3540px<Smash extends AbstractC3619s7<?>> {

    /* renamed from: a */
    private final C3682t0 f10862a;

    /* renamed from: com.ironsource.px$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return o00Oo0oo.o00oO0o.OooO0Oo(Integer.valueOf(((AbstractC3619s7) t).m11870i().m9995l()), Integer.valueOf(((AbstractC3619s7) t2).m11870i().m9995l()));
        }
    }

    public C3540px(C3682t0 managerData) {
        kotlin.jvm.internal.OooOo.OooO0o0(managerData, "managerData");
        this.f10862a = managerData;
    }

    /* renamed from: a */
    public final boolean m11462a(AbstractC3619s7<?> smash, List<? extends Smash> waterfall) {
        Object next;
        kotlin.jvm.internal.OooOo.OooO0o0(smash, "smash");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        Iterator<T> it = m11464b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC3619s7) next).m11882x()) {
                break;
            }
        }
        return kotlin.jvm.internal.OooOo.OooO00o(next, smash);
    }

    /* renamed from: b */
    public final List<Smash> m11464b(List<? extends Smash> waterfall) {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        return o00O0.OooOo00.Oooo0(waterfall, new a());
    }

    /* renamed from: c */
    public final Smash m11465c(List<? extends Smash> waterfall) {
        Object next;
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        Iterator<T> it = m11464b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC3619s7) next).mo11119B()) {
                break;
            }
        }
        return (Smash) next;
    }

    /* renamed from: d */
    public final C3575qx<Smash> m11466d(List<? extends Smash> waterfall) {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.f10862a.m12333b().name() + " waterfall size: " + waterfall.size());
        AbstractC3610rx<Smash> abstractC3610rxM11782a = AbstractC3610rx.f11231g.m11782a(this.f10862a.m12335c() ? EnumC3470nx.BIDDER_SENSITIVE : EnumC3470nx.DEFAULT, this.f10862a.m12341i(), this.f10862a.m12344m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            abstractC3610rxM11782a.m11780d(it.next());
            if (abstractC3610rxM11782a.mo11781e()) {
                return new C3575qx<>(abstractC3610rxM11782a);
            }
        }
        return new C3575qx<>(abstractC3610rxM11782a);
    }

    /* renamed from: a */
    public final boolean m11463a(List<? extends Smash> waterfall) {
        int i;
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        if (waterfall.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC3619s7) it.next()).m11883y() && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i >= this.f10862a.m12341i();
    }
}
