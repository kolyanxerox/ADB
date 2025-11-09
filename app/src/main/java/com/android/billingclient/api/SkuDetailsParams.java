package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class SkuDetailsParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f15556OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList f15557OooO0O0;

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f15558OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList f15559OooO0O0;

        public SkuDetailsParams build() {
            String str = this.f15558OooO00o;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f15559OooO0O0 == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.f15556OooO00o = str;
            skuDetailsParams.f15557OooO0O0 = this.f15559OooO0O0;
            return skuDetailsParams;
        }

        public Builder setSkusList(List<String> list) {
            this.f15559OooO0O0 = new ArrayList(list);
            return this;
        }

        public Builder setType(String str) {
            this.f15558OooO00o = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSkuType() {
        return this.f15556OooO00o;
    }

    public List<String> getSkusList() {
        return this.f15557OooO0O0;
    }
}
