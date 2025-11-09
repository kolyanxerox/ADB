package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class InAppMessageResult {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f15409OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f15410OooO0O0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i, String str) {
        this.f15409OooO00o = i;
        this.f15410OooO0O0 = str;
    }

    public String getPurchaseToken() {
        return this.f15410OooO0O0;
    }

    public int getResponseCode() {
        return this.f15409OooO00o;
    }
}
