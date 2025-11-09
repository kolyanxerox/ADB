package com.android.billingclient.api;

import OooO0oO.Oooo0;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.oOO00O;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class OooOo {
    public static Oooo0 OooO00o(Bundle bundle, String str) {
        BillingResult billingResult = OooOo00.f15472OooOO0O;
        if (bundle == null) {
            oOO00O.OooO0oo("BillingClient", str.concat(" got null owned items list"));
            return new Oooo0(billingResult, 54, 0);
        }
        int iOooO00o = oOO00O.OooO00o(bundle, "BillingClient");
        BillingResult billingResultOooO0OO = OooO0oO.OooOo.OooO0OO(iOooO00o, oOO00O.OooO0o(bundle, "BillingClient"));
        if (iOooO00o != 0) {
            oOO00O.OooO0oo("BillingClient", str + " failed. Response code: " + iOooO00o);
            return new Oooo0(billingResultOooO0OO, 23, 0);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            oOO00O.OooO0oo("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new Oooo0(billingResult, 55, 0);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            oOO00O.OooO0oo("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new Oooo0(billingResult, 56, 0);
        }
        if (stringArrayList2 == null) {
            oOO00O.OooO0oo("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new Oooo0(billingResult, 57, 0);
        }
        if (stringArrayList3 != null) {
            return new Oooo0(OooOo00.OooOO0o, 1, 0);
        }
        oOO00O.OooO0oo("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new Oooo0(billingResult, 58, 0);
    }
}
