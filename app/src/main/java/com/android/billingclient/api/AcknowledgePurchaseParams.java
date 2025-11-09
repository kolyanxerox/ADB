package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class AcknowledgePurchaseParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f15366OooO00o;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f15367OooO00o;

        public AcknowledgePurchaseParams build() {
            String str = this.f15367OooO00o;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams();
            acknowledgePurchaseParams.f15366OooO00o = str;
            return acknowledgePurchaseParams;
        }

        public Builder setPurchaseToken(String str) {
            this.f15367OooO00o = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPurchaseToken() {
        return this.f15366OooO00o;
    }
}
