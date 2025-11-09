package io.flutter.plugins.inapppurchase;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.UserChoiceDetails;
import io.flutter.Log;
import io.flutter.plugins.inapppurchase.Messages;

/* loaded from: classes3.dex */
final class BillingClientFactoryImpl implements BillingClientFactory {

    /* renamed from: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl$1 */
    public class C44621 implements Messages.VoidResult {
        public C44621() {
        }

        @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
        public void error(@NonNull Throwable th) {
            Log.m13459e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + th);
        }

        @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
        public void success() {
        }
    }

    /* renamed from: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl$2 */
    public static /* synthetic */ class C44632 {

        /* renamed from: $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingChoiceMode */
        static final /* synthetic */ int[] f13216x6f7dd45;

        static {
            int[] iArr = new int[Messages.PlatformBillingChoiceMode.values().length];
            f13216x6f7dd45 = iArr;
            try {
                iArr[Messages.PlatformBillingChoiceMode.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13216x6f7dd45[Messages.PlatformBillingChoiceMode.USER_CHOICE_BILLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13216x6f7dd45[Messages.PlatformBillingChoiceMode.PLAY_BILLING_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public /* synthetic */ void lambda$createUserChoiceBillingListener$0(Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, UserChoiceDetails userChoiceDetails) {
        inAppPurchaseCallbackApi.userSelectedalternativeBilling(Translator.fromUserChoiceDetails(userChoiceDetails), new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl.1
            public C44621() {
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void error(@NonNull Throwable th) {
                Log.m13459e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + th);
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void success() {
            }
        });
    }

    @Override // io.flutter.plugins.inapppurchase.BillingClientFactory
    public BillingClient createBillingClient(@NonNull Context context, @NonNull Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, Messages.PlatformBillingChoiceMode platformBillingChoiceMode, Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        BillingClient.Builder builderEnablePendingPurchases = BillingClient.newBuilder(context).enablePendingPurchases(Translator.toPendingPurchasesParams(platformPendingPurchasesParams));
        int i = C44632.f13216x6f7dd45[platformBillingChoiceMode.ordinal()];
        if (i == 1) {
            builderEnablePendingPurchases.enableAlternativeBillingOnly();
        } else if (i == 2) {
            builderEnablePendingPurchases.enableUserChoiceBilling(createUserChoiceBillingListener(inAppPurchaseCallbackApi));
        } else if (i != 3) {
            Log.m13459e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + platformBillingChoiceMode + ", Defaulting to PLAY_BILLING_ONLY");
        }
        return builderEnablePendingPurchases.setListener(new PluginPurchaseListener(inAppPurchaseCallbackApi)).build();
    }

    @VisibleForTesting
    public UserChoiceBillingListener createUserChoiceBillingListener(@NonNull Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        return new OooO00o(this, inAppPurchaseCallbackApi);
    }
}
