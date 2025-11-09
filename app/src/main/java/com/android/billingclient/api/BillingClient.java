package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.PendingPurchasesParams;
import com.google.android.gms.internal.play_billing.oOO00O;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;

        /* renamed from: OK */
        public static final int f133OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public volatile PendingPurchasesParams f15369OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final Context f15370OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public volatile PurchasesUpdatedListener f15371OooO0OO;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public volatile UserChoiceBillingListener f15372OooO0Oo;

        /* renamed from: OooO0o, reason: collision with root package name */
        public volatile boolean f15373OooO0o;

        /* renamed from: OooO0o0, reason: collision with root package name */
        public volatile boolean f15374OooO0o0;

        public /* synthetic */ Builder(Context context) {
            this.f15370OooO0O0 = context;
        }

        public final boolean OooO00o() {
            Context context = this.f15370OooO0O0;
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e) {
                oOO00O.OooO("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }

        public BillingClient build() {
            if (this.f15370OooO0O0 == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f15371OooO0OO == null) {
                if (this.f15372OooO0Oo != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (!this.f15374OooO0o0 && !this.f15373OooO0o) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.f15370OooO0O0;
                return OooO00o() ? new OooOOOO(context) : new OooO00o(context);
            }
            if (this.f15369OooO00o == null) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            this.f15369OooO00o.getClass();
            if (this.f15371OooO0OO == null) {
                PendingPurchasesParams pendingPurchasesParams = this.f15369OooO00o;
                Context context2 = this.f15370OooO0O0;
                return OooO00o() ? new OooOOOO(pendingPurchasesParams, context2) : new OooO00o(pendingPurchasesParams, context2);
            }
            if (this.f15372OooO0Oo == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.f15369OooO00o;
                Context context3 = this.f15370OooO0O0;
                PurchasesUpdatedListener purchasesUpdatedListener = this.f15371OooO0OO;
                return OooO00o() ? new OooOOOO(pendingPurchasesParams2, context3, purchasesUpdatedListener) : new OooO00o(pendingPurchasesParams2, context3, purchasesUpdatedListener);
            }
            PendingPurchasesParams pendingPurchasesParams3 = this.f15369OooO00o;
            Context context4 = this.f15370OooO0O0;
            PurchasesUpdatedListener purchasesUpdatedListener2 = this.f15371OooO0OO;
            UserChoiceBillingListener userChoiceBillingListener = this.f15372OooO0Oo;
            return OooO00o() ? new OooOOOO(pendingPurchasesParams3, context4, purchasesUpdatedListener2, userChoiceBillingListener) : new OooO00o(pendingPurchasesParams3, context4, purchasesUpdatedListener2, userChoiceBillingListener);
        }

        public Builder enableAlternativeBillingOnly() {
            this.f15374OooO0o0 = true;
            return this;
        }

        public Builder enableExternalOffer() {
            this.f15373OooO0o = true;
            return this;
        }

        public Builder enablePendingPurchases(PendingPurchasesParams pendingPurchasesParams) {
            this.f15369OooO00o = pendingPurchasesParams;
            return this;
        }

        public Builder enableUserChoiceBilling(UserChoiceBillingListener userChoiceBillingListener) {
            this.f15372OooO0Oo = userChoiceBillingListener;
            return this;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f15371OooO0OO = purchasesUpdatedListener;
            return this;
        }

        @Deprecated
        public Builder enablePendingPurchases() {
            PendingPurchasesParams.Builder builderNewBuilder = PendingPurchasesParams.newBuilder();
            builderNewBuilder.enableOneTimeProducts();
            enablePendingPurchases(builderNewBuilder.build());
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";
        public static final String BILLING_CONFIG = "ggg";
        public static final String EXTERNAL_OFFER = "kkk";
        public static final String IN_APP_MESSAGING = "bbb";
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final String PRODUCT_DETAILS = "fff";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener);

    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    public abstract void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    public abstract void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    public abstract void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    public abstract void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    public abstract BillingResult isFeatureSupported(String str);

    public abstract boolean isReady();

    public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    public abstract BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    public abstract BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
