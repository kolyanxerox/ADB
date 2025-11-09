package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.GetBillingConfigParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.ironsource.C3912zo;
import io.flutter.Log;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
class MethodCallHandlerImpl implements Application.ActivityLifecycleCallbacks, Messages.InAppPurchaseApi {

    @VisibleForTesting
    static final String ACTIVITY_UNAVAILABLE = "ACTIVITY_UNAVAILABLE";
    private static final String LOAD_PRODUCT_DOC_URL = "https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale";

    @VisibleForTesting
    static final Messages.PlatformReplacementMode REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = Messages.PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE;
    private static final String TAG = "InAppPurchasePlugin";

    @Nullable
    private Activity activity;
    private final Context applicationContext;

    @Nullable
    private BillingClient billingClient;
    private final BillingClientFactory billingClientFactory;
    private final HashMap<String, ProductDetails> cachedProducts = new HashMap<>();
    final Messages.InAppPurchaseCallbackApi callbackApi;

    /* renamed from: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$1 */
    public class C44741 implements BillingClientStateListener {
        private boolean alreadyFinished = false;
        final /* synthetic */ Long val$handle;
        final /* synthetic */ Messages.Result val$result;

        /* renamed from: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$1$1 */
        public class AnonymousClass1 implements Messages.VoidResult {
            public AnonymousClass1() {
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void error(@NonNull Throwable th) {
                Log.m13459e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + th);
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void success() {
            }
        }

        public C44741(Messages.Result result, Long l) {
            result = result;
            l = l;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            MethodCallHandlerImpl.this.callbackApi.onBillingServiceDisconnected(l, new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl.1.1
                public AnonymousClass1() {
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                public void error(@NonNull Throwable th) {
                    Log.m13459e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + th);
                }

                @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                public void success() {
                }
            });
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
            if (this.alreadyFinished) {
                android.util.Log.d(MethodCallHandlerImpl.TAG, "Tried to call onBillingSetupFinished multiple times.");
            } else {
                this.alreadyFinished = true;
                result.success(Translator.fromBillingResult(billingResult));
            }
        }
    }

    public MethodCallHandlerImpl(@Nullable Activity activity, @NonNull Context context, @NonNull Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, @NonNull BillingClientFactory billingClientFactory) {
        this.billingClientFactory = billingClientFactory;
        this.applicationContext = context;
        this.activity = activity;
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    private void endBillingClientConnection() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.endConnection();
            this.billingClient = null;
        }
    }

    @NonNull
    private Messages.FlutterError getNullBillingClientError() {
        return new Messages.FlutterError("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    public static /* synthetic */ void lambda$acknowledgePurchase$8(Messages.Result result, BillingResult billingResult) {
        result.success(Translator.fromBillingResult(billingResult));
    }

    public static /* synthetic */ void lambda$consumeAsync$5(Messages.Result result, BillingResult billingResult, String str) {
        result.success(Translator.fromBillingResult(billingResult));
    }

    public static /* synthetic */ void lambda$createAlternativeBillingOnlyReportingDetailsAsync$1(Messages.Result result, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        result.success(Translator.fromAlternativeBillingOnlyReportingDetails(billingResult, alternativeBillingOnlyReportingDetails));
    }

    public static /* synthetic */ void lambda$getBillingConfigAsync$3(Messages.Result result, BillingResult billingResult, BillingConfig billingConfig) {
        result.success(Translator.fromBillingConfig(billingResult, billingConfig));
    }

    public static /* synthetic */ void lambda$isAlternativeBillingOnlyAvailableAsync$2(Messages.Result result, BillingResult billingResult) {
        result.success(Translator.fromBillingResult(billingResult));
    }

    public /* synthetic */ void lambda$queryProductDetailsAsync$4(Messages.Result result, BillingResult billingResult, List list) {
        updateCachedProducts(list);
        result.success(new Messages.PlatformProductDetailsResponse.Builder().setBillingResult(Translator.fromBillingResult(billingResult)).setProductDetails(Translator.fromProductDetailsList(list)).build());
    }

    public static /* synthetic */ void lambda$queryPurchaseHistoryAsync$7(Messages.Result result, BillingResult billingResult, List list) {
        result.success(new Messages.PlatformPurchaseHistoryResponse.Builder().setBillingResult(Translator.fromBillingResult(billingResult)).setPurchases(Translator.fromPurchaseHistoryRecordList(list)).build());
    }

    public static /* synthetic */ void lambda$queryPurchasesAsync$6(Messages.Result result, BillingResult billingResult, List list) {
        result.success(new Messages.PlatformPurchasesResponse.Builder().setBillingResult(Translator.fromBillingResult(billingResult)).setPurchases(Translator.fromPurchasesList(list)).build());
    }

    public static /* synthetic */ void lambda$showAlternativeBillingOnlyInformationDialog$0(Messages.Result result, BillingResult billingResult) {
        result.success(Translator.fromBillingResult(billingResult));
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void acknowledgePurchase(@NonNull String str, @NonNull Messages.Result<Messages.PlatformBillingResult> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str).build(), new OooO0o(result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void consumeAsync(@NonNull String str, @NonNull Messages.Result<Messages.PlatformBillingResult> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            OooO0o oooO0o = new OooO0o(result);
            this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str).build(), oooO0o);
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull Messages.Result<Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse> result) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new OooO0o(result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void endConnection() {
        endBillingClientConnection();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void getBillingConfigAsync(@NonNull Messages.Result<Messages.PlatformBillingConfigResponse> result) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            billingClient.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new OooO0o(result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void isAlternativeBillingOnlyAvailableAsync(@NonNull Messages.Result<Messages.PlatformBillingResult> result) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            billingClient.isAlternativeBillingOnlyAvailableAsync(new OooO0o(result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    @NonNull
    public Boolean isFeatureSupported(@NonNull Messages.PlatformBillingClientFeature platformBillingClientFeature) {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            return Boolean.valueOf(billingClient.isFeatureSupported(Translator.toBillingClientFeature(platformBillingClientFeature)).getResponseCode() == 0);
        }
        throw getNullBillingClientError();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    @NonNull
    public Boolean isReady() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            return Boolean.valueOf(billingClient.isReady());
        }
        throw getNullBillingClientError();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    @NonNull
    public Messages.PlatformBillingResult launchBillingFlow(@NonNull Messages.PlatformBillingFlowParams platformBillingFlowParams) {
        if (this.billingClient == null) {
            throw getNullBillingClientError();
        }
        ProductDetails productDetails = this.cachedProducts.get(platformBillingFlowParams.getProduct());
        if (productDetails == null) {
            throw new Messages.FlutterError("NOT_FOUND", "Details for product " + platformBillingFlowParams.getProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails != null) {
            for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 : subscriptionOfferDetails) {
                if (platformBillingFlowParams.getOfferToken() == null || !platformBillingFlowParams.getOfferToken().equals(subscriptionOfferDetails2.getOfferToken())) {
                }
            }
            throw new Messages.FlutterError("INVALID_OFFER_TOKEN", "Offer token " + platformBillingFlowParams.getOfferToken() + " for product " + platformBillingFlowParams.getProduct() + " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        if (platformBillingFlowParams.getOldProduct() == null && platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY) {
            throw new Messages.FlutterError("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (platformBillingFlowParams.getOldProduct() != null && !this.cachedProducts.containsKey(platformBillingFlowParams.getOldProduct())) {
            throw new Messages.FlutterError("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", "Details for product " + platformBillingFlowParams.getOldProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        if (this.activity == null) {
            throw new Messages.FlutterError(ACTIVITY_UNAVAILABLE, "Details for product " + platformBillingFlowParams.getProduct() + " are not available. This method must be run with the app in foreground.", null);
        }
        BillingFlowParams.ProductDetailsParams.Builder builderNewBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
        builderNewBuilder.setProductDetails(productDetails);
        if (platformBillingFlowParams.getOfferToken() != null) {
            builderNewBuilder.setOfferToken(platformBillingFlowParams.getOfferToken());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(builderNewBuilder.build());
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList);
        if (platformBillingFlowParams.getAccountId() != null && !platformBillingFlowParams.getAccountId().isEmpty()) {
            productDetailsParamsList.setObfuscatedAccountId(platformBillingFlowParams.getAccountId());
        }
        if (platformBillingFlowParams.getObfuscatedProfileId() != null && !platformBillingFlowParams.getObfuscatedProfileId().isEmpty()) {
            productDetailsParamsList.setObfuscatedProfileId(platformBillingFlowParams.getObfuscatedProfileId());
        }
        BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder2 = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
        if (platformBillingFlowParams.getOldProduct() != null && !platformBillingFlowParams.getOldProduct().isEmpty() && platformBillingFlowParams.getPurchaseToken() != null) {
            builderNewBuilder2.setOldPurchaseToken(platformBillingFlowParams.getPurchaseToken());
            if (platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY) {
                builderNewBuilder2.setSubscriptionReplacementMode(Translator.toReplacementMode(platformBillingFlowParams.getReplacementMode()));
            }
            productDetailsParamsList.setSubscriptionUpdateParams(builderNewBuilder2.build());
        }
        return Translator.fromBillingResult(this.billingClient.launchBillingFlow(this.activity, productDetailsParamsList.build()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        Context context;
        if (this.activity != activity || (context = this.applicationContext) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        endBillingClientConnection();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
    }

    public void onDetachedFromActivity() {
        endBillingClientConnection();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void queryProductDetailsAsync(@NonNull List<Messages.PlatformQueryProduct> list, @NonNull Messages.Result<Messages.PlatformProductDetailsResponse> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(Translator.toProductList(list)).build(), new OooO00o(this, result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    @Deprecated
    public void queryPurchaseHistoryAsync(@NonNull Messages.PlatformProductType platformProductType, @NonNull Messages.Result<Messages.PlatformPurchaseHistoryResponse> result) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            billingClient.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(Translator.toProductTypeString(platformProductType)).build(), new OooO0o(result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void queryPurchasesAsync(@NonNull Messages.PlatformProductType platformProductType, @NonNull Messages.Result<Messages.PlatformPurchasesResponse> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
            builderNewBuilder.setProductType(Translator.toProductTypeString(platformProductType));
            this.billingClient.queryPurchasesAsync(builderNewBuilder.build(), new OooO0o(result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    public void setActivity(@Nullable Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void showAlternativeBillingOnlyInformationDialog(@NonNull Messages.Result<Messages.PlatformBillingResult> result) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        Activity activity = this.activity;
        if (activity == null) {
            result.error(new Messages.FlutterError(ACTIVITY_UNAVAILABLE, "Not attempting to show dialog", null));
            return;
        }
        try {
            billingClient.showAlternativeBillingOnlyInformationDialog(activity, new OooO0o(result));
        } catch (RuntimeException e) {
            result.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void startConnection(@NonNull Long l, @NonNull Messages.PlatformBillingChoiceMode platformBillingChoiceMode, @NonNull Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams, @NonNull Messages.Result<Messages.PlatformBillingResult> result) {
        if (this.billingClient == null) {
            this.billingClient = this.billingClientFactory.createBillingClient(this.applicationContext, this.callbackApi, platformBillingChoiceMode, platformPendingPurchasesParams);
        }
        try {
            this.billingClient.startConnection(new BillingClientStateListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl.1
                private boolean alreadyFinished = false;
                final /* synthetic */ Long val$handle;
                final /* synthetic */ Messages.Result val$result;

                /* renamed from: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$1$1 */
                public class AnonymousClass1 implements Messages.VoidResult {
                    public AnonymousClass1() {
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                    public void error(@NonNull Throwable th) {
                        Log.m13459e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + th);
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                    public void success() {
                    }
                }

                public C44741(Messages.Result result2, Long l2) {
                    result = result2;
                    l = l2;
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    MethodCallHandlerImpl.this.callbackApi.onBillingServiceDisconnected(l, new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl.1.1
                        public AnonymousClass1() {
                        }

                        @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                        public void error(@NonNull Throwable th) {
                            Log.m13459e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + th);
                        }

                        @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                        public void success() {
                        }
                    });
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                    if (this.alreadyFinished) {
                        android.util.Log.d(MethodCallHandlerImpl.TAG, "Tried to call onBillingSetupFinished multiple times.");
                    } else {
                        this.alreadyFinished = true;
                        result.success(Translator.fromBillingResult(billingResult));
                    }
                }
            });
        } catch (RuntimeException e) {
            result2.error(new Messages.FlutterError(C3912zo.a.f13038g, e.getMessage(), android.util.Log.getStackTraceString(e)));
        }
    }

    public void updateCachedProducts(@Nullable List<ProductDetails> list) {
        if (list == null) {
            return;
        }
        for (ProductDetails productDetails : list) {
            this.cachedProducts.put(productDetails.getProductId(), productDetails);
        }
    }
}
