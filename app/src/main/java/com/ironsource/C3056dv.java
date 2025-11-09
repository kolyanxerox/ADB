package com.ironsource;

import android.os.Handler;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.List;

/* renamed from: com.ironsource.dv */
/* loaded from: classes2.dex */
public final class C3056dv {

    /* renamed from: a */
    private final c f8333a;

    /* renamed from: b */
    private final d f8334b;

    /* renamed from: c */
    private final b f8335c;

    /* renamed from: com.ironsource.dv$a */
    public static final class a {

        /* renamed from: com.ironsource.dv$a$a, reason: collision with other inner class name */
        public static final class C4572a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

            /* renamed from: a */
            final /* synthetic */ TestSuiteActivity f8336a;

            /* renamed from: b */
            final /* synthetic */ Handler f8337b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4572a(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.f8336a = testSuiteActivity;
                this.f8337b = handler;
            }

            @Override // o00O0Oo.OooO0O0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3433mv invoke() {
                return new C3433mv(this.f8336a, this.f8337b);
            }
        }

        /* renamed from: com.ironsource.dv$a$b */
        public static final class b extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

            /* renamed from: a */
            final /* synthetic */ TestSuiteActivity f8338a;

            /* renamed from: b */
            final /* synthetic */ Handler f8339b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.f8338a = testSuiteActivity;
                this.f8339b = handler;
            }

            @Override // o00O0Oo.OooO0O0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3713tv invoke() {
                return new C3713tv(this.f8338a, this.f8339b);
            }
        }

        /* renamed from: b */
        private static final C3713tv m8403b(oo00o.OooO0OO oooO0OO) {
            return (C3713tv) oooO0OO.getValue();
        }

        /* renamed from: a */
        public final C3056dv m8404a(List<? extends IronSource.AD_UNIT> maduEnabledAdUnits, TestSuiteActivity activity, Handler handler) {
            kotlin.jvm.internal.OooOo.OooO0o0(maduEnabledAdUnits, "maduEnabledAdUnits");
            kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
            kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
            oo00o.OooOOOO oooOOOOOooO0oo = o0OOO0.OooO0oo(new C4572a(activity, handler));
            oo00o.OooOOOO oooOOOOOooO0oo2 = o0OOO0.OooO0oo(new b(activity, handler));
            return new C3056dv(maduEnabledAdUnits.contains(IronSource.AD_UNIT.INTERSTITIAL) ? m8402a(oooOOOOOooO0oo) : m8403b(oooOOOOOooO0oo2), maduEnabledAdUnits.contains(IronSource.AD_UNIT.REWARDED_VIDEO) ? m8402a(oooOOOOOooO0oo) : m8403b(oooOOOOOooO0oo2), maduEnabledAdUnits.contains(IronSource.AD_UNIT.BANNER) ? m8402a(oooOOOOOooO0oo) : m8403b(oooOOOOOooO0oo2), null);
        }

        /* renamed from: a */
        private static final C3433mv m8402a(oo00o.OooO0OO oooO0OO) {
            return (C3433mv) oooO0OO.getValue();
        }
    }

    /* renamed from: com.ironsource.dv$b */
    public interface b {
        /* renamed from: a */
        void mo8407a(double d);

        /* renamed from: a */
        void mo8408a(C3270jv c3270jv, String str, int i, int i2);

        /* renamed from: b */
        void mo8409b();
    }

    /* renamed from: com.ironsource.dv$c */
    public interface c {
        /* renamed from: a */
        void mo8410a(C3270jv c3270jv);

        /* renamed from: c */
        void mo8411c();

        /* renamed from: e */
        boolean mo8412e();
    }

    /* renamed from: com.ironsource.dv$d */
    public interface d {
        /* renamed from: a */
        boolean mo8413a();

        /* renamed from: b */
        void mo8414b(C3270jv c3270jv);

        /* renamed from: d */
        void mo8415d();
    }

    private C3056dv(c cVar, d dVar, b bVar) {
        this.f8333a = cVar;
        this.f8334b = dVar;
        this.f8335c = bVar;
    }

    /* renamed from: a */
    public final b m8399a() {
        return this.f8335c;
    }

    /* renamed from: b */
    public final c m8400b() {
        return this.f8333a;
    }

    /* renamed from: c */
    public final d m8401c() {
        return this.f8334b;
    }

    public /* synthetic */ C3056dv(c cVar, d dVar, b bVar, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(cVar, dVar, bVar);
    }
}
