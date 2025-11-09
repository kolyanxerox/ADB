package com.unity3d.ironsourceads.rewarded;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class RewardedAdInfo {

    /* renamed from: a */
    private final String f13105a;

    /* renamed from: b */
    private final String f13106b;

    public RewardedAdInfo(String instanceId, String adId) {
        OooOo.OooO0o0(instanceId, "instanceId");
        OooOo.OooO0o0(adId, "adId");
        this.f13105a = instanceId;
        this.f13106b = adId;
    }

    public final String getAdId() {
        return this.f13106b;
    }

    public final String getInstanceId() {
        return this.f13105a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[instanceId: '");
        sb.append(this.f13105a);
        sb.append("', adId: '");
        return OooO0oO.OooOo.OooOOOo(sb, this.f13106b, "']");
    }
}
