package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class QueryPurchaseHistoryParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15550OooO00o;

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f15551OooO00o;

        public QueryPurchaseHistoryParams build() {
            if (this.f15551OooO00o != null) {
                return new QueryPurchaseHistoryParams(this);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.f15551OooO00o = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder) {
        this.f15550OooO00o = builder.f15551OooO00o;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String zza() {
        return this.f15550OooO00o;
    }
}
