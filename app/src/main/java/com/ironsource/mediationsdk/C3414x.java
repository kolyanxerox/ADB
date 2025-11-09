package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C2629a3;
import com.ironsource.C3177h7;
import com.ironsource.C3216ib;
import com.ironsource.C3551q9;
import com.ironsource.C3702tk;
import com.ironsource.C3747uu;
import com.ironsource.C3805wj;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC2634a8;
import com.ironsource.InterfaceC3846xq;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x */
/* loaded from: classes2.dex */
public class C3414x extends AbstractC3415y implements BannerSmashListener, C3747uu.a, InterfaceC2634a8 {

    /* renamed from: h */
    private C3394k f10233h;

    /* renamed from: i */
    private C3747uu f10234i;

    /* renamed from: j */
    private a f10235j;

    /* renamed from: k */
    private InterfaceC3846xq f10236k;

    /* renamed from: l */
    private IronSourceBannerLayout f10237l;

    /* renamed from: m */
    private String f10238m;

    /* renamed from: n */
    private JSONObject f10239n;

    /* renamed from: o */
    private int f10240o;

    /* renamed from: p */
    private String f10241p;

    /* renamed from: q */
    private C3177h7 f10242q;

    /* renamed from: r */
    private final Object f10243r;

    /* renamed from: s */
    private C3216ib f10244s;

    /* renamed from: t */
    private boolean f10245t;

    /* renamed from: u */
    private boolean f10246u;

    /* renamed from: v */
    private JSONObject f10247v;

    /* renamed from: com.ironsource.mediationsdk.x$a */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public C3414x(C3394k c3394k, InterfaceC3846xq interfaceC3846xq, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C2629a3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f10243r = new Object();
        this.f10235j = a.NONE;
        this.f10233h = c3394k;
        this.f10234i = new C3747uu(c3394k.m10342e());
        this.f10236k = interfaceC3846xq;
        this.f10261f = i;
        this.f10238m = str;
        this.f10240o = i2;
        this.f10241p = str2;
        this.f10239n = jSONObject;
        this.f10245t = z;
        this.f10247v = null;
        if (m10809r()) {
            m10780u();
        }
    }

    /* renamed from: A */
    private void m10771A() {
        IronLog.INTERNAL.verbose();
        m10776a(a.INIT_IN_PROGRESS);
        m10774F();
        try {
            if (this.f10256a != null) {
                if (m10808p()) {
                    this.f10256a.initBannerForBidding(this.f10233h.m10338a(), this.f10233h.m10346i(), this.f10259d, this);
                } else {
                    this.f10256a.initBanners(this.f10233h.m10338a(), this.f10233h.m10346i(), this.f10259d, this);
                }
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f10256a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
            m10785a(EnumC2638ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    /* renamed from: B */
    private boolean m10772B() {
        boolean z;
        synchronized (this.f10243r) {
            z = this.f10235j == a.DESTROYED;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m10773C() {
        boolean z;
        synchronized (this.f10243r) {
            z = this.f10235j == a.LOADED;
        }
        return z;
    }

    /* renamed from: F */
    private void m10774F() {
        if (this.f10256a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f10256a.setPluginData(pluginType);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f10256a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            m10785a(EnumC2638ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    /* renamed from: b */
    private boolean m10779b(EnumC2638ac enumC2638ac) {
        return enumC2638ac == EnumC2638ac.BN_INSTANCE_LOAD_SUCCESS || enumC2638ac == EnumC2638ac.BN_INSTANCE_LOAD || enumC2638ac == EnumC2638ac.BN_INSTANCE_RELOAD || enumC2638ac == EnumC2638ac.BN_INSTANCE_RELOAD_SUCCESS || enumC2638ac == EnumC2638ac.BN_INSTANCE_CLICK || enumC2638ac == EnumC2638ac.BN_INSTANCE_DESTROY || enumC2638ac == EnumC2638ac.BN_INSTANCE_LOAD_ERROR || enumC2638ac == EnumC2638ac.BN_INSTANCE_LOAD_NO_FILL || enumC2638ac == EnumC2638ac.BN_INSTANCE_RELOAD_NO_FILL || enumC2638ac == EnumC2638ac.BN_INSTANCE_PRESENT_SCREEN || enumC2638ac == EnumC2638ac.BN_INSTANCE_DISMISS_SCREEN || enumC2638ac == EnumC2638ac.BN_INSTANCE_LEAVE_APP || enumC2638ac == EnumC2638ac.BN_INSTANCE_SHOW;
    }

    /* renamed from: u */
    private void m10780u() {
        IronLog.INTERNAL.verbose("isBidder = " + m10808p() + ", shouldEarlyInit = " + m10810s());
        this.f10246u = true;
        m10771A();
    }

    /* renamed from: D */
    public void m10781D() {
        this.f10256a.onBannerViewBound(this.f10257b.m4773h().getBannerSettings());
    }

    /* renamed from: E */
    public void m10782E() {
        this.f10256a.onBannerViewWillBind(this.f10257b.m4773h().getBannerSettings());
    }

    @Override // com.ironsource.C3747uu.a
    /* renamed from: a */
    public void mo10783a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m10800f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (m10778a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else {
            if (!m10778a(a.LOADING, aVar2)) {
                ironLog.error("unexpected state - " + this.f10235j);
                return;
            }
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        m10775a(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC2634a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        m10784a(EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f10256a.collectBannerBiddingData(this.f10259d, adData != null ? C3702tk.m12447a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f10256a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3415y
    /* renamed from: d */
    public IronSource.AD_UNIT mo10629d() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.ironsource.mediationsdk.AbstractC3415y
    /* renamed from: k */
    public String mo10630k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(m10800f());
        m10784a(EnumC2638ac.BN_INSTANCE_CLICK);
        InterfaceC3846xq interfaceC3846xq = this.f10236k;
        if (interfaceC3846xq != null) {
            interfaceC3846xq.mo10765b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(m10800f());
        m10784a(EnumC2638ac.BN_INSTANCE_LEAVE_APP);
        InterfaceC3846xq interfaceC3846xq = this.f10236k;
        if (interfaceC3846xq != null) {
            interfaceC3846xq.mo10766c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(m10792y() + "error = " + ironSourceError);
        this.f10234i.m12718e();
        if (m10778a(a.LOADING, a.LOAD_FAILED)) {
            m10775a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(m10800f());
        this.f10234i.m12718e();
        if (!m10778a(a.LOADING, a.LOADED)) {
            m10784a(this.f10245t ? EnumC2638ac.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : EnumC2638ac.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        m10785a(this.f10245t ? EnumC2638ac.BN_INSTANCE_RELOAD_SUCCESS : EnumC2638ac.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10244s))}});
        InterfaceC3846xq interfaceC3846xq = this.f10236k;
        if (interfaceC3846xq != null) {
            interfaceC3846xq.mo10764a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(m10800f());
        m10784a(EnumC2638ac.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC3846xq interfaceC3846xq = this.f10236k;
        if (interfaceC3846xq != null) {
            interfaceC3846xq.mo10768e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(m10800f());
        m10784a(EnumC2638ac.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC3846xq interfaceC3846xq = this.f10236k;
        if (interfaceC3846xq != null) {
            interfaceC3846xq.mo10767d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m10800f());
        if (m10773C()) {
            m10784a(EnumC2638ac.BN_INSTANCE_SHOW);
            InterfaceC3846xq interfaceC3846xq = this.f10236k;
            if (interfaceC3846xq != null) {
                interfaceC3846xq.mo10763a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f10235j);
        m10785a(EnumC2638ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f10235j}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo9129c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m10792y() + "error = " + ironSourceError);
        this.f10234i.m12718e();
        if (!m10778a(a.INIT_IN_PROGRESS, a.NONE)) {
            ironLog.warning("wrong state - mState = " + this.f10235j);
        } else {
            InterfaceC3846xq interfaceC3846xq = this.f10236k;
            if (interfaceC3846xq != null) {
                interfaceC3846xq.mo10762a(ironSourceError, this, false);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(m10800f());
        if (m10778a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f10246u) {
                this.f10246u = false;
            } else {
                if (m10808p()) {
                    return;
                }
                if (C3395l.m10370c(this.f10237l)) {
                    m10777a((String) null, this.f10247v);
                } else {
                    this.f10236k.mo10762a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f10237l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3415y
    /* renamed from: q */
    public void mo10787q() {
        this.f10234i.m8578d();
        super.mo10787q();
    }

    /* renamed from: t */
    public void m10788t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m10800f());
        m10784a(EnumC2638ac.BN_INSTANCE_DESTROY);
        m10776a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f10256a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f10257b.m4773h().getBannerSettings());
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f10256a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            m10785a(EnumC2638ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    /* renamed from: v */
    public String m10789v() {
        return !TextUtils.isEmpty(this.f10257b.m4773h().getAdSourceNameForEvents()) ? this.f10257b.m4773h().getAdSourceNameForEvents() : m10803i();
    }

    /* renamed from: w */
    public AbstractAdapter m10790w() {
        return this.f10256a;
    }

    /* renamed from: x */
    public String m10791x() {
        return this.f10238m;
    }

    /* renamed from: y */
    public String m10792y() {
        return OooOo.OooOoo0(m10800f(), " - ");
    }

    /* renamed from: z */
    public String m10793z() {
        return this.f10257b.m4774i();
    }

    public C3414x(C3394k c3394k, InterfaceC3846xq interfaceC3846xq, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(c3394k, interfaceC3846xq, networkSettings, abstractAdapter, i, "", null, 0, "", z);
    }

    /* renamed from: a */
    public void m10784a(EnumC2638ac enumC2638ac) {
        m10785a(enumC2638ac, (Object[][]) null);
    }

    /* renamed from: a */
    public void m10785a(EnumC2638ac enumC2638ac, Object[][] objArr) {
        Map<String, Object> mapM10805m = m10805m();
        if (m10772B()) {
            mapM10805m.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.f10237l;
            if (ironSourceBannerLayout != null) {
                C3395l.m10365a(mapM10805m, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f10238m)) {
            mapM10805m.put("auctionId", this.f10238m);
        }
        JSONObject jSONObject = this.f10239n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM10805m.put("genericParams", this.f10239n);
        }
        C3177h7 c3177h7 = this.f10242q;
        if (c3177h7 != null) {
            mapM10805m.put("placement", c3177h7.getPlacementName());
        }
        if (m10779b(enumC2638ac)) {
            C3805wj.m12898i().m12611a(mapM10805m, this.f10240o, this.f10241p);
        }
        mapM10805m.put("sessionDepth", Integer.valueOf(this.f10261f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM10805m.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(mo9129c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        C3805wj.m12898i().mo12605a(new C3899zb(enumC2638ac, new JSONObject(mapM10805m)));
    }

    /* renamed from: a */
    public void m10786a(IronSourceBannerLayout ironSourceBannerLayout, C3177h7 c3177h7, String str, JSONObject jSONObject) {
        InterfaceC3846xq interfaceC3846xq;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m10800f());
        this.f10242q = c3177h7;
        this.f10247v = jSONObject;
        if (!C3395l.m10370c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            interfaceC3846xq = this.f10236k;
            ironSourceError = new IronSourceError(610, str2);
        } else {
            if (this.f10256a != null) {
                this.f10237l = ironSourceBannerLayout;
                this.f10234i.m12717a((C3747uu.a) this);
                try {
                    if (m10808p()) {
                        m10777a(str, this.f10247v);
                        return;
                    } else {
                        m10771A();
                        return;
                    }
                } catch (Throwable th) {
                    C3551q9.m11517d().m11519a(th);
                    IronLog.INTERNAL.error("exception = " + th.getLocalizedMessage());
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                    return;
                }
            }
            ironLog.verbose("mAdapter is null");
            interfaceC3846xq = this.f10236k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        }
        interfaceC3846xq.mo10762a(ironSourceError, this, false);
    }

    /* renamed from: a */
    private void m10775a(IronSourceError ironSourceError) {
        boolean z = ironSourceError.getErrorCode() == 606;
        boolean z2 = this.f10245t;
        if (z) {
            m10785a(z2 ? EnumC2638ac.BN_INSTANCE_RELOAD_NO_FILL : EnumC2638ac.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10244s))}});
        } else {
            m10785a(z2 ? EnumC2638ac.BN_INSTANCE_RELOAD_ERROR : EnumC2638ac.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10244s))}});
        }
        InterfaceC3846xq interfaceC3846xq = this.f10236k;
        if (interfaceC3846xq != null) {
            interfaceC3846xq.mo10762a(ironSourceError, this, z);
        }
    }

    /* renamed from: a */
    private void m10776a(a aVar) {
        IronLog.INTERNAL.verbose(m10792y() + "state = " + aVar.name());
        synchronized (this.f10243r) {
            this.f10235j = aVar;
        }
    }

    /* renamed from: a */
    private void m10777a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m10800f());
        if (!m10778a(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.f10235j);
            return;
        }
        this.f10244s = new C3216ib();
        m10784a(this.f10245t ? EnumC2638ac.BN_INSTANCE_RELOAD : EnumC2638ac.BN_INSTANCE_LOAD);
        if (this.f10256a == null) {
            return;
        }
        try {
            try {
                if (m10808p()) {
                    this.f10256a.loadBannerForBidding(this.f10259d, this.f10247v, str, this.f10237l, this);
                } else {
                    this.f10256a.loadBanner(this.f10259d, this.f10247v, this.f10237l, this);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                C3551q9.m11517d().m11519a(th2);
                IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f10256a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th2.getLocalizedMessage()));
                m10785a(EnumC2638ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th2.getLocalizedMessage()}});
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    private boolean m10778a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.f10243r) {
            try {
                if (this.f10235j == aVar) {
                    IronLog.INTERNAL.verbose(m10792y() + "set state from '" + this.f10235j + "' to '" + aVar2 + "'");
                    this.f10235j = aVar2;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
