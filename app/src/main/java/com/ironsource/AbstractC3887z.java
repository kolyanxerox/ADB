package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3473o1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.z */
/* loaded from: classes2.dex */
public abstract class AbstractC3887z implements AdapterAdListener, NetworkInitializationListener {

    /* renamed from: a */
    private final C3719u2 f12793a;

    /* renamed from: b */
    private final C2626a0 f12794b;

    /* renamed from: c */
    private final C3135g0 f12795c;

    /* renamed from: d */
    private WeakReference<InterfaceC3025d0> f12796d;

    /* renamed from: e */
    private InterfaceC3060e0 f12797e;

    /* renamed from: f */
    private final BaseAdAdapter<?, ?> f12798f;

    /* renamed from: g */
    private C3216ib f12799g;

    /* renamed from: h */
    private AbstractRunnableC3302ks f12800h;

    /* renamed from: i */
    private boolean f12801i;

    /* renamed from: j */
    private boolean f12802j;

    /* renamed from: k */
    private boolean f12803k;

    /* renamed from: l */
    private boolean f12804l;

    /* renamed from: m */
    private final AdData f12805m;

    /* renamed from: n */
    private final C3353m5 f12806n;

    /* renamed from: o */
    private final C3353m5 f12807o;

    /* renamed from: p */
    private final boolean f12808p;

    /* renamed from: q */
    private final String f12809q;

    /* renamed from: r */
    private final int f12810r;

    /* renamed from: s */
    private final String f12811s;

    /* renamed from: t */
    private final IronSource.AD_UNIT f12812t;

    /* renamed from: u */
    private final int f12813u;

    /* renamed from: v */
    private final C3170h0 f12814v;

    /* renamed from: com.ironsource.z$a */
    public static final class a extends AbstractRunnableC3302ks {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            long jM9304a = C3216ib.m9304a(AbstractC3887z.this.f12799g);
            IronLog ironLog = IronLog.INTERNAL;
            AbstractC3887z abstractC3887z = AbstractC3887z.this;
            StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(jM9304a, "Load duration = ", ", isBidder = ");
            sbOooOOo.append(AbstractC3887z.this.m13281t());
            ironLog.verbose(abstractC3887z.m13262a(sbOooOOo.toString()));
            AbstractC3887z.this.f12804l = true;
            AbstractC3887z.this.m13268f().m9970e().m7908e().m7946a(jM9304a, 1025, false);
            AbstractC3887z.this.m13268f().m9970e().m7908e().m7945a(jM9304a, 1025, "time out", false);
            AbstractC3887z abstractC3887z2 = AbstractC3887z.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            kotlin.jvm.internal.OooOo.OooO0Oo(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            abstractC3887z2.m13252a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public AbstractC3887z(C3719u2 adTools, C2626a0 instanceData, C3135g0 adInstancePayload, InterfaceC3025d0 listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f12793a = adTools;
        this.f12794b = instanceData;
        this.f12795c = adInstancePayload;
        this.f12796d = new WeakReference<>(listener);
        this.f12805m = instanceData.m4746g();
        this.f12806n = instanceData.m4753n();
        this.f12807o = instanceData.m4755p();
        this.f12808p = instanceData.m4749j().m4775j();
        this.f12809q = instanceData.m4757r();
        this.f12810r = instanceData.m4758s();
        this.f12811s = instanceData.m4762w();
        this.f12812t = instanceData.m4747h();
        this.f12813u = instanceData.m4761v();
        this.f12814v = instanceData.m4759t();
        BaseAdAdapter<?, ?> baseAdAdapterM13246a = m13246a(instanceData);
        this.f12798f = baseAdAdapterM13246a;
        adTools.m9970e().m7903a(new C2955b0(adTools, instanceData, baseAdAdapterM13246a));
        adTools.m9970e().m7903a(new C3686t4(instanceData.m4750k()));
    }

    /* renamed from: A */
    private final void m13238A() {
        IronLog.INTERNAL.verbose(m13248a(this, (String) null, 1, (Object) null));
        try {
            m13243F();
            mo9323z();
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("unexpected error while calling adapter.loadAd() - ", th);
            sbOooOOO.append(th.getMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m13262a(string));
            this.f12793a.m9970e().m7911h().m9918g(string);
            m13250a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, string);
        }
    }

    /* renamed from: B */
    private final void m13239B() {
        IronLog.INTERNAL.verbose(m13248a(this, (String) null, 1, (Object) null));
        this.f12793a.m9970e().m7902a().m9938a(m13273k());
        InterfaceC3025d0 interfaceC3025d0 = this.f12796d.get();
        if (interfaceC3025d0 != null) {
            interfaceC3025d0.mo8252a(this);
        }
    }

    /* renamed from: C */
    private final void m13240C() {
        C3345lw c3345lwM7911h;
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13248a(this, (String) null, 1, (Object) null));
        m13244G();
        if (this.f12804l) {
            mo9322c();
            c3345lwM7911h = this.f12793a.m9970e().m7911h();
            str = "instance load success after it was already failed";
        } else {
            if (!this.f12802j) {
                this.f12802j = true;
                long jM9304a = C3216ib.m9304a(this.f12799g);
                ironLog.verbose(m13262a("Load duration = " + jM9304a));
                this.f12793a.m9970e().m7908e().m7947a(jM9304a, false);
                m13264a(C3473o1.a.LoadedSuccessfully);
                InterfaceC3060e0 interfaceC3060e0 = this.f12797e;
                if (interfaceC3060e0 != null) {
                    interfaceC3060e0.mo8433a(this);
                    return;
                } else {
                    kotlin.jvm.internal.OooOo.OooOO0o("loadListener");
                    throw null;
                }
            }
            c3345lwM7911h = this.f12793a.m9970e().m7911h();
            str = "instance load success after it was already loaded";
        }
        c3345lwM7911h.m9917f(str);
    }

    /* renamed from: D */
    private final void m13241D() {
        IronLog.INTERNAL.verbose(m13248a(this, (String) null, 1, (Object) null));
        if (this.f12803k) {
            this.f12793a.m9970e().m7911h().m9917f("instance opened after it was already opened");
            return;
        }
        this.f12803k = true;
        this.f12793a.m9970e().m7902a().m9950g(m13273k());
        m13264a(C3473o1.a.ShowedSuccessfully);
        InterfaceC3025d0 interfaceC3025d0 = this.f12796d.get();
        if (interfaceC3025d0 != null) {
            interfaceC3025d0.mo8253b(this);
        }
    }

    /* renamed from: E */
    private final void m13242E() {
        IronLog.INTERNAL.verbose(m13248a(this, (String) null, 1, (Object) null));
        m13244G();
        if (this.f12804l) {
            return;
        }
        m13238A();
    }

    /* renamed from: F */
    private final void m13243F() {
        m13244G();
        a aVarM13247a = m13247a();
        this.f12800h = aVarM13247a;
        if (aVarM13247a != null) {
            this.f12793a.m13088a((AbstractRunnableC3302ks) aVarM13247a, TimeUnit.SECONDS.toMillis(m13261n()));
        }
    }

    /* renamed from: G */
    private final void m13244G() {
        AbstractRunnableC3302ks abstractRunnableC3302ks = this.f12800h;
        if (abstractRunnableC3302ks != null) {
            this.f12793a.m13097b(abstractRunnableC3302ks);
            this.f12800h = null;
        }
    }

    /* renamed from: n */
    private final int m13261n() {
        Integer numM9989f = this.f12794b.m4753n().m9989f();
        return (numM9989f == null || numM9989f.intValue() <= 0) ? this.f12794b.m4748i().m12513h() : numM9989f.intValue();
    }

    /* renamed from: a */
    public abstract void mo9321a(InterfaceC3205i0 interfaceC3205i0);

    /* renamed from: b */
    public void mo13025b() {
        IronLog.INTERNAL.verbose(m13248a(this, (String) null, 1, (Object) null));
        m13244G();
        this.f12793a.m9970e().m7908e().m7941a(this.f12813u);
    }

    /* renamed from: c */
    public void mo9322c() {
    }

    /* renamed from: d */
    public final IronSource.AD_UNIT m13267d() {
        return this.f12812t;
    }

    /* renamed from: e */
    public LevelPlayAdInfo mo13026e() {
        String string = this.f12794b.m4748i().mo9364b().m8436b().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strM8437c = this.f12794b.m4748i().mo9364b().m8437c();
        String string2 = this.f12794b.m4747h().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strM8437c, string2, this.f12794b.m4753n().m9983a(m13273k()), this.f12794b.m4753n().m9987d(), null, null, 96, null);
    }

    /* renamed from: f */
    public final C3719u2 m13268f() {
        return this.f12793a;
    }

    /* renamed from: g */
    public final BaseAdAdapter<?, ?> m13269g() {
        return this.f12798f;
    }

    /* renamed from: h */
    public final C3353m5 m13270h() {
        return this.f12806n;
    }

    /* renamed from: i */
    public final AdData m13271i() {
        return this.f12805m;
    }

    /* renamed from: j */
    public final Placement m13272j() {
        return this.f12794b.m4748i().mo9364b().m8440f();
    }

    /* renamed from: k */
    public final String m13273k() {
        return this.f12794b.m4748i().m12516l();
    }

    /* renamed from: l */
    public final C3353m5 m13274l() {
        return this.f12807o;
    }

    /* renamed from: m */
    public final C2626a0 m13275m() {
        return this.f12794b;
    }

    /* renamed from: o */
    public final String m13276o() {
        return this.f12809q;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        m13265a(new o000(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String errorMessage) {
        kotlin.jvm.internal.OooOo.OooO0o0(adapterErrorType, "adapterErrorType");
        kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
        m13265a(new OooOo0o.OooOOOO(this, adapterErrorType, i, errorMessage, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        m13265a(new o000(this, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        m13265a(new o000(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        m13265a(new androidx.profileinstaller.OooO00o(i, this, 3, str));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        m13265a(new o000(this, 3));
    }

    /* renamed from: p */
    public final String m13277p() {
        return this.f12811s;
    }

    /* renamed from: q */
    public final int m13278q() {
        return this.f12810r;
    }

    /* renamed from: r */
    public final C3170h0 m13279r() {
        return this.f12814v;
    }

    /* renamed from: s */
    public final int m13280s() {
        return this.f12813u;
    }

    /* renamed from: t */
    public final boolean m13281t() {
        return this.f12808p;
    }

    /* renamed from: u */
    public final boolean m13282u() {
        return this.f12804l;
    }

    /* renamed from: v */
    public final boolean m13283v() {
        return this.f12802j;
    }

    /* renamed from: w */
    public final boolean m13284w() {
        return this.f12801i;
    }

    /* renamed from: x */
    public final boolean m13285x() {
        return this.f12803k;
    }

    /* renamed from: y */
    public boolean m13286y() {
        return this.f12802j;
    }

    /* renamed from: z */
    public abstract void mo9323z();

    /* renamed from: a */
    private final BaseAdAdapter<?, ?> m13246a(C2626a0 c2626a0) {
        return c2626a0.m4748i().m12510e().m11104q() ? this.f12795c.m8848b() : this.f12793a.m12527a(c2626a0);
    }

    /* renamed from: b */
    public static final void m13257b(AbstractC3887z this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13239B();
    }

    /* renamed from: c */
    public static final void m13258c(AbstractC3887z this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13240C();
    }

    /* renamed from: d */
    public static final void m13259d(AbstractC3887z this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13241D();
    }

    /* renamed from: e */
    public static final void m13260e(AbstractC3887z this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13242E();
    }

    /* renamed from: a */
    private final a m13247a() {
        return new a();
    }

    /* renamed from: a */
    public static /* synthetic */ String m13248a(AbstractC3887z abstractC3887z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return abstractC3887z.m13262a(str);
    }

    /* renamed from: a */
    public final String m13262a(String str) {
        return this.f12793a.m9960a(str, this.f12811s);
    }

    /* renamed from: a */
    private final void m13249a(int i, String str) {
        IronLog.INTERNAL.verbose(m13262a("error = " + i + ", " + str));
        m13244G();
        this.f12804l = true;
        m13251a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C3216ib.m9304a(this.f12799g));
        m13252a(new IronSourceError(i, str));
    }

    /* renamed from: a */
    public final void m13263a(InterfaceC3060e0 listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13248a(this, (String) null, 1, (Object) null));
        this.f12797e = listener;
        this.f12801i = true;
        try {
            this.f12793a.m9970e().m7908e().m7949a(false);
            this.f12799g = new C3216ib();
            m13243F();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f12798f;
            kotlin.jvm.internal.OooOo.OooO0O0(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f12794b.m4746g(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.f12811s;
            ironLog.error(m13262a(str));
            m13249a(C3855y1.m13116c(this.f12794b.m4747h()), str);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("loadAd - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m13262a(string));
            this.f12793a.m9970e().m7911h().m9918g(string);
            m13249a(C3855y1.m13116c(this.f12794b.m4747h()), string);
        }
    }

    /* renamed from: a */
    private final void m13250a(AdapterErrorType adapterErrorType, int i, String str) {
        long jM9304a = C3216ib.m9304a(this.f12799g);
        IronLog.INTERNAL.verbose(m13262a("Load duration = " + jM9304a + ", error = " + i + ", " + str));
        m13244G();
        if (this.f12804l) {
            mo9322c();
            this.f12793a.m9970e().m7911h().m9917f("instance load failed after it was already failed");
        } else {
            if (this.f12802j) {
                this.f12793a.m9970e().m7911h().m9917f("instance load failed after it was already loaded");
                return;
            }
            this.f12804l = true;
            mo9322c();
            m13251a(adapterErrorType, i, str, jM9304a);
            m13252a(new IronSourceError(i, str));
        }
    }

    /* renamed from: a */
    private final void m13251a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f12793a.m9970e().m7908e().m7943a(j, i);
        } else {
            this.f12793a.m9970e().m7908e().m7945a(j, i, str, false);
        }
    }

    /* renamed from: a */
    public final void m13252a(IronSourceError ironSourceError) {
        m13264a(C3473o1.a.FailedToLoad);
        InterfaceC3060e0 interfaceC3060e0 = this.f12797e;
        if (interfaceC3060e0 != null) {
            interfaceC3060e0.mo8432a(ironSourceError, this);
        } else {
            kotlin.jvm.internal.OooOo.OooOO0o("loadListener");
            throw null;
        }
    }

    /* renamed from: a */
    public final void m13264a(C3473o1.a performance) {
        kotlin.jvm.internal.OooOo.OooO0o0(performance, "performance");
        this.f12794b.m4740a(performance);
    }

    /* renamed from: a */
    public static final void m13253a(AbstractC3887z this$0, int i, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m13249a(i, str);
    }

    /* renamed from: a */
    public static final void m13254a(AbstractC3887z this$0, AdapterErrorType adapterErrorType, int i, String errorMessage) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterErrorType, "$adapterErrorType");
        kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "$errorMessage");
        this$0.m13250a(adapterErrorType, i, errorMessage);
    }

    /* renamed from: a */
    public final void m13265a(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        this.f12793a.m13090a(callback);
    }

    /* renamed from: a */
    public final void m13266a(boolean z) {
        this.f12793a.m9970e().m7902a().m9943a(z);
    }
}
