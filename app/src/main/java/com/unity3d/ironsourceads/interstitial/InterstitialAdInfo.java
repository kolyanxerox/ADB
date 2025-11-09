package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class InterstitialAdInfo {

    /* renamed from: a */
    private final String f13092a;

    /* renamed from: b */
    private final String f13093b;

    public InterstitialAdInfo(String instanceId, String adId) {
        OooOo.OooO0o0(instanceId, "instanceId");
        OooOo.OooO0o0(adId, "adId");
        this.f13092a = instanceId;
        this.f13093b = adId;
    }

    public final String getAdId() {
        return this.f13093b;
    }

    public final String getInstanceId() {
        return this.f13092a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[instanceId: '");
        sb.append(this.f13092a);
        sb.append("', adId: '");
        return OooO0oO.OooOo.OooOOOo(sb, this.f13093b, "']");
    }
}
