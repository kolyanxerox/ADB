package com.ironsource;

/* renamed from: com.ironsource.j7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3246j7 implements InterfaceC3281k7 {

    /* renamed from: com.ironsource.j7$a */
    public static final class a extends AbstractC3246j7 {

        /* renamed from: a */
        private final b f9077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b firstReason) {
            super(null);
            kotlin.jvm.internal.OooOo.OooO0o0(firstReason, "firstReason");
            this.f9077a = firstReason;
        }

        /* renamed from: a */
        public static /* synthetic */ a m9448a(a aVar, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = aVar.f9077a;
            }
            return aVar.m9449a(bVar);
        }

        /* renamed from: d */
        public final b m9450d() {
            return this.f9077a;
        }

        /* renamed from: e */
        public final b m9451e() {
            return this.f9077a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.OooOo.OooO00o(this.f9077a, ((a) obj).f9077a);
        }

        public int hashCode() {
            return this.f9077a.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.f9077a + ')';
        }

        /* renamed from: a */
        public final a m9449a(b firstReason) {
            kotlin.jvm.internal.OooOo.OooO0o0(firstReason, "firstReason");
            return new a(firstReason);
        }
    }

    /* renamed from: com.ironsource.j7$b */
    public static abstract class b implements InterfaceC3281k7 {

        /* renamed from: com.ironsource.j7$b$a */
        public static final class a extends b {

            /* renamed from: a */
            public static final a f9078a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$b$b, reason: collision with other inner class name */
        public static final class C4577b extends b {

            /* renamed from: a */
            public static final C4577b f9079a = new C4577b();

            private C4577b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$b$c */
        public static final class c extends b {

            /* renamed from: a */
            public static final c f9080a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        @Override // com.ironsource.InterfaceC3281k7
        /* renamed from: a */
        public String mo9445a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C4577b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new OooOOO0.OooO00o();
        }

        public /* synthetic */ b(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.j7$c */
    public static final class c extends AbstractC3246j7 {

        /* renamed from: a */
        private final long f9081a;

        /* renamed from: b */
        private final d f9082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, d recurringReason) {
            super(null);
            kotlin.jvm.internal.OooOo.OooO0o0(recurringReason, "recurringReason");
            this.f9081a = j;
            this.f9082b = recurringReason;
        }

        /* renamed from: a */
        public final c m9453a(long j, d recurringReason) {
            kotlin.jvm.internal.OooOo.OooO0o0(recurringReason, "recurringReason");
            return new c(j, recurringReason);
        }

        /* renamed from: d */
        public final long m9454d() {
            return this.f9081a;
        }

        /* renamed from: e */
        public final d m9455e() {
            return this.f9082b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f9081a == cVar.f9081a && kotlin.jvm.internal.OooOo.OooO00o(this.f9082b, cVar.f9082b);
        }

        /* renamed from: f */
        public final d m9456f() {
            return this.f9082b;
        }

        /* renamed from: g */
        public final long m9457g() {
            return this.f9081a;
        }

        public int hashCode() {
            return this.f9082b.hashCode() + (Long.hashCode(this.f9081a) * 31);
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.f9081a + ", recurringReason=" + this.f9082b + ')';
        }

        /* renamed from: a */
        public static /* synthetic */ c m9452a(c cVar, long j, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                j = cVar.f9081a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.f9082b;
            }
            return cVar.m9453a(j, dVar);
        }
    }

    /* renamed from: com.ironsource.j7$d */
    public static abstract class d implements InterfaceC3281k7 {

        /* renamed from: com.ironsource.j7$d$a */
        public static final class a extends d {

            /* renamed from: a */
            public static final a f9083a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$d$b */
        public static final class b extends d {

            /* renamed from: a */
            public static final b f9084a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$d$c */
        public static final class c extends d {

            /* renamed from: a */
            public static final c f9085a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$d$d, reason: collision with other inner class name */
        public static final class C4578d extends d {

            /* renamed from: a */
            public static final C4578d f9086a = new C4578d();

            private C4578d() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$d$e */
        public static final class e extends d {

            /* renamed from: a */
            public static final e f9087a = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$d$f */
        public static final class f extends d {

            /* renamed from: a */
            private final long f9088a;

            public f(long j) {
                super(null);
                this.f9088a = j;
            }

            /* renamed from: a */
            public final f m9460a(long j) {
                return new f(j);
            }

            /* renamed from: c */
            public final long m9461c() {
                return this.f9088a;
            }

            /* renamed from: d */
            public final long m9462d() {
                return this.f9088a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f9088a == ((f) obj).f9088a;
            }

            public int hashCode() {
                return Long.hashCode(this.f9088a);
            }

            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f9088a + ')';
            }

            /* renamed from: a */
            public static /* synthetic */ f m9459a(f fVar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.f9088a;
                }
                return fVar.m9460a(j);
            }
        }

        /* renamed from: com.ironsource.j7$d$g */
        public static final class g extends d {

            /* renamed from: a */
            public static final g f9089a = new g();

            private g() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.j7$d$h */
        public static final class h extends d {

            /* renamed from: a */
            public static final h f9090a = new h();

            private h() {
                super(null);
            }
        }

        private d() {
        }

        @Override // com.ironsource.InterfaceC3281k7
        /* renamed from: a */
        public String mo9445a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C4578d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new OooOOO0.OooO00o();
        }

        /* renamed from: b */
        public final long m9458b() {
            if (this instanceof f) {
                return ((f) this).m9462d();
            }
            return 0L;
        }

        public /* synthetic */ d(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    private AbstractC3246j7() {
    }

    @Override // com.ironsource.InterfaceC3281k7
    /* renamed from: a */
    public String mo9445a() {
        if (this instanceof a) {
            return ((a) this).m9451e().mo9445a();
        }
        if (this instanceof c) {
            return ((c) this).m9456f().mo9445a();
        }
        throw new OooOOO0.OooO00o();
    }

    /* renamed from: b */
    public final long m9446b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).m9456f().m9458b();
        }
        throw new OooOOO0.OooO00o();
    }

    /* renamed from: c */
    public final long m9447c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).m9457g();
        }
        throw new OooOOO0.OooO00o();
    }

    public /* synthetic */ AbstractC3246j7(kotlin.jvm.internal.OooOO0O oooOO0O) {
        this();
    }
}
