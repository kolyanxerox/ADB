package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class QueryPurchasesParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f15552OooO00o;

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f15553OooO00o;

        public QueryPurchasesParams build() {
            if (this.f15553OooO00o != null) {
                return new QueryPurchasesParams(this);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.f15553OooO00o = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder) {
        this.f15552OooO00o = builder.f15553OooO00o;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String zza() {
        return this.f15552OooO00o;
    }
}
