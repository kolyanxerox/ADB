package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2629a3;
import com.ironsource.C3053ds;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3702tk;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC2634a8;
import com.ironsource.InterfaceC3156gl;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r */
/* loaded from: classes2.dex */
public class C3406r extends AbstractC3415y implements RewardedVideoSmashListener, InterfaceC2634a8 {

    /* renamed from: h */
    private b f10087h;

    /* renamed from: i */
    private InterfaceC3156gl f10088i;

    /* renamed from: j */
    private Timer f10089j;

    /* renamed from: k */
    private int f10090k;

    /* renamed from: l */
    private String f10091l;

    /* renamed from: m */
    private String f10092m;

    /* renamed from: n */
    private Placement f10093n;

    /* renamed from: o */
    private long f10094o;

    /* renamed from: p */
    private String f10095p;

    /* renamed from: q */
    private JSONObject f10096q;

    /* renamed from: r */
    private int f10097r;

    /* renamed from: s */
    private String f10098s;

    /* renamed from: t */
    private final Object f10099t;

    /* renamed from: u */
    private final Object f10100u;

    /* renamed from: v */
    private long f10101v;

    /* renamed from: w */
    private final InterfaceC3223ii.a f10102w;

    /* renamed from: com.ironsource.mediationsdk.r$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i;
            boolean z;
            b bVar = C3406r.this.f10087h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || C3406r.this.f10087h == b.INIT_IN_PROGRESS) {
                if (C3406r.this.f10087h == bVar2) {
                    i = 1025;
                } else {
                    str = "Rewarded Video - init instance time out";
                    i = 1032;
                }
                C3406r.this.m10613a(b.NOT_LOADED);
                z = true;
            } else {
                z = false;
                i = 510;
            }
            C3406r.this.m10795a(str);
            if (!z) {
                C3406r.this.m10624a(EnumC2638ac.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3406r.this.m10620v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C3406r.this.f10087h.name()}});
                return;
            }
            C3406r.this.m10624a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3406r.this.m10620v())}});
            C3406r.this.m10624a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3406r.this.m10620v())}});
            C3406r.this.f10088i.mo8989c(C3406r.this);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.r$b */
    public enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public C3406r(C3406r c3406r, InterfaceC3156gl interfaceC3156gl, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2) {
        this(c3406r.f10091l, c3406r.f10092m, c3406r.f10257b.m4773h(), interfaceC3156gl, c3406r.f10090k, abstractAdapter, i);
        this.f10095p = str;
        this.f10096q = jSONObject;
        this.f10097r = i2;
        this.f10098s = str2;
    }

    /* renamed from: C */
    private void m10608C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f10256a.setPluginData(pluginType);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("setCustomParams() ", th);
            sbOooOOO.append(th.getMessage());
            m10795a(sbOooOOO.toString());
        }
    }

    /* renamed from: D */
    private void m10609D() {
        synchronized (this.f10100u) {
            Timer timer = new Timer();
            this.f10089j = timer;
            timer.schedule(new a(), this.f10090k * 1000);
        }
    }

    /* renamed from: E */
    private void m10610E() {
        synchronized (this.f10100u) {
            try {
                Timer timer = this.f10089j;
                if (timer != null) {
                    timer.cancel();
                    this.f10089j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    private void m10619t() {
        m10795a("isBidder = " + m10808p() + ", shouldEarlyInit = " + m10810s());
        m10613a(b.INIT_IN_PROGRESS);
        m10608C();
        try {
            this.f10256a.initRewardedVideoWithCallback(this.f10091l, this.f10092m, this.f10259d, this);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("initForBidding exception: ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            m10797b(sbOooOOO.toString());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public long m10620v() {
        return new Date().getTime() - this.f10094o;
    }

    /* renamed from: A */
    public boolean m10621A() {
        if (this.f10087h != b.LOADED) {
            return false;
        }
        try {
            return this.f10256a.isRewardedVideoAvailable(this.f10259d);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("isReadyToShow exception: ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            m10797b(sbOooOOO.toString());
            m10624a(EnumC2638ac.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: B */
    public void m10622B() {
        m10623a(EnumC2638ac.RV_CAP_SESSION);
    }

    @Override // com.ironsource.InterfaceC2634a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        m10623a(EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN);
        try {
            this.f10256a.collectRewardedVideoBiddingData(this.f10259d, adData != null ? C3702tk.m12447a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("collectBiddingData exception: ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            m10797b(sbOooOOO.toString());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3415y
    /* renamed from: d */
    public IronSource.AD_UNIT mo10629d() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.AbstractC3415y
    /* renamed from: k */
    public String mo10630k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.AbstractC3415y
    /* renamed from: l */
    public int mo10631l() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        m10795a("onRewardedVideoAdClicked");
        this.f10088i.mo8988b(this, this.f10093n);
        m10616b(EnumC2638ac.RV_BUSINESS_INSTANCE_CLICKED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        m10795a("onRewardedVideoAdClosed");
        synchronized (this.f10099t) {
            try {
                if (this.f10087h == b.SHOW_IN_PROGRESS) {
                    m10613a(b.ENDED);
                    this.f10101v = new Date().getTime();
                    this.f10088i.mo8987b(this);
                } else {
                    m10616b(EnumC2638ac.RV_INSTANCE_CLOSED);
                    m10624a(EnumC2638ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f10087h}});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        m10795a("onRewardedVideoAdEnded");
        this.f10088i.mo8992f(this);
        m10616b(EnumC2638ac.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        m10795a("onRewardedVideoAdOpened");
        this.f10088i.mo8990d(this);
        m10616b(EnumC2638ac.RV_BUSINESS_INSTANCE_OPENED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() throws JSONException {
        m10795a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f10088i.mo8986a(this, this.f10093n);
        Map<String, Object> mapM10805m = m10805m();
        Placement placement = this.f10093n;
        if (placement != null) {
            mapM10805m.put("placement", placement.getPlacementName());
            mapM10805m.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f10093n.getRewardName());
            mapM10805m.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f10093n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C3404p.m10470j().m10552i())) {
            mapM10805m.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C3404p.m10470j().m10552i());
        }
        if (C3404p.m10470j().m10561p() != null) {
            for (String str : C3404p.m10470j().m10561p().keySet()) {
                mapM10805m.put(OooOo.OooOO0("custom_", str), C3404p.m10470j().m10561p().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f10095p)) {
            mapM10805m.put("auctionId", this.f10095p);
        }
        JSONObject jSONObject = this.f10096q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM10805m.put("genericParams", this.f10096q);
        }
        EnumC2638ac enumC2638ac = EnumC2638ac.RV_BUSINESS_INSTANCE_REWARDED;
        if (m10618c(enumC2638ac)) {
            C3053ds.m8391i().m12611a(mapM10805m, this.f10097r, this.f10098s);
        }
        mapM10805m.put("sessionDepth", Integer.valueOf(this.f10261f));
        C3899zb c3899zb = new C3899zb(enumC2638ac, new JSONObject(mapM10805m));
        c3899zb.m13321a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(c3899zb.m13324d(), mo9129c()));
        long j = this.f10101v;
        if (j != 0) {
            long j2 = time - j;
            m10795a("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            c3899zb.m13321a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        C3053ds.m8391i().mo12605a(c3899zb);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m10795a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        m10627b(EnumC2638ac.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f10099t) {
            try {
                if (this.f10087h == b.SHOW_IN_PROGRESS) {
                    m10613a(b.ENDED);
                    this.f10088i.mo8984a(ironSourceError, this);
                    return;
                }
                m10624a(EnumC2638ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f10087h}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        m10795a("onRewardedVideoAdStarted");
        this.f10088i.mo8985a(this);
        m10616b(EnumC2638ac.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        m10795a("onRewardedVideoAdVisible");
        m10616b(EnumC2638ac.RV_INSTANCE_VISIBLE);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m10795a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f10087h.name());
        synchronized (this.f10099t) {
            try {
                if (this.f10087h == b.LOAD_IN_PROGRESS) {
                    m10613a(z ? b.LOADED : b.NOT_LOADED);
                    z2 = false;
                } else {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            if (z) {
                m10624a(EnumC2638ac.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f10087h.name()}});
                return;
            } else {
                m10624a(EnumC2638ac.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m10620v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f10087h.name()}});
                return;
            }
        }
        m10610E();
        m10624a(z ? EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS : EnumC2638ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m10620v())}});
        if (z) {
            this.f10088i.mo8991e(this);
        } else {
            this.f10088i.mo8989c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m10795a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m10610E();
        m10624a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m10620v())}});
        m10624a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m10620v())}});
        synchronized (this.f10099t) {
            try {
                if (this.f10087h == b.INIT_IN_PROGRESS) {
                    m10613a(b.NO_INIT);
                    this.f10088i.mo8989c(this);
                    return;
                }
                m10624a(EnumC2638ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f10087h}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        m10795a("onRewardedVideoInitSuccess");
        synchronized (this.f10099t) {
            try {
                if (this.f10087h != b.INIT_IN_PROGRESS) {
                    m10624a(EnumC2638ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f10087h}});
                } else {
                    m10613a(b.NOT_LOADED);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m10624a(EnumC2638ac.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m10620v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f10262g = Long.valueOf(System.currentTimeMillis());
        }
        m10624a(EnumC2638ac.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m10620v())}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    /* renamed from: u */
    public String m10632u() {
        return this.f10095p;
    }

    /* renamed from: w */
    public LoadWhileShowSupportState m10633w() {
        try {
            return this.f10256a.getLoadWhileShowSupportState(this.f10259d);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("Exception while calling adapter.getLoadWhileShowSupportState() - ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            m10797b(sbOooOOO.toString());
            return LoadWhileShowSupportState.NONE;
        }
    }

    /* renamed from: x */
    public Placement m10634x() {
        return this.f10093n;
    }

    /* renamed from: y */
    public boolean m10635y() {
        return this.f10087h == b.LOADED;
    }

    /* renamed from: z */
    public boolean m10636z() {
        b bVar = this.f10087h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    public C3406r(String str, String str2, NetworkSettings networkSettings, InterfaceC3156gl interfaceC3156gl, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new C2629a3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f10099t = new Object();
        this.f10100u = new Object();
        this.f10102w = C3495on.m11193O().mo8482e();
        this.f10091l = str;
        this.f10092m = str2;
        this.f10088i = interfaceC3156gl;
        this.f10089j = null;
        this.f10090k = i;
        this.f10261f = i2;
        this.f10087h = b.NO_INIT;
        this.f10101v = 0L;
        if (m10809r()) {
            m10619t();
        }
    }

    /* renamed from: b */
    private void m10616b(EnumC2638ac enumC2638ac) {
        m10627b(enumC2638ac, null);
    }

    /* renamed from: c */
    private boolean m10618c(EnumC2638ac enumC2638ac) {
        return enumC2638ac == EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD || enumC2638ac == EnumC2638ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS || enumC2638ac == EnumC2638ac.RV_INSTANCE_LOAD_FAILED || enumC2638ac == EnumC2638ac.RV_INSTANCE_LOAD_FAILED_REASON || enumC2638ac == EnumC2638ac.RV_INSTANCE_LOAD_NO_FILL || enumC2638ac == EnumC2638ac.RV_BUSINESS_INSTANCE_OPENED || enumC2638ac == EnumC2638ac.RV_INSTANCE_CLOSED || enumC2638ac == EnumC2638ac.RV_INSTANCE_SHOW || enumC2638ac == EnumC2638ac.RV_INSTANCE_SHOW_FAILED || enumC2638ac == EnumC2638ac.RV_BUSINESS_INSTANCE_CLICKED || enumC2638ac == EnumC2638ac.RV_BUSINESS_INSTANCE_REWARDED;
    }

    /* renamed from: a */
    public void m10623a(EnumC2638ac enumC2638ac) {
        m10612a(enumC2638ac, null, false);
    }

    /* renamed from: a */
    public void m10624a(EnumC2638ac enumC2638ac, Object[][] objArr) {
        m10612a(enumC2638ac, objArr, false);
    }

    /* renamed from: b */
    public void m10627b(EnumC2638ac enumC2638ac, Object[][] objArr) {
        m10612a(enumC2638ac, objArr, true);
    }

    /* renamed from: a */
    private void m10612a(EnumC2638ac enumC2638ac, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> mapM10805m = m10805m();
        if (!TextUtils.isEmpty(this.f10095p)) {
            mapM10805m.put("auctionId", this.f10095p);
        }
        JSONObject jSONObject = this.f10096q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM10805m.put("genericParams", this.f10096q);
        }
        if (z && (placement = this.f10093n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            mapM10805m.put("placement", this.f10093n.getPlacementName());
        }
        if (m10618c(enumC2638ac)) {
            C3053ds.m8391i().m12611a(mapM10805m, this.f10097r, this.f10098s);
        }
        mapM10805m.put("sessionDepth", Integer.valueOf(this.f10261f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM10805m.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo9129c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C3053ds.m8391i().mo12605a(new C3899zb(enumC2638ac, new JSONObject(mapM10805m)));
        if (enumC2638ac == EnumC2638ac.RV_INSTANCE_CLOSED) {
            this.f10102w.mo9346b(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    /* renamed from: b */
    public void m10628b(boolean z) {
        m10627b(EnumC2638ac.RV_INSTANCE_SHOW_CHANCE, new Object[][]{new Object[]{"status", z ? C3401a.f9920g : "false"}});
    }

    /* renamed from: a */
    public void m10625a(Placement placement) {
        m10610E();
        m10795a("showVideo()");
        this.f10093n = placement;
        m10613a(b.SHOW_IN_PROGRESS);
        m10616b(EnumC2638ac.RV_INSTANCE_SHOW);
        try {
            this.f10256a.showRewardedVideo(this.f10259d, this);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("showVideo exception: ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            m10797b(sbOooOOO.toString());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10613a(b bVar) {
        m10795a("current state=" + this.f10087h + ", new state=" + bVar);
        synchronized (this.f10099t) {
            this.f10087h = bVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:46:0x00fb
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: a */
    public void m10626a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3406r.m10626a(java.lang.String, org.json.JSONObject):void");
    }
}
