package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LevelPlayImpressionData {
    public static final C4202a Companion = new C4202a(null);
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a */
    private final JSONObject f13159a;

    /* renamed from: b */
    private final DecimalFormat f13160b;

    /* renamed from: com.unity3d.mediation.impression.LevelPlayImpressionData$a */
    public static final class C4202a {
        private C4202a() {
        }

        public /* synthetic */ C4202a(OooOO0O oooOO0O) {
            this();
        }
    }

    public LevelPlayImpressionData(JSONObject allData) {
        OooOo.OooO0o0(allData, "allData");
        this.f13159a = allData;
        this.f13160b = new DecimalFormat("#.#####");
    }

    public final String getAb() {
        String it = this.f13159a.optString("ab", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdFormat() {
        String it = this.f13159a.optString("adFormat", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdNetwork() {
        String it = this.f13159a.optString("adNetwork", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final JSONObject getAllData() {
        return this.f13159a;
    }

    public final String getAuctionId() {
        String it = this.f13159a.optString("auctionId", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCountry() {
        String it = this.f13159a.optString("country", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCreativeId() {
        String it = this.f13159a.optString("creativeId", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getEncryptedCPM() {
        String it = this.f13159a.optString("encryptedCPM", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceId() {
        String it = this.f13159a.optString("instanceId", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceName() {
        String it = this.f13159a.optString("instanceName", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitId() {
        String it = this.f13159a.optString("mediationAdUnitId", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitName() {
        String it = this.f13159a.optString("mediationAdUnitName", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPlacement() {
        String it = this.f13159a.optString("placement", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPrecision() {
        String it = this.f13159a.optString("precision", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final Double getRevenue() {
        double dOptDouble = this.f13159a.optDouble("revenue");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Double.isNaN(dOptDouble)) {
            return null;
        }
        return dValueOf;
    }

    public final String getSegmentName() {
        String it = this.f13159a.optString("segmentName", "");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("auctionId: '");
        sb.append(getAuctionId());
        sb.append("', mediationAdUnitName: '");
        sb.append(getMediationAdUnitName());
        sb.append("', mediationAdUnitId: '");
        sb.append(getMediationAdUnitId());
        sb.append("', adFormat: '");
        sb.append(getAdFormat());
        sb.append("', country: '");
        sb.append(getCountry());
        sb.append("', ab: '");
        sb.append(getAb());
        sb.append("', segmentName: '");
        sb.append(getSegmentName());
        sb.append("', placement: '");
        sb.append(getPlacement());
        sb.append("', adNetwork: '");
        sb.append(getAdNetwork());
        sb.append("', instanceName: '");
        sb.append(getInstanceName());
        sb.append("', instanceId: '");
        sb.append(getInstanceId());
        sb.append("', revenue: ");
        sb.append(getRevenue() == null ? null : this.f13160b.format(getRevenue()));
        sb.append(", precision: '");
        sb.append(getPrecision());
        sb.append("', encryptedCPM: '");
        sb.append(getEncryptedCPM());
        sb.append("', creativeId: '");
        sb.append(getCreativeId());
        sb.append('\'');
        return sb.toString();
    }
}
