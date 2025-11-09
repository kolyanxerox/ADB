package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.o000000;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class QueryProductDetailsParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000000 f15544OooO00o;

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public o000000 f15545OooO00o;

        public QueryProductDetailsParams build() {
            if (this.f15545OooO00o != null) {
                return new QueryProductDetailsParams(this);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public Builder setProductList(List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f15545OooO00o = o000000.OooOOOO(list);
            return this;
        }
    }

    public static class Product {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final String f15546OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final String f15547OooO0O0;

        public static class Builder {

            /* renamed from: OooO00o, reason: collision with root package name */
            public String f15548OooO00o;

            /* renamed from: OooO0O0, reason: collision with root package name */
            public String f15549OooO0O0;

            public Product build() {
                if ("first_party".equals(this.f15549OooO0O0)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f15548OooO00o == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f15549OooO0O0 != null) {
                    return new Product(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public Builder setProductId(String str) {
                this.f15548OooO00o = str;
                return this;
            }

            public Builder setProductType(String str) {
                this.f15549OooO0O0 = str;
                return this;
            }
        }

        public /* synthetic */ Product(Builder builder) {
            this.f15546OooO00o = builder.f15548OooO00o;
            this.f15547OooO0O0 = builder.f15549OooO0O0;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public final String zza() {
            return this.f15546OooO00o;
        }

        public final String zzb() {
            return this.f15547OooO0O0;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder) {
        this.f15544OooO00o = builder.f15545OooO00o;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final o000000 zza() {
        return this.f15544OooO00o;
    }

    public final String zzb() {
        return ((Product) this.f15544OooO00o.get(0)).zzb();
    }
}
