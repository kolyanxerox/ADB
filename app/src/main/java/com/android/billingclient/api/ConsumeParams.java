package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class ConsumeParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f15404OooO00o;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f15405OooO00o;

        public ConsumeParams build() {
            String str = this.f15405OooO00o;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams();
            consumeParams.f15404OooO00o = str;
            return consumeParams;
        }

        public Builder setPurchaseToken(String str) {
            this.f15405OooO00o = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPurchaseToken() {
        return this.f15404OooO00o;
    }
}
