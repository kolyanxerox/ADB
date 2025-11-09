package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class AdValue {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f15896OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f15897OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f15898OooO0OO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    public AdValue(int i, long j, String str) {
        this.f15896OooO00o = i;
        this.f15897OooO0O0 = str;
        this.f15898OooO0OO = j;
    }

    @NonNull
    public static AdValue zza(int i, @NonNull String str, long j) {
        return new AdValue(i, j, str);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.f15897OooO0O0;
    }

    public int getPrecisionType() {
        return this.f15896OooO00o;
    }

    public long getValueMicros() {
        return this.f15898OooO0OO;
    }
}
