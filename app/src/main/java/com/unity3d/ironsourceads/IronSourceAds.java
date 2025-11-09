package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.C3010ck;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* renamed from: a */
        private final String f13071a;

        AdFormat(String str) {
            this.f13071a = str;
        }

        public final String getValue() {
            return this.f13071a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        C3404p.m10470j().setAdaptersDebug(z);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "8.10.0";
    }

    public static final void init(Context context, InitRequest initRequest, InitListener initializationListener) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(initRequest, "initRequest");
        OooOo.OooO0o0(initializationListener, "initializationListener");
        C3010ck.f7784a.m8173a(context, initRequest, initializationListener);
    }

    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        C3404p.m10470j().m10526a(z);
    }

    public static final void setMetaData(String key, String value) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        C3010ck.f7784a.m8174a(key, value);
    }

    public static final void setMetaData(String key, List<String> values) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        C3404p.m10470j().m10523a(key, values);
    }
}
