package com.ironsource;

import com.ironsource.C3132fw;

/* renamed from: com.ironsource.dw */
/* loaded from: classes2.dex */
public interface InterfaceC3057dw {

    /* renamed from: com.ironsource.dw$a */
    public interface a {
        /* renamed from: a */
        void mo8100a();
    }

    /* renamed from: com.ironsource.dw$b */
    public static final class b {

        /* renamed from: a */
        private long f8340a;

        /* renamed from: b */
        private long f8341b;

        /* renamed from: a */
        public final long m8417a() {
            return this.f8341b;
        }

        /* renamed from: b */
        public final long m8419b() {
            return this.f8340a;
        }

        /* renamed from: a */
        public final void m8418a(long j) {
            this.f8341b = j;
        }

        /* renamed from: b */
        public final void m8420b(long j) {
            this.f8340a = j;
        }
    }

    /* renamed from: com.ironsource.dw$c */
    public interface c {
        /* renamed from: a */
        InterfaceC3057dw mo8421a(b bVar);
    }

    /* renamed from: com.ironsource.dw$d */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC3057dw.c
        /* renamed from: a */
        public InterfaceC3057dw mo8421a(b timerConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(timerConfig, "timerConfig");
            return new e(new C3132fw(timerConfig.m8419b()));
        }
    }

    /* renamed from: com.ironsource.dw$e */
    public static final class e implements InterfaceC3057dw {

        /* renamed from: a */
        private final C3132fw f8342a;

        /* renamed from: com.ironsource.dw$e$a */
        public static final class a implements C3132fw.a {

            /* renamed from: a */
            final /* synthetic */ a f8343a;

            public a(a aVar) {
                this.f8343a = aVar;
            }

            @Override // com.ironsource.C3132fw.a
            /* renamed from: a */
            public void mo8422a() {
                this.f8343a.mo8100a();
            }
        }

        public e(C3132fw timer) {
            kotlin.jvm.internal.OooOo.OooO0o0(timer, "timer");
            this.f8342a = timer;
        }

        @Override // com.ironsource.InterfaceC3057dw
        /* renamed from: a */
        public void mo8416a(a callback) {
            kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
            this.f8342a.m8827a((C3132fw.a) new a(callback));
        }

        @Override // com.ironsource.InterfaceC3057dw
        public void cancel() {
            this.f8342a.m8828e();
        }
    }

    /* renamed from: a */
    void mo8416a(a aVar);

    void cancel();
}
