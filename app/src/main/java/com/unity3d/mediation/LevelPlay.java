package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C3808wm;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* renamed from: a */
        private final String f13117a;

        AdFormat(String str) {
            this.f13117a = str;
        }

        public final String getValue() {
            return this.f13117a;
        }
    }

    private LevelPlay() {
    }

    public static final void addImpressionDataListener(LevelPlayImpressionDataListener listener) {
        OooOo.OooO0o0(listener, "listener");
        IronLog.API.info("adding listener: ".concat(listener.getClass().getSimpleName()));
        C3808wm.f12493a.m12917a(listener);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "8.10.0";
    }

    public static final void init(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener listener) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(initRequest, "initRequest");
        OooOo.OooO0o0(listener, "listener");
        C3808wm.f12493a.m12916a(context, initRequest, listener);
    }

    public static final void launchTestSuite(Context context) {
        OooOo.OooO0o0(context, "context");
        IronLog.API.info("");
        C3404p.m10470j().m10535b(context);
    }

    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener listener) {
        OooOo.OooO0o0(listener, "listener");
        IronLog.API.info("removing listener: ".concat(listener.getClass().getSimpleName()));
        C3808wm.f12493a.m12919b(listener);
    }

    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        C3404p.m10470j().setAdaptersDebug(z);
    }

    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        C3404p.m10470j().m10526a(z);
    }

    public static final boolean setDynamicUserId(String dynamicUserId) {
        OooOo.OooO0o0(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: ".concat(dynamicUserId));
        return C3404p.m10470j().setDynamicUserId(dynamicUserId);
    }

    public static final void setMetaData(String key, String value) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        C3808wm.f12493a.m12918a(key, value);
    }

    public static final void setNetworkData(String networkKey, JSONObject networkData) {
        OooOo.OooO0o0(networkKey, "networkKey");
        OooOo.OooO0o0(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        C3404p.m10470j().m10540b(networkKey, networkData);
    }

    public static final void setSegment(LevelPlaySegment segment) {
        OooOo.OooO0o0(segment, "segment");
        IronLog.API.info("");
        C3808wm.f12493a.m12920b(segment);
    }

    public static final void validateIntegration(Context context) {
        OooOo.OooO0o0(context, "context");
        IronLog.API.info("");
        IntegrationHelper.validateIntegration(context);
    }

    public static final void setMetaData(String key, List<String> values) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        C3404p.m10470j().m10523a(key, values);
    }
}
