package io.flutter.plugins.inapppurchase;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingClient;
import io.flutter.plugins.inapppurchase.Messages;

/* loaded from: classes3.dex */
interface BillingClientFactory {
    BillingClient createBillingClient(@NonNull Context context, @NonNull Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, Messages.PlatformBillingChoiceMode platformBillingChoiceMode, Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams);
}
