package com.ironsource;

import com.ironsource.AbstractC3619s7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.rx */
/* loaded from: classes2.dex */
public abstract class AbstractC3610rx<Smash extends AbstractC3619s7<?>> {

    /* renamed from: g */
    public static final a f11231g = new a(null);

    /* renamed from: a */
    private final int f11232a;

    /* renamed from: b */
    private final boolean f11233b;

    /* renamed from: c */
    private final List<Smash> f11234c;

    /* renamed from: d */
    private final List<Smash> f11235d;

    /* renamed from: e */
    private final List<Smash> f11236e;

    /* renamed from: f */
    private final List<Smash> f11237f;

    /* renamed from: com.ironsource.rx$a */
    public static final class a {

        /* renamed from: com.ironsource.rx$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4581a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11238a;

            static {
                int[] iArr = new int[EnumC3470nx.values().length];
                try {
                    iArr[EnumC3470nx.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3470nx.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11238a = iArr;
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final <Smash extends AbstractC3619s7<?>> AbstractC3610rx<Smash> m11782a(EnumC3470nx loadingStrategy, int i, boolean z, List<? extends Smash> waterfall) {
            kotlin.jvm.internal.OooOo.OooO0o0(loadingStrategy, "loadingStrategy");
            kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
            int i2 = C4581a.f11238a[loadingStrategy.ordinal()];
            if (i2 == 1) {
                return new C3358ma(i, z, waterfall);
            }
            if (i2 != 2) {
                throw new OooOOO0.OooO00o();
            }
            return new C3827x7(i, z, waterfall, false, 8, null);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3610rx(int i, boolean z, List<? extends Smash> waterfall) {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        this.f11232a = i;
        this.f11233b = z;
        this.f11234c = waterfall;
        this.f11235d = new ArrayList();
        this.f11236e = new ArrayList();
        this.f11237f = new ArrayList();
    }

    /* renamed from: a */
    private final int m11774a(Smash smash) {
        return smash.m11870i().m9995l();
    }

    /* renamed from: b */
    private final int m11775b() {
        Integer num;
        List<Smash> list = this.f11234c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC3619s7) obj).m11883y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(m11774a((AbstractC3619s7) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(m11774a((AbstractC3619s7) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public final List<Smash> m11778c() {
        return this.f11235d;
    }

    /* renamed from: c */
    public abstract void mo10013c(Smash smash);

    /* renamed from: d */
    public final int m11779d() {
        return this.f11237f.size() + this.f11236e.size() + this.f11235d.size();
    }

    /* renamed from: e */
    public boolean mo11781e() {
        return m11779d() >= this.f11232a;
    }

    /* renamed from: b */
    private final boolean m11776b(Smash smash) {
        return m11775b() < m11774a(smash);
    }

    /* renamed from: a */
    public final List<Smash> m11777a() {
        return this.f11237f;
    }

    /* renamed from: d */
    public final void m11780d(Smash smash) {
        kotlin.jvm.internal.OooOo.OooO0o0(smash, "smash");
        if (smash.m11882x()) {
            IronLog.INTERNAL.verbose(smash.m11868g().name() + " - smash " + smash.m11872k() + " is failed to load");
            return;
        }
        if (smash.m11883y()) {
            IronLog.INTERNAL.verbose(smash.m11868g().name() + " - Smash " + smash.m11872k() + " is already loaded");
            this.f11236e.add(smash);
            return;
        }
        if (smash.m11884z()) {
            IronLog.INTERNAL.verbose(smash.m11868g().name() + " - Smash " + smash.m11872k() + " still loading");
            this.f11237f.add(smash);
            return;
        }
        if (smash.m11856A().get()) {
            IronLog.INTERNAL.verbose(smash.m11868g().name() + " - Smash " + smash.m11872k() + " marked as loading candidate");
            this.f11237f.add(smash);
            return;
        }
        if (!this.f11233b || !m11776b(smash)) {
            mo10013c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.m11868g().name() + " - Smash " + smash.m11872k() + " is not better than already loaded smashes");
    }
}
