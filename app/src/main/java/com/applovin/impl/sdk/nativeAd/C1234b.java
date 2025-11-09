package com.applovin.impl.sdk.nativeAd;

import OooO0oO.OooOo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractC1027f6;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.C1233a;
import com.applovin.impl.sdk.network.C1239e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3007ch;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.b */
/* loaded from: classes.dex */
public class C1234b extends AbstractRunnableC1036g5 implements C1233a.a, AppLovinAdLoadListener {

    /* renamed from: A */
    private final List f2236A;

    /* renamed from: B */
    private final List f2237B;

    /* renamed from: g */
    private final JSONObject f2238g;

    /* renamed from: h */
    private final JSONObject f2239h;

    /* renamed from: i */
    private final AppLovinNativeAdLoadListener f2240i;

    /* renamed from: j */
    private String f2241j;

    /* renamed from: k */
    private String f2242k;

    /* renamed from: l */
    private String f2243l;

    /* renamed from: m */
    private Double f2244m;

    /* renamed from: n */
    private String f2245n;

    /* renamed from: o */
    private Uri f2246o;

    /* renamed from: p */
    private Uri f2247p;

    /* renamed from: q */
    private C1088l7 f2248q;

    /* renamed from: r */
    private Uri f2249r;

    /* renamed from: s */
    private Uri f2250s;

    /* renamed from: t */
    private Uri f2251t;

    /* renamed from: u */
    private Uri f2252u;

    /* renamed from: v */
    private final List f2253v;

    /* renamed from: w */
    private final List f2254w;

    /* renamed from: x */
    private final List f2255x;

    /* renamed from: y */
    private final List f2256y;

    /* renamed from: z */
    private final List f2257z;

    public C1234b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1220k c1220k) {
        super("TaskRenderNativeAd", c1220k);
        this.f2241j = "";
        this.f2242k = "";
        this.f2243l = "";
        this.f2244m = null;
        this.f2245n = "";
        this.f2246o = null;
        this.f2247p = null;
        this.f2249r = null;
        this.f2250s = null;
        this.f2251t = null;
        this.f2252u = null;
        this.f2253v = new ArrayList();
        this.f2254w = new ArrayList();
        this.f2255x = new ArrayList();
        this.f2256y = new ArrayList();
        this.f2257z = new ArrayList();
        this.f2236A = new ArrayList();
        this.f2237B = new ArrayList();
        this.f2238g = jSONObject;
        this.f2239h = jSONObject2;
        this.f2240i = appLovinNativeAdLoadListener;
    }

    /* renamed from: a */
    private void m3065a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f2251t = Uri.parse(string);
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Processed click destination URL: " + this.f2251t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f2252u = Uri.parse(string2);
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Processed click destination backup URL: " + this.f2252u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f2238g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f776a.m2866a(C1268v4.f2629M2)).booleanValue()) {
                try {
                    this.f2253v.addAll(JsonUtils.toList(jSONArray));
                    if (C1240o.m3200a()) {
                        this.f778c.m3211a(this.f777b, "Processed click tracking URLs: " + this.f2253v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (C1240o.m3200a()) {
                        this.f778c.m3212a(this.f777b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f2255x.add(new C1239e.a(this.f776a).mo3103b(str).mo3105b(false).mo3100a(false).m3196h(m3070f()).mo3101a());
                    }
                }
            }
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Processed click tracking requests: " + this.f2255x);
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m3066b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().mo476h();
            this.f2240i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Failed to prepare native ad view components", th);
            }
            m3067b(th.getMessage());
            this.f776a.m2832E().m2148a(this.f777b, "prepareNativeComponents", th);
        }
    }

    /* renamed from: c */
    private void m3068c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new OooO0Oo.OooO0O0(15, this, appLovinNativeAdImpl));
    }

    /* renamed from: e */
    private void m3069e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f2238g), JsonUtils.shallowCopy(this.f2239h), this.f776a).setTitle(this.f2241j).setAdvertiser(this.f2242k).setBody(this.f2243l).setCallToAction(this.f2245n).setStarRating(this.f2244m).setIconUri(this.f2246o).setMainImageUri(this.f2247p).setPrivacyIconUri(this.f2249r).setVastAd(this.f2248q).setPrivacyDestinationUri(this.f2250s).setClickDestinationUri(this.f2251t).setClickDestinationBackupUri(this.f2252u).setClickTrackingUrls(this.f2253v).setJsTrackers(this.f2254w).setClickTrackingRequests(this.f2255x).setImpressionRequests(this.f2256y).setViewableMRC50Requests(this.f2257z).setViewableMRC100Requests(this.f2236A).setViewableVideo50Requests(this.f2237B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().m473e();
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f776a.m2918r0().m403a((AbstractRunnableC1036g5) new C1233a(appLovinNativeAdImplBuild, this.f776a, this), C0987b6.b.CORE);
    }

    /* renamed from: f */
    private boolean m3070f() {
        return JsonUtils.getBoolean(this.f2238g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f776a.m2866a(C1268v4.f2621L2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "VAST ad rendered successfully");
        }
        this.f2248q = (C1088l7) appLovinAd;
        m3069e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "VAST ad failed to render");
        }
        m3069e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r3 = 0;
        String string = JsonUtils.getString(this.f2238g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f2249r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f2238g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f2250s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f2238g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "No oRtb response provided: " + this.f2238g);
            }
            m3067b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Rendering native ad for oRTB version: ", string3, this.f778c, this.f777b);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, IronSourceConstants.EVENTS_NATIVE, jSONObject2);
        m3065a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to retrieve assets - failing ad load: " + this.f2238g);
            }
            m3067b("Unable to retrieve assets");
            return;
        }
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject4.has(C3034d9.h.f8063D0)) {
                this.f2241j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, C3034d9.h.f8063D0, (JSONObject) null), C3034d9.h.f8077K0, null);
                if (C1240o.m3200a()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Processed title: "), this.f2241j, this.f778c, this.f777b);
                }
            } else if (jSONObject4.has("link")) {
                m3065a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
            } else if (jSONObject4.has("img")) {
                int i2 = JsonUtils.getInt(jSONObject4, C3007ch.f7763x, -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                int i3 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", null);
                if (i3 == 1 || 3 == i2) {
                    this.f2246o = Uri.parse(string4);
                    if (C1240o.m3200a()) {
                        this.f778c.m3211a(this.f777b, "Processed icon URL: " + this.f2246o);
                    }
                } else if (i3 == 3 || 2 == i2) {
                    this.f2247p = Uri.parse(string4);
                    if (C1240o.m3200a()) {
                        this.f778c.m3211a(this.f777b, "Processed main image URL: " + this.f2247p);
                    }
                } else {
                    if (C1240o.m3200a()) {
                        this.f778c.m3218k(this.f777b, "Unrecognized image: " + jSONObject4);
                    }
                    int i4 = JsonUtils.getInt(jSONObject5, OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, -1);
                    int i5 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i4 <= 0 || i5 <= 0) {
                        if (C1240o.m3200a()) {
                            this.f778c.m3218k(this.f777b, "Skipping...");
                        }
                    } else if (i4 / i5 > 1.0d) {
                        if (C1240o.m3200a()) {
                            this.f778c.m3211a(this.f777b, OooOo.OooO("Inferring main image from ", i4, "x", i5, "..."));
                        }
                        this.f2247p = Uri.parse(string4);
                    } else {
                        if (C1240o.m3200a()) {
                            this.f778c.m3211a(this.f777b, OooOo.OooO("Inferring icon image from ", i4, "x", i5, "..."));
                        }
                        this.f2246o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has(MimeTypes.BASE_TYPE_VIDEO)) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, MimeTypes.BASE_TYPE_VIDEO, (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (C1240o.m3200a()) {
                        this.f778c.m3211a(this.f777b, "Processed VAST video");
                    }
                } else if (C1240o.m3200a()) {
                    this.f778c.m3218k(this.f777b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i6 = JsonUtils.getInt(jSONObject4, C3007ch.f7763x, -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i7 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i7 == 1 || i6 == 8) {
                    this.f2242k = string6;
                    if (C1240o.m3200a()) {
                        androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Processed advertiser: "), this.f2242k, this.f778c, this.f777b);
                    }
                } else if (i7 == 2 || i6 == 4) {
                    this.f2243l = string6;
                    if (C1240o.m3200a()) {
                        androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Processed body: "), this.f2243l, this.f778c, this.f777b);
                    }
                } else if (i7 == 12 || i6 == 5) {
                    this.f2245n = string6;
                    if (C1240o.m3200a()) {
                        androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Processed cta: "), this.f2245n, this.f778c, this.f777b);
                    }
                } else if (i7 == 3 || i6 == 6) {
                    double dM1155a = AbstractC1078k7.m1155a(string6, -1.0d);
                    if (dM1155a != -1.0d) {
                        this.f2244m = Double.valueOf(dM1155a);
                        if (C1240o.m3200a()) {
                            this.f778c.m3211a(this.f777b, "Processed star rating: " + this.f2244m);
                        }
                    } else if (C1240o.m3200a()) {
                        androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Received invalid star rating: ", string6, this.f778c, this.f777b);
                    }
                } else if (C1240o.m3200a()) {
                    this.f778c.m3218k(this.f777b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unsupported asset object: " + jSONObject4);
            }
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f2254w.add(string7);
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Processed jstracker: ", string7, this.f778c, this.f777b);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, null);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f2256y.add(new C1239e.a(this.f776a).mo3103b(str2).mo3105b(false).mo3100a(false).m3196h(m3070f()).mo3101a());
                        if (C1240o.m3200a()) {
                            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Processed imptracker URL: ", str2, this.f778c, this.f777b);
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i9 = 0;
            while (i9 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i9, (JSONObject) r3);
                int i10 = JsonUtils.getInt(jSONObject7, NotificationCompat.CATEGORY_EVENT, -1);
                int i11 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r3);
                if (!TextUtils.isEmpty(string8)) {
                    if (i11 == 1 || i11 == 2) {
                        if (i11 == 2 && string8.startsWith("<script")) {
                            this.f2254w.add(string8);
                        } else {
                            C1239e c1239eMo3101a = new C1239e.a(this.f776a).mo3103b(string8).mo3105b(false).mo3100a(false).m3196h(m3070f() || i11 == 2).mo3101a();
                            if (i10 == 1) {
                                this.f2256y.add(c1239eMo3101a);
                                if (C1240o.m3200a()) {
                                    androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Processed impression URL: ", string8, this.f778c, this.f777b);
                                }
                            } else if (i10 == 2) {
                                this.f2257z.add(c1239eMo3101a);
                                if (C1240o.m3200a()) {
                                    androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Processed viewable MRC50 URL: ", string8, this.f778c, this.f777b);
                                }
                            } else if (i10 == 3) {
                                this.f2236A.add(c1239eMo3101a);
                                if (C1240o.m3200a()) {
                                    androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Processed viewable MRC100 URL: ", string8, this.f778c, this.f777b);
                                }
                            } else if (i10 == 4) {
                                this.f2237B.add(c1239eMo3101a);
                                if (C1240o.m3200a()) {
                                    androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Processed viewable video 50 URL: ", string8, this.f778c, this.f777b);
                                }
                            } else if (i10 == 555) {
                                if (C1240o.m3200a()) {
                                    androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Ignoring processing of OMID URL: ", string8, this.f778c, this.f777b);
                                }
                            } else if (C1240o.m3200a()) {
                                this.f778c.m3214b(this.f777b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (C1240o.m3200a()) {
                        this.f778c.m3214b(this.f777b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i9++;
                r3 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            m3069e();
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Processing VAST video...");
        }
        this.f776a.m2918r0().m402a(AbstractC1027f6.m743a(str, JsonUtils.shallowCopy(this.f2238g), JsonUtils.shallowCopy(this.f2239h), this, this.f776a));
    }

    /* renamed from: b */
    private void m3067b(String str) {
        this.f2240i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.C1233a.a
    /* renamed from: a */
    public void mo3064a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Successfully cached and loaded ad");
        }
        m3068c(appLovinNativeAdImpl);
    }
}
