package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class FormError {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f28008OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f28009OooO0O0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i, @RecentlyNonNull String str) {
        this.f28008OooO00o = i;
        this.f28009OooO0O0 = str;
    }

    public int getErrorCode() {
        return this.f28008OooO00o;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f28009OooO0O0;
    }
}
