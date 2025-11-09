package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import com.google.android.gms.internal.play_billing.oOO00O;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* renamed from: OooOo */
    public ResultReceiver f15533OooOo;

    /* renamed from: OooOo0O */
    public ActivityResultLauncher f15534OooOo0O;

    /* renamed from: OooOo0o */
    public ActivityResultLauncher f15535OooOo0o;

    /* renamed from: OooOoO0 */
    public ResultReceiver f15536OooOoO0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15534OooOo0O = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzct
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent data = activityResult.getData();
                int responseCode = oOO00O.OooO0o0(data, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f15533OooOo;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, data == null ? null : data.getExtras());
                }
                if (activityResult.getResultCode() != -1 || responseCode != 0) {
                    oOO00O.OooO0oo("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f15535OooOo0o = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzcu
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent data = activityResult.getData();
                int responseCode = oOO00O.OooO0o0(data, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f15536OooOoO0;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, data == null ? null : data.getExtras());
                }
                if (activityResult.getResultCode() != -1 || responseCode != 0) {
                    oOO00O.OooO0oo("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f15533OooOo = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f15536OooOoO0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        oOO00O.OooO0oO("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f15533OooOo = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f15534OooOo0O.launch(new IntentSenderRequest.Builder(pendingIntent).build());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f15536OooOoO0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f15535OooOo0o.launch(new IntentSenderRequest.Builder(pendingIntent2).build());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f15533OooOo;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f15536OooOoO0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
