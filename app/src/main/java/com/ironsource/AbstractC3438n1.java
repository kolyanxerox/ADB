package com.ironsource;

import com.ironsource.C2992c2;
import com.ironsource.InterfaceC3171h1;
import com.ironsource.InterfaceC3918zu;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3438n1 {

    /* renamed from: a */
    private final AbstractC3718u1 f10351a;

    /* renamed from: b */
    private final C3696te f10352b;

    /* renamed from: c */
    private final C3719u2 f10353c;

    /* renamed from: d */
    private InterfaceC3276k2 f10354d;

    /* renamed from: e */
    private InterfaceC3787w1 f10355e;

    /* renamed from: f */
    private final C3133fx f10356f;

    /* renamed from: g */
    private final WeakReference<InterfaceC3207i2> f10357g;

    /* renamed from: h */
    private C3216ib f10358h;

    /* renamed from: i */
    private InterfaceC3918zu.a f10359i;

    /* renamed from: j */
    private final C2967bc f10360j;

    /* renamed from: com.ironsource.n1$a */
    public class a implements InterfaceC3025d0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3025d0
        /* renamed from: a */
        public void mo8252a(AbstractC3887z instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            AbstractC3438n1.this.f10360j.m7902a().m9938a(AbstractC3438n1.this.m10931h());
            InterfaceC3207i2 interfaceC3207i2 = (InterfaceC3207i2) AbstractC3438n1.this.f10357g.get();
            if (interfaceC3207i2 != null) {
                interfaceC3207i2.mo7754h();
            }
        }

        @Override // com.ironsource.InterfaceC3025d0
        /* renamed from: b */
        public void mo8253b(AbstractC3887z instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC3438n1.this.m10920a(instance.m13277p()));
            AbstractC3438n1.this.m10934k().m8841b(instance);
            AbstractC3438n1.this.f10360j.m7902a().m9950g(AbstractC3438n1.this.m10931h());
            AbstractC3438n1.this.m10929f().m12538m().mo9346b(AbstractC3438n1.this.m10928e().mo9364b().m8434a());
        }
    }

    /* renamed from: com.ironsource.n1$b */
    public static final class b implements InterfaceC3435mx {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3435mx
        /* renamed from: a */
        public void mo10894a(int i, String errorReason) {
            kotlin.jvm.internal.OooOo.OooO0o0(errorReason, "errorReason");
            AbstractC3438n1.this.m10921a(i, errorReason);
        }

        @Override // com.ironsource.InterfaceC3435mx
        /* renamed from: b */
        public void mo10896b(AbstractC3887z instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            AbstractC3438n1.this.f10360j.m7908e().m7947a(C3216ib.m9304a(AbstractC3438n1.this.f10358h), AbstractC3438n1.this.m10928e().mo10003u());
            InterfaceC3276k2 interfaceC3276k2M10933j = AbstractC3438n1.this.m10933j();
            if (interfaceC3276k2M10933j != null) {
                interfaceC3276k2M10933j.mo8047c(new C3578r1(AbstractC3438n1.this, instance.mo13026e()));
            }
            AbstractC3438n1.this.m10919l();
        }

        @Override // com.ironsource.InterfaceC3435mx
        /* renamed from: a */
        public void mo10895a(AbstractC3887z instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            AbstractC3438n1.this.m10929f().m9970e().m7902a().m9948e(AbstractC3438n1.this.m10931h());
            InterfaceC3276k2 interfaceC3276k2M10933j = AbstractC3438n1.this.m10933j();
            if (interfaceC3276k2M10933j != null) {
                interfaceC3276k2M10933j.m9572b(new C3578r1(AbstractC3438n1.this, instance.mo13026e()));
            }
            AbstractC3438n1.this.m10919l();
        }
    }

    public AbstractC3438n1(C3349m1 adTools, AbstractC3718u1 adUnitData, InterfaceC3207i2 listener, C3696te taskScheduler) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        kotlin.jvm.internal.OooOo.OooO0o0(taskScheduler, "taskScheduler");
        this.f10351a = adUnitData;
        this.f10352b = taskScheduler;
        C3719u2 c3719u2 = new C3719u2(adTools, adUnitData, C2992c2.b.MEDIATION);
        this.f10353c = c3719u2;
        this.f10356f = new C3133fx(c3719u2, adUnitData, m10916c());
        this.f10357g = new WeakReference<>(listener);
        this.f10360j = c3719u2.m9970e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.mo9364b().m8434a() + ", adUnitId = " + adUnitData.mo9364b().m8437c());
    }

    /* renamed from: l */
    public final void m10919l() {
        IronLog.INTERNAL.verbose(m10920a("starting expiration scheduled task"));
        InterfaceC3918zu.a aVar = this.f10359i;
        if (aVar != null) {
            aVar.m13427a();
        }
        long jM9962b = this.f10353c.m9962b(this.f10351a.mo9364b().m8439e());
        C3696te c3696te = this.f10352b;
        OooO0o oooO0o = new OooO0o(this, 6);
        int i = o00O0oOO.OooOO0O.f31462OooOoO0;
        this.f10359i = c3696te.mo12422a(oooO0o, Oooo0oO.o00000.OooOOO0(jM9962b, o00O0oOO.OooOOO.f31464OooOo));
    }

    /* renamed from: a */
    public abstract InterfaceC2990c0 mo9217a();

    /* renamed from: b */
    public C3508p1 mo9743b() {
        return new C3508p1(this.f10351a.mo9364b());
    }

    /* renamed from: d */
    public InterfaceC3171h1 m10927d() {
        return this.f10356f.m8843d() ? InterfaceC3171h1.b.f8792a : new InterfaceC3171h1.a(null, 1, null);
    }

    /* renamed from: e */
    public final AbstractC3718u1 m10928e() {
        return this.f10351a;
    }

    /* renamed from: f */
    public final C3719u2 m10929f() {
        return this.f10353c;
    }

    /* renamed from: g */
    public final Placement m10930g() {
        return this.f10351a.mo9364b().m8440f();
    }

    /* renamed from: h */
    public final String m10931h() {
        return this.f10351a.m12516l();
    }

    /* renamed from: i */
    public final InterfaceC3787w1 m10932i() {
        return this.f10355e;
    }

    /* renamed from: j */
    public final InterfaceC3276k2 m10933j() {
        return this.f10354d;
    }

    /* renamed from: k */
    public final C3133fx m10934k() {
        return this.f10356f;
    }

    public /* synthetic */ AbstractC3438n1(C3349m1 c3349m1, AbstractC3718u1 abstractC3718u1, InterfaceC3207i2 interfaceC3207i2, C3696te c3696te, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3349m1, abstractC3718u1, interfaceC3207i2, (i & 8) != 0 ? new C3696te(C3731ue.m12670a(c3349m1.m13083a())) : c3696te);
    }

    /* renamed from: c */
    private final b m10916c() {
        return new b();
    }

    /* renamed from: e */
    public static final void m10918e(AbstractC3438n1 this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3276k2 interfaceC3276k2 = this$0.f10354d;
        if (interfaceC3276k2 != null) {
            interfaceC3276k2.m9571a();
        }
    }

    /* renamed from: a */
    public final String m10920a(String str) {
        return C3349m1.m9956a(this.f10353c, str, (String) null, 2, (Object) null);
    }

    /* renamed from: a */
    public final void m10921a(int i, String errorReason) {
        kotlin.jvm.internal.OooOo.OooO0o0(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(m10920a("errorCode = " + i + ", errorReason = " + errorReason));
        this.f10360j.m7908e().m7945a(C3216ib.m9304a(this.f10358h), i, errorReason, this.f10351a.mo10003u());
        InterfaceC3276k2 interfaceC3276k2 = this.f10354d;
        if (interfaceC3276k2 != null) {
            interfaceC3276k2.mo8043a(new IronSourceError(i, errorReason));
        }
    }

    /* renamed from: b */
    public final void m10926b(InterfaceC3276k2 interfaceC3276k2) {
        this.f10354d = interfaceC3276k2;
    }

    /* renamed from: a */
    public final void m10922a(InterfaceC3205i0 adInstancePresenter, InterfaceC3787w1 displayListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePresenter, "adInstancePresenter");
        kotlin.jvm.internal.OooOo.OooO0o0(displayListener, "displayListener");
        this.f10355e = displayListener;
        InterfaceC3918zu.a aVar = this.f10359i;
        if (aVar != null) {
            aVar.m13427a();
        }
        this.f10356f.m8839a(adInstancePresenter);
    }

    /* renamed from: a */
    public void m10923a(InterfaceC3276k2 loadListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10353c, (String) null, (String) null, 3, (Object) null));
        this.f10353c.m12530a(mo9743b());
        this.f10354d = loadListener;
        this.f10360j.m7904a(this.f10351a.mo10003u());
        this.f10358h = new C3216ib();
        this.f10356f.m8838a(mo9217a());
    }

    /* renamed from: a */
    public final void m10924a(InterfaceC3787w1 interfaceC3787w1) {
        this.f10355e = interfaceC3787w1;
    }

    /* renamed from: a */
    public final void m10925a(boolean z) {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10353c, (String) null, (String) null, 3, (Object) null));
        this.f10356f.m8837a();
        if (z) {
            this.f10353c.m9970e().m7908e().m7941a(this.f10353c.m9971f());
        }
    }
}
