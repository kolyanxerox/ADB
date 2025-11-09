package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class InAppMessageParams {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f15407OooO00o;

    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f15408OooO00o = new HashSet();

        public Builder addAllInAppMessageCategoriesToShow() {
            this.f15408OooO00o.add(2);
            return this;
        }

        public Builder addInAppMessageCategoryToShow(int i) {
            this.f15408OooO00o.add(Integer.valueOf(i));
            return this;
        }

        public InAppMessageParams build() {
            return new InAppMessageParams(this.f15408OooO00o);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    public /* synthetic */ InAppMessageParams(HashSet hashSet) {
        this.f15407OooO00o = new ArrayList(Collections.unmodifiableList(new ArrayList(hashSet)));
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
