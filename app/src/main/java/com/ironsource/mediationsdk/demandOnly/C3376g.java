package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2629a3;
import com.ironsource.C2995c5;
import com.ironsource.C3105f5;
import com.ironsource.C3216ib;
import com.ironsource.C3353m5;
import com.ironsource.C3448nb;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3805wj;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC2631a5;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.C3391i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.C3382m;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3370a;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3374e;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3383n;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3385p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.demandOnly.g */
/* loaded from: classes2.dex */
public class C3376g extends C3382m implements InterfaceC3383n.a, InterstitialSmashListener, InterfaceC2631a5 {

    /* renamed from: n */
    private C3216ib f9712n;

    /* renamed from: o */
    private C3216ib f9713o;

    /* renamed from: p */
    private ISDemandOnlyInterstitialListener f9714p;

    /* renamed from: q */
    private C2995c5 f9715q;

    /* renamed from: r */
    private C3387e f9716r;

    /* renamed from: s */
    private InterfaceC3385p f9717s;

    /* renamed from: t */
    private final InterfaceC3223ii f9718t;

    /* renamed from: u */
    private final InterfaceC3223ii.a f9719u;

    /* renamed from: com.ironsource.mediationsdk.demandOnly.g$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C3376g.this.m10252k());
            C3376g.this.m10198a(new IronSourceError(1052, "load timed out"));
        }
    }

    /* renamed from: com.ironsource.mediationsdk.demandOnly.g$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C3376g.this.m10252k());
            C3376g.this.m10198a(new IronSourceError(1052, "load timed out"));
        }
    }

    public C3376g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j, AbstractAdapter abstractAdapter, C3387e c3387e) {
        super(new C2629a3(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f9717s = new InterfaceC3385p.b();
        this.f9718t = C3495on.m11199U().mo8689k();
        this.f9719u = C3495on.m11193O().mo8482e();
        this.f9714p = iSDemandOnlyInterstitialListener;
        this.f9764f = j;
        this.f9716r = c3387e;
        this.f9759a.initInterstitial(str, str2, this.f9761c, this);
    }

    /* renamed from: q */
    private C3391i m10192q() {
        String str = m10251i() + m10250h();
        C3391i c3391i = new C3391i(this.f9771m);
        c3391i.m10307b(IronSourceUtils.isEncryptedResponse());
        c3391i.m10304a(true);
        c3391i.m10310c(true);
        c3391i.m10312d(str);
        c3391i.m10309c(m10253l());
        c3391i.m10294a(this.f9718t.mo9344a(this.f9771m));
        C3105f5 c3105f5 = new C3105f5(m10250h(), false);
        c3105f5.m8628a(this.f9717s.value());
        Map<String, Object> interstitialBiddingData = this.f9759a.getInterstitialBiddingData(this.f9761c, new JSONObject());
        if (interstitialBiddingData != null) {
            c3105f5.m8631b(interstitialBiddingData);
        }
        c3391i.m10295a(c3105f5);
        return c3391i;
    }

    /* renamed from: r */
    private void m10193r() {
        this.f9713o = new C3216ib();
        this.f9759a.loadInterstitial(this.f9761c, null, this);
    }

    /* renamed from: s */
    private void m10194s() {
        if (!this.f9716r.m10271a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            m10198a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        C3391i c3391iM10192q = m10192q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + c3391iM10192q.m10326r());
        m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c3391iM10192q.m10326r()}});
        this.f9716r.m10264a(ContextProvider.getInstance().getApplicationContext(), c3391iM10192q, this);
    }

    /* renamed from: t */
    private void m10195t() {
        this.f9765g = null;
        this.f9766h = null;
        this.f9768j = null;
        this.f9715q = new C2995c5();
    }

    /* renamed from: u */
    private void m10196u() {
        this.f9712n = new C3216ib();
        m10241a(new b());
        if (m10255n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            m10187a(EnumC2638ac.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            m10198a(ironSourceErrorBuildLoadFailedError);
        } else if (m10256o()) {
            m10194s();
        } else {
            m10193r();
        }
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10175a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("error " + i + " - " + str);
        this.f9765g = null;
        this.f9766h = null;
        m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m10252k()}});
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            m10198a(new IronSourceError(InterfaceC3374e.a.f9707j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.a
    /* renamed from: b */
    public void mo10200b() {
        IronLog.INTERNAL.verbose("instanceName = " + m10250h() + ", state=" + m10252k());
        m10187a(EnumC2638ac.IS_INSTANCE_SHOW, (Object[][]) null);
        C3382m.a aVar = C3382m.a.LOADED;
        C3382m.a aVar2 = C3382m.a.SHOW_IN_PROGRESS;
        if (m10245a(aVar, aVar2)) {
            this.f9759a.showInterstitial(this.f9761c, this);
        } else {
            onInterstitialAdShowFailed(m10244a(aVar2) ? new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing") : m10244a(C3382m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.a
    /* renamed from: c */
    public void mo10201c() {
        IronLog.INTERNAL.verbose("state=" + m10252k());
        C3382m.a aVar = C3382m.a.NOT_LOADED;
        C3382m.a aVar2 = C3382m.a.LOADED;
        C3382m.a aVar3 = C3382m.a.LOAD_IN_PROGRESS;
        C3382m.a aVarM10238a = m10238a(new C3382m.a[]{aVar, aVar2}, aVar3);
        if (aVarM10238a != aVar && aVarM10238a != aVar2) {
            this.f9714p.onInterstitialAdLoadFailed(m10253l(), new IronSourceError(1050, aVarM10238a == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m10195t();
        m10187a(EnumC2638ac.IS_INSTANCE_LOAD, (Object[][]) null);
        m10196u();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10187a(EnumC2638ac.IS_INSTANCE_CLICKED, new Object[0][]);
        this.f9714p.onInterstitialAdClicked(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        m10246b(C3382m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10187a(EnumC2638ac.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f9718t.mo9344a(this.f9771m))}});
        this.f9719u.mo9346b(this.f9771m);
        this.f9714p.onInterstitialAdClosed(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + m10250h() + " state=" + m10252k());
        m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9713o))}});
        m10198a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10187a(EnumC2638ac.IS_INSTANCE_OPENED, new Object[0][]);
        m10189a(this.f9715q.m8090a(), IronSourceUtils.getCurrentMethodName());
        this.f9714p.onInterstitialAdOpened(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h() + " state=" + m10252k());
        m10257p();
        m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9713o))}});
        if (m10245a(C3382m.a.LOAD_IN_PROGRESS, C3382m.a.LOADED)) {
            m10187a(EnumC2638ac.IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9712n))}});
            m10189a(this.f9715q.m8094c(), IronSourceUtils.getCurrentMethodName());
            this.f9714p.onInterstitialAdReady(m10253l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + m10250h() + " state=" + m10252k());
        m10246b(C3382m.a.NOT_LOADED);
        m10187a(EnumC2638ac.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f9714p.onInterstitialAdShowFailed(m10253l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10187a(EnumC2638ac.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    /* renamed from: a */
    private void m10187a(EnumC2638ac enumC2638ac, Object[][] objArr) {
        Map<String, Object> mapMo10179j = mo10179j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapMo10179j.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e));
            }
        }
        C3805wj.m12898i().mo12605a(new C3899zb(enumC2638ac, new JSONObject(mapMo10179j)));
    }

    /* renamed from: c */
    private void m10190c(InterfaceC3384o interfaceC3384o) {
        IronSourceError ironSourceError;
        this.f9712n = new C3216ib();
        m10241a(new a());
        if (!m10255n()) {
            m10198a(new IronSourceError(InterfaceC3374e.a.f9708k, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            C3368d.a aVar = (C3368d.a) interfaceC3384o.mo10258a(new C3448nb());
            C3353m5 c3353m5Mo10157a = new InterfaceC3370a.a(aVar.m10153h()).mo10157a(m10250h());
            if (c3353m5Mo10157a == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                m10187a(EnumC2638ac.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            } else {
                String strM9994k = c3353m5Mo10157a.m9994k();
                if (strM9994k != null) {
                    m10247b(strM9994k);
                    m10239a(aVar.m10146a());
                    m10242a(aVar.m10151f());
                    m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                    this.f9715q.m8091a(c3353m5Mo10157a.m9985b());
                    this.f9713o = new C3216ib();
                    this.f9759a.loadInterstitialForBidding(this.f9761c, null, strM9994k, this);
                    return;
                }
                IronLog.INTERNAL.error("serverData is null");
                ironSourceError = new IronSourceError(InterfaceC3374e.a.f9706i, "No available ad to load");
            }
            m10198a(ironSourceError);
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "loadInterstitialWithAdm: Exception= ");
            sbOooOOO0.append(e.getMessage());
            m10198a(ErrorBuilder.buildLoadFailedError(sbOooOOO0.toString()));
        }
    }

    @Override // com.ironsource.InterfaceC2631a5
    /* renamed from: a */
    public void mo4777a(C3368d.a aVar, int i, long j, int i2, String str) {
        String strM9994k;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f9765g = aVar.m10146a();
        this.f9766h = aVar.m10151f();
        this.f9717s = aVar.m10145a(m10253l());
        InterfaceC3370a.a aVar2 = new InterfaceC3370a.a(aVar.m10153h());
        if (aVar2.isEmpty()) {
            strM9994k = "";
        } else {
            C3353m5 c3353m5 = aVar2.get(0);
            this.f9715q.m8091a(c3353m5.m9985b());
            this.f9715q.m8095c(c3353m5.m9991h());
            this.f9715q.m8093b(c3353m5.m9990g());
            strM9994k = c3353m5.m9994k();
            m10247b(strM9994k);
        }
        if (!TextUtils.isEmpty(str)) {
            m10187a(EnumC2638ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.mo10159b()}});
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            if (!aVar2.isEmpty()) {
                m10191c(strM9994k);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
            ironLog.error("interstitial - empty waterfall");
            m10198a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.a
    /* renamed from: a */
    public void mo10197a(InterfaceC3384o interfaceC3384o) {
        IronLog.INTERNAL.verbose("state=" + m10252k());
        C3382m.a aVar = C3382m.a.NOT_LOADED;
        C3382m.a aVar2 = C3382m.a.LOADED;
        C3382m.a aVar3 = C3382m.a.LOAD_IN_PROGRESS;
        C3382m.a aVarM10238a = m10238a(new C3382m.a[]{aVar, aVar2}, aVar3);
        if (aVarM10238a != aVar && aVarM10238a != aVar2) {
            m10198a(new IronSourceError(1050, aVarM10238a == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m10195t();
        m10187a(EnumC2638ac.IS_INSTANCE_LOAD, (Object[][]) null);
        m10190c(interfaceC3384o);
    }

    /* renamed from: a */
    public void m10198a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + m10250h() + ", error = " + ironSourceError.getErrorMessage());
        m10257p();
        if (m10245a(C3382m.a.LOAD_IN_PROGRESS, C3382m.a.NOT_LOADED)) {
            m10188a(ironSourceError, C3216ib.m9304a(this.f9712n));
            m10189a(this.f9715q.m8092b(), IronSourceUtils.getCurrentMethodName());
            this.f9714p.onInterstitialAdLoadFailed(m10253l(), ironSourceError);
        }
    }

    /* renamed from: a */
    private void m10188a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1158) {
            m10187a(EnumC2638ac.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            m10187a(EnumC2638ac.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    /* renamed from: a */
    private void m10189a(List<String> list, String str) {
        m10240a(list, m10250h(), m10251i(), this.f9768j, str);
    }

    /* renamed from: c */
    private void m10191c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m10198a(new IronSourceError(InterfaceC3374e.a.f9706i, "No available ad to load"));
            } else {
                m10187a(EnumC2638ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f9759a.loadInterstitialForBidding(this.f9761c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10178a(List<C3353m5> list, String str, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.a
    /* renamed from: a */
    public boolean mo10199a() {
        boolean zIsInterstitialReady = false;
        if (!m10244a(C3382m.a.LOADED)) {
            m10187a(EnumC2638ac.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsInterstitialReady = this.f9759a.isInterstitialReady(this.f9761c);
            m10187a(zIsInterstitialReady ? EnumC2638ac.IS_INSTANCE_READY_TRUE : EnumC2638ac.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsInterstitialReady;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception=" + e.getMessage());
            return zIsInterstitialReady;
        }
    }
}
