package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    /* renamed from: OooO, reason: collision with root package name */
    public final String f16390OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f16391OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f16392OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Bundle f16393OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f16394OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f16395OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f16396OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f16397OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f16398OooO0oo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @Nullable String str2, @NonNull String str3) {
        this.f16391OooO00o = str;
        this.f16392OooO0O0 = bundle;
        this.f16393OooO0OO = bundle2;
        this.f16394OooO0Oo = context;
        this.f16396OooO0o0 = z;
        this.f16395OooO0o = i;
        this.f16397OooO0oO = i2;
        this.f16398OooO0oo = str2;
        this.f16390OooO = str3;
    }

    @NonNull
    public String getBidResponse() {
        return this.f16391OooO00o;
    }

    @NonNull
    public Context getContext() {
        return this.f16394OooO0Oo;
    }

    @Nullable
    public String getMaxAdContentRating() {
        return this.f16398OooO0oo;
    }

    @NonNull
    public Bundle getMediationExtras() {
        return this.f16393OooO0OO;
    }

    @NonNull
    public Bundle getServerParameters() {
        return this.f16392OooO0O0;
    }

    @NonNull
    public String getWatermark() {
        return this.f16390OooO;
    }

    public boolean isTestRequest() {
        return this.f16396OooO0o0;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f16395OooO0o;
    }

    public int taggedForUnderAgeTreatment() {
        return this.f16397OooO0oO;
    }
}
