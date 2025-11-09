package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.o0O000Oo;
import com.google.android.gms.internal.play_billing.oOO00O;

/* loaded from: classes.dex */
public final class OooO0O0 extends ResultReceiver {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener f15443OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f15444OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO00o oooO00o, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.f15443OooOo0O = alternativeBillingOnlyInformationDialogListener;
        this.f15444OooOo0o = oooO00o;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener = this.f15443OooOo0O;
        if (i != 0) {
            OooO00o oooO00o = this.f15444OooOo0o;
            if (bundle == null) {
                oooO00o.OooOoOO(alternativeBillingOnlyInformationDialogListener, OooOo00.f15472OooOO0O, 73, null);
                return;
            } else {
                builderNewBuilder.setDebugMessage(oOO00O.OooO0o(bundle, "BillingClient"));
                int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                oooO00o.OooO0o(zzcg.zzc(i2 != 0 ? o0O000Oo.OooOOO0(i2) : 23, 16, builderNewBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(builderNewBuilder.build());
    }
}
