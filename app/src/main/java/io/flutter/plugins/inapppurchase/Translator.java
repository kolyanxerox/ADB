package io.flutter.plugins.inapppurchase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.UserChoiceDetails;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class Translator {

    /* renamed from: io.flutter.plugins.inapppurchase.Translator$1 */
    public static /* synthetic */ class C44771 {

        /* renamed from: $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature */
        static final /* synthetic */ int[] f13220xa827a2aa;

        /* renamed from: $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType */
        static final /* synthetic */ int[] f13221x446906cf;

        /* renamed from: $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode */
        static final /* synthetic */ int[] f13222x5e0d75db;

        static {
            int[] iArr = new int[Messages.PlatformReplacementMode.values().length];
            f13222x5e0d75db = iArr;
            try {
                iArr[Messages.PlatformReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13222x5e0d75db[Messages.PlatformReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13222x5e0d75db[Messages.PlatformReplacementMode.DEFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13222x5e0d75db[Messages.PlatformReplacementMode.WITHOUT_PRORATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13222x5e0d75db[Messages.PlatformReplacementMode.WITH_TIME_PRORATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13222x5e0d75db[Messages.PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Messages.PlatformBillingClientFeature.values().length];
            f13220xa827a2aa = iArr2;
            try {
                iArr2[Messages.PlatformBillingClientFeature.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13220xa827a2aa[Messages.PlatformBillingClientFeature.BILLING_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13220xa827a2aa[Messages.PlatformBillingClientFeature.EXTERNAL_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13220xa827a2aa[Messages.PlatformBillingClientFeature.IN_APP_MESSAGING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13220xa827a2aa[Messages.PlatformBillingClientFeature.PRICE_CHANGE_CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13220xa827a2aa[Messages.PlatformBillingClientFeature.PRODUCT_DETAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13220xa827a2aa[Messages.PlatformBillingClientFeature.SUBSCRIPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13220xa827a2aa[Messages.PlatformBillingClientFeature.SUBSCRIPTIONS_UPDATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[Messages.PlatformProductType.values().length];
            f13221x446906cf = iArr3;
            try {
                iArr3[Messages.PlatformProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13221x446906cf[Messages.PlatformProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static String currencySymbolFromCode(String str) {
        return Currency.getInstance(str).getSymbol();
    }

    @NonNull
    public static Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse fromAlternativeBillingOnlyReportingDetails(@NonNull BillingResult billingResult, @Nullable AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        return new Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse.Builder().setBillingResult(fromBillingResult(billingResult)).setExternalTransactionToken(alternativeBillingOnlyReportingDetails == null ? "" : alternativeBillingOnlyReportingDetails.getExternalTransactionToken()).build();
    }

    @NonNull
    public static Messages.PlatformBillingConfigResponse fromBillingConfig(@NonNull BillingResult billingResult, @Nullable BillingConfig billingConfig) {
        return new Messages.PlatformBillingConfigResponse.Builder().setBillingResult(fromBillingResult(billingResult)).setCountryCode(billingConfig == null ? "" : billingConfig.getCountryCode()).build();
    }

    @NonNull
    public static Messages.PlatformBillingResponse fromBillingResponseCode(int i) {
        if (i == 12) {
            return Messages.PlatformBillingResponse.NETWORK_ERROR;
        }
        switch (i) {
            case -2:
                return Messages.PlatformBillingResponse.FEATURE_NOT_SUPPORTED;
            case -1:
                return Messages.PlatformBillingResponse.SERVICE_DISCONNECTED;
            case 0:
                return Messages.PlatformBillingResponse.OK;
            case 1:
                return Messages.PlatformBillingResponse.USER_CANCELED;
            case 2:
                return Messages.PlatformBillingResponse.SERVICE_UNAVAILABLE;
            case 3:
                return Messages.PlatformBillingResponse.BILLING_UNAVAILABLE;
            case 4:
                return Messages.PlatformBillingResponse.ITEM_UNAVAILABLE;
            case 5:
                return Messages.PlatformBillingResponse.DEVELOPER_ERROR;
            case 6:
                return Messages.PlatformBillingResponse.ERROR;
            case 7:
                return Messages.PlatformBillingResponse.ITEM_ALREADY_OWNED;
            case 8:
                return Messages.PlatformBillingResponse.ITEM_NOT_OWNED;
            default:
                return Messages.PlatformBillingResponse.ERROR;
        }
    }

    @NonNull
    public static Messages.PlatformBillingResult fromBillingResult(@NonNull BillingResult billingResult) {
        return new Messages.PlatformBillingResult.Builder().setResponseCode(fromBillingResponseCode(billingResult.getResponseCode())).setDebugMessage(billingResult.getDebugMessage()).build();
    }

    @Nullable
    public static Messages.PlatformInstallmentPlanDetails fromInstallmentPlanDetails(@Nullable ProductDetails.InstallmentPlanDetails installmentPlanDetails) {
        if (installmentPlanDetails == null) {
            return null;
        }
        return new Messages.PlatformInstallmentPlanDetails.Builder().setCommitmentPaymentsCount(Long.valueOf(installmentPlanDetails.getInstallmentPlanCommitmentPaymentsCount())).setSubsequentCommitmentPaymentsCount(Long.valueOf(installmentPlanDetails.getSubsequentInstallmentPlanCommitmentPaymentsCount())).build();
    }

    @Nullable
    public static Messages.PlatformOneTimePurchaseOfferDetails fromOneTimePurchaseOfferDetails(@Nullable ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        if (oneTimePurchaseOfferDetails == null) {
            return null;
        }
        return new Messages.PlatformOneTimePurchaseOfferDetails.Builder().setPriceAmountMicros(Long.valueOf(oneTimePurchaseOfferDetails.getPriceAmountMicros())).setPriceCurrencyCode(oneTimePurchaseOfferDetails.getPriceCurrencyCode()).setFormattedPrice(oneTimePurchaseOfferDetails.getFormattedPrice()).build();
    }

    @Nullable
    public static Messages.PlatformPendingPurchaseUpdate fromPendingPurchaseUpdate(@Nullable Purchase.PendingPurchaseUpdate pendingPurchaseUpdate) {
        if (pendingPurchaseUpdate == null) {
            return null;
        }
        return new Messages.PlatformPendingPurchaseUpdate.Builder().setPurchaseToken(pendingPurchaseUpdate.getPurchaseToken()).setProducts(pendingPurchaseUpdate.getProducts()).build();
    }

    @NonNull
    public static Messages.PlatformPricingPhase fromPricingPhase(@NonNull ProductDetails.PricingPhase pricingPhase) {
        return new Messages.PlatformPricingPhase.Builder().setFormattedPrice(pricingPhase.getFormattedPrice()).setPriceCurrencyCode(pricingPhase.getPriceCurrencyCode()).setPriceAmountMicros(Long.valueOf(pricingPhase.getPriceAmountMicros())).setBillingCycleCount(Long.valueOf(pricingPhase.getBillingCycleCount())).setBillingPeriod(pricingPhase.getBillingPeriod()).setRecurrenceMode(toPlatformRecurrenceMode(pricingPhase.getRecurrenceMode())).build();
    }

    @NonNull
    public static List<Messages.PlatformPricingPhase> fromPricingPhases(@NonNull ProductDetails.PricingPhases pricingPhases) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProductDetails.PricingPhase> it = pricingPhases.getPricingPhaseList().iterator();
        while (it.hasNext()) {
            arrayList.add(fromPricingPhase(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformProductDetails fromProductDetail(@NonNull ProductDetails productDetails) {
        return new Messages.PlatformProductDetails.Builder().setTitle(productDetails.getTitle()).setDescription(productDetails.getDescription()).setProductId(productDetails.getProductId()).setProductType(toPlatformProductType(productDetails.getProductType())).setName(productDetails.getName()).setOneTimePurchaseOfferDetails(fromOneTimePurchaseOfferDetails(productDetails.getOneTimePurchaseOfferDetails())).setSubscriptionOfferDetails(fromSubscriptionOfferDetailsList(productDetails.getSubscriptionOfferDetails())).build();
    }

    @NonNull
    public static List<Messages.PlatformProductDetails> fromProductDetailsList(@Nullable List<ProductDetails> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ProductDetails> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromProductDetail(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformPurchase fromPurchase(@NonNull Purchase purchase) {
        Messages.PlatformPurchase.Builder quantity = new Messages.PlatformPurchase.Builder().setOrderId(purchase.getOrderId()).setPackageName(purchase.getPackageName()).setPurchaseTime(Long.valueOf(purchase.getPurchaseTime())).setPurchaseToken(purchase.getPurchaseToken()).setSignature(purchase.getSignature()).setProducts(purchase.getProducts()).setIsAutoRenewing(Boolean.valueOf(purchase.isAutoRenewing())).setOriginalJson(purchase.getOriginalJson()).setDeveloperPayload(purchase.getDeveloperPayload()).setIsAcknowledged(Boolean.valueOf(purchase.isAcknowledged())).setPurchaseState(toPlatformPurchaseState(purchase.getPurchaseState())).setQuantity(Long.valueOf(purchase.getQuantity()));
        AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
        if (accountIdentifiers != null) {
            quantity.setAccountIdentifiers(new Messages.PlatformAccountIdentifiers.Builder().setObfuscatedAccountId(accountIdentifiers.getObfuscatedAccountId()).setObfuscatedProfileId(accountIdentifiers.getObfuscatedProfileId()).build());
        }
        Purchase.PendingPurchaseUpdate pendingPurchaseUpdate = purchase.getPendingPurchaseUpdate();
        if (pendingPurchaseUpdate != null) {
            quantity.setPendingPurchaseUpdate(fromPendingPurchaseUpdate(pendingPurchaseUpdate));
        }
        return quantity.build();
    }

    @NonNull
    public static Messages.PlatformPurchaseHistoryRecord fromPurchaseHistoryRecord(@NonNull PurchaseHistoryRecord purchaseHistoryRecord) {
        return new Messages.PlatformPurchaseHistoryRecord.Builder().setPurchaseTime(Long.valueOf(purchaseHistoryRecord.getPurchaseTime())).setPurchaseToken(purchaseHistoryRecord.getPurchaseToken()).setSignature(purchaseHistoryRecord.getSignature()).setProducts(purchaseHistoryRecord.getProducts()).setDeveloperPayload(purchaseHistoryRecord.getDeveloperPayload()).setOriginalJson(purchaseHistoryRecord.getOriginalJson()).setQuantity(Long.valueOf(purchaseHistoryRecord.getQuantity())).build();
    }

    @NonNull
    public static List<Messages.PlatformPurchaseHistoryRecord> fromPurchaseHistoryRecordList(@Nullable List<PurchaseHistoryRecord> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<PurchaseHistoryRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromPurchaseHistoryRecord(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static List<Messages.PlatformPurchase> fromPurchasesList(@Nullable List<Purchase> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromPurchase(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformSubscriptionOfferDetails fromSubscriptionOfferDetails(@NonNull ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails) {
        return new Messages.PlatformSubscriptionOfferDetails.Builder().setOfferId(subscriptionOfferDetails.getOfferId()).setBasePlanId(subscriptionOfferDetails.getBasePlanId()).setOfferTags(subscriptionOfferDetails.getOfferTags()).setOfferToken(subscriptionOfferDetails.getOfferToken()).setPricingPhases(fromPricingPhases(subscriptionOfferDetails.getPricingPhases())).setInstallmentPlanDetails(fromInstallmentPlanDetails(subscriptionOfferDetails.getInstallmentPlanDetails())).build();
    }

    @Nullable
    public static List<Messages.PlatformSubscriptionOfferDetails> fromSubscriptionOfferDetailsList(@Nullable List<ProductDetails.SubscriptionOfferDetails> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ProductDetails.SubscriptionOfferDetails> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromSubscriptionOfferDetails(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformUserChoiceDetails fromUserChoiceDetails(@NonNull UserChoiceDetails userChoiceDetails) {
        return new Messages.PlatformUserChoiceDetails.Builder().setExternalTransactionToken(userChoiceDetails.getExternalTransactionToken()).setOriginalExternalTransactionId(userChoiceDetails.getOriginalExternalTransactionId()).setProducts(fromUserChoiceProductsList(userChoiceDetails.getProducts())).build();
    }

    @NonNull
    public static Messages.PlatformUserChoiceProduct fromUserChoiceProduct(@NonNull UserChoiceDetails.Product product) {
        return new Messages.PlatformUserChoiceProduct.Builder().setId(product.getId()).setOfferToken(product.getOfferToken()).setType(toPlatformProductType(product.getType())).build();
    }

    @NonNull
    public static List<Messages.PlatformUserChoiceProduct> fromUserChoiceProductsList(@NonNull List<UserChoiceDetails.Product> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UserChoiceDetails.Product> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromUserChoiceProduct(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static String toBillingClientFeature(@NonNull Messages.PlatformBillingClientFeature platformBillingClientFeature) {
        switch (C44771.f13220xa827a2aa[platformBillingClientFeature.ordinal()]) {
            case 1:
                return BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY;
            case 2:
                return BillingClient.FeatureType.BILLING_CONFIG;
            case 3:
                return BillingClient.FeatureType.EXTERNAL_OFFER;
            case 4:
                return BillingClient.FeatureType.IN_APP_MESSAGING;
            case 5:
                return BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION;
            case 6:
                return BillingClient.FeatureType.PRODUCT_DETAILS;
            case 7:
                return BillingClient.FeatureType.SUBSCRIPTIONS;
            case 8:
                return BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE;
            default:
                throw new Messages.FlutterError("UNKNOWN_FEATURE", "Unknown client feature: " + platformBillingClientFeature, null);
        }
    }

    @NonNull
    public static PendingPurchasesParams toPendingPurchasesParams(@Nullable Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
        if (platformPendingPurchasesParams != null && platformPendingPurchasesParams.getEnablePrepaidPlans().booleanValue()) {
            builderEnableOneTimeProducts.enablePrepaidPlans();
        }
        return builderEnableOneTimeProducts.build();
    }

    public static Messages.PlatformProductType toPlatformProductType(@NonNull String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3541555) {
            if (iHashCode == 100343516) {
                str.equals("inapp");
            }
        } else if (str.equals("subs")) {
            return Messages.PlatformProductType.SUBS;
        }
        return Messages.PlatformProductType.INAPP;
    }

    public static Messages.PlatformPurchaseState toPlatformPurchaseState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? Messages.PlatformPurchaseState.UNSPECIFIED : Messages.PlatformPurchaseState.PENDING : Messages.PlatformPurchaseState.PURCHASED : Messages.PlatformPurchaseState.UNSPECIFIED;
    }

    public static Messages.PlatformRecurrenceMode toPlatformRecurrenceMode(int i) {
        return i != 1 ? i != 2 ? i != 3 ? Messages.PlatformRecurrenceMode.NON_RECURRING : Messages.PlatformRecurrenceMode.NON_RECURRING : Messages.PlatformRecurrenceMode.FINITE_RECURRING : Messages.PlatformRecurrenceMode.INFINITE_RECURRING;
    }

    @NonNull
    public static QueryProductDetailsParams.Product toProduct(@NonNull Messages.PlatformQueryProduct platformQueryProduct) {
        return QueryProductDetailsParams.Product.newBuilder().setProductId(platformQueryProduct.getProductId()).setProductType(toProductTypeString(platformQueryProduct.getProductType())).build();
    }

    @NonNull
    public static List<QueryProductDetailsParams.Product> toProductList(@NonNull List<Messages.PlatformQueryProduct> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Messages.PlatformQueryProduct> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toProduct(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static String toProductTypeString(Messages.PlatformProductType platformProductType) {
        int i = C44771.f13221x446906cf[platformProductType.ordinal()];
        if (i == 1) {
            return "inapp";
        }
        if (i == 2) {
            return "subs";
        }
        throw new Messages.FlutterError("UNKNOWN_TYPE", "Unknown product type: " + platformProductType, null);
    }

    public static int toReplacementMode(@NonNull Messages.PlatformReplacementMode platformReplacementMode) {
        int i = C44771.f13222x5e0d75db[platformReplacementMode.ordinal()];
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 6;
        }
        if (i != 4) {
            return i != 5 ? 0 : 1;
        }
        return 3;
    }
}
