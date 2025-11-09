package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.o0000oo;
import com.google.android.gms.internal.play_billing.o000O00;
import com.google.android.gms.internal.play_billing.oOO00O;

/* loaded from: classes.dex */
public final class BillingResult {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f15400OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f15401OooO0O0;

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public int f15402OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public String f15403OooO0O0;

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f15400OooO00o = this.f15402OooO00o;
            billingResult.f15401OooO0O0 = this.f15403OooO0O0;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.f15403OooO0O0 = str;
            return this;
        }

        public Builder setResponseCode(int i) {
            this.f15402OooO00o = i;
            return this;
        }
    }

    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.f15403OooO0O0 = "";
        return builder;
    }

    public String getDebugMessage() {
        return this.f15401OooO0O0;
    }

    public int getResponseCode() {
        return this.f15400OooO00o;
    }

    public String toString() {
        int i = this.f15400OooO00o;
        int i2 = oOO00O.f27203OooO00o;
        o000O00 o000o002 = o0000oo.f26990OooOo;
        Integer numValueOf = Integer.valueOf(i);
        return androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Response Code: ", (!o000o002.containsKey(numValueOf) ? o0000oo.RESPONSE_CODE_UNSPECIFIED : (o0000oo) o000o002.get(numValueOf)).toString(), ", Debug Message: ", this.f15401OooO0O0);
    }
}
