package com.ironsource;

/* renamed from: com.ironsource.nq */
/* loaded from: classes2.dex */
public class C3463nq {

    /* renamed from: a */
    private boolean f10565a;

    /* renamed from: b */
    private boolean f10566b;

    /* renamed from: c */
    private boolean f10567c;

    /* renamed from: d */
    private EnumC3603rq f10568d;

    /* renamed from: e */
    private int f10569e;

    /* renamed from: f */
    private int f10570f;

    /* renamed from: com.ironsource.nq$b */
    public static class b {

        /* renamed from: a */
        private boolean f10571a = true;

        /* renamed from: b */
        private boolean f10572b = false;

        /* renamed from: c */
        private boolean f10573c = false;

        /* renamed from: d */
        private EnumC3603rq f10574d = null;

        /* renamed from: e */
        private int f10575e = 0;

        /* renamed from: f */
        private int f10576f = 0;

        /* renamed from: a */
        public b m11043a(boolean z) {
            this.f10571a = z;
            return this;
        }

        /* renamed from: a */
        public b m11044a(boolean z, int i) {
            this.f10573c = z;
            this.f10576f = i;
            return this;
        }

        /* renamed from: a */
        public b m11045a(boolean z, EnumC3603rq enumC3603rq, int i) {
            this.f10572b = z;
            if (enumC3603rq == null) {
                enumC3603rq = EnumC3603rq.PER_DAY;
            }
            this.f10574d = enumC3603rq;
            this.f10575e = i;
            return this;
        }

        /* renamed from: a */
        public C3463nq m11046a() {
            return new C3463nq(this.f10571a, this.f10572b, this.f10573c, this.f10574d, this.f10575e, this.f10576f);
        }
    }

    private C3463nq(boolean z, boolean z2, boolean z3, EnumC3603rq enumC3603rq, int i, int i2) {
        this.f10565a = z;
        this.f10566b = z2;
        this.f10567c = z3;
        this.f10568d = enumC3603rq;
        this.f10569e = i;
        this.f10570f = i2;
    }

    /* renamed from: a */
    public EnumC3603rq m11037a() {
        return this.f10568d;
    }

    /* renamed from: b */
    public int m11038b() {
        return this.f10569e;
    }

    /* renamed from: c */
    public int m11039c() {
        return this.f10570f;
    }

    /* renamed from: d */
    public boolean m11040d() {
        return this.f10566b;
    }

    /* renamed from: e */
    public boolean m11041e() {
        return this.f10565a;
    }

    /* renamed from: f */
    public boolean m11042f() {
        return this.f10567c;
    }
}
