package com.ironsource;

import android.app.Activity;
import com.ironsource.C2992c2;
import com.ironsource.InterfaceC3621s9;
import com.ironsource.InterfaceC3704tm;
import com.ironsource.InterfaceC3918zu;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.C4201a;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* renamed from: com.ironsource.qd */
/* loaded from: classes2.dex */
public final class C3555qd implements InterfaceC3252jd {

    /* renamed from: a */
    private final C3495on f10925a;

    /* renamed from: b */
    private final C3719u2 f10926b;

    /* renamed from: c */
    private final AbstractC3718u1 f10927c;

    /* renamed from: d */
    private InterfaceC3695td f10928d;

    /* renamed from: e */
    private final o00O0Oo.o00Oo0 f10929e;

    /* renamed from: f */
    private final InterfaceC3918zu f10930f;

    /* renamed from: g */
    private final InterfaceC3621s9 f10931g;

    /* renamed from: h */
    private b f10932h;

    /* renamed from: i */
    private a f10933i;

    /* renamed from: j */
    private final C3133fx f10934j;

    /* renamed from: k */
    private InterfaceC3918zu.a f10935k;

    /* renamed from: l */
    private Long f10936l;

    /* renamed from: com.ironsource.qd$a */
    public interface a {
        /* renamed from: a */
        void mo8116a(C3555qd c3555qd, IronSourceError ironSourceError);

        /* renamed from: b */
        void mo8120b(C3555qd c3555qd);
    }

    /* renamed from: com.ironsource.qd$b */
    public interface b {
        /* renamed from: a */
        void mo8115a(C3555qd c3555qd);

        /* renamed from: a */
        void mo8117a(C3555qd c3555qd, LevelPlayAdInfo levelPlayAdInfo);

        /* renamed from: b */
        void mo8121b(C3555qd c3555qd, IronSourceError ironSourceError);

        /* renamed from: b */
        void mo8122b(C3555qd c3555qd, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.qd$c */
    public static final class c implements InterfaceC3435mx {
        public c() {
        }

        @Override // com.ironsource.InterfaceC3435mx
        /* renamed from: a */
        public void mo10894a(int i, String errorReason) {
            Long lValueOf;
            kotlin.jvm.internal.OooOo.OooO0o0(errorReason, "errorReason");
            Long l = C3555qd.this.f10936l;
            if (l != null) {
                lValueOf = Long.valueOf(C3555qd.this.f10931g.mo11889a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C3555qd.this.f10926b.m9970e().m7908e().m7945a(lValueOf != null ? lValueOf.longValue() : 0L, i, errorReason, C3555qd.this.f10927c.mo10003u());
            b bVar = C3555qd.this.f10932h;
            if (bVar != null) {
                bVar.mo8121b(C3555qd.this, new IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.InterfaceC3435mx
        /* renamed from: b */
        public void mo10896b(AbstractC3887z instance) {
            Long lValueOf;
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            Long l = C3555qd.this.f10936l;
            if (l != null) {
                lValueOf = Long.valueOf(C3555qd.this.f10931g.mo11889a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C3555qd.this.f10926b.m9970e().m7908e().m7947a(lValueOf != null ? lValueOf.longValue() : 0L, C3555qd.this.f10927c.mo10003u());
            C3555qd.this.m11538g();
            b bVar = C3555qd.this.f10932h;
            if (bVar != null) {
                bVar.mo8122b(C3555qd.this, instance.mo13026e());
            }
        }

        @Override // com.ironsource.InterfaceC3435mx
        /* renamed from: a */
        public void mo10895a(AbstractC3887z instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            C3555qd.this.f10926b.m9970e().m7902a().m9948e(C3555qd.this.m11532c());
            C3555qd.this.m11538g();
            b bVar = C3555qd.this.f10932h;
            if (bVar != null) {
                bVar.mo8117a(C3555qd.this, instance.mo13026e());
            }
        }
    }

    /* renamed from: com.ironsource.qd$d */
    public /* synthetic */ class d extends kotlin.jvm.internal.OooOo00 implements o00O0Oo.o00Oo0 {
        public d(Object obj) {
            super(3, obj, C3555qd.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // o00O0Oo.o00Oo0
        /* renamed from: a */
        public final C3218id invoke(C2626a0 p0, C3135g0 p1, InterfaceC3252jd p2) {
            kotlin.jvm.internal.OooOo.OooO0o0(p0, "p0");
            kotlin.jvm.internal.OooOo.OooO0o0(p1, "p1");
            kotlin.jvm.internal.OooOo.OooO0o0(p2, "p2");
            return ((C3555qd) this.receiver).m11525a(p0, p1, p2);
        }
    }

    public C3555qd(C3495on mediationServices, C3719u2 adUnitTools, AbstractC3718u1 adUnitData, InterfaceC3695td fullscreenListener, InterfaceC3168gx interfaceC3168gx, o00O0Oo.o00Oo0 o00oo0, InterfaceC3918zu taskScheduler, InterfaceC3621s9 currentTimeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(mediationServices, "mediationServices");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenListener, "fullscreenListener");
        kotlin.jvm.internal.OooOo.OooO0o0(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        this.f10925a = mediationServices;
        this.f10926b = adUnitTools;
        this.f10927c = adUnitData;
        this.f10928d = fullscreenListener;
        this.f10929e = o00oo0;
        this.f10930f = taskScheduler;
        this.f10931g = currentTimeProvider;
        this.f10934j = m11524a(interfaceC3168gx);
    }

    /* renamed from: a */
    private final C3133fx m11524a(InterfaceC3168gx interfaceC3168gx) {
        InterfaceC3435mx interfaceC3435mxM11527a = m11527a();
        return interfaceC3168gx != null ? interfaceC3168gx.m9024a(interfaceC3435mxM11527a) : new C3133fx(this.f10926b, this.f10927c, interfaceC3435mxM11527a);
    }

    /* renamed from: c */
    public final String m11532c() {
        return this.f10927c.m12516l();
    }

    /* renamed from: f */
    private final InterfaceC3704tm<oo00o.OooOo> m11536f() {
        if (!this.f10934j.m8843d()) {
            return new InterfaceC3704tm.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.f10925a.mo8697y().mo9120a(m11532c(), m11531b()).m10966d()) {
            return new InterfaceC3704tm.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, OooO0oO.OooOo.OooOOOo(new StringBuilder("placement "), m11532c(), " is capped")));
        }
        if (!this.f10925a.mo8695u().mo7975a(this.f10927c.mo9364b().m8437c()).m10966d()) {
            return new InterfaceC3704tm.b(oo00o.OooOo.f33195OooO00o);
        }
        return new InterfaceC3704tm.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.f10927c.mo9364b().m8437c() + " is capped"));
    }

    /* renamed from: g */
    public final void m11538g() {
        InterfaceC3918zu.a aVar = this.f10935k;
        if (aVar != null) {
            aVar.m13427a();
        }
        long jM9962b = this.f10926b.m9962b(m11531b());
        InterfaceC3918zu interfaceC3918zu = this.f10930f;
        OooO0o oooO0o = new OooO0o(this, 8);
        int i = o00O0oOO.OooOO0O.f31462OooOoO0;
        this.f10935k = interfaceC3918zu.mo12422a(oooO0o, Oooo0oO.o00000.OooOOO0(jM9962b, o00O0oOO.OooOOO.f31464OooOo));
    }

    /* renamed from: h */
    private final void m11540h() {
        String strM11532c = m11532c();
        if (strM11532c.length() > 0) {
            this.f10925a.mo8480a().mo9122b(strM11532c, m11531b());
            C3445n8 c3445n8Mo9120a = this.f10925a.mo8697y().mo9120a(strM11532c, m11531b());
            if (c3445n8Mo9120a.m10966d()) {
                this.f10926b.m9970e().m7902a().m9945b(strM11532c, c3445n8Mo9120a.m10967e());
            }
        }
    }

    public /* synthetic */ C3555qd(C3495on c3495on, C3719u2 c3719u2, AbstractC3718u1 abstractC3718u1, InterfaceC3695td interfaceC3695td, InterfaceC3168gx interfaceC3168gx, o00O0Oo.o00Oo0 o00oo0, InterfaceC3918zu interfaceC3918zu, InterfaceC3621s9 interfaceC3621s9, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3495on, c3719u2, abstractC3718u1, interfaceC3695td, (i & 16) != 0 ? null : interfaceC3168gx, (i & 32) != 0 ? null : o00oo0, (i & 64) != 0 ? new C3696te(C3731ue.m12670a(c3719u2.m13083a())) : interfaceC3918zu, (i & 128) != 0 ? new InterfaceC3621s9.a() : interfaceC3621s9);
    }

    /* renamed from: a */
    public final C3218id m11525a(C2626a0 c2626a0, C3135g0 c3135g0, InterfaceC3252jd interfaceC3252jd) {
        return new C3218id(new C3719u2(this.f10926b, C2992c2.b.PROVIDER), c2626a0, c3135g0, interfaceC3252jd);
    }

    /* renamed from: b */
    private final LevelPlay.AdFormat m11531b() {
        return this.f10927c.mo9364b().m8439e();
    }

    /* renamed from: h */
    public static final void m11541h(C3555qd this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        b bVar = this$0.f10932h;
        if (bVar != null) {
            bVar.mo8115a(this$0);
        }
        this$0.f10934j.m8840b();
    }

    /* renamed from: d */
    public final InterfaceC3695td m11545d() {
        return this.f10928d;
    }

    /* renamed from: e */
    public final LevelPlayAdInfo m11546e() {
        AbstractC3887z abstractC3887zM8842c = this.f10934j.m8842c();
        if (abstractC3887zM8842c != null) {
            return abstractC3887zM8842c.mo13026e();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3252jd
    /* renamed from: b */
    public void mo9478b(C3218id fullscreenInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenInstance, "fullscreenInstance");
        this.f10926b.m9970e().m7902a().m9944b(m11532c());
        this.f10928d.onClosed();
    }

    /* renamed from: a */
    private final InterfaceC3435mx m11527a() {
        return new c();
    }

    @Override // com.ironsource.InterfaceC3025d0
    /* renamed from: b */
    public void mo8253b(AbstractC3887z instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        this.f10934j.m8841b(instance);
        this.f10926b.m9970e().m7902a().m9950g(m11532c());
        this.f10925a.mo8482e().mo9346b(C4201a.m13452a(m11531b()));
    }

    /* renamed from: a */
    public static final AbstractC3887z m11529a(C3555qd this$0, C2626a0 instanceData, C3135g0 adInstancePayload) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayload, "adInstancePayload");
        o00O0Oo.o00Oo0 dVar = this$0.f10929e;
        if (dVar == null) {
            dVar = new d(this$0);
        }
        return (AbstractC3887z) dVar.invoke(instanceData, adInstancePayload, this$0);
    }

    /* renamed from: a */
    public final void m11542a(Activity activity, a displayListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C3349m1.m9956a(this.f10926b, (String) null, (String) null, 3, (Object) null));
        this.f10933i = displayListener;
        this.f10926b.m9970e().m7902a().m9937a(activity, m11532c());
        InterfaceC3704tm<oo00o.OooOo> interfaceC3704tmM11536f = m11536f();
        if (interfaceC3704tmM11536f instanceof InterfaceC3704tm.a) {
            IronSourceError ironSourceErrorM12455b = ((InterfaceC3704tm.a) interfaceC3704tmM11536f).m12455b();
            ironLog.verbose(C3349m1.m9956a(this.f10926b, ironSourceErrorM12455b.getErrorMessage(), (String) null, 2, (Object) null));
            this.f10926b.m9970e().m7902a().m9939a(m11532c(), ironSourceErrorM12455b.getErrorCode(), ironSourceErrorM12455b.getErrorMessage(), "");
            displayListener.mo8116a(this, ironSourceErrorM12455b);
            return;
        }
        InterfaceC3918zu.a aVar = this.f10935k;
        if (aVar != null) {
            aVar.m13427a();
        }
        this.f10934j.m8839a(new C3287kd(activity));
    }

    @Override // com.ironsource.InterfaceC3252jd
    /* renamed from: a */
    public void mo9475a(C3218id fullscreenInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenInstance, "fullscreenInstance");
        this.f10926b.m9970e().m7902a().m9955l(m11532c());
        a aVar = this.f10933i;
        if (aVar != null) {
            aVar.mo8120b(this);
        }
        m11540h();
        this.f10925a.mo8489w().mo7978b(this.f10927c.mo9364b().m8437c());
    }

    @Override // com.ironsource.InterfaceC3252jd
    /* renamed from: a */
    public void mo9476a(C3218id fullscreenInstance, IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10926b, error.toString(), (String) null, 2, (Object) null));
        this.f10926b.m9970e().m7902a().m9939a(m11532c(), error.getErrorCode(), error.getErrorMessage(), "");
        a aVar = this.f10933i;
        if (aVar != null) {
            aVar.mo8116a(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC3252jd
    /* renamed from: a */
    public void mo9477a(C3218id fullscreenInstance, LevelPlayReward reward) {
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(reward, "reward");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10926b, fullscreenInstance.m13277p(), (String) null, 2, (Object) null));
        this.f10928d.mo7750a(reward);
    }

    /* renamed from: a */
    public final void m11543a(b loadListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10926b, (String) null, (String) null, 3, (Object) null));
        this.f10932h = loadListener;
        this.f10936l = Long.valueOf(this.f10931g.mo11889a());
        this.f10926b.m12530a(new C3508p1(this.f10927c.mo9364b()));
        o000oOoO o000oooo2 = new o000oOoO(this, 3);
        this.f10926b.m9970e().m7908e().m7949a(this.f10927c.mo10003u());
        this.f10934j.m8838a(o000oooo2);
    }

    /* renamed from: a */
    public final void m11544a(InterfaceC3695td interfaceC3695td) {
        kotlin.jvm.internal.OooOo.OooO0o0(interfaceC3695td, "<set-?>");
        this.f10928d = interfaceC3695td;
    }

    @Override // com.ironsource.InterfaceC3025d0
    /* renamed from: a */
    public void mo8252a(AbstractC3887z instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        this.f10926b.m9970e().m7902a().m9938a(m11532c());
        this.f10928d.mo7754h();
    }
}
