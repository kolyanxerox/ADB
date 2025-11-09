package com.android.billingclient.api;

import com.ironsource.C3034d9;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzc {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15565OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f15566OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f15567OooO0OO;

    public /* synthetic */ zzc(JSONObject jSONObject) {
        this.f15565OooO00o = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f15566OooO0O0 = jSONObject.optString(C3034d9.h.f8117m);
        String strOptString = jSONObject.optString("offerToken");
        this.f15567OooO0OO = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.f15565OooO00o.equals(zzcVar.f15565OooO00o) && this.f15566OooO0O0.equals(zzcVar.f15566OooO0O0) && Objects.equals(this.f15567OooO0OO, zzcVar.f15567OooO0OO);
    }

    public final int hashCode() {
        return Objects.hash(this.f15565OooO00o, this.f15566OooO0O0, this.f15567OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f15565OooO00o);
        sb.append(", type: ");
        sb.append(this.f15566OooO0O0);
        sb.append(", offer token: ");
        return OooO0oO.OooOo.OooOOOo(sb, this.f15567OooO0OO, "}");
    }
}
