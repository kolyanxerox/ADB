package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.o000000;
import com.ironsource.C3034d9;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ProductDetails {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f15496OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15497OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f15498OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f15499OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f15500OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f15501OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f15502OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f15503OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f15504OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f15505OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f15506OooOO0O;

    public static final class InstallmentPlanDetails {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final int f15507OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final int f15508OooO0O0;

        public InstallmentPlanDetails(JSONObject jSONObject) {
            this.f15507OooO00o = jSONObject.getInt("commitmentPaymentsCount");
            this.f15508OooO0O0 = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.f15507OooO00o;
        }

        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.f15508OooO0O0;
        }
    }

    public static final class OneTimePurchaseOfferDetails {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final String f15509OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final long f15510OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public final String f15511OooO0OO;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public final String f15512OooO0Oo;

        /* renamed from: OooO0o, reason: collision with root package name */
        public final zzcs f15513OooO0o;

        /* renamed from: OooO0o0, reason: collision with root package name */
        public final String f15514OooO0o0;

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f15509OooO00o = jSONObject.optString("formattedPrice");
            this.f15510OooO0O0 = jSONObject.optLong("priceAmountMicros");
            this.f15511OooO0OO = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            zzcs zzcsVar = null;
            this.f15512OooO0Oo = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            o000000.OooOOOO(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f15514OooO0o0 = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            if (jSONObjectOptJSONObject6 != null) {
                zzcsVar = new zzcs();
                jSONObjectOptJSONObject6.getString("type");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("balanceThresholds");
                ArrayList arrayList2 = new ArrayList();
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i2)));
                    }
                }
                new PricingPhases(jSONObjectOptJSONObject6.getJSONArray("pricingPhases"));
            }
            this.f15513OooO0o = zzcsVar;
        }

        public String getFormattedPrice() {
            return this.f15509OooO00o;
        }

        public long getPriceAmountMicros() {
            return this.f15510OooO0O0;
        }

        public String getPriceCurrencyCode() {
            return this.f15511OooO0OO;
        }

        public final zzcs zza() {
            return this.f15513OooO0o;
        }

        public final String zzb() {
            return this.f15512OooO0Oo;
        }
    }

    public static final class PricingPhase {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final String f15515OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final long f15516OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public final String f15517OooO0OO;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public final String f15518OooO0Oo;

        /* renamed from: OooO0o, reason: collision with root package name */
        public final int f15519OooO0o;

        /* renamed from: OooO0o0, reason: collision with root package name */
        public final int f15520OooO0o0;

        public PricingPhase(JSONObject jSONObject) {
            this.f15518OooO0Oo = jSONObject.optString("billingPeriod");
            this.f15517OooO0OO = jSONObject.optString("priceCurrencyCode");
            this.f15515OooO00o = jSONObject.optString("formattedPrice");
            this.f15516OooO0O0 = jSONObject.optLong("priceAmountMicros");
            this.f15519OooO0o = jSONObject.optInt("recurrenceMode");
            this.f15520OooO0o0 = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.f15520OooO0o0;
        }

        public String getBillingPeriod() {
            return this.f15518OooO0Oo;
        }

        public String getFormattedPrice() {
            return this.f15515OooO00o;
        }

        public long getPriceAmountMicros() {
            return this.f15516OooO0O0;
        }

        public String getPriceCurrencyCode() {
            return this.f15517OooO0OO;
        }

        public int getRecurrenceMode() {
            return this.f15519OooO0o;
        }
    }

    public static class PricingPhases {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f15521OooO00o;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f15521OooO00o = arrayList;
        }

        public List<PricingPhase> getPricingPhaseList() {
            return this.f15521OooO00o;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    public static final class SubscriptionOfferDetails {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final String f15522OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final String f15523OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public final String f15524OooO0OO;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public final PricingPhases f15525OooO0Oo;

        /* renamed from: OooO0o, reason: collision with root package name */
        public final InstallmentPlanDetails f15526OooO0o;

        /* renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f15527OooO0o0;

        public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f15522OooO00o = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f15523OooO0O0 = true == strOptString.isEmpty() ? null : strOptString;
            this.f15524OooO0OO = jSONObject.getString("offerIdToken");
            this.f15525OooO0Oo = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f15526OooO0o = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                jSONObjectOptJSONObject2.optString(C3034d9.h.f8063D0);
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.f15527OooO0o0 = arrayList;
        }

        public String getBasePlanId() {
            return this.f15522OooO00o;
        }

        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f15526OooO0o;
        }

        public String getOfferId() {
            return this.f15523OooO0O0;
        }

        public List<String> getOfferTags() {
            return this.f15527OooO0o0;
        }

        public String getOfferToken() {
            return this.f15524OooO0OO;
        }

        public PricingPhases getPricingPhases() {
            return this.f15525OooO0Oo;
        }
    }

    public ProductDetails(String str) {
        this.f15497OooO00o = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f15498OooO0O0 = jSONObject;
        String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f15499OooO0OO = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f15500OooO0Oo = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f15502OooO0o0 = jSONObject.optString(C3034d9.h.f8063D0);
        this.f15501OooO0o = jSONObject.optString("name");
        this.f15503OooO0oO = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f15504OooO0oo = jSONObject.optString("skuDetailsToken");
        this.f15496OooO = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.f15505OooOO0 = arrayList;
        } else {
            this.f15505OooOO0 = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f15498OooO0O0.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f15498OooO0O0.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.f15506OooOO0O = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f15506OooOO0O = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.f15506OooOO0O = arrayList2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f15497OooO00o, ((ProductDetails) obj).f15497OooO00o);
        }
        return false;
    }

    public String getDescription() {
        return this.f15503OooO0oO;
    }

    public String getName() {
        return this.f15501OooO0o;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        ArrayList arrayList = this.f15506OooOO0O;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) arrayList.get(0);
    }

    public String getProductId() {
        return this.f15499OooO0OO;
    }

    public String getProductType() {
        return this.f15500OooO0Oo;
    }

    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.f15505OooOO0;
    }

    public String getTitle() {
        return this.f15502OooO0o0;
    }

    public int hashCode() {
        return this.f15497OooO00o.hashCode();
    }

    public String toString() {
        String string = this.f15498OooO0O0.toString();
        String strValueOf = String.valueOf(this.f15505OooOO0);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, this.f15497OooO00o, "', parsedJson=", string, ", productId='");
        sb.append(this.f15499OooO0OO);
        sb.append("', productType='");
        sb.append(this.f15500OooO0Oo);
        sb.append("', title='");
        sb.append(this.f15502OooO0o0);
        sb.append("', productDetailsToken='");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO(sb, this.f15504OooO0oo, "', subscriptionOfferDetails=", strValueOf, "}");
    }

    public final String zza() {
        return this.f15498OooO0O0.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public String zzc() {
        return this.f15496OooO;
    }
}
