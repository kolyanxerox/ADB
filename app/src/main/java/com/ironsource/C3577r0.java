package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.r0 */
/* loaded from: classes2.dex */
public final class C3577r0 implements InterfaceC3749uw {

    /* renamed from: a */
    private final String f11164a;

    /* renamed from: b */
    private final InterfaceC3009cj f11165b;

    /* renamed from: c */
    private final boolean f11166c;

    /* renamed from: com.ironsource.r0$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f11167a = new a();

        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12884r();
        }
    }

    /* renamed from: com.ironsource.r0$b */
    public static final class b extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final b f11168a = new b();

        public b() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12881o();
        }
    }

    /* renamed from: com.ironsource.r0$c */
    public static final class c extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final c f11169a = new c();

        public c() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12880n();
        }
    }

    /* renamed from: com.ironsource.r0$d */
    public static final class d extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final d f11170a = new d();

        public d() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12883q();
        }
    }

    /* renamed from: com.ironsource.r0$e */
    public static final class e extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final e f11171a = new e();

        public e() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12881o();
        }
    }

    /* renamed from: com.ironsource.r0$f */
    public static final class f extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final f f11172a = new f();

        public f() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12873g();
        }
    }

    public C3577r0(String adm, InterfaceC3009cj interfaceC3009cj, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(adm, "adm");
        this.f11164a = adm;
        this.f11165b = interfaceC3009cj;
        this.f11166c = z;
    }

    @Override // com.ironsource.InterfaceC3749uw
    /* renamed from: a */
    public void mo8283a() throws C3605rs {
        m12724a(this.f11166c, a.f11167a);
        m12724a(this.f11165b != null, b.f11168a);
        InterfaceC3009cj interfaceC3009cj = this.f11165b;
        if (interfaceC3009cj != null) {
            if (interfaceC3009cj.mo7858c() == EnumC3079ej.NonBidder) {
                m12724a(this.f11164a.length() == 0, c.f11169a);
            }
            if (interfaceC3009cj.mo7858c() == EnumC3079ej.Bidder) {
                m12724a(this.f11164a.length() > 0, d.f11170a);
            }
            m12724a(interfaceC3009cj.mo7858c() != EnumC3079ej.NotSupported, e.f11171a);
            m12724a(interfaceC3009cj.mo7857b().length() > 0, f.f11172a);
        }
    }
}
