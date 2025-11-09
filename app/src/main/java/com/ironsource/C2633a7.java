package com.ironsource;

import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.C3350m2;
import com.ironsource.lifecycle.C3331b;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.a7 */
/* loaded from: classes2.dex */
public final class C2633a7 {

    /* renamed from: a */
    private final C3350m2 f3895a;

    /* renamed from: b */
    private final C3137g2 f3896b;

    /* renamed from: c */
    private final InterfaceC3106f6 f3897c;

    /* renamed from: d */
    private final oo00o.OooO0OO f3898d;

    /* renamed from: e */
    private final oo00o.OooO0OO f3899e;

    /* renamed from: f */
    private final boolean f3900f;

    /* renamed from: g */
    private final boolean f3901g;

    /* renamed from: h */
    private final boolean f3902h;

    /* renamed from: com.ironsource.a7$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {
        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final C3876ym invoke() {
            return new C3876ym(new OooO00o(C2633a7.this, 0), C3331b.m9799d(), new C3097ew());
        }

        /* renamed from: a */
        public static final void m4789a(C2633a7 this$0) {
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            this$0.f3897c.mo8640e();
        }
    }

    /* renamed from: com.ironsource.a7$b */
    public static final class b extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {
        public b() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final C3876ym invoke() {
            return new C3876ym(new OooO00o(C2633a7.this, 1), C3331b.m9799d(), new C3097ew());
        }

        /* renamed from: a */
        public static final void m4791a(C2633a7 this$0) {
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            this$0.f3897c.mo8641f();
        }
    }

    public C2633a7(C3350m2 loadingData, C3137g2 interactionData, InterfaceC3106f6 mListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadingData, "loadingData");
        kotlin.jvm.internal.OooOo.OooO0o0(interactionData, "interactionData");
        kotlin.jvm.internal.OooOo.OooO0o0(mListener, "mListener");
        this.f3895a = loadingData;
        this.f3896b = interactionData;
        this.f3897c = mListener;
        this.f3898d = o0OOO0.OooO0oo(new a());
        this.f3899e = o0OOO0.OooO0oo(new b());
        this.f3900f = loadingData.m9975b() > 0;
        this.f3901g = interactionData.m8857b() > 0;
        this.f3902h = loadingData.m9974a() == C3350m2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    /* renamed from: c */
    private final C3876ym m4781c() {
        return (C3876ym) this.f3898d.getValue();
    }

    /* renamed from: d */
    private final C3876ym m4782d() {
        return (C3876ym) this.f3899e.getValue();
    }

    /* renamed from: f */
    private final void m4783f() {
        if (this.f3902h) {
            m4781c().m13216b();
        }
    }

    /* renamed from: g */
    private final void m4784g() {
        if (this.f3902h) {
            m4782d().m13216b();
        }
    }

    /* renamed from: b */
    public final void m4786b() {
        IronLog.INTERNAL.verbose();
        m4784g();
    }

    /* renamed from: e */
    public final void m4787e() {
        IronLog.INTERNAL.verbose();
        m4780b(this.f3896b.m8857b());
    }

    /* renamed from: h */
    public final void m4788h() {
        if (!this.f3900f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            IronLog.INTERNAL.verbose();
            m4779a(this.f3895a.m9975b());
        }
    }

    /* renamed from: b */
    private final void m4780b(long j) {
        if (this.f3902h && this.f3901g) {
            m4782d().m13215a(j);
        }
    }

    /* renamed from: a */
    public final void m4785a() {
        IronLog.INTERNAL.verbose();
        m4783f();
    }

    /* renamed from: a */
    private final void m4779a(long j) {
        if (this.f3902h && this.f3900f) {
            m4781c().m13215a(j);
        }
    }
}
