package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.UserChoiceDetails;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements UserChoiceBillingListener, ProductDetailsResponseListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f28767OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f28768OooO0O0;

    public /* synthetic */ OooO00o(Object obj, Object obj2) {
        this.f28767OooO00o = obj;
        this.f28768OooO0O0 = obj2;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        ((MethodCallHandlerImpl) this.f28767OooO00o).lambda$queryProductDetailsAsync$4((Messages.Result) this.f28768OooO0O0, billingResult, list);
    }

    @Override // com.android.billingclient.api.UserChoiceBillingListener
    public void userSelectedAlternativeBilling(UserChoiceDetails userChoiceDetails) {
        ((BillingClientFactoryImpl) this.f28767OooO00o).lambda$createUserChoiceBillingListener$0((Messages.InAppPurchaseCallbackApi) this.f28768OooO0O0, userChoiceDetails);
    }
}
