package com.unity3d.mediation;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C3013cn;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class LevelPlayAdInfo {

    /* renamed from: a */
    private final String f13121a;

    /* renamed from: b */
    private final String f13122b;

    /* renamed from: c */
    private final String f13123c;

    /* renamed from: d */
    private final ImpressionData f13124d;

    /* renamed from: e */
    private final C3013cn f13125e;

    /* renamed from: f */
    private final LevelPlayAdSize f13126f;

    /* renamed from: g */
    private final String f13127g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(LevelPlayAdInfo adInfo, String str) {
        this(adInfo.f13121a, adInfo.f13122b, adInfo.f13123c, adInfo.f13124d, adInfo.f13125e, adInfo.f13126f, str);
        OooOo.OooO0o0(adInfo, "adInfo");
    }

    /* renamed from: a */
    private final String m13445a() {
        return this.f13121a;
    }

    /* renamed from: b */
    private final String m13446b() {
        return this.f13122b;
    }

    /* renamed from: c */
    private final String m13447c() {
        return this.f13123c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, ImpressionData impressionData, C3013cn c3013cn, LevelPlayAdSize levelPlayAdSize, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.f13121a;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.f13122b;
        }
        if ((i & 4) != 0) {
            str3 = levelPlayAdInfo.f13123c;
        }
        if ((i & 8) != 0) {
            impressionData = levelPlayAdInfo.f13124d;
        }
        if ((i & 16) != 0) {
            c3013cn = levelPlayAdInfo.f13125e;
        }
        if ((i & 32) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f13126f;
        }
        if ((i & 64) != 0) {
            str4 = levelPlayAdInfo.f13127g;
        }
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str5 = str4;
        C3013cn c3013cn2 = c3013cn;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, impressionData, c3013cn2, levelPlayAdSize2, str5);
    }

    /* renamed from: d */
    private final ImpressionData m13448d() {
        return this.f13124d;
    }

    /* renamed from: e */
    private final C3013cn m13449e() {
        return this.f13125e;
    }

    /* renamed from: f */
    private final LevelPlayAdSize m13450f() {
        return this.f13126f;
    }

    /* renamed from: g */
    private final String m13451g() {
        return this.f13127g;
    }

    public final LevelPlayAdInfo copy(String adId, String adUnitId, String adFormat, ImpressionData impressionData, C3013cn c3013cn, LevelPlayAdSize levelPlayAdSize, String str) {
        OooOo.OooO0o0(adId, "adId");
        OooOo.OooO0o0(adUnitId, "adUnitId");
        OooOo.OooO0o0(adFormat, "adFormat");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, impressionData, c3013cn, levelPlayAdSize, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return OooOo.OooO00o(this.f13121a, levelPlayAdInfo.f13121a) && OooOo.OooO00o(this.f13122b, levelPlayAdInfo.f13122b) && OooOo.OooO00o(this.f13123c, levelPlayAdInfo.f13123c) && OooOo.OooO00o(this.f13124d, levelPlayAdInfo.f13124d) && OooOo.OooO00o(this.f13125e, levelPlayAdInfo.f13125e) && OooOo.OooO00o(this.f13126f, levelPlayAdInfo.f13126f) && OooOo.OooO00o(this.f13127g, levelPlayAdInfo.f13127g);
    }

    public final String getAb() {
        ImpressionData impressionData = this.f13124d;
        String ab = impressionData != null ? impressionData.getAb() : null;
        return ab == null ? "" : ab;
    }

    public final String getAdFormat() {
        ImpressionData impressionData = this.f13124d;
        String adFormat = impressionData != null ? impressionData.getAdFormat() : null;
        return adFormat == null ? this.f13123c : adFormat;
    }

    public final String getAdId() {
        return this.f13121a;
    }

    public final String getAdNetwork() {
        ImpressionData impressionData = this.f13124d;
        String adNetwork = impressionData != null ? impressionData.getAdNetwork() : null;
        return adNetwork == null ? "" : adNetwork;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f13126f;
    }

    public final String getAdUnitId() {
        ImpressionData impressionData = this.f13124d;
        String mediationAdUnitId = impressionData != null ? impressionData.getMediationAdUnitId() : null;
        return mediationAdUnitId == null ? this.f13122b : mediationAdUnitId;
    }

    public final String getAdUnitName() {
        ImpressionData impressionData = this.f13124d;
        String mediationAdUnitName = impressionData != null ? impressionData.getMediationAdUnitName() : null;
        return mediationAdUnitName == null ? "" : mediationAdUnitName;
    }

    public final String getAuctionId() {
        ImpressionData impressionData = this.f13124d;
        String auctionId = impressionData != null ? impressionData.getAuctionId() : null;
        return auctionId == null ? "" : auctionId;
    }

    public final String getCountry() {
        ImpressionData impressionData = this.f13124d;
        String country = impressionData != null ? impressionData.getCountry() : null;
        return country == null ? "" : country;
    }

    public final String getCreativeId() {
        ImpressionData impressionData = this.f13124d;
        String creativeId = impressionData != null ? impressionData.getCreativeId() : null;
        return creativeId == null ? "" : creativeId;
    }

    public final String getEncryptedCPM() {
        ImpressionData impressionData = this.f13124d;
        String encryptedCPM = impressionData != null ? impressionData.getEncryptedCPM() : null;
        return encryptedCPM == null ? "" : encryptedCPM;
    }

    public final String getInstanceId() {
        ImpressionData impressionData = this.f13124d;
        String instanceId = impressionData != null ? impressionData.getInstanceId() : null;
        return instanceId == null ? "" : instanceId;
    }

    public final String getInstanceName() {
        ImpressionData impressionData = this.f13124d;
        String instanceName = impressionData != null ? impressionData.getInstanceName() : null;
        return instanceName == null ? "" : instanceName;
    }

    public final String getPlacementName() {
        String str = this.f13127g;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        String strM8185c;
        C3013cn c3013cn = this.f13125e;
        if (c3013cn != null && (strM8185c = c3013cn.m8185c()) != null) {
            return strM8185c;
        }
        ImpressionData impressionData = this.f13124d;
        String precision = impressionData != null ? impressionData.getPrecision() : null;
        return precision == null ? "" : precision;
    }

    public final double getRevenue() {
        C3013cn c3013cn = this.f13125e;
        if (c3013cn != null) {
            return c3013cn.m8186d();
        }
        ImpressionData impressionData = this.f13124d;
        Double revenue = impressionData != null ? impressionData.getRevenue() : null;
        if (revenue != null) {
            return revenue.doubleValue();
        }
        return 0.0d;
    }

    public final String getSegmentName() {
        ImpressionData impressionData = this.f13124d;
        String segmentName = impressionData != null ? impressionData.getSegmentName() : null;
        return segmentName == null ? "" : segmentName;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(this.f13121a.hashCode() * 31, 31, this.f13122b), 31, this.f13123c);
        ImpressionData impressionData = this.f13124d;
        int iHashCode = (iOooO0O0 + (impressionData == null ? 0 : impressionData.hashCode())) * 31;
        C3013cn c3013cn = this.f13125e;
        int iHashCode2 = (iHashCode + (c3013cn == null ? 0 : c3013cn.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f13126f;
        int iHashCode3 = (iHashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f13127g;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f13126f + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    public LevelPlayAdInfo(String adId, String adUnitId, String adFormat, ImpressionData impressionData, C3013cn c3013cn, LevelPlayAdSize levelPlayAdSize, String str) {
        OooOo.OooO0o0(adId, "adId");
        OooOo.OooO0o0(adUnitId, "adUnitId");
        OooOo.OooO0o0(adFormat, "adFormat");
        this.f13121a = adId;
        this.f13122b = adUnitId;
        this.f13123c = adFormat;
        this.f13124d = impressionData;
        this.f13125e = c3013cn;
        this.f13126f = levelPlayAdSize;
        this.f13127g = str;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, ImpressionData impressionData, C3013cn c3013cn, LevelPlayAdSize levelPlayAdSize, String str4, int i, OooOO0O oooOO0O) {
        this(str, str2, str3, (i & 8) != 0 ? null : impressionData, (i & 16) != 0 ? null : c3013cn, (i & 32) != 0 ? null : levelPlayAdSize, (i & 64) != 0 ? null : str4);
    }
}
