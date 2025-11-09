package com.ironsource;

/* renamed from: com.ironsource.l9 */
/* loaded from: classes2.dex */
public interface InterfaceC3318l9 {

    /* renamed from: com.ironsource.l9$a */
    public static final class a implements InterfaceC3318l9 {

        /* renamed from: a */
        private final boolean f9308a;

        public a(boolean z) {
            this.f9308a = z;
        }

        @Override // com.ironsource.InterfaceC3318l9
        /* renamed from: a */
        public void mo9751a() {
            C3699th.m12428a(C3198hs.f8939x, new C3489oh().m11155a(C3037dc.f8270y, Boolean.valueOf(this.f9308a)).m11156a());
        }
    }

    /* renamed from: com.ironsource.l9$b */
    public static final class b implements InterfaceC3318l9 {

        /* renamed from: a */
        private final boolean f9309a;

        /* renamed from: b */
        private final long f9310b;

        /* renamed from: c */
        private final InterfaceC3621s9 f9311c;

        public b(boolean z, long j, InterfaceC3621s9 currentTimeProvider) {
            kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
            this.f9309a = z;
            this.f9310b = j;
            this.f9311c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC3318l9
        /* renamed from: a */
        public void mo9751a() {
            C3489oh c3489ohM11155a = new C3489oh().m11155a(C3037dc.f8270y, Boolean.valueOf(this.f9309a));
            if (this.f9310b > 0) {
                c3489ohM11155a.m11155a(C3037dc.f8226B, Long.valueOf(this.f9311c.mo11889a() - this.f9310b));
            }
            C3699th.m12428a(C3198hs.f8938w, c3489ohM11155a.m11156a());
        }

        /* renamed from: b */
        public final InterfaceC3621s9 m9752b() {
            return this.f9311c;
        }
    }

    /* renamed from: a */
    void mo9751a();
}
