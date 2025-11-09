package com.android.billingclient.api;

import android.text.TextUtils;
import com.ironsource.C3034d9;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15554OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f15555OooO0O0;

    public SkuDetails(String str) throws JSONException {
        this.f15554OooO00o = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f15555OooO0O0 = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f15554OooO00o, ((SkuDetails) obj).f15554OooO00o);
        }
        return false;
    }

    public String getDescription() {
        return this.f15555OooO0O0.optString("description");
    }

    public String getFreeTrialPeriod() {
        return this.f15555OooO0O0.optString("freeTrialPeriod");
    }

    public String getIconUrl() {
        return this.f15555OooO0O0.optString("iconUrl");
    }

    public String getIntroductoryPrice() {
        return this.f15555OooO0O0.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.f15555OooO0O0.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.f15555OooO0O0.optInt("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod() {
        return this.f15555OooO0O0.optString("introductoryPricePeriod");
    }

    public String getOriginalJson() {
        return this.f15554OooO00o;
    }

    public String getOriginalPrice() {
        JSONObject jSONObject = this.f15555OooO0O0;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        JSONObject jSONObject = this.f15555OooO0O0;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : getPriceAmountMicros();
    }

    public String getPrice() {
        return this.f15555OooO0O0.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.f15555OooO0O0.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.f15555OooO0O0.optString("price_currency_code");
    }

    public String getSku() {
        return this.f15555OooO0O0.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    public String getSubscriptionPeriod() {
        return this.f15555OooO0O0.optString("subscriptionPeriod");
    }

    public String getTitle() {
        return this.f15555OooO0O0.optString(C3034d9.h.f8063D0);
    }

    public String getType() {
        return this.f15555OooO0O0.optString("type");
    }

    public int hashCode() {
        return this.f15554OooO00o.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f15554OooO00o));
    }

    public int zza() {
        return this.f15555OooO0O0.optInt("offer_type");
    }

    public String zzb() {
        return this.f15555OooO0O0.optString("offer_id");
    }

    public String zzc() {
        JSONObject jSONObject = this.f15555OooO0O0;
        String strOptString = jSONObject.optString("offerIdToken");
        return strOptString.isEmpty() ? jSONObject.optString("offer_id_token") : strOptString;
    }

    public final String zzd() {
        return this.f15555OooO0O0.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public String zze() {
        return this.f15555OooO0O0.optString("serializedDocid");
    }
}
