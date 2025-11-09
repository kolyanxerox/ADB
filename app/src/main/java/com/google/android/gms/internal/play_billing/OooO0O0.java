package com.google.android.gms.internal.play_billing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.android.billingclient.api.zzcg;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class OooO0O0 extends OoooO0.OooO {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f26953OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooO0O0(String str, int i) {
        super(str, 2);
        this.f26953OooOo0o = i;
    }

    @Override // OoooO0.OooO
    public final boolean o000O0O0(int i, Parcel parcel, Parcel parcel2) {
        switch (this.f26953OooOo0o) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Bundle bundle = (Bundle) OooOO0.OooO00o(parcel, Bundle.CREATOR);
                OooOO0.OooO0O0(parcel);
                com.android.billingclient.api.OooO oooO = (com.android.billingclient.api.OooO) this;
                ResultReceiver resultReceiver = oooO.f15412OooOoO0;
                if (bundle == null) {
                    resultReceiver.send(6, null);
                } else if (bundle.containsKey("RESPONSE_CODE")) {
                    int iOooO00o = oOO00O.OooO00o(bundle, "BillingClient");
                    if (iOooO00o != 0) {
                        oOO00O.OooO0oo("BillingClient", "Unable to launch intent for alternative billing only dialog" + iOooO00o);
                        resultReceiver.send(iOooO00o, bundle);
                    } else {
                        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                        if (pendingIntent == null) {
                            oOO00O.OooO0oO("BillingClient", "User has acknowledged the alternative billing only dialog before.");
                            resultReceiver.send(0, bundle);
                        } else {
                            try {
                                Activity activity = (Activity) oooO.f15411OooOo.get();
                                Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
                                intent.putExtra("alternative_billing_only_dialog_result_receiver", resultReceiver);
                                intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
                                activity.startActivity(intent);
                            } catch (RuntimeException e) {
                                oOO00O.OooO("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e);
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("RESPONSE_CODE", 6);
                                bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
                                bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
                                String name = e.getClass().getName();
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
                                resultReceiver.send(6, bundle2);
                            }
                        }
                    }
                } else {
                    oOO00O.OooO0oo("BillingClient", "Response bundle doesn't contain a response code");
                    resultReceiver.send(6, bundle);
                }
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Bundle bundle3 = (Bundle) OooOO0.OooO00o(parcel, Bundle.CREATOR);
                OooOO0.OooO0O0(parcel);
                com.android.billingclient.api.OooOO0 oooOO0 = (com.android.billingclient.api.OooOO0) this;
                int i2 = oooOO0.f15450OooOoO;
                OooO0oO.OooOOO0 oooOOO0 = oooOO0.f15451OooOoO0;
                BillingConfigResponseListener billingConfigResponseListener = oooOO0.f15449OooOo;
                if (bundle3 == null) {
                    BillingResult billingResult = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                    oooOOO0.OooOOO0(zzcg.zzb(63, 13, billingResult), i2);
                    billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
                } else {
                    int iOooO00o2 = oOO00O.OooO00o(bundle3, "BillingClient");
                    String strOooO0o = oOO00O.OooO0o(bundle3, "BillingClient");
                    BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(iOooO00o2);
                    builderNewBuilder.setDebugMessage(strOooO0o);
                    if (iOooO00o2 != 0) {
                        oOO00O.OooO0oo("BillingClient", "getBillingConfig() failed. Response code: " + iOooO00o2);
                        BillingResult billingResultBuild = builderNewBuilder.build();
                        oooOOO0.OooOOO0(zzcg.zzb(23, 13, billingResultBuild), i2);
                        billingConfigResponseListener.onBillingConfigResponse(billingResultBuild, null);
                    } else if (bundle3.containsKey("BILLING_CONFIG")) {
                        try {
                            billingConfigResponseListener.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle3.getString("BILLING_CONFIG")));
                        } catch (JSONException e2) {
                            oOO00O.OooO("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e2);
                            BillingResult billingResult2 = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                            oooOOO0.OooOOO0(zzcg.zzb(65, 13, billingResult2), i2);
                            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
                        }
                    } else {
                        oOO00O.OooO0oo("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        builderNewBuilder.setResponseCode(6);
                        BillingResult billingResultBuild2 = builderNewBuilder.build();
                        oooOOO0.OooOOO0(zzcg.zzb(64, 13, billingResultBuild2), i2);
                        billingConfigResponseListener.onBillingConfigResponse(billingResultBuild2, null);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                Bundle bundle4 = (Bundle) OooOO0.OooO00o(parcel, Bundle.CREATOR);
                OooOO0.OooO0O0(parcel);
                com.android.billingclient.api.OooOO0O oooOO0O = (com.android.billingclient.api.OooOO0O) this;
                ResultReceiver resultReceiver2 = oooOO0O.f15453OooOoO0;
                if (bundle4 == null) {
                    resultReceiver2.send(6, null);
                    return true;
                }
                if (!bundle4.containsKey("RESPONSE_CODE")) {
                    oOO00O.OooO0oo("BillingClient", "Response bundle doesn't contain a response code");
                    resultReceiver2.send(6, bundle4);
                    return true;
                }
                int iOooO00o3 = oOO00O.OooO00o(bundle4, "BillingClient");
                if (iOooO00o3 != 0) {
                    oOO00O.OooO0oo("BillingClient", "Unable to launch intent for external offer dialog" + iOooO00o3);
                    resultReceiver2.send(iOooO00o3, bundle4);
                    return true;
                }
                PendingIntent pendingIntent2 = (PendingIntent) bundle4.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
                if (pendingIntent2 == null) {
                    oOO00O.OooO0oo("BillingClient", "The PendingIntent for the external offer dialog is null");
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("RESPONSE_CODE", 6);
                    bundle5.putString("DEBUG_MESSAGE", "An internal error occurred.");
                    resultReceiver2.send(6, bundle5);
                    return true;
                }
                try {
                    Activity activity2 = (Activity) oooOO0O.f15452OooOo.get();
                    Intent intent2 = new Intent(activity2, (Class<?>) ProxyBillingActivityV2.class);
                    intent2.putExtra("external_payment_dialog_result_receiver", resultReceiver2);
                    intent2.putExtra("external_payment_dialog_pending_intent", pendingIntent2);
                    activity2.startActivity(intent2);
                    return true;
                } catch (RuntimeException e3) {
                    oOO00O.OooO("BillingClient", "Runtime error while launching intent for the external offer dialog.", e3);
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt("RESPONSE_CODE", 6);
                    bundle6.putString("DEBUG_MESSAGE", "An internal error occurred.");
                    bundle6.putInt("INTERNAL_LOG_ERROR_REASON", 98);
                    String name2 = e3.getClass().getName();
                    String message2 = e3.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    bundle6.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name2 + ": " + message2);
                    resultReceiver2.send(6, bundle6);
                    return true;
                }
            default:
                if (i != 1) {
                    return false;
                }
                Bundle bundle7 = (Bundle) OooOO0.OooO00o(parcel, Bundle.CREATOR);
                OooOO0.OooO0O0(parcel);
                com.android.billingclient.api.OooOOO0 oooOOO02 = (com.android.billingclient.api.OooOOO0) this;
                ResultReceiver resultReceiver3 = oooOOO02.f15456OooOoO0;
                if (resultReceiver3 == null) {
                    oOO00O.OooO0oo("BillingClient", "Unable to send result for in-app messaging");
                } else if (bundle7 == null) {
                    resultReceiver3.send(0, null);
                } else {
                    Activity activity3 = (Activity) oooOOO02.f15455OooOo.get();
                    PendingIntent pendingIntent3 = (PendingIntent) bundle7.getParcelable("KEY_LAUNCH_INTENT");
                    if (activity3 == null || pendingIntent3 == null) {
                        resultReceiver3.send(0, null);
                        oOO00O.OooO0oo("BillingClient", "Unable to launch intent for in-app messaging");
                    } else {
                        try {
                            Intent intent3 = new Intent(activity3, (Class<?>) ProxyBillingActivity.class);
                            intent3.putExtra("in_app_message_result_receiver", resultReceiver3);
                            intent3.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent3);
                            activity3.startActivity(intent3);
                        } catch (CancellationException e4) {
                            resultReceiver3.send(0, null);
                            oOO00O.OooO("BillingClient", "Exception caught while launching intent for in-app messaging.", e4);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
