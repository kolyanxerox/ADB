package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3514p7;
import com.ironsource.C3350m2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.C3391i;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.C3402n;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.g6 */
/* loaded from: classes2.dex */
public class C3141g6 extends AbstractC3514p7<C3280k6, AdapterAdViewListener> implements InterfaceC3543q1, InterfaceC3106f6 {

    /* renamed from: K */
    private C2633a7 f8697K;

    /* renamed from: L */
    private boolean f8698L;

    /* renamed from: M */
    private IronSourceBannerLayout f8699M;

    /* renamed from: N */
    private View f8700N;

    /* renamed from: O */
    private AbstractC3619s7<?> f8701O;

    /* renamed from: P */
    private FrameLayout.LayoutParams f8702P;

    /* renamed from: Q */
    private final AtomicBoolean f8703Q;

    /* renamed from: R */
    private final AtomicBoolean f8704R;

    /* renamed from: com.ironsource.g6$a */
    public class a implements InterfaceC3033d8 {

        /* renamed from: a */
        final /* synthetic */ AbstractC3619s7 f8705a;

        public a(AbstractC3619s7 abstractC3619s7) {
            this.f8705a = abstractC3619s7;
        }

        @Override // com.ironsource.InterfaceC3033d8
        /* renamed from: a */
        public void mo8286a() {
            ((C3280k6) this.f8705a).m9650Q();
        }
    }

    /* renamed from: com.ironsource.g6$b */
    public class b implements InterfaceC3033d8 {

        /* renamed from: a */
        final /* synthetic */ AbstractC3619s7 f8707a;

        public b(AbstractC3619s7 abstractC3619s7) {
            this.f8707a = abstractC3619s7;
        }

        @Override // com.ironsource.InterfaceC3033d8
        /* renamed from: a */
        public void mo8286a() {
            ((C3280k6) this.f8707a).m9650Q();
            C3141g6 c3141g6 = C3141g6.this;
            c3141g6.f10786s.f7687i.m9953j(c3141g6.m11357n());
            C3141g6.this.f8703Q.set(false);
            C3141g6.this.m8886W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + C3141g6.this.f10782o.m12340h().m9975b() + ", current timestamp = " + System.currentTimeMillis());
            C3141g6.this.m8880O().m4788h();
        }
    }

    /* renamed from: com.ironsource.g6$c */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f8709a;

        static {
            int[] iArr = new int[C3350m2.a.values().length];
            f8709a = iArr;
            try {
                iArr[C3350m2.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8709a[C3350m2.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C3141g6(List<NetworkSettings> list, C3723u6 c3723u6, String str, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        super(new C3176h6(str, list, c3723u6), c3840xk, ironSourceSegment);
        this.f8698L = false;
        this.f8703Q = new AtomicBoolean(true);
        this.f8704R = new AtomicBoolean(false);
        this.f8697K = m8879N();
    }

    /* renamed from: M */
    private void m8878M() {
        int i = c.f8709a[this.f10784q.m11076b().m9974a().ordinal()];
        if (i == 1) {
            m8881P().m11074a();
        } else {
            if (i != 2) {
                return;
            }
            m8881P().m8913l();
            m8881P().m8914m();
            m8880O().m4785a();
            m8880O().m4786b();
        }
    }

    /* renamed from: N */
    private C2633a7 m8879N() {
        return new C2633a7(this.f10782o.m12340h(), this.f10782o.m12339g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public C2633a7 m8880O() {
        return this.f8697K;
    }

    /* renamed from: P */
    private C3142g7 m8881P() {
        return (C3142g7) this.f10784q;
    }

    /* renamed from: Q */
    private ISBannerSize m8882Q() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f8699M;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.f8699M.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? C3395l.m10352a() : ISBannerSize.BANNER : this.f8699M.getSize();
    }

    /* renamed from: S */
    private boolean m8883S() {
        IronLog.INTERNAL.verbose(m11349b(this.f8700N + ", " + this.f8702P + ", " + this.f8701O));
        return (this.f8700N == null || this.f8702P == null || this.f8701O == null) ? false : true;
    }

    /* renamed from: U */
    private void m8884U() {
        int i = c.f8709a[this.f10784q.m11076b().m9974a().ordinal()];
        if (i == 1) {
            m8881P().m11083k();
        } else {
            if (i != 2) {
                return;
            }
            m8881P().m8917r();
        }
    }

    /* renamed from: V */
    private void m8885V() {
        int i = c.f8709a[this.f10784q.m11076b().m9974a().ordinal()];
        if (i == 1) {
            m8881P().m11083k();
        } else {
            if (i != 2) {
                return;
            }
            m8881P().m8916q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m8886W() {
        this.f8701O = null;
        this.f8700N = null;
        this.f8702P = null;
    }

    /* renamed from: R */
    public boolean m8892R() {
        IronLog ironLog;
        String str;
        if (!this.f8699M.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.f8699M.hasWindowFocus()) {
                boolean globalVisibleRect = this.f8699M.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    /* renamed from: T */
    public void m8893T() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f8699M;
        if (ironSourceBannerLayout != null) {
            m8898a(ironSourceBannerLayout);
        }
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public LoadWhileShowSupportState mo8894a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getBannerLoadWhileShowSupportedState(networkSettings);
    }

    /* renamed from: b */
    public C3280k6 m8902b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i, String str, C3353m5 c3353m5) {
        return new C3280k6(this, new C3275k1(IronSource.AD_UNIT.BANNER, this.f10782o.mo8380o(), i, this.f10774g, str, this.f10772e, this.f10773f, networkSettings, this.f10782o.m12345n()), baseAdAdapter, this.f8699M, this.f10776i, mo8201v(), c3353m5, this);
    }

    @Override // com.ironsource.InterfaceC3614s2
    /* renamed from: d */
    public void mo8907d(AbstractC3619s7<?> abstractC3619s7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3619s7.m11872k()));
        this.f10787t.mo7879b(abstractC3619s7.m11867f());
    }

    @Override // com.ironsource.InterfaceC3106f6
    /* renamed from: e */
    public void mo8640e() {
        if (!m8892R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            m8880O().m4788h();
            this.f10786s.f7684f.m7951b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else {
            if (!m8883S()) {
                IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
                this.f8703Q.set(true);
                return;
            }
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            m8891c(this.f8701O, this.f8700N, this.f8702P);
        }
    }

    @Override // com.ironsource.InterfaceC3106f6
    /* renamed from: f */
    public void mo8641f() {
        if (!m8892R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            m8880O().m4787e();
        } else if (this.f8704R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            m8884U();
            this.f10786s.f7688j.m9909b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: g */
    public AbstractC3241j2 mo8198g() {
        return new C2962b7();
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: h */
    public C3474o2 mo8909h() {
        return new C3142g7(this.f10782o.m12340h(), this);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: l */
    public String mo8199l() {
        return "BN";
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: o */
    public String mo8200o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: v */
    public boolean mo8201v() {
        return this.f8698L;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public AdData mo8895a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(mo8197b(networkSettings), this.f10782o.m12333b(), str, this.f8699M);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: b */
    public JSONObject mo8197b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    @Override // com.ironsource.InterfaceC3614s2
    /* renamed from: c */
    public void mo8906c(AbstractC3619s7<?> abstractC3619s7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3619s7.m11872k()));
        this.f10787t.mo7881e(abstractC3619s7.m11867f());
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: g */
    public void mo8908g(AbstractC3619s7<?> abstractC3619s7) {
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: h */
    public void mo8910h(AbstractC3619s7<?> abstractC3619s7) {
    }

    /* renamed from: c */
    private void m8891c(AbstractC3619s7<?> abstractC3619s7, View view, FrameLayout.LayoutParams layoutParams) {
        if (m11348a(AbstractC3514p7.f.READY_TO_SHOW, AbstractC3514p7.f.SHOWING)) {
            this.f8704R.set(false);
            m8880O().m4787e();
            ((C3280k6) abstractC3619s7).m9651R();
            C3395l.m10360a(this.f8699M, view, layoutParams, new b(abstractC3619s7));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.f10783p);
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC3619s7 mo8191a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str, C3353m5 c3353m5) {
        return m8902b(networkSettings, (BaseAdAdapter<?, AdapterAdViewListener>) baseAdAdapter, i, str, c3353m5);
    }

    @Override // com.ironsource.AbstractC3514p7, com.ironsource.InterfaceC3193hn
    /* renamed from: b */
    public void mo8903b() {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11353i());
        try {
            if (this.f8699M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.f10786s.f7684f.m7951b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            if (!m8892R()) {
                if (this.f10782o.m12340h().m9974a() == C3350m2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                    ironLog.verbose("banner is not visible, reload skipped");
                    this.f10786s.f7684f.m7951b(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
                }
                m8884U();
                return;
            }
            synchronized (this.f10791x) {
                try {
                    if (m11348a(AbstractC3514p7.f.SHOWING, AbstractC3514p7.f.READY_TO_LOAD)) {
                        ironLog.verbose("start reload");
                        z = true;
                        this.f8698L = true;
                    } else {
                        ironLog.error("wrong state = " + this.f10783p);
                        z = false;
                    }
                } finally {
                }
            }
            if (z) {
                m8899a(this.f8699M, this.f10776i);
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            this.f10786s.f7688j.m9912c(th.getMessage());
        }
    }

    @Override // com.ironsource.AbstractC3514p7, com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        Map<String, Object> mapMo4765a = super.mo4765a(enumC3889z1);
        if (m8905b(this.f8699M)) {
            C3395l.m10365a(mapMo4765a, this.f8699M.getSize());
        }
        if (this.f10776i != null) {
            mapMo4765a.put("placement", m11357n());
        }
        return mapMo4765a;
    }

    @Override // com.ironsource.AbstractC3514p7, com.ironsource.InterfaceC3509p2
    /* renamed from: b */
    public void mo8904b(AbstractC3619s7<?> abstractC3619s7) throws NumberFormatException {
        super.mo8904b(abstractC3619s7);
        if (m8881P().m8915o()) {
            if (!this.f8704R.compareAndSet(false, true)) {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            } else {
                m8880O().m4786b();
                m8884U();
            }
        }
    }

    /* renamed from: b */
    private void m8889b(AbstractC3619s7<?> abstractC3619s7, View view, FrameLayout.LayoutParams layoutParams) {
        ((C3280k6) abstractC3619s7).m9651R();
        C3395l.m10360a(this.f8699M, view, layoutParams, new a(abstractC3619s7));
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public void mo8896a(int i, String str, boolean z) {
        if (!mo8201v()) {
            super.mo8896a(i, str, z);
            return;
        }
        if (!z) {
            this.f10786s.f7684f.m7944a(C3216ib.m9304a(this.f10781n), i, str);
            C3402n.m10397a().m10402b(this.f10782o.m12333b(), new IronSourceError(i, str));
        }
        if (mo8201v()) {
            m11345a(AbstractC3514p7.f.SHOWING);
            m8885V();
        }
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: a */
    public void mo8897a(Context context, C3391i c3391i, InterfaceC3581r4 interfaceC3581r4) {
        if (this.f10770c == null) {
            IronLog.INTERNAL.error(m11349b("mAuctionHandler is null"));
        } else {
            c3391i.m10296a(m8882Q());
            this.f10770c.m10264a(context, c3391i, interfaceC3581r4);
        }
    }

    /* renamed from: b */
    public boolean m8905b(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    /* renamed from: a */
    public void m8898a(IronSourceBannerLayout ironSourceBannerLayout) {
        try {
            if (!m8905b(ironSourceBannerLayout)) {
                IronLog.API.error("destroy banner failed - errorMessage = ".concat("can't destroy banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed")));
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            m8878M();
            C3280k6 c3280k6 = (C3280k6) this.f10768a.m9725d();
            if (c3280k6 != null) {
                this.f10786s.f7684f.m7941a(c3280k6.m11878r() != null ? c3280k6.m11878r().intValue() : this.f10760C.mo9344a(this.f10782o.m12333b()));
                c3280k6.m9649P();
                this.f10768a.m9719a(null);
                this.f10768a.m9723b(null);
            }
            C3395l.m10357a(ironSourceBannerLayout);
            this.f8699M = null;
            this.f10776i = null;
            this.f8698L = false;
            if (m8881P().m8915o()) {
                this.f8703Q.set(true);
                this.f8704R.set(false);
                m8886W();
            }
            m11345a(AbstractC3514p7.f.READY_TO_LOAD);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("destroyBanner - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            sbOooOOO.append(" state = ");
            sbOooOOO.append(this.f10783p);
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m11349b(string));
            C2992c2 c2992c2 = this.f10786s;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g(string);
            }
        }
    }

    /* renamed from: a */
    public void m8899a(IronSourceBannerLayout ironSourceBannerLayout, Placement placement) {
        String strConcat;
        IronLog.INTERNAL.verbose("placement = " + placement);
        int iM13115b = 510;
        if (!m8905b(ironSourceBannerLayout)) {
            strConcat = "can't load banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
        } else if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            strConcat = "can't load banner - ".concat(placement == null ? "placement is null" : "placement name is empty");
            iM13115b = C3855y1.m13115b(this.f10782o.m12333b());
        } else if (this.f10762E.mo9483b(ContextProvider.getInstance().getApplicationContext(), placement, this.f10782o.m12333b())) {
            strConcat = OooO0oO.OooOo.OooOO0O("placement ", placement.getPlacementName(), " is capped");
            iM13115b = C3855y1.m13119f(this.f10782o.m12333b());
        } else {
            strConcat = null;
        }
        if (!TextUtils.isEmpty(strConcat)) {
            IronLog.API.error(m11349b(strConcat));
            mo8896a(iM13115b, strConcat, false);
        } else {
            C3395l.m10369b(ironSourceBannerLayout);
            this.f8699M = ironSourceBannerLayout;
            this.f10776i = placement;
            m11336A();
        }
    }

    @Override // com.ironsource.InterfaceC3614s2
    /* renamed from: a */
    public void mo8900a(AbstractC3619s7<?> abstractC3619s7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3619s7.m11872k()));
        this.f10787t.mo7882f(abstractC3619s7.m11867f());
    }

    @Override // com.ironsource.InterfaceC3543q1
    /* renamed from: a */
    public void mo8901a(AbstractC3619s7<?> abstractC3619s7, View view, FrameLayout.LayoutParams layoutParams) throws NumberFormatException {
        IronLog.INTERNAL.verbose("mState = " + this.f10783p);
        super.mo11247e(abstractC3619s7);
        if (this.f10782o.m12340h().m9974a() == C3350m2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (!m11348a(AbstractC3514p7.f.READY_TO_SHOW, AbstractC3514p7.f.SHOWING)) {
                return;
            }
            this.f10768a.m9719a(abstractC3619s7);
            this.f10768a.m9723b(abstractC3619s7);
            m8889b(abstractC3619s7, view, layoutParams);
            m8881P().m11083k();
        } else {
            if (!m8881P().m8915o()) {
                return;
            }
            this.f10768a.m9723b(abstractC3619s7);
            if (this.f8703Q.get()) {
                m8891c(abstractC3619s7, view, layoutParams);
            } else {
                this.f8701O = abstractC3619s7;
                this.f8700N = view;
                this.f8702P = layoutParams;
            }
        }
        this.f10787t.mo7880c(abstractC3619s7.m11867f());
    }
}
