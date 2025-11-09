package OooO0oO;

import android.os.Bundle;
import android.os.Parcel;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferAvailabilityListener;
import com.android.billingclient.api.ExternalOfferReportingDetails;
import com.android.billingclient.api.ExternalOfferReportingDetailsListener;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.play_billing.oOO00O;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class OooOO0 extends OoooO0.OooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final OooOOO0 f13267OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f13268OooOo0o = 2;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Object f13269OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f13270OooOoO0;

    public OooOO0(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, OooOOO0 oooOOO0, int i) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback", 2);
        this.f13269OooOoO = alternativeBillingOnlyAvailabilityListener;
        this.f13267OooOo = oooOOO0;
        this.f13270OooOoO0 = i;
    }

    @Override // OoooO0.OooO
    public final boolean o000O0O0(int i, Parcel parcel, Parcel parcel2) {
        switch (this.f13268OooOo0o) {
            case 0:
                if (i == 1) {
                    Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.OooOO0.OooO00o(parcel, Bundle.CREATOR);
                    com.google.android.gms.internal.play_billing.OooOO0.OooO0O0(parcel);
                    int i2 = this.f13270OooOoO0;
                    OooOOO0 oooOOO0 = this.f13267OooOo;
                    AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener = (AlternativeBillingOnlyReportingDetailsListener) this.f13269OooOoO;
                    if (bundle == null) {
                        BillingResult billingResult = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                        oooOOO0.OooOOO0(zzcg.zzb(71, 15, billingResult), i2);
                        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
                        break;
                    } else {
                        int iOooO00o = oOO00O.OooO00o(bundle, "BillingClient");
                        BillingResult billingResultOooO00o = com.android.billingclient.api.OooOo00.OooO00o(iOooO00o, oOO00O.OooO0o(bundle, "BillingClient"));
                        if (iOooO00o != 0) {
                            oOO00O.OooO0oo("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iOooO00o);
                            oooOOO0.OooOOO0(zzcg.zzb(23, 15, billingResultOooO00o), i2);
                            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultOooO00o, null);
                            break;
                        } else {
                            try {
                                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultOooO00o, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
                                break;
                            } catch (JSONException e) {
                                oOO00O.OooO("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e);
                                BillingResult billingResult2 = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                                oooOOO0.OooOOO0(zzcg.zzb(72, 15, billingResult2), i2);
                                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (i == 1) {
                    Bundle bundle2 = (Bundle) com.google.android.gms.internal.play_billing.OooOO0.OooO00o(parcel, Bundle.CREATOR);
                    com.google.android.gms.internal.play_billing.OooOO0.OooO0O0(parcel);
                    int i3 = this.f13270OooOoO0;
                    OooOOO0 oooOOO02 = this.f13267OooOo;
                    ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener = (ExternalOfferReportingDetailsListener) this.f13269OooOoO;
                    if (bundle2 == null) {
                        BillingResult billingResult3 = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                        oooOOO02.OooOOO0(zzcg.zzb(95, 24, billingResult3), i3);
                        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult3, null);
                        break;
                    } else {
                        int iOooO00o2 = oOO00O.OooO00o(bundle2, "BillingClient");
                        BillingResult billingResultOooO00o2 = com.android.billingclient.api.OooOo00.OooO00o(iOooO00o2, oOO00O.OooO0o(bundle2, "BillingClient"));
                        if (iOooO00o2 != 0) {
                            oOO00O.OooO0oo("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iOooO00o2);
                            oooOOO02.OooOOO0(zzcg.zzb(23, 24, billingResultOooO00o2), i3);
                            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultOooO00o2, null);
                            break;
                        } else {
                            try {
                                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultOooO00o2, new ExternalOfferReportingDetails(bundle2.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
                                break;
                            } catch (JSONException e2) {
                                oOO00O.OooO("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e2);
                                BillingResult billingResult4 = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                                oooOOO02.OooOOO0(zzcg.zzb(104, 24, billingResult4), i3);
                                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult4, null);
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2:
                if (i == 1) {
                    Bundle bundle3 = (Bundle) com.google.android.gms.internal.play_billing.OooOO0.OooO00o(parcel, Bundle.CREATOR);
                    com.google.android.gms.internal.play_billing.OooOO0.OooO0O0(parcel);
                    AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener = (AlternativeBillingOnlyAvailabilityListener) this.f13269OooOoO;
                    int i4 = this.f13270OooOoO0;
                    OooOOO0 oooOOO03 = this.f13267OooOo;
                    if (bundle3 != null) {
                        int iOooO00o3 = oOO00O.OooO00o(bundle3, "BillingClient");
                        BillingResult billingResultOooO00o3 = com.android.billingclient.api.OooOo00.OooO00o(iOooO00o3, oOO00O.OooO0o(bundle3, "BillingClient"));
                        if (iOooO00o3 != 0) {
                            oOO00O.OooO0oo("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iOooO00o3);
                            oooOOO03.OooOOO0(zzcg.zzb(23, 14, billingResultOooO00o3), i4);
                        }
                        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultOooO00o3);
                        break;
                    } else {
                        BillingResult billingResult5 = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                        oooOOO03.OooOOO0(zzcg.zzb(67, 14, billingResult5), i4);
                        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult5);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    Bundle bundle4 = (Bundle) com.google.android.gms.internal.play_billing.OooOO0.OooO00o(parcel, Bundle.CREATOR);
                    com.google.android.gms.internal.play_billing.OooOO0.OooO0O0(parcel);
                    ExternalOfferAvailabilityListener externalOfferAvailabilityListener = (ExternalOfferAvailabilityListener) this.f13269OooOoO;
                    int i5 = this.f13270OooOoO0;
                    OooOOO0 oooOOO04 = this.f13267OooOo;
                    if (bundle4 != null) {
                        int iOooO00o4 = oOO00O.OooO00o(bundle4, "BillingClient");
                        BillingResult billingResultOooO00o4 = com.android.billingclient.api.OooOo00.OooO00o(iOooO00o4, oOO00O.OooO0o(bundle4, "BillingClient"));
                        if (iOooO00o4 != 0) {
                            oOO00O.OooO0oo("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iOooO00o4);
                            oooOOO04.OooOOO0(zzcg.zzb(23, 23, billingResultOooO00o4), i5);
                        }
                        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultOooO00o4);
                        break;
                    } else {
                        BillingResult billingResult6 = com.android.billingclient.api.OooOo00.f15472OooOO0O;
                        oooOOO04.OooOOO0(zzcg.zzb(92, 23, billingResult6), i5);
                        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult6);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public OooOO0(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, OooOOO0 oooOOO0, int i) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback", 2);
        this.f13269OooOoO = alternativeBillingOnlyReportingDetailsListener;
        this.f13267OooOo = oooOOO0;
        this.f13270OooOoO0 = i;
    }

    public OooOO0(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, OooOOO0 oooOOO0, int i) {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback", 2);
        this.f13269OooOoO = externalOfferAvailabilityListener;
        this.f13267OooOo = oooOOO0;
        this.f13270OooOoO0 = i;
    }

    public OooOO0(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, OooOOO0 oooOOO0, int i) {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback", 2);
        this.f13269OooOoO = externalOfferReportingDetailsListener;
        this.f13267OooOo = oooOOO0;
        this.f13270OooOoO0 = i;
    }
}
