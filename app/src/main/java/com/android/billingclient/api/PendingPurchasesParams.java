package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class PendingPurchasesParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f15493OooO00o;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public boolean f15494OooO00o;

        /* renamed from: OooO0O0, reason: collision with root package name */
        public boolean f15495OooO0O0;

        public PendingPurchasesParams build() {
            if (this.f15494OooO00o) {
                return new PendingPurchasesParams(this.f15495OooO0O0);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public Builder enableOneTimeProducts() {
            this.f15494OooO00o = true;
            return this;
        }

        public Builder enablePrepaidPlans() {
            this.f15495OooO0O0 = true;
            return this;
        }
    }

    public PendingPurchasesParams(boolean z) {
        this.f15493OooO00o = z;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
