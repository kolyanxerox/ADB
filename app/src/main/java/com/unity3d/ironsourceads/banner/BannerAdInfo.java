package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class BannerAdInfo {

    /* renamed from: a */
    private final String f13073a;

    /* renamed from: b */
    private final String f13074b;

    public BannerAdInfo(String instanceId, String adId) {
        OooOo.OooO0o0(instanceId, "instanceId");
        OooOo.OooO0o0(adId, "adId");
        this.f13073a = instanceId;
        this.f13074b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.f13073a;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.f13074b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f13073a;
    }

    public final String component2() {
        return this.f13074b;
    }

    public final BannerAdInfo copy(String instanceId, String adId) {
        OooOo.OooO0o0(instanceId, "instanceId");
        OooOo.OooO0o0(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return OooOo.OooO00o(this.f13073a, bannerAdInfo.f13073a) && OooOo.OooO00o(this.f13074b, bannerAdInfo.f13074b);
    }

    public final String getAdId() {
        return this.f13074b;
    }

    public final String getInstanceId() {
        return this.f13073a;
    }

    public int hashCode() {
        return this.f13074b.hashCode() + (this.f13073a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[instanceId: '");
        sb.append(this.f13073a);
        sb.append("', adId: '");
        return OooO0oO.OooOo.OooOOOo(sb, this.f13074b, "']");
    }
}
