package com.ironsource;

import com.ironsource.InterfaceC2970bf;
import com.ironsource.InterfaceC3057dw;
import com.ironsource.InterfaceC3868ye;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.j9 */
/* loaded from: classes2.dex */
public interface InterfaceC3248j9 {

    /* renamed from: a */
    public static final c f9094a = c.f9101a;

    /* renamed from: com.ironsource.j9$a */
    public static final class a implements InterfaceC3248j9 {

        /* renamed from: b */
        private final InterfaceC3834xe f9095b;

        /* renamed from: c */
        private final InterfaceC3057dw f9096c;

        /* renamed from: d */
        private final AtomicBoolean f9097d;

        /* renamed from: com.ironsource.j9$a$a, reason: collision with other inner class name */
        public static final class C4579a implements InterfaceC3057dw.a {

            /* renamed from: a */
            final /* synthetic */ d f9098a;

            /* renamed from: b */
            final /* synthetic */ a f9099b;

            public C4579a(d dVar, a aVar) {
                this.f9098a = dVar;
                this.f9099b = aVar;
            }

            @Override // com.ironsource.InterfaceC3057dw.a
            /* renamed from: a */
            public void mo8100a() {
                this.f9098a.mo9473a(new InterfaceC2970bf.a(new InterfaceC3868ye.a(this.f9099b.f9095b.mo12896b())));
                this.f9099b.f9097d.set(false);
            }
        }

        public a(InterfaceC3834xe config, InterfaceC3057dw timer) {
            kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
            kotlin.jvm.internal.OooOo.OooO0o0(timer, "timer");
            this.f9095b = config;
            this.f9096c = timer;
            this.f9097d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC3248j9
        /* renamed from: a */
        public synchronized void mo9467a() {
            this.f9096c.cancel();
            this.f9097d.set(false);
        }

        @Override // com.ironsource.InterfaceC3248j9
        /* renamed from: a */
        public synchronized void mo9468a(d callback) {
            kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
            if (this.f9097d.compareAndSet(false, true)) {
                this.f9096c.mo8416a(new C4579a(callback, this));
            }
        }
    }

    /* renamed from: com.ironsource.j9$b */
    public static final class b implements InterfaceC3248j9 {

        /* renamed from: b */
        public static final b f9100b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC3248j9
        /* renamed from: a */
        public void mo9467a() {
        }

        @Override // com.ironsource.InterfaceC3248j9
        /* renamed from: a */
        public void mo9468a(d callback) {
            kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        }
    }

    /* renamed from: com.ironsource.j9$c */
    public static final class c {

        /* renamed from: a */
        static final /* synthetic */ c f9101a = new c();

        private c() {
        }

        /* renamed from: a */
        public final InterfaceC3248j9 m9471a() {
            return b.f9100b;
        }

        /* renamed from: a */
        public final InterfaceC3248j9 m9472a(C3902ze featureFlag) {
            kotlin.jvm.internal.OooOo.OooO0o0(featureFlag, "featureFlag");
            if (!featureFlag.mo11507c()) {
                return b.f9100b;
            }
            C3800we c3800we = new C3800we(featureFlag);
            InterfaceC3057dw.b bVar = new InterfaceC3057dw.b();
            bVar.m8420b(c3800we.mo12895a());
            bVar.m8418a(c3800we.mo12895a());
            return new a(c3800we, new InterfaceC3057dw.d().mo8421a(bVar));
        }
    }

    /* renamed from: com.ironsource.j9$d */
    public interface d {
        /* renamed from: a */
        void mo9473a(InterfaceC2970bf interfaceC2970bf);
    }

    /* renamed from: a */
    static InterfaceC3248j9 m9466a(C3902ze c3902ze) {
        return f9094a.m9472a(c3902ze);
    }

    /* renamed from: a */
    void mo9467a();

    /* renamed from: a */
    void mo9468a(d dVar);
}
