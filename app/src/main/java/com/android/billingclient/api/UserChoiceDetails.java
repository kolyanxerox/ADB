package com.android.billingclient.api;

import com.ironsource.C3034d9;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class UserChoiceDetails {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final JSONObject f15560OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f15561OooO0O0;

    public static class Product {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final String f15562OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final String f15563OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public final String f15564OooO0OO;

        public Product(JSONObject jSONObject) {
            this.f15562OooO00o = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.f15563OooO0O0 = jSONObject.optString(C3034d9.h.f8117m);
            String strOptString = jSONObject.optString("offerToken");
            this.f15564OooO0OO = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f15562OooO00o.equals(product.getId()) && this.f15563OooO0O0.equals(product.getType()) && Objects.equals(this.f15564OooO0OO, product.getOfferToken());
        }

        public String getId() {
            return this.f15562OooO00o;
        }

        public String getOfferToken() {
            return this.f15564OooO0OO;
        }

        public String getType() {
            return this.f15563OooO0O0;
        }

        public int hashCode() {
            return Objects.hash(this.f15562OooO00o, this.f15563OooO0O0, this.f15564OooO0OO);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{id: ");
            sb.append(this.f15562OooO00o);
            sb.append(", type: ");
            sb.append(this.f15563OooO0O0);
            sb.append(", offer token: ");
            return OooO0oO.OooOo.OooOOOo(sb, this.f15564OooO0OO, "}");
        }
    }

    public UserChoiceDetails(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f15560OooO00o = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        this.f15561OooO0O0 = arrayList;
    }

    public String getExternalTransactionToken() {
        return this.f15560OooO00o.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId() {
        String strOptString = this.f15560OooO00o.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    public List<Product> getProducts() {
        return this.f15561OooO0O0;
    }
}
