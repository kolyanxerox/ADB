package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.er */
/* loaded from: classes2.dex */
public class C3092er {

    /* renamed from: b */
    private static C3092er f8458b;

    /* renamed from: a */
    private final ConcurrentHashMap<String, NetworkSettings> f8459a = new ConcurrentHashMap<>();

    private C3092er() {
    }

    /* renamed from: c */
    public static synchronized C3092er m8541c() {
        try {
            if (f8458b == null) {
                f8458b = new C3092er();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8458b;
    }

    /* renamed from: a */
    public HashSet<String> m8542a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.f8459a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
        return hashSet;
    }

    /* renamed from: b */
    public NetworkSettings m8546b(String str) {
        NetworkSettings networkSettings = this.f8459a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        NetworkSettings networkSettings2 = new NetworkSettings(str);
        m8544a(networkSettings2);
        return networkSettings2;
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, NetworkSettings> m8549d() {
        return this.f8459a;
    }

    /* renamed from: a */
    public void m8543a() {
        this.f8459a.clear();
    }

    /* renamed from: b */
    public void m8547b() {
        for (NetworkSettings networkSettings : this.f8459a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings networkSettingsM8546b = m8546b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.mergeJsons(networkSettings.getApplicationSettings(), networkSettingsM8546b.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.mergeJsons(networkSettings.getInterstitialSettings(), networkSettingsM8546b.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.mergeJsons(networkSettings.getRewardedVideoSettings(), networkSettingsM8546b.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.mergeJsons(networkSettings.getBannerSettings(), networkSettingsM8546b.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.mergeJsons(networkSettings.getNativeAdSettings(), networkSettingsM8546b.getNativeAdSettings()));
            }
        }
    }

    /* renamed from: c */
    public NetworkSettings m8548c(String str) {
        for (NetworkSettings networkSettings : this.f8459a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    /* renamed from: a */
    public void m8544a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f8459a.put(networkSettings.getProviderName(), networkSettings);
    }

    /* renamed from: a */
    public boolean m8545a(String str) {
        return this.f8459a.containsKey(str);
    }
}
