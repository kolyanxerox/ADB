package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.C1414b9;

/* loaded from: classes2.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    /* renamed from: OooOO0, reason: collision with root package name */
    public final C1414b9 f16402OooOO0;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @Nullable String str2, String str3, @Nullable C1414b9 c1414b9) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.f16402OooOO0 = c1414b9;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return C1414b9.OooO0o0(this.f16402OooOO0);
    }
}
