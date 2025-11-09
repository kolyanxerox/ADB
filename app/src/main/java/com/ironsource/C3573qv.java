package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.qv */
/* loaded from: classes2.dex */
public final class C3573qv {

    /* renamed from: a */
    public static final C3573qv f11160a = new C3573qv();

    private C3573qv() {
    }

    /* renamed from: a */
    public final int m11661a() {
        return C3495on.f10667s.m11213d().mo8686f().mo4860k();
    }

    /* renamed from: b */
    public final LevelPlayAdSize m11677b(String str, int i, int i2) {
        return (str == null || str.length() == 0 || kotlin.jvm.internal.OooOo.OooO00o(str, C3395l.f9871f)) ? LevelPlayAdSize.Companion.createCustomSize(i, i2) : kotlin.jvm.internal.OooOo.OooO00o(str, C3395l.f9868c) ? LevelPlayAdSize.MEDIUM_RECTANGLE : LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
    }

    /* renamed from: c */
    public final String m11683c(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return C2959b4.m7874g(context);
    }

    /* renamed from: d */
    public final ConcurrentHashMap<String, List<String>> m11685d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(C3367c.m10097b().m10122d());
        concurrentHashMap.putAll(C3840xk.m13069b().m13074c());
        return concurrentHashMap;
    }

    /* renamed from: e */
    public final boolean m11686e() {
        return IronSource.isInterstitialReady();
    }

    /* renamed from: f */
    public final boolean m11687f() {
        return IronSource.isRewardedVideoAvailable();
    }

    /* renamed from: g */
    public final void m11688g() {
        IronSource.loadInterstitial();
    }

    /* renamed from: h */
    public final void m11689h() {
        IronSource.loadRewardedVideo();
    }

    /* renamed from: i */
    public final void m11690i() {
        C3404p.m10470j().m10488P();
    }

    /* renamed from: a */
    public final ISBannerSize m11662a(String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    /* renamed from: b */
    public final String m11678b(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return C2959b4.m7867b(context, m11683c(context));
    }

    /* renamed from: c */
    public final JSONObject m11684c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = C3367c.m10097b().m10123e();
            kotlin.jvm.internal.OooOo.OooO0Oo(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    C3573qv c3573qv = f11160a;
                    String key = entry.getKey();
                    kotlin.jvm.internal.OooOo.OooO0Oo(key, "entry.key");
                    String strM11667a = c3573qv.m11667a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    kotlin.jvm.internal.OooOo.OooO0Oo(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    kotlin.jvm.internal.OooOo.OooO0Oo(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strM11667a, c3573qv.m11660a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final IronSourceBannerLayout m11663a(Activity activity, ISBannerSize size) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(size, "size");
        IronSourceBannerLayout ironSourceBannerLayoutM10529b = C3404p.m10470j().m10529b(activity, size);
        kotlin.jvm.internal.OooOo.OooO0Oo(ironSourceBannerLayoutM10529b, "getInstance().createBanner(activity, size)");
        return ironSourceBannerLayoutM10529b;
    }

    /* renamed from: b */
    public final JSONObject m11679b() {
        JSONObject jSONObjectM9665b = C3288ke.m9661a().m9665b();
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectM9665b, "getProperties().toJSON()");
        return jSONObjectM9665b;
    }

    /* renamed from: a */
    public final String m11664a(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return C2959b4.m7863a(context, m11683c(context));
    }

    /* renamed from: b */
    public final void m11680b(Activity activity) {
        if (activity != null) {
            IronSource.showRewardedVideo(activity);
        } else {
            IronSource.showRewardedVideo();
        }
    }

    /* renamed from: a */
    public final String m11665a(NetworkSettings networkSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    /* renamed from: b */
    public final void m11681b(IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.loadBanner(ironSourceBannerLayout);
    }

    /* renamed from: a */
    public final String m11666a(Placement placement) {
        String placementName;
        return (placement == null || (placementName = placement.getPlacementName()) == null) ? new String() : placementName;
    }

    /* renamed from: b */
    public final void m11682b(String message) {
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        IronLog.INTERNAL.error(message);
    }

    /* renamed from: a */
    public final String m11667a(String key) {
        List listOoooo0o;
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        try {
            if (o00O0oO.o000000.Oooo0o("-", key)) {
                String str = (String) o00O0.OooOo00.Oooo000(o00O0oO.o000000.Ooooo0o(key, new String[]{"-"}));
                if (!o00O0oO.o000000.Oooo0o("_", str)) {
                    return str;
                }
                listOoooo0o = o00O0oO.o000000.Ooooo0o(str, new String[]{"_"});
            } else {
                if (!o00O0oO.o000000.Oooo0o("_", key)) {
                    return key;
                }
                listOoooo0o = o00O0oO.o000000.Ooooo0o(key, new String[]{"_"});
            }
            return (String) o00O0.OooOo00.OooOoOO(listOoooo0o);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.getMessage());
            return key;
        }
    }

    /* renamed from: a */
    public final JSONObject m11668a(boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
        kotlin.jvm.internal.OooOo.OooO0Oo(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    /* renamed from: a */
    public final void m11669a(Activity activity) {
        if (activity != null) {
            IronSource.showInterstitial(activity);
        } else {
            IronSource.showInterstitial();
        }
    }

    /* renamed from: a */
    public final void m11670a(EnumC2638ac event, JSONObject data) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        kotlin.jvm.internal.OooOo.OooO0o0(data, "data");
        C3053ds.m8391i().mo12605a(new C3899zb(event, data));
    }

    /* renamed from: a */
    public final void m11671a(IronSource.AD_UNIT adUnit, C3270jv loadAdConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(loadAdConfig, "loadAdConfig");
        C3404p.m10470j().m10509a(adUnit, loadAdConfig);
    }

    /* renamed from: a */
    public final void m11672a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.destroyBanner(ironSourceBannerLayout);
    }

    /* renamed from: a */
    public final void m11673a(LevelPlayBannerListener levelPlayBannerListener) {
        C3687t5.m12363a().m12388b(levelPlayBannerListener);
    }

    /* renamed from: a */
    public final void m11674a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        C2937ah.m7765a().m7797b(levelPlayInterstitialListener);
    }

    /* renamed from: a */
    public final void m11675a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        C3127fr.m8748a().m8786b(levelPlayRewardedVideoBaseListener);
    }

    /* renamed from: a */
    public final boolean m11676a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkSettings, "networkSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    /* renamed from: a */
    private final JSONObject m11660a(String str, String str2) {
        return new JSONObject(o00O0.o0O0O00.OooOOo0(new oo00o.OooOO0(C3166gv.f8770b, str), new oo00o.OooOO0("sdkVersion", str2)));
    }
}
