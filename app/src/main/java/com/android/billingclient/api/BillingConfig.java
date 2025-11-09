package com.android.billingclient.api;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15375OooO00o;

    public BillingConfig(String str) {
        this.f15375OooO00o = new JSONObject(str).optString("countryCode");
    }

    public String getCountryCode() {
        return this.f15375OooO00o;
    }
}
