package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15537OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f15538OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final JSONObject f15539OooO0OO;

    public static final class PendingPurchaseUpdate {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final JSONObject f15540OooO00o;

        public PendingPurchaseUpdate(JSONObject jSONObject) {
            this.f15540OooO00o = jSONObject;
        }

        public List<String> getProducts() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = this.f15540OooO00o;
            if (jSONObject.has("productIds") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds")) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
            return arrayList;
        }

        public String getPurchaseToken() {
            return this.f15540OooO00o.optString("purchaseToken");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(String str, String str2) throws JSONException {
        this.f15537OooO00o = str;
        this.f15538OooO0O0 = str2;
        this.f15539OooO0OO = new JSONObject(str);
    }

    public final ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f15539OooO0OO;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f15537OooO00o, purchase.getOriginalJson()) && TextUtils.equals(this.f15538OooO0O0, purchase.getSignature());
    }

    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.f15539OooO0OO;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    public String getDeveloperPayload() {
        return this.f15539OooO0OO.optString("developerPayload");
    }

    public String getOrderId() {
        String strOptString = this.f15539OooO0OO.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String getOriginalJson() {
        return this.f15537OooO00o;
    }

    public String getPackageName() {
        return this.f15539OooO0OO.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject jSONObjectOptJSONObject = this.f15539OooO0OO.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    public List<String> getProducts() {
        return OooO00o();
    }

    public int getPurchaseState() {
        return this.f15539OooO0OO.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.f15539OooO0OO.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.f15539OooO0OO;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f15539OooO0OO.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.f15538OooO0O0;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return OooO00o();
    }

    public int hashCode() {
        return this.f15537OooO00o.hashCode();
    }

    public boolean isAcknowledged() {
        return this.f15539OooO0OO.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.f15539OooO0OO.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f15537OooO00o));
    }
}
