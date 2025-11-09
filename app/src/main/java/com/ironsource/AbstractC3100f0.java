package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.f0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3100f0 {

    /* renamed from: c */
    public static final a f8473c = new a(null);

    /* renamed from: a */
    private final AbstractC3718u1 f8474a;

    /* renamed from: b */
    private final C3272jx f8475b;

    /* renamed from: com.ironsource.f0$a */
    public static final class a {

        /* renamed from: com.ironsource.f0$a$a */
        public /* synthetic */ class C4573a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8476a;

            static {
                int[] iArr = new int[EnumC3470nx.values().length];
                try {
                    iArr[EnumC3470nx.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3470nx.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8476a = iArr;
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final AbstractC3100f0 m8588a(AbstractC3718u1 adUnitData, C3272jx waterfallInstances) {
            kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
            kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
            int i = C4573a.f8476a[(adUnitData.m12509d() ? EnumC3470nx.BIDDER_SENSITIVE : EnumC3470nx.DEFAULT).ordinal()];
            if (i == 1) {
                return new C3793w7(adUnitData, waterfallInstances);
            }
            if (i == 2) {
                return adUnitData.m12521q() ? new C3607ru(adUnitData, waterfallInstances) : new C3249ja(adUnitData, waterfallInstances);
            }
            throw new OooOOO0.OooO00o();
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.f0$b */
    public static final class b {

        /* renamed from: a */
        private final List<AbstractC3887z> f8477a = new ArrayList();

        /* renamed from: b */
        private final List<AbstractC3887z> f8478b = new ArrayList();

        /* renamed from: c */
        private final List<AbstractC3887z> f8479c = new ArrayList();

        /* renamed from: d */
        private boolean f8480d;

        /* renamed from: a */
        public final List<AbstractC3887z> m8589a() {
            return this.f8477a;
        }

        /* renamed from: b */
        public final List<AbstractC3887z> m8591b() {
            return this.f8478b;
        }

        /* renamed from: c */
        public final List<AbstractC3887z> m8592c() {
            return this.f8479c;
        }

        /* renamed from: d */
        public final boolean m8593d() {
            return this.f8480d;
        }

        /* renamed from: e */
        public final boolean m8594e() {
            return m8596g() == 0;
        }

        /* renamed from: f */
        public final boolean m8595f() {
            return this.f8477a.isEmpty() && this.f8479c.isEmpty();
        }

        /* renamed from: g */
        public final int m8596g() {
            return this.f8479c.size() + this.f8478b.size() + this.f8477a.size();
        }

        /* renamed from: a */
        public final void m8590a(boolean z) {
            this.f8480d = z;
        }
    }

    /* renamed from: com.ironsource.f0$c */
    public static final class c {

        /* renamed from: a */
        private final AbstractC3887z f8481a;

        /* renamed from: b */
        private final List<AbstractC3887z> f8482b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC3887z abstractC3887z, List<? extends AbstractC3887z> orderedInstances) {
            kotlin.jvm.internal.OooOo.OooO0o0(orderedInstances, "orderedInstances");
            this.f8481a = abstractC3887z;
            this.f8482b = orderedInstances;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ c m8597a(c cVar, AbstractC3887z abstractC3887z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC3887z = cVar.f8481a;
            }
            if ((i & 2) != 0) {
                list = cVar.f8482b;
            }
            return cVar.m8598a(abstractC3887z, list);
        }

        /* renamed from: b */
        public final List<AbstractC3887z> m8600b() {
            return this.f8482b;
        }

        /* renamed from: c */
        public final AbstractC3887z m8601c() {
            return this.f8481a;
        }

        /* renamed from: d */
        public final List<AbstractC3887z> m8602d() {
            return this.f8482b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.OooOo.OooO00o(this.f8481a, cVar.f8481a) && kotlin.jvm.internal.OooOo.OooO00o(this.f8482b, cVar.f8482b);
        }

        public int hashCode() {
            AbstractC3887z abstractC3887z = this.f8481a;
            return this.f8482b.hashCode() + ((abstractC3887z == null ? 0 : abstractC3887z.hashCode()) * 31);
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f8481a + ", orderedInstances=" + this.f8482b + ')';
        }

        /* renamed from: a */
        public final c m8598a(AbstractC3887z abstractC3887z, List<? extends AbstractC3887z> orderedInstances) {
            kotlin.jvm.internal.OooOo.OooO0o0(orderedInstances, "orderedInstances");
            return new c(abstractC3887z, orderedInstances);
        }

        /* renamed from: a */
        public final AbstractC3887z m8599a() {
            return this.f8481a;
        }
    }

    /* renamed from: com.ironsource.f0$d */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return o00Oo0oo.o00oO0o.OooO0Oo(Integer.valueOf(((AbstractC3887z) t).m13270h().m9995l()), Integer.valueOf(((AbstractC3887z) t2).m13270h().m9995l()));
        }
    }

    public AbstractC3100f0(AbstractC3718u1 adUnitData, C3272jx waterfallInstances) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
        this.f8474a = adUnitData;
        this.f8475b = waterfallInstances;
    }

    /* renamed from: b */
    private final List<AbstractC3887z> m8579b() {
        return o00O0.OooOo00.Oooo0(this.f8475b.m9559b(), new d());
    }

    /* renamed from: a */
    public abstract void mo8581a(AbstractC3887z abstractC3887z, b bVar);

    /* renamed from: a */
    public boolean mo8583a(b loadSelection) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadSelection, "loadSelection");
        return loadSelection.m8596g() >= this.f8474a.m12515k();
    }

    /* renamed from: c */
    public final c m8586c() {
        Object next;
        List<AbstractC3887z> listM8579b = m8579b();
        Iterator<T> it = listM8579b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC3887z) next).m13283v()) {
                break;
            }
        }
        return new c((AbstractC3887z) next, listM8579b);
    }

    /* renamed from: d */
    public final b m8587d() {
        IronLog.INTERNAL.verbose(this.f8474a.mo9364b().m8434a().name() + " waterfall size: " + this.f8475b.m9559b().size());
        b bVar = new b();
        Iterator<AbstractC3887z> it = this.f8475b.m9559b().iterator();
        while (it.hasNext() && !m8580b(it.next(), bVar)) {
        }
        return bVar;
    }

    /* renamed from: b */
    private final boolean m8580b(AbstractC3887z abstractC3887z, b bVar) {
        IronLog ironLog;
        StringBuilder sb;
        String str;
        List<AbstractC3887z> listM8592c;
        if (!abstractC3887z.m13282u()) {
            if (abstractC3887z.m13283v()) {
                IronLog.INTERNAL.verbose(abstractC3887z.m13267d().name() + " - Instance " + abstractC3887z.m13277p() + " is already loaded");
                listM8592c = bVar.m8591b();
            } else if (abstractC3887z.m13284w()) {
                IronLog.INTERNAL.verbose(abstractC3887z.m13267d().name() + " - Instance " + abstractC3887z.m13277p() + " still loading");
                listM8592c = bVar.m8592c();
            } else {
                if (!mo8585a(abstractC3887z, this.f8475b)) {
                    mo8581a(abstractC3887z, bVar);
                    return mo8583a(bVar);
                }
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(abstractC3887z.m13267d().name());
                sb.append(" - Instance ");
                sb.append(abstractC3887z.m13277p());
                str = " is not better than already loaded instances";
            }
            listM8592c.add(abstractC3887z);
            return mo8583a(bVar);
        }
        ironLog = IronLog.INTERNAL;
        sb = new StringBuilder();
        sb.append(abstractC3887z.m13267d().name());
        sb.append(" - Instance ");
        sb.append(abstractC3887z.m13277p());
        str = " is failed to load";
        sb.append(str);
        ironLog.verbose(sb.toString());
        return mo8583a(bVar);
    }

    /* renamed from: a */
    public final boolean m8584a(AbstractC3887z instance) {
        Object next;
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        Iterator<T> it = m8579b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC3887z) next).m13282u()) {
                break;
            }
        }
        return kotlin.jvm.internal.OooOo.OooO00o(next, instance);
    }

    /* renamed from: a */
    public boolean mo8585a(AbstractC3887z instance, C3272jx waterfallInstances) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
        return false;
    }

    /* renamed from: a */
    public final boolean m8582a() {
        int i;
        List<AbstractC3887z> listM9559b = this.f8475b.m9559b();
        if (listM9559b == null || !listM9559b.isEmpty()) {
            Iterator<T> it = listM9559b.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC3887z) it.next()).m13283v() && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        } else {
            i = 0;
        }
        return i >= this.f8474a.m12515k();
    }
}
