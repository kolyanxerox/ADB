package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.oOO00O;
import com.ironsource.InterfaceC3173h3;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: OooOo */
    public boolean f15528OooOo;

    /* renamed from: OooOo0O */
    public ResultReceiver f15529OooOo0O;

    /* renamed from: OooOo0o */
    public ResultReceiver f15530OooOo0o;

    /* renamed from: OooOoO */
    public int f15531OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f15532OooOoO0;

    public final Intent OooO00o() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0093  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            oOO00O.OooO0oO("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f15528OooOo = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f15529OooOo0O = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f15530OooOo0o = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f15532OooOoO0 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f15531OooOoO = bundle.getInt("activity_code", 100);
            return;
        }
        oOO00O.OooO0oO("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f15531OooOoO = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f15532OooOoO0 = true;
                this.f15531OooOoO = InterfaceC3173h3.d.b.f8825h;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f15529OooOo0O = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f15530OooOo0o = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f15531OooOoO = InterfaceC3173h3.d.b.f8819b;
        } else {
            pendingIntent = null;
        }
        try {
            this.f15528OooOo = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f15531OooOoO, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            oOO00O.OooO("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f15529OooOo0O;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f15530OooOo0o;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentOooO00o = OooO00o();
                    if (this.f15532OooOoO0) {
                        intentOooO00o.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentOooO00o.putExtra("RESPONSE_CODE", 6);
                    intentOooO00o.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentOooO00o);
                }
            }
            this.f15528OooOo = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f15528OooOo) {
            Intent intentOooO00o = OooO00o();
            intentOooO00o.putExtra("RESPONSE_CODE", 1);
            intentOooO00o.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i = this.f15531OooOoO;
            if (i == 110 || i == 100) {
                intentOooO00o.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentOooO00o);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f15529OooOo0O;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f15530OooOo0o;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f15528OooOo);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f15532OooOoO0);
        bundle.putInt("activity_code", this.f15531OooOoO);
    }
}
