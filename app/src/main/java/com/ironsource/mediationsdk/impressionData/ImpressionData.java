package com.ironsource.mediationsdk.impressionData;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.logger.IronLog;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a */
    private JSONObject f9840a;

    /* renamed from: b */
    private String f9841b;

    /* renamed from: c */
    private String f9842c;

    /* renamed from: d */
    private String f9843d;

    /* renamed from: e */
    private String f9844e;

    /* renamed from: f */
    private String f9845f;

    /* renamed from: g */
    private String f9846g;

    /* renamed from: h */
    private String f9847h;

    /* renamed from: i */
    private String f9848i;

    /* renamed from: j */
    private String f9849j;

    /* renamed from: k */
    private String f9850k;

    /* renamed from: l */
    private String f9851l;

    /* renamed from: m */
    private String f9852m;

    /* renamed from: n */
    private Double f9853n;

    /* renamed from: o */
    private String f9854o;

    /* renamed from: p */
    private Double f9855p;

    /* renamed from: q */
    private String f9856q;

    /* renamed from: r */
    private String f9857r;

    /* renamed from: s */
    private DecimalFormat f9858s = new DecimalFormat("#.#####");

    public ImpressionData(ImpressionData impressionData) {
        this.f9841b = null;
        this.f9842c = null;
        this.f9843d = null;
        this.f9844e = null;
        this.f9845f = null;
        this.f9846g = null;
        this.f9847h = null;
        this.f9848i = null;
        this.f9849j = null;
        this.f9850k = null;
        this.f9851l = null;
        this.f9852m = null;
        this.f9853n = null;
        this.f9854o = null;
        this.f9855p = null;
        this.f9856q = null;
        this.f9857r = null;
        this.f9840a = impressionData.f9840a;
        this.f9841b = impressionData.f9841b;
        this.f9842c = impressionData.f9842c;
        this.f9843d = impressionData.f9843d;
        this.f9844e = impressionData.f9844e;
        this.f9845f = impressionData.f9845f;
        this.f9846g = impressionData.f9846g;
        this.f9847h = impressionData.f9847h;
        this.f9848i = impressionData.f9848i;
        this.f9849j = impressionData.f9849j;
        this.f9850k = impressionData.f9850k;
        this.f9851l = impressionData.f9851l;
        this.f9852m = impressionData.f9852m;
        this.f9854o = impressionData.f9854o;
        this.f9856q = impressionData.f9856q;
        this.f9855p = impressionData.f9855p;
        this.f9853n = impressionData.f9853n;
        this.f9857r = impressionData.f9857r;
    }

    public String getAb() {
        return this.f9847h;
    }

    public String getAdFormat() {
        return this.f9845f;
    }

    public String getAdNetwork() {
        return this.f9850k;
    }

    @Deprecated
    public String getAdUnit() {
        return this.f9842c;
    }

    public JSONObject getAllData() {
        return this.f9840a;
    }

    public String getAuctionId() {
        return this.f9841b;
    }

    public String getCountry() {
        return this.f9846g;
    }

    public String getCreativeId() {
        return this.f9857r;
    }

    public String getEncryptedCPM() {
        return this.f9856q;
    }

    public String getInstanceId() {
        return this.f9852m;
    }

    public String getInstanceName() {
        return this.f9851l;
    }

    @Deprecated
    public Double getLifetimeRevenue() {
        return this.f9855p;
    }

    public String getMediationAdUnitId() {
        return this.f9844e;
    }

    public String getMediationAdUnitName() {
        return this.f9843d;
    }

    public String getPlacement() {
        return this.f9849j;
    }

    public String getPrecision() {
        return this.f9854o;
    }

    public Double getRevenue() {
        return this.f9853n;
    }

    public String getSegmentName() {
        return this.f9848i;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) throws JSONException {
        String str3 = this.f9849j;
        if (str3 != null) {
            String strReplace = str3.replace(str, str2);
            this.f9849j = strReplace;
            JSONObject jSONObject = this.f9840a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", strReplace);
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("auctionId: '");
        sb.append(this.f9841b);
        sb.append("', adUnit: '");
        sb.append(this.f9842c);
        sb.append("', mediationAdUnitName: '");
        sb.append(this.f9843d);
        sb.append("', mediationAdUnitId: '");
        sb.append(this.f9844e);
        sb.append("', adFormat: '");
        sb.append(this.f9845f);
        sb.append("', country: '");
        sb.append(this.f9846g);
        sb.append("', ab: '");
        sb.append(this.f9847h);
        sb.append("', segmentName: '");
        sb.append(this.f9848i);
        sb.append("', placement: '");
        sb.append(this.f9849j);
        sb.append("', adNetwork: '");
        sb.append(this.f9850k);
        sb.append("', instanceName: '");
        sb.append(this.f9851l);
        sb.append("', instanceId: '");
        sb.append(this.f9852m);
        sb.append("', revenue: ");
        Double d = this.f9853n;
        sb.append(d == null ? null : this.f9858s.format(d));
        sb.append(", precision: '");
        sb.append(this.f9854o);
        sb.append("', lifetimeRevenue: ");
        Double d2 = this.f9855p;
        sb.append(d2 != null ? this.f9858s.format(d2) : null);
        sb.append(", encryptedCPM: '");
        sb.append(this.f9856q);
        sb.append("', creativeId: '");
        return OooO00o.OooO0oO('\'', this.f9857r, sb);
    }

    public ImpressionData(JSONObject jSONObject) {
        Double dValueOf = null;
        this.f9841b = null;
        this.f9842c = null;
        this.f9843d = null;
        this.f9844e = null;
        this.f9845f = null;
        this.f9846g = null;
        this.f9847h = null;
        this.f9848i = null;
        this.f9849j = null;
        this.f9850k = null;
        this.f9851l = null;
        this.f9852m = null;
        this.f9853n = null;
        this.f9854o = null;
        this.f9855p = null;
        this.f9856q = null;
        this.f9857r = null;
        if (jSONObject != null) {
            try {
                this.f9840a = jSONObject;
                this.f9841b = jSONObject.optString("auctionId", null);
                this.f9842c = jSONObject.optString("adUnit", null);
                this.f9843d = jSONObject.optString("mediationAdUnitName", null);
                this.f9844e = jSONObject.optString("mediationAdUnitId", null);
                this.f9845f = jSONObject.optString("adFormat", null);
                this.f9846g = jSONObject.optString("country", null);
                this.f9847h = jSONObject.optString("ab", null);
                this.f9848i = jSONObject.optString("segmentName", null);
                this.f9849j = jSONObject.optString("placement", null);
                this.f9850k = jSONObject.optString("adNetwork", null);
                this.f9851l = jSONObject.optString("instanceName", null);
                this.f9852m = jSONObject.optString("instanceId", null);
                this.f9854o = jSONObject.optString("precision", null);
                this.f9856q = jSONObject.optString("encryptedCPM", null);
                this.f9857r = jSONObject.optString("creativeId", null);
                double dOptDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f9855p = Double.isNaN(dOptDouble) ? null : Double.valueOf(dOptDouble);
                double dOptDouble2 = jSONObject.optDouble("revenue");
                if (!Double.isNaN(dOptDouble2)) {
                    dValueOf = Double.valueOf(dOptDouble2);
                }
                this.f9853n = dValueOf;
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("error parsing impression " + e.getMessage());
            }
        }
    }
}
