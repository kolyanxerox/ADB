package com.ironsource;

import com.ironsource.lifecycle.C3331b;

/* renamed from: com.ironsource.v3 */
/* loaded from: classes2.dex */
public final class C3755v3 extends AbstractC3231iq {

    /* renamed from: f */
    public static final a f12284f = new a(null);

    /* renamed from: g */
    private static final String f12285g = "AppLifecycleTrigger";

    /* renamed from: d */
    private final C3331b f12286d;

    /* renamed from: e */
    private final InterfaceC3737uk f12287e;

    /* renamed from: com.ironsource.v3$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.v3$b */
    public static final class b implements InterfaceC3737uk {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: a */
        public void mo4890a() {
            C3755v3.this.m9375a(false);
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: b */
        public void mo4891b() {
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: c */
        public void mo4892c() {
        }

        @Override // com.ironsource.InterfaceC3737uk
        /* renamed from: d */
        public void mo4893d() {
            C3755v3.this.m9375a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3755v3(C3331b lifeCycleObserver) {
        super(false, 1, null);
        kotlin.jvm.internal.OooOo.OooO0o0(lifeCycleObserver, "lifeCycleObserver");
        this.f12286d = lifeCycleObserver;
        b bVar = new b();
        this.f12287e = bVar;
        lifeCycleObserver.m9807a(bVar);
        m9375a(lifeCycleObserver.m9813e());
    }

    @Override // com.ironsource.AbstractC3231iq
    /* renamed from: b */
    public String mo7852b() {
        return f12285g;
    }

    /* renamed from: e */
    public final void m12731e() {
        this.f12286d.m9809b(this.f12287e);
    }
}
