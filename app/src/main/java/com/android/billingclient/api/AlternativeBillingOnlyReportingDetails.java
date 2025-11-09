package com.android.billingclient.api;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AlternativeBillingOnlyReportingDetails {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15368OooO00o;

    public AlternativeBillingOnlyReportingDetails(String str) {
        this.f15368OooO00o = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.f15368OooO00o;
    }
}
