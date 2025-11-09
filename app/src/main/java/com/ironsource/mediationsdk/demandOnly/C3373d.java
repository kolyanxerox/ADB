package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2629a3;
import com.ironsource.C2995c5;
import com.ironsource.C3216ib;
import com.ironsource.C3353m5;
import com.ironsource.C3448nb;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3805wj;
import com.ironsource.C3899zb;
import com.ironsource.InterfaceC2631a5;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.C3391i;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.C3382m;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3370a;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3371b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.demandOnly.d */
/* loaded from: classes2.dex */
public class C3373d extends C3382m implements BannerSmashListener, InterfaceC2631a5 {

    /* renamed from: n */
    private C3216ib f9686n;

    /* renamed from: o */
    private C3216ib f9687o;

    /* renamed from: p */
    private String f9688p;

    /* renamed from: q */
    private String f9689q;

    /* renamed from: r */
    private C2995c5 f9690r;

    /* renamed from: s */
    private C3387e f9691s;

    /* renamed from: t */
    private ISDemandOnlyBannerLayout f9692t;

    /* renamed from: u */
    private final InterfaceC3223ii f9693u;

    /* renamed from: v */
    private final InterfaceC3223ii.a f9694v;

    /* renamed from: com.ironsource.mediationsdk.demandOnly.d$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3391i f9695a;

        public a(C3391i c3391i) {
            this.f9695a = c3391i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3373d.this.m10164a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f9695a.m10326r());
            C3373d.this.m10164a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f9695a.m10326r()}});
            C3373d.this.f9691s.m10264a(ContextProvider.getInstance().getApplicationContext(), this.f9695a, C3373d.this);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.demandOnly.d$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C3373d.this.m10252k());
            C3373d.this.m10167a(new IronSourceError(608, "load timed out"));
        }
    }

    public C3373d(String str, String str2, NetworkSettings networkSettings, long j, AbstractAdapter abstractAdapter, C3387e c3387e) {
        super(new C2629a3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f9693u = C3495on.m11199U().mo8689k();
        this.f9694v = C3495on.m11193O().mo8482e();
        this.f9764f = j;
        this.f9688p = str;
        this.f9689q = str2;
        this.f9690r = new C2995c5();
        this.f9759a.initBannerForBidding(str, str2, this.f9761c, this);
        this.f9691s = c3387e;
    }

    /* renamed from: c */
    private void m10170c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m10167a(new IronSourceError(618, "No available ad to load"));
            } else {
                m10164a(83302, (Object[][]) null);
                this.f9687o = new C3216ib();
                this.f9759a.initBannerForBidding(this.f9688p, this.f9689q, this.f9761c, this);
                this.f9759a.loadBannerForDemandOnlyForBidding(this.f9761c, str, this.f9692t, this);
            }
        }
    }

    /* renamed from: t */
    private boolean m10171t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f9692t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    /* renamed from: u */
    private void m10172u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(m10180q()));
    }

    /* renamed from: v */
    private void m10173v() {
        this.f9765g = null;
        this.f9766h = null;
        this.f9690r = new C2995c5();
    }

    /* renamed from: w */
    private void m10174w() {
        IronLog.INTERNAL.verbose();
        m10241a(new b());
    }

    @Override // com.ironsource.mediationsdk.demandOnly.C3382m
    /* renamed from: j */
    public Map<String, Object> mo10179j() {
        HashMap map = new HashMap();
        try {
            if (m10171t()) {
                map.put("reason", "banner is destroyed");
            } else {
                C3395l.m10365a(map, this.f9692t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f9759a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f9759a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f9760b.m4774i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f9760b.m4766a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (m10256o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.f9760b.m4769d()));
            if (!TextUtils.isEmpty(this.f9765g)) {
                map.put("auctionId", this.f9765g);
            }
            JSONObject jSONObject = this.f9766h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f9766h);
            }
            if (!TextUtils.isEmpty(this.f9768j)) {
                map.put("dynamicDemandSource", this.f9768j);
                return map;
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("Instance: " + m10250h() + StringUtils.SPACE + e.getMessage());
        }
        return map;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + m10182s());
        m10164a(3008, (Object[][]) null);
        if (m10171t()) {
            return;
        }
        this.f9692t.getListener().m11831a(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + m10182s());
        m10164a(InterfaceC3371b.b.f9670g, (Object[][]) null);
        if (m10171t()) {
            return;
        }
        this.f9692t.getListener().m11833b(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + m10182s());
        m10164a(83300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9687o))}});
        m10167a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + m10182s());
        InterfaceC3223ii interfaceC3223ii = this.f9693u;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        int iMo9344a = interfaceC3223ii.mo9344a(ad_unit);
        m10164a(InterfaceC3371b.c.f9676d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iMo9344a)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9687o))}});
        if (m10245a(C3382m.a.LOAD_IN_PROGRESS, C3382m.a.LOADED)) {
            m10257p();
            if (!m10171t()) {
                this.f9692t.m10156a(view, layoutParams);
            }
            m10164a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iMo9344a)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9686n))}});
            this.f9694v.mo9346b(ad_unit);
            m10169a(this.f9690r.m8094c(), IronSourceUtils.getCurrentMethodName());
            if (m10171t()) {
                return;
            }
            this.f9692t.getListener().m11834c(m10253l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (m10245a(C3382m.a.LOADED, C3382m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + m10182s());
            m10164a(3009, (Object[][]) null);
            m10169a(this.f9690r.m8090a(), IronSourceUtils.getCurrentMethodName());
            if (m10171t()) {
                return;
            }
            this.f9692t.getListener().m11835d(m10253l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + m10182s() + StringUtils.SPACE + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + m10182s());
    }

    /* renamed from: q */
    public C3391i m10180q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m10250h());
        String str = "" + m10251i() + m10250h();
        C3391i c3391i = new C3391i(IronSource.AD_UNIT.BANNER);
        c3391i.m10302a(arrayList);
        c3391i.m10312d(str);
        c3391i.m10309c(m10253l());
        c3391i.m10307b(IronSourceUtils.isEncryptedResponse());
        c3391i.m10304a(true);
        c3391i.m10310c(true);
        c3391i.m10296a(this.f9692t.getSize());
        return c3391i;
    }

    /* renamed from: r */
    public void m10181r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        m10238a(new C3382m.a[]{C3382m.a.LOADED, C3382m.a.LOAD_IN_PROGRESS, C3382m.a.SHOW_IN_PROGRESS}, C3382m.a.NOT_LOADED);
        if (m10171t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        m10257p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f9692t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.m10155a();
        }
        this.f9692t = null;
        AbstractAdapter abstractAdapter = this.f9759a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f9761c);
        }
        m10164a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + m10253l());
    }

    /* renamed from: s */
    public String m10182s() {
        return this.f9760b.m4773h().isMultipleInstances() ? this.f9760b.m4773h().getProviderTypeForReflection() : this.f9760b.m4773h().getProviderName();
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10175a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.f9765g = null;
        this.f9766h = null;
        m10164a(InterfaceC3371b.c.f9679g, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m10252k()}});
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            m10167a(new IronSourceError(621, "No available ad to load"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10164a(int i, Object[][] objArr) {
        Map<String, Object> mapMo10179j = mo10179j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapMo10179j.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        C3805wj.m12898i().mo12605a(new C3899zb(i, new JSONObject(mapMo10179j)));
    }

    @Override // com.ironsource.InterfaceC2631a5
    /* renamed from: a */
    public void mo4777a(C3368d.a aVar, int i, long j, int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f9765g = aVar.m10146a();
        this.f9766h = aVar.m10151f();
        InterfaceC3370a.a aVar2 = new InterfaceC3370a.a(aVar.m10153h());
        if (!TextUtils.isEmpty(str)) {
            m10164a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m10164a(InterfaceC3371b.c.f9680h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        m10164a(InterfaceC3371b.c.f9682j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.mo10159b()}});
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            if (aVar2.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(InterfaceC3371b.b.f9672i, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                m10167a(ironSourceError);
                return;
            }
            C3353m5 c3353m5 = aVar2.get(0);
            this.f9690r.m8091a(c3353m5.m9985b());
            this.f9690r.m8095c(c3353m5.m9991h());
            this.f9690r.m8093b(c3353m5.m9990g());
            String strM9994k = c3353m5.m9994k();
            m10247b(strM9994k);
            m10170c(strM9994k);
        }
    }

    /* renamed from: a */
    public void m10176a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m10252k());
        if (iSDemandOnlyBannerLayout == null) {
            m10164a(InterfaceC3371b.c.f9677e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + m10252k()}});
            return;
        }
        C3382m.a[] aVarArr = {C3382m.a.NOT_LOADED, C3382m.a.LOADED};
        C3382m.a aVar = C3382m.a.LOAD_IN_PROGRESS;
        C3382m.a aVarM10238a = m10238a(aVarArr, aVar);
        if (aVarM10238a == aVar || aVarM10238a == C3382m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                m10164a(InterfaceC3371b.c.f9677e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + m10252k()}});
                return;
            } else {
                String str = "banner layout in blocking state | state: " + m10252k();
                iSDemandOnlyBannerLayout.getListener().m11832a(m10253l(), new IronSourceError(619, str));
                m10164a(InterfaceC3371b.c.f9677e, new Object[][]{new Object[]{"reason", str}});
                return;
            }
        }
        m10173v();
        m10164a(3002, (Object[][]) null);
        if (!m10256o()) {
            ironLog.verbose("can't load banner when isOneFlow = false");
            m10167a(new IronSourceError(1063, "Missing configuration settings"));
            return;
        }
        this.f9692t = iSDemandOnlyBannerLayout;
        this.f9686n = new C3216ib();
        m10174w();
        if (this.f9691s.m10271a()) {
            m10172u();
        } else {
            ironLog.verbose("can't load the banner the auction isn't enabled");
            m10167a(new IronSourceError(1063, "Missing server configuration"));
        }
    }

    /* renamed from: a */
    public void m10177a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, InterfaceC3384o interfaceC3384o) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m10252k());
        if (iSDemandOnlyBannerLayout == null) {
            m10164a(InterfaceC3371b.c.f9677e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + m10252k()}});
            return;
        }
        C3382m.a[] aVarArr = {C3382m.a.NOT_LOADED, C3382m.a.LOADED};
        C3382m.a aVar = C3382m.a.LOAD_IN_PROGRESS;
        C3382m.a aVarM10238a = m10238a(aVarArr, aVar);
        if (aVarM10238a == aVar || aVarM10238a == C3382m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                m10164a(InterfaceC3371b.c.f9677e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + m10252k()}});
                return;
            } else {
                String str = "banner layout in blocking state | state: " + m10252k();
                iSDemandOnlyBannerLayout.getListener().m11832a(m10253l(), new IronSourceError(619, str));
                m10164a(InterfaceC3371b.c.f9677e, new Object[][]{new Object[]{"reason", str}});
                return;
            }
        }
        m10173v();
        m10164a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            m10167a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f9692t = iSDemandOnlyBannerLayout;
        if (!m10255n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            m10164a(3300, (Object[][]) null);
            m10167a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            C3368d.a aVar2 = (C3368d.a) interfaceC3384o.mo10258a(new C3448nb());
            C3353m5 c3353m5Mo10157a = new InterfaceC3370a.a(aVar2.m10153h()).mo10157a(m10250h());
            if (c3353m5Mo10157a == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                m10164a(3300, (Object[][]) null);
            } else {
                String strM9994k = c3353m5Mo10157a.m9994k();
                if (strM9994k != null) {
                    m10247b(strM9994k);
                    m10239a(aVar2.m10146a());
                    m10242a(aVar2.m10151f());
                    m10164a(83302, (Object[][]) null);
                    this.f9690r.m8091a(c3353m5Mo10157a.m9985b());
                    this.f9686n = new C3216ib();
                    m10174w();
                    this.f9759a.initBannerForBidding(this.f9688p, this.f9689q, this.f9761c, this);
                    this.f9759a.loadBannerForDemandOnlyForBidding(this.f9761c, strM9994k, iSDemandOnlyBannerLayout, this);
                    return;
                }
                ironLog.error("serverData is null");
                ironSourceError = new IronSourceError(618, "No available ad to load");
            }
            m10167a(ironSourceError);
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "loadBannerForBidder: Exception= ");
            sbOooOOO0.append(e.getMessage());
            m10167a(ErrorBuilder.buildLoadFailedError(sbOooOOO0.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10167a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + m10182s());
        if (m10245a(C3382m.a.LOAD_IN_PROGRESS, C3382m.a.NOT_LOADED)) {
            m10257p();
            m10168a(ironSourceError, C3216ib.m9304a(this.f9686n));
            m10169a(this.f9690r.m8092b(), IronSourceUtils.getCurrentMethodName());
            if (m10171t()) {
                return;
            }
            this.f9692t.getListener().m11832a(m10253l(), ironSourceError);
        }
    }

    /* renamed from: a */
    private void m10168a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            m10164a(InterfaceC3371b.b.f9672i, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            m10164a(3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
    }

    /* renamed from: a */
    private void m10169a(List<String> list, String str) {
        m10240a(list, m10250h(), m10251i(), this.f9768j, str);
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10178a(List<C3353m5> list, String str, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }
}
