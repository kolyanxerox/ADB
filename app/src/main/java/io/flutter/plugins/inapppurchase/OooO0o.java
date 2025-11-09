package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0o implements PurchasesResponseListener, AlternativeBillingOnlyReportingDetailsListener, PurchaseHistoryResponseListener, ConsumeResponseListener, AcknowledgePurchaseResponseListener, AlternativeBillingOnlyAvailabilityListener, AlternativeBillingOnlyInformationDialogListener, BillingConfigResponseListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Messages.Result f28774OooO00o;

    public /* synthetic */ OooO0o(Messages.Result result) {
        this.f28774OooO00o = result;
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        MethodCallHandlerImpl.lambda$acknowledgePurchase$8(this.f28774OooO00o, billingResult);
    }

    @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
    public void onAlternativeBillingOnlyAvailabilityResponse(BillingResult billingResult) {
        MethodCallHandlerImpl.lambda$isAlternativeBillingOnlyAvailableAsync$2(this.f28774OooO00o, billingResult);
    }

    @Override // com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener
    public void onAlternativeBillingOnlyInformationDialogResponse(BillingResult billingResult) {
        MethodCallHandlerImpl.lambda$showAlternativeBillingOnlyInformationDialog$0(this.f28774OooO00o, billingResult);
    }

    @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
    public void onAlternativeBillingOnlyTokenResponse(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        MethodCallHandlerImpl.lambda$createAlternativeBillingOnlyReportingDetailsAsync$1(this.f28774OooO00o, billingResult, alternativeBillingOnlyReportingDetails);
    }

    @Override // com.android.billingclient.api.BillingConfigResponseListener
    public void onBillingConfigResponse(BillingResult billingResult, BillingConfig billingConfig) {
        MethodCallHandlerImpl.lambda$getBillingConfigAsync$3(this.f28774OooO00o, billingResult, billingConfig);
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult billingResult, String str) {
        MethodCallHandlerImpl.lambda$consumeAsync$5(this.f28774OooO00o, billingResult, str);
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        MethodCallHandlerImpl.lambda$queryPurchaseHistoryAsync$7(this.f28774OooO00o, billingResult, list);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        MethodCallHandlerImpl.lambda$queryPurchasesAsync$6(this.f28774OooO00o, billingResult, list);
    }
}
