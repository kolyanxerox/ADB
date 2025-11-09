package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3725u8;
import com.ironsource.InterfaceC3255jg;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.C3365a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.qt */
/* loaded from: classes2.dex */
public class C3571qt {

    /* renamed from: A */
    protected static final boolean f10980A = false;

    /* renamed from: A0 */
    protected static final String f10981A0 = "waitUntilAllProvidersFinishInit";

    /* renamed from: A1 */
    protected static final String f10982A1 = "providerNetworkKey";

    /* renamed from: B */
    protected static final int f10983B = 60;

    /* renamed from: B0 */
    protected static final String f10984B0 = "sharedManagersThread";

    /* renamed from: B1 */
    protected static final String f10985B1 = "spId";

    /* renamed from: C */
    protected static final int f10986C = 10000;

    /* renamed from: C0 */
    protected static final String f10987C0 = "parallelLoad";

    /* renamed from: C1 */
    protected static final String f10988C1 = "mpis";

    /* renamed from: D */
    protected static final int f10989D = 10000;

    /* renamed from: D0 */
    protected static final String f10990D0 = "bidderExclusive";

    /* renamed from: D1 */
    protected static final String f10991D1 = "auction";

    /* renamed from: E */
    protected static final int f10992E = -1;

    /* renamed from: E0 */
    protected static final String f10993E0 = "adapterTimeOutInSeconds";

    /* renamed from: E1 */
    protected static final String f10994E1 = "auctionData";

    /* renamed from: F */
    protected static final int f10995F = 5000;

    /* renamed from: F0 */
    protected static final String f10996F0 = "atim";

    /* renamed from: F1 */
    protected static final String f10997F1 = "auctioneerURL";

    /* renamed from: G */
    protected static final int f10998G = 3;

    /* renamed from: G0 */
    protected static final String f10999G0 = "bannerInterval";

    /* renamed from: G1 */
    protected static final String f11000G1 = "extAuctioneerURL";

    /* renamed from: H */
    protected static final int f11001H = 3;

    /* renamed from: H0 */
    protected static final String f11002H0 = "isOneFlow";

    /* renamed from: H1 */
    protected static final String f11003H1 = "objectPerWaterfall";

    /* renamed from: I */
    protected static final int f11004I = 3;

    /* renamed from: I0 */
    protected static final String f11005I0 = "expiredDurationInMinutes";

    /* renamed from: I1 */
    protected static final String f11006I1 = "minTimeBeforeFirstAuction";

    /* renamed from: J */
    protected static final int f11007J = 0;

    /* renamed from: J0 */
    protected static final String f11008J0 = "server";

    /* renamed from: J1 */
    protected static final String f11009J1 = "timeToWaitBeforeAuction";

    /* renamed from: K */
    protected static final int f11010K = 2;

    /* renamed from: K0 */
    protected static final String f11011K0 = "publisher";

    /* renamed from: K1 */
    protected static final String f11012K1 = "timeToWaitBeforeLoad";

    /* renamed from: L */
    protected static final int f11013L = 15;

    /* renamed from: L0 */
    protected static final String f11014L0 = "console";

    /* renamed from: L1 */
    protected static final String f11015L1 = "auctionRetryInterval";

    /* renamed from: M */
    protected static final long f11016M = 10000;

    /* renamed from: M0 */
    protected static final String f11017M0 = "sendUltraEvents";

    /* renamed from: M1 */
    protected static final String f11018M1 = "isLoadWhileShow";

    /* renamed from: N */
    protected static final long f11019N = 3000;

    /* renamed from: N0 */
    protected static final String f11020N0 = "sendEventsToggle";

    /* renamed from: N1 */
    protected static final String f11021N1 = "auctionTrials";

    /* renamed from: O */
    protected static final boolean f11022O = false;

    /* renamed from: O0 */
    protected static final String f11023O0 = "eventsCompression";

    /* renamed from: O1 */
    protected static final String f11024O1 = "auctionTimeout";

    /* renamed from: P */
    protected static final boolean f11025P = false;

    /* renamed from: P0 */
    protected static final String f11026P0 = "eventsCompressionLevel";

    /* renamed from: P1 */
    protected static final String f11027P1 = "auctionSavedHistory";

    /* renamed from: Q */
    protected static final int f11028Q = 30000;

    /* renamed from: Q0 */
    protected static final String f11029Q0 = "serverEventsURL";

    /* renamed from: Q1 */
    protected static final String f11030Q1 = "disableLoadWhileShowSupportFor";

    /* renamed from: R */
    protected static final int f11031R = -1;

    /* renamed from: R0 */
    protected static final String f11032R0 = "serverEventsType";

    /* renamed from: R1 */
    protected static final String f11033R1 = "tokenPerAdapter";

    /* renamed from: S */
    protected static final int f11034S = 5000;

    /* renamed from: S0 */
    protected static final String f11035S0 = "backupThreshold";

    /* renamed from: S1 */
    protected static final String f11036S1 = "enableAuctionFallback";

    /* renamed from: T */
    protected static final int f11037T = 1;

    /* renamed from: T0 */
    protected static final String f11038T0 = "maxNumberOfEvents";

    /* renamed from: T1 */
    protected static final String f11039T1 = "timeToDeleteOldWaterfallAfterAuction";

    /* renamed from: U */
    protected static final boolean f11040U = false;

    /* renamed from: U0 */
    protected static final String f11041U0 = "maxEventsPerBatch";

    /* renamed from: U1 */
    protected static final String f11042U1 = "compressAuctionRequest";

    /* renamed from: V */
    protected static final int f11043V = 15000;

    /* renamed from: V0 */
    protected static final String f11044V0 = "optOut";

    /* renamed from: V1 */
    protected static final String f11045V1 = "compressAuctionResponse";

    /* renamed from: W */
    protected static final int f11046W = 15000;

    /* renamed from: W0 */
    protected static final String f11047W0 = "optIn";

    /* renamed from: W1 */
    protected static final String f11048W1 = "encryptionVersion";

    /* renamed from: X */
    protected static final String f11049X = "providerOrder";

    /* renamed from: X0 */
    protected static final String f11050X0 = "triggerEvents";

    /* renamed from: X1 */
    protected static final String f11051X1 = "shouldSendBannerBURLFromImpression";

    /* renamed from: Y */
    protected static final String f11052Y = "providerSettings";

    /* renamed from: Y0 */
    protected static final String f11053Y0 = "nonConnectivityEvents";

    /* renamed from: Y1 */
    protected static final String f11054Y1 = "impressionTimeout";

    /* renamed from: Z */
    protected static final String f11055Z = "configurations";

    /* renamed from: Z0 */
    protected static final String f11056Z0 = "shouldSendPublisherLogsOnUIThread";

    /* renamed from: Z1 */
    protected static final String f11057Z1 = "optInKeys";

    /* renamed from: a0 */
    protected static final String f11058a0 = "genericParams";

    /* renamed from: a1 */
    protected static final String f11059a1 = "pixel";

    /* renamed from: a2 */
    protected static final String f11060a2 = "tokenGenericParams";

    /* renamed from: b0 */
    protected static final String f11061b0 = "adUnits";

    /* renamed from: b1 */
    protected static final String f11062b1 = "pixelEventsUrl";

    /* renamed from: b2 */
    protected static final String f11063b2 = "compressToken";

    /* renamed from: c0 */
    protected static final String f11064c0 = "providerLoadName";

    /* renamed from: c1 */
    protected static final String f11065c1 = "pixelEventsEnabled";

    /* renamed from: c2 */
    protected static final String f11066c2 = "compressExternalToken";

    /* renamed from: d0 */
    protected static final String f11067d0 = "application";

    /* renamed from: d1 */
    protected static final String f11068d1 = "placements";

    /* renamed from: d2 */
    protected static final String f11069d2 = "instanceType";

    /* renamed from: e0 */
    protected static final String f11070e0 = "rewardedVideo";

    /* renamed from: e1 */
    protected static final String f11071e1 = "placementId";

    /* renamed from: e2 */
    protected static final String f11072e2 = "maxAdsPerSession";

    /* renamed from: f0 */
    protected static final String f11073f0 = "interstitial";

    /* renamed from: f1 */
    protected static final String f11074f1 = "placementName";

    /* renamed from: f2 */
    protected static final String f11075f2 = "reward";

    /* renamed from: g0 */
    protected static final String f11076g0 = "banner";

    /* renamed from: g1 */
    protected static final String f11077g1 = "delivery";

    /* renamed from: g2 */
    protected static final String f11078g2 = "name";

    /* renamed from: h0 */
    protected static final String f11079h0 = "nativeAd";

    /* renamed from: h1 */
    protected static final String f11080h1 = "isDefault";

    /* renamed from: h2 */
    protected static final String f11081h2 = "amount";

    /* renamed from: i0 */
    protected static final String f11082i0 = "integration";

    /* renamed from: i1 */
    protected static final String f11083i1 = "capping";

    /* renamed from: i2 */
    protected static final String f11084i2 = "bannerRefreshRate";

    /* renamed from: j0 */
    protected static final String f11085j0 = "loggers";

    /* renamed from: j1 */
    protected static final String f11086j1 = "pacing";

    /* renamed from: j2 */
    protected static final String f11087j2 = "protocolVersion";

    /* renamed from: k0 */
    protected static final String f11088k0 = "segment";

    /* renamed from: k1 */
    protected static final String f11089k1 = "enabled";

    /* renamed from: k2 */
    protected static final String f11090k2 = "adFormats";

    /* renamed from: l */
    public static final String f11091l = "appKey";

    /* renamed from: l0 */
    protected static final String f11092l0 = "events";

    /* renamed from: l1 */
    protected static final String f11093l1 = "maxImpressions";

    /* renamed from: l2 */
    protected static final String f11094l2 = "adUnits";

    /* renamed from: m */
    public static final String f11095m = "userId";

    /* renamed from: m0 */
    protected static final String f11096m0 = "crashReporter";

    /* renamed from: m1 */
    protected static final String f11097m1 = "numOfSeconds";

    /* renamed from: m2 */
    protected static final String f11098m2 = "rewarded";

    /* renamed from: n */
    public static final String f11099n = "response";

    /* renamed from: n0 */
    protected static final String f11100n0 = "token";

    /* renamed from: n1 */
    protected static final String f11101n1 = "unit";

    /* renamed from: o */
    protected static final String f11102o = "error";

    /* renamed from: o0 */
    protected static final String f11103o0 = "external";

    /* renamed from: o1 */
    protected static final String f11104o1 = "virtualItemName";

    /* renamed from: p */
    protected static final int f11105p = 3;

    /* renamed from: p0 */
    protected static final String f11106p0 = "mediationTypes";

    /* renamed from: p1 */
    protected static final String f11107p1 = "virtualItemCount";

    /* renamed from: q */
    protected static final boolean f11108q = false;

    /* renamed from: q0 */
    protected static final String f11109q0 = "providerDefaultInstance";

    /* renamed from: q1 */
    protected static final String f11110q1 = "uuidEnabled";

    /* renamed from: r */
    protected static final boolean f11111r = true;

    /* renamed from: r0 */
    protected static final String f11112r0 = "testSuite";

    /* renamed from: r1 */
    protected static final String f11113r1 = "abt";

    /* renamed from: s */
    protected static final boolean f11114s = true;

    /* renamed from: s0 */
    protected static final String f11115s0 = "controllerUrl";

    /* renamed from: s1 */
    protected static final String f11116s1 = "delayLoadFailure";

    /* renamed from: t */
    protected static final int f11117t = 2;

    /* renamed from: t0 */
    protected static final String f11118t0 = "AdQuality";

    /* renamed from: t1 */
    protected static final String f11119t1 = "keysToInclude";

    /* renamed from: u */
    protected static final int f11120u = 2;

    /* renamed from: u0 */
    protected static final String f11121u0 = "initMode";

    /* renamed from: u1 */
    protected static final String f11122u1 = "reporterURL";

    /* renamed from: v */
    protected static final int f11123v = 1;

    /* renamed from: v0 */
    protected static final String f11124v0 = "adq_init_blob";

    /* renamed from: v1 */
    protected static final String f11125v1 = "reporterKeyword";

    /* renamed from: w */
    protected static final int f11126w = 1;

    /* renamed from: w0 */
    protected static final String f11127w0 = "settings";

    /* renamed from: w1 */
    protected static final String f11128w1 = "includeANR";

    /* renamed from: x */
    protected static final boolean f11129x = true;

    /* renamed from: x0 */
    protected static final String f11130x0 = "collectBiddingDataTimeout";

    /* renamed from: x1 */
    protected static final String f11131x1 = "timeout";

    /* renamed from: y */
    protected static final boolean f11132y = false;

    /* renamed from: y0 */
    protected static final String f11133y0 = "providers";

    /* renamed from: y1 */
    protected static final String f11134y1 = "setIgnoreDebugger";

    /* renamed from: z */
    protected static final boolean f11135z = false;

    /* renamed from: z0 */
    protected static final String f11136z0 = "parallelInit";

    /* renamed from: z1 */
    protected static final String f11137z1 = "adSourceName";

    /* renamed from: a */
    private C3017cr f11138a;

    /* renamed from: b */
    private C3092er f11139b;

    /* renamed from: c */
    private C3725u8 f11140c;

    /* renamed from: d */
    private String f11141d;

    /* renamed from: e */
    private String f11142e;

    /* renamed from: f */
    private JSONObject f11143f;

    /* renamed from: g */
    private Context f11144g;

    /* renamed from: h */
    private a f11145h;

    /* renamed from: i */
    private InterfaceC3255jg.a f11146i;

    /* renamed from: j */
    private boolean f11147j;

    /* renamed from: k */
    private C3449nc f11148k;

    /* renamed from: com.ironsource.qt$a */
    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);


        /* renamed from: a */
        private final String f11153a;

        a(String str) {
            this.f11153a = str;
        }

        /* renamed from: a */
        public String m11645a() {
            return this.f11153a;
        }
    }

    public C3571qt(Context context, String str, String str2, String str3) {
        this.f11145h = a.NOT_SET;
        this.f11147j = false;
        this.f11144g = context;
        this.f11146i = C3495on.m11193O().mo8485m();
        try {
            this.f11143f = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            this.f11147j = m11630n();
            m11633s();
            m11631q();
            m11632r();
            this.f11141d = TextUtils.isEmpty(str) ? "" : str;
            this.f11142e = TextUtils.isEmpty(str2) ? "" : str2;
            m11617b(this.f11143f);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            m11611a();
        }
    }

    /* renamed from: a */
    private int m11605a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i : iOptInt;
    }

    /* renamed from: b */
    public static C3271jw m11614b(C3571qt c3571qt) {
        return (c3571qt == null || !c3571qt.m11644p()) ? C3271jw.m9546a() : c3571qt.m11635c().m12633b().m13297k();
    }

    /* renamed from: c */
    private C3365a m11619c(JSONObject jSONObject) {
        C3365a c3365a = new C3365a();
        JSONObject jSONObjectM11620c = m11620c(jSONObject, "AdQuality");
        if (jSONObjectM11620c != null) {
            c3365a.m10046a(jSONObjectM11620c.optInt("initMode", 0));
            new C3190hk().m9142b(jSONObjectM11620c.optString("adq_init_blob"));
        }
        return c3365a;
    }

    /* renamed from: d */
    private Context m11621d() {
        return this.f11144g;
    }

    /* renamed from: e */
    private InterstitialPlacement m11624e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f11080h1, false);
        C3463nq c3463nqM11608a = m11608a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        InterstitialPlacement interstitialPlacement = new InterstitialPlacement(iOptInt, strOptString, zOptBoolean, c3463nqM11608a);
        if (c3463nqM11608a != null) {
            this.f11146i.mo9485c(this.f11144g, interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
        }
        return interstitialPlacement;
    }

    /* renamed from: f */
    private C3089eo m11625f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f11080h1, false);
        C3463nq c3463nqM11608a = m11608a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C3089eo c3089eo = new C3089eo(iOptInt, strOptString, zOptBoolean, c3463nqM11608a);
        if (c3463nqM11608a != null) {
            this.f11146i.mo9485c(this.f11144g, c3089eo, IronSource.AD_UNIT.NATIVE_AD);
        }
        return c3089eo;
    }

    /* renamed from: g */
    private Placement m11626g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f11080h1, false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        C3463nq c3463nqM11608a = m11608a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        Placement placement = new Placement(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c3463nqM11608a);
        if (c3463nqM11608a != null) {
            this.f11146i.mo9485c(this.f11144g, placement, IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        return placement;
    }

    /* renamed from: l */
    private String m11628l() {
        return this.f11147j ? "rewarded" : "rewardedVideo";
    }

    /* renamed from: m */
    private boolean m11629m() {
        JSONObject jSONObjectM11620c;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectM11620c2 = m11620c(this.f11143f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectM11620c2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectM11620c3 = m11620c(m11620c(this.f11143f, "configurations"), m11615b());
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectM11620c2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectM11620c = m11620c(jSONObjectM11620c3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectM11620c.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private boolean m11630n() {
        int iOptInt;
        try {
            iOptInt = this.f11143f.optInt(f11087j2, 0);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x00b8  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11631q() {
        /*
            Method dump skipped, instructions count: 2228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3571qt.m11631q():void");
    }

    /* renamed from: r */
    private void m11632r() {
        try {
            JSONObject jSONObjectM11620c = m11620c(this.f11143f, "providerOrder");
            JSONArray jSONArrayM11616b = m11616b(jSONObjectM11620c, m11628l());
            JSONArray jSONArrayM11616b2 = m11616b(jSONObjectM11620c, "interstitial");
            JSONArray jSONArrayM11616b3 = m11616b(jSONObjectM11620c, "banner");
            JSONArray jSONArrayM11616b4 = m11616b(jSONObjectM11620c, "nativeAd");
            this.f11138a = new C3017cr();
            if (jSONArrayM11616b != null && m11635c() != null && m11635c().m12637f() != null) {
                for (int i = 0; i < jSONArrayM11616b.length(); i++) {
                    String strOptString = jSONArrayM11616b.optString(i);
                    this.f11138a.m8211d(strOptString);
                    NetworkSettings networkSettingsM8546b = C3092er.m8541c().m8546b(strOptString);
                    if (networkSettingsM8546b != null) {
                        networkSettingsM8546b.setRewardedVideoPriority(i);
                    }
                }
            }
            if (jSONArrayM11616b2 != null && m11635c() != null && m11635c().m12635d() != null) {
                for (int i2 = 0; i2 < jSONArrayM11616b2.length(); i2++) {
                    String strOptString2 = jSONArrayM11616b2.optString(i2);
                    this.f11138a.m8207b(strOptString2);
                    NetworkSettings networkSettingsM8546b2 = C3092er.m8541c().m8546b(strOptString2);
                    if (networkSettingsM8546b2 != null) {
                        networkSettingsM8546b2.setInterstitialPriority(i2);
                    }
                }
            }
            if (jSONArrayM11616b3 != null) {
                for (int i3 = 0; i3 < jSONArrayM11616b3.length(); i3++) {
                    String strOptString3 = jSONArrayM11616b3.optString(i3);
                    this.f11138a.m8205a(strOptString3);
                    NetworkSettings networkSettingsM8546b3 = C3092er.m8541c().m8546b(strOptString3);
                    if (networkSettingsM8546b3 != null) {
                        networkSettingsM8546b3.setBannerPriority(i3);
                    }
                }
            }
            if (jSONArrayM11616b4 != null) {
                for (int i4 = 0; i4 < jSONArrayM11616b4.length(); i4++) {
                    String strOptString4 = jSONArrayM11616b4.optString(i4);
                    this.f11138a.m8209c(strOptString4);
                    NetworkSettings networkSettingsM8546b4 = C3092er.m8541c().m8546b(strOptString4);
                    if (networkSettingsM8546b4 != null) {
                        networkSettingsM8546b4.setNativeAdPriority(i4);
                    }
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: s */
    private void m11633s() {
        JSONObject jSONObject;
        Iterator<String> it;
        NetworkSettings networkSettings;
        try {
            this.f11139b = C3092er.m8541c();
            JSONObject jSONObjectM11620c = m11620c(this.f11143f, "providerSettings");
            Iterator<String> itKeys = jSONObjectM11620c.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectM11620c.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                    JSONObject jSONObjectM11620c2 = m11620c(jSONObjectOptJSONObject, m11615b());
                    JSONObject jSONObjectM11620c3 = m11620c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectM11620c4 = m11620c(jSONObjectM11620c2, m11628l());
                    JSONObject jSONObjectM11620c5 = m11620c(jSONObjectM11620c2, "interstitial");
                    JSONObject jSONObjectM11620c6 = m11620c(jSONObjectM11620c2, "banner");
                    JSONObject jSONObjectM11620c7 = m11620c(jSONObjectM11620c2, "nativeAd");
                    JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectM11620c4, jSONObjectM11620c3);
                    JSONObject jSONObjectMergeJsons2 = IronSourceUtils.mergeJsons(jSONObjectM11620c5, jSONObjectM11620c3);
                    JSONObject jSONObjectMergeJsons3 = IronSourceUtils.mergeJsons(jSONObjectM11620c6, jSONObjectM11620c3);
                    JSONObject jSONObjectMergeJsons4 = IronSourceUtils.mergeJsons(jSONObjectM11620c7, jSONObjectM11620c3);
                    if (this.f11139b.m8545a(next)) {
                        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsM8546b = this.f11139b.m8546b(next);
                        JSONObject rewardedVideoSettings = networkSettingsM8546b.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsM8546b.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsM8546b.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsM8546b.getNativeAdSettings();
                        networkSettingsM8546b.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, jSONObjectMergeJsons));
                        networkSettingsM8546b.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, jSONObjectMergeJsons2));
                        networkSettingsM8546b.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, jSONObjectMergeJsons3));
                        networkSettingsM8546b.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, jSONObjectMergeJsons4));
                        networkSettingsM8546b.setIsMultipleInstances(zOptBoolean);
                        networkSettingsM8546b.setSubProviderId(strOptString);
                        networkSettingsM8546b.setAdSourceNameForEvents(strOptString2);
                        networkSettingsM8546b.setProviderNetworkKey(strOptString3);
                    } else {
                        if (m11618b(strOptString4)) {
                            jSONObject = jSONObjectM11620c;
                            NetworkSettings networkSettingsM8546b2 = this.f11139b.m8546b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsM8546b2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsM8546b2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsM8546b2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsM8546b2.getNativeAdSettings();
                            it = itKeys;
                            networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectM11620c3, IronSourceUtils.mergeJsons(new JSONObject(rewardedVideoSettings2.toString()), jSONObjectMergeJsons), IronSourceUtils.mergeJsons(new JSONObject(interstitialSettings2.toString()), jSONObjectMergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), jSONObjectMergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), jSONObjectMergeJsons4));
                            networkSettings.setIsMultipleInstances(zOptBoolean);
                            networkSettings.setSubProviderId(strOptString);
                            networkSettings.setAdSourceNameForEvents(strOptString2);
                        } else {
                            jSONObject = jSONObjectM11620c;
                            it = itKeys;
                            networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectM11620c3, jSONObjectMergeJsons, jSONObjectMergeJsons2, jSONObjectMergeJsons3, jSONObjectMergeJsons4);
                            networkSettings.setIsMultipleInstances(zOptBoolean);
                            networkSettings.setSubProviderId(strOptString);
                            networkSettings.setAdSourceNameForEvents(strOptString2);
                        }
                        this.f11139b.m8544a(networkSettings);
                        jSONObjectM11620c = jSONObject;
                        itKeys = it;
                    }
                }
            }
            this.f11139b.m8547b();
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: h */
    public a m11639h() {
        return this.f11145h;
    }

    /* renamed from: i */
    public JSONObject m11640i() {
        return this.f11143f;
    }

    /* renamed from: j */
    public C3017cr m11641j() {
        return this.f11138a;
    }

    /* renamed from: k */
    public C3092er m11642k() {
        return this.f11139b;
    }

    /* renamed from: o */
    public boolean m11643o() {
        return !TextUtils.isEmpty(m11635c().m12638g().m12722b());
    }

    /* renamed from: p */
    public boolean m11644p() {
        JSONObject jSONObject = this.f11143f;
        return (jSONObject == null || jSONObject.has("error") || this.f11138a == null || this.f11139b == null || this.f11140c == null || !m11629m()) ? false : true;
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f11141d);
            jSONObject.put("userId", this.f11142e);
            jSONObject.put(f11099n, this.f11143f);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    public C3571qt(C3571qt c3571qt) {
        this.f11145h = a.NOT_SET;
        this.f11147j = false;
        try {
            this.f11144g = c3571qt.m11621d();
            this.f11143f = new JSONObject(c3571qt.f11143f.toString());
            this.f11141d = c3571qt.f11141d;
            this.f11142e = c3571qt.f11142e;
            this.f11147j = c3571qt.f11147j;
            this.f11138a = c3571qt.m11641j();
            this.f11139b = c3571qt.m11642k();
            this.f11140c = c3571qt.m11635c();
            this.f11145h = c3571qt.m11639h();
            this.f11146i = C3495on.m11193O().mo8485m();
            m11617b(this.f11143f);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            m11611a();
        }
    }

    /* renamed from: a */
    private long m11606a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long jOptLong = jSONObject.has(str) ? jSONObject.optLong(str, 0L) : jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        return jOptLong == 0 ? j : jOptLong;
    }

    /* renamed from: b */
    private String m11615b() {
        return this.f11147j ? "adFormats" : C3788w2.f12437c;
    }

    /* renamed from: d */
    private C3177h7 m11622d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f11080h1, false);
        C3463nq c3463nqM11608a = m11608a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C3177h7 c3177h7 = new C3177h7(iOptInt, strOptString, zOptBoolean, c3463nqM11608a);
        if (c3463nqM11608a != null) {
            this.f11146i.mo9485c(this.f11144g, c3177h7, IronSource.AD_UNIT.BANNER);
        }
        return c3177h7;
    }

    /* renamed from: h */
    private C3748uv m11627h(JSONObject jSONObject) {
        C3748uv c3748uv = new C3748uv();
        JSONObject jSONObjectM11620c = m11620c(jSONObject, "testSuite");
        if (jSONObjectM11620c != null) {
            c3748uv.m12723b(jSONObjectM11620c.optString("controllerUrl"));
        }
        return c3748uv;
    }

    /* renamed from: c */
    public C3725u8 m11635c() {
        return this.f11140c;
    }

    /* renamed from: e */
    public C3449nc m11636e() {
        return this.f11148k;
    }

    /* renamed from: f */
    public C3700ti m11637f() {
        return new C3700ti(this.f11141d, this.f11142e);
    }

    /* renamed from: g */
    public List<IronSource.AD_UNIT> m11638g() {
        C3017cr c3017cr;
        C3017cr c3017cr2;
        C3017cr c3017cr3;
        C3017cr c3017cr4;
        if (this.f11143f == null || this.f11140c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f11140c.m12637f() != null && (c3017cr4 = this.f11138a) != null && !c3017cr4.m8210d().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.f11140c.m12635d() != null && (c3017cr3 = this.f11138a) != null && !c3017cr3.m8206b().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.f11140c.m12634c() != null && (c3017cr2 = this.f11138a) != null && !c3017cr2.m8204a().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (this.f11140c.m12636e() != null && (c3017cr = this.f11138a) != null && !c3017cr.m8208c().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
        }
        return arrayList;
    }

    /* renamed from: a */
    private C3139g4 m11607a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        int[] iArr4 = null;
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                iArr5[i] = jSONArrayOptJSONArray.optInt(i);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                iArr6[i2] = jSONArrayOptJSONArray2.optInt(i2);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                iArr7[i3] = jSONArrayOptJSONArray3.optInt(i3);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            iArr4 = new int[jSONArrayOptJSONArray4.length()];
            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                iArr4[i4] = jSONArrayOptJSONArray4.optInt(i4);
            }
        }
        return new C3139g4(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    /* renamed from: b */
    private JSONArray m11616b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f11147j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectM11620c = m11620c(jSONObject, str);
        String strM11610a = m11610a(str);
        if (jSONObjectM11620c == null || strM11610a == null) {
            return null;
        }
        return jSONObjectM11620c.optJSONArray(strM11610a);
    }

    /* renamed from: c */
    private JSONObject m11620c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: d */
    private JSONObject m11623d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectM11620c = m11620c(jSONObject, str);
        return jSONObjectM11620c != null ? jSONObjectM11620c : new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0036 A[PHI: r7
  0x0036: PHI (r7v3 com.ironsource.rq) = (r7v1 com.ironsource.rq), (r7v2 com.ironsource.rq) binds: [B:41:0x0034, B:44:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.C3463nq m11608a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.nq$b r1 = new com.ironsource.nq$b
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.m11043a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.rq r7 = com.ironsource.EnumC3603rq.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.rq r7 = com.ironsource.EnumC3603rq.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.m11045a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.m11044a(r3, r0)
        L74:
            com.ironsource.nq r10 = r1.m11046a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3571qt.m11608a(org.json.JSONObject):com.ironsource.nq");
    }

    /* renamed from: b */
    private void m11617b(JSONObject jSONObject) {
        this.f11148k = new C3449nc(jSONObject.optJSONObject(C3848xs.f12670d));
    }

    /* renamed from: a */
    public static a m11609a(C3571qt c3571qt) {
        return c3571qt != null ? c3571qt.m11639h() : a.NOT_SET;
    }

    /* renamed from: b */
    private boolean m11618b(String str) {
        return this.f11139b.m8545a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    /* renamed from: a */
    private String m11610a(String str) {
        try {
            JSONObject jSONObjectM11620c = m11620c(m11620c(m11620c(m11620c(this.f11143f, "configurations"), "adFormats"), str), C3788w2.f12437c);
            if (jSONObjectM11620c == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectM11620c.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectM11620c2 = m11620c(jSONObjectM11620c, next);
                if (jSONObjectM11620c2 != null && jSONObjectM11620c2.optBoolean(f11080h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private void m11611a() {
        this.f11143f = new JSONObject();
        this.f11141d = "";
        this.f11142e = "";
        this.f11138a = new C3017cr();
        this.f11139b = C3092er.m8541c();
        this.f11140c = new C3725u8.a().m12647a();
        this.f11146i = C3495on.m11193O().mo8485m();
        m11617b(this.f11143f);
    }

    /* renamed from: a */
    public void m11634a(a aVar) {
        this.f11145h = aVar;
    }

    /* renamed from: a */
    private boolean m11612a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z) : z;
    }

    /* renamed from: a */
    private int[] m11613a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            iArr[i] = jSONArrayOptJSONArray.optInt(i);
        }
        return iArr;
    }
}
