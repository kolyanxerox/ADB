package com.ironsource;

import com.ironsource.AbstractC3100f0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.fx */
/* loaded from: classes2.dex */
public final class C3133fx implements InterfaceC3060e0 {

    /* renamed from: a */
    private final C3719u2 f8661a;

    /* renamed from: b */
    private final AbstractC3718u1 f8662b;

    /* renamed from: c */
    private final InterfaceC3435mx f8663c;

    /* renamed from: d */
    private final AbstractC3203hx f8664d;

    /* renamed from: e */
    private AbstractC3100f0 f8665e;

    /* renamed from: f */
    private AbstractC3505ox f8666f;

    /* renamed from: g */
    private final List<AbstractC3887z> f8667g;

    /* renamed from: h */
    private AbstractC3887z f8668h;

    /* renamed from: i */
    private boolean f8669i;

    /* renamed from: com.ironsource.fx$a */
    public static final class a implements InterfaceC3237ix {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3237ix
        /* renamed from: a */
        public void mo8844a(int i, String errorReason) {
            kotlin.jvm.internal.OooOo.OooO0o0(errorReason, "errorReason");
            if (C3133fx.this.f8669i) {
                return;
            }
            C3133fx.this.f8663c.mo10894a(i, errorReason);
        }

        @Override // com.ironsource.InterfaceC3237ix
        /* renamed from: a */
        public void mo8845a(C3272jx waterfallInstances) {
            kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
            if (C3133fx.this.f8669i) {
                return;
            }
            C3133fx.this.m8831a(waterfallInstances);
        }
    }

    public C3133fx(C3719u2 adTools, AbstractC3718u1 adUnitData, InterfaceC3435mx listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f8661a = adTools;
        this.f8662b = adUnitData;
        this.f8663c = listener;
        this.f8664d = AbstractC3203hx.f8956d.m9246a(adTools, adUnitData);
        this.f8667g = new ArrayList();
    }

    /* renamed from: d */
    private final void m8834d(AbstractC3887z abstractC3887z) {
        this.f8668h = abstractC3887z;
        this.f8667g.remove(abstractC3887z);
    }

    /* renamed from: e */
    private final boolean m8835e() {
        return this.f8668h != null;
    }

    /* renamed from: f */
    private final void m8836f() {
        AbstractC3100f0 abstractC3100f0 = this.f8665e;
        AbstractC3100f0.b bVarM8587d = abstractC3100f0 != null ? abstractC3100f0.m8587d() : null;
        if (bVarM8587d == null || bVarM8587d.m8594e()) {
            this.f8663c.mo10894a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (!bVarM8587d.m8595f()) {
            Iterator<AbstractC3887z> it = bVarM8587d.m8589a().iterator();
            while (it.hasNext()) {
                it.next().m13263a(this);
            }
        } else {
            AbstractC3505ox abstractC3505ox = this.f8666f;
            if (abstractC3505ox != null) {
                abstractC3505ox.mo10980a();
            }
        }
    }

    /* renamed from: b */
    public final void m8840b() {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8661a, "dispose", (String) null, 2, (Object) null));
        Iterator<T> it = this.f8667g.iterator();
        while (it.hasNext()) {
            ((AbstractC3887z) it.next()).mo9322c();
        }
        this.f8667g.clear();
        this.f8661a.m9970e().m7911h().m9895a();
    }

    /* renamed from: c */
    public final AbstractC3887z m8842c() {
        AbstractC3100f0.c cVarM8586c;
        AbstractC3100f0 abstractC3100f0 = this.f8665e;
        if (abstractC3100f0 == null || (cVarM8586c = abstractC3100f0.m8586c()) == null) {
            return null;
        }
        return cVarM8586c.m8601c();
    }

    /* renamed from: c */
    private final void m8833c(AbstractC3887z abstractC3887z) {
        m8834d(abstractC3887z);
        m8840b();
    }

    /* renamed from: a */
    public final void m8837a() {
        this.f8669i = true;
        AbstractC3887z abstractC3887z = this.f8668h;
        if (abstractC3887z != null) {
            abstractC3887z.mo13025b();
        }
    }

    /* renamed from: b */
    public final void m8841b(AbstractC3887z instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        AbstractC3505ox abstractC3505ox = this.f8666f;
        if (abstractC3505ox != null) {
            abstractC3505ox.m11242a(instance, this.f8662b.m12516l(), this.f8662b.m12519o());
        }
    }

    /* renamed from: d */
    public final boolean m8843d() {
        Iterator<AbstractC3887z> it = this.f8667g.iterator();
        while (it.hasNext()) {
            if (it.next().m13286y()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m8838a(InterfaceC2990c0 adInstanceFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceFactory, "adInstanceFactory");
        this.f8664d.mo9222a(adInstanceFactory, new a());
    }

    /* renamed from: a */
    public final void m8839a(InterfaceC3205i0 adInstancePresenter) {
        AbstractC3887z abstractC3887zM8601c;
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePresenter, "adInstancePresenter");
        AbstractC3100f0 abstractC3100f0 = this.f8665e;
        AbstractC3100f0.c cVarM8586c = abstractC3100f0 != null ? abstractC3100f0.m8586c() : null;
        if (cVarM8586c == null || (abstractC3887zM8601c = cVarM8586c.m8601c()) == null) {
            return;
        }
        m8833c(abstractC3887zM8601c);
        AbstractC3505ox abstractC3505ox = this.f8666f;
        if (abstractC3505ox != null) {
            abstractC3505ox.m11243a(cVarM8586c.m8601c(), cVarM8586c.m8602d());
        }
        cVarM8586c.m8601c().mo9321a(adInstancePresenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8831a(C3272jx c3272jx) {
        AbstractC3100f0 abstractC3100f0M8588a = AbstractC3100f0.f8473c.m8588a(this.f8662b, c3272jx);
        this.f8665e = abstractC3100f0M8588a;
        this.f8666f = AbstractC3505ox.f10719c.m11244a(this.f8661a, this.f8662b, this.f8664d.mo9245a(), c3272jx, abstractC3100f0M8588a);
        m8836f();
    }

    @Override // com.ironsource.InterfaceC3060e0
    /* renamed from: a */
    public void mo8432a(IronSourceError error, AbstractC3887z instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        if (this.f8669i) {
            return;
        }
        m8836f();
    }

    @Override // com.ironsource.InterfaceC3060e0
    /* renamed from: a */
    public void mo8433a(AbstractC3887z instance) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        if (this.f8669i || m8835e()) {
            instance.mo9322c();
            return;
        }
        AbstractC3505ox abstractC3505ox = this.f8666f;
        if (abstractC3505ox != null) {
            abstractC3505ox.mo10981a(instance);
        }
        this.f8667g.add(instance);
        if (this.f8667g.size() == 1) {
            AbstractC3505ox abstractC3505ox2 = this.f8666f;
            if (abstractC3505ox2 != null) {
                abstractC3505ox2.mo10982b(instance);
            }
            this.f8663c.mo10896b(instance);
            return;
        }
        AbstractC3100f0 abstractC3100f0 = this.f8665e;
        if (abstractC3100f0 == null || !abstractC3100f0.m8584a(instance)) {
            return;
        }
        this.f8663c.mo10895a(instance);
    }
}
