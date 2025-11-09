package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.AbstractC1249t3;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final C1220k coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private AppLovinSdk(C1220k c1220k) {
        this.coreSdk = c1220k;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (instanceLock) {
            try {
                if (instance == null) {
                    C1220k c1220k = new C1220k(new AppLovinSdkSettings(context), context);
                    AppLovinSdk appLovinSdk2 = new AppLovinSdk(c1220k);
                    c1220k.m2874a(appLovinSdk2);
                    instance = appLovinSdk2;
                }
                appLovinSdk = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinSdk;
    }

    private static String getVersion() {
        return "13.4.0";
    }

    private static int getVersionCode() {
        return 13040099;
    }

    /* renamed from: a */
    public C1220k m3943a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.m2905k();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayM3325b = AbstractC1249t3.m3325b(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayM3325b.length());
        for (int i = 0; i < jSONArrayM3325b.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayM3325b, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.m2921t();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.m2927w();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.m2836G();
    }

    public String getSdkKey() {
        return this.coreSdk.m2904j0();
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.m2906k0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.m2912o0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.m2875a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    public boolean isInitialized() {
        return this.coreSdk.m2829C0();
    }

    public void processDeepLink(Uri uri) {
        this.coreSdk.m2872a(uri);
    }

    public void reinitialize(Boolean bool, Boolean bool2) {
        if (this.coreSdk.m2833E0()) {
            this.coreSdk.m2855T0();
        }
        this.coreSdk.m2853S0();
        if (bool != null) {
            this.coreSdk.m2847O();
            if (C1240o.m3200a()) {
                this.coreSdk.m2847O().m3215d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.m2847O();
            if (C1240o.m3200a()) {
                this.coreSdk.m2847O().m3215d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent("dns", CollectionUtils.map("value", bool2.toString()));
        }
    }

    public void showCreativeDebugger() {
        this.coreSdk.m2861X0();
    }

    public void showMediationDebugger() {
        this.coreSdk.m2863Y0();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.m2831D0() + '}';
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.m2877a(map);
    }
}
