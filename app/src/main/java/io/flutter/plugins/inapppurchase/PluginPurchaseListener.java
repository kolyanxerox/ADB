package io.flutter.plugins.inapppurchase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import io.flutter.Log;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.List;

/* loaded from: classes3.dex */
class PluginPurchaseListener implements PurchasesUpdatedListener {
    private final Messages.InAppPurchaseCallbackApi callbackApi;

    public PluginPurchaseListener(Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
        this.callbackApi.onPurchasesUpdated(new Messages.PlatformPurchasesResponse.Builder().setBillingResult(Translator.fromBillingResult(billingResult)).setPurchases(Translator.fromPurchasesList(list)).build(), new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.PluginPurchaseListener.1
            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void error(@NonNull Throwable th) {
                Log.m13459e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + th);
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void success() {
            }
        });
    }
}
