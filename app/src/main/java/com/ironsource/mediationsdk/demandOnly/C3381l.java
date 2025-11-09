package com.ironsource.mediationsdk.demandOnly;

import OooO0oO.OooOo;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2629a3;
import com.ironsource.C2995c5;
import com.ironsource.C3053ds;
import com.ironsource.C3105f5;
import com.ironsource.C3216ib;
import com.ironsource.C3353m5;
import com.ironsource.C3448nb;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC2631a5;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.C3391i;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.C3382m;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3370a;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3379j;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3383n;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3385p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.demandOnly.l */
/* loaded from: classes2.dex */
public class C3381l extends C3382m implements InterfaceC3383n.b, RewardedVideoSmashListener, InterfaceC2631a5 {

    /* renamed from: n */
    private C3216ib f9750n;

    /* renamed from: o */
    private C3216ib f9751o;

    /* renamed from: p */
    private ISDemandOnlyRewardedVideoListener f9752p;

    /* renamed from: q */
    private C2995c5 f9753q;

    /* renamed from: r */
    private C3387e f9754r;

    /* renamed from: s */
    private InterfaceC3385p f9755s;

    /* renamed from: t */
    private final InterfaceC3223ii f9756t;

    /* renamed from: u */
    private final InterfaceC3223ii.a f9757u;

    /* renamed from: com.ironsource.mediationsdk.demandOnly.l$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + C3381l.this.m10252k());
            C3381l.this.m10233a(new IronSourceError(1055, "load timed out"));
        }
    }

    public C3381l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, AbstractAdapter abstractAdapter, C3387e c3387e) {
        super(new C2629a3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f9755s = new InterfaceC3385p.b();
        this.f9756t = C3495on.m11199U().mo8689k();
        this.f9757u = C3495on.m11193O().mo8482e();
        this.f9752p = iSDemandOnlyRewardedVideoListener;
        this.f9764f = j;
        this.f9754r = c3387e;
        this.f9759a.initRewardedVideoForDemandOnly(str, str2, this.f9761c, this);
    }

    /* renamed from: c */
    private void m10224c(InterfaceC3384o interfaceC3384o) {
        IronSourceError ironSourceError;
        this.f9750n = new C3216ib();
        m10241a(m10228s());
        if (!m10255n()) {
            m10233a(new IronSourceError(InterfaceC3379j.a.f9746k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            C3368d.a aVar = (C3368d.a) interfaceC3384o.mo10258a(new C3448nb());
            C3353m5 c3353m5Mo10157a = new InterfaceC3370a.a(aVar.m10153h()).mo10157a(m10250h());
            if (c3353m5Mo10157a == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                m10221a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            } else {
                String strM9994k = c3353m5Mo10157a.m9994k();
                if (strM9994k != null) {
                    m10247b(strM9994k);
                    m10239a(aVar.m10146a());
                    m10242a(aVar.m10151f());
                    m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                    this.f9753q.m8091a(c3353m5Mo10157a.m9985b());
                    this.f9751o = new C3216ib();
                    this.f9759a.loadRewardedVideoForBidding(this.f9761c, null, strM9994k, this);
                    return;
                }
                IronLog.INTERNAL.error("serverData is null");
                ironSourceError = new IronSourceError(1062, "No available ad to load");
            }
            m10233a(ironSourceError);
        } catch (Exception e) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "loadRewardedVideoWithAdm: Exception= ");
            sbOooOOO0.append(e.getMessage());
            m10233a(ErrorBuilder.buildLoadFailedError(sbOooOOO0.toString()));
        }
    }

    /* renamed from: q */
    private IronSourceError m10226q() {
        return m10244a(C3382m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : m10244a(C3382m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    /* renamed from: r */
    private C3391i m10227r() {
        String str = m10251i() + m10250h();
        C3391i c3391i = new C3391i(this.f9771m);
        c3391i.m10307b(IronSourceUtils.isEncryptedResponse());
        c3391i.m10304a(true);
        c3391i.m10310c(true);
        c3391i.m10312d(str);
        c3391i.m10309c(m10253l());
        c3391i.m10294a(this.f9756t.mo9344a(this.f9771m));
        C3105f5 c3105f5 = new C3105f5(m10250h(), false);
        c3105f5.m8628a(this.f9755s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f9759a.getRewardedVideoBiddingData(this.f9761c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c3105f5.m8631b(rewardedVideoBiddingData);
        }
        c3391i.m10295a(c3105f5);
        return c3391i;
    }

    /* renamed from: s */
    private TimerTask m10228s() {
        return new a();
    }

    /* renamed from: t */
    private void m10229t() {
        this.f9751o = new C3216ib();
        this.f9759a.loadRewardedVideo(this.f9761c, null, this);
    }

    /* renamed from: u */
    private void m10230u() {
        if (!this.f9754r.m10271a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            m10233a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        C3391i c3391iM10227r = m10227r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + c3391iM10227r.m10326r());
        m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c3391iM10227r.m10326r()}});
        this.f9754r.m10264a(ContextProvider.getInstance().getApplicationContext(), c3391iM10227r, this);
    }

    /* renamed from: v */
    private void m10231v() {
        this.f9765g = null;
        this.f9766h = null;
        this.f9768j = null;
        this.f9753q = new C2995c5();
    }

    /* renamed from: w */
    private void m10232w() {
        this.f9750n = new C3216ib();
        m10241a(m10228s());
        if (m10255n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            m10221a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            m10233a(ironSourceErrorBuildLoadFailedError);
        } else if (m10256o()) {
            m10230u();
        } else {
            m10229t();
        }
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10175a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.f9765g = null;
        this.f9766h = null;
        m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m10252k()}});
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            m10233a(new IronSourceError(InterfaceC3379j.a.f9745j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.b
    /* renamed from: b */
    public void mo10235b(InterfaceC3384o interfaceC3384o) {
        IronLog.INTERNAL.verbose("state=" + m10252k());
        C3382m.a aVar = C3382m.a.NOT_LOADED;
        C3382m.a aVar2 = C3382m.a.LOADED;
        C3382m.a aVar3 = C3382m.a.LOAD_IN_PROGRESS;
        C3382m.a aVarM10238a = m10238a(new C3382m.a[]{aVar, aVar2}, aVar3);
        if (aVarM10238a != aVar && aVarM10238a != aVar2) {
            m10233a(new IronSourceError(1053, aVarM10238a == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m10231v();
        m10221a(EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        m10224c(interfaceC3384o);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.b
    /* renamed from: d */
    public void mo10236d() {
        IronLog.INTERNAL.verbose("state=" + m10252k());
        C3382m.a aVar = C3382m.a.NOT_LOADED;
        C3382m.a aVar2 = C3382m.a.LOADED;
        C3382m.a aVar3 = C3382m.a.LOAD_IN_PROGRESS;
        C3382m.a aVarM10238a = m10238a(new C3382m.a[]{aVar, aVar2}, aVar3);
        if (aVarM10238a != aVar && aVarM10238a != aVar2) {
            this.f9752p.onRewardedVideoAdLoadFailed(m10253l(), new IronSourceError(1053, aVarM10238a == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m10231v();
        m10221a(EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        m10232w();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.b
    /* renamed from: e */
    public void mo10237e() {
        IronLog.INTERNAL.verbose("instanceName = " + m10250h() + ", state=" + m10252k());
        m10221a(EnumC2638ac.RV_INSTANCE_SHOW, (Object[][]) null);
        if (m10245a(C3382m.a.LOADED, C3382m.a.SHOW_IN_PROGRESS)) {
            this.f9759a.showRewardedVideo(this.f9761c, this);
        } else {
            onRewardedVideoAdShowFailed(m10226q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10221a(EnumC2638ac.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.f9752p.onRewardedVideoAdClicked(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        m10246b(C3382m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10221a(EnumC2638ac.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f9756t.mo9344a(this.f9771m))}});
        this.f9757u.mo9346b(this.f9771m);
        this.f9752p.onRewardedVideoAdClosed(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10221a(EnumC2638ac.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        m10223a(this.f9753q.m8090a(), IronSourceUtils.getCurrentMethodName());
        this.f9752p.onRewardedVideoAdOpened(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() throws JSONException {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        Map<String, Object> mapMo10179j = mo10179j();
        if (!TextUtils.isEmpty(C3404p.m10470j().m10552i())) {
            mapMo10179j.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C3404p.m10470j().m10552i());
        }
        if (C3404p.m10470j().m10561p() != null) {
            for (String str : C3404p.m10470j().m10561p().keySet()) {
                mapMo10179j.put(OooOo.OooOO0("custom_", str), C3404p.m10470j().m10561p().get(str));
            }
        }
        Placement placementM7982a = C3404p.m10470j().m10548e().m11635c().m12637f().m7982a();
        if (placementM7982a != null) {
            mapMo10179j.put("placement", placementM7982a.getPlacementName());
            mapMo10179j.put(IronSourceConstants.EVENTS_REWARD_NAME, placementM7982a.getRewardName());
            mapMo10179j.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(placementM7982a.getRewardAmount()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C3899zb c3899zb = new C3899zb(EnumC2638ac.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(mapMo10179j));
        c3899zb.m13321a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(c3899zb.m13324d(), m10250h()));
        C3053ds.m8391i().mo12605a(c3899zb);
        this.f9752p.onRewardedVideoAdRewarded(m10253l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + m10250h() + " state=" + m10252k());
        m10246b(C3382m.a.NOT_LOADED);
        m10221a(EnumC2638ac.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f9752p.onRewardedVideoAdShowFailed(m10253l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h());
        m10221a(EnumC2638ac.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + m10250h() + " state=" + m10252k());
        m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9751o))}});
        m10233a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + m10250h() + " state=" + m10252k());
        m10257p();
        m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9751o))}});
        if (m10245a(C3382m.a.LOAD_IN_PROGRESS, C3382m.a.LOADED)) {
            m10221a(EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f9750n))}});
            m10223a(this.f9753q.m8094c(), IronSourceUtils.getCurrentMethodName());
            this.f9752p.onRewardedVideoAdLoadSuccess(m10253l());
        }
    }

    /* renamed from: a */
    private void m10221a(EnumC2638ac enumC2638ac, Object[][] objArr) {
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
        C3053ds.m8391i().mo12605a(new C3899zb(enumC2638ac, new JSONObject(mapMo10179j)));
    }

    @Override // com.ironsource.InterfaceC2631a5
    /* renamed from: a */
    public void mo4777a(C3368d.a aVar, int i, long j, int i2, String str) {
        String strM9994k;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f9765g = aVar.m10146a();
        this.f9766h = aVar.m10151f();
        this.f9755s = aVar.m10145a(m10253l());
        InterfaceC3370a.a aVar2 = new InterfaceC3370a.a(aVar.m10153h());
        if (aVar2.isEmpty()) {
            strM9994k = "";
        } else {
            C3353m5 c3353m5 = aVar2.get(0);
            this.f9753q.m8091a(c3353m5.m9985b());
            this.f9753q.m8095c(c3353m5.m9991h());
            this.f9753q.m8093b(c3353m5.m9990g());
            strM9994k = c3353m5.m9994k();
            m10247b(strM9994k);
        }
        if (!TextUtils.isEmpty(str)) {
            m10221a(EnumC2638ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.mo10159b()}});
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            if (!aVar2.isEmpty()) {
                m10225c(strM9994k);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
            ironLog.error("rewardedVideo - empty waterfall");
            m10233a(ironSourceError);
        }
    }

    /* renamed from: a */
    public void m10233a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + m10250h() + ", error = " + ironSourceError.getErrorMessage());
        m10257p();
        if (m10245a(C3382m.a.LOAD_IN_PROGRESS, C3382m.a.NOT_LOADED)) {
            m10222a(ironSourceError, C3216ib.m9304a(this.f9750n));
            m10223a(this.f9753q.m8092b(), IronSourceUtils.getCurrentMethodName());
            this.f9752p.onRewardedVideoAdLoadFailed(m10253l(), ironSourceError);
        }
    }

    /* renamed from: a */
    private void m10222a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            m10221a(EnumC2638ac.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            m10221a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    /* renamed from: a */
    private void m10223a(List<String> list, String str) {
        m10240a(list, m10250h(), m10251i(), this.f9768j, str);
    }

    /* renamed from: c */
    private void m10225c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m10244a(C3382m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m10233a(new IronSourceError(1062, "No available ad to load"));
            } else {
                m10221a(EnumC2638ac.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f9759a.loadRewardedVideoForBidding(this.f9761c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10178a(List<C3353m5> list, String str, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3383n.b
    /* renamed from: a */
    public boolean mo10234a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!m10244a(C3382m.a.LOADED)) {
            m10221a(EnumC2638ac.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f9759a.isRewardedVideoAvailable(this.f9761c);
            m10221a(zIsRewardedVideoAvailable ? EnumC2638ac.RV_INSTANCE_READY_TRUE : EnumC2638ac.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsRewardedVideoAvailable;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception=" + e.getMessage());
            return zIsRewardedVideoAvailable;
        }
    }
}
