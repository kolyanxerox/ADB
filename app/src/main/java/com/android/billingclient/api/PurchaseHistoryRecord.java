package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15541OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f15542OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final JSONObject f15543OooO0OO;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.f15541OooO00o = str;
        this.f15542OooO0O0 = str2;
        this.f15543OooO0OO = new JSONObject(str);
    }

    public final ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f15543OooO0OO;
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
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f15541OooO00o, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.f15542OooO0O0, purchaseHistoryRecord.getSignature());
    }

    public String getDeveloperPayload() {
        return this.f15543OooO0OO.optString("developerPayload");
    }

    public String getOriginalJson() {
        return this.f15541OooO00o;
    }

    public List<String> getProducts() {
        return OooO00o();
    }

    public long getPurchaseTime() {
        return this.f15543OooO0OO.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.f15543OooO0OO;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f15543OooO0OO.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.f15542OooO0O0;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return OooO00o();
    }

    public int hashCode() {
        return this.f15541OooO00o.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f15541OooO00o));
    }
}
