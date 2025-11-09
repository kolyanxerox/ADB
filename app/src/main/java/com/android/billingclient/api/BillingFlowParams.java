package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.play_billing.o000000;
import com.google.android.gms.internal.play_billing.o0000OO0;
import com.google.android.gms.internal.play_billing.oo0o0Oo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f15376OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f15377OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f15378OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public SubscriptionUpdateParams f15379OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f15380OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public o000000 f15381OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f15382OooO0oO;

    public static class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f15383OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public String f15384OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public ArrayList f15385OooO0OO;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public ArrayList f15386OooO0Oo;

        /* renamed from: OooO0o, reason: collision with root package name */
        public SubscriptionUpdateParams.Builder f15387OooO0o;

        /* renamed from: OooO0o0, reason: collision with root package name */
        public boolean f15388OooO0o0;

        public BillingFlowParams build() {
            o000000 o000000VarOooOOOO;
            ArrayList arrayList = this.f15386OooO0Oo;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList arrayList2 = this.f15385OooO0OO;
            boolean z3 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z2) {
                this.f15385OooO0OO.forEach(new Consumer() { // from class: com.android.billingclient.api.zzce
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((BillingFlowParams.ProductDetailsParams) obj) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                });
            } else {
                if (this.f15386OooO0Oo.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f15386OooO0Oo.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f15386OooO0Oo.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList3 = this.f15386OooO0Oo;
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strZzd = skuDetails.zzd();
                    ArrayList arrayList4 = this.f15386OooO0Oo;
                    int size2 = arrayList4.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i2);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            if ((!z2 || ((SkuDetails) this.f15386OooO0Oo.get(0)).zzd().isEmpty()) && (!z3 || ((ProductDetailsParams) this.f15385OooO0OO.get(0)).zza().zza().isEmpty())) {
                z = false;
            }
            billingFlowParams.f15376OooO00o = z;
            billingFlowParams.f15377OooO0O0 = this.f15383OooO00o;
            billingFlowParams.f15378OooO0OO = this.f15384OooO0O0;
            billingFlowParams.f15379OooO0Oo = this.f15387OooO0o.build();
            ArrayList arrayList5 = this.f15386OooO0Oo;
            billingFlowParams.f15380OooO0o = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
            billingFlowParams.f15382OooO0oO = this.f15388OooO0o0;
            ArrayList arrayList6 = this.f15385OooO0OO;
            if (arrayList6 != null) {
                o000000VarOooOOOO = o000000.OooOOOO(arrayList6);
            } else {
                oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
                o000000VarOooOOOO = o0000OO0.f26985OooOoO;
            }
            billingFlowParams.f15381OooO0o0 = o000000VarOooOOOO;
            return billingFlowParams;
        }

        public Builder setIsOfferPersonalized(boolean z) {
            this.f15388OooO0o0 = z;
            return this;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.f15383OooO00o = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.f15384OooO0O0 = str;
            return this;
        }

        public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {
            this.f15385OooO0OO = new ArrayList(list);
            return this;
        }

        @Deprecated
        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f15386OooO0Oo = arrayList;
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.f15393OooO00o);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.f15395OooO0OO);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.f15394OooO0O0);
            this.f15387OooO0o = builderNewBuilder;
            return this;
        }
    }

    public static final class ProductDetailsParams {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final ProductDetails f15389OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final String f15390OooO0O0;

        public static class Builder {

            /* renamed from: OooO00o, reason: collision with root package name */
            public ProductDetails f15391OooO00o;

            /* renamed from: OooO0O0, reason: collision with root package name */
            public String f15392OooO0O0;

            public ProductDetailsParams build() {
                ProductDetails productDetails = this.f15391OooO00o;
                if (productDetails == null) {
                    throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
                }
                if (productDetails.getSubscriptionOfferDetails() == null || this.f15392OooO0O0 != null) {
                    return new ProductDetailsParams(this);
                }
                throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
            }

            public Builder setOfferToken(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f15392OooO0O0 = str;
                return this;
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.f15391OooO00o = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.zzb() != null) {
                        this.f15392OooO0O0 = oneTimePurchaseOfferDetails.zzb();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder) {
            this.f15389OooO00o = builder.f15391OooO00o;
            this.f15390OooO0O0 = builder.f15392OooO0O0;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public final ProductDetails zza() {
            return this.f15389OooO00o;
        }

        public final String zzb() {
            return this.f15390OooO0O0;
        }
    }

    public static class SubscriptionUpdateParams {

        /* renamed from: OooO00o, reason: collision with root package name */
        public String f15393OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public String f15394OooO0O0;

        /* renamed from: OooO0OO, reason: collision with root package name */
        public int f15395OooO0OO;

        public static class Builder {

            /* renamed from: OooO00o, reason: collision with root package name */
            public String f15396OooO00o;

            /* renamed from: OooO0O0, reason: collision with root package name */
            public String f15397OooO0O0;

            /* renamed from: OooO0OO, reason: collision with root package name */
            public boolean f15398OooO0OO;

            /* renamed from: OooO0Oo, reason: collision with root package name */
            public int f15399OooO0Oo;

            public SubscriptionUpdateParams build() {
                boolean z = true;
                if (TextUtils.isEmpty(this.f15396OooO00o) && TextUtils.isEmpty(null)) {
                    z = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f15397OooO0O0);
                if (z && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f15398OooO0OO && !z && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams();
                subscriptionUpdateParams.f15393OooO00o = this.f15396OooO00o;
                subscriptionUpdateParams.f15395OooO0OO = this.f15399OooO0Oo;
                subscriptionUpdateParams.f15394OooO0O0 = this.f15397OooO0O0;
                return subscriptionUpdateParams;
            }

            public Builder setOldPurchaseToken(String str) {
                this.f15396OooO00o = str;
                return this;
            }

            public Builder setOriginalExternalTransactionId(String str) {
                this.f15397OooO0O0 = str;
                return this;
            }

            public Builder setSubscriptionReplacementMode(int i) {
                this.f15399OooO0Oo = i;
                return this;
            }

            @Deprecated
            public final Builder zzb(String str) {
                this.f15396OooO00o = str;
                return this;
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        public static Builder newBuilder() {
            Builder builder = new Builder();
            builder.f15399OooO0Oo = 0;
            return builder;
        }
    }

    public static Builder newBuilder() {
        Builder builder = new Builder();
        SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
        builderNewBuilder.f15398OooO0OO = true;
        builder.f15387OooO0o = builderNewBuilder;
        return builder;
    }

    public final int zza() {
        return this.f15379OooO0Oo.f15395OooO0OO;
    }

    public final String zzc() {
        return this.f15377OooO0O0;
    }

    public final String zzd() {
        return this.f15378OooO0OO;
    }

    public final String zze() {
        return this.f15379OooO0Oo.f15393OooO00o;
    }

    public final String zzf() {
        return this.f15379OooO0Oo.f15394OooO0O0;
    }

    public final ArrayList zzg() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15380OooO0o);
        return arrayList;
    }

    public final List zzh() {
        return this.f15381OooO0o0;
    }

    public final boolean zzp() {
        return this.f15382OooO0oO;
    }
}
