package com.android.billingclient.api;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ExternalOfferReportingDetails {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15406OooO00o;

    public ExternalOfferReportingDetails(String str) {
        this.f15406OooO00o = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.f15406OooO00o;
    }
}
