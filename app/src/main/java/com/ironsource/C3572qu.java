package com.ironsource;

import com.ironsource.InterfaceC3452nf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.qu */
/* loaded from: classes2.dex */
public final class C3572qu implements InterfaceC3452nf, InterfaceC3452nf.a {

    /* renamed from: a */
    private final InterfaceC3621s9 f11154a;

    /* renamed from: b */
    private final InterfaceC3420mi f11155b;

    /* renamed from: c */
    private final Map<String, C3467nu> f11156c;

    /* renamed from: com.ironsource.qu$a */
    public static final class a {

        /* renamed from: a */
        private int f11157a;

        /* renamed from: b */
        private long f11158b;

        /* renamed from: c */
        private Long f11159c;

        public a(int i, long j, Long l) {
            this.f11157a = i;
            this.f11158b = j;
            this.f11159c = l;
        }

        /* renamed from: a */
        public final int m11650a() {
            return this.f11157a;
        }

        /* renamed from: b */
        public final long m11655b() {
            return this.f11158b;
        }

        /* renamed from: c */
        public final Long m11656c() {
            return this.f11159c;
        }

        /* renamed from: d */
        public final int m11657d() {
            return this.f11157a;
        }

        /* renamed from: e */
        public final long m11658e() {
            return this.f11158b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11157a == aVar.f11157a && this.f11158b == aVar.f11158b && kotlin.jvm.internal.OooOo.OooO00o(this.f11159c, aVar.f11159c);
        }

        /* renamed from: f */
        public final Long m11659f() {
            return this.f11159c;
        }

        public int hashCode() {
            int iHashCode = (Long.hashCode(this.f11158b) + (Integer.hashCode(this.f11157a) * 31)) * 31;
            Long l = this.f11159c;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f11157a + ", currentTime=" + this.f11158b + ", currentTimeThreshold=" + this.f11159c + ')';
        }

        /* renamed from: a */
        public final a m11651a(int i, long j, Long l) {
            return new a(i, j, l);
        }

        /* renamed from: a */
        public static /* synthetic */ a m11649a(a aVar, int i, long j, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f11157a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.f11158b;
            }
            if ((i2 & 4) != 0) {
                l = aVar.f11159c;
            }
            return aVar.m11651a(i, j, l);
        }

        /* renamed from: a */
        public final void m11652a(int i) {
            this.f11157a = i;
        }

        /* renamed from: a */
        public final void m11653a(long j) {
            this.f11158b = j;
        }

        /* renamed from: a */
        public final void m11654a(Long l) {
            this.f11159c = l;
        }
    }

    public C3572qu(InterfaceC3621s9 currentTimeProvider, InterfaceC3420mi serviceDataRepository) {
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(serviceDataRepository, "serviceDataRepository");
        this.f11154a = currentTimeProvider;
        this.f11155b = serviceDataRepository;
        this.f11156c = new LinkedHashMap();
    }

    /* renamed from: c */
    private final a m11647c(String str) {
        return new a(this.f11155b.mo10814a(str), this.f11154a.mo11889a(), this.f11155b.mo10817b(str));
    }

    @Override // com.ironsource.InterfaceC3452nf
    /* renamed from: a */
    public C3445n8 mo7975a(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        C3467nu c3467nu = this.f11156c.get(identifier);
        if (c3467nu != null && m11646a(c3467nu, identifier)) {
            return new C3445n8(true, EnumC3515p8.ShowCount);
        }
        return new C3445n8(false, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo7978b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.OooOo.OooO0o0(r9, r0)
            java.util.Map<java.lang.String, com.ironsource.nu> r0 = r8.f11156c
            java.lang.Object r0 = r0.get(r9)
            com.ironsource.nu r0 = (com.ironsource.C3467nu) r0
            if (r0 != 0) goto L10
            return
        L10:
            com.ironsource.qu$a r1 = r8.m11647c(r9)
            int r2 = r1.m11657d()
            r3 = 1
            if (r2 == 0) goto L30
            long r4 = r1.m11658e()
            java.lang.Long r2 = r1.m11659f()
            if (r2 == 0) goto L2a
            long r6 = r2.longValue()
            goto L2c
        L2a:
            r6 = 0
        L2c:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L47
        L30:
            long r4 = r1.m11658e()
            com.ironsource.o8 r0 = r0.m11059b()
            r2 = 0
            long r6 = com.ironsource.EnumC3480o8.m11122a(r0, r2, r3, r2)
            long r6 = r6 + r4
            com.ironsource.mi r0 = r8.f11155b
            r0.mo10816a(r6, r9)
            r0 = 0
            r1.m11652a(r0)
        L47:
            int r0 = r1.m11657d()
            int r0 = r0 + r3
            r1.m11652a(r0)
            com.ironsource.mi r0 = r8.f11155b
            int r1 = r1.m11657d()
            r0.mo10815a(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3572qu.mo7978b(java.lang.String):void");
    }

    /* renamed from: a */
    public final Map<String, C3467nu> m11648a() {
        return this.f11156c;
    }

    /* renamed from: a */
    private final boolean m11646a(C3467nu c3467nu, String str) {
        a aVarM11647c = m11647c(str);
        Long lM11659f = aVarM11647c.m11659f();
        if (lM11659f != null) {
            long jLongValue = lM11659f.longValue();
            if (aVarM11647c.m11657d() >= c3467nu.m11058a() && this.f11154a.mo11889a() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3452nf.a
    /* renamed from: a */
    public Object mo7976a(String identifier, EnumC3515p8 cappingType, InterfaceC3324lf cappingConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        kotlin.jvm.internal.OooOo.OooO0o0(cappingType, "cappingType");
        kotlin.jvm.internal.OooOo.OooO0o0(cappingConfig, "cappingConfig");
        Object objMo8921c = cappingConfig.mo8921c();
        boolean z = objMo8921c instanceof oo00o.OooOO0O;
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        if (z) {
            Throwable thOooO00o = oo00o.OooOOO0.OooO00o(objMo8921c);
            if (thOooO00o != null) {
                return o00O0.o000OOo.OooO0O0(thOooO00o);
            }
        } else {
            C3467nu c3467nu = (C3467nu) objMo8921c;
            if (c3467nu != null) {
                this.f11156c.put(identifier, c3467nu);
                return oooOo;
            }
        }
        return oooOo;
    }
}
