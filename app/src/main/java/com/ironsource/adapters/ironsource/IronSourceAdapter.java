package com.ironsource.adapters.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2940ak;
import com.ironsource.C2972bh;
import com.ironsource.C2991c1;
import com.ironsource.C3454nh;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3566qo;
import com.ironsource.C3601ro;
import com.ironsource.C3907zj;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.InterfaceC3532pp;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceAdapter extends AbstractAdapter implements ContextProvider.InterfaceC3084a {
    public static final String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "8.10.0";
    public final String ADM_KEY;
    private final String DEMAND_SOURCE_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String LWS_SUPPORT_STATE;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    ConcurrentHashMap<String, ArrayList<C3907zj>> mDemandSourceToBnAd;
    ConcurrentHashMap<String, C3907zj> mDemandSourceToISAd;
    ConcurrentHashMap<String, C3907zj> mDemandSourceToRvAd;
    private final C3601ro mNetworkGlobalDataWriter;
    private final InterfaceC3223ii sessionDepthService;
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static C2991c1 mBaseAdPlayerExtraParams = new C2991c1();

    private IronSourceAdapter(String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = C3566qo.a.f10963b;
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mNetworkGlobalDataWriter = new C3601ro();
        this.sessionDepthService = C3495on.m11199U().mo8689k();
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new ConcurrentHashMap<>();
        setNativeAdAdapter(new IronSourceNativeAdAdapter(this));
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[PHI: r4
  0x005c: PHI (r4v5 int) = (r4v0 int), (r4v3 int) binds: [B:25:0x004d, B:36:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.C2972bh convertBannerSize(android.content.Context r8, com.ironsource.mediationsdk.ISBannerSize r9) {
        /*
            r7 = this;
            java.lang.String r0 = r9.getDescription()
            r0.getClass()
            r1 = 0
            r2 = 90
            r3 = 50
            r4 = 320(0x140, float:4.48E-43)
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -387072689: goto L43;
                case 72205083: goto L38;
                case 79011241: goto L2d;
                case 1951953708: goto L22;
                case 1999208305: goto L17;
                default: goto L16;
            }
        L16:
            goto L4d
        L17:
            java.lang.String r6 = "CUSTOM"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L20
            goto L4d
        L20:
            r5 = 4
            goto L4d
        L22:
            java.lang.String r6 = "BANNER"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L2b
            goto L4d
        L2b:
            r5 = 3
            goto L4d
        L2d:
            java.lang.String r6 = "SMART"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L36
            goto L4d
        L36:
            r5 = 2
            goto L4d
        L38:
            java.lang.String r6 = "LARGE"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L41
            goto L4d
        L41:
            r5 = 1
            goto L4d
        L43:
            java.lang.String r6 = "RECTANGLE"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            r5 = 0
        L4d:
            switch(r5) {
                case 0: goto L69;
                case 1: goto L6d;
                case 2: goto L5e;
                case 3: goto L5c;
                case 4: goto L51;
                default: goto L50;
            }
        L50:
            return r1
        L51:
            int r9 = r9.getHeight()
            if (r9 == r3) goto L5a
            if (r9 == r2) goto L5a
            return r1
        L5a:
            r2 = r9
            goto L6d
        L5c:
            r2 = r3
            goto L6d
        L5e:
            boolean r9 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r8)
            if (r9 == 0) goto L66
            r4 = 728(0x2d8, float:1.02E-42)
        L66:
            if (r9 == 0) goto L5c
            goto L6d
        L69:
            r4 = 300(0x12c, float:4.2E-43)
            r2 = 250(0xfa, float:3.5E-43)
        L6d:
            int r9 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r8, r4)
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r8, r2)
            com.ironsource.bh r1 = new com.ironsource.bh
            r1.<init>(r9, r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.ironsource.IronSourceAdapter.convertBannerSize(android.content.Context, com.ironsource.mediationsdk.ISBannerSize):com.ironsource.bh");
    }

    private C3907zj createBannerAdInstance(String str, C2972bh c2972bh, JSONObject jSONObject, LoadAdData loadAdData, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        return new C2940ak(str, new IronSourceBannerListener(this, bannerSmashListener, str)).m7813a(mBaseAdPlayerExtraParams.get()).m7814a(jSONObject.optInt("instanceType", 2) == 2).m7820c(jSONObject.optBoolean("isOneFlow")).m7811a(c2972bh).m7817b(loadAdData.isMultipleAdObjectsFlow()).m7816b(loadAdData.adUnitId()).m7815a();
    }

    private C3907zj createInterstitialAdInstance(String str, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isBidder=" + z);
        return new C2940ak(str, new IronSourceInterstitialListener(interstitialSmashListener, str)).m7813a(mBaseAdPlayerExtraParams.get()).m7820c(zOptBoolean).m7814a(z).m7817b(loadAdData.isMultipleAdObjectsFlow()).m7816b(loadAdData.adUnitId()).m7815a();
    }

    private C3907zj createRewardedVideoAdInstance(String str, boolean z, JSONObject jSONObject, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z2 = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnly=" + z + " isBidder=" + z2);
        return new C2940ak(str, new IronSourceRewardedVideoListener(rewardedVideoSmashListener, str, z)).m7813a(mBaseAdPlayerExtraParams.get()).m7819c().m7820c(zOptBoolean).m7817b(loadAdData.isMultipleAdObjectsFlow()).m7814a(z2).m7816b(loadAdData.adUnitId()).m7815a();
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("IronSource", "8.10.0");
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject) {
        initSDK(str, jSONObject);
    }

    private boolean isMultipleAdObjectsFlow(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("isMultipleAdUnits", false);
    }

    private void loadBannerInternal(Activity activity, ISBannerSize iSBannerSize, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str, LoadAdData loadAdData) {
        BannerSmashListener bannerSmashListener2;
        Exception exc;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            C2972bh c2972bhConvertBannerSize = convertBannerSize(ContextProvider.getInstance().getApplicationContext(), iSBannerSize);
            if (c2972bhConvertBannerSize == null) {
                try {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                    return;
                } catch (Exception e) {
                    exc = e;
                    bannerSmashListener2 = bannerSmashListener;
                    StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(exc, "Banner Load Fail, ");
                    sbOooOOO0.append(getProviderName());
                    sbOooOOO0.append(" - ");
                    sbOooOOO0.append(exc.getMessage());
                    bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(sbOooOOO0.toString()));
                }
            }
            bannerSmashListener2 = bannerSmashListener;
            try {
                IronSourceNetwork.loadAdView(activity, createBannerAdInstance(demandSourceName, c2972bhConvertBannerSize, jSONObject, loadAdData, bannerSmashListener2), new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str)).value());
            } catch (Exception e2) {
                e = e2;
                exc = e;
                StringBuilder sbOooOOO02 = AbstractC2183w4.OooOOO0(exc, "Banner Load Fail, ");
                sbOooOOO02.append(getProviderName());
                sbOooOOO02.append(" - ");
                sbOooOOO02.append(exc.getMessage());
                bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(sbOooOOO02.toString()));
            }
        } catch (Exception e3) {
            e = e3;
            bannerSmashListener2 = bannerSmashListener;
        }
    }

    private void loadInterstitialAdInternal(String str, String str2, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        C3907zj c3907zjCreateInterstitialAdInstance = this.mDemandSourceToISAd.get(str);
        if (c3907zjCreateInterstitialAdInstance == null) {
            c3907zjCreateInterstitialAdInstance = createInterstitialAdInstance(str, jSONObject, loadAdData, interstitialSmashListener);
            this.mDemandSourceToISAd.put(str, c3907zjCreateInterstitialAdInstance);
        }
        IronSourceNetwork.loadAd(c3907zjCreateInterstitialAdInstance, withLog.value());
    }

    private void loadRewardedVideoAdInternal(JSONObject jSONObject, String str, String str2, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        C3907zj c3907zjCreateRewardedVideoAdInstance = this.mDemandSourceToRvAd.get(str);
        if (c3907zjCreateRewardedVideoAdInstance == null) {
            c3907zjCreateRewardedVideoAdInstance = createRewardedVideoAdInstance(str, withLog.demandOnly(), jSONObject, loadAdData, rewardedVideoSmashListener);
            this.mDemandSourceToRvAd.put(str, c3907zjCreateRewardedVideoAdInstance);
        }
        IronSourceNetwork.loadAd(c3907zjCreateRewardedVideoAdInstance, withLog.value());
    }

    private void showAdInternal(C3907zj c3907zj, IronSource.AD_UNIT ad_unit) throws Exception {
        int iMo9344a = this.sessionDepthService.mo9344a(ad_unit);
        HashMap map = new HashMap();
        map.put("sessionDepth", String.valueOf(iMo9344a));
        IronLog.ADAPTER_API.verbose("demandSourceName=" + c3907zj.m13397g() + " showParams=" + map);
        IronSourceNetwork.showAd(ContextProvider.getInstance().getCurrentActiveActivity(), c3907zj, map);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        ArrayList<C3907zj> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    C3907zj c3907zj = arrayList.get(i);
                    i++;
                    IronSourceNetwork.destroyAd(c3907zj);
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e.getMessage());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (C3404p.m10470j().m10554k() == null) {
            IronLog.ADAPTER_API.error("Appkey is null for early init");
            return;
        }
        IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
        initSDK(C3404p.m10470j().m10554k(), jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    public HashMap<String, String> getInitParams() {
        HashMap<String, String> map = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            map.put(C3566qo.a.f10963b, pluginType);
        }
        if (!TextUtils.isEmpty(C3404p.m10470j().m10564r())) {
            map.put("sessionid", C3404p.m10470j().m10564r());
        }
        return map;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? this.mLWSSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "8.10.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String mediationUserId = IronSourceUtils.getMediationUserId();
            int iOptInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                iOptInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + iOptInt);
            SDKUtils.setDebugMode(iOptInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to " + jSONObject.optString("controllerUrl"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("controllerConfig");
            String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
            SDKUtils.setControllerConfig(string);
            ironLog.verbose("IronSourceNetwork setting controller config to " + string);
            HashMap<String, String> initParams = getInitParams();
            mBaseAdPlayerExtraParams.mo8069a(initParams);
            String strM10554k = C3404p.m10470j().m10554k();
            StringBuilder sbOooOOo0 = OooO00o.OooOOo0("with appKey=", strM10554k, " userId=", mediationUserId, " parameters ");
            sbOooOOo0.append(initParams);
            ironLog.verbose(sbOooOOo0.toString());
            IronSourceNetwork.addInitListener(new InterfaceC3532pp() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.ironsource.InterfaceC3532pp
                public void onFail(C3454nh c3454nh) {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener fail - code:" + c3454nh.m10991a() + " message:" + c3454nh.m10992b());
                }

                @Override // com.ironsource.InterfaceC3532pp
                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), strM10554k, mediationUserId, initParams);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        C3907zj c3907zj = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return c3907zj != null && IronSourceNetwork.isAdAvailableForInstance(c3907zj);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        C3907zj c3907zj = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return c3907zj != null && IronSourceNetwork.isAdAvailableForInstance(c3907zj);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        if (ironSourceBannerLayout != null) {
            loadBannerInternal(ContextProvider.getInstance().getCurrentActiveActivity(), ironSourceBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new LoadAdData(jSONObject2));
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getActivity(), iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new LoadAdData());
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
            try {
                loadInterstitialAdInternal(demandSourceName, null, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C3551q9.m11517d().m11519a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
            }
        } catch (Exception e2) {
            e = e2;
            interstitialSmashListener2 = interstitialSmashListener;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
            try {
                loadInterstitialAdInternal(demandSourceName, str, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C3551q9.m11517d().m11519a(exc);
                IronLog.ADAPTER_API.error("for bidding exception " + exc.getMessage());
                interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
            }
        } catch (Exception e2) {
            e = e2;
            interstitialSmashListener2 = interstitialSmashListener;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
            try {
                loadRewardedVideoAdInternal(jSONObject, demandSourceName, null, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C3551q9.m11517d().m11519a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
            }
        } catch (Exception e2) {
            e = e2;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
            try {
                loadRewardedVideoAdInternal(jSONObject, demandSourceName, str, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C3551q9.m11517d().m11519a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
            }
        } catch (Exception e2) {
            e = e2;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
    }

    @Override // com.ironsource.environment.ContextProvider.InterfaceC3084a
    public void onPause(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    @Override // com.ironsource.environment.ContextProvider.InterfaceC3084a
    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z) {
        AbstractC2183w4.OooOOo(new StringBuilder("("), z ? C3401a.f9920g : "false", ")", IronLog.ADAPTER_API);
        this.mNetworkGlobalDataWriter.m11750a(z);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        mBaseAdPlayerExtraParams.mo8070b(str, list.get(0));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            showAdInternal(this.mDemandSourceToISAd.get(demandSourceName), IronSource.AD_UNIT.INTERSTITIAL);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), IronSource.AD_UNIT.REWARDED_VIDEO);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e.getMessage()));
        }
    }
}
